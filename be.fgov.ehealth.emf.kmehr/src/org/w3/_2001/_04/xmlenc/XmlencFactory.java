/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._2001._04.xmlenc.XmlencPackage
 * @generated
 */
public interface XmlencFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmlencFactory eINSTANCE = org.w3._2001._04.xmlenc.impl.XmlencFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agreement Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement Method Type</em>'.
	 * @generated
	 */
	AgreementMethodType createAgreementMethodType();

	/**
	 * Returns a new object of class '<em>Cipher Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cipher Data Type</em>'.
	 * @generated
	 */
	CipherDataType createCipherDataType();

	/**
	 * Returns a new object of class '<em>Cipher Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cipher Reference Type</em>'.
	 * @generated
	 */
	CipherReferenceType createCipherReferenceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Encrypted Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encrypted Data Type</em>'.
	 * @generated
	 */
	EncryptedDataType createEncryptedDataType();

	/**
	 * Returns a new object of class '<em>Encrypted Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encrypted Key Type</em>'.
	 * @generated
	 */
	EncryptedKeyType createEncryptedKeyType();

	/**
	 * Returns a new object of class '<em>Encryption Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encryption Method Type</em>'.
	 * @generated
	 */
	EncryptionMethodType createEncryptionMethodType();

	/**
	 * Returns a new object of class '<em>Encryption Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encryption Properties Type</em>'.
	 * @generated
	 */
	EncryptionPropertiesType createEncryptionPropertiesType();

	/**
	 * Returns a new object of class '<em>Encryption Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encryption Property Type</em>'.
	 * @generated
	 */
	EncryptionPropertyType createEncryptionPropertyType();

	/**
	 * Returns a new object of class '<em>Reference List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference List Type</em>'.
	 * @generated
	 */
	ReferenceListType createReferenceListType();

	/**
	 * Returns a new object of class '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type</em>'.
	 * @generated
	 */
	ReferenceType createReferenceType();

	/**
	 * Returns a new object of class '<em>Transforms Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transforms Type</em>'.
	 * @generated
	 */
	TransformsType createTransformsType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmlencPackage getXmlencPackage();

} //XmlencFactory
