/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDSUBSTANCE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getSubstancename <em>Substancename</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceType()
 * @model extendedMetaData="name='substanceType' kind='elementOnly'"
 * @generated
 */
public interface SubstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the substance using a INNCLUSTER, ATC or EAN code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDSUBSTANCE)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDSUBSTANCE getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDSUBSTANCE value);

	/**
	 * Returns the value of the '<em><b>Substancename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substancename</em>' attribute.
	 * @see #setSubstancename(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceType_Substancename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='substancename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubstancename();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getSubstancename <em>Substancename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substancename</em>' attribute.
	 * @see #getSubstancename()
	 * @generated
	 */
	void setSubstancename(String value);

} // SubstanceType
