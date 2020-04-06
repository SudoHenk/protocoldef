/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Structure Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getHexVal <em>Hex Val</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getEnumVal <em>Enum Val</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getStructVal <em>Struct Val</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getArrayVal <em>Array Val</em>}</li>
 * </ul>
 *
 * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureDatatype()
 * @model
 * @generated
 */
public interface MessageStructureDatatype extends EObject
{
  /**
   * Returns the value of the '<em><b>Hex Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hex Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hex Val</em>' attribute.
   * @see #setHexVal(String)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureDatatype_HexVal()
   * @model
   * @generated
   */
  String getHexVal();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getHexVal <em>Hex Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hex Val</em>' attribute.
   * @see #getHexVal()
   * @generated
   */
  void setHexVal(String value);

  /**
   * Returns the value of the '<em><b>Enum Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Val</em>' attribute.
   * @see #setEnumVal(String)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureDatatype_EnumVal()
   * @model
   * @generated
   */
  String getEnumVal();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getEnumVal <em>Enum Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Val</em>' attribute.
   * @see #getEnumVal()
   * @generated
   */
  void setEnumVal(String value);

  /**
   * Returns the value of the '<em><b>Struct Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Val</em>' containment reference.
   * @see #setStructVal(MessageStructureStruct)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureDatatype_StructVal()
   * @model containment="true"
   * @generated
   */
  MessageStructureStruct getStructVal();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype#getStructVal <em>Struct Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Val</em>' containment reference.
   * @see #getStructVal()
   * @generated
   */
  void setStructVal(MessageStructureStruct value);

  /**
   * Returns the value of the '<em><b>Array Val</b></em>' containment reference list.
   * The list contents are of type {@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Val</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Val</em>' containment reference list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureDatatype_ArrayVal()
   * @model containment="true"
   * @generated
   */
  EList<MessageStructureDatatype> getArrayVal();

} // MessageStructureDatatype
