package com.dosmil_e.kit.core.projection.organize.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitPackageProjectionIfc
    extends     com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitPackageProjection
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitPackageProjection
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OriginalOfProjections
 ****************************************************************************/


    /* Public Read accessor for role OriginalOfProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getOriginalOfProjections( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OriginalOfProjections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findOriginalOfProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OriginalOfProjections finder predicate by name
     */
  public boolean hasOriginalOfProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OriginalOfProjections is related predicate
     */
  public boolean hasOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException;

    /* Public OriginalOfProjections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getOriginalOfProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OriginalOfProjections number access
     */
  public int numOriginalOfProjections( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OriginalOfProjections index access
     */
  public int indexOfOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException;


    /* Public Write accessor for role OriginalOfProjections
     * Double change propagation
     */
  public void addOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException;



    /* Public Write accessor for role OriginalOfProjections
     */
  public void removeOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException;



    /* Public ordered Write accessor for role OriginalOfProjections
     */
  public void addOriginalOfProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeOriginalOfProjections) throws EAIException;

    /* Public ordered Write accessor for role OriginalOfProjections
     */
  public void moveOriginalOfProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeOriginalOfProjections) throws EAIException;

    /* Public move to last Write accessor for role OriginalOfProjections
     */
  public void moveOriginalOfProjectionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship Projections
 ****************************************************************************/


    /* Public Read accessor for role Projections
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[] getProjections( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Projections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc findProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Projections finder predicate by name
     */
  public boolean hasProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Projections is related predicate
     */
  public boolean hasProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException;


    /* Public Projections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc getProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Projections number access
     */
  public int numProjections( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Projections index access
     */
  public int indexOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException;


    /* Public Write accessor for role Projections
     * Double change propagation
     */
  public void addProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException;



    /* Public Write accessor for role Projections
     */
  public void removeProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException;



    /* Public ordered Write accessor for role Projections
     */
  public void addProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theRelativeProjections) throws EAIException;

    /* Public ordered Write accessor for role Projections
     */
  public void moveProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theRelativeProjections) throws EAIException;

    /* Public move to last Write accessor for role Projections
     */
  public void moveProjectionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException;




}
