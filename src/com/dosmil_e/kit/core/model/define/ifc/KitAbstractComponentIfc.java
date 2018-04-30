package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractComponentIfc
    extends     com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc,
    com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractComponent
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractComponent
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship ComponentOwner
 ****************************************************************************/


     /* Public Read accessor for role ComponentOwner
     * May do wild things with the identity of ComponentOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc getComponentOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ComponentOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc getComponentOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ComponentOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc findComponentOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ComponentOwner finder predicate by name
     */
  public boolean hasComponentOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ComponentOwner is related predicate
     */
  public boolean hasComponentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc theComponentOwner) throws EAIException;

    /* Public ComponentOwner number access
     */
  public int numComponentOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ComponentOwner index access
     */
  public int indexOfComponentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc theComponentOwner) throws EAIException;


    /* Public Write accessor for role ComponentOwner
     */
  public void setComponentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc theComponentOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship OwnedAssemblies
 ****************************************************************************/


    /* Public Read accessor for role OwnedAssemblies
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc[] getOwnedAssemblies( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedAssemblies finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc findOwnedAssembliesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedAssemblies finder predicate by name
     */
  public boolean hasOwnedAssembliesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedAssemblies is related predicate
     */
  public boolean hasOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;


    /* Public OwnedAssemblies read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc getOwnedAssembliesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedAssemblies number access
     */
  public int numOwnedAssemblies( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedAssemblies index access
     */
  public int indexOfOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;


    /* Public Write accessor for role OwnedAssemblies
     * Double change propagation
     */
  public void addOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;



    /* Public Write accessor for role OwnedAssemblies
     */
  public void removeOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;



    /* Public ordered Write accessor for role OwnedAssemblies
     */
  public void addOwnedAssembliesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theRelativeOwnedAssemblies) throws EAIException;

    /* Public ordered Write accessor for role OwnedAssemblies
     */
  public void moveOwnedAssembliesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theRelativeOwnedAssemblies) throws EAIException;

    /* Public move to last Write accessor for role OwnedAssemblies
     */
  public void moveOwnedAssembliesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;




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




/****************************************************************************
 *  Implementation of public interface for relationship OwnedDependencies
 ****************************************************************************/


    /* Public Read accessor for role OwnedDependencies
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc[] getOwnedDependencies( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedDependencies finder by name
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc findOwnedDependenciesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDependencies finder predicate by name
     */
  public boolean hasOwnedDependenciesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDependencies is related predicate
     */
  public boolean hasOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;


    /* Public OwnedDependencies read accessor by index
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc getOwnedDependenciesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedDependencies number access
     */
  public int numOwnedDependencies( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedDependencies index access
     */
  public int indexOfOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;


    /* Public Write accessor for role OwnedDependencies
     * Double change propagation
     */
  public void addOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;



    /* Public Write accessor for role OwnedDependencies
     */
  public void removeOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;



    /* Public ordered Write accessor for role OwnedDependencies
     */
  public void addOwnedDependenciesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theRelativeOwnedDependencies) throws EAIException;

    /* Public ordered Write accessor for role OwnedDependencies
     */
  public void moveOwnedDependenciesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theRelativeOwnedDependencies) throws EAIException;

    /* Public move to last Write accessor for role OwnedDependencies
     */
  public void moveOwnedDependenciesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;




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
 *  Implementation of public interface for relationship OwnedHandlers
 ****************************************************************************/


    /* Public Read accessor for role OwnedHandlers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[] getOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedHandlers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc findOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers finder predicate by name
     */
  public boolean hasOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers is related predicate
     */
  public boolean hasOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public OwnedHandlers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getOwnedHandlersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedHandlers number access
     */
  public int numOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedHandlers index access
     */
  public int indexOfOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public Write accessor for role OwnedHandlers
     * Double change propagation
     */
  public void addOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public Write accessor for role OwnedHandlers
     */
  public void removeOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void addOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public move to last Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;




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
