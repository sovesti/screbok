/**
 */
package ru.mkn.sovesti.screbok.slm.model.meta;

import org.eclipse.emf.ecore.EFactory;

import ru.mkn.sovesti.screbok.slm.model.api.Convert;
import ru.mkn.sovesti.screbok.slm.model.api.Launch;
import ru.mkn.sovesti.screbok.slm.model.api.Scrap;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage
 * @generated
 */
public interface SlmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlmFactory eINSTANCE = ru.mkn.sovesti.screbok.slm.model.impl.SlmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Launch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch</em>'.
	 * @generated
	 */
	Launch createLaunch();

	/**
	 * Returns a new object of class '<em>Scrap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scrap</em>'.
	 * @generated
	 */
	Scrap createScrap();

	/**
	 * Returns a new object of class '<em>Convert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert</em>'.
	 * @generated
	 */
	Convert createConvert();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SlmPackage getSlmPackage();

} //SlmFactory
