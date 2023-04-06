/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getUnsignedInt <em>Unsigned Int</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getYearmonth <em>Yearmonth</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getHcparty <em>Hcparty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getIncapacity <em>Incapacity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getError <em>Error</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getMedicinalproduct <em>Medicinalproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getSubstanceproduct <em>Substanceproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getCompoundprescription <em>Compoundprescription</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getHolter <em>Holter</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getEcg <em>Ecg</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getBacteriology <em>Bacteriology</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getMinref <em>Minref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getMaxref <em>Maxref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl#getRefscope <em>Refscope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTypeImpl extends MinimalEObjectImpl.Container implements ContentType {
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
	 * The default value of the '{@link #getUnsignedInt() <em>Unsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected static final long UNSIGNED_INT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUnsignedInt() <em>Unsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected long unsignedInt = UNSIGNED_INT_EDEFAULT;

	/**
	 * This is true if the Unsigned Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unsignedIntESet;

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
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> text;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearmonth() <em>Yearmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearmonth()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar YEARMONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearmonth() <em>Yearmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearmonth()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar yearmonth = YEARMONTH_EDEFAULT;

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
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected InsuranceType insurance;

	/**
	 * The cached value of the '{@link #getIncapacity() <em>Incapacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncapacity()
	 * @generated
	 * @ordered
	 */
	protected IncapacityType incapacity;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected ErrorType error;

	/**
	 * The cached value of the '{@link #getMedicinalproduct() <em>Medicinalproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicinalproduct()
	 * @generated
	 * @ordered
	 */
	protected MedicinalProductType medicinalproduct;

	/**
	 * The cached value of the '{@link #getSubstanceproduct() <em>Substanceproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceproduct()
	 * @generated
	 * @ordered
	 */
	protected SubstanceproductType substanceproduct;

	/**
	 * The cached value of the '{@link #getCompoundprescription() <em>Compoundprescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundprescription()
	 * @generated
	 * @ordered
	 */
	protected CompoundprescriptionType compoundprescription;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected MedicationType medication;

	/**
	 * The cached value of the '{@link #getHolter() <em>Holter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolter()
	 * @generated
	 * @ordered
	 */
	protected HolterType holter;

	/**
	 * The cached value of the '{@link #getEcg() <em>Ecg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcg()
	 * @generated
	 * @ordered
	 */
	protected TextType ecg;

	/**
	 * The cached value of the '{@link #getBacteriology() <em>Bacteriology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBacteriology()
	 * @generated
	 * @ordered
	 */
	protected TextType bacteriology;

	/**
	 * The cached value of the '{@link #getLnk() <em>Lnk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnk()
	 * @generated
	 * @ordered
	 */
	protected EList<LnkType> lnk;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationBirthPlaceType location;

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
	 * The cached value of the '{@link #getMinref() <em>Minref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinref()
	 * @generated
	 * @ordered
	 */
	protected MinrefType minref;

	/**
	 * The cached value of the '{@link #getMaxref() <em>Maxref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxref()
	 * @generated
	 * @ordered
	 */
	protected MaxrefType maxref;

	/**
	 * The cached value of the '{@link #getRefscope() <em>Refscope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefscope()
	 * @generated
	 * @ordered
	 */
	protected EList<RefscopeType> refscope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.CONTENT_TYPE__ID);
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
			cd = new EObjectContainmentEList<CDCONTENT>(CDCONTENT.class, this, KmehrPackage.CONTENT_TYPE__CD);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__DECIMAL, oldDecimal, decimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUnsignedInt() {
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsignedInt(long newUnsignedInt) {
		long oldUnsignedInt = unsignedInt;
		unsignedInt = newUnsignedInt;
		boolean oldUnsignedIntESet = unsignedIntESet;
		unsignedIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__UNSIGNED_INT, oldUnsignedInt, unsignedInt, !oldUnsignedIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnsignedInt() {
		long oldUnsignedInt = unsignedInt;
		boolean oldUnsignedIntESet = unsignedIntESet;
		unsignedInt = UNSIGNED_INT_EDEFAULT;
		unsignedIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.CONTENT_TYPE__UNSIGNED_INT, oldUnsignedInt, UNSIGNED_INT_EDEFAULT, oldUnsignedIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnsignedInt() {
		return unsignedIntESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__BOOLEAN, oldBoolean, boolean_, !oldBooleanESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.CONTENT_TYPE__BOOLEAN, oldBoolean, BOOLEAN_EDEFAULT, oldBooleanESet));
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
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, KmehrPackage.CONTENT_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(XMLGregorianCalendar newYear) {
		XMLGregorianCalendar oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getYearmonth() {
		return yearmonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearmonth(XMLGregorianCalendar newYearmonth) {
		XMLGregorianCalendar oldYearmonth = yearmonth;
		yearmonth = newYearmonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__YEARMONTH, oldYearmonth, yearmonth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__TIME, oldTime, time));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__HCPARTY, oldHcparty, newHcparty);
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
				msgs = ((InternalEObject)hcparty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__HCPARTY, null, msgs);
			if (newHcparty != null)
				msgs = ((InternalEObject)newHcparty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__HCPARTY, null, msgs);
			msgs = basicSetHcparty(newHcparty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__HCPARTY, newHcparty, newHcparty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__PERSON, oldPerson, newPerson);
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
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsuranceType getInsurance() {
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurance(InsuranceType newInsurance, NotificationChain msgs) {
		InsuranceType oldInsurance = insurance;
		insurance = newInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__INSURANCE, oldInsurance, newInsurance);
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
	public void setInsurance(InsuranceType newInsurance) {
		if (newInsurance != insurance) {
			NotificationChain msgs = null;
			if (insurance != null)
				msgs = ((InternalEObject)insurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__INSURANCE, null, msgs);
			if (newInsurance != null)
				msgs = ((InternalEObject)newInsurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__INSURANCE, null, msgs);
			msgs = basicSetInsurance(newInsurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__INSURANCE, newInsurance, newInsurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncapacityType getIncapacity() {
		return incapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncapacity(IncapacityType newIncapacity, NotificationChain msgs) {
		IncapacityType oldIncapacity = incapacity;
		incapacity = newIncapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__INCAPACITY, oldIncapacity, newIncapacity);
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
	public void setIncapacity(IncapacityType newIncapacity) {
		if (newIncapacity != incapacity) {
			NotificationChain msgs = null;
			if (incapacity != null)
				msgs = ((InternalEObject)incapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__INCAPACITY, null, msgs);
			if (newIncapacity != null)
				msgs = ((InternalEObject)newIncapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__INCAPACITY, null, msgs);
			msgs = basicSetIncapacity(newIncapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__INCAPACITY, newIncapacity, newIncapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorType getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(ErrorType newError, NotificationChain msgs) {
		ErrorType oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__ERROR, oldError, newError);
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
	public void setError(ErrorType newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__ERROR, null, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__ERROR, null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductType getMedicinalproduct() {
		return medicinalproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicinalproduct(MedicinalProductType newMedicinalproduct, NotificationChain msgs) {
		MedicinalProductType oldMedicinalproduct = medicinalproduct;
		medicinalproduct = newMedicinalproduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT, oldMedicinalproduct, newMedicinalproduct);
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
	public void setMedicinalproduct(MedicinalProductType newMedicinalproduct) {
		if (newMedicinalproduct != medicinalproduct) {
			NotificationChain msgs = null;
			if (medicinalproduct != null)
				msgs = ((InternalEObject)medicinalproduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT, null, msgs);
			if (newMedicinalproduct != null)
				msgs = ((InternalEObject)newMedicinalproduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT, null, msgs);
			msgs = basicSetMedicinalproduct(newMedicinalproduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT, newMedicinalproduct, newMedicinalproduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceproductType getSubstanceproduct() {
		return substanceproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceproduct(SubstanceproductType newSubstanceproduct, NotificationChain msgs) {
		SubstanceproductType oldSubstanceproduct = substanceproduct;
		substanceproduct = newSubstanceproduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT, oldSubstanceproduct, newSubstanceproduct);
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
	public void setSubstanceproduct(SubstanceproductType newSubstanceproduct) {
		if (newSubstanceproduct != substanceproduct) {
			NotificationChain msgs = null;
			if (substanceproduct != null)
				msgs = ((InternalEObject)substanceproduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT, null, msgs);
			if (newSubstanceproduct != null)
				msgs = ((InternalEObject)newSubstanceproduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT, null, msgs);
			msgs = basicSetSubstanceproduct(newSubstanceproduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT, newSubstanceproduct, newSubstanceproduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundprescriptionType getCompoundprescription() {
		return compoundprescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundprescription(CompoundprescriptionType newCompoundprescription, NotificationChain msgs) {
		CompoundprescriptionType oldCompoundprescription = compoundprescription;
		compoundprescription = newCompoundprescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION, oldCompoundprescription, newCompoundprescription);
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
	public void setCompoundprescription(CompoundprescriptionType newCompoundprescription) {
		if (newCompoundprescription != compoundprescription) {
			NotificationChain msgs = null;
			if (compoundprescription != null)
				msgs = ((InternalEObject)compoundprescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION, null, msgs);
			if (newCompoundprescription != null)
				msgs = ((InternalEObject)newCompoundprescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION, null, msgs);
			msgs = basicSetCompoundprescription(newCompoundprescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION, newCompoundprescription, newCompoundprescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationType getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(MedicationType newMedication, NotificationChain msgs) {
		MedicationType oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MEDICATION, oldMedication, newMedication);
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
	public void setMedication(MedicationType newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HolterType getHolter() {
		return holter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolter(HolterType newHolter, NotificationChain msgs) {
		HolterType oldHolter = holter;
		holter = newHolter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__HOLTER, oldHolter, newHolter);
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
	public void setHolter(HolterType newHolter) {
		if (newHolter != holter) {
			NotificationChain msgs = null;
			if (holter != null)
				msgs = ((InternalEObject)holter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__HOLTER, null, msgs);
			if (newHolter != null)
				msgs = ((InternalEObject)newHolter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__HOLTER, null, msgs);
			msgs = basicSetHolter(newHolter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__HOLTER, newHolter, newHolter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getEcg() {
		return ecg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcg(TextType newEcg, NotificationChain msgs) {
		TextType oldEcg = ecg;
		ecg = newEcg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__ECG, oldEcg, newEcg);
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
	public void setEcg(TextType newEcg) {
		if (newEcg != ecg) {
			NotificationChain msgs = null;
			if (ecg != null)
				msgs = ((InternalEObject)ecg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__ECG, null, msgs);
			if (newEcg != null)
				msgs = ((InternalEObject)newEcg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__ECG, null, msgs);
			msgs = basicSetEcg(newEcg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__ECG, newEcg, newEcg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getBacteriology() {
		return bacteriology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBacteriology(TextType newBacteriology, NotificationChain msgs) {
		TextType oldBacteriology = bacteriology;
		bacteriology = newBacteriology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__BACTERIOLOGY, oldBacteriology, newBacteriology);
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
	public void setBacteriology(TextType newBacteriology) {
		if (newBacteriology != bacteriology) {
			NotificationChain msgs = null;
			if (bacteriology != null)
				msgs = ((InternalEObject)bacteriology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__BACTERIOLOGY, null, msgs);
			if (newBacteriology != null)
				msgs = ((InternalEObject)newBacteriology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__BACTERIOLOGY, null, msgs);
			msgs = basicSetBacteriology(newBacteriology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__BACTERIOLOGY, newBacteriology, newBacteriology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LnkType> getLnk() {
		if (lnk == null) {
			lnk = new EObjectContainmentEList<LnkType>(LnkType.class, this, KmehrPackage.CONTENT_TYPE__LNK);
		}
		return lnk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationBirthPlaceType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationBirthPlaceType newLocation, NotificationChain msgs) {
		LocationBirthPlaceType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(LocationBirthPlaceType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__UNIT, oldUnit, newUnit);
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
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinrefType getMinref() {
		return minref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinref(MinrefType newMinref, NotificationChain msgs) {
		MinrefType oldMinref = minref;
		minref = newMinref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MINREF, oldMinref, newMinref);
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
	public void setMinref(MinrefType newMinref) {
		if (newMinref != minref) {
			NotificationChain msgs = null;
			if (minref != null)
				msgs = ((InternalEObject)minref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MINREF, null, msgs);
			if (newMinref != null)
				msgs = ((InternalEObject)newMinref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MINREF, null, msgs);
			msgs = basicSetMinref(newMinref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MINREF, newMinref, newMinref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxrefType getMaxref() {
		return maxref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxref(MaxrefType newMaxref, NotificationChain msgs) {
		MaxrefType oldMaxref = maxref;
		maxref = newMaxref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MAXREF, oldMaxref, newMaxref);
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
	public void setMaxref(MaxrefType newMaxref) {
		if (newMaxref != maxref) {
			NotificationChain msgs = null;
			if (maxref != null)
				msgs = ((InternalEObject)maxref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MAXREF, null, msgs);
			if (newMaxref != null)
				msgs = ((InternalEObject)newMaxref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.CONTENT_TYPE__MAXREF, null, msgs);
			msgs = basicSetMaxref(newMaxref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.CONTENT_TYPE__MAXREF, newMaxref, newMaxref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefscopeType> getRefscope() {
		if (refscope == null) {
			refscope = new EObjectContainmentEList<RefscopeType>(RefscopeType.class, this, KmehrPackage.CONTENT_TYPE__REFSCOPE);
		}
		return refscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.CONTENT_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENT_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENT_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENT_TYPE__HCPARTY:
				return basicSetHcparty(null, msgs);
			case KmehrPackage.CONTENT_TYPE__PERSON:
				return basicSetPerson(null, msgs);
			case KmehrPackage.CONTENT_TYPE__INSURANCE:
				return basicSetInsurance(null, msgs);
			case KmehrPackage.CONTENT_TYPE__INCAPACITY:
				return basicSetIncapacity(null, msgs);
			case KmehrPackage.CONTENT_TYPE__ERROR:
				return basicSetError(null, msgs);
			case KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT:
				return basicSetMedicinalproduct(null, msgs);
			case KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT:
				return basicSetSubstanceproduct(null, msgs);
			case KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION:
				return basicSetCompoundprescription(null, msgs);
			case KmehrPackage.CONTENT_TYPE__MEDICATION:
				return basicSetMedication(null, msgs);
			case KmehrPackage.CONTENT_TYPE__HOLTER:
				return basicSetHolter(null, msgs);
			case KmehrPackage.CONTENT_TYPE__ECG:
				return basicSetEcg(null, msgs);
			case KmehrPackage.CONTENT_TYPE__BACTERIOLOGY:
				return basicSetBacteriology(null, msgs);
			case KmehrPackage.CONTENT_TYPE__LNK:
				return ((InternalEList<?>)getLnk()).basicRemove(otherEnd, msgs);
			case KmehrPackage.CONTENT_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
			case KmehrPackage.CONTENT_TYPE__UNIT:
				return basicSetUnit(null, msgs);
			case KmehrPackage.CONTENT_TYPE__MINREF:
				return basicSetMinref(null, msgs);
			case KmehrPackage.CONTENT_TYPE__MAXREF:
				return basicSetMaxref(null, msgs);
			case KmehrPackage.CONTENT_TYPE__REFSCOPE:
				return ((InternalEList<?>)getRefscope()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.CONTENT_TYPE__ID:
				return getId();
			case KmehrPackage.CONTENT_TYPE__CD:
				return getCd();
			case KmehrPackage.CONTENT_TYPE__DECIMAL:
				return getDecimal();
			case KmehrPackage.CONTENT_TYPE__UNSIGNED_INT:
				return getUnsignedInt();
			case KmehrPackage.CONTENT_TYPE__BOOLEAN:
				return isBoolean();
			case KmehrPackage.CONTENT_TYPE__TEXT:
				return getText();
			case KmehrPackage.CONTENT_TYPE__YEAR:
				return getYear();
			case KmehrPackage.CONTENT_TYPE__YEARMONTH:
				return getYearmonth();
			case KmehrPackage.CONTENT_TYPE__DATE:
				return getDate();
			case KmehrPackage.CONTENT_TYPE__TIME:
				return getTime();
			case KmehrPackage.CONTENT_TYPE__HCPARTY:
				return getHcparty();
			case KmehrPackage.CONTENT_TYPE__PERSON:
				return getPerson();
			case KmehrPackage.CONTENT_TYPE__INSURANCE:
				return getInsurance();
			case KmehrPackage.CONTENT_TYPE__INCAPACITY:
				return getIncapacity();
			case KmehrPackage.CONTENT_TYPE__ERROR:
				return getError();
			case KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT:
				return getMedicinalproduct();
			case KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT:
				return getSubstanceproduct();
			case KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION:
				return getCompoundprescription();
			case KmehrPackage.CONTENT_TYPE__MEDICATION:
				return getMedication();
			case KmehrPackage.CONTENT_TYPE__HOLTER:
				return getHolter();
			case KmehrPackage.CONTENT_TYPE__ECG:
				return getEcg();
			case KmehrPackage.CONTENT_TYPE__BACTERIOLOGY:
				return getBacteriology();
			case KmehrPackage.CONTENT_TYPE__LNK:
				return getLnk();
			case KmehrPackage.CONTENT_TYPE__LOCATION:
				return getLocation();
			case KmehrPackage.CONTENT_TYPE__UNIT:
				return getUnit();
			case KmehrPackage.CONTENT_TYPE__MINREF:
				return getMinref();
			case KmehrPackage.CONTENT_TYPE__MAXREF:
				return getMaxref();
			case KmehrPackage.CONTENT_TYPE__REFSCOPE:
				return getRefscope();
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
			case KmehrPackage.CONTENT_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDCONTENT>)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__DECIMAL:
				setDecimal((BigDecimal)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__UNSIGNED_INT:
				setUnsignedInt((Long)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__YEAR:
				setYear((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__YEARMONTH:
				setYearmonth((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__HCPARTY:
				setHcparty((HcpartyType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__PERSON:
				setPerson((PersonType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__INSURANCE:
				setInsurance((InsuranceType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__INCAPACITY:
				setIncapacity((IncapacityType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__ERROR:
				setError((ErrorType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT:
				setMedicinalproduct((MedicinalProductType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT:
				setSubstanceproduct((SubstanceproductType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION:
				setCompoundprescription((CompoundprescriptionType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__MEDICATION:
				setMedication((MedicationType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__HOLTER:
				setHolter((HolterType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__ECG:
				setEcg((TextType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__BACTERIOLOGY:
				setBacteriology((TextType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__LNK:
				getLnk().clear();
				getLnk().addAll((Collection<? extends LnkType>)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__LOCATION:
				setLocation((LocationBirthPlaceType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__UNIT:
				setUnit((UnitType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__MINREF:
				setMinref((MinrefType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__MAXREF:
				setMaxref((MaxrefType)newValue);
				return;
			case KmehrPackage.CONTENT_TYPE__REFSCOPE:
				getRefscope().clear();
				getRefscope().addAll((Collection<? extends RefscopeType>)newValue);
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
			case KmehrPackage.CONTENT_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.CONTENT_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.CONTENT_TYPE__DECIMAL:
				setDecimal(DECIMAL_EDEFAULT);
				return;
			case KmehrPackage.CONTENT_TYPE__UNSIGNED_INT:
				unsetUnsignedInt();
				return;
			case KmehrPackage.CONTENT_TYPE__BOOLEAN:
				unsetBoolean();
				return;
			case KmehrPackage.CONTENT_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.CONTENT_TYPE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case KmehrPackage.CONTENT_TYPE__YEARMONTH:
				setYearmonth(YEARMONTH_EDEFAULT);
				return;
			case KmehrPackage.CONTENT_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case KmehrPackage.CONTENT_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case KmehrPackage.CONTENT_TYPE__HCPARTY:
				setHcparty((HcpartyType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__PERSON:
				setPerson((PersonType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__INSURANCE:
				setInsurance((InsuranceType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__INCAPACITY:
				setIncapacity((IncapacityType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__ERROR:
				setError((ErrorType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT:
				setMedicinalproduct((MedicinalProductType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT:
				setSubstanceproduct((SubstanceproductType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION:
				setCompoundprescription((CompoundprescriptionType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__MEDICATION:
				setMedication((MedicationType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__HOLTER:
				setHolter((HolterType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__ECG:
				setEcg((TextType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__BACTERIOLOGY:
				setBacteriology((TextType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__LNK:
				getLnk().clear();
				return;
			case KmehrPackage.CONTENT_TYPE__LOCATION:
				setLocation((LocationBirthPlaceType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__UNIT:
				setUnit((UnitType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__MINREF:
				setMinref((MinrefType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__MAXREF:
				setMaxref((MaxrefType)null);
				return;
			case KmehrPackage.CONTENT_TYPE__REFSCOPE:
				getRefscope().clear();
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
			case KmehrPackage.CONTENT_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.CONTENT_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.CONTENT_TYPE__DECIMAL:
				return DECIMAL_EDEFAULT == null ? decimal != null : !DECIMAL_EDEFAULT.equals(decimal);
			case KmehrPackage.CONTENT_TYPE__UNSIGNED_INT:
				return isSetUnsignedInt();
			case KmehrPackage.CONTENT_TYPE__BOOLEAN:
				return isSetBoolean();
			case KmehrPackage.CONTENT_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case KmehrPackage.CONTENT_TYPE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case KmehrPackage.CONTENT_TYPE__YEARMONTH:
				return YEARMONTH_EDEFAULT == null ? yearmonth != null : !YEARMONTH_EDEFAULT.equals(yearmonth);
			case KmehrPackage.CONTENT_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case KmehrPackage.CONTENT_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case KmehrPackage.CONTENT_TYPE__HCPARTY:
				return hcparty != null;
			case KmehrPackage.CONTENT_TYPE__PERSON:
				return person != null;
			case KmehrPackage.CONTENT_TYPE__INSURANCE:
				return insurance != null;
			case KmehrPackage.CONTENT_TYPE__INCAPACITY:
				return incapacity != null;
			case KmehrPackage.CONTENT_TYPE__ERROR:
				return error != null;
			case KmehrPackage.CONTENT_TYPE__MEDICINALPRODUCT:
				return medicinalproduct != null;
			case KmehrPackage.CONTENT_TYPE__SUBSTANCEPRODUCT:
				return substanceproduct != null;
			case KmehrPackage.CONTENT_TYPE__COMPOUNDPRESCRIPTION:
				return compoundprescription != null;
			case KmehrPackage.CONTENT_TYPE__MEDICATION:
				return medication != null;
			case KmehrPackage.CONTENT_TYPE__HOLTER:
				return holter != null;
			case KmehrPackage.CONTENT_TYPE__ECG:
				return ecg != null;
			case KmehrPackage.CONTENT_TYPE__BACTERIOLOGY:
				return bacteriology != null;
			case KmehrPackage.CONTENT_TYPE__LNK:
				return lnk != null && !lnk.isEmpty();
			case KmehrPackage.CONTENT_TYPE__LOCATION:
				return location != null;
			case KmehrPackage.CONTENT_TYPE__UNIT:
				return unit != null;
			case KmehrPackage.CONTENT_TYPE__MINREF:
				return minref != null;
			case KmehrPackage.CONTENT_TYPE__MAXREF:
				return maxref != null;
			case KmehrPackage.CONTENT_TYPE__REFSCOPE:
				return refscope != null && !refscope.isEmpty();
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
		result.append(", unsignedInt: ");
		if (unsignedIntESet) result.append(unsignedInt); else result.append("<unset>");
		result.append(", boolean: ");
		if (booleanESet) result.append(boolean_); else result.append("<unset>");
		result.append(", year: ");
		result.append(year);
		result.append(", yearmonth: ");
		result.append(yearmonth);
		result.append(", date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ContentTypeImpl
