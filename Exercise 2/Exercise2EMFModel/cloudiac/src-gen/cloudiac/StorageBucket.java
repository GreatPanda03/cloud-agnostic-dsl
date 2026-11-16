/**
 */
package cloudiac;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.StorageBucket#isVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getStorageBucket()
 * @model
 * @generated
 */
public interface StorageBucket extends Resource {
	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' attribute.
	 * @see #setVersioning(boolean)
	 * @see cloudiac.CloudiacPackage#getStorageBucket_Versioning()
	 * @model default="false"
	 * @generated
	 */
	boolean isVersioning();

	/**
	 * Sets the value of the '{@link cloudiac.StorageBucket#isVersioning <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' attribute.
	 * @see #isVersioning()
	 * @generated
	 */
	void setVersioning(boolean value);

} // StorageBucket
