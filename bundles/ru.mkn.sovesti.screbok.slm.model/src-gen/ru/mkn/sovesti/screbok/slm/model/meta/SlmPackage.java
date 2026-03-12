/**
 */
package ru.mkn.sovesti.screbok.slm.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage;

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
 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmFactory
 * @model kind="package"
 * @generated
 */
public interface SlmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sovesti.ru/screbok/slm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlmPackage eINSTANCE = ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.LaunchImpl <em>Launch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.LaunchImpl
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getLaunch()
	 * @generated
	 */
	int LAUNCH = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Launch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Launch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.ActionImpl
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = DsmPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUT = DsmPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = DsmPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___RUN__LAUNCHCONTEXT = DsmPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = DsmPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ScrapImpl <em>Scrap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.ScrapImpl
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getScrap()
	 * @generated
	 */
	int SCRAP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP__PAGES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scrap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP___RUN__LAUNCHCONTEXT = ACTION___RUN__LAUNCHCONTEXT;

	/**
	 * The number of operations of the '<em>Scrap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl <em>Convert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getConvert()
	 * @generated
	 */
	int CONVERT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__BOOK = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__PAGES = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__FORMAT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT___RUN__LAUNCHCONTEXT = ACTION___RUN__LAUNCHCONTEXT;

	/**
	 * The number of operations of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mkn.sovesti.screbok.slm.model.api.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Format
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 4;

	/**
	 * The meta object id for the '<em>Launch Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mkn.sovesti.screbok.slm.model.LaunchContext
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getLaunchContext()
	 * @generated
	 */
	int LAUNCH_CONTEXT = 5;

	/**
	 * The meta object id for the '<em>Core Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.CoreException
	 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getCoreException()
	 * @generated
	 */
	int CORE_EXCEPTION = 6;

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.slm.model.api.Launch <em>Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Launch
	 * @generated
	 */
	EClass getLaunch();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mkn.sovesti.screbok.slm.model.api.Launch#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Launch#getActions()
	 * @see #getLaunch()
	 * @generated
	 */
	EReference getLaunch_Actions();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.slm.model.api.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.slm.model.api.Action#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Action#getOutput()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Output();

	/**
	 * Returns the meta object for the '{@link ru.mkn.sovesti.screbok.slm.model.api.Action#run(ru.mkn.sovesti.screbok.slm.model.LaunchContext) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Action#run(ru.mkn.sovesti.screbok.slm.model.LaunchContext)
	 * @generated
	 */
	EOperation getAction__Run__LaunchContext();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.slm.model.api.Scrap <em>Scrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scrap</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Scrap
	 * @generated
	 */
	EClass getScrap();

	/**
	 * Returns the meta object for the reference list '{@link ru.mkn.sovesti.screbok.slm.model.api.Scrap#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Scrap#getPages()
	 * @see #getScrap()
	 * @generated
	 */
	EReference getScrap_Pages();

	/**
	 * Returns the meta object for class '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Convert
	 * @generated
	 */
	EClass getConvert();

	/**
	 * Returns the meta object for the reference '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Convert#getBook()
	 * @see #getConvert()
	 * @generated
	 */
	EReference getConvert_Book();

	/**
	 * Returns the meta object for the reference list '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Convert#getPages()
	 * @see #getConvert()
	 * @generated
	 */
	EReference getConvert_Pages();

	/**
	 * Returns the meta object for the attribute '{@link ru.mkn.sovesti.screbok.slm.model.api.Convert#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Convert#getFormat()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_Format();

	/**
	 * Returns the meta object for enum '{@link ru.mkn.sovesti.screbok.slm.model.api.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.api.Format
	 * @generated
	 */
	EEnum getFormat();

	/**
	 * Returns the meta object for data type '{@link ru.mkn.sovesti.screbok.slm.model.LaunchContext <em>Launch Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Launch Context</em>'.
	 * @see ru.mkn.sovesti.screbok.slm.model.LaunchContext
	 * @model instanceClass="ru.mkn.sovesti.screbok.slm.model.LaunchContext"
	 * @generated
	 */
	EDataType getLaunchContext();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Core Exception</em>'.
	 * @see org.eclipse.core.runtime.CoreException
	 * @model instanceClass="org.eclipse.core.runtime.CoreException"
	 * @generated
	 */
	EDataType getCoreException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlmFactory getSlmFactory();

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
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.LaunchImpl <em>Launch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.LaunchImpl
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getLaunch()
		 * @generated
		 */
		EClass LAUNCH = eINSTANCE.getLaunch();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH__ACTIONS = eINSTANCE.getLaunch_Actions();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.ActionImpl
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__OUTPUT = eINSTANCE.getAction_Output();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___RUN__LAUNCHCONTEXT = eINSTANCE.getAction__Run__LaunchContext();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ScrapImpl <em>Scrap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.ScrapImpl
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getScrap()
		 * @generated
		 */
		EClass SCRAP = eINSTANCE.getScrap();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRAP__PAGES = eINSTANCE.getScrap_Pages();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl <em>Convert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.ConvertImpl
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getConvert()
		 * @generated
		 */
		EClass CONVERT = eINSTANCE.getConvert();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERT__BOOK = eINSTANCE.getConvert_Book();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERT__PAGES = eINSTANCE.getConvert_Pages();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERT__FORMAT = eINSTANCE.getConvert_Format();

		/**
		 * The meta object literal for the '{@link ru.mkn.sovesti.screbok.slm.model.api.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.api.Format
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em>Launch Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mkn.sovesti.screbok.slm.model.LaunchContext
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getLaunchContext()
		 * @generated
		 */
		EDataType LAUNCH_CONTEXT = eINSTANCE.getLaunchContext();

		/**
		 * The meta object literal for the '<em>Core Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.CoreException
		 * @see ru.mkn.sovesti.screbok.slm.model.impl.SlmPackageImpl#getCoreException()
		 * @generated
		 */
		EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

	}

} //SlmPackage
