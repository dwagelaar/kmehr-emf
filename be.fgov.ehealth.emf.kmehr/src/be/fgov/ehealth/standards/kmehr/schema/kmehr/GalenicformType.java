/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDGALENICFORM;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galenicform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getGalenicformtext <em>Galenicformtext</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getGalenicformType()
 * @model extendedMetaData="name='galenicformType' kind='elementOnly'"
 * @generated
 */
public interface GalenicformType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             refers to a value of the reference table galenic
	 *             forms
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDGALENICFORM)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getGalenicformType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDGALENICFORM getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDGALENICFORM value);

	/**
	 * Returns the value of the '<em><b>Galenicformtext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * galenic form as free text
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galenicformtext</em>' containment reference.
	 * @see #setGalenicformtext(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getGalenicformType_Galenicformtext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='galenicformtext' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getGalenicformtext();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getGalenicformtext <em>Galenicformtext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Galenicformtext</em>' containment reference.
	 * @see #getGalenicformtext()
	 * @generated
	 */
	void setGalenicformtext(TextType value);

} // GalenicformType
