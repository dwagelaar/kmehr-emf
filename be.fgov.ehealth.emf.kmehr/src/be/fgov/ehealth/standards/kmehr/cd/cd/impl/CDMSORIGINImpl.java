/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDMSORIGIN;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDMSORIGINvalues;
import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDMSORIGIN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getDN <em>DN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getL <em>L</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getSL <em>SL</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDMSORIGINImpl#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDMSORIGINImpl extends MinimalEObjectImpl.Container implements CDMSORIGIN {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final CDMSORIGINvalues VALUE_EDEFAULT = CDMSORIGINvalues.REGULARPROCESS;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CDMSORIGINvalues value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getDN() <em>DN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDN()
	 * @generated
	 * @ordered
	 */
	protected static final String DN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDN() <em>DN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDN()
	 * @generated
	 * @ordered
	 */
	protected String dN = DN_EDEFAULT;

	/**
	 * The default value of the '{@link #getL() <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected static final String L_EDEFAULT = "en";

	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected String l = L_EDEFAULT;

	/**
	 * This is true if the L attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lESet;

	/**
	 * The default value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final String S_EDEFAULT = "CD-MS-ORIGIN";

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected String s = S_EDEFAULT;

	/**
	 * This is true if the S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sESet;

	/**
	 * The default value of the '{@link #getSL() <em>SL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSL()
	 * @generated
	 * @ordered
	 */
	protected static final String SL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSL() <em>SL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSL()
	 * @generated
	 * @ordered
	 */
	protected String sL = SL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected String sV = SV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDMSORIGINImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdPackage.eINSTANCE.getCDMSORIGIN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMSORIGINvalues getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(CDMSORIGINvalues newValue) {
		CDMSORIGINvalues oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValue() {
		CDMSORIGINvalues oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDMSORIGIN__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDN() {
		return dN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDN(String newDN) {
		String oldDN = dN;
		dN = newDN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__DN, oldDN, dN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setL(String newL) {
		String oldL = l;
		l = newL;
		boolean oldLESet = lESet;
		lESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__L, oldL, l, !oldLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetL() {
		String oldL = l;
		boolean oldLESet = lESet;
		l = L_EDEFAULT;
		lESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDMSORIGIN__L, oldL, L_EDEFAULT, oldLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetL() {
		return lESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS(String newS) {
		String oldS = s;
		s = newS;
		boolean oldSESet = sESet;
		sESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__S, oldS, s, !oldSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetS() {
		String oldS = s;
		boolean oldSESet = sESet;
		s = S_EDEFAULT;
		sESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDMSORIGIN__S, oldS, S_EDEFAULT, oldSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetS() {
		return sESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSL() {
		return sL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSL(String newSL) {
		String oldSL = sL;
		sL = newSL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__SL, oldSL, sL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSV() {
		return sV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSV(String newSV) {
		String oldSV = sV;
		sV = newSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDMSORIGIN__SV, oldSV, sV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdPackage.CDMSORIGIN__VALUE:
				return getValue();
			case CdPackage.CDMSORIGIN__DN:
				return getDN();
			case CdPackage.CDMSORIGIN__L:
				return getL();
			case CdPackage.CDMSORIGIN__S:
				return getS();
			case CdPackage.CDMSORIGIN__SL:
				return getSL();
			case CdPackage.CDMSORIGIN__SV:
				return getSV();
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
			case CdPackage.CDMSORIGIN__VALUE:
				setValue((CDMSORIGINvalues)newValue);
				return;
			case CdPackage.CDMSORIGIN__DN:
				setDN((String)newValue);
				return;
			case CdPackage.CDMSORIGIN__L:
				setL((String)newValue);
				return;
			case CdPackage.CDMSORIGIN__S:
				setS((String)newValue);
				return;
			case CdPackage.CDMSORIGIN__SL:
				setSL((String)newValue);
				return;
			case CdPackage.CDMSORIGIN__SV:
				setSV((String)newValue);
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
			case CdPackage.CDMSORIGIN__VALUE:
				unsetValue();
				return;
			case CdPackage.CDMSORIGIN__DN:
				setDN(DN_EDEFAULT);
				return;
			case CdPackage.CDMSORIGIN__L:
				unsetL();
				return;
			case CdPackage.CDMSORIGIN__S:
				unsetS();
				return;
			case CdPackage.CDMSORIGIN__SL:
				setSL(SL_EDEFAULT);
				return;
			case CdPackage.CDMSORIGIN__SV:
				setSV(SV_EDEFAULT);
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
			case CdPackage.CDMSORIGIN__VALUE:
				return isSetValue();
			case CdPackage.CDMSORIGIN__DN:
				return DN_EDEFAULT == null ? dN != null : !DN_EDEFAULT.equals(dN);
			case CdPackage.CDMSORIGIN__L:
				return isSetL();
			case CdPackage.CDMSORIGIN__S:
				return isSetS();
			case CdPackage.CDMSORIGIN__SL:
				return SL_EDEFAULT == null ? sL != null : !SL_EDEFAULT.equals(sL);
			case CdPackage.CDMSORIGIN__SV:
				return SV_EDEFAULT == null ? sV != null : !SV_EDEFAULT.equals(sV);
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", dN: ");
		result.append(dN);
		result.append(", l: ");
		if (lESet) result.append(l); else result.append("<unset>");
		result.append(", s: ");
		if (sESet) result.append(s); else result.append("<unset>");
		result.append(", sL: ");
		result.append(sL);
		result.append(", sV: ");
		result.append(sV);
		result.append(')');
		return result.toString();
	}

} //CDMSORIGINImpl
