/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * frequency of applying the periodic posology, only in case of a constant scheme during a period of time
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getNominator <em>Nominator</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getUnit <em>Unit</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getPeriodicity <em>Periodicity</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType()
 * @model extendedMetaData="name='frequencyType' kind='elementOnly'"
 * @generated
 */
public interface FrequencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominator</em>' containment reference.
	 * @see #setNominator(NominatorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Nominator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nominator' namespace='##targetNamespace'"
	 * @generated
	 */
	NominatorType getNominator();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getNominator <em>Nominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominator</em>' containment reference.
	 * @see #getNominator()
	 * @generated
	 */
	void setNominator(NominatorType value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(DenominatorType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Denominator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	DenominatorType getDenominator();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(DenominatorType value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(BigDecimal)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Decimal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='decimal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimal();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getText();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextType value);

	/**
	 * Returns the value of the '<em><b>Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify the frequency using a coded periodicity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Periodicity</em>' containment reference.
	 * @see #setPeriodicity(PeriodicityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFrequencyType_Periodicity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodicity' namespace='##targetNamespace'"
	 * @generated
	 */
	PeriodicityType getPeriodicity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getPeriodicity <em>Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity</em>' containment reference.
	 * @see #getPeriodicity()
	 * @generated
	 */
	void setPeriodicity(PeriodicityType value);

} // FrequencyType
