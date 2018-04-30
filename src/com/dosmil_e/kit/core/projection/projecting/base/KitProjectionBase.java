
package com.dosmil_e.kit.core.projection.projecting.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitProjectionBase 
   extends com.dosmil_e.kit.core.model.common.impl.KitCommonImpl
    implements com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitProjection metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitProjection metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[] vrOriginals = new com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[0]; 

	protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] vrSubProjections = new com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[0]; 

	protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc vrSuperProjection; 






/****************************************************************************
 *  Constructors of the KitProjection metamodel element
 ****************************************************************************/

  public KitProjectionBase() {
    super();
  }


  public KitProjectionBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitProjectionBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitProjectionIfc and KitProjectionPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitProjection
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitProjection
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship Originals
 ****************************************************************************/


    /* Public Read accessor for role Originals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[] getOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Originals number access
     */
  public int numOriginals( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Originals read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc getOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Originals finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc findOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Originals finder predicate by name
     */
  public boolean hasOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Originals is related predicate
     */
  public boolean hasOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
          hasRelatedElement( theCtxt, this, theOriginals);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Originals index access
     */
  public int indexOfOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
          indexOfRelatedElement( theCtxt, this, theOriginals);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Originals
     */
  public void addOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
        addRelatedElement( theCtxt, this, theOriginals);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Originals
     */
  public void addOriginalsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theRelativeOriginals) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
        addRelatedElementBefore( theCtxt, this, theOriginals, theRelativeOriginals);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Originals
     */
  public void moveOriginalsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theRelativeOriginals) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
        moveRelatedElementBefore( theCtxt, this, theOriginals, theRelativeOriginals);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Originals
     */
  public void moveOriginalsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
        moveRelatedElementToLast( theCtxt, this, theOriginals);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Originals
     */
  public void removeOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc theOriginals) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals).
          removeRelatedElement( theCtxt, this, theOriginals);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for MANY relationship SubProjections
 ****************************************************************************/


    /* Public Read accessor for role SubProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getSubProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public SubProjections number access
     */
  public int numSubProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public SubProjections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSubProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public SubProjections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findSubProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public SubProjections finder predicate by name
     */
  public boolean hasSubProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SubProjections is related predicate
     */
  public boolean hasSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          hasRelatedElement( theCtxt, this, theSubProjections);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SubProjections index access
     */
  public int indexOfSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          indexOfRelatedElement( theCtxt, this, theSubProjections);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role SubProjections
     */
  public void addSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        addRelatedElement( theCtxt, this, theSubProjections);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role SubProjections
     */
  public void addSubProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeSubProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        addRelatedElementBefore( theCtxt, this, theSubProjections, theRelativeSubProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role SubProjections
     */
  public void moveSubProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeSubProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        moveRelatedElementBefore( theCtxt, this, theSubProjections, theRelativeSubProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role SubProjections
     */
  public void moveSubProjectionsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
        moveRelatedElementToLast( theCtxt, this, theSubProjections);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role SubProjections
     */
  public void removeSubProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSubProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections).
          removeRelatedElement( theCtxt, this, theSubProjections);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for ONE relationship SuperProjection
 ****************************************************************************/


    /* Public Read accessor for role SuperProjection
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSuperProjection( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public SuperProjection number access
     */
  public int numSuperProjection( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public SuperProjection read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getSuperProjectionAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public SuperProjection finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findSuperProjectionNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public SuperProjection finder predicate by name
     */
  public boolean hasSuperProjectionNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SuperProjection is related predicate
     */
  public boolean hasSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
          hasRelatedElement( theCtxt, this, theSuperProjection);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SuperProjection index access
     */
  public int indexOfSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
          indexOfRelatedElement( theCtxt, this, theSuperProjection);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role SuperProjection
     */
  public void setSuperProjection( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theSuperProjection) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection).
        setRelatedElement( theCtxt, this, theSuperProjection);
    } catch( ClassCastException anEx) {}
  }











/****************************************************************************
 *  Implementation of destructor of KitProjection
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
      vm3Type = com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.getStaticM3Type( theCtxt);
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

