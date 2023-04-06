/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl#getHcparty <em>Hcparty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl#getDummyFriend <em>Dummy Friend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientTypeImpl extends MinimalEObjectImpl.Container implements RecipientType {
	/**
	 * The cached value of the '{@link #getHcparty() <em>Hcparty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHcparty()
	 * @generated
	 * @ordered
	 */
	protected EList<HcpartyType> hcparty;

	/**
	 * The default value of the '{@link #getDummyFriend() <em>Dummy Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyFriend()
	 * @generated
	 * @ordered
	 */
	protected static final String DUMMY_FRIEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDummyFriend() <em>Dummy Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyFriend()
	 * @generated
	 * @ordered
	 */
	protected String dummyFriend = DUMMY_FRIEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.RECIPIENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HcpartyType> getHcparty() {
		if (hcparty == null) {
			hcparty = new EObjectContainmentEList<HcpartyType>(HcpartyType.class, this, KmehrPackage.RECIPIENT_TYPE__HCPARTY);
		}
		return hcparty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDummyFriend() {
		return dummyFriend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDummyFriend(String newDummyFriend) {
		String oldDummyFriend = dummyFriend;
		dummyFriend = newDummyFriend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.RECIPIENT_TYPE__DUMMY_FRIEND, oldDummyFriend, dummyFriend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.RECIPIENT_TYPE__HCPARTY:
				return ((InternalEList<?>)getHcparty()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.RECIPIENT_TYPE__HCPARTY:
				return getHcparty();
			case KmehrPackage.RECIPIENT_TYPE__DUMMY_FRIEND:
				return getDummyFriend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmehrPackage.RECIPIENT_TYPE__HCPARTY:
				getHcparty().clear();
				getHcparty().addAll((Collection<? extends HcpartyType>)newValue);
				return;
			case KmehrPackage.RECIPIENT_TYPE__DUMMY_FRIEND:
				setDummyFriend((String)newValue);
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
			case KmehrPackage.RECIPIENT_TYPE__HCPARTY:
				getHcparty().clear();
				return;
			case KmehrPackage.RECIPIENT_TYPE__DUMMY_FRIEND:
				setDummyFriend(DUMMY_FRIEND_EDEFAULT);
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
			case KmehrPackage.RECIPIENT_TYPE__HCPARTY:
				return hcparty != null && !hcparty.isEmpty();
			case KmehrPackage.RECIPIENT_TYPE__DUMMY_FRIEND:
				return DUMMY_FRIEND_EDEFAULT == null ? dummyFriend != null : !DUMMY_FRIEND_EDEFAULT.equals(dummyFriend);
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
		result.append(" (dummyFriend: ");
		result.append(dummyFriend);
		result.append(')');
		return result.toString();
	}

} //RecipientTypeImpl
