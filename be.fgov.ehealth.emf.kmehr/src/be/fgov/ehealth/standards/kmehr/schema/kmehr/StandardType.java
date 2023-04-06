/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDSTANDARD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to specify the version of the kmehr specification to which this message complies
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getStandardType()
 * @model extendedMetaData="name='standardType' kind='elementOnly'"
 * @generated
 */
public interface StandardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDSTANDARD)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getStandardType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDSTANDARD getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDSTANDARD value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' containment reference.
	 * @see #setSpecialisation(SpecialisationType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getStandardType_Specialisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialisation' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecialisationType getSpecialisation();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getSpecialisation <em>Specialisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' containment reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(SpecialisationType value);

} // StandardType
