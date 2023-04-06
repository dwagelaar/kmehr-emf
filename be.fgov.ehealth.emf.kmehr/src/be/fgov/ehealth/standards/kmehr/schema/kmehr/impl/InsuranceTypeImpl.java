/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getSiscard <em>Siscard</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getBegindate <em>Begindate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getEnddate <em>Enddate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getCg1 <em>Cg1</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getCg2 <em>Cg2</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getSocialfranchiseperiod1 <em>Socialfranchiseperiod1</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getSocialfranchiseperiod2 <em>Socialfranchiseperiod2</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getPersonalpart <em>Personalpart</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getThirdpayercontract <em>Thirdpayercontract</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getBegindatepayment <em>Begindatepayment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl#getApprovalnumber <em>Approvalnumber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsuranceTypeImpl extends MinimalEObjectImpl.Container implements InsuranceType {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected IDINSURANCE id;

	/**
	 * The default value of the '{@link #getMembership() <em>Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBERSHIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected String membership = MEMBERSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiscard() <em>Siscard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiscard()
	 * @generated
	 * @ordered
	 */
	protected static final String SISCARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiscard() <em>Siscard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiscard()
	 * @generated
	 * @ordered
	 */
	protected String siscard = SISCARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBegindate() <em>Begindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegindate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegindate() <em>Begindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegindate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar begindate = BEGINDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnddate() <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnddate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENDDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnddate() <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnddate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar enddate = ENDDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCg1() <em>Cg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCg1()
	 * @generated
	 * @ordered
	 */
	protected static final String CG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCg1() <em>Cg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCg1()
	 * @generated
	 * @ordered
	 */
	protected String cg1 = CG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCg2() <em>Cg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCg2()
	 * @generated
	 * @ordered
	 */
	protected static final String CG2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCg2() <em>Cg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCg2()
	 * @generated
	 * @ordered
	 */
	protected String cg2 = CG2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialfranchiseperiod1() <em>Socialfranchiseperiod1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialfranchiseperiod1()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIALFRANCHISEPERIOD1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialfranchiseperiod1() <em>Socialfranchiseperiod1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialfranchiseperiod1()
	 * @generated
	 * @ordered
	 */
	protected String socialfranchiseperiod1 = SOCIALFRANCHISEPERIOD1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialfranchiseperiod2() <em>Socialfranchiseperiod2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialfranchiseperiod2()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIALFRANCHISEPERIOD2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialfranchiseperiod2() <em>Socialfranchiseperiod2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialfranchiseperiod2()
	 * @generated
	 * @ordered
	 */
	protected String socialfranchiseperiod2 = SOCIALFRANCHISEPERIOD2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonalpart() <em>Personalpart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalpart()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalpartType> personalpart;

	/**
	 * The cached value of the '{@link #getThirdpayercontract() <em>Thirdpayercontract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdpayercontract()
	 * @generated
	 * @ordered
	 */
	protected ThirdpayercontractType thirdpayercontract;

	/**
	 * The default value of the '{@link #getBegindatepayment() <em>Begindatepayment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegindatepayment()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINDATEPAYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegindatepayment() <em>Begindatepayment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegindatepayment()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar begindatepayment = BEGINDATEPAYMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalnumber() <em>Approvalnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVALNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalnumber() <em>Approvalnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalnumber()
	 * @generated
	 * @ordered
	 */
	protected String approvalnumber = APPROVALNUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.INSURANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDINSURANCE getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(IDINSURANCE newId, NotificationChain msgs) {
		IDINSURANCE oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__ID, oldId, newId);
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
	public void setId(IDINSURANCE newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INSURANCE_TYPE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INSURANCE_TYPE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMembership() {
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembership(String newMembership) {
		String oldMembership = membership;
		membership = newMembership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__MEMBERSHIP, oldMembership, membership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiscard() {
		return siscard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiscard(String newSiscard) {
		String oldSiscard = siscard;
		siscard = newSiscard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__SISCARD, oldSiscard, siscard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBegindate() {
		return begindate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegindate(XMLGregorianCalendar newBegindate) {
		XMLGregorianCalendar oldBegindate = begindate;
		begindate = newBegindate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__BEGINDATE, oldBegindate, begindate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnddate() {
		return enddate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnddate(XMLGregorianCalendar newEnddate) {
		XMLGregorianCalendar oldEnddate = enddate;
		enddate = newEnddate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__ENDDATE, oldEnddate, enddate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCg1() {
		return cg1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCg1(String newCg1) {
		String oldCg1 = cg1;
		cg1 = newCg1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__CG1, oldCg1, cg1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCg2() {
		return cg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCg2(String newCg2) {
		String oldCg2 = cg2;
		cg2 = newCg2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__CG2, oldCg2, cg2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocialfranchiseperiod1() {
		return socialfranchiseperiod1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialfranchiseperiod1(String newSocialfranchiseperiod1) {
		String oldSocialfranchiseperiod1 = socialfranchiseperiod1;
		socialfranchiseperiod1 = newSocialfranchiseperiod1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1, oldSocialfranchiseperiod1, socialfranchiseperiod1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocialfranchiseperiod2() {
		return socialfranchiseperiod2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialfranchiseperiod2(String newSocialfranchiseperiod2) {
		String oldSocialfranchiseperiod2 = socialfranchiseperiod2;
		socialfranchiseperiod2 = newSocialfranchiseperiod2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2, oldSocialfranchiseperiod2, socialfranchiseperiod2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PersonalpartType> getPersonalpart() {
		if (personalpart == null) {
			personalpart = new EObjectContainmentEList<PersonalpartType>(PersonalpartType.class, this, KmehrPackage.INSURANCE_TYPE__PERSONALPART);
		}
		return personalpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThirdpayercontractType getThirdpayercontract() {
		return thirdpayercontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThirdpayercontract(ThirdpayercontractType newThirdpayercontract, NotificationChain msgs) {
		ThirdpayercontractType oldThirdpayercontract = thirdpayercontract;
		thirdpayercontract = newThirdpayercontract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT, oldThirdpayercontract, newThirdpayercontract);
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
	public void setThirdpayercontract(ThirdpayercontractType newThirdpayercontract) {
		if (newThirdpayercontract != thirdpayercontract) {
			NotificationChain msgs = null;
			if (thirdpayercontract != null)
				msgs = ((InternalEObject)thirdpayercontract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT, null, msgs);
			if (newThirdpayercontract != null)
				msgs = ((InternalEObject)newThirdpayercontract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT, null, msgs);
			msgs = basicSetThirdpayercontract(newThirdpayercontract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT, newThirdpayercontract, newThirdpayercontract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBegindatepayment() {
		return begindatepayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegindatepayment(XMLGregorianCalendar newBegindatepayment) {
		XMLGregorianCalendar oldBegindatepayment = begindatepayment;
		begindatepayment = newBegindatepayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__BEGINDATEPAYMENT, oldBegindatepayment, begindatepayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprovalnumber() {
		return approvalnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalnumber(String newApprovalnumber) {
		String oldApprovalnumber = approvalnumber;
		approvalnumber = newApprovalnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INSURANCE_TYPE__APPROVALNUMBER, oldApprovalnumber, approvalnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.INSURANCE_TYPE__ID:
				return basicSetId(null, msgs);
			case KmehrPackage.INSURANCE_TYPE__PERSONALPART:
				return ((InternalEList<?>)getPersonalpart()).basicRemove(otherEnd, msgs);
			case KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT:
				return basicSetThirdpayercontract(null, msgs);
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
			case KmehrPackage.INSURANCE_TYPE__ID:
				return getId();
			case KmehrPackage.INSURANCE_TYPE__MEMBERSHIP:
				return getMembership();
			case KmehrPackage.INSURANCE_TYPE__SISCARD:
				return getSiscard();
			case KmehrPackage.INSURANCE_TYPE__BEGINDATE:
				return getBegindate();
			case KmehrPackage.INSURANCE_TYPE__ENDDATE:
				return getEnddate();
			case KmehrPackage.INSURANCE_TYPE__CG1:
				return getCg1();
			case KmehrPackage.INSURANCE_TYPE__CG2:
				return getCg2();
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1:
				return getSocialfranchiseperiod1();
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2:
				return getSocialfranchiseperiod2();
			case KmehrPackage.INSURANCE_TYPE__PERSONALPART:
				return getPersonalpart();
			case KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT:
				return getThirdpayercontract();
			case KmehrPackage.INSURANCE_TYPE__BEGINDATEPAYMENT:
				return getBegindatepayment();
			case KmehrPackage.INSURANCE_TYPE__APPROVALNUMBER:
				return getApprovalnumber();
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
			case KmehrPackage.INSURANCE_TYPE__ID:
				setId((IDINSURANCE)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__MEMBERSHIP:
				setMembership((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__SISCARD:
				setSiscard((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__BEGINDATE:
				setBegindate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__ENDDATE:
				setEnddate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__CG1:
				setCg1((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__CG2:
				setCg2((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1:
				setSocialfranchiseperiod1((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2:
				setSocialfranchiseperiod2((String)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__PERSONALPART:
				getPersonalpart().clear();
				getPersonalpart().addAll((Collection<? extends PersonalpartType>)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT:
				setThirdpayercontract((ThirdpayercontractType)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__BEGINDATEPAYMENT:
				setBegindatepayment((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.INSURANCE_TYPE__APPROVALNUMBER:
				setApprovalnumber((String)newValue);
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
			case KmehrPackage.INSURANCE_TYPE__ID:
				setId((IDINSURANCE)null);
				return;
			case KmehrPackage.INSURANCE_TYPE__MEMBERSHIP:
				setMembership(MEMBERSHIP_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__SISCARD:
				setSiscard(SISCARD_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__BEGINDATE:
				setBegindate(BEGINDATE_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__ENDDATE:
				setEnddate(ENDDATE_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__CG1:
				setCg1(CG1_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__CG2:
				setCg2(CG2_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1:
				setSocialfranchiseperiod1(SOCIALFRANCHISEPERIOD1_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2:
				setSocialfranchiseperiod2(SOCIALFRANCHISEPERIOD2_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__PERSONALPART:
				getPersonalpart().clear();
				return;
			case KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT:
				setThirdpayercontract((ThirdpayercontractType)null);
				return;
			case KmehrPackage.INSURANCE_TYPE__BEGINDATEPAYMENT:
				setBegindatepayment(BEGINDATEPAYMENT_EDEFAULT);
				return;
			case KmehrPackage.INSURANCE_TYPE__APPROVALNUMBER:
				setApprovalnumber(APPROVALNUMBER_EDEFAULT);
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
			case KmehrPackage.INSURANCE_TYPE__ID:
				return id != null;
			case KmehrPackage.INSURANCE_TYPE__MEMBERSHIP:
				return MEMBERSHIP_EDEFAULT == null ? membership != null : !MEMBERSHIP_EDEFAULT.equals(membership);
			case KmehrPackage.INSURANCE_TYPE__SISCARD:
				return SISCARD_EDEFAULT == null ? siscard != null : !SISCARD_EDEFAULT.equals(siscard);
			case KmehrPackage.INSURANCE_TYPE__BEGINDATE:
				return BEGINDATE_EDEFAULT == null ? begindate != null : !BEGINDATE_EDEFAULT.equals(begindate);
			case KmehrPackage.INSURANCE_TYPE__ENDDATE:
				return ENDDATE_EDEFAULT == null ? enddate != null : !ENDDATE_EDEFAULT.equals(enddate);
			case KmehrPackage.INSURANCE_TYPE__CG1:
				return CG1_EDEFAULT == null ? cg1 != null : !CG1_EDEFAULT.equals(cg1);
			case KmehrPackage.INSURANCE_TYPE__CG2:
				return CG2_EDEFAULT == null ? cg2 != null : !CG2_EDEFAULT.equals(cg2);
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1:
				return SOCIALFRANCHISEPERIOD1_EDEFAULT == null ? socialfranchiseperiod1 != null : !SOCIALFRANCHISEPERIOD1_EDEFAULT.equals(socialfranchiseperiod1);
			case KmehrPackage.INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2:
				return SOCIALFRANCHISEPERIOD2_EDEFAULT == null ? socialfranchiseperiod2 != null : !SOCIALFRANCHISEPERIOD2_EDEFAULT.equals(socialfranchiseperiod2);
			case KmehrPackage.INSURANCE_TYPE__PERSONALPART:
				return personalpart != null && !personalpart.isEmpty();
			case KmehrPackage.INSURANCE_TYPE__THIRDPAYERCONTRACT:
				return thirdpayercontract != null;
			case KmehrPackage.INSURANCE_TYPE__BEGINDATEPAYMENT:
				return BEGINDATEPAYMENT_EDEFAULT == null ? begindatepayment != null : !BEGINDATEPAYMENT_EDEFAULT.equals(begindatepayment);
			case KmehrPackage.INSURANCE_TYPE__APPROVALNUMBER:
				return APPROVALNUMBER_EDEFAULT == null ? approvalnumber != null : !APPROVALNUMBER_EDEFAULT.equals(approvalnumber);
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
		result.append(" (membership: ");
		result.append(membership);
		result.append(", siscard: ");
		result.append(siscard);
		result.append(", begindate: ");
		result.append(begindate);
		result.append(", enddate: ");
		result.append(enddate);
		result.append(", cg1: ");
		result.append(cg1);
		result.append(", cg2: ");
		result.append(cg2);
		result.append(", socialfranchiseperiod1: ");
		result.append(socialfranchiseperiod1);
		result.append(", socialfranchiseperiod2: ");
		result.append(socialfranchiseperiod2);
		result.append(", begindatepayment: ");
		result.append(begindatepayment);
		result.append(", approvalnumber: ");
		result.append(approvalnumber);
		result.append(')');
		return result.toString();
	}

} //InsuranceTypeImpl
