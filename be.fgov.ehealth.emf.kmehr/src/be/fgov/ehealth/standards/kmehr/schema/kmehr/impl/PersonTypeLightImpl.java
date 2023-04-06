/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Person Type Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl#getTelecom <em>Telecom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonTypeLightImpl extends MinimalEObjectImpl.Container implements PersonTypeLight {
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
	protected PersonTypeLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.PERSON_TYPE_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDPATIENT> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDPATIENT>(IDPATIENT.class, this, KmehrPackage.PERSON_TYPE_LIGHT__ID);
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
			firstname = new EDataTypeEList<String>(String.class, this, KmehrPackage.PERSON_TYPE_LIGHT__FIRSTNAME);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.PERSON_TYPE_LIGHT__FAMILYNAME, oldFamilyname, familyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressType>(AddressType.class, this, KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS);
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
			telecom = new EObjectContainmentEList<TelecomType>(TelecomType.class, this, KmehrPackage.PERSON_TYPE_LIGHT__TELECOM);
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
			case KmehrPackage.PERSON_TYPE_LIGHT__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case KmehrPackage.PERSON_TYPE_LIGHT__TELECOM:
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
			case KmehrPackage.PERSON_TYPE_LIGHT__ID:
				return getId();
			case KmehrPackage.PERSON_TYPE_LIGHT__FIRSTNAME:
				return getFirstname();
			case KmehrPackage.PERSON_TYPE_LIGHT__FAMILYNAME:
				return getFamilyname();
			case KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS:
				return getAddress();
			case KmehrPackage.PERSON_TYPE_LIGHT__TELECOM:
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
			case KmehrPackage.PERSON_TYPE_LIGHT__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDPATIENT>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__FIRSTNAME:
				getFirstname().clear();
				getFirstname().addAll((Collection<? extends String>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__FAMILYNAME:
				setFamilyname((String)newValue);
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__TELECOM:
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
			case KmehrPackage.PERSON_TYPE_LIGHT__ID:
				getId().clear();
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__FIRSTNAME:
				getFirstname().clear();
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__FAMILYNAME:
				setFamilyname(FAMILYNAME_EDEFAULT);
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS:
				getAddress().clear();
				return;
			case KmehrPackage.PERSON_TYPE_LIGHT__TELECOM:
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
			case KmehrPackage.PERSON_TYPE_LIGHT__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.PERSON_TYPE_LIGHT__FIRSTNAME:
				return firstname != null && !firstname.isEmpty();
			case KmehrPackage.PERSON_TYPE_LIGHT__FAMILYNAME:
				return FAMILYNAME_EDEFAULT == null ? familyname != null : !FAMILYNAME_EDEFAULT.equals(familyname);
			case KmehrPackage.PERSON_TYPE_LIGHT__ADDRESS:
				return address != null && !address.isEmpty();
			case KmehrPackage.PERSON_TYPE_LIGHT__TELECOM:
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", familyname: ");
		result.append(familyname);
		result.append(')');
		return result.toString();
	}

} //PersonTypeLightImpl
