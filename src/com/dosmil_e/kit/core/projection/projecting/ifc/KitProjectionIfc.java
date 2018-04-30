package com.dosmil_e.kit.core.projection.projecting.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitProjectionIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitProjection
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitProjection
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship Originals
 ****************************************************************************/


    /* Public Read accessor for role Originals
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[] getOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Originals finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc findOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Originals finder predicate by name
     */
  public boolean hasOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Originals is related predicate
     */
  public boolean hasOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException;

    /* Public Originals read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc getOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Originals number access
     */
  public int numOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Originals index access
     */
  public int indexOfOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException;


    /* Public Write accessor for role Originals
     * Double change propagation
     */
  public void addOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException;



    /* Public Write accessor for role Originals
     */
  public void removeOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException;



    /* Public ordered Write accessor for role Originals
     */
  public void addOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theRelativeOriginals) throws EAIException;

    /* Public ordered Write accessor for role Originals
     */
  public void moveOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theRelativeOriginals) throws EAIException;

    /* Public move to last Write accessor for role Originals
     */
  public void moveOriginalsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship SubProjections
 ****************************************************************************/


    /* Public Read accessor for role SubProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getSubProjections( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SubProjections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findSubProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubProjections finder predicate by name
     */
  public boolean hasSubProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubProjections is related predicate
     */
  public boolean hasSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException;


    /* Public SubProjections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSubProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubProjections number access
     */
  public int numSubProjections( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubProjections index access
     */
  public int indexOfSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException;


    /* Public Write accessor for role SubProjections
     * Double change propagation
     */
  public void addSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException;



    /* Public Write accessor for role SubProjections
     */
  public void removeSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException;



    /* Public ordered Write accessor for role SubProjections
     */
  public void addSubProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeSubProjections) throws EAIException;

    /* Public ordered Write accessor for role SubProjections
     */
  public void moveSubProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeSubProjections) throws EAIException;

    /* Public move to last Write accessor for role SubProjections
     */
  public void moveSubProjectionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException;


/****************************************************************************
 *  Implementation of public interface for relationship SuperProjection
 ****************************************************************************/


     /* Public Read accessor for role SuperProjection
     * May do wild things with the identity of SuperProjection
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSuperProjection( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperProjection read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSuperProjectionAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SuperProjection finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findSuperProjectionNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SuperProjection finder predicate by name
     */
  public boolean hasSuperProjectionNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SuperProjection is related predicate
     */
  public boolean hasSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException;

    /* Public SuperProjection number access
     */
  public int numSuperProjection( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperProjection index access
     */
  public int indexOfSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException;


    /* Public Write accessor for role SuperProjection
     */
  public void setSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException;





}
