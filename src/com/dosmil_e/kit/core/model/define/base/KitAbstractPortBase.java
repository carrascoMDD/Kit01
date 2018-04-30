
package com.dosmil_e.kit.core.model.define.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitAbstractPortBase 
   extends com.dosmil_e.kit.core.model.define.impl.KitPortOwnerImpl
    implements com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitAbstractPort metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitAbstractPort metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc vrPortOwner; 

	protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] vrConnectedLinks = new com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[0]; 

	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] vrDelegateOf = new com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[0]; 

	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] vrDelegatorOf = new com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[0]; 

	protected com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[] vrOwnedDispatchers = new com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[0]; 

	protected com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[] vrOwnedHandlers = new com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[0]; 

	protected com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] vrOwnedInfoTypes = new com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[0]; 

	protected com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] vrOwnedInteractions = new com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[0]; 

	protected com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] vrOwnedStructuralFeatures = new com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[0]; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] vrSourceOfAnnnotations = new com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[0]; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] vrTransformations = new com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitAbstractPort metamodel element
 ****************************************************************************/

  public KitAbstractPortBase() {
    super();
  }


  public KitAbstractPortBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitAbstractPortBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitAbstractPortIfc and KitAbstractPortPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitAbstractPort
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitAbstractPort
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship Links
 ****************************************************************************/


    /* Public Read accessor for role Links
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Links number access
     */
  public int numLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Links read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Links finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Links finder predicate by name
     */
  public boolean hasLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Links is related predicate
     */
  public boolean hasLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
          hasRelatedElement( theCtxt, this, theLinks);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Links index access
     */
  public int indexOfLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks).
          indexOfRelatedElement( theCtxt, this, theLinks);
    } catch( ClassCastException anEx) { return -1;}
  }







