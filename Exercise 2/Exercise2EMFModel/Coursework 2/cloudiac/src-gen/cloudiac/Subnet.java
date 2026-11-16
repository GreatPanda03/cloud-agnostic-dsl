/**
 */
package cloudiac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.Subnet#getName <em>Name</em>}</li>
 *   <li>{@link cloudiac.Subnet#getCidr <em>Cidr</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudiac.CloudiacPackage#getSubnet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudiac.Subnet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloudiac.CloudiacPackage#getSubnet_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link cloudiac.Subnet#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

} // Subnet
