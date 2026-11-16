/**
 */
package cloudiac.impl;

import cloudiac.CloudProvider;
import cloudiac.CloudiacPackage;
import cloudiac.Infrastructure;
import cloudiac.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.impl.InfrastructureImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link cloudiac.impl.InfrastructureImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InfrastructureImpl extends MinimalEObjectImpl.Container implements Infrastructure {
	/**
	 * The default value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected static final CloudProvider CLOUD_PROVIDER_EDEFAULT = CloudProvider.AWS;

	/**
	 * The cached value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected CloudProvider cloudProvider = CLOUD_PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiacPackage.Literals.INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudProvider getCloudProvider() {
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudProvider(CloudProvider newCloudProvider) {
		CloudProvider oldCloudProvider = cloudProvider;
		cloudProvider = newCloudProvider == null ? CLOUD_PROVIDER_EDEFAULT : newCloudProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.INFRASTRUCTURE__CLOUD_PROVIDER,
					oldCloudProvider, cloudProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this,
					CloudiacPackage.INFRASTRUCTURE__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CloudiacPackage.INFRASTRUCTURE__RESOURCE:
			return ((InternalEList<?>) getResource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CloudiacPackage.INFRASTRUCTURE__CLOUD_PROVIDER:
			return getCloudProvider();
		case CloudiacPackage.INFRASTRUCTURE__RESOURCE:
			return getResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CloudiacPackage.INFRASTRUCTURE__CLOUD_PROVIDER:
			setCloudProvider((CloudProvider) newValue);
			return;
		case CloudiacPackage.INFRASTRUCTURE__RESOURCE:
			getResource().clear();
			getResource().addAll((Collection<? extends Resource>) newValue);
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
		case CloudiacPackage.INFRASTRUCTURE__CLOUD_PROVIDER:
			setCloudProvider(CLOUD_PROVIDER_EDEFAULT);
			return;
		case CloudiacPackage.INFRASTRUCTURE__RESOURCE:
			getResource().clear();
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
		case CloudiacPackage.INFRASTRUCTURE__CLOUD_PROVIDER:
			return cloudProvider != CLOUD_PROVIDER_EDEFAULT;
		case CloudiacPackage.INFRASTRUCTURE__RESOURCE:
			return resource != null && !resource.isEmpty();
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
		result.append(" (cloudProvider: ");
		result.append(cloudProvider);
		result.append(')');
		return result.toString();
	}

} //InfrastructureImpl
