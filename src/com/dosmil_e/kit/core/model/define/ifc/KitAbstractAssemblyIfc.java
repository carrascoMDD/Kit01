package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractAssemblyIfc
    extends     com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractAssembly
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractAssembly
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship AssemblyOwner
 ****************************************************************************/


     /* Public Read accessor for role AssemblyOwner
     * May do wild things with the identity of AssemblyOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc getAssemblyOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public AssemblyOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc getAssemblyOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public AssemblyOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc findAssemblyOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public AssemblyOwner finder predicate by name
     */
  public boolean hasAssemblyOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public AssemblyOwner is related predicate
     */
  public boolean hasAssemblyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc theAssemblyOwner) throws EAIException;

    /* Public AssemblyOwner number access
     */
  public int numAssemblyOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public AssemblyOwner index access
     */
  public int indexOfAssemblyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc theAssemblyOwner) throws EAIException;


    /* Public Write accessor for role AssemblyOwner
     */
  public void setAssemblyOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAssemblyOwnerIfc theAssemblyOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship OwnedLinks
 ****************************************************************************/


    /* Public Read accessor for role OwnedLinks
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getOwnedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedLinks finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findOwnedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedLinks finder predicate by name
     */
  public boolean hasOwnedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedLinks is related predicate
     */
  public boolean hasOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;


    /* Public OwnedLinks read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getOwnedLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedLinks number access
     */
  public int numOwnedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedLinks index access
     */
  public int indexOfOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;


    /* Public Write accessor for role OwnedLinks
     * Double change propagation
     */
  public void addOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;



    /* Public Write accessor for role OwnedLinks
     */
  public void removeOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;



    /* Public ordered Write accessor for role OwnedLinks
     */
  public void addOwnedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeOwnedLinks) throws EAIException;

    /* Public ordered Write accessor for role OwnedLinks
     */
  public void moveOwnedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeOwnedLinks) throws EAIException;

    /* Public move to last Write accessor for role OwnedLinks
     */
  public void moveOwnedLinksToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;




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
