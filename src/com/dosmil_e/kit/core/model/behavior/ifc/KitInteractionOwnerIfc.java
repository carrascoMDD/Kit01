package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitInteractionOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitInteractionOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitInteractionOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedInteractions
 ****************************************************************************/


    /* Public Read accessor for role OwnedInteractions
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] getOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedInteractions finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc findOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInteractions finder predicate by name
     */
  public boolean hasOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInteractions is related predicate
     */
  public boolean hasOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;


    /* Public OwnedInteractions read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc getOwnedInteractionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedInteractions number access
     */
  public int numOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedInteractions index access
     */
  public int indexOfOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;


    /* Public Write accessor for role OwnedInteractions
     * Double change propagation
     */
  public void addOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;



    /* Public Write accessor for role OwnedInteractions
     */
  public void removeOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;



    /* Public ordered Write accessor for role OwnedInteractions
     */
  public void addOwnedInteractionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException;

    /* Public ordered Write accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException;

    /* Public move to last Write accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;




}
