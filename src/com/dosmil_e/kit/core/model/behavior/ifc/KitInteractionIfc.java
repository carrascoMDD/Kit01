package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitInteractionIfc
    extends     com.dosmil_e.kit.core.model.behavior.ifc.KitActivationIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitInteraction
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitInteraction
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedStimuli
 ****************************************************************************/


    /* Public Read accessor for role OwnedStimuli
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc[] getOwnedStimuli( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedStimuli finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc findOwnedStimuliNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStimuli finder predicate by name
     */
  public boolean hasOwnedStimuliNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStimuli is related predicate
     */
  public boolean hasOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException;


    /* Public OwnedStimuli read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc getOwnedStimuliAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedStimuli number access
     */
  public int numOwnedStimuli( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedStimuli index access
     */
  public int indexOfOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException;


    /* Public Write accessor for role OwnedStimuli
     * Double change propagation
     */
  public void addOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException;



    /* Public Write accessor for role OwnedStimuli
     */
  public void removeOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException;



    /* Public ordered Write accessor for role OwnedStimuli
     */
  public void addOwnedStimuliBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theRelativeOwnedStimuli) throws EAIException;

    /* Public ordered Write accessor for role OwnedStimuli
     */
  public void moveOwnedStimuliBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theRelativeOwnedStimuli) throws EAIException;

    /* Public move to last Write accessor for role OwnedStimuli
     */
  public void moveOwnedStimuliToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException;


/****************************************************************************
 *  Implementation of public interface for relationship InteractionOwner
 ****************************************************************************/


     /* Public Read accessor for role InteractionOwner
     * May do wild things with the identity of InteractionOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc getInteractionOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InteractionOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc getInteractionOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InteractionOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc findInteractionOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InteractionOwner finder predicate by name
     */
  public boolean hasInteractionOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InteractionOwner is related predicate
     */
  public boolean hasInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException;

    /* Public InteractionOwner number access
     */
  public int numInteractionOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InteractionOwner index access
     */
  public int indexOfInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException;


    /* Public Write accessor for role InteractionOwner
     */
  public void setInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException;





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
