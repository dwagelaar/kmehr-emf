/**
 */
package org.w3._2001._04.xmlenc.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import be.fgov.ehealth.standards.kmehr.cd.cd.impl.CdPackageImpl;

import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage;

import be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl;

import be.fgov.ehealth.standards.kmehr.id.id.IdPackage;

import be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2001._04.xmlenc.AgreementMethodType;
import org.w3._2001._04.xmlenc.CipherDataType;
import org.w3._2001._04.xmlenc.CipherReferenceType;
import org.w3._2001._04.xmlenc.DocumentRoot;
import org.w3._2001._04.xmlenc.EncryptedDataType;
import org.w3._2001._04.xmlenc.EncryptedKeyType;
import org.w3._2001._04.xmlenc.EncryptedType;
import org.w3._2001._04.xmlenc.EncryptionMethodType;
import org.w3._2001._04.xmlenc.EncryptionPropertiesType;
import org.w3._2001._04.xmlenc.EncryptionPropertyType;
import org.w3._2001._04.xmlenc.ReferenceListType;
import org.w3._2001._04.xmlenc.ReferenceType;
import org.w3._2001._04.xmlenc.TransformsType;
import org.w3._2001._04.xmlenc.XmlencFactory;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlencPackageImpl extends EPackageImpl implements XmlencPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cipherDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cipherReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keySizeTypeEDataType = null;

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
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmlencPackageImpl() {
		super(eNS_URI, XmlencFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XmlencPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmlencPackage init() {
		if (isInited) return (XmlencPackage)EPackage.Registry.INSTANCE.getEPackage(XmlencPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXmlencPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XmlencPackageImpl theXmlencPackage = registeredXmlencPackage instanceof XmlencPackageImpl ? (XmlencPackageImpl)registeredXmlencPackage : new XmlencPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(registeredPackage instanceof XmldsigPackageImpl ? registeredPackage : XmldsigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KmehrPackage.eNS_URI);
		KmehrPackageImpl theKmehrPackage = (KmehrPackageImpl)(registeredPackage instanceof KmehrPackageImpl ? registeredPackage : KmehrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);
		IdPackageImpl theIdPackage = (IdPackageImpl)(registeredPackage instanceof IdPackageImpl ? registeredPackage : IdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);
		CdPackageImpl theCdPackage = (CdPackageImpl)(registeredPackage instanceof CdPackageImpl ? registeredPackage : CdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);
		DtPackageImpl theDtPackage = (DtPackageImpl)(registeredPackage instanceof DtPackageImpl ? registeredPackage : DtPackage.eINSTANCE);

		// Load packages
		theCdPackage.loadPackage();

		// Create package meta-data objects
		theXmlencPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theKmehrPackage.createPackageContents();
		theIdPackage.createPackageContents();
		theDtPackage.createPackageContents();

		// Initialize created meta-data
		theXmlencPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theKmehrPackage.initializePackageContents();
		theIdPackage.initializePackageContents();
		theDtPackage.initializePackageContents();

		// Fix loaded packages
		theCdPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmlencPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmlencPackage.eNS_URI, theXmlencPackage);
		return theXmlencPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgreementMethodType() {
		return agreementMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementMethodType_Mixed() {
		return (EAttribute)agreementMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementMethodType_KANonce() {
		return (EAttribute)agreementMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementMethodType_Any() {
		return (EAttribute)agreementMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementMethodType_OriginatorKeyInfo() {
		return (EReference)agreementMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgreementMethodType_RecipientKeyInfo() {
		return (EReference)agreementMethodTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgreementMethodType_Algorithm() {
		return (EAttribute)agreementMethodTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCipherDataType() {
		return cipherDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCipherDataType_CipherValue() {
		return (EAttribute)cipherDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCipherDataType_CipherReference() {
		return (EReference)cipherDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCipherReferenceType() {
		return cipherReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCipherReferenceType_Transforms() {
		return (EReference)cipherReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCipherReferenceType_URI() {
		return (EAttribute)cipherReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AgreementMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CipherData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CipherReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EncryptedData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EncryptedKey() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EncryptionProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EncryptionProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReferenceList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedDataType() {
		return encryptedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedKeyType() {
		return encryptedKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedKeyType_ReferenceList() {
		return (EReference)encryptedKeyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedKeyType_CarriedKeyName() {
		return (EAttribute)encryptedKeyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedKeyType_Recipient() {
		return (EAttribute)encryptedKeyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedType() {
		return encryptedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedType_EncryptionMethod() {
		return (EReference)encryptedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedType_KeyInfo() {
		return (EReference)encryptedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedType_CipherData() {
		return (EReference)encryptedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedType_EncryptionProperties() {
		return (EReference)encryptedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedType_Encoding() {
		return (EAttribute)encryptedTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedType_Id() {
		return (EAttribute)encryptedTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedType_MimeType() {
		return (EAttribute)encryptedTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedType_Type() {
		return (EAttribute)encryptedTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptionMethodType() {
		return encryptionMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionMethodType_Mixed() {
		return (EAttribute)encryptionMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionMethodType_KeySize() {
		return (EAttribute)encryptionMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionMethodType_OAEPparams() {
		return (EAttribute)encryptionMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionMethodType_Any() {
		return (EAttribute)encryptionMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionMethodType_Algorithm() {
		return (EAttribute)encryptionMethodTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptionPropertiesType() {
		return encryptionPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptionPropertiesType_EncryptionProperty() {
		return (EReference)encryptionPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertiesType_Id() {
		return (EAttribute)encryptionPropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptionPropertyType() {
		return encryptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_Mixed() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_Group() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_Any() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_Id() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_Target() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptionPropertyType_AnyAttribute() {
		return (EAttribute)encryptionPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceListType() {
		return referenceListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceListType_Group() {
		return (EAttribute)referenceListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceListType_DataReference() {
		return (EReference)referenceListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceListType_KeyReference() {
		return (EReference)referenceListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceType_Any() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceType_URI() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformsType() {
		return transformsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformsType_Transform() {
		return (EReference)transformsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKeySizeType() {
		return keySizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlencFactory getXmlencFactory() {
		return (XmlencFactory)getEFactoryInstance();
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
		agreementMethodTypeEClass = createEClass(AGREEMENT_METHOD_TYPE);
		createEAttribute(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__MIXED);
		createEAttribute(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__KA_NONCE);
		createEAttribute(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__ANY);
		createEReference(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO);
		createEReference(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO);
		createEAttribute(agreementMethodTypeEClass, AGREEMENT_METHOD_TYPE__ALGORITHM);

		cipherDataTypeEClass = createEClass(CIPHER_DATA_TYPE);
		createEAttribute(cipherDataTypeEClass, CIPHER_DATA_TYPE__CIPHER_VALUE);
		createEReference(cipherDataTypeEClass, CIPHER_DATA_TYPE__CIPHER_REFERENCE);

		cipherReferenceTypeEClass = createEClass(CIPHER_REFERENCE_TYPE);
		createEReference(cipherReferenceTypeEClass, CIPHER_REFERENCE_TYPE__TRANSFORMS);
		createEAttribute(cipherReferenceTypeEClass, CIPHER_REFERENCE_TYPE__URI);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AGREEMENT_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CIPHER_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CIPHER_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTED_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTED_KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_LIST);

		encryptedDataTypeEClass = createEClass(ENCRYPTED_DATA_TYPE);

		encryptedKeyTypeEClass = createEClass(ENCRYPTED_KEY_TYPE);
		createEReference(encryptedKeyTypeEClass, ENCRYPTED_KEY_TYPE__REFERENCE_LIST);
		createEAttribute(encryptedKeyTypeEClass, ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME);
		createEAttribute(encryptedKeyTypeEClass, ENCRYPTED_KEY_TYPE__RECIPIENT);

		encryptedTypeEClass = createEClass(ENCRYPTED_TYPE);
		createEReference(encryptedTypeEClass, ENCRYPTED_TYPE__ENCRYPTION_METHOD);
		createEReference(encryptedTypeEClass, ENCRYPTED_TYPE__KEY_INFO);
		createEReference(encryptedTypeEClass, ENCRYPTED_TYPE__CIPHER_DATA);
		createEReference(encryptedTypeEClass, ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES);
		createEAttribute(encryptedTypeEClass, ENCRYPTED_TYPE__ENCODING);
		createEAttribute(encryptedTypeEClass, ENCRYPTED_TYPE__ID);
		createEAttribute(encryptedTypeEClass, ENCRYPTED_TYPE__MIME_TYPE);
		createEAttribute(encryptedTypeEClass, ENCRYPTED_TYPE__TYPE);

		encryptionMethodTypeEClass = createEClass(ENCRYPTION_METHOD_TYPE);
		createEAttribute(encryptionMethodTypeEClass, ENCRYPTION_METHOD_TYPE__MIXED);
		createEAttribute(encryptionMethodTypeEClass, ENCRYPTION_METHOD_TYPE__KEY_SIZE);
		createEAttribute(encryptionMethodTypeEClass, ENCRYPTION_METHOD_TYPE__OAE_PPARAMS);
		createEAttribute(encryptionMethodTypeEClass, ENCRYPTION_METHOD_TYPE__ANY);
		createEAttribute(encryptionMethodTypeEClass, ENCRYPTION_METHOD_TYPE__ALGORITHM);

		encryptionPropertiesTypeEClass = createEClass(ENCRYPTION_PROPERTIES_TYPE);
		createEReference(encryptionPropertiesTypeEClass, ENCRYPTION_PROPERTIES_TYPE__ENCRYPTION_PROPERTY);
		createEAttribute(encryptionPropertiesTypeEClass, ENCRYPTION_PROPERTIES_TYPE__ID);

		encryptionPropertyTypeEClass = createEClass(ENCRYPTION_PROPERTY_TYPE);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__MIXED);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__GROUP);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__ANY);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__ID);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__TARGET);
		createEAttribute(encryptionPropertyTypeEClass, ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE);

		referenceListTypeEClass = createEClass(REFERENCE_LIST_TYPE);
		createEAttribute(referenceListTypeEClass, REFERENCE_LIST_TYPE__GROUP);
		createEReference(referenceListTypeEClass, REFERENCE_LIST_TYPE__DATA_REFERENCE);
		createEReference(referenceListTypeEClass, REFERENCE_LIST_TYPE__KEY_REFERENCE);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ANY);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__URI);

		transformsTypeEClass = createEClass(TRANSFORMS_TYPE);
		createEReference(transformsTypeEClass, TRANSFORMS_TYPE__TRANSFORM);

		// Create data types
		keySizeTypeEDataType = createEDataType(KEY_SIZE_TYPE);
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
		XmldsigPackage theXmldsigPackage = (XmldsigPackage)EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		encryptedDataTypeEClass.getESuperTypes().add(this.getEncryptedType());
		encryptedKeyTypeEClass.getESuperTypes().add(this.getEncryptedType());

		// Initialize classes, features, and operations; add parameters
		initEClass(agreementMethodTypeEClass, AgreementMethodType.class, "AgreementMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementMethodType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AgreementMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementMethodType_KANonce(), theXMLTypePackage.getBase64Binary(), "kANonce", null, 0, 1, AgreementMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AgreementMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementMethodType_OriginatorKeyInfo(), theXmldsigPackage.getKeyInfoType(), null, "originatorKeyInfo", null, 0, 1, AgreementMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementMethodType_RecipientKeyInfo(), theXmldsigPackage.getKeyInfoType(), null, "recipientKeyInfo", null, 0, 1, AgreementMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, AgreementMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cipherDataTypeEClass, CipherDataType.class, "CipherDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCipherDataType_CipherValue(), theXMLTypePackage.getBase64Binary(), "cipherValue", null, 0, 1, CipherDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCipherDataType_CipherReference(), this.getCipherReferenceType(), null, "cipherReference", null, 0, 1, CipherDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cipherReferenceTypeEClass, CipherReferenceType.class, "CipherReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCipherReferenceType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, CipherReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCipherReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, CipherReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AgreementMethod(), this.getAgreementMethodType(), null, "agreementMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CipherData(), this.getCipherDataType(), null, "cipherData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CipherReference(), this.getCipherReferenceType(), null, "cipherReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptedData(), this.getEncryptedDataType(), null, "encryptedData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptedKey(), this.getEncryptedKeyType(), null, "encryptedKey", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptionProperties(), this.getEncryptionPropertiesType(), null, "encryptionProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptionProperty(), this.getEncryptionPropertyType(), null, "encryptionProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceList(), this.getReferenceListType(), null, "referenceList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(encryptedDataTypeEClass, EncryptedDataType.class, "EncryptedDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encryptedKeyTypeEClass, EncryptedKeyType.class, "EncryptedKeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncryptedKeyType_ReferenceList(), this.getReferenceListType(), null, "referenceList", null, 0, 1, EncryptedKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedKeyType_CarriedKeyName(), theXMLTypePackage.getString(), "carriedKeyName", null, 0, 1, EncryptedKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedKeyType_Recipient(), theXMLTypePackage.getString(), "recipient", null, 0, 1, EncryptedKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptedTypeEClass, EncryptedType.class, "EncryptedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncryptedType_EncryptionMethod(), this.getEncryptionMethodType(), null, "encryptionMethod", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedType_KeyInfo(), theXmldsigPackage.getKeyInfoType(), null, "keyInfo", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedType_CipherData(), this.getCipherDataType(), null, "cipherData", null, 1, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedType_EncryptionProperties(), this.getEncryptionPropertiesType(), null, "encryptionProperties", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedType_Encoding(), theXMLTypePackage.getAnyURI(), "encoding", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedType_MimeType(), theXMLTypePackage.getString(), "mimeType", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedType_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, EncryptedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptionMethodTypeEClass, EncryptionMethodType.class, "EncryptionMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptionMethodType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EncryptionMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionMethodType_KeySize(), this.getKeySizeType(), "keySize", null, 0, 1, EncryptionMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionMethodType_OAEPparams(), theXMLTypePackage.getBase64Binary(), "oAEPparams", null, 0, 1, EncryptionMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EncryptionMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, EncryptionMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptionPropertiesTypeEClass, EncryptionPropertiesType.class, "EncryptionPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncryptionPropertiesType_EncryptionProperty(), this.getEncryptionPropertyType(), null, "encryptionProperty", null, 1, -1, EncryptionPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertiesType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EncryptionPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptionPropertyTypeEClass, EncryptionPropertyType.class, "EncryptionPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptionPropertyType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EncryptionPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertyType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EncryptionPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EncryptionPropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EncryptionPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertyType_Target(), theXMLTypePackage.getAnyURI(), "target", null, 0, 1, EncryptionPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptionPropertyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EncryptionPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceListTypeEClass, ReferenceListType.class, "ReferenceListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ReferenceListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceListType_DataReference(), this.getReferenceType(), null, "dataReference", null, 0, -1, ReferenceListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceListType_KeyReference(), this.getReferenceType(), null, "keyReference", null, 0, -1, ReferenceListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformsTypeEClass, TransformsType.class, "TransformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformsType_Transform(), theXmldsigPackage.getTransformType(), null, "transform", null, 1, -1, TransformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(keySizeTypeEDataType, BigInteger.class, "KeySizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (agreementMethodTypeEClass,
		   source,
		   new String[] {
			   "name", "AgreementMethodType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAgreementMethodType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getAgreementMethodType_KANonce(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KA-Nonce",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgreementMethodType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":2",
			   "processing", "strict"
		   });
		addAnnotation
		  (getAgreementMethodType_OriginatorKeyInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OriginatorKeyInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgreementMethodType_RecipientKeyInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecipientKeyInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgreementMethodType_Algorithm(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Algorithm"
		   });
		addAnnotation
		  (cipherDataTypeEClass,
		   source,
		   new String[] {
			   "name", "CipherDataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCipherDataType_CipherValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CipherValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCipherDataType_CipherReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CipherReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cipherReferenceTypeEClass,
		   source,
		   new String[] {
			   "name", "CipherReferenceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCipherReferenceType_Transforms(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Transforms",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCipherReferenceType_URI(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "URI"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_AgreementMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AgreementMethod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CipherData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CipherData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CipherReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CipherReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EncryptedData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptedData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EncryptedKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptedKey",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EncryptionProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptionProperties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EncryptionProperty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptionProperty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ReferenceList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (encryptedDataTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptedDataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (encryptedKeyTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptedKeyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEncryptedKeyType_ReferenceList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptedKeyType_CarriedKeyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CarriedKeyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptedKeyType_Recipient(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Recipient"
		   });
		addAnnotation
		  (encryptedTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptedType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEncryptedType_EncryptionMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptionMethod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptedType_KeyInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeyInfo",
			   "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });
		addAnnotation
		  (getEncryptedType_CipherData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CipherData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptedType_EncryptionProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptionProperties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptedType_Encoding(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Encoding"
		   });
		addAnnotation
		  (getEncryptedType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id"
		   });
		addAnnotation
		  (getEncryptedType_MimeType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MimeType"
		   });
		addAnnotation
		  (getEncryptedType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Type"
		   });
		addAnnotation
		  (encryptionMethodTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptionMethodType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getEncryptionMethodType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getEncryptionMethodType_KeySize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeySize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptionMethodType_OAEPparams(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OAEPparams",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptionMethodType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":3",
			   "processing", "strict"
		   });
		addAnnotation
		  (getEncryptionMethodType_Algorithm(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Algorithm"
		   });
		addAnnotation
		  (encryptionPropertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptionPropertiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEncryptionPropertiesType_EncryptionProperty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptionProperty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEncryptionPropertiesType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id"
		   });
		addAnnotation
		  (encryptionPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "EncryptionPropertyType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getEncryptionPropertyType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getEncryptionPropertyType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getEncryptionPropertyType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":2",
			   "processing", "lax",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getEncryptionPropertyType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Id"
		   });
		addAnnotation
		  (getEncryptionPropertyType_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Target"
		   });
		addAnnotation
		  (getEncryptionPropertyType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "http://www.w3.org/XML/1998/namespace",
			   "name", ":5",
			   "processing", "strict"
		   });
		addAnnotation
		  (keySizeTypeEDataType,
		   source,
		   new String[] {
			   "name", "KeySizeType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (referenceListTypeEClass,
		   source,
		   new String[] {
			   "name", "ReferenceList_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferenceListType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getReferenceListType_DataReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataReference",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getReferenceListType_KeyReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeyReference",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (referenceTypeEClass,
		   source,
		   new String[] {
			   "name", "ReferenceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferenceType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "strict"
		   });
		addAnnotation
		  (getReferenceType_URI(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "URI"
		   });
		addAnnotation
		  (transformsTypeEClass,
		   source,
		   new String[] {
			   "name", "TransformsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransformsType_Transform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Transform",
			   "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });
	}

} //XmlencPackageImpl
