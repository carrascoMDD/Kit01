package com.dosmil_e.kit.core.model.structural.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitStructuralFeatureMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelFeatureOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelExposedAs;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("StructuralFeature"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelFeatureOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("featureOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelFeatureOwner);
		vm3RelFeatureOwner.setKind( theCtxt, "IsPartOf");
		vm3RelFeatureOwner.setMinMult( theCtxt, "1");
		vm3RelFeatureOwner.setMaxMult( theCtxt, "1");
		vm3RelFeatureOwner.setIsDerived( theCtxt, false);
		vm3RelFeatureOwner.setIsDummy( theCtxt, false);

		vm3RelExposedAs = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("exposedAs"));
		vm3Type.addRelationships( theCtxt, vm3RelExposedAs);
		vm3RelExposedAs.setKind( theCtxt, "Many");
		vm3RelExposedAs.setMinMult( theCtxt, "0");
		vm3RelExposedAs.setMaxMult( theCtxt, "*");
		vm3RelExposedAs.setIsDerived( theCtxt, false);
		vm3RelExposedAs.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);




		vm3RelFeatureOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures);
		vm3RelFeatureOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3Type);

		vm3RelExposedAs.setInverse( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.vm3RelExposed);
		vm3RelExposedAs.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.vm3Type);

		vm3RelSourceOfAnnnotations = com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations;


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

