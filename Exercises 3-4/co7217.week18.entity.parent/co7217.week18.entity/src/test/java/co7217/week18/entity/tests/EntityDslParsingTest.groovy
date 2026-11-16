package co7217.week18.entity.tests

import com.google.inject.Inject
import co7217.week18.entity.tests.EntityDslInjectorProvider

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.function.Executable
import static groovy.test.GroovyAssert.shouldFail

import co7217.week18.entity.entityDsl.*
import co7217.week18.entity.generator.EntityGenerator

@ExtendWith(InjectionExtension)
@InjectWith(EntityDslInjectorProvider.class)
class EntityDslParsingTest {

    @Inject
    ParseHelper<Infrastructure> parseHelper

    @Test
    void "parser_valid_full"() {
		// tests a fully comprehensive DSL program instance
		// * ensures all values can be accessed for full coverage
		
        def model = parseHelper.parse('''
            define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				             
			 	            Backend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.3.0/24"
				             }
				    	}
				    }
				
				    hostedzone CloudiacZone {
				    	domain "cloudiac.com"
				    }
			    }
			    
			    bucket UserUploadsCloudiac hosted in london {
					enable versioning
				}
				
			    vm DatabaseServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Backend
				 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Frontend
				 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			    
			    vm BackEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Backend
				 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }			
			}
        ''')

		// no grammar syntax errors
        Assertions.assertNotNull(model)
        def errors = model.eResource().errors
        Assertions.assertTrue(errors.isEmpty(), "Unexpected syntax errors: " + errors.join(", "))

		// size & cloud provider
        Assertions.assertEquals(model.cloudProvider.name, "AWS")
        Assertions.assertEquals(model.resources.size(), 5)

		// network
		Network net = model.resources.find { it instanceof Network } as Network
		Assertions.assertEquals(net.name, "MainCluster")
		Assertions.assertEquals(net.vpcs.size(), 1)
		Assertions.assertEquals(net.zones.size(), 1)
		
		VPC vpc = net.vpcs[0]
		Assertions.assertEquals(vpc.name, "MainVPC")
		Assertions.assertEquals(vpc.cidr, "10.0.0.0/16")
		Assertions.assertEquals(vpc.subnets.size(), 2)
		
		HostedZone zone = net.zones[0]
		Assertions.assertEquals(zone.name, "CloudiacZone")
		Assertions.assertEquals(zone.domain, "cloudiac.com")
		
		// front-end subnet
		Subnet subnet_fe = vpc.subnets[0]
		Assertions.assertEquals(subnet_fe.name, "Frontend")
		Assertions.assertEquals(subnet_fe.vpc, vpc)
		Assertions.assertEquals(subnet_fe.region, Region.LONDON)
		Assertions.assertEquals(subnet_fe.cidr, "10.0.1.0/24")
		
		// back-end subnet
		Subnet subnet_be = vpc.subnets[1]
		Assertions.assertEquals(subnet_be.name, "Backend")
		Assertions.assertEquals(subnet_be.vpc, vpc)
		Assertions.assertEquals(subnet_be.region, Region.LONDON)
		Assertions.assertEquals(subnet_be.cidr, "10.0.3.0/24")
		
		// storage bucket
		StorageBucket bucket = model.resources.find { it instanceof StorageBucket } as StorageBucket
		Assertions.assertEquals(bucket.name, "UserUploadsCloudiac")
		Assertions.assertEquals(bucket.region, Region.LONDON)
		Assertions.assertEquals(bucket.versioning, true)
		
		// database server
        ComputeInstance vm_db = model.resources.find { 
			if (it instanceof ComputeInstance) { 
				it.name == "DatabaseServer"
			} 
		} as ComputeInstance
		Assertions.assertNotNull(vm_db, "DatabaseServer was not found")
        Assertions.assertEquals(vm_db.osImage.name, "AMAZON_LINUX")
		Assertions.assertEquals(vm_db.network, net)
		Assertions.assertEquals(vm_db.vpc, vpc)
		Assertions.assertEquals(vm_db.region, Region.LONDON)
		Assertions.assertEquals(vm_db.subnet, subnet_be)
		Assertions.assertEquals(vm_db.CPU, 8)
		Assertions.assertEquals(vm_db.memoryGB, 32)

		// front-end server
		ComputeInstance vm_fe = model.resources.find {
			if (it instanceof ComputeInstance) {
				it.name == "FrontEndServer"
			}
		} as ComputeInstance
		Assertions.assertNotNull(vm_fe, "FrontEndServer was not found")
		Assertions.assertEquals(vm_fe.osImage.name, "AMAZON_LINUX")
		Assertions.assertEquals(vm_fe.network, net)
		Assertions.assertEquals(vm_fe.vpc, vpc)
		Assertions.assertEquals(vm_fe.region, Region.LONDON)
		Assertions.assertEquals(vm_fe.subnet.name, subnet_fe.name)
		Assertions.assertEquals(vm_fe.CPU, 8)
		Assertions.assertEquals(vm_fe.memoryGB, 32)
		
		// back-end server
		ComputeInstance vm_be = model.resources.find {
			if (it instanceof ComputeInstance) {
				it.name == "BackEndServer"
			}
		} as ComputeInstance
		Assertions.assertNotNull(vm_be, "BackendServer was not found")
		Assertions.assertEquals(vm_be.osImage.name, "AMAZON_LINUX")
		Assertions.assertEquals(vm_be.network, net)
		Assertions.assertEquals(vm_be.vpc, vpc)
		Assertions.assertEquals(vm_be.region, Region.LONDON)
		Assertions.assertEquals(vm_be.subnet.name, subnet_be.name)
		Assertions.assertEquals(vm_be.CPU, 8)
		Assertions.assertEquals(vm_be.memoryGB, 32)
    }

