package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitComponentOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitComponentOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitComponentOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedComponents
 ****************************************************************************/


    /* Public Read accessor for role OwnedComponents
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc[] getOwnedComponents( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedComponents finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc findOwnedComponentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedComponents finder predicate by name
     */
  public boolean hasOwnedComponentsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedComponents is related predicate
     */
  public boolean hasOwnedComponents( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents) throws EAIException;


    /* Public OwnedComponents read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc getOwnedComponentsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedComponents number access
     */
  public int numOwnedComponents( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedComponents index access
     */
  public int indexOfOwnedComponents( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents) throws EAIException;


    /* Public Write accessor for role OwnedComponents
     * Double change propagation
     */
  public void addOwnedComponents( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents) throws EAIException;



    /* Public Write accessor for role OwnedComponents
     */
  public void removeOwnedComponents( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents) throws EAIException;



    /* Public ordered Write accessor for role OwnedComponents
     */
  public void addOwnedComponentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theRelativeOwnedComponents) throws EAIException;

    /* Public ordered Write accessor for role OwnedComponents
     */
  public void moveOwnedComponentsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theRelativeOwnedComponents) throws EAIException;

    /* Public move to last Write accessor for role OwnedComponents
     */
  public void moveOwnedComponentsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc theOwnedComponents) throws EAIException;




}
