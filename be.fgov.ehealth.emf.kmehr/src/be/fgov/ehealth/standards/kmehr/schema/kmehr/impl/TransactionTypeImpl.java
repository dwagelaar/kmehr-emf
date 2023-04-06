/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTION;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getRedactor <em>Redactor</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#isIscomplete <em>Iscomplete</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#isIsvalidated <em>Isvalidated</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getExpirationdate <em>Expirationdate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getTextWithLayout <em>Text With Layout</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getLnk <em>Lnk</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionTypeImpl extends MinimalEObjectImpl.Container implements TransactionType {
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDKMEHR> id;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDTRANSACTION> cd;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AuthorType author;

	/**
	 * The cached value of the '{@link #getRedactor() <em>Redactor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedactor()
	 * @generated
	 * @ordered
	 */
	protected AuthorType redactor;

	/**
	 * The default value of the '{@link #isIscomplete() <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIscomplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISCOMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIscomplete() <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIscomplete()
	 * @generated
	 * @ordered
	 */
	protected boolean iscomplete = ISCOMPLETE_EDEFAULT;

	/**
	 * This is true if the Iscomplete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iscompleteESet;

	/**
	 * The default value of the '{@link #isIsvalidated() <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsvalidated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISVALIDATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsvalidated() <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsvalidated()
	 * @generated
	 * @ordered
	 */
	protected boolean isvalidated = ISVALIDATED_EDEFAULT;

	/**
	 * This is true if the Isvalidated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isvalidatedESet;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RECORDDATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar recorddatetime = RECORDDATETIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.TRANSACTION_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
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
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.TRANSACTION_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDTRANSACTION> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDTRANSACTION>(CDTRANSACTION.class, this, KmehrPackage.TRANSACTION_TYPE__CD);
		}
		return cd;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorType newAuthor, NotificationChain msgs) {
		AuthorType oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(AuthorType newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType getRedactor() {
		return redactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedactor(AuthorType newRedactor, NotificationChain msgs) {
		AuthorType oldRedactor = redactor;
		redactor = newRedactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__REDACTOR, oldRedactor, newRedactor);
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
	public void setRedactor(AuthorType newRedactor) {
		if (newRedactor != redactor) {
			NotificationChain msgs = null;
			if (redactor != null)
				msgs = ((InternalEObject)redactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__REDACTOR, null, msgs);
			if (newRedactor != null)
				msgs = ((InternalEObject)newRedactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.TRANSACTION_TYPE__REDACTOR, null, msgs);
			msgs = basicSetRedactor(newRedactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__REDACTOR, newRedactor, newRedactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIscomplete() {
		return iscomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIscomplete(boolean newIscomplete) {
		boolean oldIscomplete = iscomplete;
		iscomplete = newIscomplete;
		boolean oldIscompleteESet = iscompleteESet;
		iscompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE, oldIscomplete, iscomplete, !oldIscompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIscomplete() {
		boolean oldIscomplete = iscomplete;
		boolean oldIscompleteESet = iscompleteESet;
		iscomplete = ISCOMPLETE_EDEFAULT;
		iscompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE, oldIscomplete, ISCOMPLETE_EDEFAULT, oldIscompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIscomplete() {
		return iscompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsvalidated() {
		return isvalidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsvalidated(boolean newIsvalidated) {
		boolean oldIsvalidated = isvalidated;
		isvalidated = newIsvalidated;
		boolean oldIsvalidatedESet = isvalidatedESet;
		isvalidatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__ISVALIDATED, oldIsvalidated, isvalidated, !oldIsvalidatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsvalidated() {
		boolean oldIsvalidated = isvalidated;
		boolean oldIsvalidatedESet = isvalidatedESet;
		isvalidated = ISVALIDATED_EDEFAULT;
		isvalidatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.TRANSACTION_TYPE__ISVALIDATED, oldIsvalidated, ISVALIDATED_EDEFAULT, oldIsvalidatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsvalidated() {
		return isvalidatedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__EXPIRATIONDATE, oldExpirationdate, expirationdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, KmehrPackage.TRANSACTION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HeadingType> getHeading() {
		return getGroup().list(KmehrPackage.Literals.TRANSACTION_TYPE__HEADING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemType> getItem() {
		return getGroup().list(KmehrPackage.Literals.TRANSACTION_TYPE__ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		return getGroup().list(KmehrPackage.Literals.TRANSACTION_TYPE__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextWithLayoutType> getTextWithLayout() {
		return getGroup().list(KmehrPackage.Literals.TRANSACTION_TYPE__TEXT_WITH_LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LnkType> getLnk() {
		return getGroup().list(KmehrPackage.Literals.TRANSACTION_TYPE__LNK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRecorddatetime() {
		return recorddatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecorddatetime(XMLGregorianCalendar newRecorddatetime) {
		XMLGregorianCalendar oldRecorddatetime = recorddatetime;
		recorddatetime = newRecorddatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__RECORDDATETIME, oldRecorddatetime, recorddatetime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.TRANSACTION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case KmehrPackage.TRANSACTION_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case KmehrPackage.TRANSACTION_TYPE__REDACTOR:
				return basicSetRedactor(null, msgs);
			case KmehrPackage.TRANSACTION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__HEADING:
				return ((InternalEList<?>)getHeading()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__TEXT_WITH_LAYOUT:
				return ((InternalEList<?>)getTextWithLayout()).basicRemove(otherEnd, msgs);
			case KmehrPackage.TRANSACTION_TYPE__LNK:
				return ((InternalEList<?>)getLnk()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY:
				return getConfidentiality();
			case KmehrPackage.TRANSACTION_TYPE__ID:
				return getId();
			case KmehrPackage.TRANSACTION_TYPE__CD:
				return getCd();
			case KmehrPackage.TRANSACTION_TYPE__DATE:
				return getDate();
			case KmehrPackage.TRANSACTION_TYPE__TIME:
				return getTime();
			case KmehrPackage.TRANSACTION_TYPE__AUTHOR:
				return getAuthor();
			case KmehrPackage.TRANSACTION_TYPE__REDACTOR:
				return getRedactor();
			case KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE:
				return isIscomplete();
			case KmehrPackage.TRANSACTION_TYPE__ISVALIDATED:
				return isIsvalidated();
			case KmehrPackage.TRANSACTION_TYPE__EXPIRATIONDATE:
				return getExpirationdate();
			case KmehrPackage.TRANSACTION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case KmehrPackage.TRANSACTION_TYPE__HEADING:
				return getHeading();
			case KmehrPackage.TRANSACTION_TYPE__ITEM:
				return getItem();
			case KmehrPackage.TRANSACTION_TYPE__TEXT:
				return getText();
			case KmehrPackage.TRANSACTION_TYPE__TEXT_WITH_LAYOUT:
				return getTextWithLayout();
			case KmehrPackage.TRANSACTION_TYPE__LNK:
				return getLnk();
			case KmehrPackage.TRANSACTION_TYPE__RECORDDATETIME:
				return getRecorddatetime();
			case KmehrPackage.TRANSACTION_TYPE__VERSION:
				return getVersion();
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
			case KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDTRANSACTION>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__AUTHOR:
				setAuthor((AuthorType)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__REDACTOR:
				setRedactor((AuthorType)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE:
				setIscomplete((Boolean)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ISVALIDATED:
				setIsvalidated((Boolean)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__EXPIRATIONDATE:
				setExpirationdate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__HEADING:
				getHeading().clear();
				getHeading().addAll((Collection<? extends HeadingType>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__TEXT_WITH_LAYOUT:
				getTextWithLayout().clear();
				getTextWithLayout().addAll((Collection<? extends TextWithLayoutType>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__LNK:
				getLnk().clear();
				getLnk().addAll((Collection<? extends LnkType>)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__RECORDDATETIME:
				setRecorddatetime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.TRANSACTION_TYPE__VERSION:
				setVersion((String)newValue);
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
			case KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)null);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case KmehrPackage.TRANSACTION_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case KmehrPackage.TRANSACTION_TYPE__AUTHOR:
				setAuthor((AuthorType)null);
				return;
			case KmehrPackage.TRANSACTION_TYPE__REDACTOR:
				setRedactor((AuthorType)null);
				return;
			case KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE:
				unsetIscomplete();
				return;
			case KmehrPackage.TRANSACTION_TYPE__ISVALIDATED:
				unsetIsvalidated();
				return;
			case KmehrPackage.TRANSACTION_TYPE__EXPIRATIONDATE:
				setExpirationdate(EXPIRATIONDATE_EDEFAULT);
				return;
			case KmehrPackage.TRANSACTION_TYPE__GROUP:
				getGroup().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__HEADING:
				getHeading().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__ITEM:
				getItem().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__TEXT_WITH_LAYOUT:
				getTextWithLayout().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__LNK:
				getLnk().clear();
				return;
			case KmehrPackage.TRANSACTION_TYPE__RECORDDATETIME:
				setRecorddatetime(RECORDDATETIME_EDEFAULT);
				return;
			case KmehrPackage.TRANSACTION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case KmehrPackage.TRANSACTION_TYPE__CONFIDENTIALITY:
				return confidentiality != null;
			case KmehrPackage.TRANSACTION_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case KmehrPackage.TRANSACTION_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case KmehrPackage.TRANSACTION_TYPE__AUTHOR:
				return author != null;
			case KmehrPackage.TRANSACTION_TYPE__REDACTOR:
				return redactor != null;
			case KmehrPackage.TRANSACTION_TYPE__ISCOMPLETE:
				return isSetIscomplete();
			case KmehrPackage.TRANSACTION_TYPE__ISVALIDATED:
				return isSetIsvalidated();
			case KmehrPackage.TRANSACTION_TYPE__EXPIRATIONDATE:
				return EXPIRATIONDATE_EDEFAULT == null ? expirationdate != null : !EXPIRATIONDATE_EDEFAULT.equals(expirationdate);
			case KmehrPackage.TRANSACTION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__HEADING:
				return !getHeading().isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__ITEM:
				return !getItem().isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__TEXT:
				return !getText().isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__TEXT_WITH_LAYOUT:
				return !getTextWithLayout().isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__LNK:
				return !getLnk().isEmpty();
			case KmehrPackage.TRANSACTION_TYPE__RECORDDATETIME:
				return RECORDDATETIME_EDEFAULT == null ? recorddatetime != null : !RECORDDATETIME_EDEFAULT.equals(recorddatetime);
			case KmehrPackage.TRANSACTION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", iscomplete: ");
		if (iscompleteESet) result.append(iscomplete); else result.append("<unset>");
		result.append(", isvalidated: ");
		if (isvalidatedESet) result.append(isvalidated); else result.append("<unset>");
		result.append(", expirationdate: ");
		result.append(expirationdate);
		result.append(", group: ");
		result.append(group);
		result.append(", recorddatetime: ");
		result.append(recorddatetime);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //TransactionTypeImpl
