/**
 */
package mDE_Project.impl;

import mDE_Project.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDE_ProjectFactoryImpl extends EFactoryImpl implements MDE_ProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDE_ProjectFactory init() {
		try {
			MDE_ProjectFactory theMDE_ProjectFactory = (MDE_ProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(MDE_ProjectPackage.eNS_URI);
			if (theMDE_ProjectFactory != null) {
				return theMDE_ProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDE_ProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDE_ProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MDE_ProjectPackage.LOAD:
			return createLoad();
		case MDE_ProjectPackage.ADD:
			return createAdd();
		case MDE_ProjectPackage.DELETE:
			return createDelete();
		case MDE_ProjectPackage.MODIFY:
			return createModify();
		case MDE_ProjectPackage.ECLASS:
			return createEclass();
		case MDE_ProjectPackage.EATTRIBUTE:
			return createEattribute();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modify createModify() {
		ModifyImpl modify = new ModifyImpl();
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclass createEclass() {
		EclassImpl eclass = new EclassImpl();
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eattribute createEattribute() {
		EattributeImpl eattribute = new EattributeImpl();
		return eattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDE_ProjectPackage getMDE_ProjectPackage() {
		return (MDE_ProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDE_ProjectPackage getPackage() {
		return MDE_ProjectPackage.eINSTANCE;
	}

} //MDE_ProjectFactoryImpl
