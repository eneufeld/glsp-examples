/**
 * Copyright (c) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package org.eclipse.glsp.example.workflow.wfgraph.impl;

import org.eclipse.glsp.example.workflow.wfgraph.Icon;
import org.eclipse.glsp.example.workflow.wfgraph.WfgraphPackage;

import org.eclipse.glsp.graph.impl.GCompartmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.workflow.wfgraph.impl.IconImpl#getCommandId <em>Command Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IconImpl extends GCompartmentImpl implements Icon {
   /**
    * The default value of the '{@link #getCommandId() <em>Command Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCommandId()
    * @generated
    * @ordered
    */
   protected static final String COMMAND_ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getCommandId() <em>Command Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCommandId()
    * @generated
    * @ordered
    */
   protected String commandId = COMMAND_ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IconImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return WfgraphPackage.Literals.ICON;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String getCommandId() { return commandId; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setCommandId(String newCommandId) {
      String oldCommandId = commandId;
      commandId = newCommandId;
      if (eNotificationRequired())
         eNotify(
            new ENotificationImpl(this, Notification.SET, WfgraphPackage.ICON__COMMAND_ID, oldCommandId, commandId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case WfgraphPackage.ICON__COMMAND_ID:
            return getCommandId();
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
         case WfgraphPackage.ICON__COMMAND_ID:
            setCommandId((String) newValue);
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
         case WfgraphPackage.ICON__COMMAND_ID:
            setCommandId(COMMAND_ID_EDEFAULT);
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
         case WfgraphPackage.ICON__COMMAND_ID:
            return COMMAND_ID_EDEFAULT == null ? commandId != null : !COMMAND_ID_EDEFAULT.equals(commandId);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy())
         return super.toString();

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (commandId: ");
      result.append(commandId);
      result.append(')');
      return result.toString();
   }

} //IconImpl
