/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDEXTERNALSOURCE;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getVersion <em>Version</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getProof <em>Proof</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSourceType()
 * @model extendedMetaData="name='source_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEXTERNALSOURCE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSourceType_Cd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDEXTERNALSOURCE> getCd();

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' attribute.
	 * @see #setDatetime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSourceType_Datetime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='datetime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatetime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getDatetime <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' attribute.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSourceType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proof</em>' attribute.
	 * @see #setProof(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getSourceType_Proof()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='proof' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProof();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getProof <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proof</em>' attribute.
	 * @see #getProof()
	 * @generated
	 */
	void setProof(String value);

} // SourceType