/****************************************************************************
 *  Implementation of public interface for ONE relationship PortOwner
 ****************************************************************************/


    /* Public Read accessor for role PortOwner
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc getPortOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public PortOwner number access
     */
  public int numPortOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public PortOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc getPortOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public PortOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc findPortOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public PortOwner finder predicate by name
     */
  public boolean hasPortOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PortOwner is related predicate
     */
  public boolean hasPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
          hasRelatedElement( theCtxt, this, thePortOwner);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public PortOwner index access
     */
  public int indexOfPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
          indexOfRelatedElement( theCtxt, this, thePortOwner);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role PortOwner
     */
  public void setPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelPortOwner).
        setRelatedElement( theCtxt, this, thePortOwner);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship ConnectedLinks
 ****************************************************************************/


    /* Public Read accessor for role ConnectedLinks
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getConnectedLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public ConnectedLinks number access
     */
  public int numConnectedLinks( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public ConnectedLinks read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getConnectedLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public ConnectedLinks finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findConnectedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public ConnectedLinks finder predicate by name
     */
  public boolean hasConnectedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public ConnectedLinks is related predicate
     */
  public boolean hasConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          hasRelatedElement( theCtxt, this, theConnectedLinks);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public ConnectedLinks index access
     */
  public int indexOfConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          indexOfRelatedElement( theCtxt, this, theConnectedLinks);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role ConnectedLinks
     */
  public void addConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        addRelatedElement( theCtxt, this, theConnectedLinks);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role ConnectedLinks
     */
  public void addConnectedLinksBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks,
    com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeConnectedLinks) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        addRelatedElementBefore( theCtxt, this, theConnectedLinks, theRelativeConnectedLinks);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role ConnectedLinks
     */
  public void moveConnectedLinksBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks,
    com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeConnectedLinks) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        moveRelatedElementBefore( theCtxt, this, theConnectedLinks, theRelativeConnectedLinks);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role ConnectedLinks
     */
  public void moveConnectedLinksToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
        moveRelatedElementToLast( theCtxt, this, theConnectedLinks);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role ConnectedLinks
     */
  public void removeConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks).
          removeRelatedElement( theCtxt, this, theConnectedLinks);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship DelegateOf
 ****************************************************************************/


    /* Public Read accessor for role DelegateOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public DelegateOf number access
     */
  public int numDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public DelegateOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegateOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public DelegateOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public DelegateOf finder predicate by name
     */
  public boolean hasDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegateOf is related predicate
     */
  public boolean hasDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          hasRelatedElement( theCtxt, this, theDelegateOf);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegateOf index access
     */
  public int indexOfDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          indexOfRelatedElement( theCtxt, this, theDelegateOf);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role DelegateOf
     */
  public void addDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        addRelatedElement( theCtxt, this, theDelegateOf);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role DelegateOf
     */
  public void addDelegateOfBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        addRelatedElementBefore( theCtxt, this, theDelegateOf, theRelativeDelegateOf);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role DelegateOf
     */
  public void moveDelegateOfBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        moveRelatedElementBefore( theCtxt, this, theDelegateOf, theRelativeDelegateOf);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role DelegateOf
     */
  public void moveDelegateOfToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
        moveRelatedElementToLast( theCtxt, this, theDelegateOf);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role DelegateOf
     */
  public void removeDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf).
          removeRelatedElement( theCtxt, this, theDelegateOf);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship DelegatorOf
 ****************************************************************************/


    /* Public Read accessor for role DelegatorOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public DelegatorOf number access
     */
  public int numDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public DelegatorOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegatorOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public DelegatorOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public DelegatorOf finder predicate by name
     */
  public boolean hasDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegatorOf is related predicate
     */
  public boolean hasDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          hasRelatedElement( theCtxt, this, theDelegatorOf);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegatorOf index access
     */
  public int indexOfDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          indexOfRelatedElement( theCtxt, this, theDelegatorOf);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role DelegatorOf
     */
  public void addDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        addRelatedElement( theCtxt, this, theDelegatorOf);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role DelegatorOf
     */
  public void addDelegatorOfBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        addRelatedElementBefore( theCtxt, this, theDelegatorOf, theRelativeDelegatorOf);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role DelegatorOf
     */
  public void moveDelegatorOfBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        moveRelatedElementBefore( theCtxt, this, theDelegatorOf, theRelativeDelegatorOf);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role DelegatorOf
     */
  public void moveDelegatorOfToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
        moveRelatedElementToLast( theCtxt, this, theDelegatorOf);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role DelegatorOf
     */
  public void removeDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf).
          removeRelatedElement( theCtxt, this, theDelegatorOf);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedDispatchers
 ****************************************************************************/


    /* Public Read accessor for role OwnedDispatchers
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[] getOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedDispatchers number access
     */
  public int numOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedDispatchers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc getOwnedDispatchersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedDispatchers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc findOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedDispatchers finder predicate by name
     */
  public boolean hasOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedDispatchers is related predicate
     */
  public boolean hasOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          hasRelatedElement( theCtxt, this, theOwnedDispatchers);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedDispatchers index access
     */
  public int indexOfOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          indexOfRelatedElement( theCtxt, this, theOwnedDispatchers);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedDispatchers
     */
  public void addOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        addRelatedElement( theCtxt, this, theOwnedDispatchers);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedDispatchers
     */
  public void addOwnedDispatchersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        addRelatedElementBefore( theCtxt, this, theOwnedDispatchers, theRelativeOwnedDispatchers);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        moveRelatedElementBefore( theCtxt, this, theOwnedDispatchers, theRelativeOwnedDispatchers);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
        moveRelatedElementToLast( theCtxt, this, theOwnedDispatchers);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedDispatchers
     */
  public void removeOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers).
          removeRelatedElement( theCtxt, this, theOwnedDispatchers);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedHandlers
 ****************************************************************************/


    /* Public Read accessor for role OwnedHandlers
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[] getOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedHandlers number access
     */
  public int numOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedHandlers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getOwnedHandlersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedHandlers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc findOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedHandlers finder predicate by name
     */
  public boolean hasOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedHandlers is related predicate
     */
  public boolean hasOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          hasRelatedElement( theCtxt, this, theOwnedHandlers);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedHandlers index access
     */
  public int indexOfOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          indexOfRelatedElement( theCtxt, this, theOwnedHandlers);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedHandlers
     */
  public void addOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        addRelatedElement( theCtxt, this, theOwnedHandlers);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void addOwnedHandlersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        addRelatedElementBefore( theCtxt, this, theOwnedHandlers, theRelativeOwnedHandlers);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        moveRelatedElementBefore( theCtxt, this, theOwnedHandlers, theRelativeOwnedHandlers);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
        moveRelatedElementToLast( theCtxt, this, theOwnedHandlers);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedHandlers
     */
  public void removeOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers).
          removeRelatedElement( theCtxt, this, theOwnedHandlers);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedInfoTypes
 ****************************************************************************/


    /* Public Read accessor for role OwnedInfoTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] getOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedInfoTypes number access
     */
  public int numOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedInfoTypes read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc getOwnedInfoTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedInfoTypes finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc findOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedInfoTypes finder predicate by name
     */
  public boolean hasOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedInfoTypes is related predicate
     */
  public boolean hasOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          hasRelatedElement( theCtxt, this, theOwnedInfoTypes);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedInfoTypes index access
     */
  public int indexOfOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          indexOfRelatedElement( theCtxt, this, theOwnedInfoTypes);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedInfoTypes
     */
  public void addOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        addRelatedElement( theCtxt, this, theOwnedInfoTypes);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedInfoTypes
     */
  public void addOwnedInfoTypesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        addRelatedElementBefore( theCtxt, this, theOwnedInfoTypes, theRelativeOwnedInfoTypes);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        moveRelatedElementBefore( theCtxt, this, theOwnedInfoTypes, theRelativeOwnedInfoTypes);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
        moveRelatedElementToLast( theCtxt, this, theOwnedInfoTypes);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedInfoTypes
     */
  public void removeOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes).
          removeRelatedElement( theCtxt, this, theOwnedInfoTypes);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedInteractions
 ****************************************************************************/


    /* Public Read accessor for role OwnedInteractions
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] getOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedInteractions number access
     */
  public int numOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedInteractions read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc getOwnedInteractionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedInteractions finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc findOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedInteractions finder predicate by name
     */
  public boolean hasOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedInteractions is related predicate
     */
  public boolean hasOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          hasRelatedElement( theCtxt, this, theOwnedInteractions);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedInteractions index access
     */
  public int indexOfOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          indexOfRelatedElement( theCtxt, this, theOwnedInteractions);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedInteractions
     */
  public void addOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        addRelatedElement( theCtxt, this, theOwnedInteractions);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedInteractions
     */
  public void addOwnedInteractionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        addRelatedElementBefore( theCtxt, this, theOwnedInteractions, theRelativeOwnedInteractions);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        moveRelatedElementBefore( theCtxt, this, theOwnedInteractions, theRelativeOwnedInteractions);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
        moveRelatedElementToLast( theCtxt, this, theOwnedInteractions);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedInteractions
     */
  public void removeOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions).
          removeRelatedElement( theCtxt, this, theOwnedInteractions);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedStructuralFeatures
 ****************************************************************************/


    /* Public Read accessor for role OwnedStructuralFeatures
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] getOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedStructuralFeatures number access
     */
  public int numOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedStructuralFeatures read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getOwnedStructuralFeaturesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedStructuralFeatures finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc findOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedStructuralFeatures finder predicate by name
     */
  public boolean hasOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedStructuralFeatures is related predicate
     */
  public boolean hasOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          hasRelatedElement( theCtxt, this, theOwnedStructuralFeatures);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedStructuralFeatures index access
     */
  public int indexOfOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          indexOfRelatedElement( theCtxt, this, theOwnedStructuralFeatures);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedStructuralFeatures
     */
  public void addOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        addRelatedElement( theCtxt, this, theOwnedStructuralFeatures);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedStructuralFeatures
     */
  public void addOwnedStructuralFeaturesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        addRelatedElementBefore( theCtxt, this, theOwnedStructuralFeatures, theRelativeOwnedStructuralFeatures);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        moveRelatedElementBefore( theCtxt, this, theOwnedStructuralFeatures, theRelativeOwnedStructuralFeatures);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
        moveRelatedElementToLast( theCtxt, this, theOwnedStructuralFeatures);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedStructuralFeatures
     */
  public void removeOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures).
          removeRelatedElement( theCtxt, this, theOwnedStructuralFeatures);
    } catch( ClassCastException anEx) { return;}
  }




