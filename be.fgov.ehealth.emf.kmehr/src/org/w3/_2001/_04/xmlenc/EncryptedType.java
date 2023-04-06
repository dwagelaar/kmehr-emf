/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.KeyInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encrypted Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getCipherData <em>Cipher Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionProperties <em>Encryption Properties</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType()
 * @model abstract="true"
 *        extendedMetaData="name='EncryptedType' kind='elementOnly'"
 * @generated
 */
public interface EncryptedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Method</em>' containment reference.
	 * @see #setEncryptionMethod(EncryptionMethodType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_EncryptionMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncryptionMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptionMethodType getEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionMethod <em>Encryption Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Method</em>' containment reference.
	 * @see #getEncryptionMethod()
	 * @generated
	 */
	void setEncryptionMethod(EncryptionMethodType value);

	/**
	 * Returns the value of the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Info</em>' containment reference.
	 * @see #setKeyInfo(KeyInfoType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_KeyInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='http://www.w3.org/2000/09/xmldsig#'"
	 * @generated
	 */
	KeyInfoType getKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getKeyInfo <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Cipher Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Data</em>' containment reference.
	 * @see #setCipherData(CipherDataType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_CipherData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CipherData' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherDataType getCipherData();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getCipherData <em>Cipher Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Data</em>' containment reference.
	 * @see #getCipherData()
	 * @generated
	 */
	void setCipherData(CipherDataType value);

	/**
	 * Returns the value of the '<em><b>Encryption Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Properties</em>' containment reference.
	 * @see #setEncryptionProperties(EncryptionPropertiesType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_EncryptionProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncryptionProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptionPropertiesType getEncryptionProperties();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncryptionProperties <em>Encryption Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Properties</em>' containment reference.
	 * @see #getEncryptionProperties()
	 * @generated
	 */
	void setEncryptionProperties(EncryptionPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='Encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_MimeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // EncryptedType
