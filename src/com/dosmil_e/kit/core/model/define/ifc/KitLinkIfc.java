package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitLinkIfc
    extends     com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitLink
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitLink
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





}
