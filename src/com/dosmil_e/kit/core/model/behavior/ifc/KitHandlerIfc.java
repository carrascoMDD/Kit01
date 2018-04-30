package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitHandlerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitHandler
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitHandler
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship HandlerOwner
 ****************************************************************************/


     /* Public Read accessor for role HandlerOwner
     * May do wild things with the identity of HandlerOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc getHandlerOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public HandlerOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc getHandlerOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public HandlerOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc findHandlerOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public HandlerOwner finder predicate by name
     */
  public boolean hasHandlerOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public HandlerOwner is related predicate
     */
  public boolean hasHandlerOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc theHandlerOwner) throws EAIException;

    /* Public HandlerOwner number access
     */
  public int numHandlerOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public HandlerOwner index access
     */
  public int indexOfHandlerOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc theHandlerOwner) throws EAIException;


    /* Public Write accessor for role HandlerOwner
     */
  public void setHandlerOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc theHandlerOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship HandlerOfBehaviors
 ****************************************************************************/


    /* Public Read accessor for role HandlerOfBehaviors
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] getHandlerOfBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public HandlerOfBehaviors finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc findHandlerOfBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public HandlerOfBehaviors finder predicate by name
     */
  public boolean hasHandlerOfBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public HandlerOfBehaviors is related predicate
     */
  public boolean hasHandlerOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors) throws EAIException;


    /* Public HandlerOfBehaviors read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc getHandlerOfBehaviorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public HandlerOfBehaviors number access
     */
  public int numHandlerOfBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public HandlerOfBehaviors index access
     */
  public int indexOfHandlerOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors) throws EAIException;


    /* Public Write accessor for role HandlerOfBehaviors
     * Double change propagation
     */
  public void addHandlerOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors) throws EAIException;



    /* Public Write accessor for role HandlerOfBehaviors
     */
  public void removeHandlerOfBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors) throws EAIException;



    /* Public ordered Write accessor for role HandlerOfBehaviors
     */
  public void addHandlerOfBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theRelativeHandlerOfBehaviors) throws EAIException;

    /* Public ordered Write accessor for role HandlerOfBehaviors
     */
  public void moveHandlerOfBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theRelativeHandlerOfBehaviors) throws EAIException;

    /* Public move to last Write accessor for role HandlerOfBehaviors
     */
  public void moveHandlerOfBehaviorsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc theHandlerOfBehaviors) throws EAIException;




}