    @Test
    void "parser_valid_minimal"() {
		// tests a minimalistic DSL program instance
		// * this allows the grammar to pass...
		///  ... but may not necessarily be valid AWS/GCP YAML!
		
        def model = parseHelper.parse('''
            define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			}
        ''')

        // no grammar syntax errors
        Assertions.assertNotNull(model)
        def errors = model.eResource().errors
        Assertions.assertTrue(errors.isEmpty(), "Unexpected syntax errors: " + errors.join(", "))

		// size & cloud provider
        Assertions.assertEquals(model.cloudProvider.name, "AWS")
        Assertions.assertEquals(model.resources.size(), 1)

		// network
		Network net = model.resources.find { it instanceof Network } as Network
		Assertions.assertEquals(net.name, "MainCluster")
		Assertions.assertEquals(net.vpcs.size(), 1)
		Assertions.assertEquals(net.zones.size(), 0)
		
		VPC vpc = net.vpcs[0]
		Assertions.assertEquals(vpc.name, "MainVPC")
		Assertions.assertEquals(vpc.cidr, "10.0.0.0/16")
		Assertions.assertEquals(vpc.subnets.size(), 1)
		
		// front-end subnet
		Subnet subnet_fe = vpc.subnets[0]
		Assertions.assertEquals(subnet_fe.name, "Frontend")
		Assertions.assertEquals(subnet_fe.vpc, vpc)
		Assertions.assertEquals(subnet_fe.region, Region.LONDON)
		Assertions.assertEquals(subnet_fe.cidr, "10.0.1.0/24")
    }

    @Test
    void "parser_invalid_vm_missing_running_on"() {
		// simple syntax error test
		// * ensures "running on" must be included as keywords
		
        def model = parseHelper.parse('''
            define infrastructure on aws {
                vm BrokenVM ubuntu type small { // missing "running"
                    specifications {
                        cpu: 1 cores
                        memory: 1 GB
                    }
                }
            }
        ''')

        Assertions.assertNotNull(model)
        def errors = model.eResource().errors
        Assertions.assertFalse(errors.isEmpty(), "Parser failed due to missing keywords")
		
		println(errors);
		
		println(errors[0].message)
    }
	
