/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getNominator <em>Nominator</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl#getPeriodicity <em>Periodicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyTypeImpl extends MinimalEObjectImpl.Container implements FrequencyType {
	/**
	 * The cached value of the '{@link #getNominator() <em>Nominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominator()
	 * @generated
	 * @ordered
	 */
	protected NominatorType nominator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected DenominatorType denominator;

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
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType unit;

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
	 * The cached value of the '{@link #getPeriodicity() <em>Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected PeriodicityType periodicity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.FREQUENCY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NominatorType getNominator() {
		return nominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominator(NominatorType newNominator, NotificationChain msgs) {
		NominatorType oldNominator = nominator;
		nominator = newNominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__NOMINATOR, oldNominator, newNominator);
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
	public void setNominator(NominatorType newNominator) {
		if (newNominator != nominator) {
			NotificationChain msgs = null;
			if (nominator != null)
				msgs = ((InternalEObject)nominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__NOMINATOR, null, msgs);
			if (newNominator != null)
				msgs = ((InternalEObject)newNominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__NOMINATOR, null, msgs);
			msgs = basicSetNominator(newNominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__NOMINATOR, newNominator, newNominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DenominatorType getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(DenominatorType newDenominator, NotificationChain msgs) {
		DenominatorType oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__DENOMINATOR, oldDenominator, newDenominator);
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
	public void setDenominator(DenominatorType newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__DENOMINATOR, newDenominator, newDenominator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__DECIMAL, oldDecimal, decimal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__UNIT, oldUnit, newUnit);
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
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__UNIT, newUnit, newUnit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicityType getPeriodicity() {
		return periodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicity(PeriodicityType newPeriodicity, NotificationChain msgs) {
		PeriodicityType oldPeriodicity = periodicity;
		periodicity = newPeriodicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__PERIODICITY, oldPeriodicity, newPeriodicity);
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
	public void setPeriodicity(PeriodicityType newPeriodicity) {
		if (newPeriodicity != periodicity) {
			NotificationChain msgs = null;
			if (periodicity != null)
				msgs = ((InternalEObject)periodicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__PERIODICITY, null, msgs);
			if (newPeriodicity != null)
				msgs = ((InternalEObject)newPeriodicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FREQUENCY_TYPE__PERIODICITY, null, msgs);
			msgs = basicSetPeriodicity(newPeriodicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FREQUENCY_TYPE__PERIODICITY, newPeriodicity, newPeriodicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.FREQUENCY_TYPE__NOMINATOR:
				return basicSetNominator(null, msgs);
			case KmehrPackage.FREQUENCY_TYPE__DENOMINATOR:
				return basicSetDenominator(null, msgs);
			case KmehrPackage.FREQUENCY_TYPE__UNIT:
				return basicSetUnit(null, msgs);
			case KmehrPackage.FREQUENCY_TYPE__TEXT:
				return basicSetText(null, msgs);
			case KmehrPackage.FREQUENCY_TYPE__PERIODICITY:
				return basicSetPeriodicity(null, msgs);
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
			case KmehrPackage.FREQUENCY_TYPE__NOMINATOR:
				return getNominator();
			case KmehrPackage.FREQUENCY_TYPE__DENOMINATOR:
				return getDenominator();
			case KmehrPackage.FREQUENCY_TYPE__DECIMAL:
				return getDecimal();
			case KmehrPackage.FREQUENCY_TYPE__UNIT:
				return getUnit();
			case KmehrPackage.FREQUENCY_TYPE__TEXT:
				return getText();
			case KmehrPackage.FREQUENCY_TYPE__PERIODICITY:
				return getPeriodicity();
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
			case KmehrPackage.FREQUENCY_TYPE__NOMINATOR:
				setNominator((NominatorType)newValue);
				return;
			case KmehrPackage.FREQUENCY_TYPE__DENOMINATOR:
				setDenominator((DenominatorType)newValue);
				return;
			case KmehrPackage.FREQUENCY_TYPE__DECIMAL:
				setDecimal((BigDecimal)newValue);
				return;
			case KmehrPackage.FREQUENCY_TYPE__UNIT:
				setUnit((UnitType)newValue);
				return;
			case KmehrPackage.FREQUENCY_TYPE__TEXT:
				setText((TextType)newValue);
				return;
			case KmehrPackage.FREQUENCY_TYPE__PERIODICITY:
				setPeriodicity((PeriodicityType)newValue);
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
			case KmehrPackage.FREQUENCY_TYPE__NOMINATOR:
				setNominator((NominatorType)null);
				return;
			case KmehrPackage.FREQUENCY_TYPE__DENOMINATOR:
				setDenominator((DenominatorType)null);
				return;
			case KmehrPackage.FREQUENCY_TYPE__DECIMAL:
				setDecimal(DECIMAL_EDEFAULT);
				return;
			case KmehrPackage.FREQUENCY_TYPE__UNIT:
				setUnit((UnitType)null);
				return;
			case KmehrPackage.FREQUENCY_TYPE__TEXT:
				setText((TextType)null);
				return;
			case KmehrPackage.FREQUENCY_TYPE__PERIODICITY:
				setPeriodicity((PeriodicityType)null);
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
			case KmehrPackage.FREQUENCY_TYPE__NOMINATOR:
				return nominator != null;
			case KmehrPackage.FREQUENCY_TYPE__DENOMINATOR:
				return denominator != null;
			case KmehrPackage.FREQUENCY_TYPE__DECIMAL:
				return DECIMAL_EDEFAULT == null ? decimal != null : !DECIMAL_EDEFAULT.equals(decimal);
			case KmehrPackage.FREQUENCY_TYPE__UNIT:
				return unit != null;
			case KmehrPackage.FREQUENCY_TYPE__TEXT:
				return text != null;
			case KmehrPackage.FREQUENCY_TYPE__PERIODICITY:
				return periodicity != null;
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
		result.append(')');
		return result.toString();
	}

} //FrequencyTypeImpl
