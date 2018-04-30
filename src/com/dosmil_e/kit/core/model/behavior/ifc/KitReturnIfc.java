package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitReturnIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitReturn
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitReturn
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship ReturnOfInteractions
 ****************************************************************************/


     /* Public Read accessor for role ReturnOfInteractions
     * May do wild things with the identity of ReturnOfInteractions
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc getReturnOfInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ReturnOfInteractions read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc getReturnOfInteractionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ReturnOfInteractions finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc findReturnOfInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ReturnOfInteractions finder predicate by name
     */
  public boolean hasReturnOfInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ReturnOfInteractions is related predicate
     */
  public boolean hasReturnOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc theReturnOfInteractions) throws EAIException;

    /* Public ReturnOfInteractions number access
     */
  public int numReturnOfInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ReturnOfInteractions index access
     */
  public int indexOfReturnOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc theReturnOfInteractions) throws EAIException;


    /* Public Write accessor for role ReturnOfInteractions
     */
  public void setReturnOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc theReturnOfInteractions) throws EAIException;





}
