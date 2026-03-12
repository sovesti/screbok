/**
 */
package ru.mkn.sovesti.screbok.slm.model.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.mkn.sovesti.screbok.dsm.model.meta.DsmPackage;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;
import ru.mkn.sovesti.screbok.slm.model.LaunchContext;
import ru.mkn.sovesti.screbok.slm.model.api.Action;
import ru.mkn.sovesti.screbok.slm.model.api.Convert;
import ru.mkn.sovesti.screbok.slm.model.api.Format;
import ru.mkn.sovesti.screbok.slm.model.api.Launch;
import ru.mkn.sovesti.screbok.slm.model.api.Scrap;
import ru.mkn.sovesti.screbok.slm.model.meta.SlmFactory;
import ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlmPackageImpl extends EPackageImpl implements SlmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType launchContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coreExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SlmPackageImpl() {
		super(eNS_URI, SlmFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SlmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SlmPackage init() {
		if (isInited) return (SlmPackage)EPackage.Registry.INSTANCE.getEPackage(SlmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSlmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SlmPackageImpl theSlmPackage = registeredSlmPackage instanceof SlmPackageImpl ? (SlmPackageImpl)registeredSlmPackage : new SlmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DsmPackage.eINSTANCE.eClass();
		MlmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSlmPackage.createPackageContents();

		// Initialize created meta-data
		theSlmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSlmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SlmPackage.eNS_URI, theSlmPackage);
		return theSlmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaunch() {
		return launchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLaunch_Actions() {
		return (EReference)launchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Output() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__Run__LaunchContext() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScrap() {
		return scrapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScrap_Pages() {
		return (EReference)scrapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConvert() {
		return convertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConvert_Book() {
		return (EReference)convertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConvert_Pages() {
		return (EReference)convertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConvert_Format() {
		return (EAttribute)convertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormat() {
		return formatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaunchContext() {
		return launchContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoreException() {
		return coreExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlmFactory getSlmFactory() {
		return (SlmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		launchEClass = createEClass(LAUNCH);
		createEReference(launchEClass, LAUNCH__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__OUTPUT);
		createEOperation(actionEClass, ACTION___RUN__LAUNCHCONTEXT);

		scrapEClass = createEClass(SCRAP);
		createEReference(scrapEClass, SCRAP__PAGES);

		convertEClass = createEClass(CONVERT);
		createEReference(convertEClass, CONVERT__BOOK);
		createEReference(convertEClass, CONVERT__PAGES);
		createEAttribute(convertEClass, CONVERT__FORMAT);

		// Create enums
		formatEEnum = createEEnum(FORMAT);

		// Create data types
		launchContextEDataType = createEDataType(LAUNCH_CONTEXT);
		coreExceptionEDataType = createEDataType(CORE_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DsmPackage theDsmPackage = (DsmPackage)EPackage.Registry.INSTANCE.getEPackage(DsmPackage.eNS_URI);
		MlmPackage theMlmPackage = (MlmPackage)EPackage.Registry.INSTANCE.getEPackage(MlmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theDsmPackage.getNamed());
		scrapEClass.getESuperTypes().add(this.getAction());
		convertEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(launchEClass, Launch.class, "Launch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLaunch_Actions(), this.getAction(), null, "actions", null, 0, -1, Launch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Output(), ecorePackage.getEString(), "output", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAction__Run__LaunchContext(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLaunchContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCoreException());

		initEClass(scrapEClass, Scrap.class, "Scrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScrap_Pages(), theMlmPackage.getSitePage(), null, "pages", null, 0, -1, Scrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convertEClass, Convert.class, "Convert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvert_Book(), theDsmPackage.getBook(), null, "book", null, 0, 1, Convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConvert_Pages(), theMlmPackage.getSitePage(), null, "pages", null, 0, -1, Convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConvert_Format(), this.getFormat(), "format", null, 0, 1, Convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(formatEEnum, Format.class, "Format");
		addEEnumLiteral(formatEEnum, Format.MARKDOWN);

		// Initialize data types
		initEDataType(launchContextEDataType, LaunchContext.class, "LaunchContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coreExceptionEDataType, CoreException.class, "CoreException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SlmPackageImpl
