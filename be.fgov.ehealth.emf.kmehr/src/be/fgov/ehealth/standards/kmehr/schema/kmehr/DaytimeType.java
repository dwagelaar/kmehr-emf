/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daytime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getDayperiod <em>Dayperiod</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getDaytimeType()
 * @model extendedMetaData="name='daytime_._type' kind='elementOnly'"
 * @generated
 */
public interface DaytimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * proposed hour-min of administration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getDaytimeType_Time()
	 * @model dataType="be.fgov.ehealth.standards.kmehr.dt.dt.Time"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Dayperiod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. before noon
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dayperiod</em>' containment reference.
	 * @see #setDayperiod(DayperiodType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getDaytimeType_Dayperiod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dayperiod' namespace='##targetNamespace'"
	 * @generated
	 */
	DayperiodType getDayperiod();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getDayperiod <em>Dayperiod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dayperiod</em>' containment reference.
	 * @see #getDayperiod()
	 * @generated
	 */
	void setDayperiod(DayperiodType value);

} // DaytimeType
