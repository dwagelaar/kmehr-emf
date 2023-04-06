/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVG <em>FCAVG</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMAX <em>FCMAX</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMIN <em>FCMIN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGD <em>FCAVGD</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGN <em>FCAVGN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMAX <em>RRMAX</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMIN <em>RRMIN</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getQRSTOT <em>QRSTOT</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBRADY <em>BRADY</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getPAUSE <em>PAUSE</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getLONG <em>LONG</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESV <em>ESV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLV <em>DBLV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVV <em>SALVV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGV <em>BGV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGV <em>TGV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHY <em>TACHY</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESSV <em>ESSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLSV <em>DBLSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVSV <em>SALVSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGSV <em>BGSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGSV <em>TGSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHYSV <em>TACHYSV</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRINST <em>RRINST</em>}</li>
 * </ul>
 *
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType()
 * @model extendedMetaData="name='holterType' kind='elementOnly'"
 * @generated
 */
public interface HolterType extends EObject {
	/**
	 * Returns the value of the '<em><b>FCAVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCAVG</em>' attribute.
	 * @see #setFCAVG(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_FCAVG()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FCAVG' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFCAVG();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVG <em>FCAVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCAVG</em>' attribute.
	 * @see #getFCAVG()
	 * @generated
	 */
	void setFCAVG(String value);

	/**
	 * Returns the value of the '<em><b>FCMAX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCMAX</em>' containment reference.
	 * @see #setFCMAX(FCMAXType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_FCMAX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FCMAX' namespace='##targetNamespace'"
	 * @generated
	 */
	FCMAXType getFCMAX();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMAX <em>FCMAX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCMAX</em>' containment reference.
	 * @see #getFCMAX()
	 * @generated
	 */
	void setFCMAX(FCMAXType value);

	/**
	 * Returns the value of the '<em><b>FCMIN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCMIN</em>' containment reference.
	 * @see #setFCMIN(FCMINType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_FCMIN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FCMIN' namespace='##targetNamespace'"
	 * @generated
	 */
	FCMINType getFCMIN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMIN <em>FCMIN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCMIN</em>' containment reference.
	 * @see #getFCMIN()
	 * @generated
	 */
	void setFCMIN(FCMINType value);

	/**
	 * Returns the value of the '<em><b>FCAVGD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCAVGD</em>' attribute.
	 * @see #setFCAVGD(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_FCAVGD()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FCAVGD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFCAVGD();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGD <em>FCAVGD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCAVGD</em>' attribute.
	 * @see #getFCAVGD()
	 * @generated
	 */
	void setFCAVGD(String value);

	/**
	 * Returns the value of the '<em><b>FCAVGN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCAVGN</em>' attribute.
	 * @see #setFCAVGN(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_FCAVGN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FCAVGN' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFCAVGN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGN <em>FCAVGN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCAVGN</em>' attribute.
	 * @see #getFCAVGN()
	 * @generated
	 */
	void setFCAVGN(String value);

	/**
	 * Returns the value of the '<em><b>RRMAX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RRMAX</em>' containment reference.
	 * @see #setRRMAX(RRMAXType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_RRMAX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RRMAX' namespace='##targetNamespace'"
	 * @generated
	 */
	RRMAXType getRRMAX();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMAX <em>RRMAX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRMAX</em>' containment reference.
	 * @see #getRRMAX()
	 * @generated
	 */
	void setRRMAX(RRMAXType value);

	/**
	 * Returns the value of the '<em><b>RRMIN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RRMIN</em>' containment reference.
	 * @see #setRRMIN(RRMINType)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_RRMIN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RRMIN' namespace='##targetNamespace'"
	 * @generated
	 */
	RRMINType getRRMIN();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMIN <em>RRMIN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRMIN</em>' containment reference.
	 * @see #getRRMIN()
	 * @generated
	 */
	void setRRMIN(RRMINType value);

	/**
	 * Returns the value of the '<em><b>QRSTOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRSTOT</em>' attribute.
	 * @see #setQRSTOT(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_QRSTOT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='QRSTOT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQRSTOT();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getQRSTOT <em>QRSTOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRSTOT</em>' attribute.
	 * @see #getQRSTOT()
	 * @generated
	 */
	void setQRSTOT(String value);

	/**
	 * Returns the value of the '<em><b>BRADY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BRADY</em>' attribute.
	 * @see #setBRADY(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_BRADY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BRADY' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBRADY();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBRADY <em>BRADY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BRADY</em>' attribute.
	 * @see #getBRADY()
	 * @generated
	 */
	void setBRADY(String value);

