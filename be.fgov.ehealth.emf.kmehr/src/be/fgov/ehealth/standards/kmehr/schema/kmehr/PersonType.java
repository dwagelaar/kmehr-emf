/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthlocation <em>Birthlocation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathdate <em>Deathdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathlocation <em>Deathlocation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getSex <em>Sex</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getNationality <em>Nationality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getAddress <em>Address</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getUsuallanguage <em>Usuallanguage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getProfession <em>Profession</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancystatus <em>Insurancystatus</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancymembership <em>Insurancymembership</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getCivilstate <em>Civilstate</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType()
 * @model extendedMetaData="name='personType' kind='elementOnly'"
 * @generated
 */
public interface PersonType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDPATIENT> getId();

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Firstname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFirstname();

	/**
	 * Returns the value of the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Familyname</em>' attribute.
	 * @see #setFamilyname(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Familyname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='familyname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFamilyname();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFamilyname <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familyname</em>' attribute.
	 * @see #getFamilyname()
	 * @generated
	 */
	void setFamilyname(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' containment reference.
	 * @see #setBirthdate(DateType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Birthdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthdate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getBirthdate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthdate <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' containment reference.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(DateType value);

	/**
	 * Returns the value of the '<em><b>Birthlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthlocation</em>' containment reference.
	 * @see #setBirthlocation(AddressTypeBase)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Birthlocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthlocation' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressTypeBase getBirthlocation();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthlocation <em>Birthlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthlocation</em>' containment reference.
	 * @see #getBirthlocation()
	 * @generated
	 */
	void setBirthlocation(AddressTypeBase value);

	/**
	 * Returns the value of the '<em><b>Deathdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deathdate</em>' containment reference.
	 * @see #setDeathdate(DateType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Deathdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deathdate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getDeathdate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathdate <em>Deathdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deathdate</em>' containment reference.
	 * @see #getDeathdate()
	 * @generated
	 */
	void setDeathdate(DateType value);

	/**
	 * Returns the value of the '<em><b>Deathlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deathlocation</em>' containment reference.
	 * @see #setDeathlocation(AddressTypeBase)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Deathlocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deathlocation' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressTypeBase getDeathlocation();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathlocation <em>Deathlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deathlocation</em>' containment reference.
	 * @see #getDeathlocation()
	 * @generated
	 */
	void setDeathlocation(AddressTypeBase value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' containment reference.
	 * @see #setSex(SexType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Sex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sex' namespace='##targetNamespace'"
	 * @generated
	 */
	SexType getSex();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getSex <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' containment reference.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(SexType value);

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' containment reference.
	 * @see #setNationality(NationalityType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Nationality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nationality' namespace='##targetNamespace'"
	 * @generated
	 */
	NationalityType getNationality();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getNationality <em>Nationality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' containment reference.
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(NationalityType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TelecomType> getTelecom();

	/**
	 * Returns the value of the '<em><b>Usuallanguage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuallanguage</em>' attribute.
	 * @see #setUsuallanguage(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Usuallanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='element' name='usuallanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUsuallanguage();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getUsuallanguage <em>Usuallanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuallanguage</em>' attribute.
	 * @see #getUsuallanguage()
	 * @generated
	 */
	void setUsuallanguage(String value);

	/**
	 * Returns the value of the '<em><b>Profession</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profession</em>' containment reference.
	 * @see #setProfession(ProfessionType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Profession()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profession' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfessionType getProfession();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getProfession <em>Profession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profession</em>' containment reference.
	 * @see #getProfession()
	 * @generated
	 */
	void setProfession(ProfessionType value);

	/**
	 * Returns the value of the '<em><b>Insurancystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurancystatus</em>' containment reference.
	 * @see #setInsurancystatus(InsuranceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Insurancystatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurancystatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InsuranceType getInsurancystatus();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancystatus <em>Insurancystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurancystatus</em>' containment reference.
	 * @see #getInsurancystatus()
	 * @generated
	 */
	void setInsurancystatus(InsuranceType value);

	/**
	 * Returns the value of the '<em><b>Insurancymembership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurancymembership</em>' containment reference.
	 * @see #setInsurancymembership(MemberinsuranceType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Insurancymembership()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurancymembership' namespace='##targetNamespace'"
	 * @generated
	 */
	MemberinsuranceType getInsurancymembership();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancymembership <em>Insurancymembership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurancymembership</em>' containment reference.
	 * @see #getInsurancymembership()
	 * @generated
	 */
	void setInsurancymembership(MemberinsuranceType value);

	/**
	 * Returns the value of the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorddatetime</em>' attribute.
	 * @see #setRecorddatetime(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Recorddatetime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='recorddatetime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRecorddatetime();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getRecorddatetime <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorddatetime</em>' attribute.
	 * @see #getRecorddatetime()
	 * @generated
	 */
	void setRecorddatetime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Civilstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Civilstate</em>' containment reference.
	 * @see #setCivilstate(CivilstateType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getPersonType_Civilstate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='civilstate' namespace='##targetNamespace'"
	 * @generated
	 */
	CivilstateType getCivilstate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getCivilstate <em>Civilstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Civilstate</em>' containment reference.
	 * @see #getCivilstate()
	 * @generated
	 */
	void setCivilstate(CivilstateType value);

} // PersonType
