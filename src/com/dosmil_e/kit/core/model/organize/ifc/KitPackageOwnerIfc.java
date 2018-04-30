package com.dosmil_e.kit.core.model.organize.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitPackageOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitPackageOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitPackageOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship SubPackages
 ****************************************************************************/


    /* Public Read accessor for role SubPackages
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc[] getSubPackages( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SubPackages finder by name
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc findSubPackagesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubPackages finder predicate by name
     */
  public boolean hasSubPackagesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubPackages is related predicate
     */
  public boolean hasSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;


    /* Public SubPackages read accessor by index
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc getSubPackagesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubPackages number access
     */
  public int numSubPackages( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubPackages index access
     */
  public int indexOfSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;


    /* Public Write accessor for role SubPackages
     * Double change propagation
     */
  public void addSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;



    /* Public Write accessor for role SubPackages
     */
  public void removeSubPackages( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;



    /* Public ordered Write accessor for role SubPackages
     */
  public void addSubPackagesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theRelativeSubPackages) throws EAIException;

    /* Public ordered Write accessor for role SubPackages
     */
  public void moveSubPackagesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theRelativeSubPackages) throws EAIException;

    /* Public move to last Write accessor for role SubPackages
     */
  public void moveSubPackagesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc theSubPackages) throws EAIException;




}
