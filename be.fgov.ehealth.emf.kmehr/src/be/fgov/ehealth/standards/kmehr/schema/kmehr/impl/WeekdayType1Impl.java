/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weekday Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayType1Impl#getWeeknumber <em>Weeknumber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeekdayType1Impl extends WeekdayTypeImpl implements WeekdayType1 {
	/**
	 * The default value of the '{@link #getWeeknumber() <em>Weeknumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeknumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WEEKNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeeknumber() <em>Weeknumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeknumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger weeknumber = WEEKNUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekdayType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.WEEKDAY_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getWeeknumber() {
		return weeknumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeeknumber(BigInteger newWeeknumber) {
		BigInteger oldWeeknumber = weeknumber;
		weeknumber = newWeeknumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.WEEKDAY_TYPE1__WEEKNUMBER, oldWeeknumber, weeknumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmehrPackage.WEEKDAY_TYPE1__WEEKNUMBER:
				return getWeeknumber();
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
			case KmehrPackage.WEEKDAY_TYPE1__WEEKNUMBER:
				setWeeknumber((BigInteger)newValue);
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
			case KmehrPackage.WEEKDAY_TYPE1__WEEKNUMBER:
				setWeeknumber(WEEKNUMBER_EDEFAULT);
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
			case KmehrPackage.WEEKDAY_TYPE1__WEEKNUMBER:
				return WEEKNUMBER_EDEFAULT == null ? weeknumber != null : !WEEKNUMBER_EDEFAULT.equals(weeknumber);
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
		result.append(" (weeknumber: ");
		result.append(weeknumber);
		result.append(')');
		return result.toString();
	}

} //WeekdayType1Impl
