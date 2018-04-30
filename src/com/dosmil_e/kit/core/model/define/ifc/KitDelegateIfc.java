package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDelegateIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDelegate
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDelegate
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship DelegateOf
 ****************************************************************************/


    /* Public Read accessor for role DelegateOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DelegateOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegateOf finder predicate by name
     */
  public boolean hasDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegateOf is related predicate
     */
  public boolean hasDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;


    /* Public DelegateOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegateOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DelegateOf number access
     */
  public int numDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegateOf index access
     */
  public int indexOfDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;


    /* Public Write accessor for role DelegateOf
     * Double change propagation
     */
  public void addDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;



    /* Public Write accessor for role DelegateOf
     */
  public void removeDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;



    /* Public ordered Write accessor for role DelegateOf
     */
  public void addDelegateOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException;

    /* Public ordered Write accessor for role DelegateOf
     */
  public void moveDelegateOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException;

    /* Public move to last Write accessor for role DelegateOf
     */
  public void moveDelegateOfToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;




}
