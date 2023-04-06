/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Posology Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl#getHigh <em>High</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl#getTakes <em>Takes</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PosologyTypeImpl extends MinimalEObjectImpl.Container implements PosologyType {
	/**
	 * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal low = LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal high = HIGH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected AdministrationunitType unit;

	/**
	 * The cached value of the '{@link #getTakes() <em>Takes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakes()
	 * @generated
	 * @ordered
	 */
	protected TakesType takes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PosologyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.POSOLOGY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLow(BigDecimal newLow) {
		BigDecimal oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigh(BigDecimal newHigh) {
		BigDecimal oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrationunitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(AdministrationunitType newUnit, NotificationChain msgs) {
		AdministrationunitType oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__UNIT, oldUnit, newUnit);
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
	public void setUnit(AdministrationunitType newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TakesType getTakes() {
		return takes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTakes(TakesType newTakes, NotificationChain msgs) {
		TakesType oldTakes = takes;
		takes = newTakes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__TAKES, oldTakes, newTakes);
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
	public void setTakes(TakesType newTakes) {
		if (newTakes != takes) {
			NotificationChain msgs = null;
			if (takes != null)
				msgs = ((InternalEObject)takes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__TAKES, null, msgs);
			if (newTakes != null)
				msgs = ((InternalEObject)newTakes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__TAKES, null, msgs);
			msgs = basicSetTakes(newTakes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__TAKES, newTakes, newTakes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.POSOLOGY_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.POSOLOGY_TYPE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.POSOLOGY_TYPE__UNIT:
				return basicSetUnit(null, msgs);
			case KmehrPackage.POSOLOGY_TYPE__TAKES:
				return basicSetTakes(null, msgs);
			case KmehrPackage.POSOLOGY_TYPE__TEXT:
				return basicSetText(null, msgs);
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
			case KmehrPackage.POSOLOGY_TYPE__LOW:
				return getLow();
			case KmehrPackage.POSOLOGY_TYPE__HIGH:
				return getHigh();
			case KmehrPackage.POSOLOGY_TYPE__UNIT:
				return getUnit();
			case KmehrPackage.POSOLOGY_TYPE__TAKES:
				return getTakes();
			case KmehrPackage.POSOLOGY_TYPE__TEXT:
				return getText();
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
			case KmehrPackage.POSOLOGY_TYPE__LOW:
				setLow((BigDecimal)newValue);
				return;
			case KmehrPackage.POSOLOGY_TYPE__HIGH:
				setHigh((BigDecimal)newValue);
				return;
			case KmehrPackage.POSOLOGY_TYPE__UNIT:
				setUnit((AdministrationunitType)newValue);
				return;
			case KmehrPackage.POSOLOGY_TYPE__TAKES:
				setTakes((TakesType)newValue);
				return;
			case KmehrPackage.POSOLOGY_TYPE__TEXT:
				setText((TextType)newValue);
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
			case KmehrPackage.POSOLOGY_TYPE__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case KmehrPackage.POSOLOGY_TYPE__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case KmehrPackage.POSOLOGY_TYPE__UNIT:
				setUnit((AdministrationunitType)null);
				return;
			case KmehrPackage.POSOLOGY_TYPE__TAKES:
				setTakes((TakesType)null);
				return;
			case KmehrPackage.POSOLOGY_TYPE__TEXT:
				setText((TextType)null);
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
			case KmehrPackage.POSOLOGY_TYPE__LOW:
				return LOW_EDEFAULT == null ? low != null : !LOW_EDEFAULT.equals(low);
			case KmehrPackage.POSOLOGY_TYPE__HIGH:
				return HIGH_EDEFAULT == null ? high != null : !HIGH_EDEFAULT.equals(high);
			case KmehrPackage.POSOLOGY_TYPE__UNIT:
				return unit != null;
			case KmehrPackage.POSOLOGY_TYPE__TAKES:
				return takes != null;
			case KmehrPackage.POSOLOGY_TYPE__TEXT:
				return text != null;
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
		result.append(" (low: ");
		result.append(low);
		result.append(", high: ");
		result.append(high);
		result.append(')');
		return result.toString();
	}

} //PosologyTypeImpl
