/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested <em>Reportrequested</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFeedbackType()
 * @model extendedMetaData="name='feedback_._type' kind='elementOnly'"
 * @generated
 */
public interface FeedbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reportrequested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reportrequested</em>' attribute.
	 * @see #isSetReportrequested()
	 * @see #unsetReportrequested()
	 * @see #setReportrequested(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFeedbackType_Reportrequested()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='reportrequested' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReportrequested();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested <em>Reportrequested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reportrequested</em>' attribute.
	 * @see #isSetReportrequested()
	 * @see #unsetReportrequested()
	 * @see #isReportrequested()
	 * @generated
	 */
	void setReportrequested(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested <em>Reportrequested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReportrequested()
	 * @see #isReportrequested()
	 * @see #setReportrequested(boolean)
	 * @generated
	 */
	void unsetReportrequested();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested <em>Reportrequested</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reportrequested</em>' attribute is set.
	 * @see #unsetReportrequested()
	 * @see #isReportrequested()
	 * @see #setReportrequested(boolean)
	 * @generated
	 */
	boolean isSetReportrequested();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFeedbackType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getText();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextType value);

} // FeedbackType