	/**
	 * Returns the value of the '<em><b>PAUSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PAUSE</em>' attribute.
	 * @see #setPAUSE(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_PAUSE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PAUSE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPAUSE();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getPAUSE <em>PAUSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAUSE</em>' attribute.
	 * @see #getPAUSE()
	 * @generated
	 */
	void setPAUSE(String value);

	/**
	 * Returns the value of the '<em><b>LONG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LONG</em>' attribute.
	 * @see #setLONG(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_LONG()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONG();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getLONG <em>LONG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONG</em>' attribute.
	 * @see #getLONG()
	 * @generated
	 */
	void setLONG(String value);

	/**
	 * Returns the value of the '<em><b>ESV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESV</em>' attribute.
	 * @see #setESV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_ESV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ESV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getESV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESV <em>ESV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESV</em>' attribute.
	 * @see #getESV()
	 * @generated
	 */
	void setESV(String value);

	/**
	 * Returns the value of the '<em><b>DBLV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBLV</em>' attribute.
	 * @see #setDBLV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_DBLV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DBLV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDBLV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLV <em>DBLV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBLV</em>' attribute.
	 * @see #getDBLV()
	 * @generated
	 */
	void setDBLV(String value);

	/**
	 * Returns the value of the '<em><b>SALVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SALVV</em>' attribute.
	 * @see #setSALVV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_SALVV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SALVV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSALVV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVV <em>SALVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SALVV</em>' attribute.
	 * @see #getSALVV()
	 * @generated
	 */
	void setSALVV(String value);

	/**
	 * Returns the value of the '<em><b>BGV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGV</em>' attribute.
	 * @see #setBGV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_BGV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BGV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBGV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGV <em>BGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGV</em>' attribute.
	 * @see #getBGV()
	 * @generated
	 */
	void setBGV(String value);

	/**
	 * Returns the value of the '<em><b>TGV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TGV</em>' attribute.
	 * @see #setTGV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_TGV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TGV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTGV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGV <em>TGV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TGV</em>' attribute.
	 * @see #getTGV()
	 * @generated
	 */
	void setTGV(String value);

	/**
	 * Returns the value of the '<em><b>TACHY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TACHY</em>' attribute.
	 * @see #setTACHY(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_TACHY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TACHY' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTACHY();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHY <em>TACHY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TACHY</em>' attribute.
	 * @see #getTACHY()
	 * @generated
	 */
	void setTACHY(String value);

	/**
	 * Returns the value of the '<em><b>ESSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESSV</em>' attribute.
	 * @see #setESSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_ESSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ESSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getESSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESSV <em>ESSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESSV</em>' attribute.
	 * @see #getESSV()
	 * @generated
	 */
	void setESSV(String value);

	/**
	 * Returns the value of the '<em><b>DBLSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DBLSV</em>' attribute.
	 * @see #setDBLSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_DBLSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DBLSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDBLSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLSV <em>DBLSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBLSV</em>' attribute.
	 * @see #getDBLSV()
	 * @generated
	 */
	void setDBLSV(String value);

	/**
	 * Returns the value of the '<em><b>SALVSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SALVSV</em>' attribute.
	 * @see #setSALVSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_SALVSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SALVSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSALVSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVSV <em>SALVSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SALVSV</em>' attribute.
	 * @see #getSALVSV()
	 * @generated
	 */
	void setSALVSV(String value);

	/**
	 * Returns the value of the '<em><b>BGSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGSV</em>' attribute.
	 * @see #setBGSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_BGSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BGSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBGSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGSV <em>BGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGSV</em>' attribute.
	 * @see #getBGSV()
	 * @generated
	 */
	void setBGSV(String value);

	/**
	 * Returns the value of the '<em><b>TGSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TGSV</em>' attribute.
	 * @see #setTGSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_TGSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TGSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTGSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGSV <em>TGSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TGSV</em>' attribute.
	 * @see #getTGSV()
	 * @generated
	 */
	void setTGSV(String value);

	/**
	 * Returns the value of the '<em><b>TACHYSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TACHYSV</em>' attribute.
	 * @see #setTACHYSV(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_TACHYSV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TACHYSV' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTACHYSV();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHYSV <em>TACHYSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TACHYSV</em>' attribute.
	 * @see #getTACHYSV()
	 * @generated
	 */
	void setTACHYSV(String value);

	/**
	 * Returns the value of the '<em><b>RRINST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RRINST</em>' attribute.
	 * @see #setRRINST(String)
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#getHolterType_RRINST()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RRINST' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRRINST();

	/**
	 * Sets the value of the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRINST <em>RRINST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRINST</em>' attribute.
	 * @see #getRRINST()
	 * @generated
	 */
	void setRRINST(String value);

} // HolterType
