/**
 */
package ru.mkn.sovesti.screbok.mlm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;

import ru.mkn.sovesti.screbok.mlm.model.meta.MlmPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link ru.mkn.sovesti.screbok.mlm.model.impl.SectionImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MarkupNodeImpl implements Section {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupNode title;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkupNode> children;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected Anchor anchor;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlmPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlmPackage.SECTION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupNode getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupNode newTitle, NotificationChain msgs) {
		MarkupNode oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlmPackage.SECTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupNode newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlmPackage.SECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlmPackage.SECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlmPackage.SECTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<MarkupNode>(MarkupNode.class, this, MlmPackage.SECTION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor getAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(Anchor newAnchor, NotificationChain msgs) {
		Anchor oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlmPackage.SECTION__ANCHOR, oldAnchor, newAnchor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchor(Anchor newAnchor) {
		if (newAnchor != anchor) {
			NotificationChain msgs = null;
			if (anchor != null)
				msgs = ((InternalEObject)anchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlmPackage.SECTION__ANCHOR, null, msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlmPackage.SECTION__ANCHOR, null, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlmPackage.SECTION__ANCHOR, newAnchor, newAnchor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlmPackage.SECTION__TITLE:
				return basicSetTitle(null, msgs);
			case MlmPackage.SECTION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case MlmPackage.SECTION__ANCHOR:
				return basicSetAnchor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlmPackage.SECTION__LEVEL:
				return getLevel();
			case MlmPackage.SECTION__TITLE:
				return getTitle();
			case MlmPackage.SECTION__CHILDREN:
				return getChildren();
			case MlmPackage.SECTION__ANCHOR:
				return getAnchor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MlmPackage.SECTION__LEVEL:
				setLevel((Integer)newValue);
				return;
			case MlmPackage.SECTION__TITLE:
				setTitle((MarkupNode)newValue);
				return;
			case MlmPackage.SECTION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MarkupNode>)newValue);
				return;
			case MlmPackage.SECTION__ANCHOR:
				setAnchor((Anchor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MlmPackage.SECTION__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case MlmPackage.SECTION__TITLE:
				setTitle((MarkupNode)null);
				return;
			case MlmPackage.SECTION__CHILDREN:
				getChildren().clear();
				return;
			case MlmPackage.SECTION__ANCHOR:
				setAnchor((Anchor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MlmPackage.SECTION__LEVEL:
				return level != LEVEL_EDEFAULT;
			case MlmPackage.SECTION__TITLE:
				return title != null;
			case MlmPackage.SECTION__CHILDREN:
				return children != null && !children.isEmpty();
			case MlmPackage.SECTION__ANCHOR:
				return anchor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}
} // SectionImpl
