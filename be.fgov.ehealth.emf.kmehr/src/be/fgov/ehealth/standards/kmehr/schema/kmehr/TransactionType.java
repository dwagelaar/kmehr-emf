/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTION;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a transaction is a set of medical information validated by one healthcare professional at one given moment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getAuthor <em>Author</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRedactor <em>Redactor</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete <em>Iscomplete</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated <em>Isvalidated</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getExpirationdate <em>Expirationdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getHeading <em>Heading</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getItem <em>Item</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTextWithLayout <em>Text With Layout</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType()
 * @model extendedMetaData="name='transactionType' kind='elementOnly'"
 * @generated
 */
public interface TransactionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(ConfidentialityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidentialityType getConfidentiality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getConfidentiality <em>Confidentiality</em>}' containment reference.
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
	 * this must be a sequential number within the folder. In addition, it can specify alternative local identifier(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the transaction must contain at least one code from the CD-TRANSACTION scheme. Local codes can be associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDTRANSACTION> getCd();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * usually this is the date of reporting. Please refer to detailed specification for particular cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getDate <em>Date</em>}' attribute.
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
	 * usually this is the time of reporting. Please refer to detailed specification for particular cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time" required="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the author endorses the medical responsibility of the content of the transaction. It must identify at least one physical person. In addition, it can also identify its medical specialty and/or organisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AuthorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getAuthor();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AuthorType value);

	/**
	 * Returns the value of the '<em><b>Redactor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the redactor identifies the context of transcription or generation of the content of the transaction. It can identifiy a physicial person like a secretary, nurse, ... and possibly its department and/or organisation. It can
	 *             also represent a robot for automatic content generation, an application for example.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redactor</em>' containment reference.
	 * @see #setRedactor(AuthorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Redactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='redactor' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorType getRedactor();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRedactor <em>Redactor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redactor</em>' containment reference.
	 * @see #getRedactor()
	 * @generated
	 */
	void setRedactor(AuthorType value);

	/**
	 * Returns the value of the '<em><b>Iscomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify if the transaction is partial or complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iscomplete</em>' attribute.
	 * @see #isSetIscomplete()
	 * @see #unsetIscomplete()
	 * @see #setIscomplete(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Iscomplete()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='iscomplete' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIscomplete();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete <em>Iscomplete</em>}' attribute.
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
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIscomplete()
	 * @see #isIscomplete()
	 * @see #setIscomplete(boolean)
	 * @generated
	 */
	void unsetIscomplete();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete <em>Iscomplete</em>}' attribute is set.
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
	 * <!-- begin-model-doc -->
	 * to specify if the content of the transaction has been medically validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isvalidated</em>' attribute.
	 * @see #isSetIsvalidated()
	 * @see #unsetIsvalidated()
	 * @see #setIsvalidated(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Isvalidated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isvalidated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsvalidated();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated <em>Isvalidated</em>}' attribute.
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
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsvalidated()
	 * @see #isIsvalidated()
	 * @see #setIsvalidated(boolean)
	 * @generated
	 */
	void unsetIsvalidated();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated <em>Isvalidated</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Expirationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expiration date of the prescription/transaction, can be used to remove a prescription from a prescription server
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expirationdate</em>' attribute.
	 * @see #setExpirationdate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Expirationdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='expirationdate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationdate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getExpirationdate <em>Expirationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expirationdate</em>' attribute.
	 * @see #getExpirationdate()
	 * @generated
	 */
	void setExpirationdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:10'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Heading()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<HeadingType> getHeading();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Item()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Text()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Text With Layout</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text With Layout</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_TextWithLayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-with-layout' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TextWithLayoutType> getTextWithLayout();

	/**
	 * Returns the value of the '<em><b>Lnk</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to link the transaction with another element of the Belgian Healthcare Telematics System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Lnk()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<LnkType> getLnk();

	/**
	 * Returns the value of the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorddatetime</em>' attribute.
	 * @see #setRecorddatetime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Recorddatetime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='recorddatetime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRecorddatetime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRecorddatetime <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorddatetime</em>' attribute.
	 * @see #getRecorddatetime()
	 * @generated
	 */
	void setRecorddatetime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getTransactionType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // TransactionType
