/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYear <em>Year</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYearmonth <em>Yearmonth</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType()
 * @model extendedMetaData="name='momentType' kind='elementOnly'"
 * @generated
 */
public interface MomentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType_Year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYear();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYear <em>Year</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType_Yearmonth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYearMonth"
	 *        extendedMetaData="kind='element' name='yearmonth' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYearmonth();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYearmonth <em>Yearmonth</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getDate <em>Date</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMomentType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getText();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextType value);

} // MomentType
