package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitBehaviorOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitBehaviorOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitBehaviorOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedBehaviors
 ****************************************************************************/


    /* Public Read accessor for role OwnedBehaviors
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[] getOwnedBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedBehaviors finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc findOwnedBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedBehaviors finder predicate by name
     */
  public boolean hasOwnedBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedBehaviors is related predicate
     */
  public boolean hasOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException;


    /* Public OwnedBehaviors read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc getOwnedBehaviorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedBehaviors number access
     */
  public int numOwnedBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedBehaviors index access
     */
  public int indexOfOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException;


    /* Public Write accessor for role OwnedBehaviors
     * Double change propagation
     */
  public void addOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException;



    /* Public Write accessor for role OwnedBehaviors
     */
  public void removeOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException;



    /* Public ordered Write accessor for role OwnedBehaviors
     */
  public void addOwnedBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theRelativeOwnedBehaviors) throws EAIException;

    /* Public ordered Write accessor for role OwnedBehaviors
     */
  public void moveOwnedBehaviorsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theRelativeOwnedBehaviors) throws EAIException;

    /* Public move to last Write accessor for role OwnedBehaviors
     */
  public void moveOwnedBehaviorsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException;




}
