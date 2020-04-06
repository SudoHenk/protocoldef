/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef.impl;

import java.util.Collection;

import nl.sudohenk.xtext.stateDef.MessageEnum;
import nl.sudohenk.xtext.stateDef.StateDefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageEnumImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageEnumImpl#getNames <em>Names</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageEnumImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageEnumImpl extends MinimalEObjectImpl.Container implements MessageEnum
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<String> names;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Integer> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageEnumImpl()
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
    return StateDefPackage.Literals.MESSAGE_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_ENUM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNames()
  {
    if (names == null)
    {
      names = new EDataTypeEList<String>(String.class, this, StateDefPackage.MESSAGE_ENUM__NAMES);
    }
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<Integer>(Integer.class, this, StateDefPackage.MESSAGE_ENUM__VALUES);
    }
    return values;
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
      case StateDefPackage.MESSAGE_ENUM__NAME:
        return getName();
      case StateDefPackage.MESSAGE_ENUM__NAMES:
        return getNames();
      case StateDefPackage.MESSAGE_ENUM__VALUES:
        return getValues();
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
      case StateDefPackage.MESSAGE_ENUM__NAME:
        setName((String)newValue);
        return;
      case StateDefPackage.MESSAGE_ENUM__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends String>)newValue);
        return;
      case StateDefPackage.MESSAGE_ENUM__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Integer>)newValue);
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
      case StateDefPackage.MESSAGE_ENUM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateDefPackage.MESSAGE_ENUM__NAMES:
        getNames().clear();
        return;
      case StateDefPackage.MESSAGE_ENUM__VALUES:
        getValues().clear();
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
      case StateDefPackage.MESSAGE_ENUM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateDefPackage.MESSAGE_ENUM__NAMES:
        return names != null && !names.isEmpty();
      case StateDefPackage.MESSAGE_ENUM__VALUES:
        return values != null && !values.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", names: ");
    result.append(names);
    result.append(", values: ");
    result.append(values);
    result.append(')');
    return result.toString();
  }

} //MessageEnumImpl
