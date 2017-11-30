/**
 */
package mDE_Project.impl;

import mDE_Project.MDE_ProjectPackage;
import mDE_Project.Modify;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDE_Project.impl.ModifyImpl#getNewValueName <em>New Value Name</em>}</li>
 *   <li>{@link mDE_Project.impl.ModifyImpl#getNewValueType <em>New Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyImpl extends QueryExpressionImpl implements Modify {
	/**
	 * The default value of the '{@link #getNewValueName() <em>New Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VALUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewValueName() <em>New Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueName()
	 * @generated
	 * @ordered
	 */
	protected String newValueName = NEW_VALUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValueType() <em>New Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewValueType() <em>New Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValueType()
	 * @generated
	 * @ordered
	 */
	protected String newValueType = NEW_VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDE_ProjectPackage.Literals.MODIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewValueName() {
		return newValueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValueName(String newNewValueName) {
		String oldNewValueName = newValueName;
		newValueName = newNewValueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.MODIFY__NEW_VALUE_NAME,
					oldNewValueName, newValueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewValueType() {
		return newValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValueType(String newNewValueType) {
		String oldNewValueType = newValueType;
		newValueType = newNewValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.MODIFY__NEW_VALUE_TYPE,
					oldNewValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_NAME:
			return getNewValueName();
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_TYPE:
			return getNewValueType();
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
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_NAME:
			setNewValueName((String) newValue);
			return;
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_TYPE:
			setNewValueType((String) newValue);
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
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_NAME:
			setNewValueName(NEW_VALUE_NAME_EDEFAULT);
			return;
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_TYPE:
			setNewValueType(NEW_VALUE_TYPE_EDEFAULT);
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
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_NAME:
			return NEW_VALUE_NAME_EDEFAULT == null ? newValueName != null
					: !NEW_VALUE_NAME_EDEFAULT.equals(newValueName);
		case MDE_ProjectPackage.MODIFY__NEW_VALUE_TYPE:
			return NEW_VALUE_TYPE_EDEFAULT == null ? newValueType != null
					: !NEW_VALUE_TYPE_EDEFAULT.equals(newValueType);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (newValueName: ");
		result.append(newValueName);
		result.append(", newValueType: ");
		result.append(newValueType);
		result.append(')');
		return result.toString();
	}

} //ModifyImpl
