package mde;

import com.google.inject.Guice;
import com.google.inject.Injector;

import mDE_Project.MDE_ProjectPackage;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mdeProject.MDEProjectRuntimeModule;
import org.xtext.example.mdeProject.MDEProjectStandaloneSetup;

public class Test {
	
	EObject MMracine;
	static EPackage MMePackage;
	static Resource MMResource, MResource ;
	static EObject modelRoot ,ChangeRoot;
	
	public void loadMetaModel(String uri) {
		//Declaration de la ressource 
		ResourceSet resourceSet = new ResourceSetImpl();
		//Obtention des informations
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
		//Changement de la resource 
		MMResource = resourceSet.getResource(URI.createURI(uri), true);
		
		MMracine = MMResource.getContents().get(0);
		MMePackage = (EPackage) MMracine;
		
	}
	
	public static  String name(EObject object) {
		
		EClass metaClass =object.eClass();
		String nameMeta= metaClass.getName();
		return nameMeta;
	}
	
	public void GetAllAttribute(EObject object) {
		
		EClass metaClass =object.eClass();
		EList<EAttribute> nameMm= metaClass.getEAllAttributes();
		for (EAttribute  att : nameMm) {
				System.out.println("********"+att.getName()+" : "+object.eGet(att));
		}
	}

	public  EObject loadModel(String uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	
		// register the package of our ecore metamodel in the registry list of packages in our resource set
		String nsUri = MMePackage.getNsURI();
		resourceSet.getPackageRegistry().put(nsUri,MMePackage);
		//load our model
	    Resource load_resource = resourceSet.getResource(URI.createURI(uri),true);
	    MResource = load_resource;
	    EObject ChangeRoot = MResource.getContents().get(0);
	    System.out.println("------------> TRansformation Model ------------>");
	    
	    System.out.println("------------>"+ChangeRoot);
	    String nameChangeRoot= name(ChangeRoot);
	    System.out.println("------------>" + nameChangeRoot);
	    GetAllAttribute(ChangeRoot);
	    System.out.println("------------> TRansformation Model ------------>");
	    return ChangeRoot;
	}
	
	
	
	
	
	
	public EObject GetFirstContent(EObject object) {
		EObject keyword =object.eContents().get(0);
		return keyword;
	}
	
	
	public void SaveEMF(String uri) throws IOException  {
		
		MDE_ProjectPackage.eINSTANCE.eClass();
		
		URI emfURI = URI.createURI(uri);
		//XXXStandaloneSetup est une classe crée pendant la génération des aretfacts Xtext.
		Injector injector1 = new MDEProjectStandaloneSetup().createInjectorAndDoEMFRegistration();
		Resource resource = null;
		//XXXRuntimeModule()est une classe crée pendant la génération des aretfacts Xtext.
		Injector injector2 = Guice.createInjector(new MDEProjectRuntimeModule());
		
		XtextResourceSet resourceSet2 = injector1.getInstance(XtextResourceSet.class);
		resourceSet2.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		
		resource = resourceSet2.getResource(emfURI, true);
		// Resource récupéré de Xtext
		EcoreUtil.resolveAll(resource);
		
		EObject modelRoot = resource.getContents().get(0);
		
		//String nameRoot= name(modelRoot);
		//System.out.println("------------->" + nameRoot);
		System.out.println("------------->"+NameModels(modelRoot));
		
		ParseEMF(modelRoot);
		
	}
	
	public static String NameModels(EObject object) {
		EClass metaClass =object.eClass();
		EAttribute nameMm= metaClass.getEAllAttributes().get(0);
		String name = (String) object.eGet(nameMm);
		return name;
		
	}
	
	
	public void ParseEMF(EObject Root ) {
			EList<EObject> AllQueryExpression =Root.eContents();
		
		for (EObject  oneQueryExpression : AllQueryExpression) {
			String nameQueryExpression= name(oneQueryExpression);
			
			
			if (nameQueryExpression.equals("Add")) {
				System.out.println("-------------> " + "Start Operation  "+ nameQueryExpression +"    ---------->");
				EObject keyword =GetFirstContent(oneQueryExpression);
				
				
				String nameKeyword= name(keyword);
				System.out.println("-------------> " + nameKeyword +"    ---------->");
				
				if(nameKeyword.equals("Eclass")) {
					
					GetAllAttribute(keyword);
				
				}
				else if (nameKeyword.equals("Eattribute")) {
					GetAllAttribute(keyword);
					
				}
				
				
			}
			else if (nameQueryExpression.equals("Modify")) {
				System.out.println("-------------> " + "Start Operation  "+ nameQueryExpression +" ------------->");
				GetAllAttribute(oneQueryExpression);
				
				EObject keyword =GetFirstContent(oneQueryExpression);
				
				
				String nameKeyword= name(keyword);
				
				
				System.out.println("-------------> " + nameKeyword +"    ---------->");
				
				if(nameKeyword.equals("Eclass")) {
					
					GetAllAttribute(keyword);
				
				}
				else if (nameKeyword.equals("Eattribute")) {
					GetAllAttribute(keyword);
					
				}
				
			}
			else if (nameQueryExpression.equals("Delete")) {
				System.out.println("-------------> " + "Start Operation  "+ nameQueryExpression +" ------------->");
				
				EObject keyword =GetFirstContent(oneQueryExpression);
				
				
				String nameKeyword= name(keyword);
				System.out.println("-------------> " + nameKeyword +"    ---------->");
				
				if(nameKeyword.equals("Eclass")) {
					
					GetAllAttribute(keyword);
				
				}
				else if (nameKeyword.equals("Eattribute")) {
					GetAllAttribute(keyword);
					
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
	
		Test t = new Test();
		
		try {
			t.SaveEMF("file://////home/taddistafaf/runtime-EclipseXtext/MDETest/MDEtest.mde");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*
		t.loadMetaModel("file://////home/taddistafaf/Desktop/MDE_Project-master/META/SQL.ecore");
		t.loadModel("file://////home/taddistafaf/Desktop/MDE_Project-master/META/SQL.model");

		t.loadMetaModel("file://////home/taddistafaf/MDE_Project/META/SQL.ecore");
		t.loadModel("file://////home/taddistafaf/MDE_Project/META/SQL.model");
*/
		
		
		System.out.println("99999999999999999999"+ChangeRoot);
		//String metamodelChange= "file://////home/taddistafaf/MDE_Project/META/"+NameModels(modelRoot)+".ecore";
		//String modelChange= "file://////home/taddistafaf/MDE_Project/META/"+NameModels(modelRoot)+".model";
		//t.loadMetaModel(metamodelChange);
		//t.loadModel(modelChange)
		// doesnt work dont know why it return null 
		//System.out.println("bbbb"+modelRoot);
		
		//doesn't work 
		//System.out.println("------------->"+NameModels(modelRoot));
		//System.out.println("------------->"+modelRoot);
		
		
		
		
	}
}
