/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * contains the clinical information related to one patient
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getPatient <em>Patient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getLnk <em>Lnk</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType()
 * @model extendedMetaData="name='folderType' kind='elementOnly'"
 * @generated
 */
public interface FolderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getConfidentiality <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' containment reference.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(ConfidentialityType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this must be a sequential number within the parent element. In addition, it can specify alternative local identifier(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(PersonType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonType getPatient();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(PersonType value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Transaction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransactionType> getTransaction();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Lnk</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to link the folder with another element of the Belgian Healthcare Telematics System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFolderType_Lnk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LnkType> getLnk();

} // FolderType
