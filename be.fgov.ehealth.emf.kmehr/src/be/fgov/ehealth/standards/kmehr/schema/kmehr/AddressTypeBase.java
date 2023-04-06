/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDADDRESS;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCountry <em>Country</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getZip <em>Zip</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getNis <em>Nis</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCity <em>City</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getDistrict <em>District</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getStreet <em>Street</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getPostboxnumber <em>Postboxnumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase()
 * @model extendedMetaData="name='addressTypeBase' kind='elementOnly'"
 * @generated
 */
public interface AddressTypeBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Id()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDKMEHR> getId();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.cd.cd.CDADDRESS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * to specify the type of address (home, work,...)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDADDRESS> getCd();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CountryType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CountryType getCountry();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Zip()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='zip' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>Nis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 NumÃ©ro d'identification statistique
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nis</em>' attribute.
	 * @see #setNis(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Nis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='nis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNis();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getNis <em>Nis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nis</em>' attribute.
	 * @see #getNis()
	 * @generated
	 */
	void setNis(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_City()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 District identification for the cities of Antwerpen-Anvers and Doornik-Tournai.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>District</em>' attribute.
	 * @see #setDistrict(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_District()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='district' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistrict();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' attribute.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Street()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='street' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Housenumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housenumber</em>' attribute.
	 * @see #setHousenumber(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Housenumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='housenumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHousenumber();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getHousenumber <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housenumber</em>' attribute.
	 * @see #getHousenumber()
	 * @generated
	 */
	void setHousenumber(String value);

	/**
	 * Returns the value of the '<em><b>Postboxnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postboxnumber</em>' attribute.
	 * @see #setPostboxnumber(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Postboxnumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postboxnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostboxnumber();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getPostboxnumber <em>Postboxnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postboxnumber</em>' attribute.
	 * @see #getPostboxnumber()
	 * @generated
	 */
	void setPostboxnumber(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getAddressTypeBase_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

} // AddressTypeBase
