/**
 */
package mDE_Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDE_Project.Modify#getNewValueName <em>New Value Name</em>}</li>
 *   <li>{@link mDE_Project.Modify#getNewValueType <em>New Value Type</em>}</li>
 * </ul>
 *
 * @see mDE_Project.MDE_ProjectPackage#getModify()
 * @model
 * @generated
 */
public interface Modify extends QueryExpression {
	/**
	 * Returns the value of the '<em><b>New Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value Name</em>' attribute.
	 * @see #setNewValueName(String)
	 * @see mDE_Project.MDE_ProjectPackage#getModify_NewValueName()
	 * @model
	 * @generated
	 */
	String getNewValueName();

	/**
	 * Sets the value of the '{@link mDE_Project.Modify#getNewValueName <em>New Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value Name</em>' attribute.
	 * @see #getNewValueName()
	 * @generated
	 */
	void setNewValueName(String value);

	/**
	 * Returns the value of the '<em><b>New Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value Type</em>' attribute.
	 * @see #setNewValueType(String)
	 * @see mDE_Project.MDE_ProjectPackage#getModify_NewValueType()
	 * @model
	 * @generated
	 */
	String getNewValueType();

	/**
	 * Sets the value of the '{@link mDE_Project.Modify#getNewValueType <em>New Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value Type</em>' attribute.
	 * @see #getNewValueType()
	 * @generated
	 */
	void setNewValueType(String value);

} // Modify
