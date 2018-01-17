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
	static Hashtable attributeValue , attributeValueM , attributeValueD,attributeValueL;
	static EObject object , objRelated ;
	static String Container , ref;
	static int count=0;
	static EAttribute eAttChosen;
	static Object value ;
	
	
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
	
	public static void saveResource(){
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

	 
	 
	 public static void ModifyEclass(Hashtable h) {
		    
		
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
			for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
				object =(EObject) ai.next();
				EClass eClass =object.eClass();

				if (eClass.getName().equals(h.get("type"))) {
					if (object.eContainer() != null) {
						Container = object.eContainer().eClass().getName();
					}
					EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
					if (h.get("name").equals(object.eGet(Name)))
					{
						result="Exists";
						break;
					}
					else { 
						result="NotExists";
					}
				}
			}	
			return result;
	}
	 
	 public String ExistFromName(Hashtable h) {
		 String result="";
		 for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
				object =(EObject) ai.next();
				EClass eClass =object.eClass();
				EAttribute Name = (EAttribute) eClass.getEStructuralFeature("name");
				if(h.get("name").equals(object.eGet(Name))) {
					result="Exists";
					break;
				}
				else {
					result="NotExists";
				}
			}
		 return result;
	 }
	 
	 public String ExistEattribute(Hashtable h) {
		 String result="";
		 EClass eclass= object.eClass();
			EList<EAttribute> eAttributes = eclass.getEAttributes();
			 for (EAttribute eAttribute : eAttributes) { 
			         if ((h.get("name")).equals(eAttribute.getName())) {
			        	 result="Exists";
			        	 
			        	 eAttChosen=eAttribute;
						 break;
			         }
			         else {
			        	 result="NotExists";
			         }
		    }
		 return result;
	 }
	 public void Converter(Object object,String string){
			if(object instanceof String) {
				value = new String(string);
			}
			else if (object instanceof Integer) {
				value =new Integer (string) ;
			}
			else if (object instanceof Double) {
				value = new Double(string);
			}
			else if (object instanceof Long) {
				value = new Long(string);
			}
			else if (object instanceof Short) {
				value = new Short(string);
			}
			else if (object instanceof Boolean) {
				value = new Boolean(string);
			}
			else if (object instanceof Long) {
				value = new Long(string);
			}
	}
	 public void ParseTargetEMF(EObject Root ) {
		 EList<EObject> AllExpression =Root.eContents();
		 for (EObject  oneExpression : AllExpression) {
			 String nameExpression= name(oneExpression);
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
				attributeValue = HashtableAllAttribute(keyword);
				//case 1.1 : Eclass
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					AddElement_Attribut(attributeValue);
					
					if(ExistEclass(attributeValue) == "Exists") {
						
					EList<EObject> listE = keyword.eContents();
					  if ( listE != null) {
						  for (EObject eatt : listE) {
							  		attributeValueL = HashtableAllAttribute(eatt);
									Hashtable e = new Hashtable();
									e.put("name",attributeValueL.get("type"));
									if(ExistEattribute(e)=="NotExists") {
										System.out.println("#####################  "+e.get("name")+"  Doesn't exists , No changes made #######################");
									}
									else {
											EAttribute att = (EAttribute) object.eClass().getEStructuralFeature(eAttChosen.getName());
											String va=(String) attributeValueL.get("name");
											//obj might be null 
											
											Object obj =object.eGet((EStructuralFeature)att);
										
											if (obj == null) {
												
												obj = att.getEAttributeType().getName();
												
											}
											
											//Convert the value given by the user in the specific type of the attribute 
											Converter(obj,va);
											
											object.eSet(att, value);
											saveResource();

									}
							
						  }
						  }
					  }		
					  saveResource();
					//Add the object in the  target model
					//Check if the object doesn't exist in the target model
					
				}
				//case 1.2 : Eattribute
				else if (nameKeyword.equals("Eattribute")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Add the object in the target model
					//Check if the object doesn't exist in the target model
					Hashtable ecl = new Hashtable();
					ecl.put("name",attributeValue.get("from"));
					
					if(ExistFromName(ecl)=="NotExists") {
						System.out.println("#####################  "+ecl.get("name")+"  Doesn't exists , No changes made #######################");
					}
					else {
						//System.out.println(object.eClass().getEAllAttributes());
						//System.out.println(object.eClass().getEAttributes());
						//What is the difference between getEAllAttributes() , getEAttributes()
						
						Hashtable ec = new Hashtable();
						ec.put("name",attributeValue.get("type"));
						if(ExistEattribute(ec)=="NotExists") {
							System.out.println("#####################  "+ec.get("name")+"  Doesn't exists , No changes made #######################");
						}
						else {
							
								EAttribute att = (EAttribute) object.eClass().getEStructuralFeature(eAttChosen.getName());
								String va=(String) attributeValue.get("name");
								//obj might be null 
								
								Object obj =object.eGet((EStructuralFeature)att);
							
								if (obj == null) {
									obj = att.getEAttributeType().getName();
									
								}
								
								//Convert the value given by the user in the specific type of the attribute 
								Converter(obj,va);
								
								object.eSet(att, value);
								saveResource();

						}
				}
				}
			}
			//case 2 : Modifying
			else if (nameQueryExpression.equals("Modify")) {
				System.out.println("----------------------------------- " + " Start Operation ' "+ nameQueryExpression +" ' -----------------------------------");
				
				//Get all the attributes of "Modify"  and their values 
				//GetAllAttribute(oneQueryExpression);
				
				attributeValueM = new Hashtable();

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
				
				if(nameKeyword.equals("Eclass")) {
					
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
				     if(ExistEclass(attributeValueM) == "NotExists") {
				    	 System.out.println("#####################  "+attributeValueM.get("name")+"  Doesn't exists , No changes made #######################");
						}
					else {
							if ((attributeValueM.get("relatedTo")) == "nul") {
								ModifyEclass(attributeValueM);
								saveResource();
							}
							else {
								Hashtable related = new Hashtable();
								related.put("name",attributeValueM.get("relatedTo"));
								if (GetMetaType(related) == null ) {
									System.out.println("#####################  "+related.get("name")+"  Doesn't exists , No changes made #######################");
								}
								else {
									related.put("type",GetMetaType(related));
									if (Container == (related.get("type")) ) {
										GetObjectFromContainer();
										ModifyEclass(attributeValueM);
										saveResource();
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
					//System.out.println(attributeValueM);
					Hashtable ecl = new Hashtable();
					ecl.put("name",attributeValueM.get("from"));
					if(ExistFromName(ecl)=="NotExists") {
						System.out.println("#####################  "+ecl.get("name")+"  Doesn't exists , No changes made #######################");
					}
					else {
						//System.out.println(object.eClass().getEAllAttributes());
						//System.out.println(object.eClass().getEAttributes());
						//What is the difference between getEAllAttributes() , getEAttributes()
						if(ExistEattribute(attributeValueM)=="NotExists") {
							System.out.println("#####################  "+attributeValueM.get("name")+"  Doesn't exists , No changes made #######################");
						}
						else {
							
							if( (attributeValueM.get("newValueName")=="nul") && (attributeValueM.get("newValueType")=="nul")) {
								
								System.out.println("##################### No changes made #######################");
							}
							else {
								
								EAttribute att = (EAttribute) object.eClass().getEStructuralFeature(eAttChosen.getName());
								String va=(String) attributeValueM.get("newValueName");
								
								Object obj = object.eGet((EStructuralFeature)att);
								
								//Convert the value given by the user in the specific type of the attribute 
								 Converter(obj,va);
								 
								object.eSet(att, value);
								saveResource();
							}
						}
					}	
				}
				
			}
			//case 3 : Deleting
			else if (nameQueryExpression.equals("Delete")) {
				System.out.println("-----------------------------------" + " Start Operation ' "+ nameQueryExpression +" ' -----------------------------------");
				
				attributeValueD = HashtableAllAttribute(keyword);
				if(nameKeyword.equals("Eclass")) {
					//Get all the attributes of the keyword and their values
					//GetAllAttribute(keyword);
					//Delete the object in the  target model
					//Check if the object exists in the target model
					if(ExistEclass(attributeValueD) == "NotExists") {
						System.out.println("#####################  "+attributeValueD.get("name")+"  Doesn't exists , No changes made #######################");
					}
					else {
						//DeleteEclass(attributeValueD);
						if((attributeValueD.get("relatedTo")) == null) {
							EcoreUtil.delete(object, true);
							saveResource();
						}
						else {
							Hashtable related = new Hashtable();
							
							related.put("name",attributeValueD.get("relatedTo"));
							if (GetMetaType(related) == null ) {
								System.out.println("##################### "+related.get("name")+" Doesn't exists , No changes made #######################");
							}
							else {
								related.put("type",GetMetaType(related));
								
								if (Container == (related.get("type")) ) {
									 ChangeEcontents();
									 if (count==0) {
										  System.out.println("##################### The "+ object.eClass().getName() + " " +object.eGet( object.eClass().getEStructuralFeature("name"))+" Doesn't exists in  "+objRelated.eClass().getName()+ " " +objRelated.eGet( objRelated.eClass().getEStructuralFeature("name"))+ ", No changes made #######################");
									  }
									  else {
										  saveResource();
									  }
								}
								else {
									System.out.println("##################### Review your request : "+ related.get("type") +"  doesn't contain  "+attributeValueD.get("type")+ ", No changes made #######################");
								}
								
							}
						}		
						
					}
				}
				else if (nameKeyword.equals("Eattribute")) {
					//Test if the Object "from" exists in the target model
					Hashtable ecl = new Hashtable();
					ecl.put("name",attributeValueD.get("from"));
					if(ExistFromName(ecl)=="NotExists") {
						System.out.println("#####################  "+ecl.get("name")+"  Doesn't exists , No changes made #######################");
					}
					else {
						//Test if the Attribute exists in the Current object ("from")
						if(ExistEattribute(attributeValueD)=="NotExists") {
							System.out.println("#####################  "+attributeValueD.get("name")+"  Doesn't exists , No changes made #######################");
						}
						else {
							EAttribute att = (EAttribute) object.eClass().getEStructuralFeature(eAttChosen.getName());
							object.eUnset(att);
							saveResource();
						}
						
					}
				
					//Delete the object in the  target model
					//Check if the object exists in the target model
				}
				
			}
		}
		System.out.println("-----------------------------------End Parsing---------------------------------------");
	}
	
	public static void ChangeEcontents() {
		
		EList<EObject> l = objRelated.eContents();
		List<EObject> newl = new ArrayList<EObject>() ;	
		GetRef();
		for(EObject el : l ) {
			    EClass c =object.eClass();
			    EAttribute Name = (EAttribute) c.getEStructuralFeature("name");
					if ( attributeValueD.get("name").equals(el.eGet(Name) )) {count=1;}
					else {newl.add(el);}		
		}
		EReference cont = (EReference) objRelated.eClass().getEStructuralFeature(ref);//name
		objRelated.eSet(cont, newl);
	}
	
	public static void GetRef() {
		EList<EReference> eReferences = objRelated.eClass().getEReferences();
        for (EReference eReference : eReferences) {
        	 if(eReference.getEType().getName().equals(attributeValueD.get("type"))) {
        		 ref=eReference.getName();
    		 }
         }
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
	

	public static void GetObjectFromContainer() {
		
		EList<EObject> l = objRelated.eContents();
		
		  for(EObject el : l ) {
			    EClass c =object.eClass();
				EAttribute Name = (EAttribute) c.getEStructuralFeature("name");
					if ( attributeValueM.get("name").equals(el.eGet(Name) )) {
						if (!(el.equals(object))) {object=el;}
					}
			    }  
	}
	
	
	public List<String> Ref(String T) {
		 EList<EClassifier> eClassifiers = MMePackage.getEClassifiers();
		 List<String> ListeRef = new ArrayList<String>();
		 for (EClassifier eClassifier : eClassifiers) {
			 EClass eClass = (EClass) eClassifier;
			 EList<EReference> eReferences = eClass.getEReferences();
             for (EReference eReference : eReferences) {
                 if(eReference.getEType().getName().equals(T)) {
                	 ListeRef.add(eClass.getName());
                	 ListeRef.add(eReference.getName());
                	 
                 }
             }
         }return ListeRef;
	}
	
	//liste des tables dans une database
		 public List<EObject> Liste_contenu_object(EClass eClass,Hashtable h,EObject objInstance,EObject object){
			 List<EObject> contList = new ArrayList<EObject>();
			 EList<EAttribute> eAttributes = eClass.getEAttributes();
				for (EAttribute eAttribute : eAttributes) {
					if(eAttribute.getName().equals("name")) {
					EAttribute eName = (EAttribute) eClass.getEStructuralFeature( eAttribute.getName());
					objInstance.eSet(eName, h.get("name"));
					}
				}
				List<EObject> List = object.eContents();
				for(EObject one : List) {
				
					contList.add(one);
				}
				return contList;
			 
		 }
		 
		//add table in database
		 public void Add_Object(String nameRef,EClass eClass,Hashtable h,EObject objInstance,EReference cont) {
			 List<EObject> contList = new ArrayList<EObject>();
			 for(Iterator<EObject> ai= MResource.getAllContents(); ai.hasNext(); ) {
	 			EObject object =(EObject) ai.next();
	 			EClass eclass =object.eClass();
	 				if(eclass.getName().equals(nameRef)) {
			    			for(Iterator<EAttribute> iter= eclass.getEAllAttributes().iterator(); iter.hasNext(); ) {
			    				EAttribute attribute =iter.next();
			    				if(attribute.getName().equals("name")) {
			    					if( object.eGet(attribute).equals(h.get("relatedTo"))) {
											contList=Liste_contenu_object(eClass,h,objInstance,object);
											EList<EAttribute> eAttributes = eClass.getEAttributes();
											int c =0;
											for(EObject l : contList) {
												EClass eclas =l.eClass();
												for(Iterator<EAttribute> it= eclas.getEAllAttributes().iterator(); it.hasNext(); ) {
													EAttribute attribut =it.next();
													if( attribut.getName().equals("name")) {
													if((l.eGet(attribut)).equals(h.get("name"))) {
															c=c+1;
													}
													}
												}
												
											}
											if(c!=0) {
												System.out.println("----------ERROR--------");
											}
											else {
											contList.add(objInstance);
										    object.eSet(cont, contList);
											}
											
											//object.eUnset(cont);
			    					}
			    			}
			    			}
	 				}
	     	}
		 }
		 
		 
		//AddElement +listvalue
		 //nameeclass==type
		 public void AddElement_Attribut(Hashtable h) {
			 EList<EClassifier> eClassifiers = MMePackage.getEClassifiers();
			    for (EClassifier eClassifier : eClassifiers) {
			    	if (eClassifier.getName().equals(h.get("type"))) {
			        	if (eClassifier instanceof EClass) {
			        		EClass eClass = (EClass) eClassifier;
			        		
			        		if(eClass.getName().equals(eClassifiers.get(0).getName())) {
			        			EObject databasenstance = MMePackage.getEFactoryInstance().create(
							            eClass);
					            EList<EAttribute> eAttributes = eClass.getEAttributes();
					            for (EAttribute eAttribute : eAttributes) {
					            	EAttribute eName = (EAttribute) eClass.getEStructuralFeature(eAttribute.getName());
					            	
					            	String value = (String) h.get(eAttribute.getName());
					            	databasenstance.eSet(eName, value);
					        }MResource.getContents().add(databasenstance);
			        			
			        		}
			        		else {
			        		String name =(String) h.get("type");//name==Table || name = column
			        		String nameRef = Ref(name).get(0);//nameRef==Database || nameref= table
			        		if(Ref(name) != null) {
			        			
			        			if(Ref(nameRef) != null) {
					            
			        				EClass parent = (EClass) MMePackage.getEClassifier(nameRef);
			        				EReference ref = (EReference) parent.getEStructuralFeature(Ref(name).get(1));//name ereference==contC
			        				EObject objInstance = MMePackage.getEFactoryInstance().create(eClass);
			        			    Add_Object(nameRef,eClass,h,objInstance,ref);
			        			}      		
			        			 
			        			
			        			else {
			        				EClass parent = (EClass) MMePackage.getEClassifier(nameRef);
						            EReference ref = (EReference) parent.getEStructuralFeature(Ref(name).get(1));//name ereference
						            EObject objInstance = MMePackage.getEFactoryInstance().create(eClass);
						            Add_Object(nameRef,eClass,h,objInstance,ref);
			        			}
					            
			        		}
			        		
			        		}}}}
		 
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
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

