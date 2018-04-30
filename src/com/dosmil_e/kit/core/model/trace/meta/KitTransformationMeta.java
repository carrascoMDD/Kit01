package com.dosmil_e.kit.core.model.trace.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitTransformationMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTarget;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSuperTransformation;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSubTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Transformation"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, false);




		vm3RelTarget = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("target"));
		vm3Type.addRelationships( theCtxt, vm3RelTarget);
		vm3RelTarget.setKind( theCtxt, "IsPartOf");
		vm3RelTarget.setMinMult( theCtxt, "0");
		vm3RelTarget.setMaxMult( theCtxt, "1");
		vm3RelTarget.setIsDerived( theCtxt, false);
		vm3RelTarget.setIsDummy( theCtxt, false);

		vm3RelSuperTransformation = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("superTransformation"));
		vm3Type.addRelationships( theCtxt, vm3RelSuperTransformation);
		vm3RelSuperTransformation.setKind( theCtxt, "IsPartOf");
		vm3RelSuperTransformation.setMinMult( theCtxt, "0");
		vm3RelSuperTransformation.setMaxMult( theCtxt, "1");
		vm3RelSuperTransformation.setIsDerived( theCtxt, false);
		vm3RelSuperTransformation.setIsDummy( theCtxt, false);

		vm3RelSubTransformations = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("subTransformations"));
		vm3Type.addRelationships( theCtxt, vm3RelSubTransformations);
		vm3RelSubTransformations.setKind( theCtxt, "Aggregates");
		vm3RelSubTransformations.setMinMult( theCtxt, "0");
		vm3RelSubTransformations.setMaxMult( theCtxt, "*");
		vm3RelSubTransformations.setIsDerived( theCtxt, false);
		vm3RelSubTransformations.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.vm3Type);




		vm3RelTarget.setInverse( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations);
		vm3RelTarget.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);

		vm3RelSuperTransformation.setInverse( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations);
		vm3RelSuperTransformation.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3Type);

		vm3RelSubTransformations.setInverse( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSuperTransformation);
		vm3RelSubTransformations.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3Type);


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

