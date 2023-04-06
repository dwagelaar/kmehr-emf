/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getMedicinalproduct <em>Medicinalproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getSubstance <em>Substance</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantityprefix <em>Quantityprefix</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType()
 * @model extendedMetaData="name='compoundType' kind='elementOnly'"
 * @generated
 */
public interface CompoundType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType_Id()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Medicinalproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               identification of the prepacked medicinal
	 *               products prescribed
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinalproduct</em>' containment reference.
	 * @see #setMedicinalproduct(MedicinalProductType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType_Medicinalproduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicinalproduct' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductType getMedicinalproduct();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getMedicinalproduct <em>Medicinalproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinalproduct</em>' containment reference.
	 * @see #getMedicinalproduct()
	 * @generated
	 */
	void setMedicinalproduct(MedicinalProductType value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(SubstanceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceType getSubstance();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(SubstanceType value);

	/**
	 * Returns the value of the '<em><b>Quantityprefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to be used as a prefix for quantitiy (eg: ad 100
	 *             ml)
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantityprefix</em>' containment reference.
	 * @see #setQuantityprefix(QuantityprefixType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType_Quantityprefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantityprefix' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityprefixType getQuantityprefix();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantityprefix <em>Quantityprefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantityprefix</em>' containment reference.
	 * @see #getQuantityprefix()
	 * @generated
	 */
	void setQuantityprefix(QuantityprefixType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundType_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(QuantityType value);

} // CompoundType
