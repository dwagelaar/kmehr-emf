/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK;
import be.fgov.ehealth.standards.kmehr.cd.cd.CDINNCLUSTER;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substanceproduct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl#getIntendedcd <em>Intendedcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl#getDeliveredcd <em>Deliveredcd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl#getIntendedname <em>Intendedname</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl#getDeliveredname <em>Deliveredname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceproductTypeImpl extends MinimalEObjectImpl.Container implements SubstanceproductType {
	/**
	 * The cached value of the '{@link #getIntendedcd() <em>Intendedcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedcd()
	 * @generated
	 * @ordered
	 */
	protected CDINNCLUSTER intendedcd;

	/**
	 * The cached value of the '{@link #getDeliveredcd() <em>Deliveredcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredcd()
	 * @generated
	 * @ordered
	 */
	protected CDDRUGCNK deliveredcd;

	/**
	 * The default value of the '{@link #getIntendedname() <em>Intendedname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedname()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENDEDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntendedname() <em>Intendedname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedname()
	 * @generated
	 * @ordered
	 */
	protected String intendedname = INTENDEDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveredname() <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredname()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVEREDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveredname() <em>Deliveredname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredname()
	 * @generated
	 * @ordered
	 */
	protected String deliveredname = DELIVEREDNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceproductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.SUBSTANCEPRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDINNCLUSTER getIntendedcd() {
		return intendedcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedcd(CDINNCLUSTER newIntendedcd, NotificationChain msgs) {
		CDINNCLUSTER oldIntendedcd = intendedcd;
		intendedcd = newIntendedcd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD, oldIntendedcd, newIntendedcd);
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
	public void setIntendedcd(CDINNCLUSTER newIntendedcd) {
		if (newIntendedcd != intendedcd) {
			NotificationChain msgs = null;
			if (intendedcd != null)
				msgs = ((InternalEObject)intendedcd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD, null, msgs);
			if (newIntendedcd != null)
				msgs = ((InternalEObject)newIntendedcd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD, null, msgs);
			msgs = basicSetIntendedcd(newIntendedcd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD, newIntendedcd, newIntendedcd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDRUGCNK getDeliveredcd() {
		return deliveredcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliveredcd(CDDRUGCNK newDeliveredcd, NotificationChain msgs) {
		CDDRUGCNK oldDeliveredcd = deliveredcd;
		deliveredcd = newDeliveredcd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD, oldDeliveredcd, newDeliveredcd);
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
	public void setDeliveredcd(CDDRUGCNK newDeliveredcd) {
		if (newDeliveredcd != deliveredcd) {
			NotificationChain msgs = null;
			if (deliveredcd != null)
				msgs = ((InternalEObject)deliveredcd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD, null, msgs);
			if (newDeliveredcd != null)
				msgs = ((InternalEObject)newDeliveredcd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD, null, msgs);
			msgs = basicSetDeliveredcd(newDeliveredcd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD, newDeliveredcd, newDeliveredcd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntendedname() {
		return intendedname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntendedname(String newIntendedname) {
		String oldIntendedname = intendedname;
		intendedname = newIntendedname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDNAME, oldIntendedname, intendedname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveredname() {
		return deliveredname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveredname(String newDeliveredname) {
		String oldDeliveredname = deliveredname;
		deliveredname = newDeliveredname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME, oldDeliveredname, deliveredname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD:
				return basicSetIntendedcd(null, msgs);
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD:
				return basicSetDeliveredcd(null, msgs);
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
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD:
				return getIntendedcd();
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD:
				return getDeliveredcd();
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDNAME:
				return getIntendedname();
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME:
				return getDeliveredname();
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
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD:
				setIntendedcd((CDINNCLUSTER)newValue);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD:
				setDeliveredcd((CDDRUGCNK)newValue);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDNAME:
				setIntendedname((String)newValue);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME:
				setDeliveredname((String)newValue);
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
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD:
				setIntendedcd((CDINNCLUSTER)null);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD:
				setDeliveredcd((CDDRUGCNK)null);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDNAME:
				setIntendedname(INTENDEDNAME_EDEFAULT);
				return;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME:
				setDeliveredname(DELIVEREDNAME_EDEFAULT);
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
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDCD:
				return intendedcd != null;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDCD:
				return deliveredcd != null;
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__INTENDEDNAME:
				return INTENDEDNAME_EDEFAULT == null ? intendedname != null : !INTENDEDNAME_EDEFAULT.equals(intendedname);
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME:
				return DELIVEREDNAME_EDEFAULT == null ? deliveredname != null : !DELIVEREDNAME_EDEFAULT.equals(deliveredname);
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
		result.append(" (intendedname: ");
		result.append(intendedname);
		result.append(", deliveredname: ");
		result.append(deliveredname);
		result.append(')');
		return result.toString();
	}

} //SubstanceproductTypeImpl
