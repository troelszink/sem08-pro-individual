/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.ConditionS#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.ConditionS#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionS()
 * @model
 * @generated
 */
public interface ConditionS extends StatementS
{
  /**
   * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison Operator</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S
   * @see #setComparisonOperator(COMPARISON_OPERATOR_S)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionS_ComparisonOperator()
   * @model
   * @generated
   */
  COMPARISON_OPERATOR_S getComparisonOperator();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.ConditionS#getComparisonOperator <em>Comparison Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison Operator</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S
   * @see #getComparisonOperator()
   * @generated
   */
  void setComparisonOperator(COMPARISON_OPERATOR_S value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.shortDSL.shortDSL.StatementS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionS_Statements()
   * @model containment="true"
   * @generated
   */
  EList<StatementS> getStatements();

} // ConditionS
