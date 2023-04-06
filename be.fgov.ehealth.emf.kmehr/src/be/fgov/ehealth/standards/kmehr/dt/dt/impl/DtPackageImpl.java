/**
 */
package be.fgov.ehealth.standards.kmehr.dt.dt.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import be.fgov.ehealth.standards.kmehr.cd.cd.impl.CdPackageImpl;

import be.fgov.ehealth.standards.kmehr.dt.dt.DtFactory;
import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage;
import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.dt.dt.util.DtValidator;

import be.fgov.ehealth.standards.kmehr.id.id.IdPackage;

import be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2001._04.xmlenc.XmlencPackage;

import org.w3._2001._04.xmlenc.impl.XmlencPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtPackageImpl extends EPackageImpl implements DtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DtPackageImpl() {
		super(eNS_URI, DtFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DtPackage init() {
		if (isInited) return (DtPackage)EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DtPackageImpl theDtPackage = registeredDtPackage instanceof DtPackageImpl ? (DtPackageImpl)registeredDtPackage : new DtPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlencPackage.eNS_URI);
		XmlencPackageImpl theXmlencPackage = (XmlencPackageImpl)(registeredPackage instanceof XmlencPackageImpl ? registeredPackage : XmlencPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(registeredPackage instanceof XmldsigPackageImpl ? registeredPackage : XmldsigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KmehrPackage.eNS_URI);
		KmehrPackageImpl theKmehrPackage = (KmehrPackageImpl)(registeredPackage instanceof KmehrPackageImpl ? registeredPackage : KmehrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);
		IdPackageImpl theIdPackage = (IdPackageImpl)(registeredPackage instanceof IdPackageImpl ? registeredPackage : IdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);
		CdPackageImpl theCdPackage = (CdPackageImpl)(registeredPackage instanceof CdPackageImpl ? registeredPackage : CdPackage.eINSTANCE);

		// Load packages
		theCdPackage.loadPackage();

		// Create package meta-data objects
		theDtPackage.createPackageContents();
		theXmlencPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theKmehrPackage.createPackageContents();
		theIdPackage.createPackageContents();

		// Initialize created meta-data
		theDtPackage.initializePackageContents();
		theXmlencPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theKmehrPackage.initializePackageContents();
		theIdPackage.initializePackageContents();

		// Fix loaded packages
		theCdPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDtPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DtPackage.eNS_URI, theDtPackage);
		return theDtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextType_Value() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextType_L() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTime() {
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DtFactory getDtFactory() {
		return (DtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		textTypeEClass = createEClass(TEXT_TYPE);
		createEAttribute(textTypeEClass, TEXT_TYPE__VALUE);
		createEAttribute(textTypeEClass, TEXT_TYPE__L);

		// Create data types
		dateEDataType = createEDataType(DATE);
		timeEDataType = createEDataType(TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_L(), theXMLTypePackage.getLanguage(), "l", null, 1, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(dateEDataType, XMLGregorianCalendar.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeEDataType, XMLGregorianCalendar.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n "
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (dateEDataType,
		   source,
		   new String[] {
			   "name", "date",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#date",
			   "maxInclusive", "9999-12-31",
			   "minInclusive", "1901-01-01",
			   "pattern", "((000[1-9])|(00[1-9][0-9])|(0[1-9][0-9]{2})|([1-9][0-9]{3}))-((0[1-9])|(1[012]))-((0[1-9])|([12][0-9])|(3[01]))"
		   });
		addAnnotation
		  (textTypeEClass,
		   source,
		   new String[] {
			   "name", "textType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTextType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTextType_L(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "L"
		   });
		addAnnotation
		  (timeEDataType,
		   source,
		   new String[] {
			   "name", "time",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#time",
			   "minInclusive", "00:00:00",
			   "maxInclusive", "23:59:59",
			   "pattern", "(([01][0-9])|(2[0-3]))(:[0-5][0-9]){2}(\\.[0-9]+)?"
		   });
	}

} //DtPackageImpl
