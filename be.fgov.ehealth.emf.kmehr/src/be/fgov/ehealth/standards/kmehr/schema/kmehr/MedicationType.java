/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated at 01/01/2009, this complex type has been retained for backward compatibility only
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInn <em>Inn</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getMagistral <em>Magistral</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getTradename <em>Tradename</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getStrength <em>Strength</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getRoute <em>Route</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getBatch <em>Batch</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getNumberofpackage <em>Numberofpackage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPackage <em>Package</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getQuantityperpackage <em>Quantityperpackage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforpatient <em>Instructionforpatient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType()
 * @model extendedMetaData="name='medicationType' kind='elementOnly'"
 * @generated
 */
public interface MedicationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify a CNK
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(CDMEDICATION)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	CDMEDICATION getCd();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CDMEDICATION value);

	/**
	 * Returns the value of the '<em><b>Inn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify an international non-proprietary name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inn</em>' containment reference.
	 * @see #setInn(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Inn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inn' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInn();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInn <em>Inn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inn</em>' containment reference.
	 * @see #getInn()
	 * @generated
	 */
	void setInn(TextType value);

	/**
	 * Returns the value of the '<em><b>Magistral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to describe a magistral prescription as free text, possibly complemented by a list of CNK
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Magistral</em>' containment reference.
	 * @see #setMagistral(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Magistral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='magistral' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getMagistral();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getMagistral <em>Magistral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magistral</em>' containment reference.
	 * @see #getMagistral()
	 * @generated
	 */
	void setMagistral(TextType value);

	/**
	 * Returns the value of the '<em><b>Tradename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tradename</em>' attribute.
	 * @see #setTradename(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Tradename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='tradename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTradename();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getTradename <em>Tradename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tradename</em>' attribute.
	 * @see #getTradename()
	 * @generated
	 */
	void setTradename(String value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(PresentationType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Presentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentation' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationType getPresentation();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(PresentationType value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(StrengthType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	StrengthType getStrength();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(StrengthType value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(RouteType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteType getRoute();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteType value);

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * serial number of the product package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch</em>' attribute.
	 * @see #setBatch(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Batch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='batch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBatch();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getBatch <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch</em>' attribute.
	 * @see #getBatch()
	 * @generated
	 */
	void setBatch(String value);

	/**
	 * Returns the value of the '<em><b>Numberofpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numberofpackage</em>' attribute.
	 * @see #setNumberofpackage(BigDecimal)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Numberofpackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='numberofpackage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNumberofpackage();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getNumberofpackage <em>Numberofpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberofpackage</em>' attribute.
	 * @see #getNumberofpackage()
	 * @generated
	 */
	void setNumberofpackage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Package()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageType getPackage();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Quantityperpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantityperpackage</em>' attribute.
	 * @see #setQuantityperpackage(BigDecimal)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Quantityperpackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='quantityperpackage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQuantityperpackage();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getQuantityperpackage <em>Quantityperpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantityperpackage</em>' attribute.
	 * @see #getQuantityperpackage()
	 * @generated
	 */
	void setQuantityperpackage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Instructionforoverdosing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to justify voluntary 'overdosing'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructionforoverdosing</em>' containment reference.
	 * @see #setInstructionforoverdosing(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Instructionforoverdosing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforoverdosing' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforoverdosing();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforoverdosing</em>' containment reference.
	 * @see #getInstructionforoverdosing()
	 * @generated
	 */
	void setInstructionforoverdosing(TextType value);

	/**
	 * Returns the value of the '<em><b>Instructionforpatient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructionforpatient</em>' containment reference.
	 * @see #setInstructionforpatient(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Instructionforpatient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforpatient' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforpatient();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforpatient <em>Instructionforpatient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforpatient</em>' containment reference.
	 * @see #getInstructionforpatient()
	 * @generated
	 */
	void setInstructionforpatient(TextType value);

	/**
	 * Returns the value of the '<em><b>Instructionforreimbursement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  to indicate the type of reimbursement based on medical justification for treatment 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructionforreimbursement</em>' containment reference.
	 * @see #setInstructionforreimbursement(TextType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Instructionforreimbursement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionforreimbursement' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getInstructionforreimbursement();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionforreimbursement</em>' containment reference.
	 * @see #getInstructionforreimbursement()
	 * @generated
	 */
	void setInstructionforreimbursement(TextType value);

	/**
	 * Returns the value of the '<em><b>Issubstitutionallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify if the substitution by the pharmacist is allowed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issubstitutionallowed</em>' attribute.
	 * @see #isSetIssubstitutionallowed()
	 * @see #unsetIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getMedicationType_Issubstitutionallowed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='issubstitutionallowed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIssubstitutionallowed();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issubstitutionallowed</em>' attribute.
	 * @see #isSetIssubstitutionallowed()
	 * @see #unsetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @generated
	 */
	void setIssubstitutionallowed(boolean value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @generated
	 */
	void unsetIssubstitutionallowed();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issubstitutionallowed</em>' attribute is set.
	 * @see #unsetIssubstitutionallowed()
	 * @see #isIssubstitutionallowed()
	 * @see #setIssubstitutionallowed(boolean)
	 * @generated
	 */
	boolean isSetIssubstitutionallowed();

} // MedicationType
