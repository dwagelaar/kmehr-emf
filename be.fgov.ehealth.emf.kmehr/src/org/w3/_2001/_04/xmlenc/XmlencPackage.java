/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.w3._2001._04.xmlenc.XmlencFactory
 * @model kind="package"
 * @generated
 */
public interface XmlencPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmlenc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2001/04/xmlenc#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_xmlenc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmlencPackage eINSTANCE = org.w3._2001._04.xmlenc.impl.XmlencPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl <em>Agreement Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getAgreementMethodType()
	 * @generated
	 */
	int AGREEMENT_METHOD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>KA Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__KA_NONCE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Originator Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO = 3;

	/**
	 * The feature id for the '<em><b>Recipient Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO = 4;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE__ALGORITHM = 5;

	/**
	 * The number of structural features of the '<em>Agreement Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Agreement Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_METHOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl <em>Cipher Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getCipherDataType()
	 * @generated
	 */
	int CIPHER_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cipher Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_DATA_TYPE__CIPHER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Cipher Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_DATA_TYPE__CIPHER_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Cipher Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cipher Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl <em>Cipher Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getCipherReferenceType()
	 * @generated
	 */
	int CIPHER_REFERENCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_REFERENCE_TYPE__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_REFERENCE_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>Cipher Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cipher Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIPHER_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.DocumentRootImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Agreement Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGREEMENT_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CIPHER_DATA = 4;

	/**
	 * The feature id for the '<em><b>Cipher Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CIPHER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTED_DATA = 6;

	/**
	 * The feature id for the '<em><b>Encrypted Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTED_KEY = 7;

	/**
	 * The feature id for the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_PROPERTIES = 8;

	/**
	 * The feature id for the '<em><b>Encryption Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Reference List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_LIST = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl <em>Encrypted Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedType()
	 * @generated
	 */
	int ENCRYPTED_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Encryption Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__ENCRYPTION_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__KEY_INFO = 1;

	/**
	 * The feature id for the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__CIPHER_DATA = 2;

	/**
	 * The feature id for the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__ENCODING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__MIME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Encrypted Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Encrypted Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedDataTypeImpl <em>Encrypted Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptedDataTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedDataType()
	 * @generated
	 */
	int ENCRYPTED_DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Encryption Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__ENCRYPTION_METHOD = ENCRYPTED_TYPE__ENCRYPTION_METHOD;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__KEY_INFO = ENCRYPTED_TYPE__KEY_INFO;

	/**
	 * The feature id for the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__CIPHER_DATA = ENCRYPTED_TYPE__CIPHER_DATA;

	/**
	 * The feature id for the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__ENCRYPTION_PROPERTIES = ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__ENCODING = ENCRYPTED_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__ID = ENCRYPTED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__MIME_TYPE = ENCRYPTED_TYPE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE__TYPE = ENCRYPTED_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Encrypted Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE_FEATURE_COUNT = ENCRYPTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encrypted Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_DATA_TYPE_OPERATION_COUNT = ENCRYPTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl <em>Encrypted Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedKeyType()
	 * @generated
	 */
	int ENCRYPTED_KEY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Encryption Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__ENCRYPTION_METHOD = ENCRYPTED_TYPE__ENCRYPTION_METHOD;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__KEY_INFO = ENCRYPTED_TYPE__KEY_INFO;

	/**
	 * The feature id for the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__CIPHER_DATA = ENCRYPTED_TYPE__CIPHER_DATA;

	/**
	 * The feature id for the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__ENCRYPTION_PROPERTIES = ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__ENCODING = ENCRYPTED_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__ID = ENCRYPTED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__MIME_TYPE = ENCRYPTED_TYPE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__TYPE = ENCRYPTED_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Reference List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__REFERENCE_LIST = ENCRYPTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Carried Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME = ENCRYPTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE__RECIPIENT = ENCRYPTED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Encrypted Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE_FEATURE_COUNT = ENCRYPTED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Encrypted Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTED_KEY_TYPE_OPERATION_COUNT = ENCRYPTED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl <em>Encryption Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionMethodType()
	 * @generated
	 */
	int ENCRYPTION_METHOD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE__KEY_SIZE = 1;

	/**
	 * The feature id for the '<em><b>OAE Pparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE__OAE_PPARAMS = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE__ALGORITHM = 4;

	/**
	 * The number of structural features of the '<em>Encryption Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Encryption Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_METHOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertiesTypeImpl <em>Encryption Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptionPropertiesTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionPropertiesType()
	 * @generated
	 */
	int ENCRYPTION_PROPERTIES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Encryption Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTIES_TYPE__ENCRYPTION_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTIES_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Encryption Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Encryption Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl <em>Encryption Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionPropertyType()
	 * @generated
	 */
	int ENCRYPTION_PROPERTY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Encryption Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Encryption Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl <em>Reference List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getReferenceListType()
	 * @generated
	 */
	int REFERENCE_LIST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Data Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_TYPE__DATA_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Key Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_TYPE__KEY_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Reference List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.ReferenceTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001._04.xmlenc.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001._04.xmlenc.impl.TransformsTypeImpl
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getTransformsType()
	 * @generated
	 */
	int TRANSFORMS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE__TRANSFORM = 0;

	/**
	 * The number of structural features of the '<em>Transforms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transforms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Key Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getKeySizeType()
	 * @generated
	 */
	int KEY_SIZE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.AgreementMethodType <em>Agreement Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Method Type</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType
	 * @generated
	 */
	EClass getAgreementMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getMixed()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EAttribute getAgreementMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getKANonce <em>KA Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KA Nonce</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getKANonce()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EAttribute getAgreementMethodType_KANonce();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getAny()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EAttribute getAgreementMethodType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getOriginatorKeyInfo <em>Originator Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Originator Key Info</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getOriginatorKeyInfo()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EReference getAgreementMethodType_OriginatorKeyInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getRecipientKeyInfo <em>Recipient Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient Key Info</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getRecipientKeyInfo()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EReference getAgreementMethodType_RecipientKeyInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType#getAlgorithm()
	 * @see #getAgreementMethodType()
	 * @generated
	 */
	EAttribute getAgreementMethodType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.CipherDataType <em>Cipher Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cipher Data Type</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherDataType
	 * @generated
	 */
	EClass getCipherDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherValue <em>Cipher Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cipher Value</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherDataType#getCipherValue()
	 * @see #getCipherDataType()
	 * @generated
	 */
	EAttribute getCipherDataType_CipherValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherReference <em>Cipher Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cipher Reference</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherDataType#getCipherReference()
	 * @see #getCipherDataType()
	 * @generated
	 */
	EReference getCipherDataType_CipherReference();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.CipherReferenceType <em>Cipher Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cipher Reference Type</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherReferenceType
	 * @generated
	 */
	EClass getCipherReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.CipherReferenceType#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherReferenceType#getTransforms()
	 * @see #getCipherReferenceType()
	 * @generated
	 */
	EReference getCipherReferenceType_Transforms();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.CipherReferenceType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2001._04.xmlenc.CipherReferenceType#getURI()
	 * @see #getCipherReferenceType()
	 * @generated
	 */
	EAttribute getCipherReferenceType_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001._04.xmlenc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001._04.xmlenc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getAgreementMethod <em>Agreement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agreement Method</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getAgreementMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AgreementMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherData <em>Cipher Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cipher Data</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getCipherData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CipherData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherReference <em>Cipher Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cipher Reference</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getCipherReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CipherReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedData <em>Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Data</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptedData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedKey <em>Encrypted Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Key</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptedKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperties <em>Encryption Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Properties</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptionProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperty <em>Encryption Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Property</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptionProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.DocumentRoot#getReferenceList <em>Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference List</em>'.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot#getReferenceList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceList();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptedDataType <em>Encrypted Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encrypted Data Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedDataType
	 * @generated
	 */
	EClass getEncryptedDataType();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptedKeyType <em>Encrypted Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encrypted Key Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedKeyType
	 * @generated
	 */
	EClass getEncryptedKeyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getReferenceList <em>Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference List</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedKeyType#getReferenceList()
	 * @see #getEncryptedKeyType()
	 * @generated
	 */
	EReference getEncryptedKeyType_ReferenceList();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getCarriedKeyName <em>Carried Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carried Key Name</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedKeyType#getCarriedKeyName()
	 * @see #getEncryptedKeyType()
	 * @generated
	 */
	EAttribute getEncryptedKeyType_CarriedKeyName();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedKeyType#getRecipient()
	 * @see #getEncryptedKeyType()
	 * @generated
	 */
	EAttribute getEncryptedKeyType_Recipient();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptedType <em>Encrypted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encrypted Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType
	 * @generated
	 */
	EClass getEncryptedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionMethod <em>Encryption Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Method</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getEncryptionMethod()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EReference getEncryptedType_EncryptionMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.EncryptedType#getKeyInfo <em>Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getKeyInfo()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EReference getEncryptedType_KeyInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.EncryptedType#getCipherData <em>Cipher Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cipher Data</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getCipherData()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EReference getEncryptedType_CipherData();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionProperties <em>Encryption Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Properties</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getEncryptionProperties()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EReference getEncryptedType_EncryptionProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getEncoding()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EAttribute getEncryptedType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getId()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EAttribute getEncryptedType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getMimeType()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EAttribute getEncryptedType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptedType#getType()
	 * @see #getEncryptedType()
	 * @generated
	 */
	EAttribute getEncryptedType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptionMethodType <em>Encryption Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Method Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType
	 * @generated
	 */
	EClass getEncryptionMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType#getMixed()
	 * @see #getEncryptionMethodType()
	 * @generated
	 */
	EAttribute getEncryptionMethodType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getKeySize <em>Key Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Size</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType#getKeySize()
	 * @see #getEncryptionMethodType()
	 * @generated
	 */
	EAttribute getEncryptionMethodType_KeySize();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getOAEPparams <em>OAE Pparams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OAE Pparams</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType#getOAEPparams()
	 * @see #getEncryptionMethodType()
	 * @generated
	 */
	EAttribute getEncryptionMethodType_OAEPparams();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType#getAny()
	 * @see #getEncryptionMethodType()
	 * @generated
	 */
	EAttribute getEncryptionMethodType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType#getAlgorithm()
	 * @see #getEncryptionMethodType()
	 * @generated
	 */
	EAttribute getEncryptionMethodType_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType <em>Encryption Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Properties Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertiesType
	 * @generated
	 */
	EClass getEncryptionPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType#getEncryptionProperty <em>Encryption Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encryption Property</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertiesType#getEncryptionProperty()
	 * @see #getEncryptionPropertiesType()
	 * @generated
	 */
	EReference getEncryptionPropertiesType_EncryptionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertiesType#getId()
	 * @see #getEncryptionPropertiesType()
	 * @generated
	 */
	EAttribute getEncryptionPropertiesType_Id();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType <em>Encryption Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Property Type</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType
	 * @generated
	 */
	EClass getEncryptionPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getMixed()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getGroup()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getAny()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getId()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getTarget()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_Target();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType#getAnyAttribute()
	 * @see #getEncryptionPropertyType()
	 * @generated
	 */
	EAttribute getEncryptionPropertyType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.ReferenceListType <em>Reference List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference List Type</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceListType
	 * @generated
	 */
	EClass getReferenceListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.ReferenceListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceListType#getGroup()
	 * @see #getReferenceListType()
	 * @generated
	 */
	EAttribute getReferenceListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001._04.xmlenc.ReferenceListType#getDataReference <em>Data Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Reference</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceListType#getDataReference()
	 * @see #getReferenceListType()
	 * @generated
	 */
	EReference getReferenceListType_DataReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001._04.xmlenc.ReferenceListType#getKeyReference <em>Key Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Reference</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceListType#getKeyReference()
	 * @see #getReferenceListType()
	 * @generated
	 */
	EReference getReferenceListType_KeyReference();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001._04.xmlenc.ReferenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceType#getAny()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001._04.xmlenc.ReferenceType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.w3._2001._04.xmlenc.ReferenceType#getURI()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_URI();

	/**
	 * Returns the meta object for class '{@link org.w3._2001._04.xmlenc.TransformsType <em>Transforms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transforms Type</em>'.
	 * @see org.w3._2001._04.xmlenc.TransformsType
	 * @generated
	 */
	EClass getTransformsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001._04.xmlenc.TransformsType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see org.w3._2001._04.xmlenc.TransformsType#getTransform()
	 * @see #getTransformsType()
	 * @generated
	 */
	EReference getTransformsType_Transform();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Key Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key Size Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='KeySizeType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getKeySizeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmlencFactory getXmlencFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl <em>Agreement Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getAgreementMethodType()
		 * @generated
		 */
		EClass AGREEMENT_METHOD_TYPE = eINSTANCE.getAgreementMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_METHOD_TYPE__MIXED = eINSTANCE.getAgreementMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>KA Nonce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_METHOD_TYPE__KA_NONCE = eINSTANCE.getAgreementMethodType_KANonce();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_METHOD_TYPE__ANY = eINSTANCE.getAgreementMethodType_Any();

		/**
		 * The meta object literal for the '<em><b>Originator Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO = eINSTANCE.getAgreementMethodType_OriginatorKeyInfo();

		/**
		 * The meta object literal for the '<em><b>Recipient Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO = eINSTANCE.getAgreementMethodType_RecipientKeyInfo();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_METHOD_TYPE__ALGORITHM = eINSTANCE.getAgreementMethodType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl <em>Cipher Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getCipherDataType()
		 * @generated
		 */
		EClass CIPHER_DATA_TYPE = eINSTANCE.getCipherDataType();

		/**
		 * The meta object literal for the '<em><b>Cipher Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIPHER_DATA_TYPE__CIPHER_VALUE = eINSTANCE.getCipherDataType_CipherValue();

		/**
		 * The meta object literal for the '<em><b>Cipher Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIPHER_DATA_TYPE__CIPHER_REFERENCE = eINSTANCE.getCipherDataType_CipherReference();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl <em>Cipher Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getCipherReferenceType()
		 * @generated
		 */
		EClass CIPHER_REFERENCE_TYPE = eINSTANCE.getCipherReferenceType();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIPHER_REFERENCE_TYPE__TRANSFORMS = eINSTANCE.getCipherReferenceType_Transforms();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIPHER_REFERENCE_TYPE__URI = eINSTANCE.getCipherReferenceType_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.DocumentRootImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Agreement Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AGREEMENT_METHOD = eINSTANCE.getDocumentRoot_AgreementMethod();

		/**
		 * The meta object literal for the '<em><b>Cipher Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CIPHER_DATA = eINSTANCE.getDocumentRoot_CipherData();

		/**
		 * The meta object literal for the '<em><b>Cipher Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CIPHER_REFERENCE = eINSTANCE.getDocumentRoot_CipherReference();

		/**
		 * The meta object literal for the '<em><b>Encrypted Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTED_DATA = eINSTANCE.getDocumentRoot_EncryptedData();

		/**
		 * The meta object literal for the '<em><b>Encrypted Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTED_KEY = eINSTANCE.getDocumentRoot_EncryptedKey();

		/**
		 * The meta object literal for the '<em><b>Encryption Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTION_PROPERTIES = eINSTANCE.getDocumentRoot_EncryptionProperties();

		/**
		 * The meta object literal for the '<em><b>Encryption Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENCRYPTION_PROPERTY = eINSTANCE.getDocumentRoot_EncryptionProperty();

		/**
		 * The meta object literal for the '<em><b>Reference List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_LIST = eINSTANCE.getDocumentRoot_ReferenceList();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedDataTypeImpl <em>Encrypted Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptedDataTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedDataType()
		 * @generated
		 */
		EClass ENCRYPTED_DATA_TYPE = eINSTANCE.getEncryptedDataType();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl <em>Encrypted Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedKeyType()
		 * @generated
		 */
		EClass ENCRYPTED_KEY_TYPE = eINSTANCE.getEncryptedKeyType();

		/**
		 * The meta object literal for the '<em><b>Reference List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_KEY_TYPE__REFERENCE_LIST = eINSTANCE.getEncryptedKeyType_ReferenceList();

		/**
		 * The meta object literal for the '<em><b>Carried Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME = eINSTANCE.getEncryptedKeyType_CarriedKeyName();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_KEY_TYPE__RECIPIENT = eINSTANCE.getEncryptedKeyType_Recipient();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl <em>Encrypted Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptedType()
		 * @generated
		 */
		EClass ENCRYPTED_TYPE = eINSTANCE.getEncryptedType();

		/**
		 * The meta object literal for the '<em><b>Encryption Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_TYPE__ENCRYPTION_METHOD = eINSTANCE.getEncryptedType_EncryptionMethod();

		/**
		 * The meta object literal for the '<em><b>Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_TYPE__KEY_INFO = eINSTANCE.getEncryptedType_KeyInfo();

		/**
		 * The meta object literal for the '<em><b>Cipher Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_TYPE__CIPHER_DATA = eINSTANCE.getEncryptedType_CipherData();

		/**
		 * The meta object literal for the '<em><b>Encryption Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES = eINSTANCE.getEncryptedType_EncryptionProperties();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_TYPE__ENCODING = eINSTANCE.getEncryptedType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_TYPE__ID = eINSTANCE.getEncryptedType_Id();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_TYPE__MIME_TYPE = eINSTANCE.getEncryptedType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTED_TYPE__TYPE = eINSTANCE.getEncryptedType_Type();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl <em>Encryption Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionMethodType()
		 * @generated
		 */
		EClass ENCRYPTION_METHOD_TYPE = eINSTANCE.getEncryptionMethodType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_METHOD_TYPE__MIXED = eINSTANCE.getEncryptionMethodType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Key Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_METHOD_TYPE__KEY_SIZE = eINSTANCE.getEncryptionMethodType_KeySize();

		/**
		 * The meta object literal for the '<em><b>OAE Pparams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_METHOD_TYPE__OAE_PPARAMS = eINSTANCE.getEncryptionMethodType_OAEPparams();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_METHOD_TYPE__ANY = eINSTANCE.getEncryptionMethodType_Any();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_METHOD_TYPE__ALGORITHM = eINSTANCE.getEncryptionMethodType_Algorithm();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertiesTypeImpl <em>Encryption Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptionPropertiesTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionPropertiesType()
		 * @generated
		 */
		EClass ENCRYPTION_PROPERTIES_TYPE = eINSTANCE.getEncryptionPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Encryption Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTION_PROPERTIES_TYPE__ENCRYPTION_PROPERTY = eINSTANCE.getEncryptionPropertiesType_EncryptionProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTIES_TYPE__ID = eINSTANCE.getEncryptionPropertiesType_Id();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl <em>Encryption Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getEncryptionPropertyType()
		 * @generated
		 */
		EClass ENCRYPTION_PROPERTY_TYPE = eINSTANCE.getEncryptionPropertyType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__MIXED = eINSTANCE.getEncryptionPropertyType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__GROUP = eINSTANCE.getEncryptionPropertyType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__ANY = eINSTANCE.getEncryptionPropertyType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__ID = eINSTANCE.getEncryptionPropertyType_Id();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__TARGET = eINSTANCE.getEncryptionPropertyType_Target();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getEncryptionPropertyType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl <em>Reference List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getReferenceListType()
		 * @generated
		 */
		EClass REFERENCE_LIST_TYPE = eINSTANCE.getReferenceListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_LIST_TYPE__GROUP = eINSTANCE.getReferenceListType_Group();

		/**
		 * The meta object literal for the '<em><b>Data Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIST_TYPE__DATA_REFERENCE = eINSTANCE.getReferenceListType_DataReference();

		/**
		 * The meta object literal for the '<em><b>Key Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIST_TYPE__KEY_REFERENCE = eINSTANCE.getReferenceListType_KeyReference();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.ReferenceTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__ANY = eINSTANCE.getReferenceType_Any();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__URI = eINSTANCE.getReferenceType_URI();

		/**
		 * The meta object literal for the '{@link org.w3._2001._04.xmlenc.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001._04.xmlenc.impl.TransformsTypeImpl
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getTransformsType()
		 * @generated
		 */
		EClass TRANSFORMS_TYPE = eINSTANCE.getTransformsType();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMS_TYPE__TRANSFORM = eINSTANCE.getTransformsType_Transform();

		/**
		 * The meta object literal for the '<em>Key Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.w3._2001._04.xmlenc.impl.XmlencPackageImpl#getKeySizeType()
		 * @generated
		 */
		EDataType KEY_SIZE_TYPE = eINSTANCE.getKeySizeType();

	}

} //XmlencPackage
