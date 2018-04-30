
package com.dosmil_e.kit.core.model.behavior.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitInteractionBase 
   extends com.dosmil_e.kit.core.model.behavior.impl.KitActivationImpl
    implements com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitInteraction metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitInteraction metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc[] vrOwnedStimuli = new com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc[0]; 

	protected com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc vrInteractionOwner; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] vrSourceOfAnnnotations = new com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[0]; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] vrTransformations = new com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitInteraction metamodel element
 ****************************************************************************/

  public KitInteractionBase() {
    super();
  }


  public KitInteractionBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitInteractionBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitInteractionIfc and KitInteractionPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitInteraction
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitInteraction
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedStimuli
 ****************************************************************************/


    /* Public Read accessor for role OwnedStimuli
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc[] getOwnedStimuli( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedStimuli number access
     */
  public int numOwnedStimuli( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedStimuli read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc getOwnedStimuliAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedStimuli finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc findOwnedStimuliNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedStimuli finder predicate by name
     */
  public boolean hasOwnedStimuliNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedStimuli is related predicate
     */
  public boolean hasOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          hasRelatedElement( theCtxt, this, theOwnedStimuli);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedStimuli index access
     */
  public int indexOfOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          indexOfRelatedElement( theCtxt, this, theOwnedStimuli);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedStimuli
     */
  public void addOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        addRelatedElement( theCtxt, this, theOwnedStimuli);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedStimuli
     */
  public void addOwnedStimuliBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli,
    com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theRelativeOwnedStimuli) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        addRelatedElementBefore( theCtxt, this, theOwnedStimuli, theRelativeOwnedStimuli);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedStimuli
     */
  public void moveOwnedStimuliBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli,
    com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theRelativeOwnedStimuli) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        moveRelatedElementBefore( theCtxt, this, theOwnedStimuli, theRelativeOwnedStimuli);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedStimuli
     */
  public void moveOwnedStimuliToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
        moveRelatedElementToLast( theCtxt, this, theOwnedStimuli);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedStimuli
     */
  public void removeOwnedStimuli( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitStimuliIfc theOwnedStimuli) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli).
          removeRelatedElement( theCtxt, this, theOwnedStimuli);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for ONE relationship InteractionOwner
 ****************************************************************************/


    /* Public Read accessor for role InteractionOwner
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc getInteractionOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public InteractionOwner number access
     */
  public int numInteractionOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public InteractionOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc getInteractionOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public InteractionOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc findInteractionOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public InteractionOwner finder predicate by name
     */
  public boolean hasInteractionOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InteractionOwner is related predicate
     */
  public boolean hasInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
          hasRelatedElement( theCtxt, this, theInteractionOwner);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public InteractionOwner index access
     */
  public int indexOfInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
          indexOfRelatedElement( theCtxt, this, theInteractionOwner);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role InteractionOwner
     */
  public void setInteractionOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc theInteractionOwner) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelInteractionOwner).
        setRelatedElement( theCtxt, this, theInteractionOwner);
    } catch( ClassCastException anEx) {}
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
 *  Implementation of destructor of KitInteraction
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
      vm3Type = com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.getStaticM3Type( theCtxt);
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

