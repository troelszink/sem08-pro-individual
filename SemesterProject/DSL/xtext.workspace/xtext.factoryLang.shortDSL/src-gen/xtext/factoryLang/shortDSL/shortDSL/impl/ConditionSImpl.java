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
import xtext.factoryLang.shortDSL.shortDSL.ConditionS;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage;
import xtext.factoryLang.shortDSL.shortDSL.StatementS;
import xtext.factoryLang.shortDSL.shortDSL.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.ConditionSImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.ConditionSImpl#getValue <em>Value</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.ConditionSImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionSImpl extends StatementSImpl implements ConditionS
{
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

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
  protected ConditionSImpl()
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
    return ShortDSLPackage.Literals.CONDITION_S;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.CONDITION_S__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShortDSLPackage.CONDITION_S__VALUE, oldValue, newValue);
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
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.CONDITION_S__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShortDSLPackage.CONDITION_S__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.CONDITION_S__VALUE, newValue, newValue));
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
      statements = new EObjectContainmentEList<StatementS>(StatementS.class, this, ShortDSLPackage.CONDITION_S__STATEMENTS);
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
      case ShortDSLPackage.CONDITION_S__VALUE:
        return basicSetValue(null, msgs);
      case ShortDSLPackage.CONDITION_S__STATEMENTS:
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
      case ShortDSLPackage.CONDITION_S__COMPARISON_OPERATOR:
        return getComparisonOperator();
      case ShortDSLPackage.CONDITION_S__VALUE:
        return getValue();
      case ShortDSLPackage.CONDITION_S__STATEMENTS:
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
      case ShortDSLPackage.CONDITION_S__COMPARISON_OPERATOR:
        setComparisonOperator((COMPARISON_OPERATOR_S)newValue);
        return;
      case ShortDSLPackage.CONDITION_S__VALUE:
        setValue((Value)newValue);
        return;
      case ShortDSLPackage.CONDITION_S__STATEMENTS:
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
      case ShortDSLPackage.CONDITION_S__COMPARISON_OPERATOR:
        setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
        return;
      case ShortDSLPackage.CONDITION_S__VALUE:
        setValue((Value)null);
        return;
      case ShortDSLPackage.CONDITION_S__STATEMENTS:
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
      case ShortDSLPackage.CONDITION_S__COMPARISON_OPERATOR:
        return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
      case ShortDSLPackage.CONDITION_S__VALUE:
        return value != null;
      case ShortDSLPackage.CONDITION_S__STATEMENTS:
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

} //ConditionSImpl
