/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDHCPARTY;

import be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType;

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
 * An implementation of the model object '<em><b>Hcparty Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl#getTelecom <em>Telecom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HcpartyTypeImpl extends MinimalEObjectImpl.Container implements HcpartyType {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDHCPARTY> id;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDHCPARTY> cd;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HcpartyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.HCPARTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDHCPARTY> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDHCPARTY>(IDHCPARTY.class, this, KmehrPackage.HCPARTY_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDHCPARTY> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDHCPARTY>(CDHCPARTY.class, this, KmehrPackage.HCPARTY_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HCPARTY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HCPARTY_TYPE__FIRSTNAME, oldFirstname, firstname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HCPARTY_TYPE__FAMILYNAME, oldFamilyname, familyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressType>(AddressType.class, this, KmehrPackage.HCPARTY_TYPE__ADDRESS);
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
			telecom = new EObjectContainmentEList<TelecomType>(TelecomType.class, this, KmehrPackage.HCPARTY_TYPE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.HCPARTY_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HCPARTY_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HCPARTY_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HCPARTY_TYPE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.HCPARTY_TYPE__ID:
				return getId();
			case KmehrPackage.HCPARTY_TYPE__CD:
				return getCd();
			case KmehrPackage.HCPARTY_TYPE__NAME:
				return getName();
			case KmehrPackage.HCPARTY_TYPE__FIRSTNAME:
				return getFirstname();
			case KmehrPackage.HCPARTY_TYPE__FAMILYNAME:
				return getFamilyname();
			case KmehrPackage.HCPARTY_TYPE__ADDRESS:
				return getAddress();
			case KmehrPackage.HCPARTY_TYPE__TELECOM:
				return getTelecom();
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
			case KmehrPackage.HCPARTY_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDHCPARTY>)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDHCPARTY>)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__NAME:
				setName((String)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__FAMILYNAME:
				setFamilyname((String)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case KmehrPackage.HCPARTY_TYPE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends TelecomType>)newValue);
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
			case KmehrPackage.HCPARTY_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.HCPARTY_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.HCPARTY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KmehrPackage.HCPARTY_TYPE__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case KmehrPackage.HCPARTY_TYPE__FAMILYNAME:
				setFamilyname(FAMILYNAME_EDEFAULT);
				return;
			case KmehrPackage.HCPARTY_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case KmehrPackage.HCPARTY_TYPE__TELECOM:
				getTelecom().clear();
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
			case KmehrPackage.HCPARTY_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.HCPARTY_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.HCPARTY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KmehrPackage.HCPARTY_TYPE__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case KmehrPackage.HCPARTY_TYPE__FAMILYNAME:
				return FAMILYNAME_EDEFAULT == null ? familyname != null : !FAMILYNAME_EDEFAULT.equals(familyname);
			case KmehrPackage.HCPARTY_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case KmehrPackage.HCPARTY_TYPE__TELECOM:
				return telecom != null && !telecom.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", familyname: ");
		result.append(familyname);
		result.append(')');
		return result.toString();
	}

} //HcpartyTypeImpl
