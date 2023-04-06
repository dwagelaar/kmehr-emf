/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDTELECOM;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

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
 * An implementation of the model object '<em><b>Telecom Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl#getTelecomnumber <em>Telecomnumber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelecomTypeImpl extends MinimalEObjectImpl.Container implements TelecomType {
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
	protected EList<CDTELECOM> cd;

	/**
	 * The default value of the '{@link #getTelecomnumber() <em>Telecomnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TELECOMNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelecomnumber() <em>Telecomnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomnumber()
	 * @generated
	 * @ordered
	 */
	protected String telecomnumber = TELECOMNUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.TELECOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.TELECOM_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDTELECOM> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDTELECOM>(CDTELECOM.class, this, KmehrPackage.TELECOM_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelecomnumber() {
		return telecomnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelecomnumber(String newTelecomnumber) {
		String oldTelecomnumber = telecomnumber;
		telecomnumber = newTelecomnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TELECOM_TYPE__TELECOMNUMBER, oldTelecomnumber, telecomnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.TELECOM_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TELECOM_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.TELECOM_TYPE__ID:
				return getId();
			case KmehrPackage.TELECOM_TYPE__CD:
				return getCd();
			case KmehrPackage.TELECOM_TYPE__TELECOMNUMBER:
				return getTelecomnumber();
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
			case KmehrPackage.TELECOM_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.TELECOM_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDTELECOM>)newValue);
				return;
			case KmehrPackage.TELECOM_TYPE__TELECOMNUMBER:
				setTelecomnumber((String)newValue);
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
			case KmehrPackage.TELECOM_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.TELECOM_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.TELECOM_TYPE__TELECOMNUMBER:
				setTelecomnumber(TELECOMNUMBER_EDEFAULT);
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
			case KmehrPackage.TELECOM_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.TELECOM_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.TELECOM_TYPE__TELECOMNUMBER:
				return TELECOMNUMBER_EDEFAULT == null ? telecomnumber != null : !TELECOMNUMBER_EDEFAULT.equals(telecomnumber);
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
		result.append(" (telecomnumber: ");
		result.append(telecomnumber);
		result.append(')');
		return result.toString();
	}

} //TelecomTypeImpl
