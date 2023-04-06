/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to specify the value of the item
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt <em>Unsigned Int</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYear <em>Year</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYearmonth <em>Yearmonth</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHcparty <em>Hcparty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getPerson <em>Person</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getIncapacity <em>Incapacity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getError <em>Error</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedicinalproduct <em>Medicinalproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getSubstanceproduct <em>Substanceproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCompoundprescription <em>Compoundprescription</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedication <em>Medication</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHolter <em>Holter</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getEcg <em>Ecg</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getBacteriology <em>Bacteriology</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLocation <em>Location</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnit <em>Unit</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMinref <em>Minref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMaxref <em>Maxref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getRefscope <em>Refscope</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType()
 * @model extendedMetaData="name='contentType' kind='elementOnly'"
 * @generated
 */
public interface ContentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Id()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDCONTENT> getCd();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(BigDecimal)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Decimal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='decimal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimal();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unsigned Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Int</em>' attribute.
	 * @see #isSetUnsignedInt()
	 * @see #unsetUnsignedInt()
	 * @see #setUnsignedInt(long)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_UnsignedInt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='unsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUnsignedInt();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt <em>Unsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Int</em>' attribute.
	 * @see #isSetUnsignedInt()
	 * @see #unsetUnsignedInt()
	 * @see #getUnsignedInt()
	 * @generated
	 */
	void setUnsignedInt(long value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt <em>Unsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnsignedInt()
	 * @see #getUnsignedInt()
	 * @see #setUnsignedInt(long)
	 * @generated
	 */
	void unsetUnsignedInt();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt <em>Unsigned Int</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unsigned Int</em>' attribute is set.
	 * @see #unsetUnsignedInt()
	 * @see #getUnsignedInt()
	 * @see #setUnsignedInt(long)
	 * @generated
	 */
	boolean isSetUnsignedInt();

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #setBoolean(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Boolean()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBoolean();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @generated
	 */
	void setBoolean(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	void unsetBoolean();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean <em>Boolean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean</em>' attribute is set.
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	boolean isSetBoolean();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYear();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Yearmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yearmonth</em>' attribute.
	 * @see #setYearmonth(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Yearmonth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYearMonth"
	 *        extendedMetaData="kind='element' name='yearmonth' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYearmonth();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYearmonth <em>Yearmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yearmonth</em>' attribute.
	 * @see #getYearmonth()
	 * @generated
	 */
	void setYearmonth(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDate <em>Date</em>}' attribute.
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
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Hcparty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hcparty</em>' containment reference.
	 * @see #setHcparty(HcpartyType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Hcparty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hcparty' namespace='##targetNamespace'"
	 * @generated
	 */
	HcpartyType getHcparty();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHcparty <em>Hcparty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hcparty</em>' containment reference.
	 * @see #getHcparty()
	 * @generated
	 */
	void setHcparty(HcpartyType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference.
	 * @see #setInsurance(InsuranceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	InsuranceType getInsurance();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getInsurance <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance</em>' containment reference.
	 * @see #getInsurance()
	 * @generated
	 */
	void setInsurance(InsuranceType value);

	/**
	 * Returns the value of the '<em><b>Incapacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incapacity</em>' containment reference.
	 * @see #setIncapacity(IncapacityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Incapacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	IncapacityType getIncapacity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getIncapacity <em>Incapacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incapacity</em>' containment reference.
	 * @see #getIncapacity()
	 * @generated
	 */
	void setIncapacity(IncapacityType value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(ErrorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorType getError();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(ErrorType value);

	/**
	 * Returns the value of the '<em><b>Medicinalproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identification of the prepacked medicinal products prescribed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinalproduct</em>' containment reference.
	 * @see #setMedicinalproduct(MedicinalProductType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Medicinalproduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicinalproduct' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductType getMedicinalproduct();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedicinalproduct <em>Medicinalproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinalproduct</em>' containment reference.
	 * @see #getMedicinalproduct()
	 * @generated
	 */
	void setMedicinalproduct(MedicinalProductType value);

	/**
	 * Returns the value of the '<em><b>Substanceproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * description of the INN or substance based cluster prescribed 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substanceproduct</em>' containment reference.
	 * @see #setSubstanceproduct(SubstanceproductType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Substanceproduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceproduct' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceproductType getSubstanceproduct();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getSubstanceproduct <em>Substanceproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substanceproduct</em>' containment reference.
	 * @see #getSubstanceproduct()
	 * @generated
	 */
	void setSubstanceproduct(SubstanceproductType value);

	/**
	 * Returns the value of the '<em><b>Compoundprescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compoundprescription</em>' containment reference.
	 * @see #setCompoundprescription(CompoundprescriptionType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Compoundprescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compoundprescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundprescriptionType getCompoundprescription();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCompoundprescription <em>Compoundprescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compoundprescription</em>' containment reference.
	 * @see #getCompoundprescription()
	 * @generated
	 */
	void setCompoundprescription(CompoundprescriptionType value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(MedicationType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationType getMedication();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(MedicationType value);

	/**
	 * Returns the value of the '<em><b>Holter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holter</em>' containment reference.
	 * @see #setHolter(HolterType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Holter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='holter' namespace='##targetNamespace'"
	 * @generated
	 */
	HolterType getHolter();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHolter <em>Holter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holter</em>' containment reference.
	 * @see #getHolter()
	 * @generated
	 */
	void setHolter(HolterType value);

	/**
	 * Returns the value of the '<em><b>Ecg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecg</em>' containment reference.
	 * @see #setEcg(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Ecg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ecg' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getEcg();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getEcg <em>Ecg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecg</em>' containment reference.
	 * @see #getEcg()
	 * @generated
	 */
	void setEcg(TextType value);

	/**
	 * Returns the value of the '<em><b>Bacteriology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bacteriology</em>' containment reference.
	 * @see #setBacteriology(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Bacteriology()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bacteriology' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getBacteriology();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getBacteriology <em>Bacteriology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bacteriology</em>' containment reference.
	 * @see #getBacteriology()
	 * @generated
	 */
	void setBacteriology(TextType value);

	/**
	 * Returns the value of the '<em><b>Lnk</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lnk</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Lnk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lnk' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LnkType> getLnk();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationBirthPlaceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationBirthPlaceType getLocation();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationBirthPlaceType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Returns the value of the '<em><b>Minref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minref</em>' containment reference.
	 * @see #setMinref(MinrefType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Minref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minref' namespace='##targetNamespace'"
	 * @generated
	 */
	MinrefType getMinref();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMinref <em>Minref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minref</em>' containment reference.
	 * @see #getMinref()
	 * @generated
	 */
	void setMinref(MinrefType value);

	/**
	 * Returns the value of the '<em><b>Maxref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxref</em>' containment reference.
	 * @see #setMaxref(MaxrefType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Maxref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxref' namespace='##targetNamespace'"
	 * @generated
	 */
	MaxrefType getMaxref();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMaxref <em>Maxref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxref</em>' containment reference.
	 * @see #getMaxref()
	 * @generated
	 */
	void setMaxref(MaxrefType value);

	/**
	 * Returns the value of the '<em><b>Refscope</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refscope</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getContentType_Refscope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refscope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RefscopeType> getRefscope();

} // ContentType
