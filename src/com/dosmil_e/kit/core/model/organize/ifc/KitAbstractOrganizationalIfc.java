package com.dosmil_e.kit.core.model.organize.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractOrganizationalIfc
    extends     com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc,
    com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractOrganizational
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractOrganizational
 ****************************************************************************/




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
 *  Implementation of public interface for relationship OwnedPorts
 ****************************************************************************/


    /* Public Read accessor for role OwnedPorts
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc[] getOwnedPorts( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedPorts finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc findOwnedPortsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedPorts finder predicate by name
     */
  public boolean hasOwnedPortsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedPorts is related predicate
     */
  public boolean hasOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;


    /* Public OwnedPorts read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc getOwnedPortsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedPorts number access
     */
  public int numOwnedPorts( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedPorts index access
     */
  public int indexOfOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;


    /* Public Write accessor for role OwnedPorts
     * Double change propagation
     */
  public void addOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;



    /* Public Write accessor for role OwnedPorts
     */
  public void removeOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;



    /* Public ordered Write accessor for role OwnedPorts
     */
  public void addOwnedPortsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theRelativeOwnedPorts) throws EAIException;

    /* Public ordered Write accessor for role OwnedPorts
     */
  public void moveOwnedPortsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theRelativeOwnedPorts) throws EAIException;

    /* Public move to last Write accessor for role OwnedPorts
     */
  public void moveOwnedPortsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;




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
 *  Implementation of public interface for relationship SubPackages
 ****************************************************************************/


    /* Public Read accessor for role SubPackages
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc[] getSubPackages( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SubPackages finder by name
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc findSubPackagesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubPackages finder predicate by name
     */
  public boolean hasSubPackagesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubPackages is related predicate
     */
  public boolean hasSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;


    /* Public SubPackages read accessor by index
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc getSubPackagesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubPackages number access
     */
  public int numSubPackages( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubPackages index access
     */
  public int indexOfSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;


    /* Public Write accessor for role SubPackages
     * Double change propagation
     */
  public void addSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;



    /* Public Write accessor for role SubPackages
     */
  public void removeSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;



    /* Public ordered Write accessor for role SubPackages
     */
  public void addSubPackagesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theRelativeSubPackages) throws EAIException;

    /* Public ordered Write accessor for role SubPackages
     */
  public void moveSubPackagesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theRelativeSubPackages) throws EAIException;

    /* Public move to last Write accessor for role SubPackages
     */
  public void moveSubPackagesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;




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
