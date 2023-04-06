/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDINNCLUSTER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substanceproduct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedcd <em>Intendedcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredcd <em>Deliveredcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedname <em>Intendedname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredname <em>Deliveredname</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceproductType()
 * @model extendedMetaData="name='substanceproduct_._type' kind='elementOnly'"
 * @generated
 */
public interface SubstanceproductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Intendedcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code of the INN cluster: should be in Belgium a selection out of a table, once available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intendedcd</em>' containment reference.
	 * @see #setIntendedcd(CDINNCLUSTER)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceproductType_Intendedcd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intendedcd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDINNCLUSTER getIntendedcd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedcd <em>Intendedcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intendedcd</em>' containment reference.
	 * @see #getIntendedcd()
	 * @generated
	 */
	void setIntendedcd(CDINNCLUSTER value);

	/**
	 * Returns the value of the '<em><b>Deliveredcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * in Belgium the effective delivered CNK code out of the drug database
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliveredcd</em>' containment reference.
	 * @see #setDeliveredcd(CDDRUGCNK)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceproductType_Deliveredcd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliveredcd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDDRUGCNK getDeliveredcd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredcd <em>Deliveredcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliveredcd</em>' containment reference.
	 * @see #getDeliveredcd()
	 * @generated
	 */
	void setDeliveredcd(CDDRUGCNK value);

	/**
	 * Returns the value of the '<em><b>Intendedname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * descriptive name of the INN based cluster: INN name + strength + generic pharmaceutical form or physical form + route of administration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intendedname</em>' attribute.
	 * @see #setIntendedname(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceproductType_Intendedname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='intendedname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIntendedname();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedname <em>Intendedname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intendedname</em>' attribute.
	 * @see #getIntendedname()
	 * @generated
	 */
	void setIntendedname(String value);

	/**
	 * Returns the value of the '<em><b>Deliveredname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliveredname</em>' attribute.
	 * @see #setDeliveredname(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSubstanceproductType_Deliveredname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='deliveredname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveredname();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredname <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliveredname</em>' attribute.
	 * @see #getDeliveredname()
	 * @generated
	 */
	void setDeliveredname(String value);

} // SubstanceproductType
