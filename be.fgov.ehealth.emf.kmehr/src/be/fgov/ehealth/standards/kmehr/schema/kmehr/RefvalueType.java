/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refvalue Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMinref <em>Minref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMaxref <em>Maxref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRefvalueType()
 * @model extendedMetaData="name='refvalue_._type' kind='elementOnly'"
 * @generated
 */
public interface RefvalueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Minref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minref</em>' containment reference.
	 * @see #setMinref(MinrefType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRefvalueType_Minref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minref' namespace='##targetNamespace'"
	 * @generated
	 */
	MinrefType getMinref();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMinref <em>Minref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minref</em>' containment reference.
	 * @see #getMinref()
	 * @generated
	 */
	void setMinref(MinrefType value);

	/**
	 * Returns the value of the '<em><b>Maxref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxref</em>' containment reference.
	 * @see #setMaxref(MaxrefType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRefvalueType_Maxref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxref' namespace='##targetNamespace'"
	 * @generated
	 */
	MaxrefType getMaxref();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMaxref <em>Maxref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxref</em>' containment reference.
	 * @see #getMaxref()
	 * @generated
	 */
	void setMaxref(MaxrefType value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getRefvalueType_Context()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getContext();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(TextType value);

} // RefvalueType
