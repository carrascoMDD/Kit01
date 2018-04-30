
package com.dosmil_e.kit.core.projection.behavior.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitRespondedProjectionBase 
   extends com.dosmil_e.kit.core.model.behavior.impl.KitAbstractRespondedImpl
    implements com.dosmil_e.kit.core.projection.behavior.ifc.KitRespondedProjectionIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitRespondedProjection metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitRespondedProjection metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] vrOriginalOfProjections = new com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[0]; 

	protected com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[] vrProjections = new com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[0]; 






/****************************************************************************
 *  Constructors of the KitRespondedProjection metamodel element
 ****************************************************************************/

  public KitRespondedProjectionBase() {
    super();
  }


  public KitRespondedProjectionBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitRespondedProjectionBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitRespondedProjectionIfc and KitRespondedProjectionPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitRespondedProjection
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitRespondedProjection
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship OriginalOfProjections
 ****************************************************************************/


    /* Public Read accessor for role OriginalOfProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getOriginalOfProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OriginalOfProjections number access
     */
  public int numOriginalOfProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub)
        com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OriginalOfProjections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc getOriginalOfProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OriginalOfProjections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc findOriginalOfProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OriginalOfProjections finder predicate by name
     */
  public boolean hasOriginalOfProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OriginalOfProjections is related predicate
     */
  public boolean hasOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
          hasRelatedElement( theCtxt, this, theOriginalOfProjections);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OriginalOfProjections index access
     */
  public int indexOfOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
          indexOfRelatedElement( theCtxt, this, theOriginalOfProjections);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OriginalOfProjections
     */
  public void addOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
        addRelatedElement( theCtxt, this, theOriginalOfProjections);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OriginalOfProjections
     */
  public void addOriginalOfProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeOriginalOfProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
        addRelatedElementBefore( theCtxt, this, theOriginalOfProjections, theRelativeOriginalOfProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OriginalOfProjections
     */
  public void moveOriginalOfProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theRelativeOriginalOfProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
        moveRelatedElementBefore( theCtxt, this, theOriginalOfProjections, theRelativeOriginalOfProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OriginalOfProjections
     */
  public void moveOriginalOfProjectionsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
        moveRelatedElementToLast( theCtxt, this, theOriginalOfProjections);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OriginalOfProjections
     */
  public void removeOriginalOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc theOriginalOfProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections).
          removeRelatedElement( theCtxt, this, theOriginalOfProjections);
    } catch( ClassCastException anEx) { return;}
  }





/****************************************************************************
 *  Implementation of public interface for MANY relationship Projections
 ****************************************************************************/


    /* Public Read accessor for role Projections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[] getProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public Projections number access
     */
  public int numProjections( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Projections read accessor by index
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc getProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return null;}

    try { return (com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Projections finder by name
     */
  public com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc findProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Projections finder predicate by name
     */
  public boolean hasProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Projections is related predicate
     */
  public boolean hasProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          hasRelatedElement( theCtxt, this, theProjections);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Projections index access
     */
  public int indexOfProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          indexOfRelatedElement( theCtxt, this, theProjections);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Projections
     */
  public void addProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        addRelatedElement( theCtxt, this, theProjections);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role Projections
     */
  public void addProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theRelativeProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        addRelatedElementBefore( theCtxt, this, theProjections, theRelativeProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role Projections
     */
  public void moveProjectionsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theRelativeProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        moveRelatedElementBefore( theCtxt, this, theProjections, theRelativeProjections);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role Projections
     */
  public void moveProjectionsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
        moveRelatedElementToLast( theCtxt, this, theProjections);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role Projections
     */
  public void removeProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc theProjections) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections).
          removeRelatedElement( theCtxt, this, theProjections);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of KitRespondedProjection
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
      vm3Type = com.dosmil_e.kit.core.projection.behavior.meta.KitRespondedProjectionMeta.getStaticM3Type( theCtxt);
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

