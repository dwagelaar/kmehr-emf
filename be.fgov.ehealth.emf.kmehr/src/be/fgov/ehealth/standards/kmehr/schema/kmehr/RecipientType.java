/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The recipient can be specified by a free combination of hcparty elements (organisation(s), medical specialty(ies), person(s)). If no individual person can be identified as recipient, you should specify a medical specialty or, at
 *         least the identification of the organisation that receives the message for further distribution (a regional server for example).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getHcparty <em>Hcparty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getDummyFriend <em>Dummy Friend</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRecipientType()
 * @model extendedMetaData="name='recipientType' kind='elementOnly'"
 * @generated
 */
public interface RecipientType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hcparty</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hcparty</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRecipientType_Hcparty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hcparty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HcpartyType> getHcparty();

	/**
	 * Returns the value of the '<em><b>Dummy Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Friend</em>' attribute.
	 * @see #setDummyFriend(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRecipientType_DummyFriend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='dummyFriend' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDummyFriend();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getDummyFriend <em>Dummy Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy Friend</em>' attribute.
	 * @see #getDummyFriend()
	 * @generated
	 */
	void setDummyFriend(String value);

} // RecipientType
