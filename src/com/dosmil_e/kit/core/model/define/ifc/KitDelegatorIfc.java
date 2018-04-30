package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDelegatorIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDelegator
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDelegator
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship DelegatorOf
 ****************************************************************************/


    /* Public Read accessor for role DelegatorOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DelegatorOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegatorOf finder predicate by name
     */
  public boolean hasDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegatorOf is related predicate
     */
  public boolean hasDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;


    /* Public DelegatorOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegatorOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DelegatorOf number access
     */
  public int numDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegatorOf index access
     */
  public int indexOfDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;


    /* Public Write accessor for role DelegatorOf
     * Double change propagation
     */
  public void addDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;



    /* Public Write accessor for role DelegatorOf
     */
  public void removeDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;



    /* Public ordered Write accessor for role DelegatorOf
     */
  public void addDelegatorOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException;

    /* Public ordered Write accessor for role DelegatorOf
     */
  public void moveDelegatorOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException;

    /* Public move to last Write accessor for role DelegatorOf
     */
  public void moveDelegatorOfToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;




}
