package mde;

import com.google.inject.Guice;
import com.google.inject.Injector;

import mDE_Project.MDE_ProjectPackage;

import java.io.File;
import java.io.FilenameFilter;
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
	static String metamodelChange,modelChange;
	
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
	
	//Get all the value of the attributes of the object in argument
	public void GetAllAttribute(EObject object) {
		
		EClass metaClass =object.eClass();
		EList<EAttribute> nameMm= metaClass.getEAllAttributes();
		// we can eliminate this part of for and add it in add function and return simply the Elist of attribute
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
	    ChangeRoot = MResource.getContents().get(0);
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
		
		modelRoot = resource.getContents().get(0);

		
		
	}
	/*
	 This function takes as argument an object that have  a single attribute name and return its value(string)
	 */
	public static String NameModels(EObject object) {
		EClass metaClass =object.eClass();
		EAttribute nameMm= metaClass.getEAllAttributes().get(0);
		String name = (String) object.eGet(nameMm);
		return name;
		
	}
	
	//Make a list for errors to print it later 
	public void ParseEMF(EObject Root ) {
			//Get all the QueryExpressions
			EList<EObject> AllQueryExpression =Root.eContents();
		
			System.out.println("-----------------------------------Start Parsing---------------------------------------");
		for (EObject  oneQueryExpression : AllQueryExpression) {
			//Get the name of the current QueryExpression(ADD,MODIFY,DELETE)
			String nameQueryExpression= name(oneQueryExpression);
			
			//Get the keyword(ECLASS,EATTRIBUTE)
			EObject keyword =GetFirstContent(oneQueryExpression);
			
			//Get the name of the keyword
			String nameKeyword= name(keyword);
			
			//Get all the attributes of the keyword and their values
			//take the comment off if we made this function return a Elist 
			//GetAllAttribute(keyword);
			
			//case 1 : Adding
			if (nameQueryExpression.equals("Add")) {
				System.out.println("######  " + " Start Operation ' "+ nameQueryExpression +" ' ###### ");
				
				System.out.println("------------- " + nameKeyword +"   ----------");
				
				//case 1.1 : Eclass
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Add the object in the  target model
					//Check if the object doesn't exist in the target model
					
				}
				//case 1.2 : Eattribute
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Add the object in the target model
					//Check if the object doesn't exist in the target model
				}
			}
			//case 2 : Modifying
			else if (nameQueryExpression.equals("Modify")) {
				System.out.println("######  " + " Start Operation ' "+ nameQueryExpression +" ' ###### ");
				
				//Get all the attributes of "Modify"  and their values 
				GetAllAttribute(oneQueryExpression);
				
			
				System.out.println("------------- " + nameKeyword +"   ----------");
				
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Modify the object in the  target model
					//Check if the object exists in the target model
				}
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Modify the object in the  target model
					//Check if the object exists in the target model
				}
				
			}
			//case 3 : Deleting
			else if (nameQueryExpression.equals("Delete")) {
				System.out.println("######  " + " Start Operation ' "+ nameQueryExpression +" ' ###### ");
				

				System.out.println("-------------> " + nameKeyword +"    ---------->");
				
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Delete the object in the  target model
					//Check if the object exists in the target model
				
				}
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					GetAllAttribute(keyword);
					//Delete the object in the  target model
					//Check if the object exists in the target model
				}
				
			}
		}
		System.out.println("-----------------------------------End Parsing---------------------------------------");
	}
	
	public void Path() {
		// Getting the path of the project 
		File file = new File(System.getProperty("user.dir"));
		String parentPath = file.getAbsoluteFile().getParent();
		String fullPath = "file://////"+ parentPath+"/META/"+NameModels(modelRoot);
		
		/*
		 *  Failed test
		 *  Test if fullPath-NameModels(modelRoot) exists 
		 *  
		 */
		
		//Setting the full path of the Metamodel and model
		metamodelChange= fullPath +".ecore";
		modelChange= fullPath +".model";
	}
	
	public void LoadTarget() {
		//Load Metamodel and model 
		loadMetaModel(metamodelChange);
		loadModel(modelChange);
		
	}
	
	public static void main(String[] args) {
	
		Test t = new Test();
		
		try {
			//Transform the wtext to emf 
			t.SaveEMF("file://////home/taddistafaf/runtime-EclipseXtext/MDETest/MDEtest.mde");
			
			//Get the full path of the Metamodel and model
			t.Path();
			
			//Load Target Metamodel and model 
			t.LoadTarget();
			
			//Parse the model of the changement and make the changes in the target model 
			t.ParseEMF(modelRoot);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
