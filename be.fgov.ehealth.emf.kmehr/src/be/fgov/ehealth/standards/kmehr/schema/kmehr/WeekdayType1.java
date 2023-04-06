/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weekday Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1#getWeeknumber <em>Weeknumber</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getWeekdayType1()
 * @model extendedMetaData="name='weekday_._type' kind='elementOnly'"
 * @generated
 */
public interface WeekdayType1 extends WeekdayType {
	/**
	 * Returns the value of the '<em><b>Weeknumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeknumber</em>' attribute.
	 * @see #setWeeknumber(BigInteger)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getWeekdayType1_Weeknumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='weeknumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWeeknumber();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1#getWeeknumber <em>Weeknumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weeknumber</em>' attribute.
	 * @see #getWeeknumber()
	 * @generated
	 */
	void setWeeknumber(BigInteger value);

} // WeekdayType1
