/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cipher Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.CipherReferenceType#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.CipherReferenceType#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherReferenceType()
 * @model extendedMetaData="name='CipherReferenceType' kind='elementOnly'"
 * @generated
 */
public interface CipherReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherReferenceType_Transforms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType getTransforms();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.CipherReferenceType#getTransforms <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getCipherReferenceType_URI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.CipherReferenceType#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // CipherReferenceType
