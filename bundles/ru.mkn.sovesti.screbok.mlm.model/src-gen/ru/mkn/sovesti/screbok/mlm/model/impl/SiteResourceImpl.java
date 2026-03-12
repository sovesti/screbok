/**
 */
package ru.mkn.sovesti.screbok.mlm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ru.mkn.sovesti.screbok.mlm.model.api.Site;
import ru.mkn.sovesti.screbok.mlm.model.api.SiteResource;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.impl.SiteResourceImpl#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SiteResourceImpl extends LocatedImpl implements SiteResource {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected Site site;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlmPackage.Literals.SITE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Site getSite() {
		if (site != null && site.eIsProxy()) {
			InternalEObject oldSite = (InternalEObject)site;
			site = (Site)eResolveProxy(oldSite);
			if (site != oldSite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MlmPackage.SITE_RESOURCE__SITE, oldSite, site));
			}
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(Site newSite, NotificationChain msgs) {
		Site oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlmPackage.SITE_RESOURCE__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSite(Site newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, MlmPackage.SITE__RESOURCES, Site.class, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, MlmPackage.SITE__RESOURCES, Site.class, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlmPackage.SITE_RESOURCE__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlmPackage.SITE_RESOURCE__SITE:
				if (site != null)
					msgs = ((InternalEObject)site).eInverseRemove(this, MlmPackage.SITE__RESOURCES, Site.class, msgs);
				return basicSetSite((Site)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlmPackage.SITE_RESOURCE__SITE:
				return basicSetSite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlmPackage.SITE_RESOURCE__SITE:
				if (resolve) return getSite();
				return basicGetSite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MlmPackage.SITE_RESOURCE__SITE:
				setSite((Site)newValue);
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
			case MlmPackage.SITE_RESOURCE__SITE:
				setSite((Site)null);
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
			case MlmPackage.SITE_RESOURCE__SITE:
				return site != null;
		}
		return super.eIsSet(featureID);
	}

} //SiteResourceImpl
