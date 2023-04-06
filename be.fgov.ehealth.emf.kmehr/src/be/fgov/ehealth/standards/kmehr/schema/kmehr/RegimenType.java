/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regimen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaynumber <em>Daynumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaytime <em>Daytime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType()
 * @model extendedMetaData="name='regimen_._type' kind='elementOnly'"
 * @generated
 */
public interface RegimenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Daynumber</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to be used to precise the day of the week of applicability in case of dosage regimen changing over time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daynumber</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Daynumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='daynumber' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BigInteger> getDaynumber();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to be used to precise the date of applicability
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Date()
	 * @model unique="false" dataType="be.fgov.ehealth.standards.kmehr.dt.dt.Date" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getDate();

	/**
	 * Returns the value of the '<em><b>Weekday</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to be used to precise the day of the week of applicability
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weekday</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Weekday()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='weekday' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<WeekdayType1> getWeekday();

	/**
	 * Returns the value of the '<em><b>Daytime</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * proposed time of administration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daytime</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Daytime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='daytime' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DaytimeType> getDaytime();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * number of pharmaceutical product units per intake / per administration (piece, puff, ml,...)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRegimenType_Quantity()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AdministrationquantityType> getQuantity();

} // RegimenType
