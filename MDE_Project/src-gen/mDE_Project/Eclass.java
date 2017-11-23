/**
 */
package mDE_Project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDE_Project.Eclass#getColumns <em>Columns</em>}</li>
 *   <li>{@link mDE_Project.Eclass#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link mDE_Project.Eclass#getBoundEclass <em>Bound Eclass</em>}</li>
 *   <li>{@link mDE_Project.Eclass#getBoundRelatedTo <em>Bound Related To</em>}</li>
 *   <li>{@link mDE_Project.Eclass#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link mDE_Project.Eclass#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mDE_Project.MDE_ProjectPackage#getEclass()
 * @model
 * @generated
 */
public interface Eclass extends Keyword {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link mDE_Project.Eattribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Eattribute> getColumns();

	/**
	 * Returns the value of the '<em><b>Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' attribute.
	 * @see #setRelatedTo(String)
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_RelatedTo()
	 * @model
	 * @generated
	 */
	String getRelatedTo();

	/**
	 * Sets the value of the '{@link mDE_Project.Eclass#getRelatedTo <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' attribute.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(String value);

	/**
	 * Returns the value of the '<em><b>Bound Eclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Eclass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Eclass</em>' attribute.
	 * @see #setBoundEclass(String)
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_BoundEclass()
	 * @model
	 * @generated
	 */
	String getBoundEclass();

	/**
	 * Sets the value of the '{@link mDE_Project.Eclass#getBoundEclass <em>Bound Eclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Eclass</em>' attribute.
	 * @see #getBoundEclass()
	 * @generated
	 */
	void setBoundEclass(String value);

	/**
	 * Returns the value of the '<em><b>Bound Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Related To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Related To</em>' attribute.
	 * @see #setBoundRelatedTo(String)
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_BoundRelatedTo()
	 * @model
	 * @generated
	 */
	String getBoundRelatedTo();

	/**
	 * Sets the value of the '{@link mDE_Project.Eclass#getBoundRelatedTo <em>Bound Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Related To</em>' attribute.
	 * @see #getBoundRelatedTo()
	 * @generated
	 */
	void setBoundRelatedTo(String value);

	/**
	 * Returns the value of the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Relation</em>' attribute.
	 * @see #setTypeRelation(String)
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_TypeRelation()
	 * @model
	 * @generated
	 */
	String getTypeRelation();

	/**
	 * Sets the value of the '{@link mDE_Project.Eclass#getTypeRelation <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Relation</em>' attribute.
	 * @see #getTypeRelation()
	 * @generated
	 */
	void setTypeRelation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mDE_Project.MDE_ProjectPackage#getEclass_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mDE_Project.Eclass#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Eclass
