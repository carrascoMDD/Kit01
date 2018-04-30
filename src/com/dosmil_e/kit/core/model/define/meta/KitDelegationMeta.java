package com.dosmil_e.kit.core.model.define.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitDelegationMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/


/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDelegationOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDelegator;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDelegate;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Delegation"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelDelegationOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("delegationOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelDelegationOwner);
		vm3RelDelegationOwner.setKind( theCtxt, "IsPartOf");
		vm3RelDelegationOwner.setMinMult( theCtxt, "1");
		vm3RelDelegationOwner.setMaxMult( theCtxt, "1");
		vm3RelDelegationOwner.setIsDerived( theCtxt, false);
		vm3RelDelegationOwner.setIsDummy( theCtxt, false);

		vm3RelDelegator = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("delegator"));
		vm3Type.addRelationships( theCtxt, vm3RelDelegator);
		vm3RelDelegator.setKind( theCtxt, "References");
		vm3RelDelegator.setMinMult( theCtxt, "1");
		vm3RelDelegator.setMaxMult( theCtxt, "1");
		vm3RelDelegator.setIsDerived( theCtxt, false);
		vm3RelDelegator.setIsDummy( theCtxt, false);

		vm3RelDelegate = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("delegate"));
		vm3Type.addRelationships( theCtxt, vm3RelDelegate);
		vm3RelDelegate.setKind( theCtxt, "References");
		vm3RelDelegate.setMinMult( theCtxt, "1");
		vm3RelDelegate.setMaxMult( theCtxt, "1");
		vm3RelDelegate.setIsDerived( theCtxt, false);
		vm3RelDelegate.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);




		vm3RelDelegationOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3RelOwnedDelegations);
		vm3RelDelegationOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3Type);

		vm3RelDelegator.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf);
		vm3RelDelegator.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3Type);

		vm3RelDelegate.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf);
		vm3RelDelegate.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3Type);

		vm3RelTransformations = com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations;


  }




/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type != null) { return vm3Type;}
    com.dosmil_e.kit.meta.Kit01.initM3( theCtxt);
    return vm3Type;
  }




/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -3331123456100000003L;


}

