package com.dosmil_e.kit.core.model.define.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public  class KitAbstractLinkMeta {

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
	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelInverseOFlinks;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelLinkOwner;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelConnectedPort;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelLink;

	public static com.dosmil_e.m3.core.ifc.M3RelationshipIfc vm3RelSourceOfAnnnotations;





/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 1 : init all metainfo, except links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase1( EAIMMCtxtIfc theCtxt) throws EAIException {
		 vm3Type = (com.dosmil_e.m3.core.ifc.M3TypeIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Type", "core",new EAIMMName("AbstractLink"));
		 vm3Type.setIsEnumeration( theCtxt, false);
		 vm3Type.setIsPrimitive( theCtxt, false);
		 vm3Type.setIsAbstract( theCtxt, true);




		vm3RelInverseOFlinks = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("inverseOFlinks"));
		vm3Type.addRelationships( theCtxt, vm3RelInverseOFlinks);
		vm3RelInverseOFlinks.setKind( theCtxt, "Many");
		vm3RelInverseOFlinks.setMinMult( theCtxt, "0");
		vm3RelInverseOFlinks.setMaxMult( theCtxt, "*");
		vm3RelInverseOFlinks.setIsDerived( theCtxt, false);
		vm3RelInverseOFlinks.setIsDummy( theCtxt, true);

		vm3RelLinkOwner = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("linkOwner"));
		vm3Type.addRelationships( theCtxt, vm3RelLinkOwner);
		vm3RelLinkOwner.setKind( theCtxt, "IsPartOf");
		vm3RelLinkOwner.setMinMult( theCtxt, "1");
		vm3RelLinkOwner.setMaxMult( theCtxt, "1");
		vm3RelLinkOwner.setIsDerived( theCtxt, false);
		vm3RelLinkOwner.setIsDummy( theCtxt, false);

		vm3RelConnectedPort = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("connectedPort"));
		vm3Type.addRelationships( theCtxt, vm3RelConnectedPort);
		vm3RelConnectedPort.setKind( theCtxt, "References");
		vm3RelConnectedPort.setMinMult( theCtxt, "1");
		vm3RelConnectedPort.setMaxMult( theCtxt, "1");
		vm3RelConnectedPort.setIsDerived( theCtxt, false);
		vm3RelConnectedPort.setIsDummy( theCtxt, false);

		vm3RelLink = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Relationship", "core",new EAIMMName("link"));
		vm3Type.addRelationships( theCtxt, vm3RelLink);
		vm3RelLink.setKind( theCtxt, "References");
		vm3RelLink.setMinMult( theCtxt, "1");
		vm3RelLink.setMaxMult( theCtxt, "1");
		vm3RelLink.setIsDerived( theCtxt, false);
		vm3RelLink.setIsDummy( theCtxt, false);


  }


/****************************************************************************
 *  Initializer of metainformation the EAIProject metamodel element
 *    phase 2 : init links to metainfo of other metamodel elements
 *    will be invoked from the model's metamodel root
 ****************************************************************************/
  public static void initM3TypePhase2( EAIMMCtxtIfc theCtxt)  throws EAIException {
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);
		vm3Type.addSuperTypes( theCtxt, com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);




		vm3RelInverseOFlinks.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelLinks);
		vm3RelInverseOFlinks.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3Type);

		vm3RelLinkOwner.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.vm3RelOwnedLinks);
		vm3RelLinkOwner.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.vm3Type);

		vm3RelConnectedPort.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks);
		vm3RelConnectedPort.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3Type);

		vm3RelLink.setInverse( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractLinkMeta.vm3RelLink);
		vm3RelLink.setRelatedType( theCtxt, com.dosmil_e.kit.core.model.define.meta.KitAbstractLinkMeta.vm3Type);

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