	@Test
	void "parser_invalid_infrastructure_provider"() {
		// undefined enum value test
		// * "azure" is not a recognised cloud provider
		
		def model = parseHelper.parse('''
            define infrastructure on azure {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		def errors = model.eResource().errors
		Assertions.assertFalse(errors.isEmpty(), "Parser failed due to unrecognised provider")
		
		println(errors[0].message)
	}
	
	@Test
	void "parser_invalid_vm_image"() {
		// undefined enum value test
		// * "linux" is not a recognised VM image
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Frontend
                 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		def errors = model.eResource().errors
		Assertions.assertFalse(errors.isEmpty(), "Parser failed due to unrecognised image")
		
		println(errors[0].message)
	}
	
	@Test
	void "parser_invalid_vm_region"() {
		// undefined enum value test
		// * "scotland" is not a recognised region
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in scotland
			     subnet Frontend
                 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		def errors = model.eResource().errors
		Assertions.assertFalse(errors.isEmpty(), "Parser failed due to unrecognised region")
		
		
		
		println(errors[0].message)
	}
	
	@Test
	void "parser_invalid_vm_type"() {
		// undefined enum value test
		// * "ultra" is not a recognised VM type
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Frontend
                 type ultra  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		def errors = model.eResource().errors
		Assertions.assertFalse(errors.isEmpty(), "Parser failed due to unrecognised type")
		
		println(errors[0].message)
	}
	
	@Test
	void "parser_invalid_vm_undefined_network"() {
		// assigning a VM to an undefined network
		// * networks must be defined within the infrastructure first
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network SideCluster 
			     in vpc SideVPC
			     hosted in london
			     subnet Frontend
			     type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		
		// doesn't detect errors...
		def errors = model.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "No detected parser errors")
		
		// ... but this does
		CloudProvider provider = model.cloudProvider
		ComputeInstance vm = model.resources.find { it instanceof ComputeInstance } as ComputeInstance
		
		def ex = shouldFail(NoSuchElementException) {
			EntityGenerator.compileComputeInstance(vm, provider)
		}
		
		println(ex.message)
	}

	@Test
	void "parser_invalid_vm_undefined_vpc"() {
		// assigning a VM to an undefined VPC
		// * VPCs must be defined within a network first 
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc SideVPC
			     hosted in london
			     subnet Frontend
			     type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		
		// doesn't detect errors...
		def errors = model.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "No detected parser errors")
		
		// ... but this does
		CloudProvider provider = model.cloudProvider
		ComputeInstance vm = model.resources.find { it instanceof ComputeInstance } as ComputeInstance
		
		def ex = shouldFail(NoSuchElementException) {
			EntityGenerator.compileComputeInstance(vm, provider)
		}
		
		println(ex.message)
	}
	
	@Test
	void "parser_invalid_vm_undefined_subnet"() {
		// assigning a VM to an undefined subnet
		// * subnets must be defined within a VPC first
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc MainVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc MainVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm BackEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Backend		// "Backend" not defined!
				 type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		
		// doesn't detect errors...
		def errors = model.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "No detected parser errors")
		
		// ... but this does
		CloudProvider provider = model.cloudProvider
		ComputeInstance vm = model.resources.find { it instanceof ComputeInstance } as ComputeInstance
		
		def ex = shouldFail(NoSuchElementException) {
			EntityGenerator.compileComputeInstance(vm, provider)
		}
		
		println(ex.message)
	}
	
	@Test
	void "parser_invalid_subnet_undefined_vpc"() {
		// assigning a subnet to an undefined VPC
		// * VPCs must be defined within a network first
		
		def model = parseHelper.parse('''
			define infrastructure on aws {
			    configure network MainCluster {
				    vpc SideVPC {
				        address space "10.0.0.0/16"
				        subnets {
				            Frontend
				             in vpc SideVPC
				             hosted in london
				             properties {
				             	range "10.0.1.0/24"
				             }
				    	}
				    }
			    }
			    
			    vm FrontEndServer running on amazon-linux
			     in network MainCluster 
			     in vpc MainVPC
			     hosted in london
			     subnet Frontend
			     type small  {
			        specifications {
			            cpu: 8 cores
			            memory: 32 GB
			        }
			    }
			}
        ''')

		Assertions.assertNotNull(model)
		
		// doesn't detect errors...
		def errors = model.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "No detected parser errors")
		
		// ... but this does
		CloudProvider provider = model.cloudProvider
		ComputeInstance vm = model.resources.find { it instanceof ComputeInstance } as ComputeInstance
		
		def ex = shouldFail(NoSuchElementException) {
			EntityGenerator.compileComputeInstance(vm, provider)
		}
		
		println(ex.message)
	}
}

