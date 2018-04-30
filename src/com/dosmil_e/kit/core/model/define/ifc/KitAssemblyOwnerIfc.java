package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAssemblyOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAssemblyOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAssemblyOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedAssemblies
 ****************************************************************************/


    /* Public Read accessor for role OwnedAssemblies
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc[] getOwnedAssemblies( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedAssemblies finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc findOwnedAssembliesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedAssemblies finder predicate by name
     */
  public boolean hasOwnedAssembliesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedAssemblies is related predicate
     */
  public boolean hasOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;


    /* Public OwnedAssemblies read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc getOwnedAssembliesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedAssemblies number access
     */
  public int numOwnedAssemblies( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedAssemblies index access
     */
  public int indexOfOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;


    /* Public Write accessor for role OwnedAssemblies
     * Double change propagation
     */
  public void addOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;



    /* Public Write accessor for role OwnedAssemblies
     */
  public void removeOwnedAssemblies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;



    /* Public ordered Write accessor for role OwnedAssemblies
     */
  public void addOwnedAssembliesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theRelativeOwnedAssemblies) throws EAIException;

    /* Public ordered Write accessor for role OwnedAssemblies
     */
  public void moveOwnedAssembliesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theRelativeOwnedAssemblies) throws EAIException;

    /* Public move to last Write accessor for role OwnedAssemblies
     */
  public void moveOwnedAssembliesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractAssemblyIfc theOwnedAssemblies) throws EAIException;




}
