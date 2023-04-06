/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getBirthlocation <em>Birthlocation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getDeathdate <em>Deathdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getDeathlocation <em>Deathlocation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getUsuallanguage <em>Usuallanguage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getProfession <em>Profession</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getInsurancystatus <em>Insurancystatus</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getInsurancymembership <em>Insurancymembership</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl#getCivilstate <em>Civilstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonTypeImpl extends MinimalEObjectImpl.Container implements PersonType {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDPATIENT> id;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> firstname;

	/**
	 * The default value of the '{@link #getFamilyname() <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyname()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyname() <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyname()
	 * @generated
	 * @ordered
	 */
	protected String familyname = FAMILYNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected DateType birthdate;

	/**
	 * The cached value of the '{@link #getBirthlocation() <em>Birthlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthlocation()
	 * @generated
	 * @ordered
	 */
	protected AddressTypeBase birthlocation;

	/**
	 * The cached value of the '{@link #getDeathdate() <em>Deathdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathdate()
	 * @generated
	 * @ordered
	 */
	protected DateType deathdate;

	/**
	 * The cached value of the '{@link #getDeathlocation() <em>Deathlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathlocation()
	 * @generated
	 * @ordered
	 */
	protected AddressTypeBase deathlocation;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected SexType sex;

	/**
	 * The cached value of the '{@link #getNationality() <em>Nationality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected NationalityType nationality;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressType> address;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<TelecomType> telecom;

	/**
	 * The default value of the '{@link #getUsuallanguage() <em>Usuallanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuallanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String USUALLANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuallanguage() <em>Usuallanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuallanguage()
	 * @generated
	 * @ordered
	 */
	protected String usuallanguage = USUALLANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfession() <em>Profession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfession()
	 * @generated
	 * @ordered
	 */
	protected ProfessionType profession;

	/**
	 * The cached value of the '{@link #getInsurancystatus() <em>Insurancystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancystatus()
	 * @generated
	 * @ordered
	 */
	protected InsuranceType insurancystatus;

	/**
	 * The cached value of the '{@link #getInsurancymembership() <em>Insurancymembership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancymembership()
	 * @generated
	 * @ordered
	 */
	protected MemberinsuranceType insurancymembership;

	/**
	 * The default value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RECORDDATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar recorddatetime = RECORDDATETIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> text;

	/**
	 * The cached value of the '{@link #getCivilstate() <em>Civilstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCivilstate()
	 * @generated
	 * @ordered
	 */
	protected CivilstateType civilstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.PERSON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDPATIENT> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDPATIENT>(IDPATIENT.class, this, KmehrPackage.PERSON_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFirstname() {
		if (firstname == null) {
			firstname = new EDataTypeEList<String>(String.class, this, KmehrPackage.PERSON_TYPE__FIRSTNAME);
		}
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamilyname() {
		return familyname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamilyname(String newFamilyname) {
		String oldFamilyname = familyname;
		familyname = newFamilyname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__FAMILYNAME, oldFamilyname, familyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthdate(DateType newBirthdate, NotificationChain msgs) {
		DateType oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__BIRTHDATE, oldBirthdate, newBirthdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthdate(DateType newBirthdate) {
		if (newBirthdate != birthdate) {
			NotificationChain msgs = null;
			if (birthdate != null)
				msgs = ((InternalEObject)birthdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__BIRTHDATE, null, msgs);
			if (newBirthdate != null)
				msgs = ((InternalEObject)newBirthdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__BIRTHDATE, null, msgs);
			msgs = basicSetBirthdate(newBirthdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__BIRTHDATE, newBirthdate, newBirthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressTypeBase getBirthlocation() {
		return birthlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthlocation(AddressTypeBase newBirthlocation, NotificationChain msgs) {
		AddressTypeBase oldBirthlocation = birthlocation;
		birthlocation = newBirthlocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__BIRTHLOCATION, oldBirthlocation, newBirthlocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthlocation(AddressTypeBase newBirthlocation) {
		if (newBirthlocation != birthlocation) {
			NotificationChain msgs = null;
			if (birthlocation != null)
				msgs = ((InternalEObject)birthlocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__BIRTHLOCATION, null, msgs);
			if (newBirthlocation != null)
				msgs = ((InternalEObject)newBirthlocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__BIRTHLOCATION, null, msgs);
			msgs = basicSetBirthlocation(newBirthlocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__BIRTHLOCATION, newBirthlocation, newBirthlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType getDeathdate() {
		return deathdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeathdate(DateType newDeathdate, NotificationChain msgs) {
		DateType oldDeathdate = deathdate;
		deathdate = newDeathdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__DEATHDATE, oldDeathdate, newDeathdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeathdate(DateType newDeathdate) {
		if (newDeathdate != deathdate) {
			NotificationChain msgs = null;
			if (deathdate != null)
				msgs = ((InternalEObject)deathdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__DEATHDATE, null, msgs);
			if (newDeathdate != null)
				msgs = ((InternalEObject)newDeathdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__DEATHDATE, null, msgs);
			msgs = basicSetDeathdate(newDeathdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__DEATHDATE, newDeathdate, newDeathdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressTypeBase getDeathlocation() {
		return deathlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeathlocation(AddressTypeBase newDeathlocation, NotificationChain msgs) {
		AddressTypeBase oldDeathlocation = deathlocation;
		deathlocation = newDeathlocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__DEATHLOCATION, oldDeathlocation, newDeathlocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeathlocation(AddressTypeBase newDeathlocation) {
		if (newDeathlocation != deathlocation) {
			NotificationChain msgs = null;
			if (deathlocation != null)
				msgs = ((InternalEObject)deathlocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__DEATHLOCATION, null, msgs);
			if (newDeathlocation != null)
				msgs = ((InternalEObject)newDeathlocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__DEATHLOCATION, null, msgs);
			msgs = basicSetDeathlocation(newDeathlocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__DEATHLOCATION, newDeathlocation, newDeathlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SexType getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSex(SexType newSex, NotificationChain msgs) {
		SexType oldSex = sex;
		sex = newSex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__SEX, oldSex, newSex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSex(SexType newSex) {
		if (newSex != sex) {
			NotificationChain msgs = null;
			if (sex != null)
				msgs = ((InternalEObject)sex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__SEX, null, msgs);
			if (newSex != null)
				msgs = ((InternalEObject)newSex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__SEX, null, msgs);
			msgs = basicSetSex(newSex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__SEX, newSex, newSex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NationalityType getNationality() {
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNationality(NationalityType newNationality, NotificationChain msgs) {
		NationalityType oldNationality = nationality;
		nationality = newNationality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__NATIONALITY, oldNationality, newNationality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNationality(NationalityType newNationality) {
		if (newNationality != nationality) {
			NotificationChain msgs = null;
			if (nationality != null)
				msgs = ((InternalEObject)nationality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__NATIONALITY, null, msgs);
			if (newNationality != null)
				msgs = ((InternalEObject)newNationality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__NATIONALITY, null, msgs);
			msgs = basicSetNationality(newNationality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__NATIONALITY, newNationality, newNationality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressType>(AddressType.class, this, KmehrPackage.PERSON_TYPE__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TelecomType> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<TelecomType>(TelecomType.class, this, KmehrPackage.PERSON_TYPE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsuallanguage() {
		return usuallanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsuallanguage(String newUsuallanguage) {
		String oldUsuallanguage = usuallanguage;
		usuallanguage = newUsuallanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__USUALLANGUAGE, oldUsuallanguage, usuallanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfessionType getProfession() {
		return profession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfession(ProfessionType newProfession, NotificationChain msgs) {
		ProfessionType oldProfession = profession;
		profession = newProfession;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__PROFESSION, oldProfession, newProfession);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfession(ProfessionType newProfession) {
		if (newProfession != profession) {
			NotificationChain msgs = null;
			if (profession != null)
				msgs = ((InternalEObject)profession).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__PROFESSION, null, msgs);
			if (newProfession != null)
				msgs = ((InternalEObject)newProfession).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__PROFESSION, null, msgs);
			msgs = basicSetProfession(newProfession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__PROFESSION, newProfession, newProfession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsuranceType getInsurancystatus() {
		return insurancystatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurancystatus(InsuranceType newInsurancystatus, NotificationChain msgs) {
		InsuranceType oldInsurancystatus = insurancystatus;
		insurancystatus = newInsurancystatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__INSURANCYSTATUS, oldInsurancystatus, newInsurancystatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsurancystatus(InsuranceType newInsurancystatus) {
		if (newInsurancystatus != insurancystatus) {
			NotificationChain msgs = null;
			if (insurancystatus != null)
				msgs = ((InternalEObject)insurancystatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__INSURANCYSTATUS, null, msgs);
			if (newInsurancystatus != null)
				msgs = ((InternalEObject)newInsurancystatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__INSURANCYSTATUS, null, msgs);
			msgs = basicSetInsurancystatus(newInsurancystatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__INSURANCYSTATUS, newInsurancystatus, newInsurancystatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberinsuranceType getInsurancymembership() {
		return insurancymembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurancymembership(MemberinsuranceType newInsurancymembership, NotificationChain msgs) {
		MemberinsuranceType oldInsurancymembership = insurancymembership;
		insurancymembership = newInsurancymembership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP, oldInsurancymembership, newInsurancymembership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsurancymembership(MemberinsuranceType newInsurancymembership) {
		if (newInsurancymembership != insurancymembership) {
			NotificationChain msgs = null;
			if (insurancymembership != null)
				msgs = ((InternalEObject)insurancymembership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP, null, msgs);
			if (newInsurancymembership != null)
				msgs = ((InternalEObject)newInsurancymembership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP, null, msgs);
			msgs = basicSetInsurancymembership(newInsurancymembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP, newInsurancymembership, newInsurancymembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRecorddatetime() {
		return recorddatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecorddatetime(XMLGregorianCalendar newRecorddatetime) {
		XMLGregorianCalendar oldRecorddatetime = recorddatetime;
		recorddatetime = newRecorddatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__RECORDDATETIME, oldRecorddatetime, recorddatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, KmehrPackage.PERSON_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CivilstateType getCivilstate() {
		return civilstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCivilstate(CivilstateType newCivilstate, NotificationChain msgs) {
		CivilstateType oldCivilstate = civilstate;
		civilstate = newCivilstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__CIVILSTATE, oldCivilstate, newCivilstate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCivilstate(CivilstateType newCivilstate) {
		if (newCivilstate != civilstate) {
			NotificationChain msgs = null;
			if (civilstate != null)
				msgs = ((InternalEObject)civilstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__CIVILSTATE, null, msgs);
			if (newCivilstate != null)
				msgs = ((InternalEObject)newCivilstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.PERSON_TYPE__CIVILSTATE, null, msgs);
			msgs = basicSetCivilstate(newCivilstate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE__CIVILSTATE, newCivilstate, newCivilstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.PERSON_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE__BIRTHDATE:
				return basicSetBirthdate(null, msgs);
			case KmehrPackage.PERSON_TYPE__BIRTHLOCATION:
				return basicSetBirthlocation(null, msgs);
			case KmehrPackage.PERSON_TYPE__DEATHDATE:
				return basicSetDeathdate(null, msgs);
			case KmehrPackage.PERSON_TYPE__DEATHLOCATION:
				return basicSetDeathlocation(null, msgs);
			case KmehrPackage.PERSON_TYPE__SEX:
				return basicSetSex(null, msgs);
			case KmehrPackage.PERSON_TYPE__NATIONALITY:
				return basicSetNationality(null, msgs);
			case KmehrPackage.PERSON_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE__PROFESSION:
				return basicSetProfession(null, msgs);
			case KmehrPackage.PERSON_TYPE__INSURANCYSTATUS:
				return basicSetInsurancystatus(null, msgs);
			case KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP:
				return basicSetInsurancymembership(null, msgs);
			case KmehrPackage.PERSON_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE__CIVILSTATE:
				return basicSetCivilstate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmehrPackage.PERSON_TYPE__ID:
				return getId();
			case KmehrPackage.PERSON_TYPE__FIRSTNAME:
				return getFirstname();
			case KmehrPackage.PERSON_TYPE__FAMILYNAME:
				return getFamilyname();
			case KmehrPackage.PERSON_TYPE__BIRTHDATE:
				return getBirthdate();
			case KmehrPackage.PERSON_TYPE__BIRTHLOCATION:
				return getBirthlocation();
			case KmehrPackage.PERSON_TYPE__DEATHDATE:
				return getDeathdate();
			case KmehrPackage.PERSON_TYPE__DEATHLOCATION:
				return getDeathlocation();
			case KmehrPackage.PERSON_TYPE__SEX:
				return getSex();
			case KmehrPackage.PERSON_TYPE__NATIONALITY:
				return getNationality();
			case KmehrPackage.PERSON_TYPE__ADDRESS:
				return getAddress();
			case KmehrPackage.PERSON_TYPE__TELECOM:
				return getTelecom();
			case KmehrPackage.PERSON_TYPE__USUALLANGUAGE:
				return getUsuallanguage();
			case KmehrPackage.PERSON_TYPE__PROFESSION:
				return getProfession();
			case KmehrPackage.PERSON_TYPE__INSURANCYSTATUS:
				return getInsurancystatus();
			case KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP:
				return getInsurancymembership();
			case KmehrPackage.PERSON_TYPE__RECORDDATETIME:
				return getRecorddatetime();
			case KmehrPackage.PERSON_TYPE__TEXT:
				return getText();
			case KmehrPackage.PERSON_TYPE__CIVILSTATE:
				return getCivilstate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmehrPackage.PERSON_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDPATIENT>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__FIRSTNAME:
				getFirstname().clear();
				getFirstname().addAll((Collection<? extends String>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__FAMILYNAME:
				setFamilyname((String)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__BIRTHDATE:
				setBirthdate((DateType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__BIRTHLOCATION:
				setBirthlocation((AddressTypeBase)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__DEATHDATE:
				setDeathdate((DateType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__DEATHLOCATION:
				setDeathlocation((AddressTypeBase)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__SEX:
				setSex((SexType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__NATIONALITY:
				setNationality((NationalityType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TelecomType>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__USUALLANGUAGE:
				setUsuallanguage((String)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__PROFESSION:
				setProfession((ProfessionType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__INSURANCYSTATUS:
				setInsurancystatus((InsuranceType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP:
				setInsurancymembership((MemberinsuranceType)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__RECORDDATETIME:
				setRecorddatetime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE__CIVILSTATE:
				setCivilstate((CivilstateType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KmehrPackage.PERSON_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.PERSON_TYPE__FIRSTNAME:
				getFirstname().clear();
				return;
			case KmehrPackage.PERSON_TYPE__FAMILYNAME:
				setFamilyname(FAMILYNAME_EDEFAULT);
				return;
			case KmehrPackage.PERSON_TYPE__BIRTHDATE:
				setBirthdate((DateType)null);
				return;
			case KmehrPackage.PERSON_TYPE__BIRTHLOCATION:
				setBirthlocation((AddressTypeBase)null);
				return;
			case KmehrPackage.PERSON_TYPE__DEATHDATE:
				setDeathdate((DateType)null);
				return;
			case KmehrPackage.PERSON_TYPE__DEATHLOCATION:
				setDeathlocation((AddressTypeBase)null);
				return;
			case KmehrPackage.PERSON_TYPE__SEX:
				setSex((SexType)null);
				return;
			case KmehrPackage.PERSON_TYPE__NATIONALITY:
				setNationality((NationalityType)null);
				return;
			case KmehrPackage.PERSON_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case KmehrPackage.PERSON_TYPE__TELECOM:
				getTelecom().clear();
				return;
			case KmehrPackage.PERSON_TYPE__USUALLANGUAGE:
				setUsuallanguage(USUALLANGUAGE_EDEFAULT);
				return;
			case KmehrPackage.PERSON_TYPE__PROFESSION:
				setProfession((ProfessionType)null);
				return;
			case KmehrPackage.PERSON_TYPE__INSURANCYSTATUS:
				setInsurancystatus((InsuranceType)null);
				return;
			case KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP:
				setInsurancymembership((MemberinsuranceType)null);
				return;
			case KmehrPackage.PERSON_TYPE__RECORDDATETIME:
				setRecorddatetime(RECORDDATETIME_EDEFAULT);
				return;
			case KmehrPackage.PERSON_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.PERSON_TYPE__CIVILSTATE:
				setCivilstate((CivilstateType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KmehrPackage.PERSON_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.PERSON_TYPE__FIRSTNAME:
				return firstname != null && !firstname.isEmpty();
			case KmehrPackage.PERSON_TYPE__FAMILYNAME:
				return FAMILYNAME_EDEFAULT == null ? familyname != null : !FAMILYNAME_EDEFAULT.equals(familyname);
			case KmehrPackage.PERSON_TYPE__BIRTHDATE:
				return birthdate != null;
			case KmehrPackage.PERSON_TYPE__BIRTHLOCATION:
				return birthlocation != null;
			case KmehrPackage.PERSON_TYPE__DEATHDATE:
				return deathdate != null;
			case KmehrPackage.PERSON_TYPE__DEATHLOCATION:
				return deathlocation != null;
			case KmehrPackage.PERSON_TYPE__SEX:
				return sex != null;
			case KmehrPackage.PERSON_TYPE__NATIONALITY:
				return nationality != null;
			case KmehrPackage.PERSON_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case KmehrPackage.PERSON_TYPE__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case KmehrPackage.PERSON_TYPE__USUALLANGUAGE:
				return USUALLANGUAGE_EDEFAULT == null ? usuallanguage != null : !USUALLANGUAGE_EDEFAULT.equals(usuallanguage);
			case KmehrPackage.PERSON_TYPE__PROFESSION:
				return profession != null;
			case KmehrPackage.PERSON_TYPE__INSURANCYSTATUS:
				return insurancystatus != null;
			case KmehrPackage.PERSON_TYPE__INSURANCYMEMBERSHIP:
				return insurancymembership != null;
			case KmehrPackage.PERSON_TYPE__RECORDDATETIME:
				return RECORDDATETIME_EDEFAULT == null ? recorddatetime != null : !RECORDDATETIME_EDEFAULT.equals(recorddatetime);
			case KmehrPackage.PERSON_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case KmehrPackage.PERSON_TYPE__CIVILSTATE:
				return civilstate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", familyname: ");
		result.append(familyname);
		result.append(", usuallanguage: ");
		result.append(usuallanguage);
		result.append(", recorddatetime: ");
		result.append(recorddatetime);
		result.append(')');
		return result.toString();
	}

} //PersonTypeImpl
