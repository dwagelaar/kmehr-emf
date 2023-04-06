/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITY;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Incapacity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl#getIncapacityreason <em>Incapacityreason</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl#isOutofhomeallowed <em>Outofhomeallowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncapacityTypeImpl extends MinimalEObjectImpl.Container implements IncapacityType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDINCAPACITY> cd;

	/**
	 * The cached value of the '{@link #getIncapacityreason() <em>Incapacityreason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncapacityreason()
	 * @generated
	 * @ordered
	 */
	protected IncapacityreasonType incapacityreason;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutofhomeallowed() <em>Outofhomeallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutofhomeallowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTOFHOMEALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutofhomeallowed() <em>Outofhomeallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutofhomeallowed()
	 * @generated
	 * @ordered
	 */
	protected boolean outofhomeallowed = OUTOFHOMEALLOWED_EDEFAULT;

	/**
	 * This is true if the Outofhomeallowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outofhomeallowedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncapacityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.INCAPACITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDINCAPACITY> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDINCAPACITY>(CDINCAPACITY.class, this, KmehrPackage.INCAPACITY_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncapacityreasonType getIncapacityreason() {
		return incapacityreason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncapacityreason(IncapacityreasonType newIncapacityreason, NotificationChain msgs) {
		IncapacityreasonType oldIncapacityreason = incapacityreason;
		incapacityreason = newIncapacityreason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON, oldIncapacityreason, newIncapacityreason);
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
	public void setIncapacityreason(IncapacityreasonType newIncapacityreason) {
		if (newIncapacityreason != incapacityreason) {
			NotificationChain msgs = null;
			if (incapacityreason != null)
				msgs = ((InternalEObject)incapacityreason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON, null, msgs);
			if (newIncapacityreason != null)
				msgs = ((InternalEObject)newIncapacityreason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON, null, msgs);
			msgs = basicSetIncapacityreason(newIncapacityreason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON, newIncapacityreason, newIncapacityreason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentage(BigDecimal newPercentage) {
		BigDecimal oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INCAPACITY_TYPE__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOutofhomeallowed() {
		return outofhomeallowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutofhomeallowed(boolean newOutofhomeallowed) {
		boolean oldOutofhomeallowed = outofhomeallowed;
		outofhomeallowed = newOutofhomeallowed;
		boolean oldOutofhomeallowedESet = outofhomeallowedESet;
		outofhomeallowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED, oldOutofhomeallowed, outofhomeallowed, !oldOutofhomeallowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOutofhomeallowed() {
		boolean oldOutofhomeallowed = outofhomeallowed;
		boolean oldOutofhomeallowedESet = outofhomeallowedESet;
		outofhomeallowed = OUTOFHOMEALLOWED_EDEFAULT;
		outofhomeallowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED, oldOutofhomeallowed, OUTOFHOMEALLOWED_EDEFAULT, oldOutofhomeallowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutofhomeallowed() {
		return outofhomeallowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.INCAPACITY_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON:
				return basicSetIncapacityreason(null, msgs);
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
			case KmehrPackage.INCAPACITY_TYPE__CD:
				return getCd();
			case KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON:
				return getIncapacityreason();
			case KmehrPackage.INCAPACITY_TYPE__PERCENTAGE:
				return getPercentage();
			case KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED:
				return isOutofhomeallowed();
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
			case KmehrPackage.INCAPACITY_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDINCAPACITY>)newValue);
				return;
			case KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON:
				setIncapacityreason((IncapacityreasonType)newValue);
				return;
			case KmehrPackage.INCAPACITY_TYPE__PERCENTAGE:
				setPercentage((BigDecimal)newValue);
				return;
			case KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED:
				setOutofhomeallowed((Boolean)newValue);
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
			case KmehrPackage.INCAPACITY_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON:
				setIncapacityreason((IncapacityreasonType)null);
				return;
			case KmehrPackage.INCAPACITY_TYPE__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED:
				unsetOutofhomeallowed();
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
			case KmehrPackage.INCAPACITY_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.INCAPACITY_TYPE__INCAPACITYREASON:
				return incapacityreason != null;
			case KmehrPackage.INCAPACITY_TYPE__PERCENTAGE:
				return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
			case KmehrPackage.INCAPACITY_TYPE__OUTOFHOMEALLOWED:
				return isSetOutofhomeallowed();
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(", outofhomeallowed: ");
		if (outofhomeallowedESet) result.append(outofhomeallowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IncapacityTypeImpl
