/**
 */
package cloudiac.impl;

import cloudiac.CloudiacPackage;
import cloudiac.DnsRecord;
import cloudiac.Network;
import cloudiac.Subnet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link cloudiac.impl.NetworkImpl#getDnsrecord <em>Dnsrecord</em>}</li>
 *   <li>{@link cloudiac.impl.NetworkImpl#getSubnet <em>Subnet</em>}</li>
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
	 * The cached value of the '{@link #getDnsrecord() <em>Dnsrecord</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsrecord()
	 * @generated
	 * @ordered
	 */
	protected EList<DnsRecord> dnsrecord;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnet;

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
	public EList<DnsRecord> getDnsrecord() {
		if (dnsrecord == null) {
			dnsrecord = new EObjectContainmentEList<DnsRecord>(DnsRecord.class, this,
					CloudiacPackage.NETWORK__DNSRECORD);
		}
		return dnsrecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnet() {
		if (subnet == null) {
			subnet = new EObjectContainmentEList<Subnet>(Subnet.class, this, CloudiacPackage.NETWORK__SUBNET);
		}
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CloudiacPackage.NETWORK__DNSRECORD:
			return ((InternalEList<?>) getDnsrecord()).basicRemove(otherEnd, msgs);
		case CloudiacPackage.NETWORK__SUBNET:
			return ((InternalEList<?>) getSubnet()).basicRemove(otherEnd, msgs);
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
		case CloudiacPackage.NETWORK__DNSRECORD:
			return getDnsrecord();
		case CloudiacPackage.NETWORK__SUBNET:
			return getSubnet();
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
		case CloudiacPackage.NETWORK__DNSRECORD:
			getDnsrecord().clear();
			getDnsrecord().addAll((Collection<? extends DnsRecord>) newValue);
			return;
		case CloudiacPackage.NETWORK__SUBNET:
			getSubnet().clear();
			getSubnet().addAll((Collection<? extends Subnet>) newValue);
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
		case CloudiacPackage.NETWORK__DNSRECORD:
			getDnsrecord().clear();
			return;
		case CloudiacPackage.NETWORK__SUBNET:
			getSubnet().clear();
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
		case CloudiacPackage.NETWORK__DNSRECORD:
			return dnsrecord != null && !dnsrecord.isEmpty();
		case CloudiacPackage.NETWORK__SUBNET:
			return subnet != null && !subnet.isEmpty();
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
