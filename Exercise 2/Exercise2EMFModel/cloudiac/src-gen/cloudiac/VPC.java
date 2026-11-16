/**
 */
package cloudiac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.VPC#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudiac.VPC#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudiac.VPC#getComputeinstance <em>Computeinstance</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends EObject {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloudiac.CloudiacPackage#getVPC_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link cloudiac.VPC#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getVPC_Subnet()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnet();

	/**
	 * Returns the value of the '<em><b>Computeinstance</b></em>' reference list.
	 * The list contents are of type {@link cloudiac.ComputeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computeinstance</em>' reference list.
	 * @see cloudiac.CloudiacPackage#getVPC_Computeinstance()
	 * @model
	 * @generated
	 */
	EList<ComputeInstance> getComputeinstance();

} // VPC
