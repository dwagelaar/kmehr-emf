/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDTHERAPEUTICLINK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getDN <em>DN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getL <em>L</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getSL <em>SL</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK()
 * @model extendedMetaData="name='CD-THERAPEUTICLINK' kind='simple'"
 * @generated
 */
public interface CDTHERAPEUTICLINK extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_Value()
	 * @model dataType="be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINKvalues"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getValue <em>Value</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_DN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DN'"
	 * @generated
	 */
	String getDN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getDN <em>DN</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_L()
	 * @model default="en" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='L'"
	 * @generated
	 */
	String getL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getL <em>L</em>}' attribute.
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
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getL <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetL()
	 * @see #getL()
	 * @see #setL(String)
	 * @generated
	 */
	void unsetL();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getL <em>L</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINKschemes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINKschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #setS(CDTHERAPEUTICLINKschemes)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_S()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='S'"
	 * @generated
	 */
	CDTHERAPEUTICLINKschemes getS();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINKschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #getS()
	 * @generated
	 */
	void setS(CDTHERAPEUTICLINKschemes value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetS()
	 * @see #getS()
	 * @see #setS(CDTHERAPEUTICLINKschemes)
	 * @generated
	 */
	void unsetS();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #unsetS()
	 * @see #getS()
	 * @see #setS(CDTHERAPEUTICLINKschemes)
	 * @generated
	 */
	boolean isSetS();

	/**
	 * Returns the value of the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SL</em>' attribute.
	 * @see #setSL(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_SL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SL'"
	 * @generated
	 */
	String getSL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getSL <em>SL</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTHERAPEUTICLINK_SV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SV'"
	 * @generated
	 */
	String getSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #getSV()
	 * @generated
	 */
	void setSV(String value);

} // CDTHERAPEUTICLINK
