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
 * A representation of the literals of the enumeration '<em><b>TIME UNIT S</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getTIME_UNIT_S()
 * @model
 * @generated
 */
public enum TIME_UNIT_S implements Enumerator
{
  /**
   * The '<em><b>SECOND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SECOND_VALUE
   * @generated
   * @ordered
   */
  SECOND(0, "SECOND", "s"),

  /**
   * The '<em><b>MINUTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUTE_VALUE
   * @generated
   * @ordered
   */
  MINUTE(1, "MINUTE", "m"),

  /**
   * The '<em><b>HOUR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUR_VALUE
   * @generated
   * @ordered
   */
  HOUR(2, "HOUR", "h");

  /**
   * The '<em><b>SECOND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SECOND
   * @model literal="s"
   * @generated
   * @ordered
   */
  public static final int SECOND_VALUE = 0;

  /**
   * The '<em><b>MINUTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUTE
   * @model literal="m"
   * @generated
   * @ordered
   */
  public static final int MINUTE_VALUE = 1;

  /**
   * The '<em><b>HOUR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUR
   * @model literal="h"
   * @generated
   * @ordered
   */
  public static final int HOUR_VALUE = 2;

  /**
   * An array of all the '<em><b>TIME UNIT S</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TIME_UNIT_S[] VALUES_ARRAY =
    new TIME_UNIT_S[]
    {
      SECOND,
      MINUTE,
      HOUR,
    };

  /**
   * A public read-only list of all the '<em><b>TIME UNIT S</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TIME_UNIT_S> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TIME UNIT S</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME_UNIT_S get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TIME_UNIT_S result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TIME UNIT S</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME_UNIT_S getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TIME_UNIT_S result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TIME UNIT S</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME_UNIT_S get(int value)
  {
    switch (value)
    {
      case SECOND_VALUE: return SECOND;
      case MINUTE_VALUE: return MINUTE;
      case HOUR_VALUE: return HOUR;
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
  private TIME_UNIT_S(int value, String name, String literal)
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
  
} //TIME_UNIT_S