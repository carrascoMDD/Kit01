package com.dosmil_e.kit.core.model.behavior.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitAbstractBehaviorInHandlerMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelHandler;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelDispatcher;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("AbstractBehaviorInHandler"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelHandler = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("handler"));
		vm3Type.addRelationships( theCtxt, vm3RelHandler);
		vm3RelHandler.setKind( theCtxt, "References");
		vm3RelHandler.setMinMult( theCtxt, "1");
		vm3RelHandler.setMaxMult( theCtxt, "1");
		vm3RelHandler.setIsDerived( theCtxt, false);
		vm3RelHandler.setIsDummy( theCtxt, false);

		vm3RelDispatcher = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("dispatcher"));
		vm3Type.addRelationships( theCtxt, vm3RelDispatcher);
		vm3RelDispatcher.setKind( theCtxt, "References");
		vm3RelDispatcher.setMinMult( theCtxt, "1");
		vm3RelDispatcher.setMaxMult( theCtxt, "1");
		vm3RelDispatcher.setIsDerived( theCtxt, false);
		vm3RelDispatcher.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3Type);




		vm3RelHandler.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.vm3RelHandlerOfBehaviors);
		vm3RelHandler.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.vm3Type);

		vm3RelDispatcher.setInverse( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.vm3RelDispatcherOfBehaviors);
		vm3RelDispatcher.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.vm3Type);


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

