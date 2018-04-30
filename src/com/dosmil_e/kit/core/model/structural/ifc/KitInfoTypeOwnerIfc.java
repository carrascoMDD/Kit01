package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitInfoTypeOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitInfoTypeOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitInfoTypeOwner
 ****************************************************************************/




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




}
