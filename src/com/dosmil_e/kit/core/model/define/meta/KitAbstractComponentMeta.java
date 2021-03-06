package com.dosmil_e.kit.core.model.define.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitAbstractComponentMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelComponentOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedAssemblies;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedDelegations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedDependencies;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedDispatchers;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedHandlers;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedInfoTypes;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedStructuralFeatures;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("AbstractComponent"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelComponentOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("componentOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelComponentOwner);
		vm3RelComponentOwner.setKind( theCtxt, "IsPartOf");
		vm3RelComponentOwner.setMinMult( theCtxt, "0");
		vm3RelComponentOwner.setMaxMult( theCtxt, "1");
		vm3RelComponentOwner.setIsDerived( theCtxt, false);
		vm3RelComponentOwner.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);




		vm3RelComponentOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.vm3RelOwnedComponents);
		vm3RelComponentOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.vm3Type);

		vm3RelOwnedAssemblies = com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3RelOwnedAssemblies;

		vm3RelOwnedDelegations = com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3RelOwnedDelegations;

		vm3RelOwnedDependencies = com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3RelOwnedDependencies;

		vm3RelOwnedDispatchers = com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers;

		vm3RelOwnedHandlers = com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers;

		vm3RelOwnedInfoTypes = com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes;

		vm3RelOwnedStructuralFeatures = com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures;

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

