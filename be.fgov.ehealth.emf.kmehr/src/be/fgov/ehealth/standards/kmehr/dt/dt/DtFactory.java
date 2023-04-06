/**
 */
package be.fgov.ehealth.standards.kmehr.dt.dt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage
 * @generated
 */
public interface DtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtFactory eINSTANCE = be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Type</em>'.
	 * @generated
	 */
	TextType createTextType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DtPackage getDtPackage();

} //DtFactory
