
package com.dosmil_e.kit.core.model.trace.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitTransformationBase 
   extends com.dosmil_e.kit.core.model.trace.impl.KitAnnotationImpl
    implements com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitTransformation metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitTransformation metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc vrTarget; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc vrSuperTransformation; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] vrSubTransformations = new com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitTransformation metamodel element
 ****************************************************************************/

  public KitTransformationBase() {
    super();
  }


  public KitTransformationBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitTransformationBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitTransformationIfc and KitTransformationPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitTransformation
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitTransformation
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship Target
 ****************************************************************************/


    /* Public Read accessor for role Target
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc getTarget( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Target number access
     */
  public int numTarget( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Target read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc getTargetAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Target finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc findTargetNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Target finder predicate by name
     */
  public boolean hasTargetNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Target is related predicate
     */
  public boolean hasTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
          hasRelatedElement( theCtxt, this, theTarget);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Target index access
     */
  public int indexOfTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
          indexOfRelatedElement( theCtxt, this, theTarget);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Target
     */
  public void setTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelTarget).
        setRelatedElement( theCtxt, this, theTarget);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship SuperTransformation
 ****************************************************************************/


    /* Public Read accessor for role SuperTransformation
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSuperTransformation( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public SuperTransformation number access
     */
  public int numSuperTransformation( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public SuperTransformation read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSuperTransformationAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public SuperTransformation finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findSuperTransformationNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public SuperTransformation finder predicate by name
     */
  public boolean hasSuperTransformationNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SuperTransformation is related predicate
     */
  public boolean hasSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
          hasRelatedElement( theCtxt, this, theSuperTransformation);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SuperTransformation index access
     */
  public int indexOfSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
          indexOfRelatedElement( theCtxt, this, theSuperTransformation);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role SuperTransformation
     */
  public void setSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation).
        setRelatedElement( theCtxt, this, theSuperTransformation);
    } catch( ClassCastException anEx) {}
  }







/****************************************************************************
 *  Implementation of public interface for MANY relationship SubTransformations
 ****************************************************************************/


    /* Public Read accessor for role SubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] getSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public SubTransformations number access
     */
  public int numSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public SubTransformations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public SubTransformations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public SubTransformations finder predicate by name
     */
  public boolean hasSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SubTransformations is related predicate
     */
  public boolean hasSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          hasRelatedElement( theCtxt, this, theSubTransformations);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public SubTransformations index access
     */
  public int indexOfSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          indexOfRelatedElement( theCtxt, this, theSubTransformations);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role SubTransformations
     */
  public void addSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        addRelatedElement( theCtxt, this, theSubTransformations);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role SubTransformations
     */
  public void addSubTransformationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeSubTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        addRelatedElementBefore( theCtxt, this, theSubTransformations, theRelativeSubTransformations);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role SubTransformations
     */
  public void moveSubTransformationsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeSubTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        moveRelatedElementBefore( theCtxt, this, theSubTransformations, theRelativeSubTransformations);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role SubTransformations
     */
  public void moveSubTransformationsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
        moveRelatedElementToLast( theCtxt, this, theSubTransformations);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role SubTransformations
     */
  public void removeSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations).
          removeRelatedElement( theCtxt, this, theSubTransformations);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of KitTransformation
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
      vm3Type = com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.getStaticM3Type( theCtxt);
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

