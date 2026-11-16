/**
 */
package cloudiac.impl;

import cloudiac.CloudiacPackage;
import cloudiac.StorageBucket;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.impl.StorageBucketImpl#isVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageBucketImpl extends ResourceImpl implements StorageBucket {
	/**
	 * The default value of the '{@link #isVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSIONING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersioning() <em>Versioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioning()
	 * @generated
	 * @ordered
	 */
	protected boolean versioning = VERSIONING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiacPackage.Literals.STORAGE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersioning(boolean newVersioning) {
		boolean oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.STORAGE_BUCKET__VERSIONING,
					oldVersioning, versioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CloudiacPackage.STORAGE_BUCKET__VERSIONING:
			return isVersioning();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CloudiacPackage.STORAGE_BUCKET__VERSIONING:
			setVersioning((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CloudiacPackage.STORAGE_BUCKET__VERSIONING:
			setVersioning(VERSIONING_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CloudiacPackage.STORAGE_BUCKET__VERSIONING:
			return versioning != VERSIONING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (versioning: ");
		result.append(versioning);
		result.append(')');
		return result.toString();
	}

} //StorageBucketImpl
