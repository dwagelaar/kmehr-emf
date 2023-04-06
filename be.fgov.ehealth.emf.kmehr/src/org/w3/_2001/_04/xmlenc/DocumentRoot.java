/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getAgreementMethod <em>Agreement Method</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherData <em>Cipher Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherReference <em>Cipher Reference</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedKey <em>Encrypted Key</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperties <em>Encryption Properties</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperty <em>Encryption Property</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.DocumentRoot#getReferenceList <em>Reference List</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Agreement Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Method</em>' containment reference.
	 * @see #setAgreementMethod(AgreementMethodType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_AgreementMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AgreementMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementMethodType getAgreementMethod();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getAgreementMethod <em>Agreement Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Method</em>' containment reference.
	 * @see #getAgreementMethod()
	 * @generated
	 */
	void setAgreementMethod(AgreementMethodType value);

	/**
	 * Returns the value of the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Data</em>' containment reference.
	 * @see #setCipherData(CipherDataType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_CipherData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CipherData' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherDataType getCipherData();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherData <em>Cipher Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Data</em>' containment reference.
	 * @see #getCipherData()
	 * @generated
	 */
	void setCipherData(CipherDataType value);

	/**
	 * Returns the value of the '<em><b>Cipher Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Reference</em>' containment reference.
	 * @see #setCipherReference(CipherReferenceType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_CipherReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CipherReference' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherReferenceType getCipherReference();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getCipherReference <em>Cipher Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Reference</em>' containment reference.
	 * @see #getCipherReference()
	 * @generated
	 */
	void setCipherReference(CipherReferenceType value);

	/**
	 * Returns the value of the '<em><b>Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Data</em>' containment reference.
	 * @see #setEncryptedData(EncryptedDataType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_EncryptedData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptedDataType getEncryptedData();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedData <em>Encrypted Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Data</em>' containment reference.
	 * @see #getEncryptedData()
	 * @generated
	 */
	void setEncryptedData(EncryptedDataType value);

	/**
	 * Returns the value of the '<em><b>Encrypted Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Key</em>' containment reference.
	 * @see #setEncryptedKey(EncryptedKeyType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_EncryptedKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptedKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptedKeyType getEncryptedKey();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptedKey <em>Encrypted Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Key</em>' containment reference.
	 * @see #getEncryptedKey()
	 * @generated
	 */
	void setEncryptedKey(EncryptedKeyType value);

	/**
	 * Returns the value of the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Properties</em>' containment reference.
	 * @see #setEncryptionProperties(EncryptionPropertiesType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_EncryptionProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptionProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptionPropertiesType getEncryptionProperties();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperties <em>Encryption Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Properties</em>' containment reference.
	 * @see #getEncryptionProperties()
	 * @generated
	 */
	void setEncryptionProperties(EncryptionPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Encryption Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Property</em>' containment reference.
	 * @see #setEncryptionProperty(EncryptionPropertyType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_EncryptionProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptionProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptionPropertyType getEncryptionProperty();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getEncryptionProperty <em>Encryption Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Property</em>' containment reference.
	 * @see #getEncryptionProperty()
	 * @generated
	 */
	void setEncryptionProperty(EncryptionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Reference List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference List</em>' containment reference.
	 * @see #setReferenceList(ReferenceListType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getDocumentRoot_ReferenceList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceList' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceListType getReferenceList();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.DocumentRoot#getReferenceList <em>Reference List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference List</em>' containment reference.
	 * @see #getReferenceList()
	 * @generated
	 */
	void setReferenceList(ReferenceListType value);

} // DocumentRoot
