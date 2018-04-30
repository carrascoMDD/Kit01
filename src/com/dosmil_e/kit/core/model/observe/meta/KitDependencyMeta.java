package com.dosmil_e.kit.core.model.observe.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitDependencyMeta {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;

         

/****************************************************************************
 *  Static metainformation for Attributes of the EAIProject metamodel element
 ****************************************************************************/
		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrPath;

		public static com.dosmil_e.m3.core.ifc.M3AttributeIfc vm3AttrSchedule;



/****************************************************************************
 *  Static metainformation for Relationships of the EAIProject metamodel element
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDependencyOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedBehaviors;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Dependency"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);


		vm3AttrPath = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("path"));
		vm3Type.addAttributes( theCtxt, vm3AttrPath);

		vm3AttrSchedule = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Attribute", "core",new EAIMMName("schedule"));
		vm3Type.addAttributes( theCtxt, vm3AttrSchedule);



		vm3RelDependencyOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("dependencyOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelDependencyOwner);
		vm3RelDependencyOwner.setKind( theCtxt, "IsPartOf");
		vm3RelDependencyOwner.setMinMult( theCtxt, "1");
		vm3RelDependencyOwner.setMaxMult( theCtxt, "1");
		vm3RelDependencyOwner.setIsDerived( theCtxt, false);
		vm3RelDependencyOwner.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.observe.meta.KitActivationMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitActivationMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);


		vm3AttrSchedule.setValueType( theCtxt, com.dosmil_e.kit.core.model.support.meta.KitScheduleKindMeta.vm3Type);



		vm3RelDependencyOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3RelOwnedDependencies);
		vm3RelDependencyOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3Type);

		vm3RelOwnedBehaviors = com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors;

		vm3RelSourceOfAnnnotations = com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations;

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

