package com.dosmil_e.kit.core.model.behavior.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitHandlerMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelHandlerOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelHandlerOfBehaviors;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("Handler"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelHandlerOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("handlerOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelHandlerOwner);
		vm3RelHandlerOwner.setKind( theCtxt, "IsPartOf");
		vm3RelHandlerOwner.setMinMult( theCtxt, "1");
		vm3RelHandlerOwner.setMaxMult( theCtxt, "1");
		vm3RelHandlerOwner.setIsDerived( theCtxt, false);
		vm3RelHandlerOwner.setIsDummy( theCtxt, false);

		vm3RelHandlerOfBehaviors = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("handlerOfBehaviors"));
		vm3Type.addRelationships( theCtxt, vm3RelHandlerOfBehaviors);
		vm3RelHandlerOfBehaviors.setKind( theCtxt, "Many");
		vm3RelHandlerOfBehaviors.setMinMult( theCtxt, "0");
		vm3RelHandlerOfBehaviors.setMaxMult( theCtxt, "*");
		vm3RelHandlerOfBehaviors.setIsDerived( theCtxt, false);
		vm3RelHandlerOfBehaviors.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.common.meta.KitCommonMeta.vm3Type);




		vm3RelHandlerOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers);
		vm3RelHandlerOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3Type);

		vm3RelHandlerOfBehaviors.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3RelHandler);
		vm3RelHandlerOfBehaviors.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3Type);


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

