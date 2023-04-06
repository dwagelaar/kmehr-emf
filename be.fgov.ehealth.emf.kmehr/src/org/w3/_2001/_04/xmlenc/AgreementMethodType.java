/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2000._09.xmldsig.KeyInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getKANonce <em>KA Nonce</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getOriginatorKeyInfo <em>Originator Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getRecipientKeyInfo <em>Recipient Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.AgreementMethodType#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType()
 * @model extendedMetaData="name='AgreementMethodType' kind='mixed'"
 * @generated
 */
public interface AgreementMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>KA Nonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KA Nonce</em>' attribute.
	 * @see #setKANonce(byte[])
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_KANonce()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KA-Nonce' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getKANonce();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getKANonce <em>KA Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KA Nonce</em>' attribute.
	 * @see #getKANonce()
	 * @generated
	 */
	void setKANonce(byte[] value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Originator Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator Key Info</em>' containment reference.
	 * @see #setOriginatorKeyInfo(KeyInfoType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_OriginatorKeyInfo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginatorKeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType getOriginatorKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getOriginatorKeyInfo <em>Originator Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Key Info</em>' containment reference.
	 * @see #getOriginatorKeyInfo()
	 * @generated
	 */
	void setOriginatorKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Recipient Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Key Info</em>' containment reference.
	 * @see #setRecipientKeyInfo(KeyInfoType)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_RecipientKeyInfo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecipientKeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType getRecipientKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getRecipientKeyInfo <em>Recipient Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Key Info</em>' containment reference.
	 * @see #getRecipientKeyInfo()
	 * @generated
	 */
	void setRecipientKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getAgreementMethodType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.AgreementMethodType#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // AgreementMethodType
