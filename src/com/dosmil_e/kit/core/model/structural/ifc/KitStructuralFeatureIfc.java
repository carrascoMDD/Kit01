package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitStructuralFeatureIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitStructuralFeature
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitStructuralFeature
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship FeatureOwner
 ****************************************************************************/


     /* Public Read accessor for role FeatureOwner
     * May do wild things with the identity of FeatureOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc getFeatureOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public FeatureOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc getFeatureOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public FeatureOwner finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc findFeatureOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public FeatureOwner finder predicate by name
     */
  public boolean hasFeatureOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public FeatureOwner is related predicate
     */
  public boolean hasFeatureOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc theFeatureOwner) throws EAIException;

    /* Public FeatureOwner number access
     */
  public int numFeatureOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public FeatureOwner index access
     */
  public int indexOfFeatureOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc theFeatureOwner) throws EAIException;


    /* Public Write accessor for role FeatureOwner
     */
  public void setFeatureOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc theFeatureOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship ExposedAs
 ****************************************************************************/


    /* Public Read accessor for role ExposedAs
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc[] getExposedAs( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public ExposedAs finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc findExposedAsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ExposedAs finder predicate by name
     */
  public boolean hasExposedAsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ExposedAs is related predicate
     */
  public boolean hasExposedAs( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs) throws EAIException;


    /* Public ExposedAs read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc getExposedAsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ExposedAs number access
     */
  public int numExposedAs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ExposedAs index access
     */
  public int indexOfExposedAs( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs) throws EAIException;


    /* Public Write accessor for role ExposedAs
     * Double change propagation
     */
  public void addExposedAs( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs) throws EAIException;



    /* Public Write accessor for role ExposedAs
     */
  public void removeExposedAs( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs) throws EAIException;



    /* Public ordered Write accessor for role ExposedAs
     */
  public void addExposedAsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theRelativeExposedAs) throws EAIException;

    /* Public ordered Write accessor for role ExposedAs
     */
  public void moveExposedAsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theRelativeExposedAs) throws EAIException;

    /* Public move to last Write accessor for role ExposedAs
     */
  public void moveExposedAsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc theExposedAs) throws EAIException;




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





}
