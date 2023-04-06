/**
 */
package org.w3._2001._04.xmlenc.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2001._04.xmlenc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlencFactoryImpl extends EFactoryImpl implements XmlencFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmlencFactory init() {
		try {
			XmlencFactory theXmlencFactory = (XmlencFactory)EPackage.Registry.INSTANCE.getEFactory(XmlencPackage.eNS_URI);
			if (theXmlencFactory != null) {
				return theXmlencFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmlencFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlencFactoryImpl() {
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
			case XmlencPackage.AGREEMENT_METHOD_TYPE: return createAgreementMethodType();
			case XmlencPackage.CIPHER_DATA_TYPE: return createCipherDataType();
			case XmlencPackage.CIPHER_REFERENCE_TYPE: return createCipherReferenceType();
			case XmlencPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XmlencPackage.ENCRYPTED_DATA_TYPE: return createEncryptedDataType();
			case XmlencPackage.ENCRYPTED_KEY_TYPE: return createEncryptedKeyType();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE: return createEncryptionMethodType();
			case XmlencPackage.ENCRYPTION_PROPERTIES_TYPE: return createEncryptionPropertiesType();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE: return createEncryptionPropertyType();
			case XmlencPackage.REFERENCE_LIST_TYPE: return createReferenceListType();
			case XmlencPackage.REFERENCE_TYPE: return createReferenceType();
			case XmlencPackage.TRANSFORMS_TYPE: return createTransformsType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmlencPackage.KEY_SIZE_TYPE:
				return createKeySizeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmlencPackage.KEY_SIZE_TYPE:
				return convertKeySizeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementMethodType createAgreementMethodType() {
		AgreementMethodTypeImpl agreementMethodType = new AgreementMethodTypeImpl();
		return agreementMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherDataType createCipherDataType() {
		CipherDataTypeImpl cipherDataType = new CipherDataTypeImpl();
		return cipherDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherReferenceType createCipherReferenceType() {
		CipherReferenceTypeImpl cipherReferenceType = new CipherReferenceTypeImpl();
		return cipherReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedDataType createEncryptedDataType() {
		EncryptedDataTypeImpl encryptedDataType = new EncryptedDataTypeImpl();
		return encryptedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedKeyType createEncryptedKeyType() {
		EncryptedKeyTypeImpl encryptedKeyType = new EncryptedKeyTypeImpl();
		return encryptedKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionMethodType createEncryptionMethodType() {
		EncryptionMethodTypeImpl encryptionMethodType = new EncryptionMethodTypeImpl();
		return encryptionMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionPropertiesType createEncryptionPropertiesType() {
		EncryptionPropertiesTypeImpl encryptionPropertiesType = new EncryptionPropertiesTypeImpl();
		return encryptionPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionPropertyType createEncryptionPropertyType() {
		EncryptionPropertyTypeImpl encryptionPropertyType = new EncryptionPropertyTypeImpl();
		return encryptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceListType createReferenceListType() {
		ReferenceListTypeImpl referenceListType = new ReferenceListTypeImpl();
		return referenceListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformsType createTransformsType() {
		TransformsTypeImpl transformsType = new TransformsTypeImpl();
		return transformsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createKeySizeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeySizeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlencPackage getXmlencPackage() {
		return (XmlencPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmlencPackage getPackage() {
		return XmlencPackage.eINSTANCE;
	}

} //XmlencFactoryImpl
