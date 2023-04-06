/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDITEM;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the item is used to describe atomic medical information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getContent <em>Content</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getAuthor <em>Author</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBeginmoment <em>Beginmoment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getEndmoment <em>Endmoment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete <em>Iscomplete</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated <em>Isvalidated</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant <em>Isrelevant</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSeverity <em>Severity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getTemporality <em>Temporality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getStrength <em>Strength</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSite <em>Site</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCost <em>Cost</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDayperiod <em>Dayperiod</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDuration <em>Duration</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getPosology <em>Posology</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRegimen <em>Regimen</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDeliverydate <em>Deliverydate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRenewal <em>Renewal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRoute <em>Route</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBatch <em>Batch</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforpatient <em>Instructionforpatient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLocal <em>Local</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLnk <em>Lnk</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType()
 * @model extendedMetaData="name='itemType' kind='elementOnly'"
 * @generated
 */
public interface ItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getConfidentiality <em>Confidentiality</em>}' containment reference.
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
	 * this must be a sequential number within the transaction. In addition, it can specify alternative local identifier(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the item must contain at least one code from the CD-ITEM scheme. Local codes can be associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDITEM> getCd();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this is used to specify the content of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentType> getContent();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to comment the content
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this can be used to specify the medical responsible of the content of the item when it differs from the transaction 's author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AuthorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getAuthor();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorType value);

	/**
	 * Returns the value of the '<em><b>Beginmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginmoment</em>' containment reference.
	 * @see #setBeginmoment(MomentType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Beginmoment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beginmoment' namespace='##targetNamespace'"
	 * @generated
	 */
	MomentType getBeginmoment();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBeginmoment <em>Beginmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginmoment</em>' containment reference.
	 * @see #getBeginmoment()
	 * @generated
	 */
	void setBeginmoment(MomentType value);

	/**
	 * Returns the value of the '<em><b>Endmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endmoment</em>' containment reference.
	 * @see #setEndmoment(MomentType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Endmoment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endmoment' namespace='##targetNamespace'"
	 * @generated
	 */
	MomentType getEndmoment();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getEndmoment <em>Endmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endmoment</em>' containment reference.
	 * @see #getEndmoment()
	 * @generated
	 */
	void setEndmoment(MomentType value);

	/**
	 * Returns the value of the '<em><b>Iscomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iscomplete</em>' attribute.
	 * @see #isSetIscomplete()
	 * @see #unsetIscomplete()
	 * @see #setIscomplete(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Iscomplete()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='iscomplete' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIscomplete();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iscomplete</em>' attribute.
	 * @see #isSetIscomplete()
	 * @see #unsetIscomplete()
	 * @see #isIscomplete()
	 * @generated
	 */
	void setIscomplete(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIscomplete()
	 * @see #isIscomplete()
	 * @see #setIscomplete(boolean)
	 * @generated
	 */
	void unsetIscomplete();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete <em>Iscomplete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iscomplete</em>' attribute is set.
	 * @see #unsetIscomplete()
	 * @see #isIscomplete()
	 * @see #setIscomplete(boolean)
	 * @generated
	 */
	boolean isSetIscomplete();

	/**
	 * Returns the value of the '<em><b>Isvalidated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isvalidated</em>' attribute.
	 * @see #isSetIsvalidated()
	 * @see #unsetIsvalidated()
	 * @see #setIsvalidated(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Isvalidated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isvalidated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsvalidated();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isvalidated</em>' attribute.
	 * @see #isSetIsvalidated()
	 * @see #unsetIsvalidated()
	 * @see #isIsvalidated()
	 * @generated
	 */
	void setIsvalidated(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsvalidated()
	 * @see #isIsvalidated()
	 * @see #setIsvalidated(boolean)
	 * @generated
	 */
	void unsetIsvalidated();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated <em>Isvalidated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isvalidated</em>' attribute is set.
	 * @see #unsetIsvalidated()
	 * @see #isIsvalidated()
	 * @see #setIsvalidated(boolean)
	 * @generated
	 */
	boolean isSetIsvalidated();

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(LifecycleType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Lifecycle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lifecycle' namespace='##targetNamespace'"
	 * @generated
	 */
	LifecycleType getLifecycle();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(LifecycleType value);

	/**
	 * Returns the value of the '<em><b>Isrelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isrelevant</em>' attribute.
	 * @see #isSetIsrelevant()
	 * @see #unsetIsrelevant()
	 * @see #setIsrelevant(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Isrelevant()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isrelevant' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsrelevant();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant <em>Isrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isrelevant</em>' attribute.
	 * @see #isSetIsrelevant()
	 * @see #unsetIsrelevant()
	 * @see #isIsrelevant()
	 * @generated
	 */
	void setIsrelevant(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant <em>Isrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsrelevant()
	 * @see #isIsrelevant()
	 * @see #setIsrelevant(boolean)
	 * @generated
	 */
	void unsetIsrelevant();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant <em>Isrelevant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isrelevant</em>' attribute is set.
	 * @see #unsetIsrelevant()
	 * @see #isIsrelevant()
	 * @see #setIsrelevant(boolean)
	 * @generated
	 */
	boolean isSetIsrelevant();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(SeverityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	SeverityType getSeverity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityType value);

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' containment reference.
	 * @see #setCertainty(CertaintyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Certainty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certainty' namespace='##targetNamespace'"
	 * @generated
	 */
	CertaintyType getCertainty();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCertainty <em>Certainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' containment reference.
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(CertaintyType value);

	/**
	 * Returns the value of the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporality</em>' containment reference.
	 * @see #setTemporality(TemporalityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Temporality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temporality' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalityType getTemporality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getTemporality <em>Temporality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporality</em>' containment reference.
	 * @see #getTemporality()
	 * @generated
	 */
	void setTemporality(TemporalityType value);

	/**
	 * Returns the value of the '<em><b>Urgency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgency</em>' containment reference.
	 * @see #setUrgency(UrgencyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Urgency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='urgency' namespace='##targetNamespace'"
	 * @generated
	 */
	UrgencyType getUrgency();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getUrgency <em>Urgency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgency</em>' containment reference.
	 * @see #getUrgency()
	 * @generated
	 */
	void setUrgency(UrgencyType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(StrengthType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	StrengthType getStrength();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(StrengthType value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(FrequencyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Frequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyType getFrequency();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(FrequencyType value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiteType> getSite();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(CostType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Cost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostType getCost();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(CostType value);

	/**
	 * Returns the value of the '<em><b>Dayperiod</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dayperiod</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Dayperiod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dayperiod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DayperiodType> getDayperiod();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DurationType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationType getDuration();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(DurationType value);

	/**
	 * Returns the value of the '<em><b>Posology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * quantity of product and frequence of administration per unit of period of time (day, week, hour, month etc...)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posology</em>' containment reference.
	 * @see #setPosology(PosologyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Posology()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posology' namespace='##targetNamespace'"
	 * @generated
	 */
	PosologyType getPosology();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getPosology <em>Posology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posology</em>' containment reference.
	 * @see #getPosology()
	 * @generated
	 */
	void setPosology(PosologyType value);

	/**
	 * Returns the value of the '<em><b>Regimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ordered day regimen of administration applicable either on a precised day or on basis of the frequency 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regimen</em>' containment reference.
	 * @see #setRegimen(RegimenType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Regimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regimen' namespace='##targetNamespace'"
	 * @generated
	 */
	RegimenType getRegimen();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRegimen <em>Regimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regimen</em>' containment reference.
	 * @see #getRegimen()
	 * @generated
	 */
	void setRegimen(RegimenType value);

	/**
	 * Returns the value of the '<em><b>Deliverydate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * proposed date of delivery of that product in case of a prescription, delivery date in case of delivery of that product. Simple date type content based on a new basic datatype "date", similary, another new basic datatype "time"
	 *             has been created
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliverydate</em>' attribute.
	 * @see #setDeliverydate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Deliverydate()
	 * @model dataType="be.fgov.ehealth.standards.kmehr.dt.dt.Date"
	 *        extendedMetaData="kind='element' name='deliverydate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeliverydate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDeliverydate <em>Deliverydate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverydate</em>' attribute.
	 * @see #getDeliverydate()
	 * @generated
	 */
	void setDeliverydate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Renewal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renewal</em>' containment reference.
	 * @see #setRenewal(RenewalType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Renewal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renewal' namespace='##targetNamespace'"
	 * @generated
	 */
	RenewalType getRenewal();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRenewal <em>Renewal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renewal</em>' containment reference.
	 * @see #getRenewal()
	 * @generated
	 */
	void setRenewal(RenewalType value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(RouteType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteType getRoute();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteType value);

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * serial number of the product package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch</em>' attribute.
	 * @see #setBatch(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Batch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='batch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBatch();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBatch <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch</em>' attribute.
	 * @see #getBatch()
	 * @generated
	 */
	void setBatch(String value);

	/**
	 * Returns the value of the '<em><b>Instructionforoverdosing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to justify voluntary 'overdosing'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructionforoverdosing</em>' containment reference.
	 * @see #setInstructionforoverdosing(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Instructionforoverdosing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforoverdosing' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforoverdosing();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforoverdosing</em>' containment reference.
	 * @see #getInstructionforoverdosing()
	 * @generated
	 */
	void setInstructionforoverdosing(TextType value);

	/**
	 * Returns the value of the '<em><b>Instructionforpatient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructionforpatient</em>' containment reference.
	 * @see #setInstructionforpatient(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Instructionforpatient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforpatient' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforpatient();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforpatient <em>Instructionforpatient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforpatient</em>' containment reference.
	 * @see #getInstructionforpatient()
	 * @generated
	 */
	void setInstructionforpatient(TextType value);

	/**
	 * Returns the value of the '<em><b>Instructionforreimbursement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  to indicate the type of reimbursement based on medical justification for treatment 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructionforreimbursement</em>' containment reference.
	 * @see #setInstructionforreimbursement(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Instructionforreimbursement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforreimbursement' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforreimbursement();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforreimbursement</em>' containment reference.
	 * @see #getInstructionforreimbursement()
	 * @generated
	 */
	void setInstructionforreimbursement(TextType value);

	/**
	 * Returns the value of the '<em><b>Issubstitutionallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issubstitutionallowed</em>' attribute.
	 * @see #isSetIssubstitutionallowed()
	 * @see #unsetIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Issubstitutionallowed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='issubstitutionallowed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIssubstitutionallowed();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issubstitutionallowed</em>' attribute.
	 * @see #isSetIssubstitutionallowed()
	 * @see #unsetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @generated
	 */
	void setIssubstitutionallowed(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @generated
	 */
	void unsetIssubstitutionallowed();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issubstitutionallowed</em>' attribute is set.
	 * @see #unsetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @generated
	 */
	boolean isSetIssubstitutionallowed();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference.
	 * @see #setFeedback(FeedbackType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Feedback()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feedback' namespace='##targetNamespace'"
	 * @generated
	 */
	FeedbackType getFeedback();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFeedback <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' containment reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(FeedbackType value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Local()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalitemattributeType> getLocal();

	/**
	 * Returns the value of the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorddatetime</em>' attribute.
	 * @see #setRecorddatetime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Recorddatetime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='recorddatetime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRecorddatetime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRecorddatetime <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorddatetime</em>' attribute.
	 * @see #getRecorddatetime()
	 * @generated
	 */
	void setRecorddatetime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Lnk</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getItemType_Lnk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LnkType> getLnk();

} // ItemType
