/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDADMINISTRATIONUNIT;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrationunit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationunitTypeImpl#getCd <em>Cd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrationunitTypeImpl extends MinimalEObjectImpl.Container implements AdministrationunitType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected CDADMINISTRATIONUNIT cd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrationunitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.ADMINISTRATIONUNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDADMINISTRATIONUNIT getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(CDADMINISTRATIONUNIT newCd, NotificationChain msgs) {
		CDADMINISTRATIONUNIT oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD, oldCd, newCd);
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
	public void setCd(CDADMINISTRATIONUNIT newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject)cd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject)newCd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD, newCd, newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD:
				return basicSetCd(null, msgs);
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
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD:
				return getCd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD:
				setCd((CDADMINISTRATIONUNIT)newValue);
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
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD:
				setCd((CDADMINISTRATIONUNIT)null);
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
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE__CD:
				return cd != null;
		}
		return super.eIsSet(featureID);
	}

} //AdministrationunitTypeImpl
