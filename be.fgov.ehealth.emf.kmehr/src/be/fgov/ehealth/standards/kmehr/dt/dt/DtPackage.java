/**
 */
package be.fgov.ehealth.standards.kmehr.dt.dt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.dt.dt.DtFactory
 * @model kind="package"
 * @generated
 */
public interface DtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ehealth.fgov.be/standards/kmehr/dt/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtPackage eINSTANCE = be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.dt.dt.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.TextTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__L = 1;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 1;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 2;


	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.TextType#getValue()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.dt.dt.TextType#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.dt.dt.TextType#getL()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_L();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='date' baseType='http://www.eclipse.org/emf/2003/XMLType#date' maxInclusive='9999-12-31' minInclusive='1901-01-01' pattern='((000[1-9])|(00[1-9][0-9])|(0[1-9][0-9]{2})|([1-9][0-9]{3}))-((0[1-9])|(1[012]))-((0[1-9])|([12][0-9])|(3[01]))'"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='time' baseType='http://www.eclipse.org/emf/2003/XMLType#time' minInclusive='00:00:00' maxInclusive='23:59:59' pattern='(([01][0-9])|(2[0-3]))(:[0-5][0-9]){2}(\\.[0-9]+)?'"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtFactory getDtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.dt.dt.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.TextTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getTextType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__VALUE = eINSTANCE.getTextType_Value();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__L = eINSTANCE.getTextType_L();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

	}

} //DtPackage
