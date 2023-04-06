/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidentiality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to restrict the list of healthcare parties allowed to access to the content of the parent element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType#getHcparty <em>Hcparty</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getConfidentialityType()
 * @model extendedMetaData="name='confidentialityType' kind='elementOnly'"
 * @generated
 */
public interface ConfidentialityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hcparty</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to identify a healthcare professional, organisation or medical specialty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hcparty</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getConfidentialityType_Hcparty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hcparty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HcpartyType> getHcparty();

} // ConfidentialityType
