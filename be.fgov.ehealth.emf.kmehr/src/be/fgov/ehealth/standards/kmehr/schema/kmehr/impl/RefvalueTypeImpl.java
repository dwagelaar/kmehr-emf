/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refvalue Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl#getMinref <em>Minref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl#getMaxref <em>Maxref</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefvalueTypeImpl extends MinimalEObjectImpl.Container implements RefvalueType {
	/**
	 * The cached value of the '{@link #getMinref() <em>Minref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinref()
	 * @generated
	 * @ordered
	 */
	protected MinrefType minref;

	/**
	 * The cached value of the '{@link #getMaxref() <em>Maxref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxref()
	 * @generated
	 * @ordered
	 */
	protected MaxrefType maxref;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected TextType context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefvalueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.REFVALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinrefType getMinref() {
		return minref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinref(MinrefType newMinref, NotificationChain msgs) {
		MinrefType oldMinref = minref;
		minref = newMinref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__MINREF, oldMinref, newMinref);
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
	public void setMinref(MinrefType newMinref) {
		if (newMinref != minref) {
			NotificationChain msgs = null;
			if (minref != null)
				msgs = ((InternalEObject)minref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__MINREF, null, msgs);
			if (newMinref != null)
				msgs = ((InternalEObject)newMinref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__MINREF, null, msgs);
			msgs = basicSetMinref(newMinref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__MINREF, newMinref, newMinref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxrefType getMaxref() {
		return maxref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxref(MaxrefType newMaxref, NotificationChain msgs) {
		MaxrefType oldMaxref = maxref;
		maxref = newMaxref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__MAXREF, oldMaxref, newMaxref);
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
	public void setMaxref(MaxrefType newMaxref) {
		if (newMaxref != maxref) {
			NotificationChain msgs = null;
			if (maxref != null)
				msgs = ((InternalEObject)maxref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__MAXREF, null, msgs);
			if (newMaxref != null)
				msgs = ((InternalEObject)newMaxref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__MAXREF, null, msgs);
			msgs = basicSetMaxref(newMaxref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__MAXREF, newMaxref, newMaxref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(TextType newContext, NotificationChain msgs) {
		TextType oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__CONTEXT, oldContext, newContext);
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
	public void setContext(TextType newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.REFVALUE_TYPE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.REFVALUE_TYPE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.REFVALUE_TYPE__MINREF:
				return basicSetMinref(null, msgs);
			case KmehrPackage.REFVALUE_TYPE__MAXREF:
				return basicSetMaxref(null, msgs);
			case KmehrPackage.REFVALUE_TYPE__CONTEXT:
				return basicSetContext(null, msgs);
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
			case KmehrPackage.REFVALUE_TYPE__MINREF:
				return getMinref();
			case KmehrPackage.REFVALUE_TYPE__MAXREF:
				return getMaxref();
			case KmehrPackage.REFVALUE_TYPE__CONTEXT:
				return getContext();
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
			case KmehrPackage.REFVALUE_TYPE__MINREF:
				setMinref((MinrefType)newValue);
				return;
			case KmehrPackage.REFVALUE_TYPE__MAXREF:
				setMaxref((MaxrefType)newValue);
				return;
			case KmehrPackage.REFVALUE_TYPE__CONTEXT:
				setContext((TextType)newValue);
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
			case KmehrPackage.REFVALUE_TYPE__MINREF:
				setMinref((MinrefType)null);
				return;
			case KmehrPackage.REFVALUE_TYPE__MAXREF:
				setMaxref((MaxrefType)null);
				return;
			case KmehrPackage.REFVALUE_TYPE__CONTEXT:
				setContext((TextType)null);
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
			case KmehrPackage.REFVALUE_TYPE__MINREF:
				return minref != null;
			case KmehrPackage.REFVALUE_TYPE__MAXREF:
				return maxref != null;
			case KmehrPackage.REFVALUE_TYPE__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //RefvalueTypeImpl
