/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDPROFESSION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSL <em>SL</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSION()
 * @model extendedMetaData="name='ID-PROFESSION' kind='simple'"
 * @generated
 */
public interface IDPROFESSION extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSION_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #setS(IDPROFESSIONschemes)
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSION_S()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='S'"
	 * @generated
	 */
	IDPROFESSIONschemes getS();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @see #isSetS()
	 * @see #unsetS()
	 * @see #getS()
	 * @generated
	 */
	void setS(IDPROFESSIONschemes value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetS()
	 * @see #getS()
	 * @see #setS(IDPROFESSIONschemes)
	 * @generated
	 */
	void unsetS();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS <em>S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>S</em>' attribute is set.
	 * @see #unsetS()
	 * @see #getS()
	 * @see #setS(IDPROFESSIONschemes)
	 * @generated
	 */
	boolean isSetS();

	/**
	 * Returns the value of the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SL</em>' attribute.
	 * @see #setSL(String)
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSION_SL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SL'"
	 * @generated
	 */
	String getSL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSL <em>SL</em>}' attribute.
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
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSION_SV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SV'"
	 * @generated
	 */
	String getSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #getSV()
	 * @generated
	 */
	void setSV(String value);

} // IDPROFESSION
