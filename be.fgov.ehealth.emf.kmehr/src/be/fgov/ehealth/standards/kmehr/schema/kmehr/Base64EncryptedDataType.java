/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONMETHOD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base64 Encrypted Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getBase64EncryptedValue <em>Base64 Encrypted Value</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getBase64EncryptedDataType()
 * @model extendedMetaData="name='Base64EncryptedDataType' kind='elementOnly'"
 * @generated
 */
public interface Base64EncryptedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDENCRYPTIONMETHOD)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getBase64EncryptedDataType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDENCRYPTIONMETHOD getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDENCRYPTIONMETHOD value);

	/**
	 * Returns the value of the '<em><b>Base64 Encrypted Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64 Encrypted Value</em>' containment reference.
	 * @see #setBase64EncryptedValue(Base64EncryptedValueType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getBase64EncryptedDataType_Base64EncryptedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Base64EncryptedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64EncryptedValueType getBase64EncryptedValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getBase64EncryptedValue <em>Base64 Encrypted Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64 Encrypted Value</em>' containment reference.
	 * @see #getBase64EncryptedValue()
	 * @generated
	 */
	void setBase64EncryptedValue(Base64EncryptedValueType value);

} // Base64EncryptedDataType
