package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDelegationIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDelegation
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDelegation
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship DelegationOwner
 ****************************************************************************/


     /* Public Read accessor for role DelegationOwner
     * May do wild things with the identity of DelegationOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc getDelegationOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegationOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc getDelegationOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DelegationOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc findDelegationOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegationOwner finder predicate by name
     */
  public boolean hasDelegationOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegationOwner is related predicate
     */
  public boolean hasDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException;

    /* Public DelegationOwner number access
     */
  public int numDelegationOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegationOwner index access
     */
  public int indexOfDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException;


    /* Public Write accessor for role DelegationOwner
     */
  public void setDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Delegator
 ****************************************************************************/


     /* Public Read accessor for role Delegator
     * May do wild things with the identity of Delegator
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc getDelegator( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Delegator read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc getDelegatorAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Delegator finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc findDelegatorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Delegator finder predicate by name
     */
  public boolean hasDelegatorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Delegator is related predicate
     */
  public boolean hasDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException;

    /* Public Delegator number access
     */
  public int numDelegator( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Delegator index access
     */
  public int indexOfDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException;


    /* Public Write accessor for role Delegator
     */
  public void setDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Delegate
 ****************************************************************************/


     /* Public Read accessor for role Delegate
     * May do wild things with the identity of Delegate
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc getDelegate( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Delegate read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc getDelegateAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Delegate finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc findDelegateNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Delegate finder predicate by name
     */
  public boolean hasDelegateNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Delegate is related predicate
     */
  public boolean hasDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException;

    /* Public Delegate number access
     */
  public int numDelegate( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Delegate index access
     */
  public int indexOfDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException;


    /* Public Write accessor for role Delegate
     */
  public void setDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship Transformations
 ****************************************************************************/


    /* Public Read accessor for role Transformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] getTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Transformations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Transformations finder predicate by name
     */
  public boolean hasTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Transformations is related predicate
     */
  public boolean hasTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;


    /* Public Transformations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Transformations number access
     */
  public int numTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Transformations index access
     */
  public int indexOfTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;


    /* Public Write accessor for role Transformations
     * Double change propagation
     */
  public void addTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;



    /* Public Write accessor for role Transformations
     */
  public void removeTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;



    /* Public ordered Write accessor for role Transformations
     */
  public void addTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException;

    /* Public ordered Write accessor for role Transformations
     */
  public void moveTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException;

    /* Public move to last Write accessor for role Transformations
     */
  public void moveTransformationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;




}
