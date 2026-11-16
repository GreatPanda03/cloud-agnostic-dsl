/**
 * Version: 2026/01/05 16:00
 * 
 * Changes:
 * - replaced "Error" with "NoSuchElementException"
 * - updated JUnit tests to validate missing resource references
 * 
 */

package co7217.week18.entity.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Injector
import groovy.json.*

import co7217.week18.entity.EntityDslStandaloneSetup
import co7217.week18.entity.entityDsl.CloudProvider
import co7217.week18.entity.entityDsl.ComputeInstance
import co7217.week18.entity.entityDsl.Infrastructure
import co7217.week18.entity.entityDsl.InstanceType
import co7217.week18.entity.entityDsl.Network
import co7217.week18.entity.entityDsl.OSImage
import co7217.week18.entity.entityDsl.Region
import co7217.week18.entity.entityDsl.Resource
import co7217.week18.entity.entityDsl.StorageBucket
import co7217.week18.entity.entityDsl.Subnet
import co7217.week18.entity.entityDsl.VPC
import co7217.week18.entity.entityDsl.HostedZone


class EntityGenerator {
	def static void main(String[] args) {
		Injector injector = new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration()
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class)
		org.eclipse.emf.ecore.resource.Resource instance = resourceSet.getResource(URI.createFileURI("src/main/resources/large_program.dmodel"), true)
		Infrastructure infrastructure = instance.getContents().get(0)
		String result = ""
		
		CloudProvider provider = 
			infrastructure.cloudProvider 
			// CloudProvider.AWS
			// CloudProvider.GCP
		
		result += getRootTag(infrastructure, provider)
		result += traverse(infrastructure.resources, provider)
		
		println(result)

