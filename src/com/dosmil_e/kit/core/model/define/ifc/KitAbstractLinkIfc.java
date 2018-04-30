package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractLinkIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractLink
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractLink
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship LinkOwner
 ****************************************************************************/


     /* Public Read accessor for role LinkOwner
     * May do wild things with the identity of LinkOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc getLinkOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public LinkOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc getLinkOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public LinkOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc findLinkOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public LinkOwner finder predicate by name
     */
  public boolean hasLinkOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public LinkOwner is related predicate
     */
  public boolean hasLinkOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc theLinkOwner) throws EAIException;

    /* Public LinkOwner number access
     */
  public int numLinkOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public LinkOwner index access
     */
  public int indexOfLinkOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc theLinkOwner) throws EAIException;


    /* Public Write accessor for role LinkOwner
     */
  public void setLinkOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc theLinkOwner) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship ConnectedPort
 ****************************************************************************/


     /* Public Read accessor for role ConnectedPort
     * May do wild things with the identity of ConnectedPort
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc getConnectedPort( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ConnectedPort read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc getConnectedPortAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ConnectedPort finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc findConnectedPortNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ConnectedPort finder predicate by name
     */
  public boolean hasConnectedPortNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ConnectedPort is related predicate
     */
  public boolean hasConnectedPort( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theConnectedPort) throws EAIException;

    /* Public ConnectedPort number access
     */
  public int numConnectedPort( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ConnectedPort index access
     */
  public int indexOfConnectedPort( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theConnectedPort) throws EAIException;


    /* Public Write accessor for role ConnectedPort
     */
  public void setConnectedPort( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc theConnectedPort) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship Link
 ****************************************************************************/


    /* Public Read accessor for role Link
     * May do wild things with the identity of Link
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLink( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public Link read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLinkAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Link finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findLinkNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Link finder predicate by name
     */
  public boolean hasLinkNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Link is related predicate
     */
  public boolean hasLink( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLink) throws EAIException;

    /* Public Link number access
     */
  public int numLink( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Link index access
     */
  public int indexOfLink( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLink) throws EAIException;


    /* Public Write accessor for role Link
     */
  public void setLink( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLink) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship SourceOfAnnnotations
 ****************************************************************************/


    /* Public Read accessor for role SourceOfAnnnotations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] getSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SourceOfAnnnotations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc findSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations finder predicate by name
     */
  public boolean hasSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations is related predicate
     */
  public boolean hasSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;

    /* Public SourceOfAnnnotations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc getSourceOfAnnnotationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SourceOfAnnnotations number access
     */
  public int numSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SourceOfAnnnotations index access
     */
  public int indexOfSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;


    /* Public Write accessor for role SourceOfAnnnotations
     * Double change propagation
     */
  public void addSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public Write accessor for role SourceOfAnnnotations
     */
  public void removeSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void addSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public move to last Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;





}
