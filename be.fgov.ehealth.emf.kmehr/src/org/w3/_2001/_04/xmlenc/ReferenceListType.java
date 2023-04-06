/**
 */
package org.w3._2001._04.xmlenc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.ReferenceListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.ReferenceListType#getDataReference <em>Data Reference</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.ReferenceListType#getKeyReference <em>Key Reference</em>}</li>
 * </ul>
 *
 * @see org.w3._2001._04.xmlenc.XmlencPackage#getReferenceListType()
 * @model extendedMetaData="name='ReferenceList_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferenceListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getReferenceListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Data Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001._04.xmlenc.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reference</em>' containment reference list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getReferenceListType_DataReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataReference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReferenceType> getDataReference();

	/**
	 * Returns the value of the '<em><b>Key Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001._04.xmlenc.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Reference</em>' containment reference list.
	 * @see org.w3._2001._04.xmlenc.XmlencPackage#getReferenceListType_KeyReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyReference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReferenceType> getKeyReference();

} // ReferenceListType
