package com.dosmil_e.kit.core.model.organize.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractPackageIfc
    extends     com.dosmil_e.kit.core.model.organize.ifc.KitAbstractOrganizationalIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractPackage
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractPackage
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship PackageOwner
 ****************************************************************************/


     /* Public Read accessor for role PackageOwner
     * May do wild things with the identity of PackageOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc getPackageOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PackageOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc getPackageOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public PackageOwner finder by name
     */
  public com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc findPackageOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PackageOwner finder predicate by name
     */
  public boolean hasPackageOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PackageOwner is related predicate
     */
  public boolean hasPackageOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc thePackageOwner) throws EAIException;

    /* Public PackageOwner number access
     */
  public int numPackageOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PackageOwner index access
     */
  public int indexOfPackageOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc thePackageOwner) throws EAIException;


    /* Public Write accessor for role PackageOwner
     */
  public void setPackageOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc thePackageOwner) throws EAIException;





}
