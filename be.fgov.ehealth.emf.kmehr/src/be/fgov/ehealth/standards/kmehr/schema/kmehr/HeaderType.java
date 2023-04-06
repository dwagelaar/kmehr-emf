/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to specify the routing of the message
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getStandard <em>Standard</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getSender <em>Sender</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getAcknowledgment <em>Acknowledgment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExpirationdate <em>Expirationdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExternalsource <em>Externalsource</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType()
 * @model extendedMetaData="name='headerType' kind='elementOnly'"
 * @generated
 */
public interface HeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getConfidentiality <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' containment reference.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(ConfidentialityType value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' containment reference.
	 * @see #setStandard(StandardType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Standard()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='standard' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardType getStandard();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getStandard <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' containment reference.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(StandardType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this must be a unique number within the Belgian Telematics Healthcare system . It should result of the concatenation of the first sender hcparty id of the current message, a dot and a unique identifier within the sending
	 *             system. In addition, it can also specify alternative local numbers.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * creation date of the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * creation time of the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time" required="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(SenderType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Sender()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	SenderType getSender();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(SenderType value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Recipient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RecipientType> getRecipient();

	/**
	 * Returns the value of the '<em><b>Urgency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgency</em>' containment reference.
	 * @see #setUrgency(UrgencyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Urgency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='urgency' namespace='##targetNamespace'"
	 * @generated
	 */
	UrgencyType getUrgency();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getUrgency <em>Urgency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgency</em>' containment reference.
	 * @see #getUrgency()
	 * @generated
	 */
	void setUrgency(UrgencyType value);

	/**
	 * Returns the value of the '<em><b>Acknowledgment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acknowledgment</em>' containment reference.
	 * @see #setAcknowledgment(AcknowledgmentType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Acknowledgment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acknowledgment' namespace='##targetNamespace'"
	 * @generated
	 */
	AcknowledgmentType getAcknowledgment();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getAcknowledgment <em>Acknowledgment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledgment</em>' containment reference.
	 * @see #getAcknowledgment()
	 * @generated
	 */
	void setAcknowledgment(AcknowledgmentType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Text()
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
	 * to link the header with another element of the Belgian Healthcare Telematics System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Lnk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LnkType> getLnk();

	/**
	 * Returns the value of the '<em><b>Expirationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expiration date of the message (used a.o. in prescription messages), can be used to remove a prescription form a prescription server
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expirationdate</em>' attribute.
	 * @see #setExpirationdate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Expirationdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='expirationdate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationdate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExpirationdate <em>Expirationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expirationdate</em>' attribute.
	 * @see #getExpirationdate()
	 * @generated
	 */
	void setExpirationdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Externalsource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsource</em>' containment reference.
	 * @see #setExternalsource(ExternalsourceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHeaderType_Externalsource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalsource' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalsourceType getExternalsource();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExternalsource <em>Externalsource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsource</em>' containment reference.
	 * @see #getExternalsource()
	 * @generated
	 */
	void setExternalsource(ExternalsourceType value);

} // HeaderType
