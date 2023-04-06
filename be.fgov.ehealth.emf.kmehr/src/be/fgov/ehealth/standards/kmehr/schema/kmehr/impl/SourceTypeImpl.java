/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDEXTERNALSOURCE;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl#getProof <em>Proof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends MinimalEObjectImpl.Container implements SourceType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDEXTERNALSOURCE> cd;

	/**
	 * The default value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datetime = DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected static final String PROOF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected String proof = PROOF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.SOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDEXTERNALSOURCE> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDEXTERNALSOURCE>(CDEXTERNALSOURCE.class, this, KmehrPackage.SOURCE_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetime(XMLGregorianCalendar newDatetime) {
		XMLGregorianCalendar oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SOURCE_TYPE__DATETIME, oldDatetime, datetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SOURCE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProof() {
		return proof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProof(String newProof) {
		String oldProof = proof;
		proof = newProof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.SOURCE_TYPE__PROOF, oldProof, proof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.SOURCE_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.SOURCE_TYPE__CD:
				return getCd();
			case KmehrPackage.SOURCE_TYPE__DATETIME:
				return getDatetime();
			case KmehrPackage.SOURCE_TYPE__VERSION:
				return getVersion();
			case KmehrPackage.SOURCE_TYPE__PROOF:
				return getProof();
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
			case KmehrPackage.SOURCE_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDEXTERNALSOURCE>)newValue);
				return;
			case KmehrPackage.SOURCE_TYPE__DATETIME:
				setDatetime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.SOURCE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case KmehrPackage.SOURCE_TYPE__PROOF:
				setProof((String)newValue);
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
			case KmehrPackage.SOURCE_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.SOURCE_TYPE__DATETIME:
				setDatetime(DATETIME_EDEFAULT);
				return;
			case KmehrPackage.SOURCE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case KmehrPackage.SOURCE_TYPE__PROOF:
				setProof(PROOF_EDEFAULT);
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
			case KmehrPackage.SOURCE_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.SOURCE_TYPE__DATETIME:
				return DATETIME_EDEFAULT == null ? datetime != null : !DATETIME_EDEFAULT.equals(datetime);
			case KmehrPackage.SOURCE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case KmehrPackage.SOURCE_TYPE__PROOF:
				return PROOF_EDEFAULT == null ? proof != null : !PROOF_EDEFAULT.equals(proof);
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
		result.append(" (datetime: ");
		result.append(datetime);
		result.append(", version: ");
		result.append(version);
		result.append(", proof: ");
		result.append(proof);
		result.append(')');
		return result.toString();
	}

} //SourceTypeImpl
