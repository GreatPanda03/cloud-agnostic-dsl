/**
 */
package cloudiac;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudiac.CloudiacPackage
 * @generated
 */
public interface CloudiacFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudiacFactory eINSTANCE = cloudiac.impl.CloudiacFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compute Instance</em>'.
	 * @generated
	 */
	ComputeInstance createComputeInstance();

	/**
	 * Returns a new object of class '<em>Storage Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Bucket</em>'.
	 * @generated
	 */
	StorageBucket createStorageBucket();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPC</em>'.
	 * @generated
	 */
	VPC createVPC();

	/**
	 * Returns a new object of class '<em>Hosted Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hosted Zone</em>'.
	 * @generated
	 */
	HostedZone createHostedZone();

	/**
	 * Returns a new object of class '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet</em>'.
	 * @generated
	 */
	Subnet createSubnet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudiacPackage getCloudiacPackage();

} //CloudiacFactory