		File output = new File("src/main/resources/output.yaml")
		output.createNewFile()
		output.text = result
	}
	

	def static String getRootTag(Infrastructure infrastructure, CloudProvider provider ) {
		String result = ""
		String infResult = ""
		
		switch(provider) {
			case CloudProvider.AWS:
				infResult = "Resources:"
				break
			
			case CloudProvider.GCP:
				infResult = "resources:"
				break
		}
		
		result += infResult
		return result
	}
	
	// Distilled visitor pattern to separate traversing from code generation
	def static String traverse(List<Resource> resources, CloudProvider provider) {
		String result = ""
		for (resource in resources) {
			result += traverse(resource, provider)
		}
		return result
	}

	def static String traverse(Resource resource, CloudProvider provider) {
		String result = ""
		switch(resource) {
			case ComputeInstance:
				result += generate(resource, provider)
				break
				
			case StorageBucket:
				result += generate(resource, provider)
				break
				
			case Network:
				result += traverse(getNetworkResources(resource), provider)
				break
				
			case VPC:
				result += generate(resource, provider)
				break
				
			case Subnet:
				result += generate(resource, provider)
				break
				
			case HostedZone:
				result += generate(resource, provider)
				break
		}
		return result
	}
	
	def static String generate(Resource resource, CloudProvider provider) {
		String result = ""
		switch(resource) {
			case ComputeInstance:
				result += compileComputeInstance(resource, provider)
				break
				
			case StorageBucket:
				result += compileStorageBucket(resource, provider)
				break
				
			case Network:
				result += traverse(getNetworkResources(resource), provider)
				break
				
			case VPC:
				result += compileVPC(resource, provider)
				break
				
			case Subnet:
				result += compileSubnet(resource, provider)
				break
				
			case HostedZone:
				result += compileHostedZone(resource, provider)
				break
		}
		return result
	}

	def static String compileComputeInstance(ComputeInstance compute, CloudProvider provider) {
		String yaml = "\n\n"
		String computeYaml = ""
		
		// the provided network, VPC, and subnet must all exist
		if (!compute.network.name) {
			throw new NoSuchElementException("Attempted to assign VM '${compute.name}' to an undefined Network")
		}
		
		if (!compute.vpc.name) {
			throw new NoSuchElementException("Attempted to assign VM '${compute.name}' to an undefined VPC")
		}
		
		if (!compute.subnet.name) {
			throw new NoSuchElementException("Attempted to assign VM '${compute.name}' to an undefined Subnet")
		}
		
		switch(provider) {
			case CloudProvider.AWS:
				String type = getAwsInstanceType(compute.instanceType)
				String image = getAwsOsImage(compute.osImage)
				
				computeYaml = (
					    "${compute.name}:"
					+ "\n    Type: AWS::EC2::Instance"
					+ "\n    Properties:"
					+ "\n        InstanceType: ${type}"
					+ "\n        SubnetId: !Ref ${compute.subnet.name}"
					+ "\n        ImageId: ${image}"
				)
				break
			
			case CloudProvider.GCP:
				String type = getGcpInstanceType(compute.instanceType)
				String image = getGcpOsImage(compute.osImage)
			
				String gcpRegion = getGcpRegion(compute.region)
				String computeName = compute.name.toLowerCase()
				String subnetName = compute.subnet.name.toLowerCase()
				
				computeYaml = (
					    "- name: ${computeName}"
					+ "\n  type: compute.v1.instance"
					+ "\n  properties:"
					+ "\n    zone: ${gcpRegion}-a"
					+ "\n    machineType: zones/${gcpRegion}-a/machineTypes/${type}"
					+ "\n    networkInterfaces:"
					+ "\n      - subnetwork: \$(ref.${subnetName}.selfLink)"
					+ "\n    disks:"
					+ "\n      - boot: true"						
					+ "\n        autoDelete: true"
					+ "\n        initializeParams:"
					+ "\n          sourceImage: ${image}"
				)
				break
		}
	    
				
		yaml += prependWithTabs(computeYaml, 1)
		return yaml
	}
	
	
	def static String compileStorageBucket(StorageBucket bucket, CloudProvider provider) {
		String result = "\n\n"
		String bucketResult = ""
		
		switch (provider) {
			case CloudProvider.AWS:
				String awsRegion = getAwsRegion(bucket.region)
				String vStatus = bucket.isVersioning() ? "Enabled" : "Suspended"
				
				bucketResult = (
					    "${bucket.name}:"
					+ "\n    Type: AWS::S3::Bucket"
					+ "\n    Properties:"
					+ "\n        BucketName: ${bucket.name.toLowerCase()}-1"
					+ "\n        VersioningConfiguration:"
					+ "\n            Status: ${vStatus}"
				)
				break

			case CloudProvider.GCP:
				String bucketName = bucket.name.toLowerCase()
				String gcpRegion = getGcpRegion(bucket.region)
				
				bucketResult = (
					    "- name: ${bucketName}" 
					+ "\n  type: storage.v1.bucket"
					+ "\n  properties:"
					+ "\n    location: ${gcpRegion}"
					+ "\n    versioning:"
					+ "\n      enabled: ${bucket.isVersioning()}"
					+ "\n    labels:"
					+ "\n      city: ${bucket.region}"
				)
				break
		}
			
		result += prependWithTabs(bucketResult, 1)
		return result
	}
	
	def static String compileVPC(VPC vpc, CloudProvider provider) {
		String result = "\n\n"
		String networkResult = ""
		
		switch(provider) {
			case CloudProvider.AWS:
				networkResult = (
					    "${vpc.name}:"
					+ "\n    Type: AWS::EC2::VPC"
					+ "\n    Properties:"
					+ "\n        CidrBlock: ${vpc.cidr}"
				)
				break
					
			case CloudProvider.GCP:
				String vpcName = vpc.name.toLowerCase()
			
				networkResult = (
					    "- name: ${vpcName}"
					+ "\n  type: compute.v1.network"
					+ "\n  properties:"
					+ "\n    autoCreateSubnetworks: false"
				)
				
				break
		}
		
		result += prependWithTabs(networkResult, 1)
		result += traverse(vpc.getSubnets(), provider)
		return result
	}
	
	 def static String compileHostedZone(HostedZone zone, CloudProvider provider) {
		String result = "\n\n"
		String hostedZoneResult = "" 
		
		switch(provider) {
			case CloudProvider.AWS:
				hostedZoneResult = (
					    "${zone.name}:"
					+ "\n    Type: AWS::Route53::HostedZone"
					+ "\n    Properties:"
					+ "\n        Name: ${zone.domain}"
				)
				break
					
			case CloudProvider.GCP:
				String zoneName = zone.name.toLowerCase()
			
				hostedZoneResult = (
					    "- name: ${zoneName}"
					+ "\n  type: dns.v1.managedZone"
					+ "\n  properties:"
					+ "\n    dnsName: ${zone.domain}."
					+ "\n    description: Hosted Zone for ${zone.name}"
				)
				// * description is required!
				// * DNS for GCP MUST end in a dot (eg. cloudiac.com.)
				break
		}
			
		result += prependWithTabs(hostedZoneResult, 1)
		return result
	 }
	
	def static compileSubnet(Subnet subnet, CloudProvider provider) {
		String result = "\n\n"
		String subnetResult = ""
		
		// the provided VPC must be defined
		if (!subnet.vpc.name) {
			throw new NoSuchElementException("Attempted to assign Subnet '${subnet.name}' to an undefined VPC")
		}
		
		switch(provider) {
			case CloudProvider.AWS:
				subnetResult = (
					    "${subnet.name}:"
					+ "\n    Type: AWS::EC2::Subnet"
					+ "\n    Properties:"
					+ "\n        VpcId: !Ref ${subnet.vpc.name}"
					+ "\n        CidrBlock: ${subnet.cidr}"
				)
				break
					
			case CloudProvider.GCP:
				String subnetName = subnet.name.toLowerCase()
				String gcpRegion = getGcpRegion(subnet.region);
				String vpcName = subnet.vpc.name.toLowerCase()
				
				subnetResult = (
					    "- name: ${subnetName}"
					+ "\n  type: compute.v1.subnetwork"
					+ "\n  properties:"
					+ "\n    region: ${gcpRegion}"
					+ "\n    network: \$(ref.${vpcName}.selfLink)"
					+ "\n    ipCidrRange: ${subnet.cidr}"
				)
				break
		}
		
		result += prependWithTabs(subnetResult, 1)
		return result
	}	
	
	def String getClosingTags(CloudProvider provider) {
		String toAdd = ""
		
		switch(provider) {
			case CloudProvider.AWS:
				toAdd += ""
				break
			
			case CloudProvider.GCP:
				toAdd += ""
				break
		}
		
		return toAdd
	}
	
	// Region Helpers
	def static String getAwsRegion(Region region) {
		switch (region) {
			case Region.LONDON:     return "eu-west-2"
			case Region.MANCHESTER: return "eu-west-2"
			case Region.BIRMINGHAM: return "eu-west-2"
			case Region.EDINBURGH:  return "eu-west-2"
			default: return "eu-west-2"
		}
	}
	
	def static String getGcpRegion(Region region) {
		switch (region) {
			case Region.LONDON:     return "europe-west2"
			case Region.MANCHESTER: return "europe-west2"
			case Region.BIRMINGHAM: return "europe-west2"
			case Region.EDINBURGH:  return "europe-west2"
			default: return "europe-west2"
		}
	}
	
	// Instance Type Helpers
	def static String getAwsInstanceType(InstanceType type) {
		switch(type) {
			case InstanceType.SMALL: 	return "t3.micro"
			case InstanceType.MEDIUM: 	return "t2.medium"
			case InstanceType.LARGE: 	return "t2.large"
			default: return "t3.micro"
		}
	}
	
	def static String getGcpInstanceType(InstanceType type) {
		// sort-of-equivalent types to AWS ones:
		// * source: https://docs.cloud.google.com/compute/docs/general-purpose-machines#e2_machine_types
		switch(type) {
			case InstanceType.SMALL: 	return "e2-small"
			case InstanceType.MEDIUM: 	return "e2-standard-4"
			case InstanceType.LARGE: 	return "e2-standard-8"
			default: return "e2-small"
		}
	}
	
	// OS Image Helpers
	def static String getAwsOsImage(OSImage image) {
		switch(image) {
			case OSImage.UBUNTU: 		return "ami-0a91cd140a1fc148a"
			case OSImage.AMAZON_LINUX:	return "ami-099400d52583dd8c4"
			case OSImage.WINDOWS:		return "ami-0b2f6494ff0b07a0e"
			default: return "ami-099400d52583dd8c4"
		}
	}
	
	def static String getGcpOsImage(OSImage image) {
		// sort-of-equivalent images to AWS ones
		// * source: https://docs.cloud.google.com/compute/docs/images/os-details
		switch(image) {
			case OSImage.UBUNTU: 		return "projects/ubuntu-os-cloud/global/images/family/ubuntu-2404-lts"
			case OSImage.AMAZON_LINUX:	return "projects/debian-cloud/global/images/family/debian-13"
			case OSImage.WINDOWS:		return "projects/windows-cloud/global/images/family/windows-2025"
			default: return "projects/debian-cloud/global/images/family/debian-13"
		}
	}
	
	// Formatting Helpers
	def static String prependWithTabs(String text, int tabs) {
		String[] lines = text.split("\n")
		ArrayList<String> tabbed = new ArrayList<>()
		
		for (String line in lines) {
			String space = " " * (4 * tabs)
			tabbed.add(space + line)
		}
		return tabbed.join("\n")
	}

	def static List<Resource> getNetworkResources(Resource resource) {
	    def result = []
		
	    if (resource instanceof Network) {
	        // Add all VPCs and HostedZones
	        result.addAll(resource.vpcs)
	        result.addAll(resource.zones)
	    }
	    return result
	}
}
