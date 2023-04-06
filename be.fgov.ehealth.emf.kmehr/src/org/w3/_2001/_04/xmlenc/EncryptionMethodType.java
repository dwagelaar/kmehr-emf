/**
 */
package org.w3._2001._04.xmlenc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encryption Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getKeySize <em>Key Size</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getOAEPparams <em>OAE Pparams</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType()
 * @model extendedMetaData="name='EncryptionMethodType' kind='mixed'"
 * @generated
 */
public interface EncryptionMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Size</em>' attribute.
	 * @see #setKeySize(BigInteger)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType_KeySize()
	 * @model dataType="org.w3._2001._04.xmlenc.KeySizeType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeySize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getKeySize();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getKeySize <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Size</em>' attribute.
	 * @see #getKeySize()
	 * @generated
	 */
	void setKeySize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>OAE Pparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAE Pparams</em>' attribute.
	 * @see #setOAEPparams(byte[])
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType_OAEPparams()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OAEPparams' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getOAEPparams();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getOAEPparams <em>OAE Pparams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OAE Pparams</em>' attribute.
	 * @see #getOAEPparams()
	 * @generated
	 */
	void setOAEPparams(byte[] value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getEncryptionMethodType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.w3._2001._04.xmlenc.EncryptionMethodType#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // EncryptionMethodType
