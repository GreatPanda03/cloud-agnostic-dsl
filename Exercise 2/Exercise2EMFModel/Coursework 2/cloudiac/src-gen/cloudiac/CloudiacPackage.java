/**
 */
package cloudiac;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloudiac.CloudiacFactory
 * @model kind="package"
 * @generated
 */
public interface CloudiacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudiac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cloudiac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudiac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudiacPackage eINSTANCE = cloudiac.impl.CloudiacPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudiac.impl.ComputeInstanceImpl <em>Compute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.ComputeInstanceImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getComputeInstance()
	 * @generated
	 */
	int COMPUTE_INSTANCE = 1;

	/**
	 * The meta object id for the '{@link cloudiac.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.ResourceImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__CPU = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__MEMORY_GB = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__OS_IMAGE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE__INSTANCE_TYPE = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Compute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_INSTANCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudiac.impl.StorageBucketImpl <em>Storage Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.StorageBucketImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getStorageBucket()
	 * @generated
	 */
	int STORAGE_BUCKET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__VERSIONING = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET__REGION = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Storage Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_BUCKET_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudiac.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.NetworkImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CIDR = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dnsrecord</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DNSRECORD = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNET = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudiac.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.SubnetImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CIDR = 1;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiac.impl.DnsRecordImpl <em>Dns Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.DnsRecordImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getDnsRecord()
	 * @generated
	 */
	int DNS_RECORD = 5;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_RECORD__HOSTNAME = 0;

	/**
	 * The number of structural features of the '<em>Dns Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_RECORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dns Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiac.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.impl.InfrastructureImpl
	 * @see cloudiac.impl.CloudiacPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Cloud Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CLOUD_PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiac.OSImage <em>OS Image</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.OSImage
	 * @see cloudiac.impl.CloudiacPackageImpl#getOSImage()
	 * @generated
	 */
	int OS_IMAGE = 7;

	/**
	 * The meta object id for the '{@link cloudiac.InstanceType <em>Instance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.InstanceType
	 * @see cloudiac.impl.CloudiacPackageImpl#getInstanceType()
	 * @generated
	 */
	int INSTANCE_TYPE = 8;

	/**
	 * The meta object id for the '{@link cloudiac.CloudProvider <em>Cloud Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.CloudProvider
	 * @see cloudiac.impl.CloudiacPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 9;

	/**
	 * The meta object id for the '{@link cloudiac.Region <em>Region</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiac.Region
	 * @see cloudiac.impl.CloudiacPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 10;

	/**
	 * Returns the meta object for class '{@link cloudiac.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see cloudiac.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiac.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link cloudiac.ComputeInstance <em>Compute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Instance</em>'.
	 * @see cloudiac.ComputeInstance
	 * @generated
	 */
	EClass getComputeInstance();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.ComputeInstance#getCPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU</em>'.
	 * @see cloudiac.ComputeInstance#getCPU()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_CPU();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.ComputeInstance#getMemoryGB <em>Memory GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory GB</em>'.
	 * @see cloudiac.ComputeInstance#getMemoryGB()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_MemoryGB();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.ComputeInstance#getOsImage <em>Os Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Image</em>'.
	 * @see cloudiac.ComputeInstance#getOsImage()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_OsImage();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.ComputeInstance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see cloudiac.ComputeInstance#getInstanceType()
	 * @see #getComputeInstance()
	 * @generated
	 */
	EAttribute getComputeInstance_InstanceType();

	/**
	 * Returns the meta object for class '{@link cloudiac.StorageBucket <em>Storage Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Bucket</em>'.
	 * @see cloudiac.StorageBucket
	 * @generated
	 */
	EClass getStorageBucket();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.StorageBucket#isVersioning <em>Versioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versioning</em>'.
	 * @see cloudiac.StorageBucket#isVersioning()
	 * @see #getStorageBucket()
	 * @generated
	 */
	EAttribute getStorageBucket_Versioning();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.StorageBucket#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see cloudiac.StorageBucket#getRegion()
	 * @see #getStorageBucket()
	 * @generated
	 */
	EAttribute getStorageBucket_Region();

	/**
	 * Returns the meta object for class '{@link cloudiac.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see cloudiac.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.Network#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see cloudiac.Network#getCidr()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Cidr();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiac.Network#getDnsrecord <em>Dnsrecord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dnsrecord</em>'.
	 * @see cloudiac.Network#getDnsrecord()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Dnsrecord();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiac.Network#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnet</em>'.
	 * @see cloudiac.Network#getSubnet()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnet();

	/**
	 * Returns the meta object for class '{@link cloudiac.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see cloudiac.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.Subnet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiac.Subnet#getName()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.Subnet#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see cloudiac.Subnet#getCidr()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Cidr();

	/**
	 * Returns the meta object for class '{@link cloudiac.DnsRecord <em>Dns Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Record</em>'.
	 * @see cloudiac.DnsRecord
	 * @generated
	 */
	EClass getDnsRecord();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.DnsRecord#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see cloudiac.DnsRecord#getHostname()
	 * @see #getDnsRecord()
	 * @generated
	 */
	EAttribute getDnsRecord_Hostname();

	/**
	 * Returns the meta object for class '{@link cloudiac.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see cloudiac.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiac.Infrastructure#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see cloudiac.Infrastructure#getResource()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Resource();

	/**
	 * Returns the meta object for the attribute '{@link cloudiac.Infrastructure#getCloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Provider</em>'.
	 * @see cloudiac.Infrastructure#getCloudProvider()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_CloudProvider();

	/**
	 * Returns the meta object for enum '{@link cloudiac.OSImage <em>OS Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Image</em>'.
	 * @see cloudiac.OSImage
	 * @generated
	 */
	EEnum getOSImage();

	/**
	 * Returns the meta object for enum '{@link cloudiac.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Type</em>'.
	 * @see cloudiac.InstanceType
	 * @generated
	 */
	EEnum getInstanceType();

	/**
	 * Returns the meta object for enum '{@link cloudiac.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Provider</em>'.
	 * @see cloudiac.CloudProvider
	 * @generated
	 */
	EEnum getCloudProvider();

	/**
	 * Returns the meta object for enum '{@link cloudiac.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Region</em>'.
	 * @see cloudiac.Region
	 * @generated
	 */
	EEnum getRegion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudiacFactory getCloudiacFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloudiac.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.ResourceImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.ComputeInstanceImpl <em>Compute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.ComputeInstanceImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getComputeInstance()
		 * @generated
		 */
		EClass COMPUTE_INSTANCE = eINSTANCE.getComputeInstance();

		/**
		 * The meta object literal for the '<em><b>CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__CPU = eINSTANCE.getComputeInstance_CPU();

		/**
		 * The meta object literal for the '<em><b>Memory GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__MEMORY_GB = eINSTANCE.getComputeInstance_MemoryGB();

		/**
		 * The meta object literal for the '<em><b>Os Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__OS_IMAGE = eINSTANCE.getComputeInstance_OsImage();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE_INSTANCE__INSTANCE_TYPE = eINSTANCE.getComputeInstance_InstanceType();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.StorageBucketImpl <em>Storage Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.StorageBucketImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getStorageBucket()
		 * @generated
		 */
		EClass STORAGE_BUCKET = eINSTANCE.getStorageBucket();

		/**
		 * The meta object literal for the '<em><b>Versioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_BUCKET__VERSIONING = eINSTANCE.getStorageBucket_Versioning();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_BUCKET__REGION = eINSTANCE.getStorageBucket_Region();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.NetworkImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__CIDR = eINSTANCE.getNetwork_Cidr();

		/**
		 * The meta object literal for the '<em><b>Dnsrecord</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__DNSRECORD = eINSTANCE.getNetwork_Dnsrecord();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SUBNET = eINSTANCE.getNetwork_Subnet();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.SubnetImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__NAME = eINSTANCE.getSubnet_Name();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__CIDR = eINSTANCE.getSubnet_Cidr();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.DnsRecordImpl <em>Dns Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.DnsRecordImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getDnsRecord()
		 * @generated
		 */
		EClass DNS_RECORD = eINSTANCE.getDnsRecord();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_RECORD__HOSTNAME = eINSTANCE.getDnsRecord_Hostname();

		/**
		 * The meta object literal for the '{@link cloudiac.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.impl.InfrastructureImpl
		 * @see cloudiac.impl.CloudiacPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__RESOURCE = eINSTANCE.getInfrastructure_Resource();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__CLOUD_PROVIDER = eINSTANCE.getInfrastructure_CloudProvider();

		/**
		 * The meta object literal for the '{@link cloudiac.OSImage <em>OS Image</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.OSImage
		 * @see cloudiac.impl.CloudiacPackageImpl#getOSImage()
		 * @generated
		 */
		EEnum OS_IMAGE = eINSTANCE.getOSImage();

		/**
		 * The meta object literal for the '{@link cloudiac.InstanceType <em>Instance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.InstanceType
		 * @see cloudiac.impl.CloudiacPackageImpl#getInstanceType()
		 * @generated
		 */
		EEnum INSTANCE_TYPE = eINSTANCE.getInstanceType();

		/**
		 * The meta object literal for the '{@link cloudiac.CloudProvider <em>Cloud Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.CloudProvider
		 * @see cloudiac.impl.CloudiacPackageImpl#getCloudProvider()
		 * @generated
		 */
		EEnum CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '{@link cloudiac.Region <em>Region</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiac.Region
		 * @see cloudiac.impl.CloudiacPackageImpl#getRegion()
		 * @generated
		 */
		EEnum REGION = eINSTANCE.getRegion();

	}

} //CloudiacPackage
