/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDADDRESS;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Address Type Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getNis <em>Nis</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getCity <em>City</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getPostboxnumber <em>Postboxnumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressTypeBaseImpl extends MinimalEObjectImpl.Container implements AddressTypeBase {
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
	protected EList<CDADDRESS> cd;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType country;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNis() <em>Nis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNis()
	 * @generated
	 * @ordered
	 */
	protected static final String NIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNis() <em>Nis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNis()
	 * @generated
	 * @ordered
	 */
	protected String nis = NIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRICT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected String district = DISTRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHousenumber() <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHousenumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSENUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHousenumber() <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHousenumber()
	 * @generated
	 * @ordered
	 */
	protected String housenumber = HOUSENUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostboxnumber() <em>Postboxnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostboxnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTBOXNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostboxnumber() <em>Postboxnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostboxnumber()
	 * @generated
	 * @ordered
	 */
	protected String postboxnumber = POSTBOXNUMBER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressTypeBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.ADDRESS_TYPE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.ADDRESS_TYPE_BASE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDADDRESS> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDADDRESS>(CDADDRESS.class, this, KmehrPackage.ADDRESS_TYPE_BASE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CountryType newCountry, NotificationChain msgs) {
		CountryType oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(CountryType newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNis() {
		return nis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNis(String newNis) {
		String oldNis = nis;
		nis = newNis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__NIS, oldNis, nis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistrict(String newDistrict) {
		String oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__DISTRICT, oldDistrict, district));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHousenumber() {
		return housenumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHousenumber(String newHousenumber) {
		String oldHousenumber = housenumber;
		housenumber = newHousenumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__HOUSENUMBER, oldHousenumber, housenumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostboxnumber() {
		return postboxnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostboxnumber(String newPostboxnumber) {
		String oldPostboxnumber = postboxnumber;
		postboxnumber = newPostboxnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADDRESS_TYPE_BASE__POSTBOXNUMBER, oldPostboxnumber, postboxnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, KmehrPackage.ADDRESS_TYPE_BASE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.ADDRESS_TYPE_BASE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ADDRESS_TYPE_BASE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY:
				return basicSetCountry(null, msgs);
			case KmehrPackage.ADDRESS_TYPE_BASE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.ADDRESS_TYPE_BASE__ID:
				return getId();
			case KmehrPackage.ADDRESS_TYPE_BASE__CD:
				return getCd();
			case KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY:
				return getCountry();
			case KmehrPackage.ADDRESS_TYPE_BASE__ZIP:
				return getZip();
			case KmehrPackage.ADDRESS_TYPE_BASE__NIS:
				return getNis();
			case KmehrPackage.ADDRESS_TYPE_BASE__CITY:
				return getCity();
			case KmehrPackage.ADDRESS_TYPE_BASE__DISTRICT:
				return getDistrict();
			case KmehrPackage.ADDRESS_TYPE_BASE__STREET:
				return getStreet();
			case KmehrPackage.ADDRESS_TYPE_BASE__HOUSENUMBER:
				return getHousenumber();
			case KmehrPackage.ADDRESS_TYPE_BASE__POSTBOXNUMBER:
				return getPostboxnumber();
			case KmehrPackage.ADDRESS_TYPE_BASE__TEXT:
				return getText();
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
			case KmehrPackage.ADDRESS_TYPE_BASE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDADDRESS>)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY:
				setCountry((CountryType)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__ZIP:
				setZip((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__NIS:
				setNis((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__CITY:
				setCity((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__DISTRICT:
				setDistrict((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__STREET:
				setStreet((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__HOUSENUMBER:
				setHousenumber((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__POSTBOXNUMBER:
				setPostboxnumber((String)newValue);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
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
			case KmehrPackage.ADDRESS_TYPE_BASE__ID:
				getId().clear();
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__CD:
				getCd().clear();
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY:
				setCountry((CountryType)null);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__NIS:
				setNis(NIS_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__DISTRICT:
				setDistrict(DISTRICT_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__HOUSENUMBER:
				setHousenumber(HOUSENUMBER_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__POSTBOXNUMBER:
				setPostboxnumber(POSTBOXNUMBER_EDEFAULT);
				return;
			case KmehrPackage.ADDRESS_TYPE_BASE__TEXT:
				getText().clear();
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
			case KmehrPackage.ADDRESS_TYPE_BASE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.ADDRESS_TYPE_BASE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.ADDRESS_TYPE_BASE__COUNTRY:
				return country != null;
			case KmehrPackage.ADDRESS_TYPE_BASE__ZIP:
				return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
			case KmehrPackage.ADDRESS_TYPE_BASE__NIS:
				return NIS_EDEFAULT == null ? nis != null : !NIS_EDEFAULT.equals(nis);
			case KmehrPackage.ADDRESS_TYPE_BASE__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case KmehrPackage.ADDRESS_TYPE_BASE__DISTRICT:
				return DISTRICT_EDEFAULT == null ? district != null : !DISTRICT_EDEFAULT.equals(district);
			case KmehrPackage.ADDRESS_TYPE_BASE__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case KmehrPackage.ADDRESS_TYPE_BASE__HOUSENUMBER:
				return HOUSENUMBER_EDEFAULT == null ? housenumber != null : !HOUSENUMBER_EDEFAULT.equals(housenumber);
			case KmehrPackage.ADDRESS_TYPE_BASE__POSTBOXNUMBER:
				return POSTBOXNUMBER_EDEFAULT == null ? postboxnumber != null : !POSTBOXNUMBER_EDEFAULT.equals(postboxnumber);
			case KmehrPackage.ADDRESS_TYPE_BASE__TEXT:
				return text != null && !text.isEmpty();
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
		result.append(" (zip: ");
		result.append(zip);
		result.append(", nis: ");
		result.append(nis);
		result.append(", city: ");
		result.append(city);
		result.append(", district: ");
		result.append(district);
		result.append(", street: ");
		result.append(street);
		result.append(", housenumber: ");
		result.append(housenumber);
		result.append(", postboxnumber: ");
		result.append(postboxnumber);
		result.append(')');
		return result.toString();
	}

} //AddressTypeBaseImpl
