package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDispatcherIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDispatcher
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDispatcher
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship DispatcherOfBehaviors
 ****************************************************************************/


    /* Public Read accessor for role DispatcherOfBehaviors
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] getDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DispatcherOfBehaviors finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc findDispatcherOfBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DispatcherOfBehaviors finder predicate by name
     */
  public boolean hasDispatcherOfBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DispatcherOfBehaviors is related predicate
     */
  public boolean hasDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors) throws EAIException;


    /* Public DispatcherOfBehaviors read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc getDispatcherOfBehaviorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DispatcherOfBehaviors number access
     */
  public int numDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DispatcherOfBehaviors index access
     */
  public int indexOfDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors) throws EAIException;


    /* Public Write accessor for role DispatcherOfBehaviors
     * Double change propagation
     */
  public void addDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors) throws EAIException;



    /* Public Write accessor for role DispatcherOfBehaviors
     */
  public void removeDispatcherOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors) throws EAIException;



    /* Public ordered Write accessor for role DispatcherOfBehaviors
     */
  public void addDispatcherOfBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theRelativeDispatcherOfBehaviors) throws EAIException;

    /* Public ordered Write accessor for role DispatcherOfBehaviors
     */
  public void moveDispatcherOfBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theRelativeDispatcherOfBehaviors) throws EAIException;

    /* Public move to last Write accessor for role DispatcherOfBehaviors
     */
  public void moveDispatcherOfBehaviorsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theDispatcherOfBehaviors) throws EAIException;


/****************************************************************************
 *  Implementation of public interface for relationship DispatcherOwner
 ****************************************************************************/


     /* Public Read accessor for role DispatcherOwner
     * May do wild things with the identity of DispatcherOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc getDispatcherOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DispatcherOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc getDispatcherOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DispatcherOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc findDispatcherOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DispatcherOwner finder predicate by name
     */
  public boolean hasDispatcherOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DispatcherOwner is related predicate
     */
  public boolean hasDispatcherOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc theDispatcherOwner) throws EAIException;

    /* Public DispatcherOwner number access
     */
  public int numDispatcherOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DispatcherOwner index access
     */
  public int indexOfDispatcherOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc theDispatcherOwner) throws EAIException;


    /* Public Write accessor for role DispatcherOwner
     */
  public void setDispatcherOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc theDispatcherOwner) throws EAIException;





}
