/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cipher Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherValue <em>Cipher Value</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherReference <em>Cipher Reference</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherDataType()
 * @model extendedMetaData="name='CipherDataType' kind='elementOnly'"
 * @generated
 */
public interface CipherDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cipher Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Value</em>' attribute.
	 * @see #setCipherValue(byte[])
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherDataType_CipherValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='CipherValue' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getCipherValue();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherValue <em>Cipher Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Value</em>' attribute.
	 * @see #getCipherValue()
	 * @generated
	 */
	void setCipherValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Cipher Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Reference</em>' containment reference.
	 * @see #setCipherReference(CipherReferenceType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherDataType_CipherReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CipherReference' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherReferenceType getCipherReference();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.CipherDataType#getCipherReference <em>Cipher Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Reference</em>' containment reference.
	 * @see #getCipherReference()
	 * @generated
	 */
	void setCipherReference(CipherReferenceType value);

} // CipherDataType
