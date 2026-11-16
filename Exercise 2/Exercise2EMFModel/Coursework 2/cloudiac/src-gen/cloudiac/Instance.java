/**
 */
package cloudiac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.Instance#getCPU <em>CPU</em>}</li>
 *   <li>{@link cloudiac.Instance#getMemoryGB <em>Memory GB</em>}</li>
 *   <li>{@link cloudiac.Instance#getOsImage <em>Os Image</em>}</li>
 *   <li>{@link cloudiac.Instance#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see cloudiac.CloudiacPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU</em>' attribute.
	 * @see #setCPU(int)
	 * @see cloudiac.CloudiacPackage#getInstance_CPU()
	 * @model
	 * @generated
	 */
	int getCPU();

	/**
	 * Sets the value of the '{@link cloudiac.Instance#getCPU <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU</em>' attribute.
	 * @see #getCPU()
	 * @generated
	 */
	void setCPU(int value);

	/**
	 * Returns the value of the '<em><b>Memory GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory GB</em>' attribute.
	 * @see #setMemoryGB(int)
	 * @see cloudiac.CloudiacPackage#getInstance_MemoryGB()
	 * @model
	 * @generated
	 */
	int getMemoryGB();

	/**
	 * Sets the value of the '{@link cloudiac.Instance#getMemoryGB <em>Memory GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory GB</em>' attribute.
	 * @see #getMemoryGB()
	 * @generated
	 */
	void setMemoryGB(int value);

	/**
	 * Returns the value of the '<em><b>Os Image</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiac.OSImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Image</em>' attribute.
	 * @see cloudiac.OSImage
	 * @see #setOsImage(OSImage)
	 * @see cloudiac.CloudiacPackage#getInstance_OsImage()
	 * @model
	 * @generated
	 */
	OSImage getOsImage();

	/**
	 * Sets the value of the '{@link cloudiac.Instance#getOsImage <em>Os Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Image</em>' attribute.
	 * @see cloudiac.OSImage
	 * @see #getOsImage()
	 * @generated
	 */
	void setOsImage(OSImage value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiac.InstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see cloudiac.InstanceType
	 * @see #setInstanceType(InstanceType)
	 * @see cloudiac.CloudiacPackage#getInstance_InstanceType()
	 * @model
	 * @generated
	 */
	InstanceType getInstanceType();

	/**
	 * Sets the value of the '{@link cloudiac.Instance#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see cloudiac.InstanceType
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(InstanceType value);

} // Instance
