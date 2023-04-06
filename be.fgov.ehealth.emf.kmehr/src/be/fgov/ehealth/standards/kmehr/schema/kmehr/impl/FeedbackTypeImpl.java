/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl#isReportrequested <em>Reportrequested</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackTypeImpl extends MinimalEObjectImpl.Container implements FeedbackType {
	/**
	 * The default value of the '{@link #isReportrequested() <em>Reportrequested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReportrequested()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPORTREQUESTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReportrequested() <em>Reportrequested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReportrequested()
	 * @generated
	 * @ordered
	 */
	protected boolean reportrequested = REPORTREQUESTED_EDEFAULT;

	/**
	 * This is true if the Reportrequested attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reportrequestedESet;

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
	protected FeedbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.FEEDBACK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReportrequested() {
		return reportrequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportrequested(boolean newReportrequested) {
		boolean oldReportrequested = reportrequested;
		reportrequested = newReportrequested;
		boolean oldReportrequestedESet = reportrequestedESet;
		reportrequestedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED, oldReportrequested, reportrequested, !oldReportrequestedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReportrequested() {
		boolean oldReportrequested = reportrequested;
		boolean oldReportrequestedESet = reportrequestedESet;
		reportrequested = REPORTREQUESTED_EDEFAULT;
		reportrequestedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED, oldReportrequested, REPORTREQUESTED_EDEFAULT, oldReportrequestedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReportrequested() {
		return reportrequestedESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.FEEDBACK_TYPE__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FEEDBACK_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.FEEDBACK_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FEEDBACK_TYPE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.FEEDBACK_TYPE__TEXT:
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
			case KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED:
				return isReportrequested();
			case KmehrPackage.FEEDBACK_TYPE__TEXT:
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
			case KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED:
				setReportrequested((Boolean)newValue);
				return;
			case KmehrPackage.FEEDBACK_TYPE__TEXT:
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
			case KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED:
				unsetReportrequested();
				return;
			case KmehrPackage.FEEDBACK_TYPE__TEXT:
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
			case KmehrPackage.FEEDBACK_TYPE__REPORTREQUESTED:
				return isSetReportrequested();
			case KmehrPackage.FEEDBACK_TYPE__TEXT:
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
		result.append(" (reportrequested: ");
		if (reportrequestedESet) result.append(reportrequested); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeedbackTypeImpl
