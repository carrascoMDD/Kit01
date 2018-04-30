package com.dosmil_e.kit.meta;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


public class Kit01 {


/****************************************************************************
 *  Static metainformation for all the metamodel elements in the M3 model
 ****************************************************************************/
  protected static com.dosmil_e.m3.core.ifc.M3ModelIfc vm3Model;


/****************************************************************************
 *  Static metainformation for the root module in the M3 model
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3RootModule;

  
/****************************************************************************
 *  Static metainformation for all the modules in the M3 model
 ****************************************************************************/
	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionBehavior;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelBehavior;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelCommon;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleKit01Core;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionDefine;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelDefine;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelEdoc;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionEdoc;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleCom;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleDosmil_e;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleKit;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleCoreModel;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelObserve;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelOrganize;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionOrganize;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionProjecting;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleCoreProjection;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleProjectionStructural;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelStructural;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelSupport;

	public static com.dosmil_e.m3.core.ifc.M3ModuleIfc vm3ModuleModelTrace;





/****************************************************************************
 *  Access and initialization of metainformation for all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( EAIMMCtxtIfc theCtxt) {
    if( vm3Model != null) { return vm3Model;}
    initM3( theCtxt);
    return vm3Model;
  }



/****************************************************************************
 *  Initialization of metainformation for all the metamodel elements
 *    Invokes metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static void initM3(  EAIMMCtxtIfc theCtxt) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initM3Internal( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
   } catch( EAIException anEx) {}
  }




  protected static void initM3Internal(  EAIMMCtxtIfc theCtxt) {
   try {
		 vm3Model = (com.dosmil_e.m3.core.ifc.M3ModelIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Model", "core",new EAIMMName("Kit01"));
		 vm3Model.setTypePrefix( theCtxt, "Kit");
		 vm3Model.setRelationshipVariablePrefix( theCtxt, "vr");
		 vm3Model.setAttributeVariablePrefix( theCtxt, "va");
		 vm3Model.setEnumVariablePrefix( theCtxt, "");
		 vm3Model.setMetaVariablePrefix( theCtxt, "vm3");
		 vm3Model.setMetaPackageName( theCtxt, "com.dosmil_e.m3.core");
		 vm3Model.setFrameworkPackageName( theCtxt, "com.dosmil_e.modelbase");
		 vm3Model.setFromSpecificationFileNamed( theCtxt, "Q:\\BXS\\EAI\\Studio\\Kit01\\docs\\KitScenarios09.cdl");
		 vm3Model.setPackageName( theCtxt, "com.dosmil_e.kit");
		 vm3Model.setTemplatesDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\EAIModelBase01\\templatesdynamicreduced");
		 vm3Model.setProjectName( theCtxt, "Kit01GenKK.jpr");
		 vm3Model.setProjectDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\Kit01\\");
		 vm3Model.setOutputDirectoryName( theCtxt, "Q:\\BXS\\EAI\\Studio\\Kit01\\mySrc");
		 vm3Model.setSerialVersionUIDPrefix( theCtxt, "33311234561");
		 vm3Model.setSkipTypes( theCtxt,  new String[] { "MMElement" } );
		 vm3Model.setSkipModules( theCtxt,  new String[] { "usecases","TravelSample" } );
		 vm3Model.setDefaultSuperTypeFullBaseClassName( theCtxt, "com.dosmil_e.m3.withm3.base.MMElementWithM3Base");
		 vm3Model.setDefaultSuperTypeFullIfcClassName( theCtxt, "com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc");
		 vm3Model.setDefaultSuperTypeFullPrivClassName( theCtxt, "com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv");
		 vm3Model.setDefaultSuperTypeFullPubClassName( theCtxt, "com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub");
		 vm3Model.setDefaultSuperTypeFullTrxClassName( theCtxt, "com.dosmil_e.m3.withm3.trx.MMElementWithM3Trx");








		com.dosmil_e.kit.core.projection.organize.meta.KitProjectProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.organize.meta.KitPackageProjectionMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.projection.behavior.meta.KitBehaviorInHandlerProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitListenedProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitRequestedProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitRespondedProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitSignaledProjectionMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.projection.structural.meta.KitAttributeProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitEnumeratedTypeProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitPrimitiveJavaClassProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitStructuredJavaClassProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitReferenceProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitDocumentProjectionMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.projection.define.meta.KitAliasProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitAssemblyProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitComponentProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitLinkProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitPortProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitRelayProjectionMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitHideMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitFachadeMeta.initM3TypePhase1( theCtxt);




		com.dosmil_e.kit.core.model.behavior.meta.KitUnidirectionalInteractionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractSignaledMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractListenedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRequestedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRespondedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitJavaMethodDispatcherMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitActivationMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitSignaledMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitListenedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitRequestedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitRespondedMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorInHandlerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitReturnMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractComponentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractAssemblyMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractRelayMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractAliasMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractLinkMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitComponentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAssemblyMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitLinkMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitRelayMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAliasMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitPortMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.support.meta.KitDirectionKindMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.support.meta.KitScheduleKindMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.support.meta.KitSynthesisModeMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.observe.meta.KitActivationMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.observe.meta.KitDependencyMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.common.meta.KitCommonMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractAttributeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractReferenceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedValueMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractPrimitiveJavaClassMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitNativeResourceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractStructuredJavaClassMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractDocumentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveJavaClassMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuredJavaClassMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitDocumentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureTypingMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuredTypeMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.edoc.meta.KitProcessTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitBusinessSignalMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitContentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitCommunityMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInteractionPortalMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInteractionInterfaceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitCompositeProcessMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitBusinessProcessMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitPrimitiveProcessMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitConnectionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInternalRoleMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitExternalRoleMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitResourceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitStructuralTypeMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitReferenceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitAttributeMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitSynthesisMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitVersionMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitURLMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitMediaMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitCommentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitAttachmentMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitExclusionMeta.initM3TypePhase1( theCtxt);


		com.dosmil_e.kit.core.model.organize.meta.KitAbstractOrganizationalMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitAbstractProjectMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitAbstractPackageMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitProjectMeta.initM3TypePhase1( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitPackageMeta.initM3TypePhase1( theCtxt);












		com.dosmil_e.kit.core.projection.organize.meta.KitProjectProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.organize.meta.KitPackageProjectionMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.projection.behavior.meta.KitBehaviorInHandlerProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitListenedProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitRequestedProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitRespondedProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.behavior.meta.KitSignaledProjectionMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.projection.structural.meta.KitAttributeProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitEnumeratedTypeProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitPrimitiveJavaClassProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitStructuredJavaClassProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitReferenceProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.structural.meta.KitDocumentProjectionMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.projection.define.meta.KitAliasProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitAssemblyProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitComponentProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitLinkProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitPortProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.define.meta.KitRelayProjectionMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitHideMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.projection.projecting.meta.KitFachadeMeta.initM3TypePhase2( theCtxt);




		com.dosmil_e.kit.core.model.behavior.meta.KitUnidirectionalInteractionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractSignaledMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractListenedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRequestedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRespondedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitJavaMethodDispatcherMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitActivationMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitSignaledMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitListenedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitRequestedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitRespondedMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorInHandlerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.behavior.meta.KitReturnMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractComponentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractAssemblyMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractRelayMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractAliasMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAbstractLinkMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitComponentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAssemblyMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitLinkMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitRelayMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitAliasMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.define.meta.KitPortMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.support.meta.KitDirectionKindMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.support.meta.KitScheduleKindMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.support.meta.KitSynthesisModeMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.observe.meta.KitActivationMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.observe.meta.KitDependencyMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.common.meta.KitCommonMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractAttributeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractReferenceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedValueMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractPrimitiveJavaClassMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitNativeResourceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractStructuredJavaClassMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitAbstractDocumentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveJavaClassMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuredJavaClassMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitDocumentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureTypingMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.structural.meta.KitStructuredTypeMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.edoc.meta.KitProcessTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitBusinessSignalMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitContentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitCommunityMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInteractionPortalMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInteractionInterfaceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitCompositeProcessMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitBusinessProcessMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitPrimitiveProcessMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitConnectionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitInternalRoleMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitExternalRoleMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitResourceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitStructuralTypeMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitReferenceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.edoc.meta.KitAttributeMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitSynthesisMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitVersionMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitURLMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitMediaMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitCommentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitAttachmentMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.trace.meta.KitExclusionMeta.initM3TypePhase2( theCtxt);


		com.dosmil_e.kit.core.model.organize.meta.KitAbstractOrganizationalMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitAbstractProjectMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitAbstractPackageMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitProjectMeta.initM3TypePhase2( theCtxt);
		com.dosmil_e.kit.core.model.organize.meta.KitPackageMeta.initM3TypePhase2( theCtxt);









		vm3ModuleCom = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("com"));
		vm3RootModule = vm3ModuleCom;
		vm3Model.addSubModules( theCtxt, vm3ModuleCom);
		vm3ModuleDosmil_e = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("dosmil_e"));
		vm3ModuleCom.addSubModules( theCtxt, vm3ModuleDosmil_e);
		vm3ModuleKit = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("kit"));
		vm3ModuleDosmil_e.addSubModules( theCtxt, vm3ModuleKit);


		vm3ModuleKit01Core = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("core"));
		vm3ModuleKit.addSubModules( theCtxt, vm3ModuleKit01Core);

		vm3ModuleCoreProjection = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("projection"));
		vm3ModuleKit01Core.addSubModules( theCtxt, vm3ModuleCoreProjection);

		vm3ModuleProjectionEdoc = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("edoc"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionEdoc);


		vm3ModuleProjectionOrganize = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("organize"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionOrganize);
		vm3ModuleProjectionOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.projection.organize.meta.KitProjectProjectionMeta.vm3Type);
		vm3ModuleProjectionOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.projection.organize.meta.KitPackageProjectionMeta.vm3Type);


		vm3ModuleProjectionBehavior = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("behavior"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionBehavior);
		vm3ModuleProjectionBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.projection.behavior.meta.KitBehaviorInHandlerProjectionMeta.vm3Type);
		vm3ModuleProjectionBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.projection.behavior.meta.KitListenedProjectionMeta.vm3Type);
		vm3ModuleProjectionBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.projection.behavior.meta.KitRequestedProjectionMeta.vm3Type);
		vm3ModuleProjectionBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.projection.behavior.meta.KitRespondedProjectionMeta.vm3Type);
		vm3ModuleProjectionBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.projection.behavior.meta.KitSignaledProjectionMeta.vm3Type);


		vm3ModuleProjectionStructural = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("structural"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionStructural);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitAttributeProjectionMeta.vm3Type);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitEnumeratedTypeProjectionMeta.vm3Type);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitPrimitiveJavaClassProjectionMeta.vm3Type);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitStructuredJavaClassProjectionMeta.vm3Type);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitReferenceProjectionMeta.vm3Type);
		vm3ModuleProjectionStructural.addTypes( theCtxt,com.dosmil_e.kit.core.projection.structural.meta.KitDocumentProjectionMeta.vm3Type);


		vm3ModuleProjectionDefine = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("define"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionDefine);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitAliasProjectionMeta.vm3Type);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitAssemblyProjectionMeta.vm3Type);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitComponentProjectionMeta.vm3Type);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitLinkProjectionMeta.vm3Type);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitPortProjectionMeta.vm3Type);
		vm3ModuleProjectionDefine.addTypes( theCtxt,com.dosmil_e.kit.core.projection.define.meta.KitRelayProjectionMeta.vm3Type);


		vm3ModuleProjectionProjecting = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("projecting"));
		vm3ModuleCoreProjection.addSubModules( theCtxt, vm3ModuleProjectionProjecting);
		vm3ModuleProjectionProjecting.addTypes( theCtxt,com.dosmil_e.kit.core.projection.projecting.meta.KitProjectableMeta.vm3Type);
		vm3ModuleProjectionProjecting.addTypes( theCtxt,com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3Type);
		vm3ModuleProjectionProjecting.addTypes( theCtxt,com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3Type);
		vm3ModuleProjectionProjecting.addTypes( theCtxt,com.dosmil_e.kit.core.projection.projecting.meta.KitHideMeta.vm3Type);
		vm3ModuleProjectionProjecting.addTypes( theCtxt,com.dosmil_e.kit.core.projection.projecting.meta.KitFachadeMeta.vm3Type);



		vm3ModuleCoreModel = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("model"));
		vm3ModuleKit01Core.addSubModules( theCtxt, vm3ModuleCoreModel);

		vm3ModuleModelBehavior = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("behavior"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelBehavior);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitUnidirectionalInteractionMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitAbstractSignaledMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitAbstractListenedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRequestedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitAbstractRespondedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitJavaMethodDispatcherMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitActivationMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitSignaledMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitListenedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitRequestedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitRespondedMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorInHandlerMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.vm3Type);
		vm3ModuleModelBehavior.addTypes( theCtxt,com.dosmil_e.kit.core.model.behavior.meta.KitReturnMeta.vm3Type);


		vm3ModuleModelDefine = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("define"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelDefine);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractComponentMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractAssemblyMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractRelayMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractAliasMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAbstractLinkMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitComponentMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAssemblyMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitLinkMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitRelayMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitAliasMeta.vm3Type);
		vm3ModuleModelDefine.addTypes( theCtxt,com.dosmil_e.kit.core.model.define.meta.KitPortMeta.vm3Type);


		vm3ModuleModelSupport = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("support"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelSupport);
		vm3ModuleModelSupport.addTypes( theCtxt,com.dosmil_e.kit.core.model.support.meta.KitDirectionKindMeta.vm3Type);
		vm3ModuleModelSupport.addTypes( theCtxt,com.dosmil_e.kit.core.model.support.meta.KitScheduleKindMeta.vm3Type);
		vm3ModuleModelSupport.addTypes( theCtxt,com.dosmil_e.kit.core.model.support.meta.KitSynthesisModeMeta.vm3Type);


		vm3ModuleModelObserve = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("observe"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelObserve);
		vm3ModuleModelObserve.addTypes( theCtxt,com.dosmil_e.kit.core.model.observe.meta.KitActivationMeta.vm3Type);
		vm3ModuleModelObserve.addTypes( theCtxt,com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3Type);
		vm3ModuleModelObserve.addTypes( theCtxt,com.dosmil_e.kit.core.model.observe.meta.KitDependencyMeta.vm3Type);


		vm3ModuleModelCommon = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("common"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelCommon);
		vm3ModuleModelCommon.addTypes( theCtxt,com.dosmil_e.kit.core.model.common.meta.KitCommonMeta.vm3Type);


		vm3ModuleModelStructural = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("structural"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelStructural);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveTypeMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractAttributeMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractReferenceMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedValueMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractPrimitiveJavaClassMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitNativeResourceMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractStructuredJavaClassMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitAbstractDocumentMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedTypeMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitPrimitiveJavaClassMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitStructuredJavaClassMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitDocumentMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureTypingMeta.vm3Type);
		vm3ModuleModelStructural.addTypes( theCtxt,com.dosmil_e.kit.core.model.structural.meta.KitStructuredTypeMeta.vm3Type);


		vm3ModuleModelEdoc = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("edoc"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelEdoc);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitProcessTypeMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitBusinessSignalMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitContentMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitCommunityMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitInteractionPortalMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitInteractionInterfaceMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitCompositeProcessMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitBusinessProcessMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitPrimitiveProcessMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitConnectionMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitInternalRoleMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitExternalRoleMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitResourceMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitStructuralTypeMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitReferenceMeta.vm3Type);
		vm3ModuleModelEdoc.addTypes( theCtxt,com.dosmil_e.kit.core.model.edoc.meta.KitAttributeMeta.vm3Type);


		vm3ModuleModelTrace = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("trace"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelTrace);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitSynthesisMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitVersionMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitURLMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitMediaMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitCommentMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitAttachmentMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3Type);
		vm3ModuleModelTrace.addTypes( theCtxt,com.dosmil_e.kit.core.model.trace.meta.KitExclusionMeta.vm3Type);


		vm3ModuleModelOrganize = (com.dosmil_e.m3.core.ifc.M3ModuleIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "Module", "core",new EAIMMName("organize"));
		vm3ModuleCoreModel.addSubModules( theCtxt, vm3ModuleModelOrganize);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitAbstractOrganizationalMeta.vm3Type);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitAbstractProjectMeta.vm3Type);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.vm3Type);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitAbstractPackageMeta.vm3Type);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitProjectMeta.vm3Type);
		vm3ModuleModelOrganize.addTypes( theCtxt,com.dosmil_e.kit.core.model.organize.meta.KitPackageMeta.vm3Type);







		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = 
			new com.dosmil_e.kit.meta.KitTraversalConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.kit.meta.KitTraversalConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aTraversalConfig);

		com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aReplicationConfig = 
			new com.dosmil_e.kit.meta.KitReplicationConfig( theCtxt, 
			new EAIMMName( com.dosmil_e.kit.meta.KitReplicationConfig.gTraversalConfigName), vm3Model);
		vm3Model.addTraversalConfigs( theCtxt, aReplicationConfig);



   } catch( EAIException anEx) {}
  }



}
