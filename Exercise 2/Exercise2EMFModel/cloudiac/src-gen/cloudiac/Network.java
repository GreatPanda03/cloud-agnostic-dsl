/**
 */
package cloudiac;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.Network#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudiac.Network#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloudiac.Network#getHostedzone <em>Hostedzone</em>}</li>
 *   <li>{@link cloudiac.Network#getComputeinstance <em>Computeinstance</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Resource {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloudiac.CloudiacPackage#getNetwork_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link cloudiac.Network#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.VPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getNetwork_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

	/**
	 * Returns the value of the '<em><b>Hostedzone</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.HostedZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostedzone</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getNetwork_Hostedzone()
	 * @model containment="true"
	 * @generated
	 */
	EList<HostedZone> getHostedzone();

	/**
	 * Returns the value of the '<em><b>Computeinstance</b></em>' reference list.
	 * The list contents are of type {@link cloudiac.ComputeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computeinstance</em>' reference list.
	 * @see cloudiac.CloudiacPackage#getNetwork_Computeinstance()
	 * @model
	 * @generated
	 */
	EList<ComputeInstance> getComputeinstance();

} // Network
