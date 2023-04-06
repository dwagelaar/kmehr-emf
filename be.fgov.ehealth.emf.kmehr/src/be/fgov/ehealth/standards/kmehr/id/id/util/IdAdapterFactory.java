/**
 */
package be.fgov.ehealth.standards.kmehr.id.id.util;

import be.fgov.ehealth.standards.kmehr.id.id.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage
 * @generated
 */
public class IdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdSwitch<Adapter> modelSwitch =
		new IdSwitch<Adapter>() {
			@Override
			public Adapter caseIDHCPARTY(IDHCPARTY object) {
				return createIDHCPARTYAdapter();
			}
			@Override
			public Adapter caseIDINSURANCE(IDINSURANCE object) {
				return createIDINSURANCEAdapter();
			}
			@Override
			public Adapter caseIDKMEHR(IDKMEHR object) {
				return createIDKMEHRAdapter();
			}
			@Override
			public Adapter caseIDPATIENT(IDPATIENT object) {
				return createIDPATIENTAdapter();
			}
			@Override
			public Adapter caseIDPROFESSION(IDPROFESSION object) {
				return createIDPROFESSIONAdapter();
			}
			@Override
			public Adapter caseINSS(INSS object) {
				return createINSSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY <em>IDHCPARTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY
	 * @generated
	 */
	public Adapter createIDHCPARTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE <em>IDINSURANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE
	 * @generated
	 */
	public Adapter createIDINSURANCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR <em>IDKMEHR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR
	 * @generated
	 */
	public Adapter createIDKMEHRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT <em>IDPATIENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT
	 * @generated
	 */
	public Adapter createIDPATIENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION <em>IDPROFESSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION
	 * @generated
	 */
	public Adapter createIDPROFESSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS <em>INSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS
	 * @generated
	 */
	public Adapter createINSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdAdapterFactory
