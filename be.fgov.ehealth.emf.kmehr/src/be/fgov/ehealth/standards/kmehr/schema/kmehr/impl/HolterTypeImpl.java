/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Holter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getFCAVG <em>FCAVG</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getFCMAX <em>FCMAX</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getFCMIN <em>FCMIN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getFCAVGD <em>FCAVGD</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getFCAVGN <em>FCAVGN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getRRMAX <em>RRMAX</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getRRMIN <em>RRMIN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getQRSTOT <em>QRSTOT</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getBRADY <em>BRADY</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getPAUSE <em>PAUSE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getLONG <em>LONG</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getESV <em>ESV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getDBLV <em>DBLV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getSALVV <em>SALVV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getBGV <em>BGV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getTGV <em>TGV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getTACHY <em>TACHY</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getESSV <em>ESSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getDBLSV <em>DBLSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getSALVSV <em>SALVSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getBGSV <em>BGSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getTGSV <em>TGSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getTACHYSV <em>TACHYSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl#getRRINST <em>RRINST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HolterTypeImpl extends MinimalEObjectImpl.Container implements HolterType {
	/**
	 * The default value of the '{@link #getFCAVG() <em>FCAVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVG()
	 * @generated
	 * @ordered
	 */
	protected static final String FCAVG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCAVG() <em>FCAVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVG()
	 * @generated
	 * @ordered
	 */
	protected String fCAVG = FCAVG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFCMAX() <em>FCMAX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCMAX()
	 * @generated
	 * @ordered
	 */
	protected FCMAXType fCMAX;

	/**
	 * The cached value of the '{@link #getFCMIN() <em>FCMIN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCMIN()
	 * @generated
	 * @ordered
	 */
	protected FCMINType fCMIN;

	/**
	 * The default value of the '{@link #getFCAVGD() <em>FCAVGD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVGD()
	 * @generated
	 * @ordered
	 */
	protected static final String FCAVGD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCAVGD() <em>FCAVGD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVGD()
	 * @generated
	 * @ordered
	 */
	protected String fCAVGD = FCAVGD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFCAVGN() <em>FCAVGN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVGN()
	 * @generated
	 * @ordered
	 */
	protected static final String FCAVGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCAVGN() <em>FCAVGN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCAVGN()
	 * @generated
	 * @ordered
	 */
	protected String fCAVGN = FCAVGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRRMAX() <em>RRMAX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRMAX()
	 * @generated
	 * @ordered
	 */
	protected RRMAXType rRMAX;

	/**
	 * The cached value of the '{@link #getRRMIN() <em>RRMIN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRMIN()
	 * @generated
	 * @ordered
	 */
	protected RRMINType rRMIN;

	/**
	 * The default value of the '{@link #getQRSTOT() <em>QRSTOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRSTOT()
	 * @generated
	 * @ordered
	 */
	protected static final String QRSTOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQRSTOT() <em>QRSTOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRSTOT()
	 * @generated
	 * @ordered
	 */
	protected String qRSTOT = QRSTOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBRADY() <em>BRADY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBRADY()
	 * @generated
	 * @ordered
	 */
	protected static final String BRADY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBRADY() <em>BRADY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBRADY()
	 * @generated
	 * @ordered
	 */
	protected String bRADY = BRADY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPAUSE() <em>PAUSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAUSE()
	 * @generated
	 * @ordered
	 */
	protected static final String PAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPAUSE() <em>PAUSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAUSE()
	 * @generated
	 * @ordered
	 */
	protected String pAUSE = PAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLONG() <em>LONG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONG()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLONG() <em>LONG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONG()
	 * @generated
	 * @ordered
	 */
	protected String lONG = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getESV() <em>ESV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESV()
	 * @generated
	 * @ordered
	 */
	protected static final String ESV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getESV() <em>ESV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESV()
	 * @generated
	 * @ordered
	 */
	protected String eSV = ESV_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBLV() <em>DBLV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBLV()
	 * @generated
	 * @ordered
	 */
	protected static final String DBLV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBLV() <em>DBLV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBLV()
	 * @generated
	 * @ordered
	 */
	protected String dBLV = DBLV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSALVV() <em>SALVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSALVV()
	 * @generated
	 * @ordered
	 */
	protected static final String SALVV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSALVV() <em>SALVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSALVV()
	 * @generated
	 * @ordered
	 */
	protected String sALVV = SALVV_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGV() <em>BGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGV()
	 * @generated
	 * @ordered
	 */
	protected static final String BGV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGV() <em>BGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGV()
	 * @generated
	 * @ordered
	 */
	protected String bGV = BGV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTGV() <em>TGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTGV()
	 * @generated
	 * @ordered
	 */
	protected static final String TGV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTGV() <em>TGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTGV()
	 * @generated
	 * @ordered
	 */
	protected String tGV = TGV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTACHY() <em>TACHY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTACHY()
	 * @generated
	 * @ordered
	 */
	protected static final String TACHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTACHY() <em>TACHY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTACHY()
	 * @generated
	 * @ordered
	 */
	protected String tACHY = TACHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getESSV() <em>ESSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESSV()
	 * @generated
	 * @ordered
	 */
	protected static final String ESSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getESSV() <em>ESSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESSV()
	 * @generated
	 * @ordered
	 */
	protected String eSSV = ESSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getDBLSV() <em>DBLSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBLSV()
	 * @generated
	 * @ordered
	 */
	protected static final String DBLSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBLSV() <em>DBLSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBLSV()
	 * @generated
	 * @ordered
	 */
	protected String dBLSV = DBLSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSALVSV() <em>SALVSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSALVSV()
	 * @generated
	 * @ordered
	 */
	protected static final String SALVSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSALVSV() <em>SALVSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSALVSV()
	 * @generated
	 * @ordered
	 */
	protected String sALVSV = SALVSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGSV() <em>BGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGSV()
	 * @generated
	 * @ordered
	 */
	protected static final String BGSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGSV() <em>BGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGSV()
	 * @generated
	 * @ordered
	 */
	protected String bGSV = BGSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTGSV() <em>TGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTGSV()
	 * @generated
	 * @ordered
	 */
	protected static final String TGSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTGSV() <em>TGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTGSV()
	 * @generated
	 * @ordered
	 */
	protected String tGSV = TGSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTACHYSV() <em>TACHYSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTACHYSV()
	 * @generated
	 * @ordered
	 */
	protected static final String TACHYSV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTACHYSV() <em>TACHYSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTACHYSV()
	 * @generated
	 * @ordered
	 */
	protected String tACHYSV = TACHYSV_EDEFAULT;

	/**
	 * The default value of the '{@link #getRRINST() <em>RRINST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRINST()
	 * @generated
	 * @ordered
	 */
	protected static final String RRINST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRRINST() <em>RRINST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRINST()
	 * @generated
	 * @ordered
	 */
	protected String rRINST = RRINST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HolterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.HOLTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFCAVG() {
		return fCAVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCAVG(String newFCAVG) {
		String oldFCAVG = fCAVG;
		fCAVG = newFCAVG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCAVG, oldFCAVG, fCAVG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FCMAXType getFCMAX() {
		return fCMAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFCMAX(FCMAXType newFCMAX, NotificationChain msgs) {
		FCMAXType oldFCMAX = fCMAX;
		fCMAX = newFCMAX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCMAX, oldFCMAX, newFCMAX);
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
	public void setFCMAX(FCMAXType newFCMAX) {
		if (newFCMAX != fCMAX) {
			NotificationChain msgs = null;
			if (fCMAX != null)
				msgs = ((InternalEObject)fCMAX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__FCMAX, null, msgs);
			if (newFCMAX != null)
				msgs = ((InternalEObject)newFCMAX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__FCMAX, null, msgs);
			msgs = basicSetFCMAX(newFCMAX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCMAX, newFCMAX, newFCMAX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FCMINType getFCMIN() {
		return fCMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFCMIN(FCMINType newFCMIN, NotificationChain msgs) {
		FCMINType oldFCMIN = fCMIN;
		fCMIN = newFCMIN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCMIN, oldFCMIN, newFCMIN);
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
	public void setFCMIN(FCMINType newFCMIN) {
		if (newFCMIN != fCMIN) {
			NotificationChain msgs = null;
			if (fCMIN != null)
				msgs = ((InternalEObject)fCMIN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__FCMIN, null, msgs);
			if (newFCMIN != null)
				msgs = ((InternalEObject)newFCMIN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__FCMIN, null, msgs);
			msgs = basicSetFCMIN(newFCMIN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCMIN, newFCMIN, newFCMIN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFCAVGD() {
		return fCAVGD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCAVGD(String newFCAVGD) {
		String oldFCAVGD = fCAVGD;
		fCAVGD = newFCAVGD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCAVGD, oldFCAVGD, fCAVGD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFCAVGN() {
		return fCAVGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCAVGN(String newFCAVGN) {
		String oldFCAVGN = fCAVGN;
		fCAVGN = newFCAVGN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__FCAVGN, oldFCAVGN, fCAVGN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RRMAXType getRRMAX() {
		return rRMAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRRMAX(RRMAXType newRRMAX, NotificationChain msgs) {
		RRMAXType oldRRMAX = rRMAX;
		rRMAX = newRRMAX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__RRMAX, oldRRMAX, newRRMAX);
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
	public void setRRMAX(RRMAXType newRRMAX) {
		if (newRRMAX != rRMAX) {
			NotificationChain msgs = null;
			if (rRMAX != null)
				msgs = ((InternalEObject)rRMAX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__RRMAX, null, msgs);
			if (newRRMAX != null)
				msgs = ((InternalEObject)newRRMAX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__RRMAX, null, msgs);
			msgs = basicSetRRMAX(newRRMAX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__RRMAX, newRRMAX, newRRMAX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RRMINType getRRMIN() {
		return rRMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRRMIN(RRMINType newRRMIN, NotificationChain msgs) {
		RRMINType oldRRMIN = rRMIN;
		rRMIN = newRRMIN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__RRMIN, oldRRMIN, newRRMIN);
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
	public void setRRMIN(RRMINType newRRMIN) {
		if (newRRMIN != rRMIN) {
			NotificationChain msgs = null;
			if (rRMIN != null)
				msgs = ((InternalEObject)rRMIN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__RRMIN, null, msgs);
			if (newRRMIN != null)
				msgs = ((InternalEObject)newRRMIN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HOLTER_TYPE__RRMIN, null, msgs);
			msgs = basicSetRRMIN(newRRMIN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__RRMIN, newRRMIN, newRRMIN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQRSTOT() {
		return qRSTOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQRSTOT(String newQRSTOT) {
		String oldQRSTOT = qRSTOT;
		qRSTOT = newQRSTOT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__QRSTOT, oldQRSTOT, qRSTOT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBRADY() {
		return bRADY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBRADY(String newBRADY) {
		String oldBRADY = bRADY;
		bRADY = newBRADY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__BRADY, oldBRADY, bRADY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPAUSE() {
		return pAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPAUSE(String newPAUSE) {
		String oldPAUSE = pAUSE;
		pAUSE = newPAUSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__PAUSE, oldPAUSE, pAUSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLONG() {
		return lONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLONG(String newLONG) {
		String oldLONG = lONG;
		lONG = newLONG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__LONG, oldLONG, lONG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getESV() {
		return eSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setESV(String newESV) {
		String oldESV = eSV;
		eSV = newESV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__ESV, oldESV, eSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDBLV() {
		return dBLV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDBLV(String newDBLV) {
		String oldDBLV = dBLV;
		dBLV = newDBLV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__DBLV, oldDBLV, dBLV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSALVV() {
		return sALVV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSALVV(String newSALVV) {
		String oldSALVV = sALVV;
		sALVV = newSALVV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__SALVV, oldSALVV, sALVV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBGV() {
		return bGV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGV(String newBGV) {
		String oldBGV = bGV;
		bGV = newBGV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__BGV, oldBGV, bGV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTGV() {
		return tGV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTGV(String newTGV) {
		String oldTGV = tGV;
		tGV = newTGV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__TGV, oldTGV, tGV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTACHY() {
		return tACHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTACHY(String newTACHY) {
		String oldTACHY = tACHY;
		tACHY = newTACHY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__TACHY, oldTACHY, tACHY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getESSV() {
		return eSSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setESSV(String newESSV) {
		String oldESSV = eSSV;
		eSSV = newESSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__ESSV, oldESSV, eSSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDBLSV() {
		return dBLSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDBLSV(String newDBLSV) {
		String oldDBLSV = dBLSV;
		dBLSV = newDBLSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__DBLSV, oldDBLSV, dBLSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSALVSV() {
		return sALVSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSALVSV(String newSALVSV) {
		String oldSALVSV = sALVSV;
		sALVSV = newSALVSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__SALVSV, oldSALVSV, sALVSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBGSV() {
		return bGSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGSV(String newBGSV) {
		String oldBGSV = bGSV;
		bGSV = newBGSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__BGSV, oldBGSV, bGSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTGSV() {
		return tGSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTGSV(String newTGSV) {
		String oldTGSV = tGSV;
		tGSV = newTGSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__TGSV, oldTGSV, tGSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTACHYSV() {
		return tACHYSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTACHYSV(String newTACHYSV) {
		String oldTACHYSV = tACHYSV;
		tACHYSV = newTACHYSV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__TACHYSV, oldTACHYSV, tACHYSV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRRINST() {
		return rRINST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRRINST(String newRRINST) {
		String oldRRINST = rRINST;
		rRINST = newRRINST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HOLTER_TYPE__RRINST, oldRRINST, rRINST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.HOLTER_TYPE__FCMAX:
				return basicSetFCMAX(null, msgs);
			case KmehrPackage.HOLTER_TYPE__FCMIN:
				return basicSetFCMIN(null, msgs);
			case KmehrPackage.HOLTER_TYPE__RRMAX:
				return basicSetRRMAX(null, msgs);
			case KmehrPackage.HOLTER_TYPE__RRMIN:
				return basicSetRRMIN(null, msgs);
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
			case KmehrPackage.HOLTER_TYPE__FCAVG:
				return getFCAVG();
			case KmehrPackage.HOLTER_TYPE__FCMAX:
				return getFCMAX();
			case KmehrPackage.HOLTER_TYPE__FCMIN:
				return getFCMIN();
			case KmehrPackage.HOLTER_TYPE__FCAVGD:
				return getFCAVGD();
			case KmehrPackage.HOLTER_TYPE__FCAVGN:
				return getFCAVGN();
			case KmehrPackage.HOLTER_TYPE__RRMAX:
				return getRRMAX();
			case KmehrPackage.HOLTER_TYPE__RRMIN:
				return getRRMIN();
			case KmehrPackage.HOLTER_TYPE__QRSTOT:
				return getQRSTOT();
			case KmehrPackage.HOLTER_TYPE__BRADY:
				return getBRADY();
			case KmehrPackage.HOLTER_TYPE__PAUSE:
				return getPAUSE();
			case KmehrPackage.HOLTER_TYPE__LONG:
				return getLONG();
			case KmehrPackage.HOLTER_TYPE__ESV:
				return getESV();
			case KmehrPackage.HOLTER_TYPE__DBLV:
				return getDBLV();
			case KmehrPackage.HOLTER_TYPE__SALVV:
				return getSALVV();
			case KmehrPackage.HOLTER_TYPE__BGV:
				return getBGV();
			case KmehrPackage.HOLTER_TYPE__TGV:
				return getTGV();
			case KmehrPackage.HOLTER_TYPE__TACHY:
				return getTACHY();
			case KmehrPackage.HOLTER_TYPE__ESSV:
				return getESSV();
			case KmehrPackage.HOLTER_TYPE__DBLSV:
				return getDBLSV();
			case KmehrPackage.HOLTER_TYPE__SALVSV:
				return getSALVSV();
			case KmehrPackage.HOLTER_TYPE__BGSV:
				return getBGSV();
			case KmehrPackage.HOLTER_TYPE__TGSV:
				return getTGSV();
			case KmehrPackage.HOLTER_TYPE__TACHYSV:
				return getTACHYSV();
			case KmehrPackage.HOLTER_TYPE__RRINST:
				return getRRINST();
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
			case KmehrPackage.HOLTER_TYPE__FCAVG:
				setFCAVG((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__FCMAX:
				setFCMAX((FCMAXType)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__FCMIN:
				setFCMIN((FCMINType)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__FCAVGD:
				setFCAVGD((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__FCAVGN:
				setFCAVGN((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__RRMAX:
				setRRMAX((RRMAXType)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__RRMIN:
				setRRMIN((RRMINType)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__QRSTOT:
				setQRSTOT((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__BRADY:
				setBRADY((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__PAUSE:
				setPAUSE((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__LONG:
				setLONG((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__ESV:
				setESV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__DBLV:
				setDBLV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__SALVV:
				setSALVV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__BGV:
				setBGV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__TGV:
				setTGV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__TACHY:
				setTACHY((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__ESSV:
				setESSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__DBLSV:
				setDBLSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__SALVSV:
				setSALVSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__BGSV:
				setBGSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__TGSV:
				setTGSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__TACHYSV:
				setTACHYSV((String)newValue);
				return;
			case KmehrPackage.HOLTER_TYPE__RRINST:
				setRRINST((String)newValue);
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
			case KmehrPackage.HOLTER_TYPE__FCAVG:
				setFCAVG(FCAVG_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__FCMAX:
				setFCMAX((FCMAXType)null);
				return;
			case KmehrPackage.HOLTER_TYPE__FCMIN:
				setFCMIN((FCMINType)null);
				return;
			case KmehrPackage.HOLTER_TYPE__FCAVGD:
				setFCAVGD(FCAVGD_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__FCAVGN:
				setFCAVGN(FCAVGN_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__RRMAX:
				setRRMAX((RRMAXType)null);
				return;
			case KmehrPackage.HOLTER_TYPE__RRMIN:
				setRRMIN((RRMINType)null);
				return;
			case KmehrPackage.HOLTER_TYPE__QRSTOT:
				setQRSTOT(QRSTOT_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__BRADY:
				setBRADY(BRADY_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__PAUSE:
				setPAUSE(PAUSE_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__LONG:
				setLONG(LONG_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__ESV:
				setESV(ESV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__DBLV:
				setDBLV(DBLV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__SALVV:
				setSALVV(SALVV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__BGV:
				setBGV(BGV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__TGV:
				setTGV(TGV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__TACHY:
				setTACHY(TACHY_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__ESSV:
				setESSV(ESSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__DBLSV:
				setDBLSV(DBLSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__SALVSV:
				setSALVSV(SALVSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__BGSV:
				setBGSV(BGSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__TGSV:
				setTGSV(TGSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__TACHYSV:
				setTACHYSV(TACHYSV_EDEFAULT);
				return;
			case KmehrPackage.HOLTER_TYPE__RRINST:
				setRRINST(RRINST_EDEFAULT);
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
			case KmehrPackage.HOLTER_TYPE__FCAVG:
				return FCAVG_EDEFAULT == null ? fCAVG != null : !FCAVG_EDEFAULT.equals(fCAVG);
			case KmehrPackage.HOLTER_TYPE__FCMAX:
				return fCMAX != null;
			case KmehrPackage.HOLTER_TYPE__FCMIN:
				return fCMIN != null;
			case KmehrPackage.HOLTER_TYPE__FCAVGD:
				return FCAVGD_EDEFAULT == null ? fCAVGD != null : !FCAVGD_EDEFAULT.equals(fCAVGD);
			case KmehrPackage.HOLTER_TYPE__FCAVGN:
				return FCAVGN_EDEFAULT == null ? fCAVGN != null : !FCAVGN_EDEFAULT.equals(fCAVGN);
			case KmehrPackage.HOLTER_TYPE__RRMAX:
				return rRMAX != null;
			case KmehrPackage.HOLTER_TYPE__RRMIN:
				return rRMIN != null;
			case KmehrPackage.HOLTER_TYPE__QRSTOT:
				return QRSTOT_EDEFAULT == null ? qRSTOT != null : !QRSTOT_EDEFAULT.equals(qRSTOT);
			case KmehrPackage.HOLTER_TYPE__BRADY:
				return BRADY_EDEFAULT == null ? bRADY != null : !BRADY_EDEFAULT.equals(bRADY);
			case KmehrPackage.HOLTER_TYPE__PAUSE:
				return PAUSE_EDEFAULT == null ? pAUSE != null : !PAUSE_EDEFAULT.equals(pAUSE);
			case KmehrPackage.HOLTER_TYPE__LONG:
				return LONG_EDEFAULT == null ? lONG != null : !LONG_EDEFAULT.equals(lONG);
			case KmehrPackage.HOLTER_TYPE__ESV:
				return ESV_EDEFAULT == null ? eSV != null : !ESV_EDEFAULT.equals(eSV);
			case KmehrPackage.HOLTER_TYPE__DBLV:
				return DBLV_EDEFAULT == null ? dBLV != null : !DBLV_EDEFAULT.equals(dBLV);
			case KmehrPackage.HOLTER_TYPE__SALVV:
				return SALVV_EDEFAULT == null ? sALVV != null : !SALVV_EDEFAULT.equals(sALVV);
			case KmehrPackage.HOLTER_TYPE__BGV:
				return BGV_EDEFAULT == null ? bGV != null : !BGV_EDEFAULT.equals(bGV);
			case KmehrPackage.HOLTER_TYPE__TGV:
				return TGV_EDEFAULT == null ? tGV != null : !TGV_EDEFAULT.equals(tGV);
			case KmehrPackage.HOLTER_TYPE__TACHY:
				return TACHY_EDEFAULT == null ? tACHY != null : !TACHY_EDEFAULT.equals(tACHY);
			case KmehrPackage.HOLTER_TYPE__ESSV:
				return ESSV_EDEFAULT == null ? eSSV != null : !ESSV_EDEFAULT.equals(eSSV);
			case KmehrPackage.HOLTER_TYPE__DBLSV:
				return DBLSV_EDEFAULT == null ? dBLSV != null : !DBLSV_EDEFAULT.equals(dBLSV);
			case KmehrPackage.HOLTER_TYPE__SALVSV:
				return SALVSV_EDEFAULT == null ? sALVSV != null : !SALVSV_EDEFAULT.equals(sALVSV);
			case KmehrPackage.HOLTER_TYPE__BGSV:
				return BGSV_EDEFAULT == null ? bGSV != null : !BGSV_EDEFAULT.equals(bGSV);
			case KmehrPackage.HOLTER_TYPE__TGSV:
				return TGSV_EDEFAULT == null ? tGSV != null : !TGSV_EDEFAULT.equals(tGSV);
			case KmehrPackage.HOLTER_TYPE__TACHYSV:
				return TACHYSV_EDEFAULT == null ? tACHYSV != null : !TACHYSV_EDEFAULT.equals(tACHYSV);
			case KmehrPackage.HOLTER_TYPE__RRINST:
				return RRINST_EDEFAULT == null ? rRINST != null : !RRINST_EDEFAULT.equals(rRINST);
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
		result.append(" (fCAVG: ");
		result.append(fCAVG);
		result.append(", fCAVGD: ");
		result.append(fCAVGD);
		result.append(", fCAVGN: ");
		result.append(fCAVGN);
		result.append(", qRSTOT: ");
		result.append(qRSTOT);
		result.append(", bRADY: ");
		result.append(bRADY);
		result.append(", pAUSE: ");
		result.append(pAUSE);
		result.append(", lONG: ");
		result.append(lONG);
		result.append(", eSV: ");
		result.append(eSV);
		result.append(", dBLV: ");
		result.append(dBLV);
		result.append(", sALVV: ");
		result.append(sALVV);
		result.append(", bGV: ");
		result.append(bGV);
		result.append(", tGV: ");
		result.append(tGV);
		result.append(", tACHY: ");
		result.append(tACHY);
		result.append(", eSSV: ");
		result.append(eSSV);
		result.append(", dBLSV: ");
		result.append(dBLSV);
		result.append(", sALVSV: ");
		result.append(sALVSV);
		result.append(", bGSV: ");
		result.append(bGSV);
		result.append(", tGSV: ");
		result.append(tGSV);
		result.append(", tACHYSV: ");
		result.append(tACHYSV);
		result.append(", rRINST: ");
		result.append(rRINST);
		result.append(')');
		return result.toString();
	}

} //HolterTypeImpl
