/**
 */
package cloudiac.impl;

import cloudiac.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudiacFactoryImpl extends EFactoryImpl implements CloudiacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudiacFactory init() {
		try {
			CloudiacFactory theCloudiacFactory = (CloudiacFactory) EPackage.Registry.INSTANCE
					.getEFactory(CloudiacPackage.eNS_URI);
			if (theCloudiacFactory != null) {
				return theCloudiacFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudiacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudiacFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CloudiacPackage.COMPUTE_INSTANCE:
			return createComputeInstance();
		case CloudiacPackage.STORAGE_BUCKET:
			return createStorageBucket();
		case CloudiacPackage.NETWORK:
			return createNetwork();
		case CloudiacPackage.VPC:
			return createVPC();
		case CloudiacPackage.HOSTED_ZONE:
			return createHostedZone();
		case CloudiacPackage.SUBNET:
			return createSubnet();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CloudiacPackage.OS_IMAGE:
			return createOSImageFromString(eDataType, initialValue);
		case CloudiacPackage.INSTANCE_TYPE:
			return createInstanceTypeFromString(eDataType, initialValue);
		case CloudiacPackage.CLOUD_PROVIDER:
			return createCloudProviderFromString(eDataType, initialValue);
		case CloudiacPackage.REGION:
			return createRegionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CloudiacPackage.OS_IMAGE:
			return convertOSImageToString(eDataType, instanceValue);
		case CloudiacPackage.INSTANCE_TYPE:
			return convertInstanceTypeToString(eDataType, instanceValue);
		case CloudiacPackage.CLOUD_PROVIDER:
			return convertCloudProviderToString(eDataType, instanceValue);
		case CloudiacPackage.REGION:
			return convertRegionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeInstance createComputeInstance() {
		ComputeInstanceImpl computeInstance = new ComputeInstanceImpl();
		return computeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageBucket createStorageBucket() {
		StorageBucketImpl storageBucket = new StorageBucketImpl();
		return storageBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostedZone createHostedZone() {
		HostedZoneImpl hostedZone = new HostedZoneImpl();
		return hostedZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSImage createOSImageFromString(EDataType eDataType, String initialValue) {
		OSImage result = OSImage.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSImageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType createInstanceTypeFromString(EDataType eDataType, String initialValue) {
		InstanceType result = InstanceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProviderFromString(EDataType eDataType, String initialValue) {
		CloudProvider result = CloudProvider.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegionFromString(EDataType eDataType, String initialValue) {
		Region result = Region.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudiacPackage getCloudiacPackage() {
		return (CloudiacPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudiacPackage getPackage() {
		return CloudiacPackage.eINSTANCE;
	}

} //CloudiacFactoryImpl
