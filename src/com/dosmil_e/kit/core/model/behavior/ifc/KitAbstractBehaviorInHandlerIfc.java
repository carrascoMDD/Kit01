package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractBehaviorInHandlerIfc
    extends     com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractBehaviorInHandler
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractBehaviorInHandler
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Handler
 ****************************************************************************/


     /* Public Read accessor for role Handler
     * May do wild things with the identity of Handler
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getHandler( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Handler read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getHandlerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Handler finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc findHandlerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Handler finder predicate by name
     */
  public boolean hasHandlerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Handler is related predicate
     */
  public boolean hasHandler( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theHandler) throws EAIException;

    /* Public Handler number access
     */
  public int numHandler( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Handler index access
     */
  public int indexOfHandler( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theHandler) throws EAIException;


    /* Public Write accessor for role Handler
     */
  public void setHandler( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theHandler) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Dispatcher
 ****************************************************************************/


     /* Public Read accessor for role Dispatcher
     * May do wild things with the identity of Dispatcher
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc getDispatcher( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Dispatcher read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc getDispatcherAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Dispatcher finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc findDispatcherNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Dispatcher finder predicate by name
     */
  public boolean hasDispatcherNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Dispatcher is related predicate
     */
  public boolean hasDispatcher( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theDispatcher) throws EAIException;

    /* Public Dispatcher number access
     */
  public int numDispatcher( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Dispatcher index access
     */
  public int indexOfDispatcher( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theDispatcher) throws EAIException;


    /* Public Write accessor for role Dispatcher
     */
  public void setDispatcher( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theDispatcher) throws EAIException;





}
