/**
 */
package cloudiac;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.Subnet#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudiac.Subnet#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends Resource {
	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloudiac.CloudiacPackage#getSubnet_Cidr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
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

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute list.
	 * The list contents are of type {@link cloudiac.Region}.
	 * The literals are from the enumeration {@link cloudiac.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute list.
	 * @see cloudiac.Region
	 * @see cloudiac.CloudiacPackage#getSubnet_Region()
	 * @model
	 * @generated
	 */
	EList<Region> getRegion();

} // Subnet
