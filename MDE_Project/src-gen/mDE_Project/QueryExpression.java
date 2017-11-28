/**
 */
package mDE_Project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDE_Project.QueryExpression#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see mDE_Project.MDE_ProjectPackage#getQueryExpression()
 * @model abstract="true"
 * @generated
 */
public interface QueryExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Keyword)
	 * @see mDE_Project.MDE_ProjectPackage#getQueryExpression_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Keyword getSpecification();

	/**
	 * Sets the value of the '{@link mDE_Project.QueryExpression#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Keyword value);

} // QueryExpression
