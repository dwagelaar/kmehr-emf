/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETPERSONALPART;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personalpart Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonalpartType()
 * @model extendedMetaData="name='personalpart_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonalpartType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(IDKMEHR)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonalpartType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	IDKMEHR getId();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(IDKMEHR value);

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDCARENETPERSONALPART)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonalpartType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDCARENETPERSONALPART getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDCARENETPERSONALPART value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonalpartType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getDate <em>Date</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonalpartType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

} // PersonalpartType
