package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitInfoTypeIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitInfoType
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitInfoType
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





}
