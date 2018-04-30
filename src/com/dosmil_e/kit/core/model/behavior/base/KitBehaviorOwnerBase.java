
package com.dosmil_e.kit.core.model.behavior.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitBehaviorOwnerBase 
   extends com.dosmil_e.kit.core.model.common.impl.KitCommonImpl
    implements com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitBehaviorOwner metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitBehaviorOwner metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[] vrOwnedBehaviors = new com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[0]; 






/****************************************************************************
 *  Constructors of the KitBehaviorOwner metamodel element
 ****************************************************************************/

  public KitBehaviorOwnerBase() {
    super();
  }


  public KitBehaviorOwnerBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitBehaviorOwnerBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitBehaviorOwnerIfc and KitBehaviorOwnerPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitBehaviorOwner
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitBehaviorOwner
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY relationship OwnedBehaviors
 ****************************************************************************/


    /* Public Read accessor for role OwnedBehaviors
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[] getOwnedBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[])
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        getRelatedElements( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }





    /* Public OwnedBehaviors number access
     */
  public int numOwnedBehaviors( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public OwnedBehaviors read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc getOwnedBehaviorsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public OwnedBehaviors finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc findOwnedBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public OwnedBehaviors finder predicate by name
     */
  public boolean hasOwnedBehaviorsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedBehaviors is related predicate
     */
  public boolean hasOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          hasRelatedElement( theCtxt, this, theOwnedBehaviors);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public OwnedBehaviors index access
     */
  public int indexOfOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          indexOfRelatedElement( theCtxt, this, theOwnedBehaviors);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role OwnedBehaviors
     */
  public void addOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        addRelatedElement( theCtxt, this, theOwnedBehaviors);
    } catch( ClassCastException anEx) {}
  }


    /* Public ordered Write accessor for role OwnedBehaviors
     */
  public void addOwnedBehaviorsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors,
    com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theRelativeOwnedBehaviors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        addRelatedElementBefore( theCtxt, this, theOwnedBehaviors, theRelativeOwnedBehaviors);
    } catch( ClassCastException anEx) {}
  }



    /* Public reorder accessor for role OwnedBehaviors
     */
  public void moveOwnedBehaviorsBefore(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors,
    com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theRelativeOwnedBehaviors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        moveRelatedElementBefore( theCtxt, this, theOwnedBehaviors, theRelativeOwnedBehaviors);
    } catch( ClassCastException anEx) {}
  }



    /* Public move to last accessor for role OwnedBehaviors
     */
  public void moveOwnedBehaviorsToLast(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException {

    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
        moveRelatedElementToLast( theCtxt, this, theOwnedBehaviors);
    } catch( ClassCastException anEx) {}
  }





    /* Public Write accessor for role OwnedBehaviors
     */
  public void removeOwnedBehaviors( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc theOwnedBehaviors) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors).
          removeRelatedElement( theCtxt, this, theOwnedBehaviors);
    } catch( ClassCastException anEx) { return;}
  }








/****************************************************************************
 *  Implementation of destructor of KitBehaviorOwner
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
      vm3Type = com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.getStaticM3Type( theCtxt);
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

