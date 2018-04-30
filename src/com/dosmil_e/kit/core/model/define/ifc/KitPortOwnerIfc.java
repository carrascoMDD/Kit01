package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitPortOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitPortOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitPortOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedPorts
 ****************************************************************************/


    /* Public Read accessor for role OwnedPorts
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc[] getOwnedPorts( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedPorts finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc findOwnedPortsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedPorts finder predicate by name
     */
  public boolean hasOwnedPortsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedPorts is related predicate
     */
  public boolean hasOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;


    /* Public OwnedPorts read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc getOwnedPortsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedPorts number access
     */
  public int numOwnedPorts( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedPorts index access
     */
  public int indexOfOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;


    /* Public Write accessor for role OwnedPorts
     * Double change propagation
     */
  public void addOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;



    /* Public Write accessor for role OwnedPorts
     */
  public void removeOwnedPorts( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;



    /* Public ordered Write accessor for role OwnedPorts
     */
  public void addOwnedPortsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theRelativeOwnedPorts) throws EAIException;

    /* Public ordered Write accessor for role OwnedPorts
     */
  public void moveOwnedPortsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theRelativeOwnedPorts) throws EAIException;

    /* Public move to last Write accessor for role OwnedPorts
     */
  public void moveOwnedPortsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theOwnedPorts) throws EAIException;




}
