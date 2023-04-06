/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage
 * @generated
 */
public interface IdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdFactory eINSTANCE = be.fgov.ehealth.standards.kmehr.id.id.impl.IdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IDHCPARTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDHCPARTY</em>'.
	 * @generated
	 */
	IDHCPARTY createIDHCPARTY();

	/**
	 * Returns a new object of class '<em>IDINSURANCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDINSURANCE</em>'.
	 * @generated
	 */
	IDINSURANCE createIDINSURANCE();

	/**
	 * Returns a new object of class '<em>IDKMEHR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDKMEHR</em>'.
	 * @generated
	 */
	IDKMEHR createIDKMEHR();

	/**
	 * Returns a new object of class '<em>IDPATIENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDPATIENT</em>'.
	 * @generated
	 */
	IDPATIENT createIDPATIENT();

	/**
	 * Returns a new object of class '<em>IDPROFESSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDPROFESSION</em>'.
	 * @generated
	 */
	IDPROFESSION createIDPROFESSION();

	/**
	 * Returns a new object of class '<em>INSS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>INSS</em>'.
	 * @generated
	 */
	INSS createINSS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdPackage getIdPackage();

} //IdFactory
