package com.dosmil_e.kit.core.projection.projecting.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitProjectionMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOriginals;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSubProjections;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSuperProjection;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Projection"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelOriginals = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("originals"));
		vm3Type.addRelationships( theCtxt, vm3RelOriginals);
		vm3RelOriginals.setKind( theCtxt, "Many");
		vm3RelOriginals.setMinMult( theCtxt, "0");
		vm3RelOriginals.setMaxMult( theCtxt, "*");
		vm3RelOriginals.setIsDerived( theCtxt, false);
		vm3RelOriginals.setIsDummy( theCtxt, false);

		vm3RelSubProjections = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("subProjections"));
		vm3Type.addRelationships( theCtxt, vm3RelSubProjections);
		vm3RelSubProjections.setKind( theCtxt, "Aggregates");
		vm3RelSubProjections.setMinMult( theCtxt, "0");
		vm3RelSubProjections.setMaxMult( theCtxt, "*");
		vm3RelSubProjections.setIsDerived( theCtxt, false);
		vm3RelSubProjections.setIsDummy( theCtxt, false);

		vm3RelSuperProjection = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("superProjection"));
		vm3Type.addRelationships( theCtxt, vm3RelSuperProjection);
		vm3RelSuperProjection.setKind( theCtxt, "IsPartOf");
		vm3RelSuperProjection.setMinMult( theCtxt, "0");
		vm3RelSuperProjection.setMaxMult( theCtxt, "1");
		vm3RelSuperProjection.setIsDerived( theCtxt, false);
		vm3RelSuperProjection.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.common.meta.KitCommonMeta.vm3Type);




		vm3RelOriginals.setInverse( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3RelOriginalOfProjections);
		vm3RelOriginals.setRelatedType( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3Type);

		vm3RelSubProjections.setInverse( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSuperProjection);
		vm3RelSubProjections.setRelatedType( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3Type);

		vm3RelSuperProjection.setInverse( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections);
		vm3RelSuperProjection.setRelatedType( theCtxt, com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3Type);


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

