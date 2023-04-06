/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType;

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
 * An implementation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getAcknowledgment <em>Acknowledgment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getExpirationdate <em>Expirationdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl#getExternalsource <em>Externalsource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderTypeImpl extends MinimalEObjectImpl.Container implements HeaderType {
	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected ConfidentialityType confidentiality;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected StandardType standard;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDKMEHR> id;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected SenderType sender;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<RecipientType> recipient;

	/**
	 * The cached value of the '{@link #getUrgency() <em>Urgency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected UrgencyType urgency;

	/**
	 * The cached value of the '{@link #getAcknowledgment() <em>Acknowledgment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgment()
	 * @generated
	 * @ordered
	 */
	protected AcknowledgmentType acknowledgment;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> text;

	/**
	 * The cached value of the '{@link #getLnk() <em>Lnk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnk()
	 * @generated
	 * @ordered
	 */
	protected EList<LnkType> lnk;

	/**
	 * The default value of the '{@link #getExpirationdate() <em>Expirationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATIONDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationdate() <em>Expirationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expirationdate = EXPIRATIONDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalsource() <em>Externalsource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsource()
	 * @generated
	 * @ordered
	 */
	protected ExternalsourceType externalsource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.HEADER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialityType getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentiality(ConfidentialityType newConfidentiality, NotificationChain msgs) {
		ConfidentialityType oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
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
	public void setConfidentiality(ConfidentialityType newConfidentiality) {
		if (newConfidentiality != confidentiality) {
			NotificationChain msgs = null;
			if (confidentiality != null)
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardType getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandard(StandardType newStandard, NotificationChain msgs) {
		StandardType oldStandard = standard;
		standard = newStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__STANDARD, oldStandard, newStandard);
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
	public void setStandard(StandardType newStandard) {
		if (newStandard != standard) {
			NotificationChain msgs = null;
			if (standard != null)
				msgs = ((InternalEObject)standard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__STANDARD, null, msgs);
			if (newStandard != null)
				msgs = ((InternalEObject)newStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__STANDARD, null, msgs);
			msgs = basicSetStandard(newStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__STANDARD, newStandard, newStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.HEADER_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(XMLGregorianCalendar newDate) {
		XMLGregorianCalendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(XMLGregorianCalendar newTime) {
		XMLGregorianCalendar oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenderType getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(SenderType newSender, NotificationChain msgs) {
		SenderType oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__SENDER, oldSender, newSender);
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
	public void setSender(SenderType newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecipientType> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<RecipientType>(RecipientType.class, this, KmehrPackage.HEADER_TYPE__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UrgencyType getUrgency() {
		return urgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrgency(UrgencyType newUrgency, NotificationChain msgs) {
		UrgencyType oldUrgency = urgency;
		urgency = newUrgency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__URGENCY, oldUrgency, newUrgency);
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
	public void setUrgency(UrgencyType newUrgency) {
		if (newUrgency != urgency) {
			NotificationChain msgs = null;
			if (urgency != null)
				msgs = ((InternalEObject)urgency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__URGENCY, null, msgs);
			if (newUrgency != null)
				msgs = ((InternalEObject)newUrgency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__URGENCY, null, msgs);
			msgs = basicSetUrgency(newUrgency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__URGENCY, newUrgency, newUrgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcknowledgmentType getAcknowledgment() {
		return acknowledgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcknowledgment(AcknowledgmentType newAcknowledgment, NotificationChain msgs) {
		AcknowledgmentType oldAcknowledgment = acknowledgment;
		acknowledgment = newAcknowledgment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT, oldAcknowledgment, newAcknowledgment);
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
	public void setAcknowledgment(AcknowledgmentType newAcknowledgment) {
		if (newAcknowledgment != acknowledgment) {
			NotificationChain msgs = null;
			if (acknowledgment != null)
				msgs = ((InternalEObject)acknowledgment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT, null, msgs);
			if (newAcknowledgment != null)
				msgs = ((InternalEObject)newAcknowledgment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT, null, msgs);
			msgs = basicSetAcknowledgment(newAcknowledgment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT, newAcknowledgment, newAcknowledgment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, KmehrPackage.HEADER_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LnkType> getLnk() {
		if (lnk == null) {
			lnk = new EObjectContainmentEList<LnkType>(LnkType.class, this, KmehrPackage.HEADER_TYPE__LNK);
		}
		return lnk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpirationdate() {
		return expirationdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationdate(XMLGregorianCalendar newExpirationdate) {
		XMLGregorianCalendar oldExpirationdate = expirationdate;
		expirationdate = newExpirationdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__EXPIRATIONDATE, oldExpirationdate, expirationdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsourceType getExternalsource() {
		return externalsource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalsource(ExternalsourceType newExternalsource, NotificationChain msgs) {
		ExternalsourceType oldExternalsource = externalsource;
		externalsource = newExternalsource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__EXTERNALSOURCE, oldExternalsource, newExternalsource);
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
	public void setExternalsource(ExternalsourceType newExternalsource) {
		if (newExternalsource != externalsource) {
			NotificationChain msgs = null;
			if (externalsource != null)
				msgs = ((InternalEObject)externalsource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__EXTERNALSOURCE, null, msgs);
			if (newExternalsource != null)
				msgs = ((InternalEObject)newExternalsource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADER_TYPE__EXTERNALSOURCE, null, msgs);
			msgs = basicSetExternalsource(newExternalsource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADER_TYPE__EXTERNALSOURCE, newExternalsource, newExternalsource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.HEADER_TYPE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case KmehrPackage.HEADER_TYPE__STANDARD:
				return basicSetStandard(null, msgs);
			case KmehrPackage.HEADER_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADER_TYPE__SENDER:
				return basicSetSender(null, msgs);
			case KmehrPackage.HEADER_TYPE__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADER_TYPE__URGENCY:
				return basicSetUrgency(null, msgs);
			case KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT:
				return basicSetAcknowledgment(null, msgs);
			case KmehrPackage.HEADER_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADER_TYPE__LNK:
				return ((InternalEList<?>)getLnk()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADER_TYPE__EXTERNALSOURCE:
				return basicSetExternalsource(null, msgs);
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
			case KmehrPackage.HEADER_TYPE__CONFIDENTIALITY:
				return getConfidentiality();
			case KmehrPackage.HEADER_TYPE__STANDARD:
				return getStandard();
			case KmehrPackage.HEADER_TYPE__ID:
				return getId();
			case KmehrPackage.HEADER_TYPE__DATE:
				return getDate();
			case KmehrPackage.HEADER_TYPE__TIME:
				return getTime();
			case KmehrPackage.HEADER_TYPE__SENDER:
				return getSender();
			case KmehrPackage.HEADER_TYPE__RECIPIENT:
				return getRecipient();
			case KmehrPackage.HEADER_TYPE__URGENCY:
				return getUrgency();
			case KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT:
				return getAcknowledgment();
			case KmehrPackage.HEADER_TYPE__TEXT:
				return getText();
			case KmehrPackage.HEADER_TYPE__LNK:
				return getLnk();
			case KmehrPackage.HEADER_TYPE__EXPIRATIONDATE:
				return getExpirationdate();
			case KmehrPackage.HEADER_TYPE__EXTERNALSOURCE:
				return getExternalsource();
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
			case KmehrPackage.HEADER_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__STANDARD:
				setStandard((StandardType)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__SENDER:
				setSender((SenderType)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends RecipientType>)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__URGENCY:
				setUrgency((UrgencyType)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT:
				setAcknowledgment((AcknowledgmentType)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__LNK:
				getLnk().clear();
				getLnk().addAll((Collection<? extends LnkType>)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__EXPIRATIONDATE:
				setExpirationdate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.HEADER_TYPE__EXTERNALSOURCE:
				setExternalsource((ExternalsourceType)newValue);
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
			case KmehrPackage.HEADER_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)null);
				return;
			case KmehrPackage.HEADER_TYPE__STANDARD:
				setStandard((StandardType)null);
				return;
			case KmehrPackage.HEADER_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.HEADER_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case KmehrPackage.HEADER_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case KmehrPackage.HEADER_TYPE__SENDER:
				setSender((SenderType)null);
				return;
			case KmehrPackage.HEADER_TYPE__RECIPIENT:
				getRecipient().clear();
				return;
			case KmehrPackage.HEADER_TYPE__URGENCY:
				setUrgency((UrgencyType)null);
				return;
			case KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT:
				setAcknowledgment((AcknowledgmentType)null);
				return;
			case KmehrPackage.HEADER_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.HEADER_TYPE__LNK:
				getLnk().clear();
				return;
			case KmehrPackage.HEADER_TYPE__EXPIRATIONDATE:
				setExpirationdate(EXPIRATIONDATE_EDEFAULT);
				return;
			case KmehrPackage.HEADER_TYPE__EXTERNALSOURCE:
				setExternalsource((ExternalsourceType)null);
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
			case KmehrPackage.HEADER_TYPE__CONFIDENTIALITY:
				return confidentiality != null;
			case KmehrPackage.HEADER_TYPE__STANDARD:
				return standard != null;
			case KmehrPackage.HEADER_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.HEADER_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case KmehrPackage.HEADER_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case KmehrPackage.HEADER_TYPE__SENDER:
				return sender != null;
			case KmehrPackage.HEADER_TYPE__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case KmehrPackage.HEADER_TYPE__URGENCY:
				return urgency != null;
			case KmehrPackage.HEADER_TYPE__ACKNOWLEDGMENT:
				return acknowledgment != null;
			case KmehrPackage.HEADER_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case KmehrPackage.HEADER_TYPE__LNK:
				return lnk != null && !lnk.isEmpty();
			case KmehrPackage.HEADER_TYPE__EXPIRATIONDATE:
				return EXPIRATIONDATE_EDEFAULT == null ? expirationdate != null : !EXPIRATIONDATE_EDEFAULT.equals(expirationdate);
			case KmehrPackage.HEADER_TYPE__EXTERNALSOURCE:
				return externalsource != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(", expirationdate: ");
		result.append(expirationdate);
		result.append(')');
		return result.toString();
	}

} //HeaderTypeImpl
