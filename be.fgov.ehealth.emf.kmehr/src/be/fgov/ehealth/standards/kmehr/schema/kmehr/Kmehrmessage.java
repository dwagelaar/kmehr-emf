/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.SignatureType;

import org.w3._2001._04.xmlenc.EncryptedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kmehrmessage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to transfer medical information about one or several patients (using one folder per patient).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getHeader <em>Header</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getFolder <em>Folder</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getSignature <em>Signature</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getBase64EncryptedData <em>Base64 Encrypted Data</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage()
 * @model extendedMetaData="name='kmehrmessageType' kind='elementOnly'"
 * @generated
 */
public interface Kmehrmessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getConfidentiality <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' containment reference.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(ConfidentialityType value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_Header()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_Folder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='folder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FolderType> getFolder();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #setSignature(SignatureType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_Signature()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureType getSignature();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(SignatureType value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignature()
	 * @see #getSignature()
	 * @see #setSignature(SignatureType)
	 * @generated
	 */
	void unsetSignature();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getSignature <em>Signature</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signature</em>' containment reference is set.
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @see #setSignature(SignatureType)
	 * @generated
	 */
	boolean isSetSignature();

	/**
	 * Returns the value of the '<em><b>Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Data</em>' containment reference.
	 * @see #setEncryptedData(EncryptedType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_EncryptedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncryptedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EncryptedType getEncryptedData();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getEncryptedData <em>Encrypted Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Data</em>' containment reference.
	 * @see #getEncryptedData()
	 * @generated
	 */
	void setEncryptedData(EncryptedType value);

	/**
	 * Returns the value of the '<em><b>Base64 Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64 Encrypted Data</em>' containment reference.
	 * @see #setBase64EncryptedData(Base64EncryptedDataType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getKmehrmessage_Base64EncryptedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Base64EncryptedData' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64EncryptedDataType getBase64EncryptedData();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Kmehrmessage#getBase64EncryptedData <em>Base64 Encrypted Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64 Encrypted Data</em>' containment reference.
	 * @see #getBase64EncryptedData()
	 * @generated
	 */
	void setBase64EncryptedData(Base64EncryptedDataType value);

} // Kmehrmessage