/****************************************************************************
 *  Implementation of public interface for MANY relationship SourceOfAnnnotations
 ****************************************************************************/


    /* Public Read accessor for role SourceOfAnnnotations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] getSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public SourceOfAnnnotations number access
     */
  public int numSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public SourceOfAnnnotations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc getSourceOfAnnnotationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public SourceOfAnnnotations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc findSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public SourceOfAnnnotations finder predicate by name
     */
  public boolean hasSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SourceOfAnnnotations is related predicate
     */
  public boolean hasSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
          hasRelatedElement( theCtxt, this, theSourceOfAnnnotations);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SourceOfAnnnotations index access
     */
  public int indexOfSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
          indexOfRelatedElement( theCtxt, this, theSourceOfAnnnotations);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role SourceOfAnnnotations
     */
  public void addSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
        addRelatedElement( theCtxt, this, theSourceOfAnnnotations);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void addSourceOfAnnnotationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations,
    com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
        addRelatedElementBefore( theCtxt, this, theSourceOfAnnnotations, theRelativeSourceOfAnnnotations);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations,
    com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
        moveRelatedElementBefore( theCtxt, this, theSourceOfAnnnotations, theRelativeSourceOfAnnnotations);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
        moveRelatedElementToLast( theCtxt, this, theSourceOfAnnnotations);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role SourceOfAnnnotations
     */
  public void removeSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations).
          removeRelatedElement( theCtxt, this, theSourceOfAnnnotations);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for MANY relationship Transformations
 ****************************************************************************/


    /* Public Read accessor for role Transformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] getTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Transformations number access
     */
  public int numTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Transformations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Transformations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Transformations finder predicate by name
     */
  public boolean hasTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Transformations is related predicate
     */
  public boolean hasTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          hasRelatedElement( theCtxt, this, theTransformations);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Transformations index access
     */
  public int indexOfTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          indexOfRelatedElement( theCtxt, this, theTransformations);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Transformations
     */
  public void addTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        addRelatedElement( theCtxt, this, theTransformations);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Transformations
     */
  public void addTransformationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        addRelatedElementBefore( theCtxt, this, theTransformations, theRelativeTransformations);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Transformations
     */
  public void moveTransformationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        moveRelatedElementBefore( theCtxt, this, theTransformations, theRelativeTransformations);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Transformations
     */
  public void moveTransformationsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
        moveRelatedElementToLast( theCtxt, this, theTransformations);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Transformations
     */
  public void removeTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations).
          removeRelatedElement( theCtxt, this, theTransformations);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of KitAbstractPort
 ****************************************************************************/
  public void delete( EAIMMCtxtIfc theCtxt)  throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( vm3Type == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3TypePub) vm3Type).
          deleteElement( theCtxt, this);
    } catch( ClassCastException anEx) { return;}
  }



