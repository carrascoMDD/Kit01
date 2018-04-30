package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDelegationOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDelegationOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDelegationOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedDelegations
 ****************************************************************************/


    /* Public Read accessor for role OwnedDelegations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getOwnedDelegations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedDelegations finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findOwnedDelegationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDelegations finder predicate by name
     */
  public boolean hasOwnedDelegationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDelegations is related predicate
     */
  public boolean hasOwnedDelegations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations) throws EAIException;


    /* Public OwnedDelegations read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getOwnedDelegationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedDelegations number access
     */
  public int numOwnedDelegations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedDelegations index access
     */
  public int indexOfOwnedDelegations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations) throws EAIException;


    /* Public Write accessor for role OwnedDelegations
     * Double change propagation
     */
  public void addOwnedDelegations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations) throws EAIException;



    /* Public Write accessor for role OwnedDelegations
     */
  public void removeOwnedDelegations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations) throws EAIException;



    /* Public ordered Write accessor for role OwnedDelegations
     */
  public void addOwnedDelegationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeOwnedDelegations) throws EAIException;

    /* Public ordered Write accessor for role OwnedDelegations
     */
  public void moveOwnedDelegationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeOwnedDelegations) throws EAIException;

    /* Public move to last Write accessor for role OwnedDelegations
     */
  public void moveOwnedDelegationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theOwnedDelegations) throws EAIException;




}
