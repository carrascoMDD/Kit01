package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitLinkOwnerIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitLinkOwner
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitLinkOwner
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship OwnedLinks
 ****************************************************************************/


    /* Public Read accessor for role OwnedLinks
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getOwnedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedLinks finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findOwnedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedLinks finder predicate by name
     */
  public boolean hasOwnedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedLinks is related predicate
     */
  public boolean hasOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;


    /* Public OwnedLinks read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getOwnedLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedLinks number access
     */
  public int numOwnedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedLinks index access
     */
  public int indexOfOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;


    /* Public Write accessor for role OwnedLinks
     * Double change propagation
     */
  public void addOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;



    /* Public Write accessor for role OwnedLinks
     */
  public void removeOwnedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;



    /* Public ordered Write accessor for role OwnedLinks
     */
  public void addOwnedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeOwnedLinks) throws EAIException;

    /* Public ordered Write accessor for role OwnedLinks
     */
  public void moveOwnedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeOwnedLinks) throws EAIException;

    /* Public move to last Write accessor for role OwnedLinks
     */
  public void moveOwnedLinksToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theOwnedLinks) throws EAIException;




}