/****************************************************************************
 *  Support
 ****************************************************************************/



/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type == null) {
      vm3Type = com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.getStaticM3Type( theCtxt);
    }
    return vm3Type;
  }


/****************************************************************************
 *  Access to metainformation for Type of the metamodel element
 ****************************************************************************/
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3Type( EAIMMCtxtIfc theCtxt) {
    return getStaticM3Type( theCtxt);
  }



/****************************************************************************
 *  Implementation of restoreValue method (such that it has access to protected fields)
 ****************************************************************************/
    // Restore a value on this metamodel element
  protected boolean restoreValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToRestore,
    String          theFieldName) {

    if( theCtxt == null)        { return true;}
    if( theFieldName == null)   { return true;}

    if( EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) {

      String aSourceName = new String("null");
      String aSourceClassName = new String();
      EAIMMNameIfc aName = null;
      try { aName = getName();} catch( EAIException anEx) {}
      if( aName != null) {
        aSourceName = aName.getString();
      }
      aSourceClassName = getClass().getName();

      System.out.println("--- Restoring field : " + theFieldName + " in element named " + aSourceName + " class " + aSourceClassName);
    }

    if( theFieldName.equals( sExistencePropertyName)) { return true;}

    Field aField = getField( theFieldName);
    if( aField == null) { return false;}

    Class aFieldType = aField.getType();
    if( aFieldType == null) { return false;}

    if( !aFieldType.isPrimitive()) {
      try { aField.set( this, theValueToRestore);}
      catch( IllegalArgumentException anException) { return false;}
      catch( IllegalAccessException anException) { return false;}
    }
    else {
      String aFieldTypeName = aFieldType.getName();

      if( aFieldTypeName.equals( int.class.getName())) {
        Integer aValueObject = null;
        try { aValueObject = (Integer) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        int aValue = aValueObject.intValue();
        try { aField.setInt( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( boolean.class.getName())) {
        Boolean aValueObject = null;
        try { aValueObject = (Boolean) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        boolean aValue = aValueObject.booleanValue();

        try { aField.setBoolean( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( float.class.getName())) {
        Float aValueObject = null;
        try { aValueObject = (Float) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        float aValue = aValueObject.floatValue();

        try { aField.setFloat( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( double.class.getName())) {
        Double aValueObject = null;
        try { aValueObject = (Double) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        double aValue = aValueObject.doubleValue();
        try { aField.setDouble( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
        return false;
      }}}}
    }

    return true;
  }






/****************************************************************************
 *  Implementations of getFieldValue method (such that it has access to protected fields)
 ****************************************************************************/

    // Get a value from a field of this  metamodel element
  public Object getFieldValue(
    EAIMMCtxtIfc    theCtxt,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return null;}
    if( theField == null)       { return null;}

    Object aValue = null;
    try { aValue = theField.get( this);}
    catch( IllegalArgumentException anException) { return null;}
    catch( IllegalAccessException anException) { return null;}
    catch( NullPointerException anException) { return null;}
    catch( ExceptionInInitializerError anException) { return null;}

    return aValue;
  }





/****************************************************************************
 *  Implementations of setFieldToXXX method (such that it has access to protected fields)
 ****************************************************************************/
    // Aux for log
  protected void logSetField(
    EAIMMCtxtIfc    theCtxt,
    String          theFieldKind,
    Field           theField) {

    if( !EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) { return;}


    String aSourceName = new String("null");
    String aSourceClassName = new String();
    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName != null) {
      aSourceName = aName.getString();
    }
    aSourceClassName = getClass().getName();

    System.out.println("--- SettingField " + theFieldKind + " field : " + theField.getName() + " in element named " + aSourceName + " class " + aSourceClassName);
  }


    // Restore a value on this metamodel element
  public boolean setFieldToNonPrimitiveValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Non Primitive", theField);

    try { theField.set( this, theValueToSet);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}
    return true;
  }


  public boolean setFieldToPrimitiveIntValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive int", theField);

    Integer aValueObject = null;
    try { aValueObject = (Integer) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    int aValue = aValueObject.intValue();

    try { theField.setInt( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveBoolValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive boolean", theField);

    Boolean aValueObject = null;
    try { aValueObject = (Boolean) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    boolean aValue = aValueObject.booleanValue();

    try { theField.setBoolean( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }









  public boolean setFieldToPrimitiveFloatValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive float", theField);

    Float aValueObject = null;
    try { aValueObject = (Float) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    float aValue = aValueObject.floatValue();

    try { theField.setFloat( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveDoubleValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive double", theField);

    Double aValueObject = null;
    try { aValueObject = (Double) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    double aValue = aValueObject.doubleValue();

    try { theField.setDouble( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }





/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -3331123456100000003L;


}

