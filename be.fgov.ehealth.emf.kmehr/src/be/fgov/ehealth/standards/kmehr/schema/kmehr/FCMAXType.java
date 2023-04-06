/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FCMAX Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getTIME <em>TIME</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFCMAXType()
 * @model extendedMetaData="name='FCMAXType' kind='simple'"
 * @generated
 */
public interface FCMAXType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFCMAXType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>TIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIME</em>' attribute.
	 * @see #setTIME(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getFCMAXType_TIME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='TIME'"
	 * @generated
	 */
	String getTIME();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getTIME <em>TIME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIME</em>' attribute.
	 * @see #getTIME()
	 * @generated
	 */
	void setTIME(String value);

} // FCMAXType
