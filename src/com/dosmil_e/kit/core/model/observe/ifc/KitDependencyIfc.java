package com.dosmil_e.kit.core.model.observe.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDependencyIfc
    extends     com.dosmil_e.kit.core.model.observe.ifc.KitActivationIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitActivationIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDependency
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute Path
 ****************************************************************************/


    /* Public Read accessor for attribute Path
     */
  public java.lang.String getPath( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Path
     */
  public void setPath( EAIMMCtxtIfc theCtxt, java.lang.String thePath) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute Schedule
 ****************************************************************************/


    /* Public Read accessor for attribute Schedule
     */
  public java.lang.String getSchedule( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Schedule
     */
  public void setSchedule( EAIMMCtxtIfc theCtxt, java.lang.String theSchedule) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of KitDependency
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship DependencyOwner
 ****************************************************************************/


     /* Public Read accessor for role DependencyOwner
     * May do wild things with the identity of DependencyOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc getDependencyOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DependencyOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc getDependencyOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DependencyOwner finder by name
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc findDependencyOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DependencyOwner finder predicate by name
     */
  public boolean hasDependencyOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DependencyOwner is related predicate
     */
  public boolean hasDependencyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc theDependencyOwner) throws EAIException;

    /* Public DependencyOwner number access
     */
  public int numDependencyOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DependencyOwner index access
     */
  public int indexOfDependencyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc theDependencyOwner) throws EAIException;


    /* Public Write accessor for role DependencyOwner
     */
  public void setDependencyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc theDependencyOwner) throws EAIException;





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




/****************************************************************************
 *  Implementation of public interface for relationship SourceOfAnnnotations
 ****************************************************************************/


    /* Public Read accessor for role SourceOfAnnnotations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] getSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SourceOfAnnnotations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc findSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations finder predicate by name
     */
  public boolean hasSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations is related predicate
     */
  public boolean hasSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;

    /* Public SourceOfAnnnotations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc getSourceOfAnnnotationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SourceOfAnnnotations number access
     */
  public int numSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SourceOfAnnnotations index access
     */
  public int indexOfSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;


    /* Public Write accessor for role SourceOfAnnnotations
     * Double change propagation
     */
  public void addSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public Write accessor for role SourceOfAnnnotations
     */
  public void removeSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void addSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public move to last Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;





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
