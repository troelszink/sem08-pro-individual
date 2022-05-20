/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COMPARISON OPERATOR S</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getCOMPARISON_OPERATOR_S()
 * @model
 * @generated
 */
public enum COMPARISON_OPERATOR_S implements Enumerator
{
  /**
   * The '<em><b>EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(0, "EQUAL", "="),

  /**
   * The '<em><b>LESS THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN(1, "LESS_THAN", "<"),

  /**
   * The '<em><b>GREATER THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN(2, "GREATER_THAN", ">"),

  /**
   * The '<em><b>NOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_VALUE
   * @generated
   * @ordered
   */
  NOT(3, "NOT", "!=");

  /**
   * The '<em><b>EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model literal="="
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 0;

  /**
   * The '<em><b>LESS THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN
   * @model literal="&lt;"
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_VALUE = 1;

  /**
   * The '<em><b>GREATER THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN
   * @model literal="&gt;"
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_VALUE = 2;

  /**
   * The '<em><b>NOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT
   * @model literal="!="
   * @generated
   * @ordered
   */
  public static final int NOT_VALUE = 3;

  /**
   * An array of all the '<em><b>COMPARISON OPERATOR S</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final COMPARISON_OPERATOR_S[] VALUES_ARRAY =
    new COMPARISON_OPERATOR_S[]
    {
      EQUAL,
      LESS_THAN,
      GREATER_THAN,
      NOT,
    };

  /**
   * A public read-only list of all the '<em><b>COMPARISON OPERATOR S</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<COMPARISON_OPERATOR_S> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>COMPARISON OPERATOR S</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR_S get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARISON_OPERATOR_S result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARISON OPERATOR S</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR_S getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARISON_OPERATOR_S result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARISON OPERATOR S</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR_S get(int value)
  {
    switch (value)
    {
      case EQUAL_VALUE: return EQUAL;
      case LESS_THAN_VALUE: return LESS_THAN;
      case GREATER_THAN_VALUE: return GREATER_THAN;
      case NOT_VALUE: return NOT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private COMPARISON_OPERATOR_S(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //COMPARISON_OPERATOR_S