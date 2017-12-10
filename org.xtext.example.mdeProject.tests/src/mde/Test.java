package mde;

import com.google.inject.Guice;
import com.google.inject.Injector;

import mDE_Project.MDE_ProjectPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	static Hashtable attributeValue , attributeValueM , attributeValueD;
	static EObject object , objRelated ;
	static String Container , ref;
	
	
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
	    String nameChangeRoot= name(ChangeRoot);
	    //GetAllAttribute(ChangeRoot);
	    /*
	    for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
			EObject v =(EObject) ai.next();
			System.out.println(v);
	    }
	    */
	    return ChangeRoot;
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
		try {
			//Load Metamodel and model 
			loadMetaModel(metamodelChange);
			loadModel(modelChange);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveResource(){
		try{
			MResource.save(null);
			System.out.println("Après sauvegarde de la resource");
		}
		catch (IOException e){
			System.err.println("Erreur lors de la sauvegarde de la resource");
			e.printStackTrace();
		}
	}
	
	/*
	 *  -----------------------------------------------------------------------------------------------------------------------------------------------------
	 */
	
	// take an object and return the name of its metaclass
	public static  String name(EObject object) {
		EClass metaClass =object.eClass();
		String nameMeta= metaClass.getName();
		return nameMeta;
	}
	
	//Print all the value of the attributes of the object in argument
		public void GetAllAttribute(EObject object) {
			EClass metaClass =object.eClass();
			EList<EAttribute> nameMm= metaClass.getEAllAttributes();
			// we can eliminate this part of for and add it in add function and return simply the Elist of attribute
			for (EAttribute  att : nameMm) {
					System.out.println("********"+att.getName()+" : "+object.eGet(att));	
			}
		}

	//Get all the value !null  of the attributes  of the object in argument
	public Hashtable HashtableAllAttribute(EObject object) {
		EClass metaClass =object.eClass();
		EList<EAttribute> nameMm= metaClass.getEAllAttributes();
		Hashtable ht = new Hashtable();
		for (EAttribute  att : nameMm) {
				if(object.eGet(att) == null){}
				else {
					ht.put(att.getName(),object.eGet(att));
				}
		}
		return ht;
	}
	
	//Get all the value of the attributes of the object in argument
	public Hashtable HashtableAllAttributeM(EObject object) {
		EClass metaClass =object.eClass();
		EList<EAttribute> nameMm= metaClass.getEAllAttributes();
		Hashtable ht = new Hashtable();
		for (EAttribute  att : nameMm) {
				if(object.eGet(att) == null){
					ht.put(att.getName(),"nul");
				}
				else {
					ht.put(att.getName(),object.eGet(att));
				}
		}
		return ht;
	}

	public EObject GetFirstContent(EObject object) {
		EObject keyword =object.eContents().get(0);
		return keyword;
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
	
	 //AddEclass
	 public void AddEclass(Hashtable hash) {
		 EList<EClassifier> eClassifiers = MMePackage.getEClassifiers();
		 String nameeclass=(String) hash.get("type");
	     
		    for (EClassifier eClassifier : eClassifiers) {
		        if (eClassifier.getName().equals(nameeclass)) {
		         if (eClassifier instanceof EClass) {
			            EClass eClass = (EClass) eClassifier;
			            EObject databasenstance = MMePackage.getEFactoryInstance().create(
					            eClass);
			            EList<EAttribute> eAttributes = eClass.getEAttributes();
			 for (EAttribute eAttribute : eAttributes) {
			         EAttribute eName = (EAttribute) eClass
			            			.getEStructuralFeature(eAttribute.getName());
			         String value=(String) hash.get(eAttribute.getName());
			         databasenstance.eSet(eName, value);
		    
		    }
			 MResource.getContents().add(databasenstance);
			 
			        }
		         
		        }
		    }
		    
	 }
	 
	 //AddEclass
	 public void DeleteEclass(Hashtable h) {
		 
		 for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
				EObject object =(EObject) ai.next();
				EClass eClass =object.eClass();
				
				if (eClass.getName().equals(h.get("type"))) {
					EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
					
					if (h.get("name").equals(object.eGet(Name)))
					{
						
					}
				}
			}		
	 }

	 
	 
	 public void ModifyEclass(Hashtable h) {
		    
		
				EClass eClass =object.eClass();
				
				if (eClass.getName().equals(h.get("type"))) {
					EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
					EAttribute Type = (EAttribute) eClass.getEStructuralFeature("type");
					
					if (h.get("name").equals(object.eGet(Name)))
					{
						if(h.get("newValueName")!="nul") {
							String value = (String) h.get("newValueName");
							object.eSet(Name, value);
					
						}
						if (h.get("newValueType")!="nul"){
							String value = (String) h.get("newValueType");
							object.eSet(Type, value);
						
						}
						
					}
				}
			}		
	
	 
	 public String ExistEclass(Hashtable h) {
		    String result="";
		    //System.out.println("Start ______________________________>");
			for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
				object =(EObject) ai.next();
				EClass eClass =object.eClass();
				
				
				
				if (eClass.getName().equals(h.get("type"))) {
					//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~"+eClass.getName());
					if (object.eContainer() != null) {
						Container = object.eContainer().eClass().getName();
					}
					EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
					//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~"+object.eGet(Name));
					if (h.get("name").equals(object.eGet(Name)))
					{
						result="Exists";
						break;
					}
					else { 
						result="NotExists";
					}
				}
				 //System.out.println("End ______________________________>");
			}	
			return result;
	}
	 
	 public void ParseTargetEMF(EObject Root ) {
		 EList<EObject> AllExpression =Root.eContents();
		 //System.out.println(AllExpression);
		 for (EObject  oneExpression : AllExpression) {
			 String nameExpression= name(oneExpression);
			 //System.out.println(HashtableAllAttribute(oneExpression));
		 }
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
				System.out.println("-----------------------------------" + " Start Operation ' "+ nameQueryExpression +" '-----------------------------------");
				
				//System.out.println("------------- " + nameKeyword +"   ----------");
				
				//case 1.1 : Eclass
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);	
					attributeValue = HashtableAllAttribute(keyword);
					
					//System.out.println(attributeValue);
					if(ExistEclass(attributeValue) == "NotExists") {
						AddEclass(attributeValue);
						saveResource();
						
					}
					else {
						System.out.println("##################### Already exists , No changes made  #######################");
					}
					
					//Add the object in the  target model
					//Check if the object doesn't exist in the target model
					
				}
				//case 1.2 : Eattribute
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Add the object in the target model
					//Check if the object doesn't exist in the target model
				}
			}
			//case 2 : Modifying
			else if (nameQueryExpression.equals("Modify")) {
				System.out.println("----------------------------------- " + " Start Operation ' "+ nameQueryExpression +" ' -----------------------------------");
				
				//Get all the attributes of "Modify"  and their values 
				//GetAllAttribute(oneQueryExpression);
				
				attributeValueM = new Hashtable();
				 
				//System.out.println("------------- " + nameKeyword +"   ----------");
				
				
				if(nameKeyword.equals("Eclass")) {
					
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					
					
					
					 Set<String> keySetQuery = new HashSet<String>();
					 keySetQuery.addAll((HashtableAllAttributeM(oneQueryExpression)).keySet());
				     Set<String> keySetEclass = new HashSet<String>();
				     keySetEclass.addAll((HashtableAllAttributeM(keyword)).keySet());
				     
				     
				     for (String key : keySetQuery) {
					     attributeValueM.put(key, (HashtableAllAttributeM(oneQueryExpression)).get(key));
				     }
				     
				     for (String key : keySetEclass) {
				    	 attributeValueM.put(key, (HashtableAllAttributeM(keyword)).get(key));
				     }
				    
				     if(ExistEclass(attributeValueM) == "NotExists") {
							System.out.println("##################### Doesn't exists , No changes made #######################");
						}
					else {
							if ((attributeValueM.get("relatedTo")) == "nul") {
								System.out.println("NUUUUULL");
								System.out.println(attributeValueM);
								ModifyEclass(attributeValueM);
								saveResource();
							}
							else {
								System.out.println("RELATED");
								Hashtable related = new Hashtable();
								related.put("name",attributeValueM.get("relatedTo"));
								if (GetMetaType(related) == null ) {
									
									System.out.println("##################### The object 'Related To' Doesn't exists , No changes made #######################");
									
								}
								else {
									related.put("type",GetMetaType(related));
									if (Container == (related.get("type")) ) {
										System.out.println("C'est bon ");
										System.out.println(object); // the target object 
										System.out.println(objRelated); // The object of related to 
										EList<EObject> l = objRelated.eContents();
										
										  for(EObject el : l ) {
											    EClass c =object.eClass();
												EAttribute Name = (EAttribute) c.getEStructuralFeature("name");
												System.out.println("_______________________"+el.eGet(Name));
												System.out.println((attributeValueM.get("name")));
													if ( attributeValueM.get("name").equals(el.eGet(Name) )) {
														if (!(el.equals(object))) {
															object=el;
														}
														
														ModifyEclass(attributeValueM);
														saveResource();
														
														
													}
													//Eclass c= (Eclass) el ;
											    }
											   
										
										
									}
									else {
										System.out.println("##################### Review your request : "+ related.get("type") +"  doesn't contain  "+attributeValueM.get("type")+ ", No changes made #######################");
									}
								}
								
							}
							
							
							
						}
					
					//Modify the object in the  target model
					//Check if the object exists in the target model
				}
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Modify the object in the  target model
					//Check if the object exists in the target model
				}
				
			}
			//case 3 : Deleting
			else if (nameQueryExpression.equals("Delete")) {
				System.out.println("-----------------------------------" + " Start Operation ' "+ nameQueryExpression +" ' -----------------------------------");
				

				System.out.println("-------------> " + nameKeyword +"    ---------->");
				
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Delete the object in the  target model
					//Check if the object exists in the target model
					
					attributeValueD = HashtableAllAttribute(keyword);
					System.out.println("-------------> " + attributeValueD +"    ---------->");
					//System.out.println(ExistEclass(attributeValueD) );
					if(ExistEclass(attributeValueD) == "NotExists") {
						System.out.println("##################### Doesn't exists , No changes made #######################");
					}
					else {
						//DeleteEclass(attributeValueD);
						if((attributeValueD.get("relatedTo")) == null) {
							EcoreUtil.delete(object, true);
							System.out.println("ooooooooooooooo"+object);
							saveResource();
						}
						else {
							System.out.println("ELSE OF ELSE ");
							Hashtable related = new Hashtable();
							
							related.put("name",attributeValueD.get("relatedTo"));
							System.out.println("-------------> " + related.get("name") +"    ---------->");
							if (GetMetaType(related) == null ) {
								
								System.out.println("##################### The object 'Related To' Doesn't exists , No changes made #######################");
								
							}
							else {
								related.put("type",GetMetaType(related));
								System.out.println("----++++++++++++++++-> " + Container +"    ---------->");
								
								if (Container == (related.get("type")) ) {
									System.out.println("----  C'EST BON ---------->");
									
									EList<EObject> l = objRelated.eContents();
									List<EObject> newl = new ArrayList<EObject>() ;
									
									EList<EReference> eReferences = objRelated.eClass().getEReferences();
						            for (EReference eReference : eReferences) {
						            	 System.out.println("~~~~~~~~~~éééé"+eReference);
						            	 if(eReference.getEType().getName().equals(attributeValueD.get("type"))) {
						            		 System.out.println("```````````````````"+eReference.getName());
						            		 ref=eReference.getName();
					            		 }
						             }
						            
									  for(EObject el : l ) {
										    EClass c =object.eClass();
											EAttribute Name = (EAttribute) c.getEStructuralFeature("name");
											System.out.println("_______________________"+el.eGet(Name));
											System.out.println((attributeValueD.get("name")));
												if ( attributeValueD.get("name").equals(el.eGet(Name) )) {
													System.out.println("Exiiiiiiiiiiiiiiiist");
													//saveResource();
												}
												else {
													newl.add(el);
												}
												//Eclass c= (Eclass) el ;
										 }
									  System.out.println("*******************-----------------"+newl);
									  EReference cont = (EReference) objRelated.eClass().getEStructuralFeature(ref);//name
									  objRelated.eSet(cont, newl);
									  saveResource();
							            		
									  //objRelated.eSet(feature, newValue);
									// wach hadik la table kayna f had la basedonnee
									/*
									EStructuralFeature containingFeature = object.eContainingFeature();
									System.out.println("ooooooooooooooo"+object);
									System.out.println("------------------"+containingFeature.getFeatureID());
									System.out.println("ooooooooooooooo"+containingFeature.getName());
									System.out.println(""+objRelated);
									
									List <EObject> lst = objRelated.eContents();
									for (EObject o : lst) {
										System.out.println("+++++++++++++"+o.eContainingFeature());
									}
									objRelated.eUnset(containingFeature);	
									//saveResource();
									  */
									
									
									
									 
								}
								else {
									System.out.println("##################### Review your request : "+ related.get("type") +"  doesn't contain  "+attributeValueD.get("type")+ ", No changes made #######################");
								}
								
							}
							
							
							
						}
						
						
					}
					
					
					
				
				}
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Delete the object in the  target model
					//Check if the object exists in the target model
				}
				
			}
		}
		System.out.println("-----------------------------------End Parsing---------------------------------------");
	}
	
	public static String GetMetaType (Hashtable h ) {
		String Type = null;
		
		 for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
				objRelated =(EObject) ai.next();
				//System.out.println("obj test "+objRelated);
				EClass eClass =objRelated.eClass();	
				EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
					if (h.get("name").equals(objRelated.eGet(Name))) {
						Type=eClass.getName();
						break;
					}
			}	
		return Type;
	}
	
	
	private void removeFromContainer(EObject object) {
		//EObject container = object.eContainer();
		if (objRelated != null) {
			
				System.out.println("eeeeeeeeeeeeeeeeelse"+object.eContainingFeature());
				objRelated.eUnset(object.eContainingFeature());
			
			// recurse (because the change description may not be processed for this operation)
			//onDelete(container, object.eContainingFeature(), object);
			
		}
	}

	
	
	public static void main(String[] args) {
	
		Test t = new Test();
		
		try {
			//Transform the xtext to emf 
			t.SaveEMF("file://////home/taddistafaf/Desktop/runtime-EclipseXtext/MDEProject/MDEtest.mde");
			
			//Get the full path of the Metamodel and model
			t.Path();
			
			//Load Target Metamodel and model 
			t.LoadTarget();
			
			//Parse the model of the changement and make the changes in the target model 
		    t.ParseEMF(modelRoot);
			
			//t.ParseTargetEMF(ChangeRoot);
			
			//System.out.println("--------------------------------------------test"+EOBJECT.eContents());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

