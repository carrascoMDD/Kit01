package com.dosmil_e.kit.core.model.trace.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAttachmentIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAttachment
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAttachment
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship AttachmentOwner
 ****************************************************************************/


     /* Public Read accessor for role AttachmentOwner
     * May do wild things with the identity of AttachmentOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc getAttachmentOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public AttachmentOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc getAttachmentOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public AttachmentOwner finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc findAttachmentOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public AttachmentOwner finder predicate by name
     */
  public boolean hasAttachmentOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public AttachmentOwner is related predicate
     */
  public boolean hasAttachmentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc theAttachmentOwner) throws EAIException;

    /* Public AttachmentOwner number access
     */
  public int numAttachmentOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public AttachmentOwner index access
     */
  public int indexOfAttachmentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc theAttachmentOwner) throws EAIException;


    /* Public Write accessor for role AttachmentOwner
     */
  public void setAttachmentOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc theAttachmentOwner) throws EAIException;





}
