
package com.dosmil_e.kit.core.model.define.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitDelegatorBase 
   extends com.dosmil_e.kit.core.model.common.impl.KitCommonImpl
    implements com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitDelegator metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitDelegator metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] vrDelegatorOf = new com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitDelegator metamodel element
 ****************************************************************************/

  public KitDelegatorBase() {
    super();
  }


  public KitDelegatorBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitDelegatorBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitDelegatorIfc and KitDelegatorPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitDelegator
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitDelegator
 ****************************************************************************/

 
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
 *  Implementation of destructor of KitDelegator
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
      vm3Type = com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.getStaticM3Type( theCtxt);
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

