/**
 */
package be.fgov.ehealth.standards.kmehr.id.id.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import be.fgov.ehealth.standards.kmehr.cd.cd.impl.CdPackageImpl;

import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage;

import be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl;

import be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes;
import be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes;
import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes;
import be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes;
import be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes;
import be.fgov.ehealth.standards.kmehr.id.id.IdFactory;
import be.fgov.ehealth.standards.kmehr.id.id.IdPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public class IdPackageImpl extends EPackageImpl implements IdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idhcpartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idinsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idkmehrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idpatientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idprofessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inssEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idhcpartYschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idinsurancEschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idkmehRschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idpatienTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idprofessioNschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idhcpartYschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idinsurancEschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idkmehRschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idpatienTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idprofessioNschemesObjectEDataType = null;

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
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdPackageImpl() {
		super(eNS_URI, IdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdPackage init() {
		if (isInited) return (IdPackage)EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdPackageImpl theIdPackage = registeredIdPackage instanceof IdPackageImpl ? (IdPackageImpl)registeredIdPackage : new IdPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);
		CdPackageImpl theCdPackage = (CdPackageImpl)(registeredPackage instanceof CdPackageImpl ? registeredPackage : CdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);
		DtPackageImpl theDtPackage = (DtPackageImpl)(registeredPackage instanceof DtPackageImpl ? registeredPackage : DtPackage.eINSTANCE);

		// Load packages
		theCdPackage.loadPackage();

		// Create package meta-data objects
		theIdPackage.createPackageContents();
		theXmlencPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theKmehrPackage.createPackageContents();
		theDtPackage.createPackageContents();

		// Initialize created meta-data
		theIdPackage.initializePackageContents();
		theXmlencPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theKmehrPackage.initializePackageContents();
		theDtPackage.initializePackageContents();

		// Fix loaded packages
		theCdPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdPackage.eNS_URI, theIdPackage);
		return theIdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDHCPARTY() {
		return idhcpartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDHCPARTY_Value() {
		return (EAttribute)idhcpartyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDHCPARTY_S() {
		return (EAttribute)idhcpartyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDHCPARTY_SL() {
		return (EAttribute)idhcpartyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDHCPARTY_SV() {
		return (EAttribute)idhcpartyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDINSURANCE() {
		return idinsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDINSURANCE_Value() {
		return (EAttribute)idinsuranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDINSURANCE_S() {
		return (EAttribute)idinsuranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDINSURANCE_SL() {
		return (EAttribute)idinsuranceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDINSURANCE_SV() {
		return (EAttribute)idinsuranceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDKMEHR() {
		return idkmehrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDKMEHR_Value() {
		return (EAttribute)idkmehrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDKMEHR_S() {
		return (EAttribute)idkmehrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDKMEHR_SL() {
		return (EAttribute)idkmehrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDKMEHR_SV() {
		return (EAttribute)idkmehrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDPATIENT() {
		return idpatientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPATIENT_Value() {
		return (EAttribute)idpatientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPATIENT_S() {
		return (EAttribute)idpatientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPATIENT_SL() {
		return (EAttribute)idpatientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPATIENT_SV() {
		return (EAttribute)idpatientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDPROFESSION() {
		return idprofessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPROFESSION_Value() {
		return (EAttribute)idprofessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPROFESSION_S() {
		return (EAttribute)idprofessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPROFESSION_SL() {
		return (EAttribute)idprofessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDPROFESSION_SV() {
		return (EAttribute)idprofessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getINSS() {
		return inssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getINSS_Value() {
		return (EAttribute)inssEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getINSS_S() {
		return (EAttribute)inssEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getINSS_SL() {
		return (EAttribute)inssEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getINSS_SV() {
		return (EAttribute)inssEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIDHCPARTYschemes() {
		return idhcpartYschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIDINSURANCEschemes() {
		return idinsurancEschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIDKMEHRschemes() {
		return idkmehRschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIDPATIENTschemes() {
		return idpatienTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIDPROFESSIONschemes() {
		return idprofessioNschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIDHCPARTYschemesObject() {
		return idhcpartYschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIDINSURANCEschemesObject() {
		return idinsurancEschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIDKMEHRschemesObject() {
		return idkmehRschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIDPATIENTschemesObject() {
		return idpatienTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIDPROFESSIONschemesObject() {
		return idprofessioNschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdFactory getIdFactory() {
		return (IdFactory)getEFactoryInstance();
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
		idhcpartyEClass = createEClass(IDHCPARTY);
		createEAttribute(idhcpartyEClass, IDHCPARTY__VALUE);
		createEAttribute(idhcpartyEClass, IDHCPARTY__S);
		createEAttribute(idhcpartyEClass, IDHCPARTY__SL);
		createEAttribute(idhcpartyEClass, IDHCPARTY__SV);

		idinsuranceEClass = createEClass(IDINSURANCE);
		createEAttribute(idinsuranceEClass, IDINSURANCE__VALUE);
		createEAttribute(idinsuranceEClass, IDINSURANCE__S);
		createEAttribute(idinsuranceEClass, IDINSURANCE__SL);
		createEAttribute(idinsuranceEClass, IDINSURANCE__SV);

		idkmehrEClass = createEClass(IDKMEHR);
		createEAttribute(idkmehrEClass, IDKMEHR__VALUE);
		createEAttribute(idkmehrEClass, IDKMEHR__S);
		createEAttribute(idkmehrEClass, IDKMEHR__SL);
		createEAttribute(idkmehrEClass, IDKMEHR__SV);

		idpatientEClass = createEClass(IDPATIENT);
		createEAttribute(idpatientEClass, IDPATIENT__VALUE);
		createEAttribute(idpatientEClass, IDPATIENT__S);
		createEAttribute(idpatientEClass, IDPATIENT__SL);
		createEAttribute(idpatientEClass, IDPATIENT__SV);

		idprofessionEClass = createEClass(IDPROFESSION);
		createEAttribute(idprofessionEClass, IDPROFESSION__VALUE);
		createEAttribute(idprofessionEClass, IDPROFESSION__S);
		createEAttribute(idprofessionEClass, IDPROFESSION__SL);
		createEAttribute(idprofessionEClass, IDPROFESSION__SV);

		inssEClass = createEClass(INSS);
		createEAttribute(inssEClass, INSS__VALUE);
		createEAttribute(inssEClass, INSS__S);
		createEAttribute(inssEClass, INSS__SL);
		createEAttribute(inssEClass, INSS__SV);

		// Create enums
		idhcpartYschemesEEnum = createEEnum(IDHCPART_YSCHEMES);
		idinsurancEschemesEEnum = createEEnum(IDINSURANC_ESCHEMES);
		idkmehRschemesEEnum = createEEnum(IDKMEH_RSCHEMES);
		idpatienTschemesEEnum = createEEnum(IDPATIEN_TSCHEMES);
		idprofessioNschemesEEnum = createEEnum(IDPROFESSIO_NSCHEMES);

		// Create data types
		idhcpartYschemesObjectEDataType = createEDataType(IDHCPART_YSCHEMES_OBJECT);
		idinsurancEschemesObjectEDataType = createEDataType(IDINSURANC_ESCHEMES_OBJECT);
		idkmehRschemesObjectEDataType = createEDataType(IDKMEH_RSCHEMES_OBJECT);
		idpatienTschemesObjectEDataType = createEDataType(IDPATIEN_TSCHEMES_OBJECT);
		idprofessioNschemesObjectEDataType = createEDataType(IDPROFESSIO_NSCHEMES_OBJECT);
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
		initEClass(idhcpartyEClass, be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY.class, "IDHCPARTY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDHCPARTY_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDHCPARTY_S(), this.getIDHCPARTYschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDHCPARTY_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDHCPARTY_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idinsuranceEClass, be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE.class, "IDINSURANCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDINSURANCE_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDINSURANCE_S(), this.getIDINSURANCEschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDINSURANCE_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDINSURANCE_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idkmehrEClass, be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR.class, "IDKMEHR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDKMEHR_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDKMEHR_S(), this.getIDKMEHRschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDKMEHR_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDKMEHR_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idpatientEClass, be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT.class, "IDPATIENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDPATIENT_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPATIENT_S(), this.getIDPATIENTschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPATIENT_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPATIENT_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idprofessionEClass, be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION.class, "IDPROFESSION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDPROFESSION_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPROFESSION_S(), this.getIDPROFESSIONschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPROFESSION_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDPROFESSION_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inssEClass, be.fgov.ehealth.standards.kmehr.id.id.INSS.class, "INSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINSS_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.INSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINSS_S(), this.getIDPATIENTschemes(), "s", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.INSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINSS_SL(), theXMLTypePackage.getString(), "sL", null, 0, 1, be.fgov.ehealth.standards.kmehr.id.id.INSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINSS_SV(), theXMLTypePackage.getString(), "sV", null, 1, 1, be.fgov.ehealth.standards.kmehr.id.id.INSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(idhcpartYschemesEEnum, IDHCPARTYschemes.class, "IDHCPARTYschemes");
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDHCPARTY);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.INSS);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.LOCAL);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDENCRYPTIONAPPLICATION);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDENCRYPTIONACTOR);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDENCRYPTIONKEY);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDINSURANCE);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDCBE);
		addEEnumLiteral(idhcpartYschemesEEnum, IDHCPARTYschemes.IDEHP);

		initEEnum(idinsurancEschemesEEnum, IDINSURANCEschemes.class, "IDINSURANCEschemes");
		addEEnumLiteral(idinsurancEschemesEEnum, IDINSURANCEschemes.IDINSURANCE);
		addEEnumLiteral(idinsurancEschemesEEnum, IDINSURANCEschemes.LOCAL);

		initEEnum(idkmehRschemesEEnum, IDKMEHRschemes.class, "IDKMEHRschemes");
		addEEnumLiteral(idkmehRschemesEEnum, IDKMEHRschemes.IDKMEHR);
		addEEnumLiteral(idkmehRschemesEEnum, IDKMEHRschemes.IDIBAN);
		addEEnumLiteral(idkmehRschemesEEnum, IDKMEHRschemes.IDSERIALNO);
		addEEnumLiteral(idkmehRschemesEEnum, IDKMEHRschemes.LOCAL);
		addEEnumLiteral(idkmehRschemesEEnum, IDKMEHRschemes.IDCBE);

		initEEnum(idpatienTschemesEEnum, IDPATIENTschemes.class, "IDPATIENTschemes");
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.IDPATIENT);
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.INSS);
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.EIDCARDNO);
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.SISCARDNO);
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.ISICARDNO);
		addEEnumLiteral(idpatienTschemesEEnum, IDPATIENTschemes.LOCAL);

		initEEnum(idprofessioNschemesEEnum, IDPROFESSIONschemes.class, "IDPROFESSIONschemes");
		addEEnumLiteral(idprofessioNschemesEEnum, IDPROFESSIONschemes.IDMEDEX);
		addEEnumLiteral(idprofessioNschemesEEnum, IDPROFESSIONschemes.IDCBE);

		// Initialize data types
		initEDataType(idhcpartYschemesObjectEDataType, IDHCPARTYschemes.class, "IDHCPARTYschemesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idinsurancEschemesObjectEDataType, IDINSURANCEschemes.class, "IDINSURANCEschemesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idkmehRschemesObjectEDataType, IDKMEHRschemes.class, "IDKMEHRschemesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idpatienTschemesObjectEDataType, IDPATIENTschemes.class, "IDPATIENTschemesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idprofessioNschemesObjectEDataType, IDPROFESSIONschemes.class, "IDPROFESSIONschemesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (idhcpartyEClass,
		   source,
		   new String[] {
			   "name", "ID-HCPARTY",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDHCPARTY_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDHCPARTY_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getIDHCPARTY_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getIDHCPARTY_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
		addAnnotation
		  (idhcpartYschemesEEnum,
		   source,
		   new String[] {
			   "name", "ID-HCPARTYschemes"
		   });
		addAnnotation
		  (idhcpartYschemesObjectEDataType,
		   source,
		   new String[] {
			   "name", "ID-HCPARTYschemes:Object",
			   "baseType", "ID-HCPARTYschemes"
		   });
		addAnnotation
		  (idinsuranceEClass,
		   source,
		   new String[] {
			   "name", "ID-INSURANCE",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDINSURANCE_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDINSURANCE_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getIDINSURANCE_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getIDINSURANCE_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
		addAnnotation
		  (idinsurancEschemesEEnum,
		   source,
		   new String[] {
			   "name", "ID-INSURANCEschemes"
		   });
		addAnnotation
		  (idinsurancEschemesObjectEDataType,
		   source,
		   new String[] {
			   "name", "ID-INSURANCEschemes:Object",
			   "baseType", "ID-INSURANCEschemes"
		   });
		addAnnotation
		  (idkmehrEClass,
		   source,
		   new String[] {
			   "name", "ID-KMEHR",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDKMEHR_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDKMEHR_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getIDKMEHR_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getIDKMEHR_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
		addAnnotation
		  (idkmehRschemesEEnum,
		   source,
		   new String[] {
			   "name", "ID-KMEHRschemes"
		   });
		addAnnotation
		  (idkmehRschemesObjectEDataType,
		   source,
		   new String[] {
			   "name", "ID-KMEHRschemes:Object",
			   "baseType", "ID-KMEHRschemes"
		   });
		addAnnotation
		  (idpatientEClass,
		   source,
		   new String[] {
			   "name", "ID-PATIENT",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDPATIENT_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDPATIENT_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getIDPATIENT_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getIDPATIENT_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
		addAnnotation
		  (idpatienTschemesEEnum,
		   source,
		   new String[] {
			   "name", "ID-PATIENTschemes"
		   });
		addAnnotation
		  (idpatienTschemesObjectEDataType,
		   source,
		   new String[] {
			   "name", "ID-PATIENTschemes:Object",
			   "baseType", "ID-PATIENTschemes"
		   });
		addAnnotation
		  (idprofessionEClass,
		   source,
		   new String[] {
			   "name", "ID-PROFESSION",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDPROFESSION_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIDPROFESSION_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getIDPROFESSION_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getIDPROFESSION_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
		addAnnotation
		  (idprofessioNschemesEEnum,
		   source,
		   new String[] {
			   "name", "ID-PROFESSIONschemes"
		   });
		addAnnotation
		  (idprofessioNschemesObjectEDataType,
		   source,
		   new String[] {
			   "name", "ID-PROFESSIONschemes:Object",
			   "baseType", "ID-PROFESSIONschemes"
		   });
		addAnnotation
		  (inssEClass,
		   source,
		   new String[] {
			   "name", "INSS",
			   "kind", "simple"
		   });
		addAnnotation
		  (getINSS_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getINSS_S(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "S"
		   });
		addAnnotation
		  (getINSS_SL(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SL"
		   });
		addAnnotation
		  (getINSS_SV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SV"
		   });
	}

} //IdPackageImpl
