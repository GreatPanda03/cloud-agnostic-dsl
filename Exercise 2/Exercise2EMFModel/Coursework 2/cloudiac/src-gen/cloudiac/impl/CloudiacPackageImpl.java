/**
 */
package cloudiac.impl;

import cloudiac.CloudProvider;
import cloudiac.CloudiacFactory;
import cloudiac.CloudiacPackage;
import cloudiac.ComputeInstance;
import cloudiac.DnsRecord;
import cloudiac.Infrastructure;
import cloudiac.InstanceType;
import cloudiac.Network;
import cloudiac.OSImage;
import cloudiac.Region;
import cloudiac.Resource;
import cloudiac.StorageBucket;
import cloudiac.Subnet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudiacPackageImpl extends EPackageImpl implements CloudiacPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osImageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudiac.CloudiacPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudiacPackageImpl() {
		super(eNS_URI, CloudiacFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CloudiacPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudiacPackage init() {
		if (isInited)
			return (CloudiacPackage) EPackage.Registry.INSTANCE.getEPackage(CloudiacPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCloudiacPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CloudiacPackageImpl theCloudiacPackage = registeredCloudiacPackage instanceof CloudiacPackageImpl
				? (CloudiacPackageImpl) registeredCloudiacPackage
				: new CloudiacPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCloudiacPackage.createPackageContents();

		// Initialize created meta-data
		theCloudiacPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudiacPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudiacPackage.eNS_URI, theCloudiacPackage);
		return theCloudiacPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputeInstance() {
		return computeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_CPU() {
		return (EAttribute) computeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_MemoryGB() {
		return (EAttribute) computeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_OsImage() {
		return (EAttribute) computeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputeInstance_InstanceType() {
		return (EAttribute) computeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageBucket() {
		return storageBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageBucket_Versioning() {
		return (EAttribute) storageBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageBucket_Region() {
		return (EAttribute) storageBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Cidr() {
		return (EAttribute) networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Dnsrecord() {
		return (EReference) networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Subnet() {
		return (EReference) networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnet_Name() {
		return (EAttribute) subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubnet_Cidr() {
		return (EAttribute) subnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDnsRecord() {
		return dnsRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDnsRecord_Hostname() {
		return (EAttribute) dnsRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructure_Resource() {
		return (EReference) infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfrastructure_CloudProvider() {
		return (EAttribute) infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOSImage() {
		return osImageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInstanceType() {
		return instanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCloudProvider() {
		return cloudProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegion() {
		return regionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudiacFactory getCloudiacFactory() {
		return (CloudiacFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		computeInstanceEClass = createEClass(COMPUTE_INSTANCE);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__CPU);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__MEMORY_GB);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__OS_IMAGE);
		createEAttribute(computeInstanceEClass, COMPUTE_INSTANCE__INSTANCE_TYPE);

		storageBucketEClass = createEClass(STORAGE_BUCKET);
		createEAttribute(storageBucketEClass, STORAGE_BUCKET__VERSIONING);
		createEAttribute(storageBucketEClass, STORAGE_BUCKET__REGION);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__CIDR);
		createEReference(networkEClass, NETWORK__DNSRECORD);
		createEReference(networkEClass, NETWORK__SUBNET);

		subnetEClass = createEClass(SUBNET);
		createEAttribute(subnetEClass, SUBNET__NAME);
		createEAttribute(subnetEClass, SUBNET__CIDR);

		dnsRecordEClass = createEClass(DNS_RECORD);
		createEAttribute(dnsRecordEClass, DNS_RECORD__HOSTNAME);

		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEReference(infrastructureEClass, INFRASTRUCTURE__RESOURCE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__CLOUD_PROVIDER);

		// Create enums
		osImageEEnum = createEEnum(OS_IMAGE);
		instanceTypeEEnum = createEEnum(INSTANCE_TYPE);
		cloudProviderEEnum = createEEnum(CLOUD_PROVIDER);
		regionEEnum = createEEnum(REGION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computeInstanceEClass.getESuperTypes().add(this.getResource());
		storageBucketEClass.getESuperTypes().add(this.getResource());
		networkEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computeInstanceEClass, ComputeInstance.class, "ComputeInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputeInstance_CPU(), ecorePackage.getEInt(), "CPU", null, 0, 1, ComputeInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputeInstance_MemoryGB(), ecorePackage.getEInt(), "memoryGB", null, 0, 1,
				ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputeInstance_OsImage(), this.getOSImage(), "osImage", null, 0, 1, ComputeInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputeInstance_InstanceType(), this.getInstanceType(), "instanceType", null, 0, 1,
				ComputeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(storageBucketEClass, StorageBucket.class, "StorageBucket", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageBucket_Versioning(), ecorePackage.getEBoolean(), "versioning", "false", 0, 1,
				StorageBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageBucket_Region(), this.getRegion(), "region", null, 0, 1, StorageBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Dnsrecord(), this.getDnsRecord(), null, "dnsrecord", null, 0, -1, Network.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Subnet(), this.getSubnet(), null, "subnet", null, 0, -1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subnet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, Subnet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsRecordEClass, DnsRecord.class, "DnsRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDnsRecord_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, DnsRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructure_Resource(), this.getResource(), null, "resource", null, 0, -1,
				Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_CloudProvider(), this.getCloudProvider(), "cloudProvider", null, 0, 1,
				Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(osImageEEnum, OSImage.class, "OSImage");
		addEEnumLiteral(osImageEEnum, OSImage.UBUNTU);
		addEEnumLiteral(osImageEEnum, OSImage.AMAZON_LINUX);
		addEEnumLiteral(osImageEEnum, OSImage.WINDOWS);

		initEEnum(instanceTypeEEnum, InstanceType.class, "InstanceType");
		addEEnumLiteral(instanceTypeEEnum, InstanceType.SMALL);
		addEEnumLiteral(instanceTypeEEnum, InstanceType.MEDIUM);
		addEEnumLiteral(instanceTypeEEnum, InstanceType.LARGE);

		initEEnum(cloudProviderEEnum, CloudProvider.class, "CloudProvider");
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.AWS);
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.AZURE);
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.GCP);

		initEEnum(regionEEnum, Region.class, "Region");
		addEEnumLiteral(regionEEnum, Region.LONDON);
		addEEnumLiteral(regionEEnum, Region.MANCHESTER);
		addEEnumLiteral(regionEEnum, Region.BIRMINGHAM);
		addEEnumLiteral(regionEEnum, Region.EDINBURGH);

		// Create resource
		createResource(eNS_URI);
	}

} //CloudiacPackageImpl
