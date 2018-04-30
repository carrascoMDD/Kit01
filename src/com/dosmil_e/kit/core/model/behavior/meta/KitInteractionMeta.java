package com.dosmil_e.kit.core.model.behavior.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitInteractionMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedStimuli;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInteractionOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Interaction"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelOwnedStimuli = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("ownedStimuli"));
		vm3Type.addRelationships( theCtxt, vm3RelOwnedStimuli);
		vm3RelOwnedStimuli.setKind( theCtxt, "Aggregates");
		vm3RelOwnedStimuli.setMinMult( theCtxt, "0");
		vm3RelOwnedStimuli.setMaxMult( theCtxt, "*");
		vm3RelOwnedStimuli.setIsDerived( theCtxt, false);
		vm3RelOwnedStimuli.setIsDummy( theCtxt, false);

		vm3RelInteractionOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("interactionOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelInteractionOwner);
		vm3RelInteractionOwner.setKind( theCtxt, "IsPartOf");
		vm3RelInteractionOwner.setMinMult( theCtxt, "1");
		vm3RelInteractionOwner.setMaxMult( theCtxt, "1");
		vm3RelInteractionOwner.setIsDerived( theCtxt, false);
		vm3RelInteractionOwner.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitActivationMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);




		vm3RelOwnedStimuli.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.vm3RelStimuliOfInteractions);
		vm3RelOwnedStimuli.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.vm3Type);

		vm3RelInteractionOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions);
		vm3RelInteractionOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3Type);

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

