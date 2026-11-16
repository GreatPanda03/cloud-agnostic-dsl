/**
 */
package cloudiac.impl;

import cloudiac.CloudiacPackage;
import cloudiac.ComputeInstance;
import cloudiac.Subnet;
import cloudiac.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.impl.VPCImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloudiac.impl.VPCImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link cloudiac.impl.VPCImpl#getComputeinstance <em>Computeinstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPCImpl extends MinimalEObjectImpl.Container implements VPC {
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
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnet;

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
	protected VPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiacPackage.Literals.VPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.VPC__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnet() {
		if (subnet == null) {
			subnet = new EObjectContainmentEList<Subnet>(Subnet.class, this, CloudiacPackage.VPC__SUBNET);
		}
		return subnet;
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
					CloudiacPackage.VPC__COMPUTEINSTANCE);
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
		case CloudiacPackage.VPC__SUBNET:
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
		case CloudiacPackage.VPC__CIDR:
			return getCidr();
		case CloudiacPackage.VPC__SUBNET:
			return getSubnet();
		case CloudiacPackage.VPC__COMPUTEINSTANCE:
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
		case CloudiacPackage.VPC__CIDR:
			setCidr((String) newValue);
			return;
		case CloudiacPackage.VPC__SUBNET:
			getSubnet().clear();
			getSubnet().addAll((Collection<? extends Subnet>) newValue);
			return;
		case CloudiacPackage.VPC__COMPUTEINSTANCE:
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
		case CloudiacPackage.VPC__CIDR:
			setCidr(CIDR_EDEFAULT);
			return;
		case CloudiacPackage.VPC__SUBNET:
			getSubnet().clear();
			return;
		case CloudiacPackage.VPC__COMPUTEINSTANCE:
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
		case CloudiacPackage.VPC__CIDR:
			return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
		case CloudiacPackage.VPC__SUBNET:
			return subnet != null && !subnet.isEmpty();
		case CloudiacPackage.VPC__COMPUTEINSTANCE:
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

} //VPCImpl
