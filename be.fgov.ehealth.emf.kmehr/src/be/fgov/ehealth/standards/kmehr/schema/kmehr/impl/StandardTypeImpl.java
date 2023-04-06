/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDSTANDARD;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardTypeImpl extends MinimalEObjectImpl.Container implements StandardType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected CDSTANDARD cd;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected SpecialisationType specialisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.STANDARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTANDARD getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(CDSTANDARD newCd, NotificationChain msgs) {
		CDSTANDARD oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.STANDARD_TYPE__CD, oldCd, newCd);
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
	public void setCd(CDSTANDARD newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject)cd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.STANDARD_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject)newCd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.STANDARD_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.STANDARD_TYPE__CD, newCd, newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecialisationType getSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(SpecialisationType newSpecialisation, NotificationChain msgs) {
		SpecialisationType oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.STANDARD_TYPE__SPECIALISATION, oldSpecialisation, newSpecialisation);
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
	public void setSpecialisation(SpecialisationType newSpecialisation) {
		if (newSpecialisation != specialisation) {
			NotificationChain msgs = null;
			if (specialisation != null)
				msgs = ((InternalEObject)specialisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.STANDARD_TYPE__SPECIALISATION, null, msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.STANDARD_TYPE__SPECIALISATION, null, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.STANDARD_TYPE__SPECIALISATION, newSpecialisation, newSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.STANDARD_TYPE__CD:
				return basicSetCd(null, msgs);
			case KmehrPackage.STANDARD_TYPE__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
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
			case KmehrPackage.STANDARD_TYPE__CD:
				return getCd();
			case KmehrPackage.STANDARD_TYPE__SPECIALISATION:
				return getSpecialisation();
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
			case KmehrPackage.STANDARD_TYPE__CD:
				setCd((CDSTANDARD)newValue);
				return;
			case KmehrPackage.STANDARD_TYPE__SPECIALISATION:
				setSpecialisation((SpecialisationType)newValue);
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
			case KmehrPackage.STANDARD_TYPE__CD:
				setCd((CDSTANDARD)null);
				return;
			case KmehrPackage.STANDARD_TYPE__SPECIALISATION:
				setSpecialisation((SpecialisationType)null);
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
			case KmehrPackage.STANDARD_TYPE__CD:
				return cd != null;
			case KmehrPackage.STANDARD_TYPE__SPECIALISATION:
				return specialisation != null;
		}
		return super.eIsSet(featureID);
	}

} //StandardTypeImpl
