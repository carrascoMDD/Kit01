package com.dosmil_e.kit.core.model.trace.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitCommentIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitComment
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitComment
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship Attachements
 ****************************************************************************/


    /* Public Read accessor for role Attachements
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc[] getAttachements( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Attachements finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc findAttachementsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Attachements finder predicate by name
     */
  public boolean hasAttachementsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Attachements is related predicate
     */
  public boolean hasAttachements( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements) throws EAIException;


    /* Public Attachements read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc getAttachementsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Attachements number access
     */
  public int numAttachements( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Attachements index access
     */
  public int indexOfAttachements( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements) throws EAIException;


    /* Public Write accessor for role Attachements
     * Double change propagation
     */
  public void addAttachements( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements) throws EAIException;



    /* Public Write accessor for role Attachements
     */
  public void removeAttachements( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements) throws EAIException;



    /* Public ordered Write accessor for role Attachements
     */
  public void addAttachementsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theRelativeAttachements) throws EAIException;

    /* Public ordered Write accessor for role Attachements
     */
  public void moveAttachementsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theRelativeAttachements) throws EAIException;

    /* Public move to last Write accessor for role Attachements
     */
  public void moveAttachementsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAttachmentIfc theAttachements) throws EAIException;




}
