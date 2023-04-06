/**
 */
package org.w3._2001._04.xmlenc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encrypted Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getReferenceList <em>Reference List</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getCarriedKeyName <em>Carried Key Name</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedKeyType()
 * @model extendedMetaData="name='EncryptedKeyType' kind='elementOnly'"
 * @generated
 */
public interface EncryptedKeyType extends EncryptedType {
	/**
	 * Returns the value of the '<em><b>Reference List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference List</em>' containment reference.
	 * @see #setReferenceList(ReferenceListType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedKeyType_ReferenceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceList' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceListType getReferenceList();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getReferenceList <em>Reference List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference List</em>' containment reference.
	 * @see #getReferenceList()
	 * @generated
	 */
	void setReferenceList(ReferenceListType value);

	/**
	 * Returns the value of the '<em><b>Carried Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carried Key Name</em>' attribute.
	 * @see #setCarriedKeyName(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedKeyType_CarriedKeyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CarriedKeyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCarriedKeyName();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getCarriedKeyName <em>Carried Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carried Key Name</em>' attribute.
	 * @see #getCarriedKeyName()
	 * @generated
	 */
	void setCarriedKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' attribute.
	 * @see #setRecipient(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptedKeyType_Recipient()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Recipient'"
	 * @generated
	 */
	String getRecipient();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptedKeyType#getRecipient <em>Recipient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' attribute.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(String value);

} // EncryptedKeyType
