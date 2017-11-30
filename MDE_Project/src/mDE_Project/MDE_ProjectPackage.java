/**
 */
package mDE_Project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mDE_Project.MDE_ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface MDE_ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mDE_Project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mDE_Project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mDE_Project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDE_ProjectPackage eINSTANCE = mDE_Project.impl.MDE_ProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link mDE_Project.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.LoadImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.QueryExpressionImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getQueryExpression()
	 * @generated
	 */
	int QUERY_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Query Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.AddImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__SPECIFICATION = QUERY_EXPRESSION__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = QUERY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = QUERY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.DeleteImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 3;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SPECIFICATION = QUERY_EXPRESSION__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = QUERY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = QUERY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.ModifyImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getModify()
	 * @generated
	 */
	int MODIFY = 4;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__SPECIFICATION = QUERY_EXPRESSION__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>New Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__NEW_VALUE_NAME = QUERY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__NEW_VALUE_TYPE = QUERY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FEATURE_COUNT = QUERY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_OPERATION_COUNT = QUERY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.KeywordImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.EclassImpl <em>Eclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.EclassImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getEclass()
	 * @generated
	 */
	int ECLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = KEYWORD__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__COLUMNS = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__RELATED_TO = KEYWORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Eclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__BOUND_ECLASS = KEYWORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bound Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__BOUND_RELATED_TO = KEYWORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__TYPE_RELATION = KEYWORD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__TYPE = KEYWORD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Eclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Eclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mDE_Project.impl.EattributeImpl <em>Eattribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDE_Project.impl.EattributeImpl
	 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getEattribute()
	 * @generated
	 */
	int EATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = KEYWORD__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__FROM = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TYPE = KEYWORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eattribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eattribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link mDE_Project.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see mDE_Project.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Load#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mDE_Project.Load#getName()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mDE_Project.Load#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see mDE_Project.Load#getActions()
	 * @see #getLoad()
	 * @generated
	 */
	EReference getLoad_Actions();

	/**
	 * Returns the meta object for class '{@link mDE_Project.QueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Expression</em>'.
	 * @see mDE_Project.QueryExpression
	 * @generated
	 */
	EClass getQueryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link mDE_Project.QueryExpression#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see mDE_Project.QueryExpression#getSpecification()
	 * @see #getQueryExpression()
	 * @generated
	 */
	EReference getQueryExpression_Specification();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see mDE_Project.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see mDE_Project.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see mDE_Project.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Modify#getNewValueName <em>New Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value Name</em>'.
	 * @see mDE_Project.Modify#getNewValueName()
	 * @see #getModify()
	 * @generated
	 */
	EAttribute getModify_NewValueName();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Modify#getNewValueType <em>New Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value Type</em>'.
	 * @see mDE_Project.Modify#getNewValueType()
	 * @see #getModify()
	 * @generated
	 */
	EAttribute getModify_NewValueType();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see mDE_Project.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Keyword#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mDE_Project.Keyword#getName()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Name();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Eclass <em>Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclass</em>'.
	 * @see mDE_Project.Eclass
	 * @generated
	 */
	EClass getEclass();

	/**
	 * Returns the meta object for the containment reference list '{@link mDE_Project.Eclass#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see mDE_Project.Eclass#getColumns()
	 * @see #getEclass()
	 * @generated
	 */
	EReference getEclass_Columns();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eclass#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related To</em>'.
	 * @see mDE_Project.Eclass#getRelatedTo()
	 * @see #getEclass()
	 * @generated
	 */
	EAttribute getEclass_RelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eclass#getBoundEclass <em>Bound Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Eclass</em>'.
	 * @see mDE_Project.Eclass#getBoundEclass()
	 * @see #getEclass()
	 * @generated
	 */
	EAttribute getEclass_BoundEclass();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eclass#getBoundRelatedTo <em>Bound Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Related To</em>'.
	 * @see mDE_Project.Eclass#getBoundRelatedTo()
	 * @see #getEclass()
	 * @generated
	 */
	EAttribute getEclass_BoundRelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eclass#getTypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Relation</em>'.
	 * @see mDE_Project.Eclass#getTypeRelation()
	 * @see #getEclass()
	 * @generated
	 */
	EAttribute getEclass_TypeRelation();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eclass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mDE_Project.Eclass#getType()
	 * @see #getEclass()
	 * @generated
	 */
	EAttribute getEclass_Type();

	/**
	 * Returns the meta object for class '{@link mDE_Project.Eattribute <em>Eattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eattribute</em>'.
	 * @see mDE_Project.Eattribute
	 * @generated
	 */
	EClass getEattribute();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eattribute#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see mDE_Project.Eattribute#getFrom()
	 * @see #getEattribute()
	 * @generated
	 */
	EAttribute getEattribute_From();

	/**
	 * Returns the meta object for the attribute '{@link mDE_Project.Eattribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mDE_Project.Eattribute#getType()
	 * @see #getEattribute()
	 * @generated
	 */
	EAttribute getEattribute_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDE_ProjectFactory getMDE_ProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mDE_Project.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.LoadImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__NAME = eINSTANCE.getLoad_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD__ACTIONS = eINSTANCE.getLoad_Actions();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.QueryExpressionImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getQueryExpression()
		 * @generated
		 */
		EClass QUERY_EXPRESSION = eINSTANCE.getQueryExpression();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_EXPRESSION__SPECIFICATION = eINSTANCE.getQueryExpression_Specification();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.AddImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.DeleteImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.ModifyImpl <em>Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.ModifyImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getModify()
		 * @generated
		 */
		EClass MODIFY = eINSTANCE.getModify();

		/**
		 * The meta object literal for the '<em><b>New Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY__NEW_VALUE_NAME = eINSTANCE.getModify_NewValueName();

		/**
		 * The meta object literal for the '<em><b>New Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY__NEW_VALUE_TYPE = eINSTANCE.getModify_NewValueType();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.KeywordImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__NAME = eINSTANCE.getKeyword_Name();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.EclassImpl <em>Eclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.EclassImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getEclass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEclass();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__COLUMNS = eINSTANCE.getEclass_Columns();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__RELATED_TO = eINSTANCE.getEclass_RelatedTo();

		/**
		 * The meta object literal for the '<em><b>Bound Eclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__BOUND_ECLASS = eINSTANCE.getEclass_BoundEclass();

		/**
		 * The meta object literal for the '<em><b>Bound Related To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__BOUND_RELATED_TO = eINSTANCE.getEclass_BoundRelatedTo();

		/**
		 * The meta object literal for the '<em><b>Type Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__TYPE_RELATION = eINSTANCE.getEclass_TypeRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__TYPE = eINSTANCE.getEclass_Type();

		/**
		 * The meta object literal for the '{@link mDE_Project.impl.EattributeImpl <em>Eattribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDE_Project.impl.EattributeImpl
		 * @see mDE_Project.impl.MDE_ProjectPackageImpl#getEattribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEattribute();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__FROM = eINSTANCE.getEattribute_From();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__TYPE = eINSTANCE.getEattribute_Type();

	}

} //MDE_ProjectPackage
