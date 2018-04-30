package com.dosmil_e.kit.core.projection.projecting.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitFachadeIfc
    extends     com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitFachade
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitFachade
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Projected
 ****************************************************************************/


     /* Public Read accessor for role Projected
     * May do wild things with the identity of Projected
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc getProjected( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Projected read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc getProjectedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Projected finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc findProjectedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Projected finder predicate by name
     */
  public boolean hasProjectedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Projected is related predicate
     */
  public boolean hasProjected( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc theProjected) throws EAIException;

    /* Public Projected number access
     */
  public int numProjected( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Projected index access
     */
  public int indexOfProjected( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc theProjected) throws EAIException;


    /* Public Write accessor for role Projected
     */
  public void setProjected( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc theProjected) throws EAIException;





}
