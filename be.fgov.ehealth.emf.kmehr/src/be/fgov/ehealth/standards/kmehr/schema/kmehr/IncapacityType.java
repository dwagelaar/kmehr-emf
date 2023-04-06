/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITY;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incapacity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getIncapacityreason <em>Incapacityreason</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed <em>Outofhomeallowed</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getIncapacityType()
 * @model extendedMetaData="name='incapacityType' kind='elementOnly'"
 * @generated
 */
public interface IncapacityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getIncapacityType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDINCAPACITY> getCd();

	/**
	 * Returns the value of the '<em><b>Incapacityreason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incapacityreason</em>' containment reference.
	 * @see #setIncapacityreason(IncapacityreasonType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getIncapacityType_Incapacityreason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incapacityreason' namespace='##targetNamespace'"
	 * @generated
	 */
	IncapacityreasonType getIncapacityreason();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getIncapacityreason <em>Incapacityreason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incapacityreason</em>' containment reference.
	 * @see #getIncapacityreason()
	 * @generated
	 */
	void setIncapacityreason(IncapacityreasonType value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(BigDecimal)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getIncapacityType_Percentage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='percentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPercentage();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Outofhomeallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outofhomeallowed</em>' attribute.
	 * @see #isSetOutofhomeallowed()
	 * @see #unsetOutofhomeallowed()
	 * @see #setOutofhomeallowed(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getIncapacityType_Outofhomeallowed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='outofhomeallowed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOutofhomeallowed();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed <em>Outofhomeallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outofhomeallowed</em>' attribute.
	 * @see #isSetOutofhomeallowed()
	 * @see #unsetOutofhomeallowed()
	 * @see #isOutofhomeallowed()
	 * @generated
	 */
	void setOutofhomeallowed(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed <em>Outofhomeallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutofhomeallowed()
	 * @see #isOutofhomeallowed()
	 * @see #setOutofhomeallowed(boolean)
	 * @generated
	 */
	void unsetOutofhomeallowed();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed <em>Outofhomeallowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outofhomeallowed</em>' attribute is set.
	 * @see #unsetOutofhomeallowed()
	 * @see #isOutofhomeallowed()
	 * @see #setOutofhomeallowed(boolean)
	 * @generated
	 */
	boolean isSetOutofhomeallowed();

} // IncapacityType
