package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitBehaviorIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitBehavior
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitBehavior
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship BehaviorOwner
 ****************************************************************************/


     /* Public Read accessor for role BehaviorOwner
     * May do wild things with the identity of BehaviorOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc getBehaviorOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public BehaviorOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc getBehaviorOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public BehaviorOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc findBehaviorOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public BehaviorOwner finder predicate by name
     */
  public boolean hasBehaviorOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public BehaviorOwner is related predicate
     */
  public boolean hasBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException;

    /* Public BehaviorOwner number access
     */
  public int numBehaviorOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public BehaviorOwner index access
     */
  public int indexOfBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException;


    /* Public Write accessor for role BehaviorOwner
     */
  public void setBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException;





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
