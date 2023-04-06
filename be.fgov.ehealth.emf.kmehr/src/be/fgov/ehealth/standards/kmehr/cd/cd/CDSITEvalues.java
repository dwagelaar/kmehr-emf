/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDSIT Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDSITEvalues()
 * @model extendedMetaData="name='CD-SITEvalues'"
 * @generated
 */
public enum CDSITEvalues implements Enumerator {
	/**
	 * The '<em><b>BE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BE_VALUE
	 * @generated
	 * @ordered
	 */
	BE(0, "BE", "BE"),

	/**
	 * The '<em><b>Blood</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD_VALUE
	 * @generated
	 * @ordered
	 */
	BLOOD(1, "blood", "blood"),

	/**
	 * The '<em><b>BN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BN_VALUE
	 * @generated
	 * @ordered
	 */
	BN(2, "BN", "BN"),

	/**
	 * The '<em><b>BU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BU_VALUE
	 * @generated
	 * @ordered
	 */
	BU(3, "BU", "BU"),

	/**
	 * The '<em><b>CT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(4, "CT", "CT"),

	/**
	 * The '<em><b>LA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(5, "LA", "LA"),

	/**
	 * The '<em><b>LAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAC_VALUE
	 * @generated
	 * @ordered
	 */
	LAC(6, "LAC", "LAC"),

	/**
	 * The '<em><b>LACF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LACF_VALUE
	 * @generated
	 * @ordered
	 */
	LACF(7, "LACF", "LACF"),

	/**
	 * The '<em><b>LD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD_VALUE
	 * @generated
	 * @ordered
	 */
	LD(8, "LD", "LD"),

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(9, "LE", "LE"),

	/**
	 * The '<em><b>LEJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEJ_VALUE
	 * @generated
	 * @ordered
	 */
	LEJ(10, "LEJ", "LEJ"),

	/**
	 * The '<em><b>LF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LF_VALUE
	 * @generated
	 * @ordered
	 */
	LF(11, "LF", "LF"),

	/**
	 * The '<em><b>LG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG_VALUE
	 * @generated
	 * @ordered
	 */
	LG(12, "LG", "LG"),

	/**
	 * The '<em><b>LH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LH_VALUE
	 * @generated
	 * @ordered
	 */
	LH(13, "LH", "LH"),

	/**
	 * The '<em><b>LIJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIJ_VALUE
	 * @generated
	 * @ordered
	 */
	LIJ(14, "LIJ", "LIJ"),

	/**
	 * The '<em><b>LLAQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLAQ_VALUE
	 * @generated
	 * @ordered
	 */
	LLAQ(15, "LLAQ", "LLAQ"),

	/**
	 * The '<em><b>LLFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLFA_VALUE
	 * @generated
	 * @ordered
	 */
	LLFA(16, "LLFA", "LLFA"),

	/**
	 * The '<em><b>LMFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LMFA_VALUE
	 * @generated
	 * @ordered
	 */
	LMFA(17, "LMFA", "LMFA"),

	/**
	 * The '<em><b>LN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN_VALUE
	 * @generated
	 * @ordered
	 */
	LN(18, "LN", "LN"),

	/**
	 * The '<em><b>LPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LPC_VALUE
	 * @generated
	 * @ordered
	 */
	LPC(19, "LPC", "LPC"),

	/**
	 * The '<em><b>LSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSC_VALUE
	 * @generated
	 * @ordered
	 */
	LSC(20, "LSC", "LSC"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(21, "LT", "LT"),

	/**
	 * The '<em><b>LUA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUA_VALUE
	 * @generated
	 * @ordered
	 */
	LUA(22, "LUA", "LUA"),

	/**
	 * The '<em><b>LUAQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUAQ_VALUE
	 * @generated
	 * @ordered
	 */
	LUAQ(23, "LUAQ", "LUAQ"),

	/**
	 * The '<em><b>LUFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUFA_VALUE
	 * @generated
	 * @ordered
	 */
	LUFA(24, "LUFA", "LUFA"),

	/**
	 * The '<em><b>LVG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVG_VALUE
	 * @generated
	 * @ordered
	 */
	LVG(25, "LVG", "LVG"),

	/**
	 * The '<em><b>LVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVL_VALUE
	 * @generated
	 * @ordered
	 */
	LVL(26, "LVL", "LVL"),

	/**
	 * The '<em><b>NB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB_VALUE
	 * @generated
	 * @ordered
	 */
	NB(27, "NB", "NB"),

	/**
	 * The '<em><b>OD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OD_VALUE
	 * @generated
	 * @ordered
	 */
	OD(28, "OD", "OD"),

	/**
	 * The '<em><b>OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_VALUE
	 * @generated
	 * @ordered
	 */
	OS(29, "OS", "OS"),

	/**
	 * The '<em><b>OU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OU_VALUE
	 * @generated
	 * @ordered
	 */
	OU(30, "OU", "OU"),

	/**
	 * The '<em><b>PA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA_VALUE
	 * @generated
	 * @ordered
	 */
	PA(31, "PA", "PA"),

	/**
	 * The '<em><b>PERIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIN_VALUE
	 * @generated
	 * @ordered
	 */
	PERIN(32, "PERIN", "PERIN"),

	/**
	 * The '<em><b>RA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RA_VALUE
	 * @generated
	 * @ordered
	 */
	RA(33, "RA", "RA"),

	/**
	 * The '<em><b>RAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAC_VALUE
	 * @generated
	 * @ordered
	 */
	RAC(34, "RAC", "RAC"),

	/**
	 * The '<em><b>RACF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACF_VALUE
	 * @generated
	 * @ordered
	 */
	RACF(35, "RACF", "RACF"),

	/**
	 * The '<em><b>RD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RD_VALUE
	 * @generated
	 * @ordered
	 */
	RD(36, "RD", "RD"),

	/**
	 * The '<em><b>RE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE_VALUE
	 * @generated
	 * @ordered
	 */
	RE(37, "RE", "RE"),

	/**
	 * The '<em><b>REJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJ_VALUE
	 * @generated
	 * @ordered
	 */
	REJ(38, "REJ", "REJ"),

	/**
	 * The '<em><b>RF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_VALUE
	 * @generated
	 * @ordered
	 */
	RF(39, "RF", "RF"),

	/**
	 * The '<em><b>RG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG_VALUE
	 * @generated
	 * @ordered
	 */
	RG(40, "RG", "RG"),

	/**
	 * The '<em><b>RH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RH_VALUE
	 * @generated
	 * @ordered
	 */
	RH(41, "RH", "RH"),

	/**
	 * The '<em><b>RIJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIJ_VALUE
	 * @generated
	 * @ordered
	 */
	RIJ(42, "RIJ", "RIJ"),

	/**
	 * The '<em><b>RLAQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLAQ_VALUE
	 * @generated
	 * @ordered
	 */
	RLAQ(43, "RLAQ", "RLAQ"),

	/**
	 * The '<em><b>RLFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLFA_VALUE
	 * @generated
	 * @ordered
	 */
	RLFA(44, "RLFA", "RLFA"),

	/**
	 * The '<em><b>RMFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RMFA_VALUE
	 * @generated
	 * @ordered
	 */
	RMFA(45, "RMFA", "RMFA"),

	/**
	 * The '<em><b>RN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RN_VALUE
	 * @generated
	 * @ordered
	 */
	RN(46, "RN", "RN"),

	/**
	 * The '<em><b>RPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPC_VALUE
	 * @generated
	 * @ordered
	 */
	RPC(47, "RPC", "RPC"),

	/**
	 * The '<em><b>RSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSC_VALUE
	 * @generated
	 * @ordered
	 */
	RSC(48, "RSC", "RSC"),

	/**
	 * The '<em><b>RT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT_VALUE
	 * @generated
	 * @ordered
	 */
	RT(49, "RT", "RT"),

	/**
	 * The '<em><b>RUA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUA_VALUE
	 * @generated
	 * @ordered
	 */
	RUA(50, "RUA", "RUA"),

	/**
	 * The '<em><b>RUAQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUAQ_VALUE
	 * @generated
	 * @ordered
	 */
	RUAQ(51, "RUAQ", "RUAQ"),

	/**
	 * The '<em><b>RUFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUFA_VALUE
	 * @generated
	 * @ordered
	 */
	RUFA(52, "RUFA", "RUFA"),

	/**
	 * The '<em><b>RVG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RVG_VALUE
	 * @generated
	 * @ordered
	 */
	RVG(53, "RVG", "RVG"),

	/**
	 * The '<em><b>RVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RVL_VALUE
	 * @generated
	 * @ordered
	 */
	RVL(54, "RVL", "RVL"),

	/**
	 * The '<em><b>Lk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LK_VALUE
	 * @generated
	 * @ordered
	 */
	LK(55, "lk", "lk"),

	/**
	 * The '<em><b>Rk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RK_VALUE
	 * @generated
	 * @ordered
	 */
	RK(56, "rk", "rk"),

	/**
	 * The '<em><b>Lhip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHIP_VALUE
	 * @generated
	 * @ordered
	 */
	LHIP(57, "lhip", "lhip"),

	/**
	 * The '<em><b>Rhip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHIP_VALUE
	 * @generated
	 * @ordered
	 */
	RHIP(58, "rhip", "rhip"),

	/**
	 * The '<em><b>Lfem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFEM_VALUE
	 * @generated
	 * @ordered
	 */
	LFEM(59, "lfem", "lfem"),

	/**
	 * The '<em><b>Rfem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFEM_VALUE
	 * @generated
	 * @ordered
	 */
	RFEM(60, "rfem", "rfem"),

	/**
	 * The '<em><b>Ltib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTIB_VALUE
	 * @generated
	 * @ordered
	 */
	LTIB(61, "ltib", "ltib"),

	/**
	 * The '<em><b>Rtib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTIB_VALUE
	 * @generated
	 * @ordered
	 */
	RTIB(62, "rtib", "rtib");

	/**
	 * The '<em><b>BE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BE_VALUE = 0;

	/**
	 * The '<em><b>Blood</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD
	 * @model name="blood"
	 * @generated
	 * @ordered
	 */
	public static final int BLOOD_VALUE = 1;

	/**
	 * The '<em><b>BN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BN_VALUE = 2;

	/**
	 * The '<em><b>BU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BU_VALUE = 3;

	/**
	 * The '<em><b>CT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CT_VALUE = 4;

	/**
	 * The '<em><b>LA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 5;

	/**
	 * The '<em><b>LAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAC_VALUE = 6;

	/**
	 * The '<em><b>LACF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LACF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LACF_VALUE = 7;

	/**
	 * The '<em><b>LD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LD_VALUE = 8;

	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 9;

	/**
	 * The '<em><b>LEJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEJ_VALUE = 10;

	/**
	 * The '<em><b>LF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LF_VALUE = 11;

	/**
	 * The '<em><b>LG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LG_VALUE = 12;

	/**
	 * The '<em><b>LH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LH_VALUE = 13;

	/**
	 * The '<em><b>LIJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIJ_VALUE = 14;

	/**
	 * The '<em><b>LLAQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLAQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LLAQ_VALUE = 15;

	/**
	 * The '<em><b>LLFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LLFA_VALUE = 16;

	/**
	 * The '<em><b>LMFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LMFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LMFA_VALUE = 17;

	/**
	 * The '<em><b>LN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LN_VALUE = 18;

	/**
	 * The '<em><b>LPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LPC_VALUE = 19;

	/**
	 * The '<em><b>LSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LSC_VALUE = 20;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 21;

	/**
	 * The '<em><b>LUA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUA_VALUE = 22;

	/**
	 * The '<em><b>LUAQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUAQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUAQ_VALUE = 23;

	/**
	 * The '<em><b>LUFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUFA_VALUE = 24;

	/**
	 * The '<em><b>LVG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LVG_VALUE = 25;

	/**
	 * The '<em><b>LVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LVL_VALUE = 26;

	/**
	 * The '<em><b>NB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NB_VALUE = 27;

	/**
	 * The '<em><b>OD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OD_VALUE = 28;

	/**
	 * The '<em><b>OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_VALUE = 29;

	/**
	 * The '<em><b>OU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OU_VALUE = 30;

	/**
	 * The '<em><b>PA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PA_VALUE = 31;

	/**
	 * The '<em><b>PERIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERIN_VALUE = 32;

	/**
	 * The '<em><b>RA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RA_VALUE = 33;

	/**
	 * The '<em><b>RAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAC_VALUE = 34;

	/**
	 * The '<em><b>RACF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RACF_VALUE = 35;

	/**
	 * The '<em><b>RD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RD_VALUE = 36;

	/**
	 * The '<em><b>RE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RE_VALUE = 37;

	/**
	 * The '<em><b>REJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJ_VALUE = 38;

	/**
	 * The '<em><b>RF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RF_VALUE = 39;

	/**
	 * The '<em><b>RG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RG_VALUE = 40;

	/**
	 * The '<em><b>RH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RH_VALUE = 41;

	/**
	 * The '<em><b>RIJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIJ_VALUE = 42;

	/**
	 * The '<em><b>RLAQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLAQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RLAQ_VALUE = 43;

	/**
	 * The '<em><b>RLFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RLFA_VALUE = 44;

	/**
	 * The '<em><b>RMFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RMFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RMFA_VALUE = 45;

	/**
	 * The '<em><b>RN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RN_VALUE = 46;

	/**
	 * The '<em><b>RPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPC_VALUE = 47;

	/**
	 * The '<em><b>RSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSC_VALUE = 48;

	/**
	 * The '<em><b>RT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RT_VALUE = 49;

	/**
	 * The '<em><b>RUA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUA_VALUE = 50;

	/**
	 * The '<em><b>RUAQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUAQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUAQ_VALUE = 51;

	/**
	 * The '<em><b>RUFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUFA_VALUE = 52;

	/**
	 * The '<em><b>RVG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RVG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RVG_VALUE = 53;

	/**
	 * The '<em><b>RVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RVL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RVL_VALUE = 54;

	/**
	 * The '<em><b>Lk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LK
	 * @model name="lk"
	 * @generated
	 * @ordered
	 */
	public static final int LK_VALUE = 55;

	/**
	 * The '<em><b>Rk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RK
	 * @model name="rk"
	 * @generated
	 * @ordered
	 */
	public static final int RK_VALUE = 56;

	/**
	 * The '<em><b>Lhip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LHIP
	 * @model name="lhip"
	 * @generated
	 * @ordered
	 */
	public static final int LHIP_VALUE = 57;

	/**
	 * The '<em><b>Rhip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHIP
	 * @model name="rhip"
	 * @generated
	 * @ordered
	 */
	public static final int RHIP_VALUE = 58;

	/**
	 * The '<em><b>Lfem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LFEM
	 * @model name="lfem"
	 * @generated
	 * @ordered
	 */
	public static final int LFEM_VALUE = 59;

	/**
	 * The '<em><b>Rfem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFEM
	 * @model name="rfem"
	 * @generated
	 * @ordered
	 */
	public static final int RFEM_VALUE = 60;

	/**
	 * The '<em><b>Ltib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTIB
	 * @model name="ltib"
	 * @generated
	 * @ordered
	 */
	public static final int LTIB_VALUE = 61;

	/**
	 * The '<em><b>Rtib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTIB
	 * @model name="rtib"
	 * @generated
	 * @ordered
	 */
	public static final int RTIB_VALUE = 62;

	/**
	 * An array of all the '<em><b>CDSIT Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDSITEvalues[] VALUES_ARRAY =
		new CDSITEvalues[] {
			BE,
			BLOOD,
			BN,
			BU,
			CT,
			LA,
			LAC,
			LACF,
			LD,
			LE,
			LEJ,
			LF,
			LG,
			LH,
			LIJ,
			LLAQ,
			LLFA,
			LMFA,
			LN,
			LPC,
			LSC,
			LT,
			LUA,
			LUAQ,
			LUFA,
			LVG,
			LVL,
			NB,
			OD,
			OS,
			OU,
			PA,
			PERIN,
			RA,
			RAC,
			RACF,
			RD,
			RE,
			REJ,
			RF,
			RG,
			RH,
			RIJ,
			RLAQ,
			RLFA,
			RMFA,
			RN,
			RPC,
			RSC,
			RT,
			RUA,
			RUAQ,
			RUFA,
			RVG,
			RVL,
			LK,
			RK,
			LHIP,
			RHIP,
			LFEM,
			RFEM,
			LTIB,
			RTIB,
		};

	/**
	 * A public read-only list of all the '<em><b>CDSIT Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDSITEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDSIT Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSITEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSITEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSIT Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSITEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSITEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSIT Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSITEvalues get(int value) {
		switch (value) {
			case BE_VALUE: return BE;
			case BLOOD_VALUE: return BLOOD;
			case BN_VALUE: return BN;
			case BU_VALUE: return BU;
			case CT_VALUE: return CT;
			case LA_VALUE: return LA;
			case LAC_VALUE: return LAC;
			case LACF_VALUE: return LACF;
			case LD_VALUE: return LD;
			case LE_VALUE: return LE;
			case LEJ_VALUE: return LEJ;
			case LF_VALUE: return LF;
			case LG_VALUE: return LG;
			case LH_VALUE: return LH;
			case LIJ_VALUE: return LIJ;
			case LLAQ_VALUE: return LLAQ;
			case LLFA_VALUE: return LLFA;
			case LMFA_VALUE: return LMFA;
			case LN_VALUE: return LN;
			case LPC_VALUE: return LPC;
			case LSC_VALUE: return LSC;
			case LT_VALUE: return LT;
			case LUA_VALUE: return LUA;
			case LUAQ_VALUE: return LUAQ;
			case LUFA_VALUE: return LUFA;
			case LVG_VALUE: return LVG;
			case LVL_VALUE: return LVL;
			case NB_VALUE: return NB;
			case OD_VALUE: return OD;
			case OS_VALUE: return OS;
			case OU_VALUE: return OU;
			case PA_VALUE: return PA;
			case PERIN_VALUE: return PERIN;
			case RA_VALUE: return RA;
			case RAC_VALUE: return RAC;
			case RACF_VALUE: return RACF;
			case RD_VALUE: return RD;
			case RE_VALUE: return RE;
			case REJ_VALUE: return REJ;
			case RF_VALUE: return RF;
			case RG_VALUE: return RG;
			case RH_VALUE: return RH;
			case RIJ_VALUE: return RIJ;
			case RLAQ_VALUE: return RLAQ;
			case RLFA_VALUE: return RLFA;
			case RMFA_VALUE: return RMFA;
			case RN_VALUE: return RN;
			case RPC_VALUE: return RPC;
			case RSC_VALUE: return RSC;
			case RT_VALUE: return RT;
			case RUA_VALUE: return RUA;
			case RUAQ_VALUE: return RUAQ;
			case RUFA_VALUE: return RUFA;
			case RVG_VALUE: return RVG;
			case RVL_VALUE: return RVL;
			case LK_VALUE: return LK;
			case RK_VALUE: return RK;
			case LHIP_VALUE: return LHIP;
			case RHIP_VALUE: return RHIP;
			case LFEM_VALUE: return LFEM;
			case RFEM_VALUE: return RFEM;
			case LTIB_VALUE: return LTIB;
			case RTIB_VALUE: return RTIB;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CDSITEvalues(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CDSITEvalues
