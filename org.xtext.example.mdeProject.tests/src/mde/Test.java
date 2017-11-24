package mde;

import com.google.inject.Guice;
import com.google.inject.Injector;

import mDE_Project.MDE_ProjectPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	
	
	public  Resource loadModel2(String uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	
		// register the package of our ecore metamodel in the registry list of packages in our resource set
		String nsUri = MMePackage.getNsURI();
		resourceSet.getPackageRegistry().put(nsUri,MMePackage);
		//load our model
	    Resource load_resource = resourceSet.getResource(URI.createURI(uri),true);
	    MResource = load_resource;
	    return MResource;
	}
	
	public  String name(EObject object) {
		
		EClass metaClass =object.eClass();
		String nameMeta= metaClass.getName();
		return nameMeta;
	}

	public void SaveEMF(String uri) {
		
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
		System.out.println("------------->" + modelRoot);
		
		EList<EObject> all =modelRoot.eContents();
		
		for (EObject  one : all) {
			String name= name(one);
			
			
			if (name.equals("Add")) {
				System.out.println("-------------> " + "Start Operation  "+ name +"    ---------->");
				EObject a =one.eContents().get(0);
				
				
				String namemeta= name(a);
				System.out.println("-------------> " + namemeta +"    ---------->");
				
				EClass metaClass =a.eClass();
				EList<EAttribute> nameMm= metaClass.getEAllAttributes();
				for (EAttribute  att : nameMm) {
						System.out.println("********"+att.getName()+" : "+a.eGet(att));
				}
			}
			else if (name.equals("Modify")) {
				System.out.println("-------------> " + "Start Operation  "+ name +" ------------->");
				
			}
			else if (name.equals("Delete")) {
				System.out.println("-------------> " + "Start Operation  "+ name +" ------------->");
				
			}
		}
		
		
		/*
		EList<EAttribute> attributes = eClass.getEAllAttributes();
		for (EAttribute att : attributes) {
			if( att.getName()!=null) {
                System.out.println(att.getName()+" : "+list.eGet(att));		
		}
		}
		
		*/
		
		
		// launch the APPoc interface
		

	}
	
	public static void main(String[] args) {
	
		Test p = new Test();
		p.loadMetaModel("file:///////home/taddistafaf/MDE_Project/MDE_Project/model/mDE_Project.ecore");
		
		p.SaveEMF("file://////home/taddistafaf/runtime-EclipseXtext/MDETest/MDEtest.mde");
		
	}
}
