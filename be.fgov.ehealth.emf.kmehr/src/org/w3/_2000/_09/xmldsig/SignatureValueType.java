/**
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignatureValueType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureValueType()
 * @model extendedMetaData="name='SignatureValueType' kind='simple'"
 * @generated
 */
public interface SignatureValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureValueType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureValueType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureValueType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignatureValueType
