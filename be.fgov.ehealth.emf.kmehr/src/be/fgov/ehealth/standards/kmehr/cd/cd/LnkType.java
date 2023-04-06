/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lnk Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getMEDIATYPE <em>MEDIATYPE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType()
 * @model extendedMetaData="name='lnkType' kind='simple'"
 * @generated
 */
public interface LnkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>MEDIATYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDIATYPEvalues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEDIATYPE</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDIATYPEvalues
	 * @see #isSetMEDIATYPE()
	 * @see #unsetMEDIATYPE()
	 * @see #setMEDIATYPE(CDMEDIATYPEvalues)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType_MEDIATYPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MEDIATYPE'"
	 * @generated
	 */
	CDMEDIATYPEvalues getMEDIATYPE();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getMEDIATYPE <em>MEDIATYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEDIATYPE</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDIATYPEvalues
	 * @see #isSetMEDIATYPE()
	 * @see #unsetMEDIATYPE()
	 * @see #getMEDIATYPE()
	 * @generated
	 */
	void setMEDIATYPE(CDMEDIATYPEvalues value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getMEDIATYPE <em>MEDIATYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMEDIATYPE()
	 * @see #getMEDIATYPE()
	 * @see #setMEDIATYPE(CDMEDIATYPEvalues)
	 * @generated
	 */
	void unsetMEDIATYPE();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getMEDIATYPE <em>MEDIATYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MEDIATYPE</em>' attribute is set.
	 * @see #unsetMEDIATYPE()
	 * @see #getMEDIATYPE()
	 * @see #setMEDIATYPE(CDMEDIATYPEvalues)
	 * @generated
	 */
	boolean isSetMEDIATYPE();

	/**
	 * Returns the value of the '<em><b>SIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIZE</em>' attribute.
	 * @see #setSIZE(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType_SIZE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SIZE'"
	 * @generated
	 */
	String getSIZE();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getSIZE <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIZE</em>' attribute.
	 * @see #getSIZE()
	 * @generated
	 */
	void setSIZE(String value);

	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDLNKvalues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDLNKvalues
	 * @see #isSetTYPE()
	 * @see #unsetTYPE()
	 * @see #setTYPE(CDLNKvalues)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType_TYPE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='TYPE'"
	 * @generated
	 */
	CDLNKvalues getTYPE();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getTYPE <em>TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' attribute.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDLNKvalues
	 * @see #isSetTYPE()
	 * @see #unsetTYPE()
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(CDLNKvalues value);

	/**
	 * Unsets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getTYPE <em>TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTYPE()
	 * @see #getTYPE()
	 * @see #setTYPE(CDLNKvalues)
	 * @generated
	 */
	void unsetTYPE();

	/**
	 * Returns whether the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getTYPE <em>TYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>TYPE</em>' attribute is set.
	 * @see #unsetTYPE()
	 * @see #getTYPE()
	 * @see #setTYPE(CDLNKvalues)
	 * @generated
	 */
	boolean isSetTYPE();

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getLnkType_URL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='URL'"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

} // LnkType
