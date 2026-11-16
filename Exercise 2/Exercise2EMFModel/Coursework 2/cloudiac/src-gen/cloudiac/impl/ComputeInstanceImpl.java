/**
 */
package cloudiac.impl;

import cloudiac.CloudiacPackage;
import cloudiac.ComputeInstance;
import cloudiac.InstanceType;
import cloudiac.OSImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiac.impl.ComputeInstanceImpl#getCPU <em>CPU</em>}</li>
 *   <li>{@link cloudiac.impl.ComputeInstanceImpl#getMemoryGB <em>Memory GB</em>}</li>
 *   <li>{@link cloudiac.impl.ComputeInstanceImpl#getOsImage <em>Os Image</em>}</li>
 *   <li>{@link cloudiac.impl.ComputeInstanceImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeInstanceImpl extends ResourceImpl implements ComputeInstance {
	/**
	 * The default value of the '{@link #getCPU() <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCPU() <em>CPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU()
	 * @generated
	 * @ordered
	 */
	protected int cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryGB() <em>Memory GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGB()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryGB() <em>Memory GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGB()
	 * @generated
	 * @ordered
	 */
	protected int memoryGB = MEMORY_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsImage() <em>Os Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsImage()
	 * @generated
	 * @ordered
	 */
	protected static final OSImage OS_IMAGE_EDEFAULT = OSImage.UBUNTU;

	/**
	 * The cached value of the '{@link #getOsImage() <em>Os Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsImage()
	 * @generated
	 * @ordered
	 */
	protected OSImage osImage = OS_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceType INSTANCE_TYPE_EDEFAULT = InstanceType.SMALL;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected InstanceType instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiacPackage.Literals.COMPUTE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCPU() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCPU(int newCPU) {
		int oldCPU = cpu;
		cpu = newCPU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.COMPUTE_INSTANCE__CPU, oldCPU, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemoryGB() {
		return memoryGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryGB(int newMemoryGB) {
		int oldMemoryGB = memoryGB;
		memoryGB = newMemoryGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.COMPUTE_INSTANCE__MEMORY_GB,
					oldMemoryGB, memoryGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSImage getOsImage() {
		return osImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsImage(OSImage newOsImage) {
		OSImage oldOsImage = osImage;
		osImage = newOsImage == null ? OS_IMAGE_EDEFAULT : newOsImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.COMPUTE_INSTANCE__OS_IMAGE,
					oldOsImage, osImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceType getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceType(InstanceType newInstanceType) {
		InstanceType oldInstanceType = instanceType;
		instanceType = newInstanceType == null ? INSTANCE_TYPE_EDEFAULT : newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiacPackage.COMPUTE_INSTANCE__INSTANCE_TYPE,
					oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CloudiacPackage.COMPUTE_INSTANCE__CPU:
			return getCPU();
		case CloudiacPackage.COMPUTE_INSTANCE__MEMORY_GB:
			return getMemoryGB();
		case CloudiacPackage.COMPUTE_INSTANCE__OS_IMAGE:
			return getOsImage();
		case CloudiacPackage.COMPUTE_INSTANCE__INSTANCE_TYPE:
			return getInstanceType();
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
		case CloudiacPackage.COMPUTE_INSTANCE__CPU:
			setCPU((Integer) newValue);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__MEMORY_GB:
			setMemoryGB((Integer) newValue);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__OS_IMAGE:
			setOsImage((OSImage) newValue);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__INSTANCE_TYPE:
			setInstanceType((InstanceType) newValue);
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
		case CloudiacPackage.COMPUTE_INSTANCE__CPU:
			setCPU(CPU_EDEFAULT);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__MEMORY_GB:
			setMemoryGB(MEMORY_GB_EDEFAULT);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__OS_IMAGE:
			setOsImage(OS_IMAGE_EDEFAULT);
			return;
		case CloudiacPackage.COMPUTE_INSTANCE__INSTANCE_TYPE:
			setInstanceType(INSTANCE_TYPE_EDEFAULT);
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
		case CloudiacPackage.COMPUTE_INSTANCE__CPU:
			return cpu != CPU_EDEFAULT;
		case CloudiacPackage.COMPUTE_INSTANCE__MEMORY_GB:
			return memoryGB != MEMORY_GB_EDEFAULT;
		case CloudiacPackage.COMPUTE_INSTANCE__OS_IMAGE:
			return osImage != OS_IMAGE_EDEFAULT;
		case CloudiacPackage.COMPUTE_INSTANCE__INSTANCE_TYPE:
			return instanceType != INSTANCE_TYPE_EDEFAULT;
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
		result.append(" (CPU: ");
		result.append(cpu);
		result.append(", memoryGB: ");
		result.append(memoryGB);
		result.append(", osImage: ");
		result.append(osImage);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(')');
		return result.toString();
	}

} //ComputeInstanceImpl
