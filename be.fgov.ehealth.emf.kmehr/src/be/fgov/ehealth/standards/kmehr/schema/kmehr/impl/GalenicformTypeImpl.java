/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDGALENICFORM;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Galenicform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl#getGalenicformtext <em>Galenicformtext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GalenicformTypeImpl extends MinimalEObjectImpl.Container implements GalenicformType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected CDGALENICFORM cd;

	/**
	 * The cached value of the '{@link #getGalenicformtext() <em>Galenicformtext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalenicformtext()
	 * @generated
	 * @ordered
	 */
	protected TextType galenicformtext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalenicformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.GALENICFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDGALENICFORM getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(CDGALENICFORM newCd, NotificationChain msgs) {
		CDGALENICFORM oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.GALENICFORM_TYPE__CD, oldCd, newCd);
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
	public void setCd(CDGALENICFORM newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject)cd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.GALENICFORM_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject)newCd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.GALENICFORM_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.GALENICFORM_TYPE__CD, newCd, newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getGalenicformtext() {
		return galenicformtext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGalenicformtext(TextType newGalenicformtext, NotificationChain msgs) {
		TextType oldGalenicformtext = galenicformtext;
		galenicformtext = newGalenicformtext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT, oldGalenicformtext, newGalenicformtext);
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
	public void setGalenicformtext(TextType newGalenicformtext) {
		if (newGalenicformtext != galenicformtext) {
			NotificationChain msgs = null;
			if (galenicformtext != null)
				msgs = ((InternalEObject)galenicformtext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT, null, msgs);
			if (newGalenicformtext != null)
				msgs = ((InternalEObject)newGalenicformtext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT, null, msgs);
			msgs = basicSetGalenicformtext(newGalenicformtext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT, newGalenicformtext, newGalenicformtext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.GALENICFORM_TYPE__CD:
				return basicSetCd(null, msgs);
			case KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT:
				return basicSetGalenicformtext(null, msgs);
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
			case KmehrPackage.GALENICFORM_TYPE__CD:
				return getCd();
			case KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT:
				return getGalenicformtext();
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
			case KmehrPackage.GALENICFORM_TYPE__CD:
				setCd((CDGALENICFORM)newValue);
				return;
			case KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT:
				setGalenicformtext((TextType)newValue);
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
			case KmehrPackage.GALENICFORM_TYPE__CD:
				setCd((CDGALENICFORM)null);
				return;
			case KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT:
				setGalenicformtext((TextType)null);
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
			case KmehrPackage.GALENICFORM_TYPE__CD:
				return cd != null;
			case KmehrPackage.GALENICFORM_TYPE__GALENICFORMTEXT:
				return galenicformtext != null;
		}
		return super.eIsSet(featureID);
	}

} //GalenicformTypeImpl
