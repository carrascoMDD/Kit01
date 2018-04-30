package com.dosmil_e.kit.core.model.observe.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDependencyOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDependencyOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitDependencyOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedDependencies
 ****************************************************************************/


    /* Public Read accessor for role OwnedDependencies
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc[] getOwnedDependencies( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedDependencies finder by name
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc findOwnedDependenciesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDependencies finder predicate by name
     */
  public boolean hasOwnedDependenciesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDependencies is related predicate
     */
  public boolean hasOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;


    /* Public OwnedDependencies read accessor by index
     */
  public com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc getOwnedDependenciesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedDependencies number access
     */
  public int numOwnedDependencies( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedDependencies index access
     */
  public int indexOfOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;


    /* Public Write accessor for role OwnedDependencies
     * Double change propagation
     */
  public void addOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;



    /* Public Write accessor for role OwnedDependencies
     */
  public void removeOwnedDependencies( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;



    /* Public ordered Write accessor for role OwnedDependencies
     */
  public void addOwnedDependenciesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theRelativeOwnedDependencies) throws EAIException;

    /* Public ordered Write accessor for role OwnedDependencies
     */
  public void moveOwnedDependenciesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theRelativeOwnedDependencies) throws EAIException;

    /* Public move to last Write accessor for role OwnedDependencies
     */
  public void moveOwnedDependenciesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc theOwnedDependencies) throws EAIException;




}
