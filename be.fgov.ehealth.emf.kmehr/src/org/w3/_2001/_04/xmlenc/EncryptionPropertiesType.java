/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encryption Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType#getEncryptionProperty <em>Encryption Property</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionPropertiesType()
 * @model extendedMetaData="name='EncryptionPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface EncryptionPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Encryption Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001._04.xmlenc.EncryptionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Property</em>' containment reference list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionPropertiesType_EncryptionProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EncryptionProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncryptionPropertyType> getEncryptionProperty();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionPropertiesType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EncryptionPropertiesType
