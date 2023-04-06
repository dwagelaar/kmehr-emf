/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDMEDICATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getDN <em>DN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getL <em>L</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getSL <em>SL</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION()
 * @model extendedMetaData="name='CD-MEDICATION' kind='simple'"
 * @generated
 */
public interface CDMEDICATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>DN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DN</em>' attribute.
	 * @see #setDN(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_DN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DN'"
	 * @generated
	 */
	String getDN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getDN <em>DN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DN</em>' attribute.
	 * @see #getDN()
	 * @generated
	 */
	void setDN(String value);

	/**
	 * Returns the value of the '<em><b>L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' attribute.
	 * @see #setL(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_L()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='L'"
	 * @generated
	 */
	String getL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getL <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' attribute.
	 * @see #getL()
	 * @generated
	 */
	void setL(String value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATIONschemes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATIONschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #setS(CDMEDICATIONschemes)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_S()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='S'"
	 * @generated
	 */
	CDMEDICATIONschemes getS();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATIONschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #getS()
	 * @generated
	 */
	void setS(CDMEDICATIONschemes value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetS()
	 * @see #getS()
	 * @see #setS(CDMEDICATIONschemes)
	 * @generated
	 */
	void unsetS();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #unsetS()
	 * @see #getS()
	 * @see #setS(CDMEDICATIONschemes)
	 * @generated
	 */
	boolean isSetS();

	/**
	 * Returns the value of the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SL</em>' attribute.
	 * @see #setSL(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_SL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SL'"
	 * @generated
	 */
	String getSL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getSL <em>SL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SL</em>' attribute.
	 * @see #getSL()
	 * @generated
	 */
	void setSL(String value);

	/**
	 * Returns the value of the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SV</em>' attribute.
	 * @see #setSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDICATION_SV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SV'"
	 * @generated
	 */
	String getSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #getSV()
	 * @generated
	 */
	void setSV(String value);

} // CDMEDICATION
