
package com.dosmil_e.kit.core.model.define.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitDelegationBase 
   extends com.dosmil_e.kit.core.model.trace.impl.KitSourceImpl
    implements com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;


/****************************************************************************
 *  State storage for Attributes of the KitDelegation metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the KitDelegation metamodel element
 ****************************************************************************/
	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc vrDelegationOwner; 

	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc vrDelegator; 

	protected com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc vrDelegate; 

	protected com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] vrTransformations = new com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[0]; 






/****************************************************************************
 *  Constructors of the KitDelegation metamodel element
 ****************************************************************************/

  public KitDelegationBase() {
    super();
  }


  public KitDelegationBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public KitDelegationBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the KitDelegationIfc and KitDelegationPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of KitDelegation
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of KitDelegation
 ****************************************************************************/

 

/****************************************************************************
 *  Implementation of public interface for ONE relationship DelegationOwner
 ****************************************************************************/


    /* Public Read accessor for role DelegationOwner
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc getDelegationOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public DelegationOwner number access
     */
  public int numDelegationOwner( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public DelegationOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc getDelegationOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public DelegationOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc findDelegationOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public DelegationOwner finder predicate by name
     */
  public boolean hasDelegationOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegationOwner is related predicate
     */
  public boolean hasDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
          hasRelatedElement( theCtxt, this, theDelegationOwner);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public DelegationOwner index access
     */
  public int indexOfDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
          indexOfRelatedElement( theCtxt, this, theDelegationOwner);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role DelegationOwner
     */
  public void setDelegationOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc theDelegationOwner) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegationOwner).
        setRelatedElement( theCtxt, this, theDelegationOwner);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship Delegator
 ****************************************************************************/


    /* Public Read accessor for role Delegator
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc getDelegator( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Delegator number access
     */
  public int numDelegator( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Delegator read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc getDelegatorAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Delegator finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc findDelegatorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Delegator finder predicate by name
     */
  public boolean hasDelegatorNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Delegator is related predicate
     */
  public boolean hasDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
          hasRelatedElement( theCtxt, this, theDelegator);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Delegator index access
     */
  public int indexOfDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
          indexOfRelatedElement( theCtxt, this, theDelegator);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Delegator
     */
  public void setDelegator( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc theDelegator) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator).
        setRelatedElement( theCtxt, this, theDelegator);
    } catch( ClassCastException anEx) {}
  }








/****************************************************************************
 *  Implementation of public interface for ONE relationship Delegate
 ****************************************************************************/


    /* Public Read accessor for role Delegate
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc getDelegate( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
        getRelatedElement( theCtxt, this);
    }
    catch( ClassCastException anEx) { return null;}
  }



    /* Public Delegate number access
     */
  public int numDelegate( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { return 0;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return  0;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
          numRelatedElements( theCtxt, this);
    } catch( ClassCastException anEx) { return 0;}
  }



    /* Public Delegate read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc getDelegateAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return null;}

    try { return (com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc)
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
        getRelatedElementAt( theCtxt, this, theIndex);
    }
    catch( ClassCastException anEx) { return null;}
  }




    /* Public Delegate finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc findDelegateNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { return null;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return  null;}

    try {
      return (com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc)
        ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
          findRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return null;}
  }



    /* Public Delegate finder predicate by name
     */
  public boolean hasDelegateNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
          hasRelatedElementNamed( theCtxt, this, theMMName);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Delegate is related predicate
     */
  public boolean hasDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException {
    if( theCtxt == null) { return false;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return  false;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
          hasRelatedElement( theCtxt, this, theDelegate);
    } catch( ClassCastException anEx) { return false;}
  }


    /* Public Delegate index access
     */
  public int indexOfDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException {
    if( theCtxt == null) { return -1;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return  -1;}

    try {
      return ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
          indexOfRelatedElement( theCtxt, this, theDelegate);
    } catch( ClassCastException anEx) { return -1;}
  }




    /* Public Write accessor for role Delegate
     */
  public void setDelegate( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc theDelegate) throws EAIException {
    if( theCtxt == null) { return;}
    getM3Type( theCtxt);
    if( com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate == null) { return;}

    try {
      ((com.dosmil_e.m3.core.pub.M3RelationshipPub) com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegate).
        setRelatedElement( theCtxt, this, theDelegate);
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
 *  Implementation of destructor of KitDelegation
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
      vm3Type = com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.getStaticM3Type( theCtxt);
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

