/**
 */
package cloudiac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.Infrastructure#getResource <em>Resource</em>}</li>
 *   <li>{@link cloudiac.Infrastructure#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getInfrastructure()
 * @model abstract="true"
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiac.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see cloudiac.CloudiacPackage#getInfrastructure_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Cloud Provider</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiac.CloudProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Provider</em>' attribute.
	 * @see cloudiac.CloudProvider
	 * @see #setCloudProvider(CloudProvider)
	 * @see cloudiac.CloudiacPackage#getInfrastructure_CloudProvider()
	 * @model
	 * @generated
	 */
	CloudProvider getCloudProvider();

	/**
	 * Sets the value of the '{@link cloudiac.Infrastructure#getCloudProvider <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Provider</em>' attribute.
	 * @see cloudiac.CloudProvider
	 * @see #getCloudProvider()
	 * @generated
	 */
	void setCloudProvider(CloudProvider value);

} // Infrastructure
