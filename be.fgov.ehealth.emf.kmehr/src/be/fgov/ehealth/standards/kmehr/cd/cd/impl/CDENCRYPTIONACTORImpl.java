/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONACTOR;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONACTORvalues;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDHCPARTYschemes;
import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDENCRYPTIONACTOR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDENCRYPTIONACTORImpl#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDENCRYPTIONACTORImpl#getDN <em>DN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDENCRYPTIONACTORImpl#getL <em>L</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDENCRYPTIONACTORImpl#getS <em>S</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.CDENCRYPTIONACTORImpl#getSV <em>SV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDENCRYPTIONACTORImpl extends MinimalEObjectImpl.Container implements CDENCRYPTIONACTOR {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final CDENCRYPTIONACTORvalues VALUE_EDEFAULT = CDENCRYPTIONACTORvalues.NIHII;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CDENCRYPTIONACTORvalues value = VALUE_EDEFAULT;

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
	protected static final CDHCPARTYschemes S_EDEFAULT = CDHCPARTYschemes.CDHCPARTY;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected CDHCPARTYschemes s = S_EDEFAULT;

	/**
	 * This is true if the S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sESet;

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
	protected CDENCRYPTIONACTORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdPackage.eINSTANCE.getCDENCRYPTIONACTOR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCRYPTIONACTORvalues getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(CDENCRYPTIONACTORvalues newValue) {
		CDENCRYPTIONACTORvalues oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDENCRYPTIONACTOR__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValue() {
		CDENCRYPTIONACTORvalues oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDENCRYPTIONACTOR__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDENCRYPTIONACTOR__DN, oldDN, dN));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDENCRYPTIONACTOR__L, oldL, l, !oldLESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDENCRYPTIONACTOR__L, oldL, L_EDEFAULT, oldLESet));
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
	public CDHCPARTYschemes getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS(CDHCPARTYschemes newS) {
		CDHCPARTYschemes oldS = s;
		s = newS == null ? S_EDEFAULT : newS;
		boolean oldSESet = sESet;
		sESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDENCRYPTIONACTOR__S, oldS, s, !oldSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetS() {
		CDHCPARTYschemes oldS = s;
		boolean oldSESet = sESet;
		s = S_EDEFAULT;
		sESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.CDENCRYPTIONACTOR__S, oldS, S_EDEFAULT, oldSESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.CDENCRYPTIONACTOR__SV, oldSV, sV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdPackage.CDENCRYPTIONACTOR__VALUE:
				return getValue();
			case CdPackage.CDENCRYPTIONACTOR__DN:
				return getDN();
			case CdPackage.CDENCRYPTIONACTOR__L:
				return getL();
			case CdPackage.CDENCRYPTIONACTOR__S:
				return getS();
			case CdPackage.CDENCRYPTIONACTOR__SV:
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
			case CdPackage.CDENCRYPTIONACTOR__VALUE:
				setValue((CDENCRYPTIONACTORvalues)newValue);
				return;
			case CdPackage.CDENCRYPTIONACTOR__DN:
				setDN((String)newValue);
				return;
			case CdPackage.CDENCRYPTIONACTOR__L:
				setL((String)newValue);
				return;
			case CdPackage.CDENCRYPTIONACTOR__S:
				setS((CDHCPARTYschemes)newValue);
				return;
			case CdPackage.CDENCRYPTIONACTOR__SV:
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
			case CdPackage.CDENCRYPTIONACTOR__VALUE:
				unsetValue();
				return;
			case CdPackage.CDENCRYPTIONACTOR__DN:
				setDN(DN_EDEFAULT);
				return;
			case CdPackage.CDENCRYPTIONACTOR__L:
				unsetL();
				return;
			case CdPackage.CDENCRYPTIONACTOR__S:
				unsetS();
				return;
			case CdPackage.CDENCRYPTIONACTOR__SV:
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
			case CdPackage.CDENCRYPTIONACTOR__VALUE:
				return isSetValue();
			case CdPackage.CDENCRYPTIONACTOR__DN:
				return DN_EDEFAULT == null ? dN != null : !DN_EDEFAULT.equals(dN);
			case CdPackage.CDENCRYPTIONACTOR__L:
				return isSetL();
			case CdPackage.CDENCRYPTIONACTOR__S:
				return isSetS();
			case CdPackage.CDENCRYPTIONACTOR__SV:
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
		result.append(", sV: ");
		result.append(sV);
		result.append(')');
		return result.toString();
	}

} //CDENCRYPTIONACTORImpl
