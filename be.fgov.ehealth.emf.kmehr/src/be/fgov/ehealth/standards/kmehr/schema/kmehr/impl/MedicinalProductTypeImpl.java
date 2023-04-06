/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType;

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
 * An implementation of the model object '<em><b>Medicinal Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl#getIntendedcd <em>Intendedcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl#getDeliveredcd <em>Deliveredcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl#getIntendedname <em>Intendedname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl#getDeliveredname <em>Deliveredname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductTypeImpl extends MinimalEObjectImpl.Container implements MedicinalProductType {
	/**
	 * The cached value of the '{@link #getIntendedcd() <em>Intendedcd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedcd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDDRUGCNK> intendedcd;

	/**
	 * The cached value of the '{@link #getDeliveredcd() <em>Deliveredcd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredcd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDDRUGCNK> deliveredcd;

	/**
	 * The default value of the '{@link #getIntendedname() <em>Intendedname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedname()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENDEDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntendedname() <em>Intendedname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedname()
	 * @generated
	 * @ordered
	 */
	protected String intendedname = INTENDEDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveredname() <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredname()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVEREDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveredname() <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredname()
	 * @generated
	 * @ordered
	 */
	protected String deliveredname = DELIVEREDNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.MEDICINAL_PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDDRUGCNK> getIntendedcd() {
		if (intendedcd == null) {
			intendedcd = new EObjectContainmentEList<CDDRUGCNK>(CDDRUGCNK.class, this, KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD);
		}
		return intendedcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDDRUGCNK> getDeliveredcd() {
		if (deliveredcd == null) {
			deliveredcd = new EObjectContainmentEList<CDDRUGCNK>(CDDRUGCNK.class, this, KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD);
		}
		return deliveredcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntendedname() {
		return intendedname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntendedname(String newIntendedname) {
		String oldIntendedname = intendedname;
		intendedname = newIntendedname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDNAME, oldIntendedname, intendedname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveredname() {
		return deliveredname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveredname(String newDeliveredname) {
		String oldDeliveredname = deliveredname;
		deliveredname = newDeliveredname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME, oldDeliveredname, deliveredname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD:
				return ((InternalEList<?>)getIntendedcd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD:
				return ((InternalEList<?>)getDeliveredcd()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD:
				return getIntendedcd();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD:
				return getDeliveredcd();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDNAME:
				return getIntendedname();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME:
				return getDeliveredname();
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
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD:
				getIntendedcd().clear();
				getIntendedcd().addAll((Collection<? extends CDDRUGCNK>)newValue);
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD:
				getDeliveredcd().clear();
				getDeliveredcd().addAll((Collection<? extends CDDRUGCNK>)newValue);
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDNAME:
				setIntendedname((String)newValue);
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME:
				setDeliveredname((String)newValue);
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
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD:
				getIntendedcd().clear();
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD:
				getDeliveredcd().clear();
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDNAME:
				setIntendedname(INTENDEDNAME_EDEFAULT);
				return;
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME:
				setDeliveredname(DELIVEREDNAME_EDEFAULT);
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
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDCD:
				return intendedcd != null && !intendedcd.isEmpty();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDCD:
				return deliveredcd != null && !deliveredcd.isEmpty();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__INTENDEDNAME:
				return INTENDEDNAME_EDEFAULT == null ? intendedname != null : !INTENDEDNAME_EDEFAULT.equals(intendedname);
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME:
				return DELIVEREDNAME_EDEFAULT == null ? deliveredname != null : !DELIVEREDNAME_EDEFAULT.equals(deliveredname);
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
		result.append(" (intendedname: ");
		result.append(intendedname);
		result.append(", deliveredname: ");
		result.append(deliveredname);
		result.append(')');
		return result.toString();
	}

} //MedicinalProductTypeImpl
