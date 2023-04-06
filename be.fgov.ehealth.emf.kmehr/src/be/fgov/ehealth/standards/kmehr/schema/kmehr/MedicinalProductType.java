/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         a medicinal product can be identified
 *         unambiguously by a CNK code identifying
 *         a package. The descriptive
 *         identification is only mandatory in case
 *         of absence of a package ID.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedcd <em>Intendedcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredcd <em>Deliveredcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedname <em>Intendedname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredname <em>Deliveredname</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicinalProductType()
 * @model extendedMetaData="name='medicinalProductType' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Intendedcd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             in Belgium a selected CNK code
	 *             out of the drug database
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intendedcd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicinalProductType_Intendedcd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intendedcd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDDRUGCNK> getIntendedcd();

	/**
	 * Returns the value of the '<em><b>Deliveredcd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             in Belgium the effective
	 *             delivered CNK code out of the
	 *             drug database
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliveredcd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicinalProductType_Deliveredcd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliveredcd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDDRUGCNK> getDeliveredcd();

	/**
	 * Returns the value of the '<em><b>Intendedname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             descriptive name in the package
	 *             database, in Belgium the name
	 *             use in the pharmacy database
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intendedname</em>' attribute.
	 * @see #setIntendedname(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicinalProductType_Intendedname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='intendedname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIntendedname();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedname <em>Intendedname</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicinalProductType_Deliveredname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='deliveredname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveredname();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredname <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliveredname</em>' attribute.
	 * @see #getDeliveredname()
	 * @generated
	 */
	void setDeliveredname(String value);

} // MedicinalProductType
