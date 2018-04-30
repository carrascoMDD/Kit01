package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractStructuredJavaClassIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitNativeResourceIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuredTypeIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractStructuredJavaClass
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractStructuredJavaClass
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship InfoTypeOwner
 ****************************************************************************/


     /* Public Read accessor for role InfoTypeOwner
     * May do wild things with the identity of InfoTypeOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc getInfoTypeOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InfoTypeOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc getInfoTypeOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InfoTypeOwner finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc findInfoTypeOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InfoTypeOwner finder predicate by name
     */
  public boolean hasInfoTypeOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InfoTypeOwner is related predicate
     */
  public boolean hasInfoTypeOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc theInfoTypeOwner) throws EAIException;

    /* Public InfoTypeOwner number access
     */
  public int numInfoTypeOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InfoTypeOwner index access
     */
  public int indexOfInfoTypeOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc theInfoTypeOwner) throws EAIException;


    /* Public Write accessor for role InfoTypeOwner
     */
  public void setInfoTypeOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc theInfoTypeOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship OwnedDispatchers
 ****************************************************************************/


    /* Public Read accessor for role OwnedDispatchers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[] getOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedDispatchers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc findOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDispatchers finder predicate by name
     */
  public boolean hasOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDispatchers is related predicate
     */
  public boolean hasOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;


    /* Public OwnedDispatchers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc getOwnedDispatchersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedDispatchers number access
     */
  public int numOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedDispatchers index access
     */
  public int indexOfOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;


    /* Public Write accessor for role OwnedDispatchers
     * Double change propagation
     */
  public void addOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;



    /* Public Write accessor for role OwnedDispatchers
     */
  public void removeOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;



    /* Public ordered Write accessor for role OwnedDispatchers
     */
  public void addOwnedDispatchersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException;

    /* Public ordered Write accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException;

    /* Public move to last Write accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedInfoTypes
 ****************************************************************************/


    /* Public Read accessor for role OwnedInfoTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] getOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedInfoTypes finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc findOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInfoTypes finder predicate by name
     */
  public boolean hasOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInfoTypes is related predicate
     */
  public boolean hasOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;


    /* Public OwnedInfoTypes read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc getOwnedInfoTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedInfoTypes number access
     */
  public int numOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedInfoTypes index access
     */
  public int indexOfOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;


    /* Public Write accessor for role OwnedInfoTypes
     * Double change propagation
     */
  public void addOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;



    /* Public Write accessor for role OwnedInfoTypes
     */
  public void removeOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;



    /* Public ordered Write accessor for role OwnedInfoTypes
     */
  public void addOwnedInfoTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException;

    /* Public ordered Write accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException;

    /* Public move to last Write accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedStructuralFeatures
 ****************************************************************************/


    /* Public Read accessor for role OwnedStructuralFeatures
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] getOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedStructuralFeatures finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc findOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStructuralFeatures finder predicate by name
     */
  public boolean hasOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStructuralFeatures is related predicate
     */
  public boolean hasOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;


    /* Public OwnedStructuralFeatures read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getOwnedStructuralFeaturesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedStructuralFeatures number access
     */
  public int numOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedStructuralFeatures index access
     */
  public int indexOfOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;


    /* Public Write accessor for role OwnedStructuralFeatures
     * Double change propagation
     */
  public void addOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;



    /* Public Write accessor for role OwnedStructuralFeatures
     */
  public void removeOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;



    /* Public ordered Write accessor for role OwnedStructuralFeatures
     */
  public void addOwnedStructuralFeaturesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException;

    /* Public ordered Write accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException;

    /* Public move to last Write accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;




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
