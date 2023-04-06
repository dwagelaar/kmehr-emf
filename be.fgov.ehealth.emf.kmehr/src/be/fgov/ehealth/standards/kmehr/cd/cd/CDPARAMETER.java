/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDPARAMETER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getDN <em>DN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getL <em>L</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER()
 * @model extendedMetaData="name='CD-PARAMETER' kind='simple'"
 * @generated
 */
public interface CDPARAMETER extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETERvalues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETERvalues
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CDPARAMETERvalues)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	CDPARAMETERvalues getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETERvalues
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CDPARAMETERvalues value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CDPARAMETERvalues)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CDPARAMETERvalues)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>DN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DN</em>' attribute.
	 * @see #setDN(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER_DN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DN'"
	 * @generated
	 */
	String getDN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getDN <em>DN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DN</em>' attribute.
	 * @see #getDN()
	 * @generated
	 */
	void setDN(String value);

	/**
	 * Returns the value of the '<em><b>L</b></em>' attribute.
	 * The default value is <code>"en"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' attribute.
	 * @see #isSetL()
	 * @see #unsetL()
	 * @see #setL(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER_L()
	 * @model default="en" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='L'"
	 * @generated
	 */
	String getL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getL <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' attribute.
	 * @see #isSetL()
	 * @see #unsetL()
	 * @see #getL()
	 * @generated
	 */
	void setL(String value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getL <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetL()
	 * @see #getL()
	 * @see #setL(String)
	 * @generated
	 */
	void unsetL();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getL <em>L</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>L</em>' attribute is set.
	 * @see #unsetL()
	 * @see #getL()
	 * @see #setL(String)
	 * @generated
	 */
	boolean isSetL();

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * The default value is <code>"CD-PARAMETER"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #setS(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER_S()
	 * @model default="CD-PARAMETER" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='S'"
	 * @generated
	 */
	String getS();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #getS()
	 * @generated
	 */
	void setS(String value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetS()
	 * @see #getS()
	 * @see #setS(String)
	 * @generated
	 */
	void unsetS();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #unsetS()
	 * @see #getS()
	 * @see #setS(String)
	 * @generated
	 */
	boolean isSetS();

	/**
	 * Returns the value of the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SV</em>' attribute.
	 * @see #setSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPARAMETER_SV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SV'"
	 * @generated
	 */
	String getSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #getSV()
	 * @generated
	 */
	void setSV(String value);

} // CDPARAMETER
