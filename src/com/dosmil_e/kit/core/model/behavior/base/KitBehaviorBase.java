
package com.dosmil_e.kit.core.model.behavior.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitBehaviorBase 
   extends com.dosmil_e.kit.core.model.trace.impl.KitSourceImpl
    implements com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitBehavior metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitBehavior metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc vrBehaviorOwner; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] vrTransformations = new com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitBehavior metamodel element
 ****************************************************************************/

  public KitBehaviorBase() {
    super();
  }


  public KitBehaviorBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitBehaviorBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitBehaviorIfc and KitBehaviorPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitBehavior
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitBehavior
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship BehaviorOwner
 ****************************************************************************/


    /* Public Read accessor for role BehaviorOwner
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc getBehaviorOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public BehaviorOwner number access
     */
  public int numBehaviorOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public BehaviorOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc getBehaviorOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public BehaviorOwner finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc findBehaviorOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public BehaviorOwner finder predicate by name
     */
  public boolean hasBehaviorOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public BehaviorOwner is related predicate
     */
  public boolean hasBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
          hasRelatedElement( theCtxt, this, theBehaviorOwner);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public BehaviorOwner index access
     */
  public int indexOfBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
          indexOfRelatedElement( theCtxt, this, theBehaviorOwner);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role BehaviorOwner
     */
  public void setBehaviorOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc theBehaviorOwner) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3RelBehaviorOwner).
        setRelatedElement( theCtxt, this, theBehaviorOwner);
    } catch( ClassCastException anEx) {}
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
 *  Implementation of destructor of KitBehavior
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
      vm3Type = com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.getStaticM3Type( theCtxt);
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

