/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDLNKvalues;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDIATYPEvalues;
import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lnk Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.LnkTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.LnkTypeImpl#getMEDIATYPE <em>MEDIATYPE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.LnkTypeImpl#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.LnkTypeImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.cd.cd.impl.LnkTypeImpl#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LnkTypeImpl extends MinimalEObjectImpl.Container implements LnkType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMEDIATYPE() <em>MEDIATYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEDIATYPE()
	 * @generated
	 * @ordered
	 */
	protected static final CDMEDIATYPEvalues MEDIATYPE_EDEFAULT = CDMEDIATYPEvalues.APPLICATION_MSWORD;

	/**
	 * The cached value of the '{@link #getMEDIATYPE() <em>MEDIATYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEDIATYPE()
	 * @generated
	 * @ordered
	 */
	protected CDMEDIATYPEvalues mEDIATYPE = MEDIATYPE_EDEFAULT;

	/**
	 * This is true if the MEDIATYPE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mEDIATYPEESet;

	/**
	 * The default value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE()
	 * @generated
	 * @ordered
	 */
	protected String sIZE = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected static final CDLNKvalues TYPE_EDEFAULT = CDLNKvalues.ISACHILDOF;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected CDLNKvalues tYPE = TYPE_EDEFAULT;

	/**
	 * This is true if the TYPE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tYPEESet;

	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String uRL = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LnkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdPackage.eINSTANCE.getLnkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(byte[] newValue) {
		byte[] oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.LNK_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMEDIATYPEvalues getMEDIATYPE() {
		return mEDIATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMEDIATYPE(CDMEDIATYPEvalues newMEDIATYPE) {
		CDMEDIATYPEvalues oldMEDIATYPE = mEDIATYPE;
		mEDIATYPE = newMEDIATYPE == null ? MEDIATYPE_EDEFAULT : newMEDIATYPE;
		boolean oldMEDIATYPEESet = mEDIATYPEESet;
		mEDIATYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.LNK_TYPE__MEDIATYPE, oldMEDIATYPE, mEDIATYPE, !oldMEDIATYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMEDIATYPE() {
		CDMEDIATYPEvalues oldMEDIATYPE = mEDIATYPE;
		boolean oldMEDIATYPEESet = mEDIATYPEESet;
		mEDIATYPE = MEDIATYPE_EDEFAULT;
		mEDIATYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.LNK_TYPE__MEDIATYPE, oldMEDIATYPE, MEDIATYPE_EDEFAULT, oldMEDIATYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMEDIATYPE() {
		return mEDIATYPEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIZE() {
		return sIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIZE(String newSIZE) {
		String oldSIZE = sIZE;
		sIZE = newSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.LNK_TYPE__SIZE, oldSIZE, sIZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDLNKvalues getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTYPE(CDLNKvalues newTYPE) {
		CDLNKvalues oldTYPE = tYPE;
		tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
		boolean oldTYPEESet = tYPEESet;
		tYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.LNK_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTYPE() {
		CDLNKvalues oldTYPE = tYPE;
		boolean oldTYPEESet = tYPEESet;
		tYPE = TYPE_EDEFAULT;
		tYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CdPackage.LNK_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTYPE() {
		return tYPEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURL() {
		return uRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURL(String newURL) {
		String oldURL = uRL;
		uRL = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdPackage.LNK_TYPE__URL, oldURL, uRL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdPackage.LNK_TYPE__VALUE:
				return getValue();
			case CdPackage.LNK_TYPE__MEDIATYPE:
				return getMEDIATYPE();
			case CdPackage.LNK_TYPE__SIZE:
				return getSIZE();
			case CdPackage.LNK_TYPE__TYPE:
				return getTYPE();
			case CdPackage.LNK_TYPE__URL:
				return getURL();
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
			case CdPackage.LNK_TYPE__VALUE:
				setValue((byte[])newValue);
				return;
			case CdPackage.LNK_TYPE__MEDIATYPE:
				setMEDIATYPE((CDMEDIATYPEvalues)newValue);
				return;
			case CdPackage.LNK_TYPE__SIZE:
				setSIZE((String)newValue);
				return;
			case CdPackage.LNK_TYPE__TYPE:
				setTYPE((CDLNKvalues)newValue);
				return;
			case CdPackage.LNK_TYPE__URL:
				setURL((String)newValue);
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
			case CdPackage.LNK_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CdPackage.LNK_TYPE__MEDIATYPE:
				unsetMEDIATYPE();
				return;
			case CdPackage.LNK_TYPE__SIZE:
				setSIZE(SIZE_EDEFAULT);
				return;
			case CdPackage.LNK_TYPE__TYPE:
				unsetTYPE();
				return;
			case CdPackage.LNK_TYPE__URL:
				setURL(URL_EDEFAULT);
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
			case CdPackage.LNK_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CdPackage.LNK_TYPE__MEDIATYPE:
				return isSetMEDIATYPE();
			case CdPackage.LNK_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? sIZE != null : !SIZE_EDEFAULT.equals(sIZE);
			case CdPackage.LNK_TYPE__TYPE:
				return isSetTYPE();
			case CdPackage.LNK_TYPE__URL:
				return URL_EDEFAULT == null ? uRL != null : !URL_EDEFAULT.equals(uRL);
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
		result.append(value);
		result.append(", mEDIATYPE: ");
		if (mEDIATYPEESet) result.append(mEDIATYPE); else result.append("<unset>");
		result.append(", sIZE: ");
		result.append(sIZE);
		result.append(", tYPE: ");
		if (tYPEESet) result.append(tYPE); else result.append("<unset>");
		result.append(", uRL: ");
		result.append(uRL);
		result.append(')');
		return result.toString();
	}

} //LnkTypeImpl
