/**
 */
package cloudiac.impl;

import cloudiac.CloudiacPackage;
import cloudiac.ComputeInstance;
import cloudiac.HostedZone;
import cloudiac.Network;
import cloudiac.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.impl.NetworkImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudiac.impl.NetworkImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloudiac.impl.NetworkImpl#getHostedzone <em>Hostedzone</em>}</li>
 *   <li>{@link cloudiac.impl.NetworkImpl#getComputeinstance <em>Computeinstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends ResourceImpl implements Network {
	/**
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected EList<VPC> vpc;

	/**
	 * The cached value of the '{@link #getHostedzone() <em>Hostedzone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedzone()
	 * @generated
	 * @ordered
	 */
	protected EList<HostedZone> hostedzone;

	/**
	 * The cached value of the '{@link #getComputeinstance() <em>Computeinstance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputeInstance> computeinstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiacPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.NETWORK__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VPC> getVpc() {
		if (vpc == null) {
			vpc = new EObjectContainmentEList<VPC>(VPC.class, this, CloudiacPackage.NETWORK__VPC);
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HostedZone> getHostedzone() {
		if (hostedzone == null) {
			hostedzone = new EObjectContainmentEList<HostedZone>(HostedZone.class, this,
					CloudiacPackage.NETWORK__HOSTEDZONE);
		}
		return hostedzone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputeInstance> getComputeinstance() {
		if (computeinstance == null) {
			computeinstance = new EObjectResolvingEList<ComputeInstance>(ComputeInstance.class, this,
					CloudiacPackage.NETWORK__COMPUTEINSTANCE);
		}
		return computeinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CloudiacPackage.NETWORK__VPC:
			return ((InternalEList<?>) getVpc()).basicRemove(otherEnd, msgs);
		case CloudiacPackage.NETWORK__HOSTEDZONE:
			return ((InternalEList<?>) getHostedzone()).basicRemove(otherEnd, msgs);
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
		case CloudiacPackage.NETWORK__CIDR:
			return getCidr();
		case CloudiacPackage.NETWORK__VPC:
			return getVpc();
		case CloudiacPackage.NETWORK__HOSTEDZONE:
			return getHostedzone();
		case CloudiacPackage.NETWORK__COMPUTEINSTANCE:
			return getComputeinstance();
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
		case CloudiacPackage.NETWORK__CIDR:
			setCidr((String) newValue);
			return;
		case CloudiacPackage.NETWORK__VPC:
			getVpc().clear();
			getVpc().addAll((Collection<? extends VPC>) newValue);
			return;
		case CloudiacPackage.NETWORK__HOSTEDZONE:
			getHostedzone().clear();
			getHostedzone().addAll((Collection<? extends HostedZone>) newValue);
			return;
		case CloudiacPackage.NETWORK__COMPUTEINSTANCE:
			getComputeinstance().clear();
			getComputeinstance().addAll((Collection<? extends ComputeInstance>) newValue);
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
		case CloudiacPackage.NETWORK__CIDR:
			setCidr(CIDR_EDEFAULT);
			return;
		case CloudiacPackage.NETWORK__VPC:
			getVpc().clear();
			return;
		case CloudiacPackage.NETWORK__HOSTEDZONE:
			getHostedzone().clear();
			return;
		case CloudiacPackage.NETWORK__COMPUTEINSTANCE:
			getComputeinstance().clear();
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
		case CloudiacPackage.NETWORK__CIDR:
			return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
		case CloudiacPackage.NETWORK__VPC:
			return vpc != null && !vpc.isEmpty();
		case CloudiacPackage.NETWORK__HOSTEDZONE:
			return hostedzone != null && !hostedzone.isEmpty();
		case CloudiacPackage.NETWORK__COMPUTEINSTANCE:
			return computeinstance != null && !computeinstance.isEmpty();
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
		result.append(" (cidr: ");
		result.append(cidr);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
