package com.dosmil_e.kit.core.model.define.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class KitAbstractPortImpl
  extends com.dosmil_e.kit.core.model.define.base.KitAbstractPortBase 
  implements com.dosmil_e.kit.core.model.define.pub.KitAbstractPortPub {

  public KitAbstractPortImpl() {
    super();
  }


  public KitAbstractPortImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitAbstractPortImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }



/****************************************************************************
 *  Implementation of derived relationships of KitAbstractPort
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship Links
 ****************************************************************************/


    /* Public Read accessor for role Links
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    return super.getLinks( theCtxt);
  }





    /* Public Links finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return super.findLinksNamed( theCtxt, theMMName);
  }



    /* Public Links finder predicate by name
     */
  public boolean hasLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return super.hasLinksNamed( theCtxt, theMMName);
  }



    /* Public Links read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    return super.getLinksAt( theCtxt, theIndex);
  }



    /* Public Links is related predicate
     */
  public boolean hasLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException {
    return super.hasLinks( theCtxt, theLinks);
  }


    /* Public Links index access
     */
  public int indexOfLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException {
    return super.indexOfLinks( theCtxt, theLinks);
  }


    /* Public Links number access
     */
  public int numLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    return super.numLinks( theCtxt);
  }








/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -3331123456100000007L;



}
