package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitHandlerOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitHandlerOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitHandlerOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedHandlers
 ****************************************************************************/


    /* Public Read accessor for role OwnedHandlers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[] getOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedHandlers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc findOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers finder predicate by name
     */
  public boolean hasOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers is related predicate
     */
  public boolean hasOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public OwnedHandlers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getOwnedHandlersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedHandlers number access
     */
  public int numOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedHandlers index access
     */
  public int indexOfOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public Write accessor for role OwnedHandlers
     * Double change propagation
     */
  public void addOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public Write accessor for role OwnedHandlers
     */
  public void removeOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void addOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public move to last Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;




}
