/**
 */
package mDE_Project.impl;

import java.util.Collection;

import mDE_Project.Eattribute;
import mDE_Project.Eclass;
import mDE_Project.MDE_ProjectPackage;

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
 * An implementation of the model object '<em><b>Eclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDE_Project.impl.EclassImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link mDE_Project.impl.EclassImpl#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link mDE_Project.impl.EclassImpl#getBoundEclass <em>Bound Eclass</em>}</li>
 *   <li>{@link mDE_Project.impl.EclassImpl#getBoundRelatedTo <em>Bound Related To</em>}</li>
 *   <li>{@link mDE_Project.impl.EclassImpl#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link mDE_Project.impl.EclassImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclassImpl extends KeywordImpl implements Eclass {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Eattribute> columns;

	/**
	 * The default value of the '{@link #getRelatedTo() <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected String relatedTo = RELATED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundEclass() <em>Bound Eclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundEclass()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_ECLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundEclass() <em>Bound Eclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundEclass()
	 * @generated
	 * @ordered
	 */
	protected String boundEclass = BOUND_ECLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundRelatedTo() <em>Bound Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_RELATED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundRelatedTo() <em>Bound Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected String boundRelatedTo = BOUND_RELATED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_RELATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected String typeRelation = TYPE_RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDE_ProjectPackage.Literals.ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eattribute> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Eattribute>(Eattribute.class, this,
					MDE_ProjectPackage.ECLASS__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedTo(String newRelatedTo) {
		String oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.ECLASS__RELATED_TO, oldRelatedTo,
					relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundEclass() {
		return boundEclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundEclass(String newBoundEclass) {
		String oldBoundEclass = boundEclass;
		boundEclass = newBoundEclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.ECLASS__BOUND_ECLASS,
					oldBoundEclass, boundEclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundRelatedTo() {
		return boundRelatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundRelatedTo(String newBoundRelatedTo) {
		String oldBoundRelatedTo = boundRelatedTo;
		boundRelatedTo = newBoundRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.ECLASS__BOUND_RELATED_TO,
					oldBoundRelatedTo, boundRelatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeRelation() {
		return typeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRelation(String newTypeRelation) {
		String oldTypeRelation = typeRelation;
		typeRelation = newTypeRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.ECLASS__TYPE_RELATION,
					oldTypeRelation, typeRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDE_ProjectPackage.ECLASS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MDE_ProjectPackage.ECLASS__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
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
		case MDE_ProjectPackage.ECLASS__COLUMNS:
			return getColumns();
		case MDE_ProjectPackage.ECLASS__RELATED_TO:
			return getRelatedTo();
		case MDE_ProjectPackage.ECLASS__BOUND_ECLASS:
			return getBoundEclass();
		case MDE_ProjectPackage.ECLASS__BOUND_RELATED_TO:
			return getBoundRelatedTo();
		case MDE_ProjectPackage.ECLASS__TYPE_RELATION:
			return getTypeRelation();
		case MDE_ProjectPackage.ECLASS__TYPE:
			return getType();
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
		case MDE_ProjectPackage.ECLASS__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends Eattribute>) newValue);
			return;
		case MDE_ProjectPackage.ECLASS__RELATED_TO:
			setRelatedTo((String) newValue);
			return;
		case MDE_ProjectPackage.ECLASS__BOUND_ECLASS:
			setBoundEclass((String) newValue);
			return;
		case MDE_ProjectPackage.ECLASS__BOUND_RELATED_TO:
			setBoundRelatedTo((String) newValue);
			return;
		case MDE_ProjectPackage.ECLASS__TYPE_RELATION:
			setTypeRelation((String) newValue);
			return;
		case MDE_ProjectPackage.ECLASS__TYPE:
			setType((String) newValue);
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
		case MDE_ProjectPackage.ECLASS__COLUMNS:
			getColumns().clear();
			return;
		case MDE_ProjectPackage.ECLASS__RELATED_TO:
			setRelatedTo(RELATED_TO_EDEFAULT);
			return;
		case MDE_ProjectPackage.ECLASS__BOUND_ECLASS:
			setBoundEclass(BOUND_ECLASS_EDEFAULT);
			return;
		case MDE_ProjectPackage.ECLASS__BOUND_RELATED_TO:
			setBoundRelatedTo(BOUND_RELATED_TO_EDEFAULT);
			return;
		case MDE_ProjectPackage.ECLASS__TYPE_RELATION:
			setTypeRelation(TYPE_RELATION_EDEFAULT);
			return;
		case MDE_ProjectPackage.ECLASS__TYPE:
			setType(TYPE_EDEFAULT);
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
		case MDE_ProjectPackage.ECLASS__COLUMNS:
			return columns != null && !columns.isEmpty();
		case MDE_ProjectPackage.ECLASS__RELATED_TO:
			return RELATED_TO_EDEFAULT == null ? relatedTo != null : !RELATED_TO_EDEFAULT.equals(relatedTo);
		case MDE_ProjectPackage.ECLASS__BOUND_ECLASS:
			return BOUND_ECLASS_EDEFAULT == null ? boundEclass != null : !BOUND_ECLASS_EDEFAULT.equals(boundEclass);
		case MDE_ProjectPackage.ECLASS__BOUND_RELATED_TO:
			return BOUND_RELATED_TO_EDEFAULT == null ? boundRelatedTo != null
					: !BOUND_RELATED_TO_EDEFAULT.equals(boundRelatedTo);
		case MDE_ProjectPackage.ECLASS__TYPE_RELATION:
			return TYPE_RELATION_EDEFAULT == null ? typeRelation != null : !TYPE_RELATION_EDEFAULT.equals(typeRelation);
		case MDE_ProjectPackage.ECLASS__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (relatedTo: ");
		result.append(relatedTo);
		result.append(", boundEclass: ");
		result.append(boundEclass);
		result.append(", boundRelatedTo: ");
		result.append(boundRelatedTo);
		result.append(", typeRelation: ");
		result.append(typeRelation);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EclassImpl
