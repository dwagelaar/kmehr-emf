/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADING;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a heading is used to organise the content of a transaction among chapters or paragraphs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getHeading <em>Heading</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getItem <em>Item</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getLnk <em>Lnk</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType()
 * @model extendedMetaData="name='headingType' kind='elementOnly'"
 * @generated
 */
public interface HeadingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getConfidentiality <em>Confidentiality</em>}' containment reference.
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
	 * this must be a sequential number within the parent transaction or parent heading. In addition, it can be alternative local identifier(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADING}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the heading must contain at least one code from the CDHEADING scheme. Local codes can be associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDHEADING> getCd();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Heading()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<HeadingType> getHeading();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Item()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Text()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Lnk</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to link the heading with another element of the Belgian Healthcare Telematics System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeadingType_Lnk()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<LnkType> getLnk();

} // HeadingType
