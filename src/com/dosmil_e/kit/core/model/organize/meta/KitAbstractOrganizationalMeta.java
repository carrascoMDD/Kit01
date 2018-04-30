package com.dosmil_e.kit.core.model.organize.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitAbstractOrganizationalMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedAssemblies;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedInfoTypes;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelOwnedPorts;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSubPackages;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelTransformations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("AbstractOrganizational"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);





  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);




		vm3RelOwnedAssemblies = com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3RelOwnedAssemblies;

		vm3RelOwnedInfoTypes = com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes;

		vm3RelOwnedPorts = com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.vm3RelOwnedPorts;

		vm3RelSourceOfAnnnotations = com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations;

		vm3RelSubPackages = com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.vm3RelSubPackages;

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

