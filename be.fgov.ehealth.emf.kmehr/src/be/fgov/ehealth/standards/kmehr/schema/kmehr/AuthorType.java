/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the author assumes the medical responsibility of the content of the transaction. It can be specified by a combination of hcparty elements (organisation, medical specialty, person), but it must necessarily contain one hcparty
 *         identifying one person. The author is not the transcriptionist that has typed the report. The author is not necessarily the performer of the act that is reported by the transaction. In that case, the author of the transaction can be overwritten at
 *         the level of the item
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType#getHcparty <em>Hcparty</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAuthorType()
 * @model extendedMetaData="name='authorType' kind='elementOnly'"
 * @generated
 */
public interface AuthorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hcparty</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hcparty</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAuthorType_Hcparty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hcparty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HcpartyType> getHcparty();

} // AuthorType
