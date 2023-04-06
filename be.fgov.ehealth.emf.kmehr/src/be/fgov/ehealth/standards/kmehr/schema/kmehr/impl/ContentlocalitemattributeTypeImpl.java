/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType;

import java.math.BigDecimal;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contentlocalitemattribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getHcparty <em>Hcparty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentlocalitemattributeTypeImpl extends MinimalEObjectImpl.Container implements ContentlocalitemattributeType {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDKMEHR> id;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDCONTENT> cd;

	/**
	 * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DECIMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal decimal = DECIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_ = BOOLEAN_EDEFAULT;

	/**
	 * This is true if the Boolean attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanESet;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected TextType text;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHcparty() <em>Hcparty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHcparty()
	 * @generated
	 * @ordered
	 */
	protected HcpartyType hcparty;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected PersonType person;

	/**
	 * The cached value of the '{@link #getLnk() <em>Lnk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnk()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> lnk;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentlocalitemattributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.CONTENTLOCALITEMATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDCONTENT> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDCONTENT>(CDCONTENT.class, this, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDecimal() {
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimal(BigDecimal newDecimal) {
		BigDecimal oldDecimal = decimal;
		decimal = newDecimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL, oldDecimal, decimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolean(boolean newBoolean) {
		boolean oldBoolean = boolean_;
		boolean_ = newBoolean;
		boolean oldBooleanESet = booleanESet;
		booleanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN, oldBoolean, boolean_, !oldBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoolean() {
		boolean oldBoolean = boolean_;
		boolean oldBooleanESet = booleanESet;
		boolean_ = BOOLEAN_EDEFAULT;
		booleanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN, oldBoolean, BOOLEAN_EDEFAULT, oldBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoolean() {
		return booleanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TextType newText, NotificationChain msgs) {
		TextType oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT, oldText, newText);
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
	public void setText(TextType newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(XMLGregorianCalendar newDate) {
		XMLGregorianCalendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(XMLGregorianCalendar newTime) {
		XMLGregorianCalendar oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HcpartyType getHcparty() {
		return hcparty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHcparty(HcpartyType newHcparty, NotificationChain msgs) {
		HcpartyType oldHcparty = hcparty;
		hcparty = newHcparty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY, oldHcparty, newHcparty);
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
	public void setHcparty(HcpartyType newHcparty) {
		if (newHcparty != hcparty) {
			NotificationChain msgs = null;
			if (hcparty != null)
				msgs = ((InternalEObject)hcparty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY, null, msgs);
			if (newHcparty != null)
				msgs = ((InternalEObject)newHcparty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY, null, msgs);
			msgs = basicSetHcparty(newHcparty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY, newHcparty, newHcparty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonType getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(PersonType newPerson, NotificationChain msgs) {
		PersonType oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON, oldPerson, newPerson);
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
	public void setPerson(PersonType newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getLnk() {
		if (lnk == null) {
			lnk = new EObjectContainmentEList<EObject>(EObject.class, this, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK);
		}
		return lnk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitType newUnit, NotificationChain msgs) {
		UnitType oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT, oldUnit, newUnit);
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
	public void setUnit(UnitType newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT:
				return basicSetText(null, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY:
				return basicSetHcparty(null, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON:
				return basicSetPerson(null, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK:
				return ((InternalEList<?>)getLnk()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT:
				return basicSetUnit(null, msgs);
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
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID:
				return getId();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD:
				return getCd();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL:
				return getDecimal();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN:
				return isBoolean();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT:
				return getText();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DATE:
				return getDate();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TIME:
				return getTime();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY:
				return getHcparty();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON:
				return getPerson();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK:
				return getLnk();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT:
				return getUnit();
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
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDCONTENT>)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL:
				setDecimal((BigDecimal)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT:
				setText((TextType)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY:
				setHcparty((HcpartyType)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON:
				setPerson((PersonType)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK:
				getLnk().clear();
				getLnk().addAll((Collection<? extends EObject>)newValue);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT:
				setUnit((UnitType)newValue);
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
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL:
				setDecimal(DECIMAL_EDEFAULT);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN:
				unsetBoolean();
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT:
				setText((TextType)null);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY:
				setHcparty((HcpartyType)null);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON:
				setPerson((PersonType)null);
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK:
				getLnk().clear();
				return;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT:
				setUnit((UnitType)null);
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
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL:
				return DECIMAL_EDEFAULT == null ? decimal != null : !DECIMAL_EDEFAULT.equals(decimal);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN:
				return isSetBoolean();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT:
				return text != null;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY:
				return hcparty != null;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON:
				return person != null;
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__LNK:
				return lnk != null && !lnk.isEmpty();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT:
				return unit != null;
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
		result.append(" (decimal: ");
		result.append(decimal);
		result.append(", boolean: ");
		if (booleanESet) result.append(boolean_); else result.append("<unset>");
		result.append(", date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ContentlocalitemattributeTypeImpl
