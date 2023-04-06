/**
 */
package be.fgov.ehealth.standards.kmehr.dt.dt.util;

import be.fgov.ehealth.standards.kmehr.dt.dt.*;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage
 * @generated
 */
public class DtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DtValidator INSTANCE = new DtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "be.fgov.ehealth.standards.kmehr.dt.dt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DtPackage.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case DtPackage.DATE:
				return validateDate((XMLGregorianCalendar)value, diagnostics, context);
			case DtPackage.TIME:
				return validateTime((XMLGregorianCalendar)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDate_Pattern(date, diagnostics, context);
		if (result || diagnostics != null) result &= validateDate_Min(date, diagnostics, context);
		if (result || diagnostics != null) result &= validateDate_Max(date, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDate_Pattern
	 */
	public static final  PatternMatcher [][] DATE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((000[1-9])|(00[1-9][0-9])|(0[1-9][0-9]{2})|([1-9][0-9]{3}))-((0[1-9])|(1[012]))-((0[1-9])|([12][0-9])|(3[01]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate_Pattern(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DtPackage.Literals.DATE, date, DATE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDate_Min
	 */
	public static final XMLGregorianCalendar DATE__MIN__VALUE = (XMLGregorianCalendar)DtFactory.eINSTANCE.createFromString(DtPackage.eINSTANCE.getDate(), "1901-01-01");

	/**
	 * Validates the Min constraint of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate_Min(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(date, DATE__MIN__VALUE);
		boolean result = comparison == 0 || comparison == 1;
		if (!result && diagnostics != null)
			reportMinViolation(DtPackage.Literals.DATE, date, DATE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDate_Max
	 */
	public static final XMLGregorianCalendar DATE__MAX__VALUE = (XMLGregorianCalendar)DtFactory.eINSTANCE.createFromString(DtPackage.eINSTANCE.getDate(), "9999-12-31");

	/**
	 * Validates the Max constraint of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate_Max(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(date, DATE__MAX__VALUE);
		boolean result = comparison == 0 || comparison == -1;
		if (!result && diagnostics != null)
			reportMaxViolation(DtPackage.Literals.DATE, date, DATE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(XMLGregorianCalendar time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Pattern(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_Min(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_Max(time, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Pattern
	 */
	public static final  PatternMatcher [][] TIME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([01][0-9])|(2[0-3]))(:[0-5][0-9]){2}(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Pattern(XMLGregorianCalendar time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DtPackage.Literals.TIME, time, TIME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Min
	 */
	public static final XMLGregorianCalendar TIME__MIN__VALUE = (XMLGregorianCalendar)DtFactory.eINSTANCE.createFromString(DtPackage.eINSTANCE.getTime(), "00:00:00");

	/**
	 * Validates the Min constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Min(XMLGregorianCalendar time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(time, TIME__MIN__VALUE);
		boolean result = comparison == 0 || comparison == 1;
		if (!result && diagnostics != null)
			reportMinViolation(DtPackage.Literals.TIME, time, TIME__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Max
	 */
	public static final XMLGregorianCalendar TIME__MAX__VALUE = (XMLGregorianCalendar)DtFactory.eINSTANCE.createFromString(DtPackage.eINSTANCE.getTime(), "23:59:59");

	/**
	 * Validates the Max constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Max(XMLGregorianCalendar time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(time, TIME__MAX__VALUE);
		boolean result = comparison == 0 || comparison == -1;
		if (!result && diagnostics != null)
			reportMaxViolation(DtPackage.Literals.TIME, time, TIME__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DtValidator
