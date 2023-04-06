/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getMembership <em>Membership</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSiscard <em>Siscard</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindate <em>Begindate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getEnddate <em>Enddate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg1 <em>Cg1</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg2 <em>Cg2</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod1 <em>Socialfranchiseperiod1</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod2 <em>Socialfranchiseperiod2</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getPersonalpart <em>Personalpart</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getThirdpayercontract <em>Thirdpayercontract</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindatepayment <em>Begindatepayment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getApprovalnumber <em>Approvalnumber</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType()
 * @model extendedMetaData="name='insuranceType' kind='elementOnly'"
 * @generated
 */
public interface InsuranceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(IDINSURANCE)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Id()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	IDINSURANCE getId();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(IDINSURANCE value);

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membership</em>' attribute.
	 * @see #setMembership(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Membership()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='membership' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMembership();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getMembership <em>Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membership</em>' attribute.
	 * @see #getMembership()
	 * @generated
	 */
	void setMembership(String value);

	/**
	 * Returns the value of the '<em><b>Siscard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siscard</em>' attribute.
	 * @see #setSiscard(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Siscard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='siscard' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSiscard();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSiscard <em>Siscard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siscard</em>' attribute.
	 * @see #getSiscard()
	 * @generated
	 */
	void setSiscard(String value);

	/**
	 * Returns the value of the '<em><b>Begindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begindate</em>' attribute.
	 * @see #setBegindate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Begindate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='begindate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBegindate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindate <em>Begindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begindate</em>' attribute.
	 * @see #getBegindate()
	 * @generated
	 */
	void setBegindate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Enddate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enddate</em>' attribute.
	 * @see #setEnddate(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Enddate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='enddate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnddate();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getEnddate <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enddate</em>' attribute.
	 * @see #getEnddate()
	 * @generated
	 */
	void setEnddate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Cg1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cg1</em>' attribute.
	 * @see #setCg1(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Cg1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cg1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCg1();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg1 <em>Cg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cg1</em>' attribute.
	 * @see #getCg1()
	 * @generated
	 */
	void setCg1(String value);

	/**
	 * Returns the value of the '<em><b>Cg2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cg2</em>' attribute.
	 * @see #setCg2(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Cg2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cg2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCg2();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg2 <em>Cg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cg2</em>' attribute.
	 * @see #getCg2()
	 * @generated
	 */
	void setCg2(String value);

	/**
	 * Returns the value of the '<em><b>Socialfranchiseperiod1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialfranchiseperiod1</em>' attribute.
	 * @see #setSocialfranchiseperiod1(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Socialfranchiseperiod1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='socialfranchiseperiod1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSocialfranchiseperiod1();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod1 <em>Socialfranchiseperiod1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socialfranchiseperiod1</em>' attribute.
	 * @see #getSocialfranchiseperiod1()
	 * @generated
	 */
	void setSocialfranchiseperiod1(String value);

	/**
	 * Returns the value of the '<em><b>Socialfranchiseperiod2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialfranchiseperiod2</em>' attribute.
	 * @see #setSocialfranchiseperiod2(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Socialfranchiseperiod2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='socialfranchiseperiod2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSocialfranchiseperiod2();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod2 <em>Socialfranchiseperiod2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socialfranchiseperiod2</em>' attribute.
	 * @see #getSocialfranchiseperiod2()
	 * @generated
	 */
	void setSocialfranchiseperiod2(String value);

	/**
	 * Returns the value of the '<em><b>Personalpart</b></em>' containment reference list.
	 * The list contents are of type {@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personalpart</em>' containment reference list.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Personalpart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personalpart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonalpartType> getPersonalpart();

	/**
	 * Returns the value of the '<em><b>Thirdpayercontract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thirdpayercontract</em>' containment reference.
	 * @see #setThirdpayercontract(ThirdpayercontractType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Thirdpayercontract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thirdpayercontract' namespace='##targetNamespace'"
	 * @generated
	 */
	ThirdpayercontractType getThirdpayercontract();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getThirdpayercontract <em>Thirdpayercontract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thirdpayercontract</em>' containment reference.
	 * @see #getThirdpayercontract()
	 * @generated
	 */
	void setThirdpayercontract(ThirdpayercontractType value);

	/**
	 * Returns the value of the '<em><b>Begindatepayment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begindatepayment</em>' attribute.
	 * @see #setBegindatepayment(XMLGregorianCalendar)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Begindatepayment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='begindatepayment' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBegindatepayment();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindatepayment <em>Begindatepayment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begindatepayment</em>' attribute.
	 * @see #getBegindatepayment()
	 * @generated
	 */
	void setBegindatepayment(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Approvalnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nr goedkeuring betalingsverbintenis van de VI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approvalnumber</em>' attribute.
	 * @see #setApprovalnumber(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getInsuranceType_Approvalnumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='approvalnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApprovalnumber();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getApprovalnumber <em>Approvalnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvalnumber</em>' attribute.
	 * @see #getApprovalnumber()
	 * @generated
	 */
	void setApprovalnumber(String value);

} // InsuranceType
