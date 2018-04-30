package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitBidirectionalInteractionIfc
    extends     com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitBidirectionalInteraction
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitBidirectionalInteraction
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedReturns
 ****************************************************************************/


    /* Public Read accessor for role OwnedReturns
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc[] getOwnedReturns( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedReturns finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc findOwnedReturnsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedReturns finder predicate by name
     */
  public boolean hasOwnedReturnsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedReturns is related predicate
     */
  public boolean hasOwnedReturns( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns) throws EAIException;


    /* Public OwnedReturns read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc getOwnedReturnsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedReturns number access
     */
  public int numOwnedReturns( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedReturns index access
     */
  public int indexOfOwnedReturns( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns) throws EAIException;


    /* Public Write accessor for role OwnedReturns
     * Double change propagation
     */
  public void addOwnedReturns( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns) throws EAIException;



    /* Public Write accessor for role OwnedReturns
     */
  public void removeOwnedReturns( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns) throws EAIException;



    /* Public ordered Write accessor for role OwnedReturns
     */
  public void addOwnedReturnsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theRelativeOwnedReturns) throws EAIException;

    /* Public ordered Write accessor for role OwnedReturns
     */
  public void moveOwnedReturnsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theRelativeOwnedReturns) throws EAIException;

    /* Public move to last Write accessor for role OwnedReturns
     */
  public void moveOwnedReturnsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc theOwnedReturns) throws EAIException;




}
