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
 *   <li>{@link cloudiac.Network#getDnsrecord <em>Dnsrecord</em>}</li>
 *   <li>{@link cloudiac.Network#getSubnet <em>Subnet</em>}</li>
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
	 * Returns the value of the '<em><b>Dnsrecord</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.DnsRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dnsrecord</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getNetwork_Dnsrecord()
	 * @model containment="true"
	 * @generated
	 */
	EList<DnsRecord> getDnsrecord();

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getNetwork_Subnet()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnet();

} // Network
