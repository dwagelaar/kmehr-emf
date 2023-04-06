/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compoundprescription Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         a magistral preparation can be prescribed as a (coded)
 *         reference to a preparation in a reference book (formularyreference), or as a
 *         (coded) list of individual compounds (compoundlist), or as free text
 *         (magistraltext)
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getCompound <em>Compound</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getFormularyreference <em>Formularyreference</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMagistraltext <em>Magistraltext</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getGalenicform <em>Galenicform</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getL <em>L</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType()
 * @model extendedMetaData="name='compoundprescriptionType' kind='mixed'"
 * @generated
 */
public interface CompoundprescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Compound</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               a list of compounds to be used in a
	 *               magistral preparation
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Compound()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compound' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompoundType> getCompound();

	/**
	 * Returns the value of the '<em><b>Formularyreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               a reference to an official formulary for
	 *               magistral preparations (eg TMF, NF6)
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formularyreference</em>' containment reference.
	 * @see #setFormularyreference(FormularyreferenceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Formularyreference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formularyreference' namespace='##targetNamespace'"
	 * @generated
	 */
	FormularyreferenceType getFormularyreference();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getFormularyreference <em>Formularyreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formularyreference</em>' containment reference.
	 * @see #getFormularyreference()
	 * @generated
	 */
	void setFormularyreference(FormularyreferenceType value);

	/**
	 * Returns the value of the '<em><b>Magistraltext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * magistral preparation as free text
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Magistraltext</em>' containment reference.
	 * @see #setMagistraltext(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Magistraltext()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='magistraltext' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getMagistraltext();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMagistraltext <em>Magistraltext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magistraltext</em>' containment reference.
	 * @see #getMagistraltext()
	 * @generated
	 */
	void setMagistraltext(TextType value);

	/**
	 * Returns the value of the '<em><b>Galenicform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Used to specify the galenic form. Can be a value
	 *             from the reference table GALENIC_FORMS or free
	 *             text
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galenicform</em>' containment reference.
	 * @see #setGalenicform(GalenicformType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Galenicform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='galenicform' namespace='##targetNamespace'"
	 * @generated
	 */
	GalenicformType getGalenicform();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getGalenicform <em>Galenicform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Galenicform</em>' containment reference.
	 * @see #getGalenicform()
	 * @generated
	 */
	void setGalenicform(GalenicformType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_Quantity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' attribute.
	 * @see #setL(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getCompoundprescriptionType_L()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='L'"
	 * @generated
	 */
	String getL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getL <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' attribute.
	 * @see #getL()
	 * @generated
	 */
	void setL(String value);

} // CompoundprescriptionType
