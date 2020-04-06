/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Structure Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStructureStruct#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureStruct()
 * @model
 * @generated
 */
public interface MessageStructureStruct extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link nl.sudohenk.xtext.stateDef.MessageStructureDatatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStructureStruct_Values()
   * @model containment="true"
   * @generated
   */
  EList<MessageStructureDatatype> getValues();

} // MessageStructureStruct