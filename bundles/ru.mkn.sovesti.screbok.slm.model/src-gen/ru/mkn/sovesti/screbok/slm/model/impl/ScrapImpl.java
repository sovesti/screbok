/**
 */
package ru.mkn.sovesti.screbok.slm.model.impl;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.slm.model.LaunchContext;
import ru.mkn.sovesti.screbok.slm.model.ScrappingRun;
import ru.mkn.sovesti.screbok.slm.model.api.Scrap;

import ru.mkn.sovesti.screbok.slm.model.meta.SlmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.slm.model.impl.ScrapImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrapImpl extends ActionImpl implements Scrap {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<SitePage> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlmPackage.Literals.SCRAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SitePage> getPages() {
		if (pages == null) {
			pages = new EObjectResolvingEList<SitePage>(SitePage.class, this, SlmPackage.SCRAP__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlmPackage.SCRAP__PAGES:
				return getPages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlmPackage.SCRAP__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends SitePage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlmPackage.SCRAP__PAGES:
				getPages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlmPackage.SCRAP__PAGES:
				return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @generated not
	 */
	@Override
	public void run(LaunchContext context) throws CoreException {
		new ScrappingRun(this, context).perform();
	}

} //ScrapImpl
