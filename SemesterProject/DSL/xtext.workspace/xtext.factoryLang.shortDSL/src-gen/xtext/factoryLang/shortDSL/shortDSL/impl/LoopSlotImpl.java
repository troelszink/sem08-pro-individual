/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S;
import xtext.factoryLang.shortDSL.shortDSL.DiskSlotStateValueS;
import xtext.factoryLang.shortDSL.shortDSL.LoopSlot;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage;
import xtext.factoryLang.shortDSL.shortDSL.StatementS;
import xtext.factoryLang.shortDSL.shortDSL.VariableS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.LoopSlotImpl#getSlotVariable <em>Slot Variable</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.LoopSlotImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.LoopSlotImpl#getSlotState <em>Slot State</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.LoopSlotImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopSlotImpl extends StatementSImpl implements LoopSlot
{
  /**
   * The cached value of the '{@link #getSlotVariable() <em>Slot Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlotVariable()
   * @generated
   * @ordered
   */
  protected VariableS slotVariable;

  /**
   * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparisonOperator()
   * @generated
   * @ordered
   */
  protected static final COMPARISON_OPERATOR_S COMPARISON_OPERATOR_EDEFAULT = COMPARISON_OPERATOR_S.EQUAL;

  /**
   * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparisonOperator()
   * @generated
   * @ordered
   */
  protected COMPARISON_OPERATOR_S comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSlotState() <em>Slot State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlotState()
   * @generated
   * @ordered
   */
  protected DiskSlotStateValueS slotState;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<StatementS> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopSlotImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ShortDSLPackage.Literals.LOOP_SLOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableS getSlotVariable()
  {
    return slotVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlotVariable(VariableS newSlotVariable, NotificationChain msgs)
  {
    VariableS oldSlotVariable = slotVariable;
    slotVariable = newSlotVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE, oldSlotVariable, newSlotVariable);
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
  public void setSlotVariable(VariableS newSlotVariable)
  {
    if (newSlotVariable != slotVariable)
    {
      NotificationChain msgs = null;
      if (slotVariable != null)
        msgs = ((InternalEObject)slotVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE, null, msgs);
      if (newSlotVariable != null)
        msgs = ((InternalEObject)newSlotVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE, null, msgs);
      msgs = basicSetSlotVariable(newSlotVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE, newSlotVariable, newSlotVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public COMPARISON_OPERATOR_S getComparisonOperator()
  {
    return comparisonOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComparisonOperator(COMPARISON_OPERATOR_S newComparisonOperator)
  {
    COMPARISON_OPERATOR_S oldComparisonOperator = comparisonOperator;
    comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.LOOP_SLOT__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskSlotStateValueS getSlotState()
  {
    return slotState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlotState(DiskSlotStateValueS newSlotState, NotificationChain msgs)
  {
    DiskSlotStateValueS oldSlotState = slotState;
    slotState = newSlotState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShortDSLPackage.LOOP_SLOT__SLOT_STATE, oldSlotState, newSlotState);
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
  public void setSlotState(DiskSlotStateValueS newSlotState)
  {
    if (newSlotState != slotState)
    {
      NotificationChain msgs = null;
      if (slotState != null)
        msgs = ((InternalEObject)slotState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.LOOP_SLOT__SLOT_STATE, null, msgs);
      if (newSlotState != null)
        msgs = ((InternalEObject)newSlotState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.LOOP_SLOT__SLOT_STATE, null, msgs);
      msgs = basicSetSlotState(newSlotState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.LOOP_SLOT__SLOT_STATE, newSlotState, newSlotState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StatementS> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<StatementS>(StatementS.class, this, ShortDSLPackage.LOOP_SLOT__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE:
        return basicSetSlotVariable(null, msgs);
      case ShortDSLPackage.LOOP_SLOT__SLOT_STATE:
        return basicSetSlotState(null, msgs);
      case ShortDSLPackage.LOOP_SLOT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE:
        return getSlotVariable();
      case ShortDSLPackage.LOOP_SLOT__COMPARISON_OPERATOR:
        return getComparisonOperator();
      case ShortDSLPackage.LOOP_SLOT__SLOT_STATE:
        return getSlotState();
      case ShortDSLPackage.LOOP_SLOT__STATEMENTS:
        return getStatements();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE:
        setSlotVariable((VariableS)newValue);
        return;
      case ShortDSLPackage.LOOP_SLOT__COMPARISON_OPERATOR:
        setComparisonOperator((COMPARISON_OPERATOR_S)newValue);
        return;
      case ShortDSLPackage.LOOP_SLOT__SLOT_STATE:
        setSlotState((DiskSlotStateValueS)newValue);
        return;
      case ShortDSLPackage.LOOP_SLOT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends StatementS>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE:
        setSlotVariable((VariableS)null);
        return;
      case ShortDSLPackage.LOOP_SLOT__COMPARISON_OPERATOR:
        setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
        return;
      case ShortDSLPackage.LOOP_SLOT__SLOT_STATE:
        setSlotState((DiskSlotStateValueS)null);
        return;
      case ShortDSLPackage.LOOP_SLOT__STATEMENTS:
        getStatements().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ShortDSLPackage.LOOP_SLOT__SLOT_VARIABLE:
        return slotVariable != null;
      case ShortDSLPackage.LOOP_SLOT__COMPARISON_OPERATOR:
        return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
      case ShortDSLPackage.LOOP_SLOT__SLOT_STATE:
        return slotState != null;
      case ShortDSLPackage.LOOP_SLOT__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (comparisonOperator: ");
    result.append(comparisonOperator);
    result.append(')');
    return result.toString();
  }

} //LoopSlotImpl