/**
 */
package cloudiac;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosted Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.HostedZone#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getHostedZone()
 * @model
 * @generated
 */
public interface HostedZone extends Resource {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see cloudiac.CloudiacPackage#getHostedZone_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link cloudiac.HostedZone#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

} // HostedZone
