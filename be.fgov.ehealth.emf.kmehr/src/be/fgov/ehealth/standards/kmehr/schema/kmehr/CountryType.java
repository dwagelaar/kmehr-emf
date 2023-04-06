/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDCOUNTRY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType#getCd <em>Cd</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCountryType()
 * @model extendedMetaData="name='countryType' kind='elementOnly'"
 * @generated
 */
public interface CountryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDCOUNTRY)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCountryType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDCOUNTRY getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDCOUNTRY value);

} // CountryType
