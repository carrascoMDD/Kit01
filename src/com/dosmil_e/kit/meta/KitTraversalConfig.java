package com.dosmil_e.kit.meta;

// WholeTraversalConfig  Dynamic

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIMMName;
import com.dosmil_e.modelbase.support.EAIMMNameIfc;
import com.dosmil_e.modelbase.support.EAIException;

import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.m3.traversal.ifc.*;


import java.util.Hashtable;


public class KitTraversalConfig extends com.dosmil_e.m3.traversal.cust.M3TraversalConfigCust {

  /*******************************************************
   *  Static members holding Configs and Managers
   *******************************************************/

  /*******************************************************
   *  Root node configs declarations
   *******************************************************/
	public M3RootTypeNodeConfigIfc aProjectProjectionRTNC;
	public M3RootTypeNodeConfigIfc aPackageProjectionRTNC;
	public M3RootTypeNodeConfigIfc aBehaviorInHandlerProjectionRTNC;
	public M3RootTypeNodeConfigIfc aListenedProjectionRTNC;
	public M3RootTypeNodeConfigIfc aRequestedProjectionRTNC;
	public M3RootTypeNodeConfigIfc aRespondedProjectionRTNC;
	public M3RootTypeNodeConfigIfc aSignaledProjectionRTNC;
	public M3RootTypeNodeConfigIfc aAttributeProjectionRTNC;
	public M3RootTypeNodeConfigIfc aEnumeratedTypeProjectionRTNC;
	public M3RootTypeNodeConfigIfc aPrimitiveJavaClassProjectionRTNC;
	public M3RootTypeNodeConfigIfc aStructuredJavaClassProjectionRTNC;
	public M3RootTypeNodeConfigIfc aReferenceProjectionRTNC;
	public M3RootTypeNodeConfigIfc aDocumentProjectionRTNC;
	public M3RootTypeNodeConfigIfc aAliasProjectionRTNC;
	public M3RootTypeNodeConfigIfc aAssemblyProjectionRTNC;
	public M3RootTypeNodeConfigIfc aComponentProjectionRTNC;
	public M3RootTypeNodeConfigIfc aLinkProjectionRTNC;
	public M3RootTypeNodeConfigIfc aPortProjectionRTNC;
	public M3RootTypeNodeConfigIfc aRelayProjectionRTNC;
	public M3RootTypeNodeConfigIfc aHideRTNC;
	public M3RootTypeNodeConfigIfc aFachadeRTNC;
	public M3RootTypeNodeConfigIfc aJavaClassHandlerRTNC;
	public M3RootTypeNodeConfigIfc aJavaMethodDispatcherRTNC;
	public M3RootTypeNodeConfigIfc aSignaledRTNC;
	public M3RootTypeNodeConfigIfc aListenedRTNC;
	public M3RootTypeNodeConfigIfc aRequestedRTNC;
	public M3RootTypeNodeConfigIfc aRespondedRTNC;
	public M3RootTypeNodeConfigIfc aBehaviorInHandlerRTNC;
	public M3RootTypeNodeConfigIfc aStimuliRTNC;
	public M3RootTypeNodeConfigIfc aReturnRTNC;
	public M3RootTypeNodeConfigIfc aComponentRTNC;
	public M3RootTypeNodeConfigIfc aAssemblyRTNC;
	public M3RootTypeNodeConfigIfc aLinkRTNC;
	public M3RootTypeNodeConfigIfc aRelayRTNC;
	public M3RootTypeNodeConfigIfc aAliasRTNC;
	public M3RootTypeNodeConfigIfc aPortRTNC;
	public M3RootTypeNodeConfigIfc aDependencyRTNC;
	public M3RootTypeNodeConfigIfc aCommonRTNC;
	public M3RootTypeNodeConfigIfc aEnumeratedValueRTNC;
	public M3RootTypeNodeConfigIfc aExposedStructuralFeatureRTNC;
	public M3RootTypeNodeConfigIfc aEnumeratedTypeRTNC;
	public M3RootTypeNodeConfigIfc aPrimitiveJavaClassRTNC;
	public M3RootTypeNodeConfigIfc aStructuredJavaClassRTNC;
	public M3RootTypeNodeConfigIfc aDocumentRTNC;
	public M3RootTypeNodeConfigIfc aStructuralFeatureTypingRTNC;
	public M3RootTypeNodeConfigIfc aStructuredTypeRTNC;
	public M3RootTypeNodeConfigIfc aProcessTypeRTNC;
	public M3RootTypeNodeConfigIfc aBusinessSignalRTNC;
	public M3RootTypeNodeConfigIfc aContentRTNC;
	public M3RootTypeNodeConfigIfc aCommunityRTNC;
	public M3RootTypeNodeConfigIfc aInteractionPortalRTNC;
	public M3RootTypeNodeConfigIfc aInteractionInterfaceRTNC;
	public M3RootTypeNodeConfigIfc aCompositeProcessRTNC;
	public M3RootTypeNodeConfigIfc aPrimitiveProcessRTNC;
	public M3RootTypeNodeConfigIfc aConnectionRTNC;
	public M3RootTypeNodeConfigIfc aInternalRoleRTNC;
	public M3RootTypeNodeConfigIfc aExternalRoleRTNC;
	public M3RootTypeNodeConfigIfc aResourceRTNC;
	public M3RootTypeNodeConfigIfc aStructuralTypeRTNC;
	public M3RootTypeNodeConfigIfc aReferenceRTNC;
	public M3RootTypeNodeConfigIfc aAttributeRTNC;
	public M3RootTypeNodeConfigIfc aTransformationRTNC;
	public M3RootTypeNodeConfigIfc aSynthesisRTNC;
	public M3RootTypeNodeConfigIfc aVersionRTNC;
	public M3RootTypeNodeConfigIfc aURLRTNC;
	public M3RootTypeNodeConfigIfc aMediaRTNC;
	public M3RootTypeNodeConfigIfc aCommentRTNC;
	public M3RootTypeNodeConfigIfc aAttachmentRTNC;
	public M3RootTypeNodeConfigIfc aAnnotationRTNC;
	public M3RootTypeNodeConfigIfc aExclusionRTNC;
	public M3RootTypeNodeConfigIfc aProjectRTNC;
	public M3RootTypeNodeConfigIfc aPackageRTNC;


  /*******************************************************
   *  Node configs declarations
   *******************************************************/
	public M3NodeConfigIfc aProjectProjectionNC, aProjectProjectionNCTerm;
	public M3NodeConfigIfc aPackageProjectionNC, aPackageProjectionNCTerm;
	public M3NodeConfigIfc aBehaviorInHandlerProjectionNC, aBehaviorInHandlerProjectionNCTerm;
	public M3NodeConfigIfc aListenedProjectionNC, aListenedProjectionNCTerm;
	public M3NodeConfigIfc aRequestedProjectionNC, aRequestedProjectionNCTerm;
	public M3NodeConfigIfc aRespondedProjectionNC, aRespondedProjectionNCTerm;
	public M3NodeConfigIfc aSignaledProjectionNC, aSignaledProjectionNCTerm;
	public M3NodeConfigIfc aAttributeProjectionNC, aAttributeProjectionNCTerm;
	public M3NodeConfigIfc aEnumeratedTypeProjectionNC, aEnumeratedTypeProjectionNCTerm;
	public M3NodeConfigIfc aPrimitiveJavaClassProjectionNC, aPrimitiveJavaClassProjectionNCTerm;
	public M3NodeConfigIfc aStructuredJavaClassProjectionNC, aStructuredJavaClassProjectionNCTerm;
	public M3NodeConfigIfc aReferenceProjectionNC, aReferenceProjectionNCTerm;
	public M3NodeConfigIfc aDocumentProjectionNC, aDocumentProjectionNCTerm;
	public M3NodeConfigIfc aAliasProjectionNC, aAliasProjectionNCTerm;
	public M3NodeConfigIfc aAssemblyProjectionNC, aAssemblyProjectionNCTerm;
	public M3NodeConfigIfc aComponentProjectionNC, aComponentProjectionNCTerm;
	public M3NodeConfigIfc aLinkProjectionNC, aLinkProjectionNCTerm;
	public M3NodeConfigIfc aPortProjectionNC, aPortProjectionNCTerm;
	public M3NodeConfigIfc aRelayProjectionNC, aRelayProjectionNCTerm;
	public M3NodeConfigIfc aHideNC, aHideNCTerm;
	public M3NodeConfigIfc aFachadeNC, aFachadeNCTerm;
	public M3NodeConfigIfc aJavaClassHandlerNC, aJavaClassHandlerNCTerm;
	public M3NodeConfigIfc aJavaMethodDispatcherNC, aJavaMethodDispatcherNCTerm;
	public M3NodeConfigIfc aSignaledNC, aSignaledNCTerm;
	public M3NodeConfigIfc aListenedNC, aListenedNCTerm;
	public M3NodeConfigIfc aRequestedNC, aRequestedNCTerm;
	public M3NodeConfigIfc aRespondedNC, aRespondedNCTerm;
	public M3NodeConfigIfc aBehaviorInHandlerNC, aBehaviorInHandlerNCTerm;
	public M3NodeConfigIfc aStimuliNC, aStimuliNCTerm;
	public M3NodeConfigIfc aReturnNC, aReturnNCTerm;
	public M3NodeConfigIfc aComponentNC, aComponentNCTerm;
	public M3NodeConfigIfc aAssemblyNC, aAssemblyNCTerm;
	public M3NodeConfigIfc aLinkNC, aLinkNCTerm;
	public M3NodeConfigIfc aRelayNC, aRelayNCTerm;
	public M3NodeConfigIfc aAliasNC, aAliasNCTerm;
	public M3NodeConfigIfc aPortNC, aPortNCTerm;
	public M3NodeConfigIfc aDependencyNC, aDependencyNCTerm;
	public M3NodeConfigIfc aCommonNC, aCommonNCTerm;
	public M3NodeConfigIfc aEnumeratedValueNC, aEnumeratedValueNCTerm;
	public M3NodeConfigIfc aExposedStructuralFeatureNC, aExposedStructuralFeatureNCTerm;
	public M3NodeConfigIfc aEnumeratedTypeNC, aEnumeratedTypeNCTerm;
	public M3NodeConfigIfc aPrimitiveJavaClassNC, aPrimitiveJavaClassNCTerm;
	public M3NodeConfigIfc aStructuredJavaClassNC, aStructuredJavaClassNCTerm;
	public M3NodeConfigIfc aDocumentNC, aDocumentNCTerm;
	public M3NodeConfigIfc aStructuralFeatureTypingNC, aStructuralFeatureTypingNCTerm;
	public M3NodeConfigIfc aStructuredTypeNC, aStructuredTypeNCTerm;
	public M3NodeConfigIfc aProcessTypeNC, aProcessTypeNCTerm;
	public M3NodeConfigIfc aBusinessSignalNC, aBusinessSignalNCTerm;
	public M3NodeConfigIfc aContentNC, aContentNCTerm;
	public M3NodeConfigIfc aCommunityNC, aCommunityNCTerm;
	public M3NodeConfigIfc aInteractionPortalNC, aInteractionPortalNCTerm;
	public M3NodeConfigIfc aInteractionInterfaceNC, aInteractionInterfaceNCTerm;
	public M3NodeConfigIfc aCompositeProcessNC, aCompositeProcessNCTerm;
	public M3NodeConfigIfc aPrimitiveProcessNC, aPrimitiveProcessNCTerm;
	public M3NodeConfigIfc aConnectionNC, aConnectionNCTerm;
	public M3NodeConfigIfc aInternalRoleNC, aInternalRoleNCTerm;
	public M3NodeConfigIfc aExternalRoleNC, aExternalRoleNCTerm;
	public M3NodeConfigIfc aResourceNC, aResourceNCTerm;
	public M3NodeConfigIfc aStructuralTypeNC, aStructuralTypeNCTerm;
	public M3NodeConfigIfc aReferenceNC, aReferenceNCTerm;
	public M3NodeConfigIfc aAttributeNC, aAttributeNCTerm;
	public M3NodeConfigIfc aTransformationNC, aTransformationNCTerm;
	public M3NodeConfigIfc aSynthesisNC, aSynthesisNCTerm;
	public M3NodeConfigIfc aVersionNC, aVersionNCTerm;
	public M3NodeConfigIfc aURLNC, aURLNCTerm;
	public M3NodeConfigIfc aMediaNC, aMediaNCTerm;
	public M3NodeConfigIfc aCommentNC, aCommentNCTerm;
	public M3NodeConfigIfc aAttachmentNC, aAttachmentNCTerm;
	public M3NodeConfigIfc aAnnotationNC, aAnnotationNCTerm;
	public M3NodeConfigIfc aExclusionNC, aExclusionNCTerm;
	public M3NodeConfigIfc aProjectNC, aProjectNCTerm;
	public M3NodeConfigIfc aPackageNC, aPackageNCTerm;


  /*******************************************************
   *  Node mgrs declarations
   *******************************************************/
	public M3NodeMgrIfc aProjectProjectionNMgr;
	public M3NodeMgrIfc aPackageProjectionNMgr;
	public M3NodeMgrIfc aBehaviorInHandlerProjectionNMgr;
	public M3NodeMgrIfc aListenedProjectionNMgr;
	public M3NodeMgrIfc aRequestedProjectionNMgr;
	public M3NodeMgrIfc aRespondedProjectionNMgr;
	public M3NodeMgrIfc aSignaledProjectionNMgr;
	public M3NodeMgrIfc aAttributeProjectionNMgr;
	public M3NodeMgrIfc aEnumeratedTypeProjectionNMgr;
	public M3NodeMgrIfc aPrimitiveJavaClassProjectionNMgr;
	public M3NodeMgrIfc aStructuredJavaClassProjectionNMgr;
	public M3NodeMgrIfc aReferenceProjectionNMgr;
	public M3NodeMgrIfc aDocumentProjectionNMgr;
	public M3NodeMgrIfc aAliasProjectionNMgr;
	public M3NodeMgrIfc aAssemblyProjectionNMgr;
	public M3NodeMgrIfc aComponentProjectionNMgr;
	public M3NodeMgrIfc aLinkProjectionNMgr;
	public M3NodeMgrIfc aPortProjectionNMgr;
	public M3NodeMgrIfc aRelayProjectionNMgr;
	public M3NodeMgrIfc aHideNMgr;
	public M3NodeMgrIfc aFachadeNMgr;
	public M3NodeMgrIfc aJavaClassHandlerNMgr;
	public M3NodeMgrIfc aJavaMethodDispatcherNMgr;
	public M3NodeMgrIfc aSignaledNMgr;
	public M3NodeMgrIfc aListenedNMgr;
	public M3NodeMgrIfc aRequestedNMgr;
	public M3NodeMgrIfc aRespondedNMgr;
	public M3NodeMgrIfc aBehaviorInHandlerNMgr;
	public M3NodeMgrIfc aStimuliNMgr;
	public M3NodeMgrIfc aReturnNMgr;
	public M3NodeMgrIfc aComponentNMgr;
	public M3NodeMgrIfc aAssemblyNMgr;
	public M3NodeMgrIfc aLinkNMgr;
	public M3NodeMgrIfc aRelayNMgr;
	public M3NodeMgrIfc aAliasNMgr;
	public M3NodeMgrIfc aPortNMgr;
	public M3NodeMgrIfc aDependencyNMgr;
	public M3NodeMgrIfc aCommonNMgr;
	public M3NodeMgrIfc aEnumeratedValueNMgr;
	public M3NodeMgrIfc aExposedStructuralFeatureNMgr;
	public M3NodeMgrIfc aEnumeratedTypeNMgr;
	public M3NodeMgrIfc aPrimitiveJavaClassNMgr;
	public M3NodeMgrIfc aStructuredJavaClassNMgr;
	public M3NodeMgrIfc aDocumentNMgr;
	public M3NodeMgrIfc aStructuralFeatureTypingNMgr;
	public M3NodeMgrIfc aStructuredTypeNMgr;
	public M3NodeMgrIfc aProcessTypeNMgr;
	public M3NodeMgrIfc aBusinessSignalNMgr;
	public M3NodeMgrIfc aContentNMgr;
	public M3NodeMgrIfc aCommunityNMgr;
	public M3NodeMgrIfc aInteractionPortalNMgr;
	public M3NodeMgrIfc aInteractionInterfaceNMgr;
	public M3NodeMgrIfc aCompositeProcessNMgr;
	public M3NodeMgrIfc aPrimitiveProcessNMgr;
	public M3NodeMgrIfc aConnectionNMgr;
	public M3NodeMgrIfc aInternalRoleNMgr;
	public M3NodeMgrIfc aExternalRoleNMgr;
	public M3NodeMgrIfc aResourceNMgr;
	public M3NodeMgrIfc aStructuralTypeNMgr;
	public M3NodeMgrIfc aReferenceNMgr;
	public M3NodeMgrIfc aAttributeNMgr;
	public M3NodeMgrIfc aTransformationNMgr;
	public M3NodeMgrIfc aSynthesisNMgr;
	public M3NodeMgrIfc aVersionNMgr;
	public M3NodeMgrIfc aURLNMgr;
	public M3NodeMgrIfc aMediaNMgr;
	public M3NodeMgrIfc aCommentNMgr;
	public M3NodeMgrIfc aAttachmentNMgr;
	public M3NodeMgrIfc aAnnotationNMgr;
	public M3NodeMgrIfc aExclusionNMgr;
	public M3NodeMgrIfc aProjectNMgr;
	public M3NodeMgrIfc aPackageNMgr;


  /*******************************************************
   *  Branch configs declarations
   *******************************************************/
	public M3BranchConfigIfc aProjectable_originalOfProjectionsBC;
	public M3BranchConfigIfc aProjection_originalsBC;
	public M3BranchConfigIfc aProjection_subProjectionsBC;
	public M3BranchConfigIfc aProjected_projectionsBC;
	public M3BranchConfigIfc aBidirectionalInteraction_ownedReturnsBC;
	public M3BranchConfigIfc aInteractionOwner_ownedInteractionsBC;
	public M3BranchConfigIfc aInteraction_ownedStimuliBC;
	public M3BranchConfigIfc aHandlerOwner_ownedHandlersBC;
	public M3BranchConfigIfc aHandler_handlerOfBehaviorsBC;
	public M3BranchConfigIfc aAbstractBehaviorInHandler_handlerBC;
	public M3BranchConfigIfc aAbstractBehaviorInHandler_dispatcherBC;
	public M3BranchConfigIfc aDispatcherOwner_ownedDispatchersBC;
	public M3BranchConfigIfc aDispatcher_dispatcherOfBehaviorsBC;
	public M3BranchConfigIfc aBehaviorOwner_ownedBehaviorsBC;
	public M3BranchConfigIfc aComponentOwner_ownedComponentsBC;
	public M3BranchConfigIfc aAssemblyOwner_ownedAssembliesBC;
	public M3BranchConfigIfc aLinkOwner_ownedLinksBC;
	public M3BranchConfigIfc aPortOwner_ownedPortsBC;
	public M3BranchConfigIfc aAbstractPort_linksBC;
	public M3BranchConfigIfc aAbstractPort_connectedLinksBC;
	public M3BranchConfigIfc aDelegationOwner_ownedDelegationsBC;
	public M3BranchConfigIfc aDelegator_delegatorOfBC;
	public M3BranchConfigIfc aDelegation_delegatorBC;
	public M3BranchConfigIfc aDelegation_delegateBC;
	public M3BranchConfigIfc aDelegate_delegateOfBC;
	public M3BranchConfigIfc aAbstractLink_connectedPortBC;
	public M3BranchConfigIfc aAbstractLink_linkBC;
	public M3BranchConfigIfc aDependencyOwner_ownedDependenciesBC;
	public M3BranchConfigIfc aAbstractEnumeratedType_enumeratedValuesBC;
	public M3BranchConfigIfc aDefinedStructuralFeature_infoTypeBC;
	public M3BranchConfigIfc aInfoTypeOwner_ownedInfoTypesBC;
	public M3BranchConfigIfc aStructuralFeatureOwner_ownedStructuralFeaturesBC;
	public M3BranchConfigIfc aStructuralFeature_exposedAsBC;
	public M3BranchConfigIfc aExposedStructuralFeature_exposedBC;
	public M3BranchConfigIfc aTarget_transformationsBC;
	public M3BranchConfigIfc aTransformation_subTransformationsBC;
	public M3BranchConfigIfc aComment_attachementsBC;
	public M3BranchConfigIfc aAnnotation_sourcesBC;
	public M3BranchConfigIfc aSource_sourceOfAnnnotationsBC;
	public M3BranchConfigIfc aPackageOwner_subPackagesBC;


  /*******************************************************
   *  Branch mgrs declarations
   *******************************************************/
	public M3BranchMgrIfc aProjectable_originalOfProjectionsBMgr;
	public M3BranchMgrIfc aProjection_originalsBMgr;
	public M3BranchMgrIfc aProjection_subProjectionsBMgr;
	public M3BranchMgrIfc aProjected_projectionsBMgr;
	public M3BranchMgrIfc aBidirectionalInteraction_ownedReturnsBMgr;
	public M3BranchMgrIfc aInteractionOwner_ownedInteractionsBMgr;
	public M3BranchMgrIfc aInteraction_ownedStimuliBMgr;
	public M3BranchMgrIfc aHandlerOwner_ownedHandlersBMgr;
	public M3BranchMgrIfc aHandler_handlerOfBehaviorsBMgr;
	public M3BranchMgrIfc aAbstractBehaviorInHandler_handlerBMgr;
	public M3BranchMgrIfc aAbstractBehaviorInHandler_dispatcherBMgr;
	public M3BranchMgrIfc aDispatcherOwner_ownedDispatchersBMgr;
	public M3BranchMgrIfc aDispatcher_dispatcherOfBehaviorsBMgr;
	public M3BranchMgrIfc aBehaviorOwner_ownedBehaviorsBMgr;
	public M3BranchMgrIfc aComponentOwner_ownedComponentsBMgr;
	public M3BranchMgrIfc aAssemblyOwner_ownedAssembliesBMgr;
	public M3BranchMgrIfc aLinkOwner_ownedLinksBMgr;
	public M3BranchMgrIfc aPortOwner_ownedPortsBMgr;
	public M3BranchMgrIfc aAbstractPort_linksBMgr;
	public M3BranchMgrIfc aAbstractPort_connectedLinksBMgr;
	public M3BranchMgrIfc aDelegationOwner_ownedDelegationsBMgr;
	public M3BranchMgrIfc aDelegator_delegatorOfBMgr;
	public M3BranchMgrIfc aDelegation_delegatorBMgr;
	public M3BranchMgrIfc aDelegation_delegateBMgr;
	public M3BranchMgrIfc aDelegate_delegateOfBMgr;
	public M3BranchMgrIfc aAbstractLink_connectedPortBMgr;
	public M3BranchMgrIfc aAbstractLink_linkBMgr;
	public M3BranchMgrIfc aDependencyOwner_ownedDependenciesBMgr;
	public M3BranchMgrIfc aAbstractEnumeratedType_enumeratedValuesBMgr;
	public M3BranchMgrIfc aDefinedStructuralFeature_infoTypeBMgr;
	public M3BranchMgrIfc aInfoTypeOwner_ownedInfoTypesBMgr;
	public M3BranchMgrIfc aStructuralFeatureOwner_ownedStructuralFeaturesBMgr;
	public M3BranchMgrIfc aStructuralFeature_exposedAsBMgr;
	public M3BranchMgrIfc aExposedStructuralFeature_exposedBMgr;
	public M3BranchMgrIfc aTarget_transformationsBMgr;
	public M3BranchMgrIfc aTransformation_subTransformationsBMgr;
	public M3BranchMgrIfc aComment_attachementsBMgr;
	public M3BranchMgrIfc aAnnotation_sourcesBMgr;
	public M3BranchMgrIfc aSource_sourceOfAnnnotationsBMgr;
	public M3BranchMgrIfc aPackageOwner_subPackagesBMgr;


  /*******************************************************
   *  Related type node configs declarations
   *******************************************************/
	public M3RelatedTypeNodeConfigIfc aProjectable_originalOfProjections_FachadeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjectable_originalOfProjections_HideRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RelayProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_EnumeratedTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_BehaviorInHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RespondedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AssemblyProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ListenedRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ProjectProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ReferenceRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_SignaledProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ComponentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RespondedRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RequestedRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RequestedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AliasProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_SignaledRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ReferenceProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_BehaviorInHandlerProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AliasRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PrimitiveJavaClassProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ProjectRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_StructuredJavaClassRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_DocumentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ListenedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_StructuredJavaClassProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_EnumeratedTypeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_RelayRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PackageRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_DocumentRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AssemblyRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PrimitiveJavaClassRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_AttributeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_ComponentRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_originals_PackageProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_subProjections_FachadeRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjection_subProjections_HideRelTNC;
	public M3RelatedTypeNodeConfigIfc aProjected_projections_FachadeRelTNC;
	public M3RelatedTypeNodeConfigIfc aBidirectionalInteraction_ownedReturns_ReturnRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_ListenedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_ListenedRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_SignaledProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_SignaledRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_RespondedRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_RespondedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_RequestedRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteractionOwner_ownedInteractions_RequestedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInteraction_ownedStimuli_StimuliRelTNC;
	public M3RelatedTypeNodeConfigIfc aHandlerOwner_ownedHandlers_JavaClassHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aHandler_handlerOfBehaviors_BehaviorInHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aHandler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC;
	public M3RelatedTypeNodeConfigIfc aDispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC;
	public M3RelatedTypeNodeConfigIfc aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aBehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aBehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_PrimitiveProcessRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_CompositeProcessRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_ComponentRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_ProcessTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_InternalRoleRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_ResourceRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_ExternalRoleRelTNC;
	public M3RelatedTypeNodeConfigIfc aComponentOwner_ownedComponents_ComponentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAssemblyOwner_ownedAssemblies_AssemblyRelTNC;
	public M3RelatedTypeNodeConfigIfc aAssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aLinkOwner_ownedLinks_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aLinkOwner_ownedLinks_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aLinkOwner_ownedLinks_ConnectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aPortOwner_ownedPorts_InteractionPortalRelTNC;
	public M3RelatedTypeNodeConfigIfc aPortOwner_ownedPorts_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aPortOwner_ownedPorts_InteractionInterfaceRelTNC;
	public M3RelatedTypeNodeConfigIfc aPortOwner_ownedPorts_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_links_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_links_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_links_ConnectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_connectedLinks_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_connectedLinks_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractPort_connectedLinks_ConnectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegationOwner_ownedDelegations_AliasRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegationOwner_ownedDelegations_AliasProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegationOwner_ownedDelegations_RelayProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegationOwner_ownedDelegations_RelayRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegator_delegatorOf_AliasRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegator_delegatorOf_AliasProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegator_delegatorOf_RelayProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegator_delegatorOf_RelayRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegator_InteractionPortalRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegator_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegator_InteractionInterfaceRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegator_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegate_InteractionPortalRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegate_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegate_InteractionInterfaceRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegation_delegate_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegate_delegateOf_AliasRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegate_delegateOf_AliasProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegate_delegateOf_RelayProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDelegate_delegateOf_RelayRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_connectedPort_InteractionPortalRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_connectedPort_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_connectedPort_InteractionInterfaceRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_connectedPort_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_link_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_link_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractLink_link_ConnectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aDependencyOwner_ownedDependencies_DependencyRelTNC;
	public M3RelatedTypeNodeConfigIfc aAbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC;
	public M3RelatedTypeNodeConfigIfc aDefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_DocumentRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_ContentRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC;
	public M3RelatedTypeNodeConfigIfc aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC;
	public M3RelatedTypeNodeConfigIfc aStructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC;
	public M3RelatedTypeNodeConfigIfc aExposedStructuralFeature_exposed_ReferenceRelTNC;
	public M3RelatedTypeNodeConfigIfc aExposedStructuralFeature_exposed_ReferenceProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aExposedStructuralFeature_exposed_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aExposedStructuralFeature_exposed_AttributeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC;
	public M3RelatedTypeNodeConfigIfc aTarget_transformations_TransformationRelTNC;
	public M3RelatedTypeNodeConfigIfc aTarget_transformations_SynthesisRelTNC;
	public M3RelatedTypeNodeConfigIfc aTarget_transformations_VersionRelTNC;
	public M3RelatedTypeNodeConfigIfc aTransformation_subTransformations_TransformationRelTNC;
	public M3RelatedTypeNodeConfigIfc aTransformation_subTransformations_SynthesisRelTNC;
	public M3RelatedTypeNodeConfigIfc aTransformation_subTransformations_VersionRelTNC;
	public M3RelatedTypeNodeConfigIfc aComment_attachements_AttachmentRelTNC;
	public M3RelatedTypeNodeConfigIfc aComment_attachements_MediaRelTNC;
	public M3RelatedTypeNodeConfigIfc aComment_attachements_URLRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AliasRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AliasProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RelayProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RelayRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AssemblyRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AssemblyProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_InteractionPortalRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_PortProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_InteractionInterfaceRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_PortRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ReferenceRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ReferenceProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AttributeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_AttributeProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ExposedStructuralFeatureRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_PrimitiveProcessRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_CompositeProcessRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ComponentRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ProcessTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_InternalRoleRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ResourceRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ExternalRoleRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ComponentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_BehaviorInHandlerRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_BehaviorInHandlerProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ListenedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ListenedRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_SignaledProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_SignaledRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RespondedRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RespondedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RequestedRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_RequestedProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_LinkProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_LinkRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ConnectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_PackageProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_PackageRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_CommunityRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ProjectRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ProjectProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_StructuredTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_DocumentProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_BusinessSignalRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_DocumentRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_ContentRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_StructuredJavaClassRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_StructuredJavaClassProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_StructuralTypeRelTNC;
	public M3RelatedTypeNodeConfigIfc aAnnotation_sources_DependencyRelTNC;
	public M3RelatedTypeNodeConfigIfc aSource_sourceOfAnnnotations_AnnotationRelTNC;
	public M3RelatedTypeNodeConfigIfc aSource_sourceOfAnnnotations_TransformationRelTNC;
	public M3RelatedTypeNodeConfigIfc aSource_sourceOfAnnnotations_SynthesisRelTNC;
	public M3RelatedTypeNodeConfigIfc aSource_sourceOfAnnnotations_VersionRelTNC;
	public M3RelatedTypeNodeConfigIfc aSource_sourceOfAnnnotations_ExclusionRelTNC;
	public M3RelatedTypeNodeConfigIfc aPackageOwner_subPackages_PackageProjectionRelTNC;
	public M3RelatedTypeNodeConfigIfc aPackageOwner_subPackages_PackageRelTNC;


  /*******************************************************
   *  Attribute configs declarations
   *******************************************************/


  /*******************************************************
   *  Field mgrs declarations
   *******************************************************/




  /*******************************************************
   *  Static singleton config accessor
   *******************************************************/

  public static String gTraversalConfigName = new String("KitTraversalConfig");


  public static com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getConfig( EAIMMCtxtIfc theCtxt,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    if( theCtxt == null) { return null;}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aConfig = null;
    try { aConfig = theM3Model.findTraversalConfigsNamed( theCtxt, new EAIMMName( gTraversalConfigName));} catch( EAIException anEx) {}
    return aConfig;
  }



  /*******************************************************
   *  Constructor for M3ReplicationConfig
   *******************************************************/

  public KitTraversalConfig(
    EAIMMCtxtIfc                        theCtxt,
    EAIMMNameIfc                        theName,
    com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {

    super( theCtxt, theName);
    initConfig( theCtxt, theM3Model);
  }






/****************************************************************************
 *  Initialization of traversal configuration
 ****************************************************************************/
  public void initConfig(  EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
   try {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        theCtxt.getFlatTrxMgr().setMustPropagateChanges( false);
        initConfigInternal( theCtxt, theM3Model);
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




  protected void initConfigInternal( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) {
    if( theCtxt == null) { return;}


    try {


  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
    initRootTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
    initNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
    initNodeMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
    initBranchCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
    initBranchMgrsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
    initRelatedTypeNodeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/
    initAttributeCfgsInstantiations( theCtxt, theM3Model);

  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/
    initFieldMgrsInstantiations( theCtxt, theM3Model);


  /*******************************************************
   *  Root node configs
$TraversalRootTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Node configs
   *******************************************************/
    initNodeCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Node mgrs
$TraversalNodeMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Branch configs
   *******************************************************/
    initBranchCfgsInitializations( theCtxt, theM3Model);

  /*******************************************************
   *  Branch mgrs
$TraversalBranchMgrsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Related type node configs
$TraversalRelatedTypeNodeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Attribute configs
$TraversalAttributeCfgsStaticInitializations$
   *******************************************************/

  /*******************************************************
   *  Field mgrs
$TraversalFieldMgrsStaticInitializations$
    *******************************************************/


    }
    catch( EAIException anEx) {}
  }






  protected void initRootTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Root node configs instantiations
   *******************************************************/
		aProjectProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ProjectProjectionRTNC"));
		aProjectProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectProjection", "core.projection.organize"));
		addRootTypeNodeConfigs( theCtxt, aProjectProjectionRTNC);

		aPackageProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PackageProjectionRTNC"));
		aPackageProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		addRootTypeNodeConfigs( theCtxt, aPackageProjectionRTNC);

		aBehaviorInHandlerProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("BehaviorInHandlerProjectionRTNC"));
		aBehaviorInHandlerProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		addRootTypeNodeConfigs( theCtxt, aBehaviorInHandlerProjectionRTNC);

		aListenedProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ListenedProjectionRTNC"));
		aListenedProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		addRootTypeNodeConfigs( theCtxt, aListenedProjectionRTNC);

		aRequestedProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RequestedProjectionRTNC"));
		aRequestedProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		addRootTypeNodeConfigs( theCtxt, aRequestedProjectionRTNC);

		aRespondedProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RespondedProjectionRTNC"));
		aRespondedProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		addRootTypeNodeConfigs( theCtxt, aRespondedProjectionRTNC);

		aSignaledProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("SignaledProjectionRTNC"));
		aSignaledProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		addRootTypeNodeConfigs( theCtxt, aSignaledProjectionRTNC);

		aAttributeProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AttributeProjectionRTNC"));
		aAttributeProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aAttributeProjectionRTNC);

		aEnumeratedTypeProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("EnumeratedTypeProjectionRTNC"));
		aEnumeratedTypeProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aEnumeratedTypeProjectionRTNC);

		aPrimitiveJavaClassProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassProjectionRTNC"));
		aPrimitiveJavaClassProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aPrimitiveJavaClassProjectionRTNC);

		aStructuredJavaClassProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuredJavaClassProjectionRTNC"));
		aStructuredJavaClassProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aStructuredJavaClassProjectionRTNC);

		aReferenceProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ReferenceProjectionRTNC"));
		aReferenceProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aReferenceProjectionRTNC);

		aDocumentProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("DocumentProjectionRTNC"));
		aDocumentProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		addRootTypeNodeConfigs( theCtxt, aDocumentProjectionRTNC);

		aAliasProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AliasProjectionRTNC"));
		aAliasProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aAliasProjectionRTNC);

		aAssemblyProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AssemblyProjectionRTNC"));
		aAssemblyProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aAssemblyProjectionRTNC);

		aComponentProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ComponentProjectionRTNC"));
		aComponentProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aComponentProjectionRTNC);

		aLinkProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("LinkProjectionRTNC"));
		aLinkProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aLinkProjectionRTNC);

		aPortProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PortProjectionRTNC"));
		aPortProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aPortProjectionRTNC);

		aRelayProjectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RelayProjectionRTNC"));
		aRelayProjectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		addRootTypeNodeConfigs( theCtxt, aRelayProjectionRTNC);

		aHideRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("HideRTNC"));
		aHideRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Hide", "core.projection.projecting"));
		addRootTypeNodeConfigs( theCtxt, aHideRTNC);

		aFachadeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("FachadeRTNC"));
		aFachadeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		addRootTypeNodeConfigs( theCtxt, aFachadeRTNC);

		aJavaClassHandlerRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("JavaClassHandlerRTNC"));
		aJavaClassHandlerRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaClassHandler", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aJavaClassHandlerRTNC);

		aJavaMethodDispatcherRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("JavaMethodDispatcherRTNC"));
		aJavaMethodDispatcherRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaMethodDispatcher", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aJavaMethodDispatcherRTNC);

		aSignaledRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("SignaledRTNC"));
		aSignaledRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aSignaledRTNC);

		aListenedRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ListenedRTNC"));
		aListenedRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aListenedRTNC);

		aRequestedRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RequestedRTNC"));
		aRequestedRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aRequestedRTNC);

		aRespondedRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RespondedRTNC"));
		aRespondedRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aRespondedRTNC);

		aBehaviorInHandlerRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("BehaviorInHandlerRTNC"));
		aBehaviorInHandlerRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aBehaviorInHandlerRTNC);

		aStimuliRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StimuliRTNC"));
		aStimuliRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Stimuli", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aStimuliRTNC);

		aReturnRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ReturnRTNC"));
		aReturnRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Return", "core.model.behavior"));
		addRootTypeNodeConfigs( theCtxt, aReturnRTNC);

		aComponentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ComponentRTNC"));
		aComponentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aComponentRTNC);

		aAssemblyRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AssemblyRTNC"));
		aAssemblyRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aAssemblyRTNC);

		aLinkRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("LinkRTNC"));
		aLinkRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aLinkRTNC);

		aRelayRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("RelayRTNC"));
		aRelayRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aRelayRTNC);

		aAliasRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AliasRTNC"));
		aAliasRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aAliasRTNC);

		aPortRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PortRTNC"));
		aPortRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		addRootTypeNodeConfigs( theCtxt, aPortRTNC);

		aDependencyRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("DependencyRTNC"));
		aDependencyRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dependency", "core.model.observe"));
		addRootTypeNodeConfigs( theCtxt, aDependencyRTNC);

		aCommonRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CommonRTNC"));
		aCommonRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Common", "core.model.common"));
		addRootTypeNodeConfigs( theCtxt, aCommonRTNC);

		aEnumeratedValueRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("EnumeratedValueRTNC"));
		aEnumeratedValueRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedValue", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aEnumeratedValueRTNC);

		aExposedStructuralFeatureRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeatureRTNC"));
		aExposedStructuralFeatureRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aExposedStructuralFeatureRTNC);

		aEnumeratedTypeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("EnumeratedTypeRTNC"));
		aEnumeratedTypeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedType", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aEnumeratedTypeRTNC);

		aPrimitiveJavaClassRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassRTNC"));
		aPrimitiveJavaClassRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClass", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aPrimitiveJavaClassRTNC);

		aStructuredJavaClassRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuredJavaClassRTNC"));
		aStructuredJavaClassRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aStructuredJavaClassRTNC);

		aDocumentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("DocumentRTNC"));
		aDocumentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aDocumentRTNC);

		aStructuralFeatureTypingRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureTypingRTNC"));
		aStructuralFeatureTypingRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeatureTyping", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aStructuralFeatureTypingRTNC);

		aStructuredTypeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuredTypeRTNC"));
		aStructuredTypeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredType", "core.model.structural"));
		addRootTypeNodeConfigs( theCtxt, aStructuredTypeRTNC);

		aProcessTypeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ProcessTypeRTNC"));
		aProcessTypeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProcessType", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aProcessTypeRTNC);

		aBusinessSignalRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("BusinessSignalRTNC"));
		aBusinessSignalRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BusinessSignal", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aBusinessSignalRTNC);

		aContentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ContentRTNC"));
		aContentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Content", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aContentRTNC);

		aCommunityRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CommunityRTNC"));
		aCommunityRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Community", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aCommunityRTNC);

		aInteractionPortalRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("InteractionPortalRTNC"));
		aInteractionPortalRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aInteractionPortalRTNC);

		aInteractionInterfaceRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("InteractionInterfaceRTNC"));
		aInteractionInterfaceRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aInteractionInterfaceRTNC);

		aCompositeProcessRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CompositeProcessRTNC"));
		aCompositeProcessRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CompositeProcess", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aCompositeProcessRTNC);

		aPrimitiveProcessRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PrimitiveProcessRTNC"));
		aPrimitiveProcessRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveProcess", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aPrimitiveProcessRTNC);

		aConnectionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ConnectionRTNC"));
		aConnectionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aConnectionRTNC);

		aInternalRoleRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("InternalRoleRTNC"));
		aInternalRoleRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InternalRole", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aInternalRoleRTNC);

		aExternalRoleRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ExternalRoleRTNC"));
		aExternalRoleRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExternalRole", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aExternalRoleRTNC);

		aResourceRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ResourceRTNC"));
		aResourceRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Resource", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aResourceRTNC);

		aStructuralTypeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("StructuralTypeRTNC"));
		aStructuralTypeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralType", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aStructuralTypeRTNC);

		aReferenceRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ReferenceRTNC"));
		aReferenceRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aReferenceRTNC);

		aAttributeRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AttributeRTNC"));
		aAttributeRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		addRootTypeNodeConfigs( theCtxt, aAttributeRTNC);

		aTransformationRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("TransformationRTNC"));
		aTransformationRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aTransformationRTNC);

		aSynthesisRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("SynthesisRTNC"));
		aSynthesisRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aSynthesisRTNC);

		aVersionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("VersionRTNC"));
		aVersionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aVersionRTNC);

		aURLRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("URLRTNC"));
		aURLRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "URL", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aURLRTNC);

		aMediaRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("MediaRTNC"));
		aMediaRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Media", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aMediaRTNC);

		aCommentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("CommentRTNC"));
		aCommentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aCommentRTNC);

		aAttachmentRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AttachmentRTNC"));
		aAttachmentRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attachment", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aAttachmentRTNC);

		aAnnotationRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("AnnotationRTNC"));
		aAnnotationRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Annotation", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aAnnotationRTNC);

		aExclusionRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ExclusionRTNC"));
		aExclusionRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Exclusion", "core.model.trace"));
		addRootTypeNodeConfigs( theCtxt, aExclusionRTNC);

		aProjectRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("ProjectRTNC"));
		aProjectRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Project", "core.model.organize"));
		addRootTypeNodeConfigs( theCtxt, aProjectRTNC);

		aPackageRTNC = (M3RootTypeNodeConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RootTypeNodeConfig", "traversal",new EAIMMName("PackageRTNC"));
		aPackageRTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		addRootTypeNodeConfigs( theCtxt, aPackageRTNC);


  }


  protected void initNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs  instantiations
   *******************************************************/
		aProjectProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectProjectionNC"));
		aProjectProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectProjection", "core.projection.organize"));
		addNodeConfigs( theCtxt, aProjectProjectionNC);
		aProjectProjectionRTNC.setNodeConfig( theCtxt, aProjectProjectionNC);

		aProjectProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectProjectionNCTerm"));
		aProjectProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectProjection", "core.projection.organize"));
		addNodeConfigs( theCtxt, aProjectProjectionNCTerm);
		aProjectProjectionNCTerm.setIsTerminal( theCtxt, true);

		aPackageProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PackageProjectionNC"));
		aPackageProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		addNodeConfigs( theCtxt, aPackageProjectionNC);
		aPackageProjectionRTNC.setNodeConfig( theCtxt, aPackageProjectionNC);

		aPackageProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PackageProjectionNCTerm"));
		aPackageProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		addNodeConfigs( theCtxt, aPackageProjectionNCTerm);
		aPackageProjectionNCTerm.setIsTerminal( theCtxt, true);

		aBehaviorInHandlerProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BehaviorInHandlerProjectionNC"));
		aBehaviorInHandlerProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aBehaviorInHandlerProjectionNC);
		aBehaviorInHandlerProjectionRTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNC);

		aBehaviorInHandlerProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BehaviorInHandlerProjectionNCTerm"));
		aBehaviorInHandlerProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aBehaviorInHandlerProjectionNCTerm);
		aBehaviorInHandlerProjectionNCTerm.setIsTerminal( theCtxt, true);

		aListenedProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ListenedProjectionNC"));
		aListenedProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aListenedProjectionNC);
		aListenedProjectionRTNC.setNodeConfig( theCtxt, aListenedProjectionNC);

		aListenedProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ListenedProjectionNCTerm"));
		aListenedProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aListenedProjectionNCTerm);
		aListenedProjectionNCTerm.setIsTerminal( theCtxt, true);

		aRequestedProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RequestedProjectionNC"));
		aRequestedProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aRequestedProjectionNC);
		aRequestedProjectionRTNC.setNodeConfig( theCtxt, aRequestedProjectionNC);

		aRequestedProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RequestedProjectionNCTerm"));
		aRequestedProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aRequestedProjectionNCTerm);
		aRequestedProjectionNCTerm.setIsTerminal( theCtxt, true);

		aRespondedProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RespondedProjectionNC"));
		aRespondedProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aRespondedProjectionNC);
		aRespondedProjectionRTNC.setNodeConfig( theCtxt, aRespondedProjectionNC);

		aRespondedProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RespondedProjectionNCTerm"));
		aRespondedProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aRespondedProjectionNCTerm);
		aRespondedProjectionNCTerm.setIsTerminal( theCtxt, true);

		aSignaledProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SignaledProjectionNC"));
		aSignaledProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aSignaledProjectionNC);
		aSignaledProjectionRTNC.setNodeConfig( theCtxt, aSignaledProjectionNC);

		aSignaledProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SignaledProjectionNCTerm"));
		aSignaledProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		addNodeConfigs( theCtxt, aSignaledProjectionNCTerm);
		aSignaledProjectionNCTerm.setIsTerminal( theCtxt, true);

		aAttributeProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeProjectionNC"));
		aAttributeProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aAttributeProjectionNC);
		aAttributeProjectionRTNC.setNodeConfig( theCtxt, aAttributeProjectionNC);

		aAttributeProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeProjectionNCTerm"));
		aAttributeProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aAttributeProjectionNCTerm);
		aAttributeProjectionNCTerm.setIsTerminal( theCtxt, true);

		aEnumeratedTypeProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedTypeProjectionNC"));
		aEnumeratedTypeProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aEnumeratedTypeProjectionNC);
		aEnumeratedTypeProjectionRTNC.setNodeConfig( theCtxt, aEnumeratedTypeProjectionNC);

		aEnumeratedTypeProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedTypeProjectionNCTerm"));
		aEnumeratedTypeProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aEnumeratedTypeProjectionNCTerm);
		aEnumeratedTypeProjectionNCTerm.setIsTerminal( theCtxt, true);

		aPrimitiveJavaClassProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassProjectionNC"));
		aPrimitiveJavaClassProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aPrimitiveJavaClassProjectionNC);
		aPrimitiveJavaClassProjectionRTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassProjectionNC);

		aPrimitiveJavaClassProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassProjectionNCTerm"));
		aPrimitiveJavaClassProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aPrimitiveJavaClassProjectionNCTerm);
		aPrimitiveJavaClassProjectionNCTerm.setIsTerminal( theCtxt, true);

		aStructuredJavaClassProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredJavaClassProjectionNC"));
		aStructuredJavaClassProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aStructuredJavaClassProjectionNC);
		aStructuredJavaClassProjectionRTNC.setNodeConfig( theCtxt, aStructuredJavaClassProjectionNC);

		aStructuredJavaClassProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredJavaClassProjectionNCTerm"));
		aStructuredJavaClassProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aStructuredJavaClassProjectionNCTerm);
		aStructuredJavaClassProjectionNCTerm.setIsTerminal( theCtxt, true);

		aReferenceProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReferenceProjectionNC"));
		aReferenceProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aReferenceProjectionNC);
		aReferenceProjectionRTNC.setNodeConfig( theCtxt, aReferenceProjectionNC);

		aReferenceProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReferenceProjectionNCTerm"));
		aReferenceProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aReferenceProjectionNCTerm);
		aReferenceProjectionNCTerm.setIsTerminal( theCtxt, true);

		aDocumentProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DocumentProjectionNC"));
		aDocumentProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aDocumentProjectionNC);
		aDocumentProjectionRTNC.setNodeConfig( theCtxt, aDocumentProjectionNC);

		aDocumentProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DocumentProjectionNCTerm"));
		aDocumentProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		addNodeConfigs( theCtxt, aDocumentProjectionNCTerm);
		aDocumentProjectionNCTerm.setIsTerminal( theCtxt, true);

		aAliasProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AliasProjectionNC"));
		aAliasProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aAliasProjectionNC);
		aAliasProjectionRTNC.setNodeConfig( theCtxt, aAliasProjectionNC);

		aAliasProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AliasProjectionNCTerm"));
		aAliasProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aAliasProjectionNCTerm);
		aAliasProjectionNCTerm.setIsTerminal( theCtxt, true);

		aAssemblyProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AssemblyProjectionNC"));
		aAssemblyProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aAssemblyProjectionNC);
		aAssemblyProjectionRTNC.setNodeConfig( theCtxt, aAssemblyProjectionNC);

		aAssemblyProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AssemblyProjectionNCTerm"));
		aAssemblyProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aAssemblyProjectionNCTerm);
		aAssemblyProjectionNCTerm.setIsTerminal( theCtxt, true);

		aComponentProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ComponentProjectionNC"));
		aComponentProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aComponentProjectionNC);
		aComponentProjectionRTNC.setNodeConfig( theCtxt, aComponentProjectionNC);

		aComponentProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ComponentProjectionNCTerm"));
		aComponentProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aComponentProjectionNCTerm);
		aComponentProjectionNCTerm.setIsTerminal( theCtxt, true);

		aLinkProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("LinkProjectionNC"));
		aLinkProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aLinkProjectionNC);
		aLinkProjectionRTNC.setNodeConfig( theCtxt, aLinkProjectionNC);

		aLinkProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("LinkProjectionNCTerm"));
		aLinkProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aLinkProjectionNCTerm);
		aLinkProjectionNCTerm.setIsTerminal( theCtxt, true);

		aPortProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PortProjectionNC"));
		aPortProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aPortProjectionNC);
		aPortProjectionRTNC.setNodeConfig( theCtxt, aPortProjectionNC);

		aPortProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PortProjectionNCTerm"));
		aPortProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aPortProjectionNCTerm);
		aPortProjectionNCTerm.setIsTerminal( theCtxt, true);

		aRelayProjectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelayProjectionNC"));
		aRelayProjectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aRelayProjectionNC);
		aRelayProjectionRTNC.setNodeConfig( theCtxt, aRelayProjectionNC);

		aRelayProjectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelayProjectionNCTerm"));
		aRelayProjectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		addNodeConfigs( theCtxt, aRelayProjectionNCTerm);
		aRelayProjectionNCTerm.setIsTerminal( theCtxt, true);

		aHideNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("HideNC"));
		aHideNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Hide", "core.projection.projecting"));
		addNodeConfigs( theCtxt, aHideNC);
		aHideRTNC.setNodeConfig( theCtxt, aHideNC);

		aHideNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("HideNCTerm"));
		aHideNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Hide", "core.projection.projecting"));
		addNodeConfigs( theCtxt, aHideNCTerm);
		aHideNCTerm.setIsTerminal( theCtxt, true);

		aFachadeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FachadeNC"));
		aFachadeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		addNodeConfigs( theCtxt, aFachadeNC);
		aFachadeRTNC.setNodeConfig( theCtxt, aFachadeNC);

		aFachadeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("FachadeNCTerm"));
		aFachadeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		addNodeConfigs( theCtxt, aFachadeNCTerm);
		aFachadeNCTerm.setIsTerminal( theCtxt, true);

		aJavaClassHandlerNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("JavaClassHandlerNC"));
		aJavaClassHandlerNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaClassHandler", "core.model.behavior"));
		addNodeConfigs( theCtxt, aJavaClassHandlerNC);
		aJavaClassHandlerRTNC.setNodeConfig( theCtxt, aJavaClassHandlerNC);

		aJavaClassHandlerNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("JavaClassHandlerNCTerm"));
		aJavaClassHandlerNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaClassHandler", "core.model.behavior"));
		addNodeConfigs( theCtxt, aJavaClassHandlerNCTerm);
		aJavaClassHandlerNCTerm.setIsTerminal( theCtxt, true);

		aJavaMethodDispatcherNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("JavaMethodDispatcherNC"));
		aJavaMethodDispatcherNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaMethodDispatcher", "core.model.behavior"));
		addNodeConfigs( theCtxt, aJavaMethodDispatcherNC);
		aJavaMethodDispatcherRTNC.setNodeConfig( theCtxt, aJavaMethodDispatcherNC);

		aJavaMethodDispatcherNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("JavaMethodDispatcherNCTerm"));
		aJavaMethodDispatcherNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaMethodDispatcher", "core.model.behavior"));
		addNodeConfigs( theCtxt, aJavaMethodDispatcherNCTerm);
		aJavaMethodDispatcherNCTerm.setIsTerminal( theCtxt, true);

		aSignaledNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SignaledNC"));
		aSignaledNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		addNodeConfigs( theCtxt, aSignaledNC);
		aSignaledRTNC.setNodeConfig( theCtxt, aSignaledNC);

		aSignaledNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SignaledNCTerm"));
		aSignaledNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		addNodeConfigs( theCtxt, aSignaledNCTerm);
		aSignaledNCTerm.setIsTerminal( theCtxt, true);

		aListenedNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ListenedNC"));
		aListenedNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		addNodeConfigs( theCtxt, aListenedNC);
		aListenedRTNC.setNodeConfig( theCtxt, aListenedNC);

		aListenedNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ListenedNCTerm"));
		aListenedNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		addNodeConfigs( theCtxt, aListenedNCTerm);
		aListenedNCTerm.setIsTerminal( theCtxt, true);

		aRequestedNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RequestedNC"));
		aRequestedNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		addNodeConfigs( theCtxt, aRequestedNC);
		aRequestedRTNC.setNodeConfig( theCtxt, aRequestedNC);

		aRequestedNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RequestedNCTerm"));
		aRequestedNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		addNodeConfigs( theCtxt, aRequestedNCTerm);
		aRequestedNCTerm.setIsTerminal( theCtxt, true);

		aRespondedNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RespondedNC"));
		aRespondedNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		addNodeConfigs( theCtxt, aRespondedNC);
		aRespondedRTNC.setNodeConfig( theCtxt, aRespondedNC);

		aRespondedNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RespondedNCTerm"));
		aRespondedNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		addNodeConfigs( theCtxt, aRespondedNCTerm);
		aRespondedNCTerm.setIsTerminal( theCtxt, true);

		aBehaviorInHandlerNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BehaviorInHandlerNC"));
		aBehaviorInHandlerNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		addNodeConfigs( theCtxt, aBehaviorInHandlerNC);
		aBehaviorInHandlerRTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNC);

		aBehaviorInHandlerNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BehaviorInHandlerNCTerm"));
		aBehaviorInHandlerNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		addNodeConfigs( theCtxt, aBehaviorInHandlerNCTerm);
		aBehaviorInHandlerNCTerm.setIsTerminal( theCtxt, true);

		aStimuliNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StimuliNC"));
		aStimuliNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Stimuli", "core.model.behavior"));
		addNodeConfigs( theCtxt, aStimuliNC);
		aStimuliRTNC.setNodeConfig( theCtxt, aStimuliNC);

		aStimuliNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StimuliNCTerm"));
		aStimuliNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Stimuli", "core.model.behavior"));
		addNodeConfigs( theCtxt, aStimuliNCTerm);
		aStimuliNCTerm.setIsTerminal( theCtxt, true);

		aReturnNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReturnNC"));
		aReturnNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Return", "core.model.behavior"));
		addNodeConfigs( theCtxt, aReturnNC);
		aReturnRTNC.setNodeConfig( theCtxt, aReturnNC);

		aReturnNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReturnNCTerm"));
		aReturnNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Return", "core.model.behavior"));
		addNodeConfigs( theCtxt, aReturnNCTerm);
		aReturnNCTerm.setIsTerminal( theCtxt, true);

		aComponentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ComponentNC"));
		aComponentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		addNodeConfigs( theCtxt, aComponentNC);
		aComponentRTNC.setNodeConfig( theCtxt, aComponentNC);

		aComponentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ComponentNCTerm"));
		aComponentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		addNodeConfigs( theCtxt, aComponentNCTerm);
		aComponentNCTerm.setIsTerminal( theCtxt, true);

		aAssemblyNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AssemblyNC"));
		aAssemblyNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		addNodeConfigs( theCtxt, aAssemblyNC);
		aAssemblyRTNC.setNodeConfig( theCtxt, aAssemblyNC);

		aAssemblyNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AssemblyNCTerm"));
		aAssemblyNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		addNodeConfigs( theCtxt, aAssemblyNCTerm);
		aAssemblyNCTerm.setIsTerminal( theCtxt, true);

		aLinkNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("LinkNC"));
		aLinkNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		addNodeConfigs( theCtxt, aLinkNC);
		aLinkRTNC.setNodeConfig( theCtxt, aLinkNC);

		aLinkNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("LinkNCTerm"));
		aLinkNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		addNodeConfigs( theCtxt, aLinkNCTerm);
		aLinkNCTerm.setIsTerminal( theCtxt, true);

		aRelayNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelayNC"));
		aRelayNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		addNodeConfigs( theCtxt, aRelayNC);
		aRelayRTNC.setNodeConfig( theCtxt, aRelayNC);

		aRelayNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("RelayNCTerm"));
		aRelayNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		addNodeConfigs( theCtxt, aRelayNCTerm);
		aRelayNCTerm.setIsTerminal( theCtxt, true);

		aAliasNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AliasNC"));
		aAliasNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		addNodeConfigs( theCtxt, aAliasNC);
		aAliasRTNC.setNodeConfig( theCtxt, aAliasNC);

		aAliasNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AliasNCTerm"));
		aAliasNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		addNodeConfigs( theCtxt, aAliasNCTerm);
		aAliasNCTerm.setIsTerminal( theCtxt, true);

		aPortNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PortNC"));
		aPortNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		addNodeConfigs( theCtxt, aPortNC);
		aPortRTNC.setNodeConfig( theCtxt, aPortNC);

		aPortNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PortNCTerm"));
		aPortNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		addNodeConfigs( theCtxt, aPortNCTerm);
		aPortNCTerm.setIsTerminal( theCtxt, true);

		aDependencyNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DependencyNC"));
		aDependencyNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dependency", "core.model.observe"));
		addNodeConfigs( theCtxt, aDependencyNC);
		aDependencyRTNC.setNodeConfig( theCtxt, aDependencyNC);

		aDependencyNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DependencyNCTerm"));
		aDependencyNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dependency", "core.model.observe"));
		addNodeConfigs( theCtxt, aDependencyNCTerm);
		aDependencyNCTerm.setIsTerminal( theCtxt, true);

		aCommonNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommonNC"));
		aCommonNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Common", "core.model.common"));
		addNodeConfigs( theCtxt, aCommonNC);
		aCommonRTNC.setNodeConfig( theCtxt, aCommonNC);

		aCommonNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommonNCTerm"));
		aCommonNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Common", "core.model.common"));
		addNodeConfigs( theCtxt, aCommonNCTerm);
		aCommonNCTerm.setIsTerminal( theCtxt, true);

		aEnumeratedValueNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedValueNC"));
		aEnumeratedValueNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedValue", "core.model.structural"));
		addNodeConfigs( theCtxt, aEnumeratedValueNC);
		aEnumeratedValueRTNC.setNodeConfig( theCtxt, aEnumeratedValueNC);

		aEnumeratedValueNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedValueNCTerm"));
		aEnumeratedValueNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedValue", "core.model.structural"));
		addNodeConfigs( theCtxt, aEnumeratedValueNCTerm);
		aEnumeratedValueNCTerm.setIsTerminal( theCtxt, true);

		aExposedStructuralFeatureNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExposedStructuralFeatureNC"));
		aExposedStructuralFeatureNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		addNodeConfigs( theCtxt, aExposedStructuralFeatureNC);
		aExposedStructuralFeatureRTNC.setNodeConfig( theCtxt, aExposedStructuralFeatureNC);

		aExposedStructuralFeatureNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExposedStructuralFeatureNCTerm"));
		aExposedStructuralFeatureNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		addNodeConfigs( theCtxt, aExposedStructuralFeatureNCTerm);
		aExposedStructuralFeatureNCTerm.setIsTerminal( theCtxt, true);

		aEnumeratedTypeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedTypeNC"));
		aEnumeratedTypeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedType", "core.model.structural"));
		addNodeConfigs( theCtxt, aEnumeratedTypeNC);
		aEnumeratedTypeRTNC.setNodeConfig( theCtxt, aEnumeratedTypeNC);

		aEnumeratedTypeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("EnumeratedTypeNCTerm"));
		aEnumeratedTypeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedType", "core.model.structural"));
		addNodeConfigs( theCtxt, aEnumeratedTypeNCTerm);
		aEnumeratedTypeNCTerm.setIsTerminal( theCtxt, true);

		aPrimitiveJavaClassNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassNC"));
		aPrimitiveJavaClassNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClass", "core.model.structural"));
		addNodeConfigs( theCtxt, aPrimitiveJavaClassNC);
		aPrimitiveJavaClassRTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassNC);

		aPrimitiveJavaClassNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveJavaClassNCTerm"));
		aPrimitiveJavaClassNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClass", "core.model.structural"));
		addNodeConfigs( theCtxt, aPrimitiveJavaClassNCTerm);
		aPrimitiveJavaClassNCTerm.setIsTerminal( theCtxt, true);

		aStructuredJavaClassNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredJavaClassNC"));
		aStructuredJavaClassNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuredJavaClassNC);
		aStructuredJavaClassRTNC.setNodeConfig( theCtxt, aStructuredJavaClassNC);

		aStructuredJavaClassNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredJavaClassNCTerm"));
		aStructuredJavaClassNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuredJavaClassNCTerm);
		aStructuredJavaClassNCTerm.setIsTerminal( theCtxt, true);

		aDocumentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DocumentNC"));
		aDocumentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		addNodeConfigs( theCtxt, aDocumentNC);
		aDocumentRTNC.setNodeConfig( theCtxt, aDocumentNC);

		aDocumentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("DocumentNCTerm"));
		aDocumentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		addNodeConfigs( theCtxt, aDocumentNCTerm);
		aDocumentNCTerm.setIsTerminal( theCtxt, true);

		aStructuralFeatureTypingNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralFeatureTypingNC"));
		aStructuralFeatureTypingNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeatureTyping", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuralFeatureTypingNC);
		aStructuralFeatureTypingRTNC.setNodeConfig( theCtxt, aStructuralFeatureTypingNC);

		aStructuralFeatureTypingNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralFeatureTypingNCTerm"));
		aStructuralFeatureTypingNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeatureTyping", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuralFeatureTypingNCTerm);
		aStructuralFeatureTypingNCTerm.setIsTerminal( theCtxt, true);

		aStructuredTypeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredTypeNC"));
		aStructuredTypeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredType", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuredTypeNC);
		aStructuredTypeRTNC.setNodeConfig( theCtxt, aStructuredTypeNC);

		aStructuredTypeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuredTypeNCTerm"));
		aStructuredTypeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredType", "core.model.structural"));
		addNodeConfigs( theCtxt, aStructuredTypeNCTerm);
		aStructuredTypeNCTerm.setIsTerminal( theCtxt, true);

		aProcessTypeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProcessTypeNC"));
		aProcessTypeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProcessType", "core.model.edoc"));
		addNodeConfigs( theCtxt, aProcessTypeNC);
		aProcessTypeRTNC.setNodeConfig( theCtxt, aProcessTypeNC);

		aProcessTypeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProcessTypeNCTerm"));
		aProcessTypeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProcessType", "core.model.edoc"));
		addNodeConfigs( theCtxt, aProcessTypeNCTerm);
		aProcessTypeNCTerm.setIsTerminal( theCtxt, true);

		aBusinessSignalNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BusinessSignalNC"));
		aBusinessSignalNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BusinessSignal", "core.model.edoc"));
		addNodeConfigs( theCtxt, aBusinessSignalNC);
		aBusinessSignalRTNC.setNodeConfig( theCtxt, aBusinessSignalNC);

		aBusinessSignalNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("BusinessSignalNCTerm"));
		aBusinessSignalNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BusinessSignal", "core.model.edoc"));
		addNodeConfigs( theCtxt, aBusinessSignalNCTerm);
		aBusinessSignalNCTerm.setIsTerminal( theCtxt, true);

		aContentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ContentNC"));
		aContentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Content", "core.model.edoc"));
		addNodeConfigs( theCtxt, aContentNC);
		aContentRTNC.setNodeConfig( theCtxt, aContentNC);

		aContentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ContentNCTerm"));
		aContentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Content", "core.model.edoc"));
		addNodeConfigs( theCtxt, aContentNCTerm);
		aContentNCTerm.setIsTerminal( theCtxt, true);

		aCommunityNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommunityNC"));
		aCommunityNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Community", "core.model.edoc"));
		addNodeConfigs( theCtxt, aCommunityNC);
		aCommunityRTNC.setNodeConfig( theCtxt, aCommunityNC);

		aCommunityNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommunityNCTerm"));
		aCommunityNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Community", "core.model.edoc"));
		addNodeConfigs( theCtxt, aCommunityNCTerm);
		aCommunityNCTerm.setIsTerminal( theCtxt, true);

		aInteractionPortalNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InteractionPortalNC"));
		aInteractionPortalNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInteractionPortalNC);
		aInteractionPortalRTNC.setNodeConfig( theCtxt, aInteractionPortalNC);

		aInteractionPortalNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InteractionPortalNCTerm"));
		aInteractionPortalNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInteractionPortalNCTerm);
		aInteractionPortalNCTerm.setIsTerminal( theCtxt, true);

		aInteractionInterfaceNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InteractionInterfaceNC"));
		aInteractionInterfaceNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInteractionInterfaceNC);
		aInteractionInterfaceRTNC.setNodeConfig( theCtxt, aInteractionInterfaceNC);

		aInteractionInterfaceNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InteractionInterfaceNCTerm"));
		aInteractionInterfaceNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInteractionInterfaceNCTerm);
		aInteractionInterfaceNCTerm.setIsTerminal( theCtxt, true);

		aCompositeProcessNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CompositeProcessNC"));
		aCompositeProcessNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CompositeProcess", "core.model.edoc"));
		addNodeConfigs( theCtxt, aCompositeProcessNC);
		aCompositeProcessRTNC.setNodeConfig( theCtxt, aCompositeProcessNC);

		aCompositeProcessNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CompositeProcessNCTerm"));
		aCompositeProcessNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CompositeProcess", "core.model.edoc"));
		addNodeConfigs( theCtxt, aCompositeProcessNCTerm);
		aCompositeProcessNCTerm.setIsTerminal( theCtxt, true);

		aPrimitiveProcessNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveProcessNC"));
		aPrimitiveProcessNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveProcess", "core.model.edoc"));
		addNodeConfigs( theCtxt, aPrimitiveProcessNC);
		aPrimitiveProcessRTNC.setNodeConfig( theCtxt, aPrimitiveProcessNC);

		aPrimitiveProcessNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PrimitiveProcessNCTerm"));
		aPrimitiveProcessNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveProcess", "core.model.edoc"));
		addNodeConfigs( theCtxt, aPrimitiveProcessNCTerm);
		aPrimitiveProcessNCTerm.setIsTerminal( theCtxt, true);

		aConnectionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ConnectionNC"));
		aConnectionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		addNodeConfigs( theCtxt, aConnectionNC);
		aConnectionRTNC.setNodeConfig( theCtxt, aConnectionNC);

		aConnectionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ConnectionNCTerm"));
		aConnectionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		addNodeConfigs( theCtxt, aConnectionNCTerm);
		aConnectionNCTerm.setIsTerminal( theCtxt, true);

		aInternalRoleNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InternalRoleNC"));
		aInternalRoleNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InternalRole", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInternalRoleNC);
		aInternalRoleRTNC.setNodeConfig( theCtxt, aInternalRoleNC);

		aInternalRoleNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("InternalRoleNCTerm"));
		aInternalRoleNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InternalRole", "core.model.edoc"));
		addNodeConfigs( theCtxt, aInternalRoleNCTerm);
		aInternalRoleNCTerm.setIsTerminal( theCtxt, true);

		aExternalRoleNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExternalRoleNC"));
		aExternalRoleNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExternalRole", "core.model.edoc"));
		addNodeConfigs( theCtxt, aExternalRoleNC);
		aExternalRoleRTNC.setNodeConfig( theCtxt, aExternalRoleNC);

		aExternalRoleNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExternalRoleNCTerm"));
		aExternalRoleNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExternalRole", "core.model.edoc"));
		addNodeConfigs( theCtxt, aExternalRoleNCTerm);
		aExternalRoleNCTerm.setIsTerminal( theCtxt, true);

		aResourceNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ResourceNC"));
		aResourceNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Resource", "core.model.edoc"));
		addNodeConfigs( theCtxt, aResourceNC);
		aResourceRTNC.setNodeConfig( theCtxt, aResourceNC);

		aResourceNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ResourceNCTerm"));
		aResourceNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Resource", "core.model.edoc"));
		addNodeConfigs( theCtxt, aResourceNCTerm);
		aResourceNCTerm.setIsTerminal( theCtxt, true);

		aStructuralTypeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralTypeNC"));
		aStructuralTypeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralType", "core.model.edoc"));
		addNodeConfigs( theCtxt, aStructuralTypeNC);
		aStructuralTypeRTNC.setNodeConfig( theCtxt, aStructuralTypeNC);

		aStructuralTypeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("StructuralTypeNCTerm"));
		aStructuralTypeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralType", "core.model.edoc"));
		addNodeConfigs( theCtxt, aStructuralTypeNCTerm);
		aStructuralTypeNCTerm.setIsTerminal( theCtxt, true);

		aReferenceNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReferenceNC"));
		aReferenceNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		addNodeConfigs( theCtxt, aReferenceNC);
		aReferenceRTNC.setNodeConfig( theCtxt, aReferenceNC);

		aReferenceNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ReferenceNCTerm"));
		aReferenceNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		addNodeConfigs( theCtxt, aReferenceNCTerm);
		aReferenceNCTerm.setIsTerminal( theCtxt, true);

		aAttributeNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeNC"));
		aAttributeNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		addNodeConfigs( theCtxt, aAttributeNC);
		aAttributeRTNC.setNodeConfig( theCtxt, aAttributeNC);

		aAttributeNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttributeNCTerm"));
		aAttributeNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		addNodeConfigs( theCtxt, aAttributeNCTerm);
		aAttributeNCTerm.setIsTerminal( theCtxt, true);

		aTransformationNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TransformationNC"));
		aTransformationNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		addNodeConfigs( theCtxt, aTransformationNC);
		aTransformationRTNC.setNodeConfig( theCtxt, aTransformationNC);

		aTransformationNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("TransformationNCTerm"));
		aTransformationNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		addNodeConfigs( theCtxt, aTransformationNCTerm);
		aTransformationNCTerm.setIsTerminal( theCtxt, true);

		aSynthesisNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SynthesisNC"));
		aSynthesisNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		addNodeConfigs( theCtxt, aSynthesisNC);
		aSynthesisRTNC.setNodeConfig( theCtxt, aSynthesisNC);

		aSynthesisNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("SynthesisNCTerm"));
		aSynthesisNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		addNodeConfigs( theCtxt, aSynthesisNCTerm);
		aSynthesisNCTerm.setIsTerminal( theCtxt, true);

		aVersionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("VersionNC"));
		aVersionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		addNodeConfigs( theCtxt, aVersionNC);
		aVersionRTNC.setNodeConfig( theCtxt, aVersionNC);

		aVersionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("VersionNCTerm"));
		aVersionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		addNodeConfigs( theCtxt, aVersionNCTerm);
		aVersionNCTerm.setIsTerminal( theCtxt, true);

		aURLNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("URLNC"));
		aURLNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "URL", "core.model.trace"));
		addNodeConfigs( theCtxt, aURLNC);
		aURLRTNC.setNodeConfig( theCtxt, aURLNC);

		aURLNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("URLNCTerm"));
		aURLNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "URL", "core.model.trace"));
		addNodeConfigs( theCtxt, aURLNCTerm);
		aURLNCTerm.setIsTerminal( theCtxt, true);

		aMediaNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("MediaNC"));
		aMediaNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Media", "core.model.trace"));
		addNodeConfigs( theCtxt, aMediaNC);
		aMediaRTNC.setNodeConfig( theCtxt, aMediaNC);

		aMediaNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("MediaNCTerm"));
		aMediaNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Media", "core.model.trace"));
		addNodeConfigs( theCtxt, aMediaNCTerm);
		aMediaNCTerm.setIsTerminal( theCtxt, true);

		aCommentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommentNC"));
		aCommentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core.model.trace"));
		addNodeConfigs( theCtxt, aCommentNC);
		aCommentRTNC.setNodeConfig( theCtxt, aCommentNC);

		aCommentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("CommentNCTerm"));
		aCommentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core.model.trace"));
		addNodeConfigs( theCtxt, aCommentNCTerm);
		aCommentNCTerm.setIsTerminal( theCtxt, true);

		aAttachmentNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttachmentNC"));
		aAttachmentNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attachment", "core.model.trace"));
		addNodeConfigs( theCtxt, aAttachmentNC);
		aAttachmentRTNC.setNodeConfig( theCtxt, aAttachmentNC);

		aAttachmentNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AttachmentNCTerm"));
		aAttachmentNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attachment", "core.model.trace"));
		addNodeConfigs( theCtxt, aAttachmentNCTerm);
		aAttachmentNCTerm.setIsTerminal( theCtxt, true);

		aAnnotationNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AnnotationNC"));
		aAnnotationNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Annotation", "core.model.trace"));
		addNodeConfigs( theCtxt, aAnnotationNC);
		aAnnotationRTNC.setNodeConfig( theCtxt, aAnnotationNC);

		aAnnotationNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("AnnotationNCTerm"));
		aAnnotationNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Annotation", "core.model.trace"));
		addNodeConfigs( theCtxt, aAnnotationNCTerm);
		aAnnotationNCTerm.setIsTerminal( theCtxt, true);

		aExclusionNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExclusionNC"));
		aExclusionNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Exclusion", "core.model.trace"));
		addNodeConfigs( theCtxt, aExclusionNC);
		aExclusionRTNC.setNodeConfig( theCtxt, aExclusionNC);

		aExclusionNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ExclusionNCTerm"));
		aExclusionNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Exclusion", "core.model.trace"));
		addNodeConfigs( theCtxt, aExclusionNCTerm);
		aExclusionNCTerm.setIsTerminal( theCtxt, true);

		aProjectNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectNC"));
		aProjectNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Project", "core.model.organize"));
		addNodeConfigs( theCtxt, aProjectNC);
		aProjectRTNC.setNodeConfig( theCtxt, aProjectNC);

		aProjectNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("ProjectNCTerm"));
		aProjectNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Project", "core.model.organize"));
		addNodeConfigs( theCtxt, aProjectNCTerm);
		aProjectNCTerm.setIsTerminal( theCtxt, true);

		aPackageNC =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PackageNC"));
		aPackageNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		addNodeConfigs( theCtxt, aPackageNC);
		aPackageRTNC.setNodeConfig( theCtxt, aPackageNC);

		aPackageNCTerm =  (M3NodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeConfig", "traversal",new EAIMMName("PackageNCTerm"));
		aPackageNCTerm.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		addNodeConfigs( theCtxt, aPackageNCTerm);
		aPackageNCTerm.setIsTerminal( theCtxt, true);


  }


  protected void initNodeMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node mgrs  instantiations
   *******************************************************/
		aProjectProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ProjectProjectionNMgr"));
		addNodeMgrs( theCtxt, aProjectProjectionNMgr);
		aProjectProjectionNC.setMetaNodeMgr( theCtxt, aProjectProjectionNMgr);

		aProjectProjectionNCTerm.setMetaNodeMgr( theCtxt, aProjectProjectionNMgr);

		aPackageProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PackageProjectionNMgr"));
		addNodeMgrs( theCtxt, aPackageProjectionNMgr);
		aPackageProjectionNC.setMetaNodeMgr( theCtxt, aPackageProjectionNMgr);

		aPackageProjectionNCTerm.setMetaNodeMgr( theCtxt, aPackageProjectionNMgr);

		aBehaviorInHandlerProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("BehaviorInHandlerProjectionNMgr"));
		addNodeMgrs( theCtxt, aBehaviorInHandlerProjectionNMgr);
		aBehaviorInHandlerProjectionNC.setMetaNodeMgr( theCtxt, aBehaviorInHandlerProjectionNMgr);

		aBehaviorInHandlerProjectionNCTerm.setMetaNodeMgr( theCtxt, aBehaviorInHandlerProjectionNMgr);

		aListenedProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ListenedProjectionNMgr"));
		addNodeMgrs( theCtxt, aListenedProjectionNMgr);
		aListenedProjectionNC.setMetaNodeMgr( theCtxt, aListenedProjectionNMgr);

		aListenedProjectionNCTerm.setMetaNodeMgr( theCtxt, aListenedProjectionNMgr);

		aRequestedProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RequestedProjectionNMgr"));
		addNodeMgrs( theCtxt, aRequestedProjectionNMgr);
		aRequestedProjectionNC.setMetaNodeMgr( theCtxt, aRequestedProjectionNMgr);

		aRequestedProjectionNCTerm.setMetaNodeMgr( theCtxt, aRequestedProjectionNMgr);

		aRespondedProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RespondedProjectionNMgr"));
		addNodeMgrs( theCtxt, aRespondedProjectionNMgr);
		aRespondedProjectionNC.setMetaNodeMgr( theCtxt, aRespondedProjectionNMgr);

		aRespondedProjectionNCTerm.setMetaNodeMgr( theCtxt, aRespondedProjectionNMgr);

		aSignaledProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("SignaledProjectionNMgr"));
		addNodeMgrs( theCtxt, aSignaledProjectionNMgr);
		aSignaledProjectionNC.setMetaNodeMgr( theCtxt, aSignaledProjectionNMgr);

		aSignaledProjectionNCTerm.setMetaNodeMgr( theCtxt, aSignaledProjectionNMgr);

		aAttributeProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AttributeProjectionNMgr"));
		addNodeMgrs( theCtxt, aAttributeProjectionNMgr);
		aAttributeProjectionNC.setMetaNodeMgr( theCtxt, aAttributeProjectionNMgr);

		aAttributeProjectionNCTerm.setMetaNodeMgr( theCtxt, aAttributeProjectionNMgr);

		aEnumeratedTypeProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("EnumeratedTypeProjectionNMgr"));
		addNodeMgrs( theCtxt, aEnumeratedTypeProjectionNMgr);
		aEnumeratedTypeProjectionNC.setMetaNodeMgr( theCtxt, aEnumeratedTypeProjectionNMgr);

		aEnumeratedTypeProjectionNCTerm.setMetaNodeMgr( theCtxt, aEnumeratedTypeProjectionNMgr);

		aPrimitiveJavaClassProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PrimitiveJavaClassProjectionNMgr"));
		addNodeMgrs( theCtxt, aPrimitiveJavaClassProjectionNMgr);
		aPrimitiveJavaClassProjectionNC.setMetaNodeMgr( theCtxt, aPrimitiveJavaClassProjectionNMgr);

		aPrimitiveJavaClassProjectionNCTerm.setMetaNodeMgr( theCtxt, aPrimitiveJavaClassProjectionNMgr);

		aStructuredJavaClassProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StructuredJavaClassProjectionNMgr"));
		addNodeMgrs( theCtxt, aStructuredJavaClassProjectionNMgr);
		aStructuredJavaClassProjectionNC.setMetaNodeMgr( theCtxt, aStructuredJavaClassProjectionNMgr);

		aStructuredJavaClassProjectionNCTerm.setMetaNodeMgr( theCtxt, aStructuredJavaClassProjectionNMgr);

		aReferenceProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ReferenceProjectionNMgr"));
		addNodeMgrs( theCtxt, aReferenceProjectionNMgr);
		aReferenceProjectionNC.setMetaNodeMgr( theCtxt, aReferenceProjectionNMgr);

		aReferenceProjectionNCTerm.setMetaNodeMgr( theCtxt, aReferenceProjectionNMgr);

		aDocumentProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("DocumentProjectionNMgr"));
		addNodeMgrs( theCtxt, aDocumentProjectionNMgr);
		aDocumentProjectionNC.setMetaNodeMgr( theCtxt, aDocumentProjectionNMgr);

		aDocumentProjectionNCTerm.setMetaNodeMgr( theCtxt, aDocumentProjectionNMgr);

		aAliasProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AliasProjectionNMgr"));
		addNodeMgrs( theCtxt, aAliasProjectionNMgr);
		aAliasProjectionNC.setMetaNodeMgr( theCtxt, aAliasProjectionNMgr);

		aAliasProjectionNCTerm.setMetaNodeMgr( theCtxt, aAliasProjectionNMgr);

		aAssemblyProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AssemblyProjectionNMgr"));
		addNodeMgrs( theCtxt, aAssemblyProjectionNMgr);
		aAssemblyProjectionNC.setMetaNodeMgr( theCtxt, aAssemblyProjectionNMgr);

		aAssemblyProjectionNCTerm.setMetaNodeMgr( theCtxt, aAssemblyProjectionNMgr);

		aComponentProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ComponentProjectionNMgr"));
		addNodeMgrs( theCtxt, aComponentProjectionNMgr);
		aComponentProjectionNC.setMetaNodeMgr( theCtxt, aComponentProjectionNMgr);

		aComponentProjectionNCTerm.setMetaNodeMgr( theCtxt, aComponentProjectionNMgr);

		aLinkProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("LinkProjectionNMgr"));
		addNodeMgrs( theCtxt, aLinkProjectionNMgr);
		aLinkProjectionNC.setMetaNodeMgr( theCtxt, aLinkProjectionNMgr);

		aLinkProjectionNCTerm.setMetaNodeMgr( theCtxt, aLinkProjectionNMgr);

		aPortProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PortProjectionNMgr"));
		addNodeMgrs( theCtxt, aPortProjectionNMgr);
		aPortProjectionNC.setMetaNodeMgr( theCtxt, aPortProjectionNMgr);

		aPortProjectionNCTerm.setMetaNodeMgr( theCtxt, aPortProjectionNMgr);

		aRelayProjectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RelayProjectionNMgr"));
		addNodeMgrs( theCtxt, aRelayProjectionNMgr);
		aRelayProjectionNC.setMetaNodeMgr( theCtxt, aRelayProjectionNMgr);

		aRelayProjectionNCTerm.setMetaNodeMgr( theCtxt, aRelayProjectionNMgr);

		aHideNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("HideNMgr"));
		addNodeMgrs( theCtxt, aHideNMgr);
		aHideNC.setMetaNodeMgr( theCtxt, aHideNMgr);

		aHideNCTerm.setMetaNodeMgr( theCtxt, aHideNMgr);

		aFachadeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("FachadeNMgr"));
		addNodeMgrs( theCtxt, aFachadeNMgr);
		aFachadeNC.setMetaNodeMgr( theCtxt, aFachadeNMgr);

		aFachadeNCTerm.setMetaNodeMgr( theCtxt, aFachadeNMgr);

		aJavaClassHandlerNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("JavaClassHandlerNMgr"));
		addNodeMgrs( theCtxt, aJavaClassHandlerNMgr);
		aJavaClassHandlerNC.setMetaNodeMgr( theCtxt, aJavaClassHandlerNMgr);

		aJavaClassHandlerNCTerm.setMetaNodeMgr( theCtxt, aJavaClassHandlerNMgr);

		aJavaMethodDispatcherNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("JavaMethodDispatcherNMgr"));
		addNodeMgrs( theCtxt, aJavaMethodDispatcherNMgr);
		aJavaMethodDispatcherNC.setMetaNodeMgr( theCtxt, aJavaMethodDispatcherNMgr);

		aJavaMethodDispatcherNCTerm.setMetaNodeMgr( theCtxt, aJavaMethodDispatcherNMgr);

		aSignaledNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("SignaledNMgr"));
		addNodeMgrs( theCtxt, aSignaledNMgr);
		aSignaledNC.setMetaNodeMgr( theCtxt, aSignaledNMgr);

		aSignaledNCTerm.setMetaNodeMgr( theCtxt, aSignaledNMgr);

		aListenedNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ListenedNMgr"));
		addNodeMgrs( theCtxt, aListenedNMgr);
		aListenedNC.setMetaNodeMgr( theCtxt, aListenedNMgr);

		aListenedNCTerm.setMetaNodeMgr( theCtxt, aListenedNMgr);

		aRequestedNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RequestedNMgr"));
		addNodeMgrs( theCtxt, aRequestedNMgr);
		aRequestedNC.setMetaNodeMgr( theCtxt, aRequestedNMgr);

		aRequestedNCTerm.setMetaNodeMgr( theCtxt, aRequestedNMgr);

		aRespondedNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RespondedNMgr"));
		addNodeMgrs( theCtxt, aRespondedNMgr);
		aRespondedNC.setMetaNodeMgr( theCtxt, aRespondedNMgr);

		aRespondedNCTerm.setMetaNodeMgr( theCtxt, aRespondedNMgr);

		aBehaviorInHandlerNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("BehaviorInHandlerNMgr"));
		addNodeMgrs( theCtxt, aBehaviorInHandlerNMgr);
		aBehaviorInHandlerNC.setMetaNodeMgr( theCtxt, aBehaviorInHandlerNMgr);

		aBehaviorInHandlerNCTerm.setMetaNodeMgr( theCtxt, aBehaviorInHandlerNMgr);

		aStimuliNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StimuliNMgr"));
		addNodeMgrs( theCtxt, aStimuliNMgr);
		aStimuliNC.setMetaNodeMgr( theCtxt, aStimuliNMgr);

		aStimuliNCTerm.setMetaNodeMgr( theCtxt, aStimuliNMgr);

		aReturnNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ReturnNMgr"));
		addNodeMgrs( theCtxt, aReturnNMgr);
		aReturnNC.setMetaNodeMgr( theCtxt, aReturnNMgr);

		aReturnNCTerm.setMetaNodeMgr( theCtxt, aReturnNMgr);

		aComponentNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ComponentNMgr"));
		addNodeMgrs( theCtxt, aComponentNMgr);
		aComponentNC.setMetaNodeMgr( theCtxt, aComponentNMgr);

		aComponentNCTerm.setMetaNodeMgr( theCtxt, aComponentNMgr);

		aAssemblyNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AssemblyNMgr"));
		addNodeMgrs( theCtxt, aAssemblyNMgr);
		aAssemblyNC.setMetaNodeMgr( theCtxt, aAssemblyNMgr);

		aAssemblyNCTerm.setMetaNodeMgr( theCtxt, aAssemblyNMgr);

		aLinkNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("LinkNMgr"));
		addNodeMgrs( theCtxt, aLinkNMgr);
		aLinkNC.setMetaNodeMgr( theCtxt, aLinkNMgr);

		aLinkNCTerm.setMetaNodeMgr( theCtxt, aLinkNMgr);

		aRelayNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("RelayNMgr"));
		addNodeMgrs( theCtxt, aRelayNMgr);
		aRelayNC.setMetaNodeMgr( theCtxt, aRelayNMgr);

		aRelayNCTerm.setMetaNodeMgr( theCtxt, aRelayNMgr);

		aAliasNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AliasNMgr"));
		addNodeMgrs( theCtxt, aAliasNMgr);
		aAliasNC.setMetaNodeMgr( theCtxt, aAliasNMgr);

		aAliasNCTerm.setMetaNodeMgr( theCtxt, aAliasNMgr);

		aPortNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PortNMgr"));
		addNodeMgrs( theCtxt, aPortNMgr);
		aPortNC.setMetaNodeMgr( theCtxt, aPortNMgr);

		aPortNCTerm.setMetaNodeMgr( theCtxt, aPortNMgr);

		aDependencyNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("DependencyNMgr"));
		addNodeMgrs( theCtxt, aDependencyNMgr);
		aDependencyNC.setMetaNodeMgr( theCtxt, aDependencyNMgr);

		aDependencyNCTerm.setMetaNodeMgr( theCtxt, aDependencyNMgr);

		aCommonNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("CommonNMgr"));
		addNodeMgrs( theCtxt, aCommonNMgr);
		aCommonNC.setMetaNodeMgr( theCtxt, aCommonNMgr);

		aCommonNCTerm.setMetaNodeMgr( theCtxt, aCommonNMgr);

		aEnumeratedValueNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("EnumeratedValueNMgr"));
		addNodeMgrs( theCtxt, aEnumeratedValueNMgr);
		aEnumeratedValueNC.setMetaNodeMgr( theCtxt, aEnumeratedValueNMgr);

		aEnumeratedValueNCTerm.setMetaNodeMgr( theCtxt, aEnumeratedValueNMgr);

		aExposedStructuralFeatureNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ExposedStructuralFeatureNMgr"));
		addNodeMgrs( theCtxt, aExposedStructuralFeatureNMgr);
		aExposedStructuralFeatureNC.setMetaNodeMgr( theCtxt, aExposedStructuralFeatureNMgr);

		aExposedStructuralFeatureNCTerm.setMetaNodeMgr( theCtxt, aExposedStructuralFeatureNMgr);

		aEnumeratedTypeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("EnumeratedTypeNMgr"));
		addNodeMgrs( theCtxt, aEnumeratedTypeNMgr);
		aEnumeratedTypeNC.setMetaNodeMgr( theCtxt, aEnumeratedTypeNMgr);

		aEnumeratedTypeNCTerm.setMetaNodeMgr( theCtxt, aEnumeratedTypeNMgr);

		aPrimitiveJavaClassNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PrimitiveJavaClassNMgr"));
		addNodeMgrs( theCtxt, aPrimitiveJavaClassNMgr);
		aPrimitiveJavaClassNC.setMetaNodeMgr( theCtxt, aPrimitiveJavaClassNMgr);

		aPrimitiveJavaClassNCTerm.setMetaNodeMgr( theCtxt, aPrimitiveJavaClassNMgr);

		aStructuredJavaClassNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StructuredJavaClassNMgr"));
		addNodeMgrs( theCtxt, aStructuredJavaClassNMgr);
		aStructuredJavaClassNC.setMetaNodeMgr( theCtxt, aStructuredJavaClassNMgr);

		aStructuredJavaClassNCTerm.setMetaNodeMgr( theCtxt, aStructuredJavaClassNMgr);

		aDocumentNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("DocumentNMgr"));
		addNodeMgrs( theCtxt, aDocumentNMgr);
		aDocumentNC.setMetaNodeMgr( theCtxt, aDocumentNMgr);

		aDocumentNCTerm.setMetaNodeMgr( theCtxt, aDocumentNMgr);

		aStructuralFeatureTypingNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StructuralFeatureTypingNMgr"));
		addNodeMgrs( theCtxt, aStructuralFeatureTypingNMgr);
		aStructuralFeatureTypingNC.setMetaNodeMgr( theCtxt, aStructuralFeatureTypingNMgr);

		aStructuralFeatureTypingNCTerm.setMetaNodeMgr( theCtxt, aStructuralFeatureTypingNMgr);

		aStructuredTypeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StructuredTypeNMgr"));
		addNodeMgrs( theCtxt, aStructuredTypeNMgr);
		aStructuredTypeNC.setMetaNodeMgr( theCtxt, aStructuredTypeNMgr);

		aStructuredTypeNCTerm.setMetaNodeMgr( theCtxt, aStructuredTypeNMgr);

		aProcessTypeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ProcessTypeNMgr"));
		addNodeMgrs( theCtxt, aProcessTypeNMgr);
		aProcessTypeNC.setMetaNodeMgr( theCtxt, aProcessTypeNMgr);

		aProcessTypeNCTerm.setMetaNodeMgr( theCtxt, aProcessTypeNMgr);

		aBusinessSignalNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("BusinessSignalNMgr"));
		addNodeMgrs( theCtxt, aBusinessSignalNMgr);
		aBusinessSignalNC.setMetaNodeMgr( theCtxt, aBusinessSignalNMgr);

		aBusinessSignalNCTerm.setMetaNodeMgr( theCtxt, aBusinessSignalNMgr);

		aContentNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ContentNMgr"));
		addNodeMgrs( theCtxt, aContentNMgr);
		aContentNC.setMetaNodeMgr( theCtxt, aContentNMgr);

		aContentNCTerm.setMetaNodeMgr( theCtxt, aContentNMgr);

		aCommunityNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("CommunityNMgr"));
		addNodeMgrs( theCtxt, aCommunityNMgr);
		aCommunityNC.setMetaNodeMgr( theCtxt, aCommunityNMgr);

		aCommunityNCTerm.setMetaNodeMgr( theCtxt, aCommunityNMgr);

		aInteractionPortalNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("InteractionPortalNMgr"));
		addNodeMgrs( theCtxt, aInteractionPortalNMgr);
		aInteractionPortalNC.setMetaNodeMgr( theCtxt, aInteractionPortalNMgr);

		aInteractionPortalNCTerm.setMetaNodeMgr( theCtxt, aInteractionPortalNMgr);

		aInteractionInterfaceNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("InteractionInterfaceNMgr"));
		addNodeMgrs( theCtxt, aInteractionInterfaceNMgr);
		aInteractionInterfaceNC.setMetaNodeMgr( theCtxt, aInteractionInterfaceNMgr);

		aInteractionInterfaceNCTerm.setMetaNodeMgr( theCtxt, aInteractionInterfaceNMgr);

		aCompositeProcessNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("CompositeProcessNMgr"));
		addNodeMgrs( theCtxt, aCompositeProcessNMgr);
		aCompositeProcessNC.setMetaNodeMgr( theCtxt, aCompositeProcessNMgr);

		aCompositeProcessNCTerm.setMetaNodeMgr( theCtxt, aCompositeProcessNMgr);

		aPrimitiveProcessNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PrimitiveProcessNMgr"));
		addNodeMgrs( theCtxt, aPrimitiveProcessNMgr);
		aPrimitiveProcessNC.setMetaNodeMgr( theCtxt, aPrimitiveProcessNMgr);

		aPrimitiveProcessNCTerm.setMetaNodeMgr( theCtxt, aPrimitiveProcessNMgr);

		aConnectionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ConnectionNMgr"));
		addNodeMgrs( theCtxt, aConnectionNMgr);
		aConnectionNC.setMetaNodeMgr( theCtxt, aConnectionNMgr);

		aConnectionNCTerm.setMetaNodeMgr( theCtxt, aConnectionNMgr);

		aInternalRoleNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("InternalRoleNMgr"));
		addNodeMgrs( theCtxt, aInternalRoleNMgr);
		aInternalRoleNC.setMetaNodeMgr( theCtxt, aInternalRoleNMgr);

		aInternalRoleNCTerm.setMetaNodeMgr( theCtxt, aInternalRoleNMgr);

		aExternalRoleNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ExternalRoleNMgr"));
		addNodeMgrs( theCtxt, aExternalRoleNMgr);
		aExternalRoleNC.setMetaNodeMgr( theCtxt, aExternalRoleNMgr);

		aExternalRoleNCTerm.setMetaNodeMgr( theCtxt, aExternalRoleNMgr);

		aResourceNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ResourceNMgr"));
		addNodeMgrs( theCtxt, aResourceNMgr);
		aResourceNC.setMetaNodeMgr( theCtxt, aResourceNMgr);

		aResourceNCTerm.setMetaNodeMgr( theCtxt, aResourceNMgr);

		aStructuralTypeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("StructuralTypeNMgr"));
		addNodeMgrs( theCtxt, aStructuralTypeNMgr);
		aStructuralTypeNC.setMetaNodeMgr( theCtxt, aStructuralTypeNMgr);

		aStructuralTypeNCTerm.setMetaNodeMgr( theCtxt, aStructuralTypeNMgr);

		aReferenceNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ReferenceNMgr"));
		addNodeMgrs( theCtxt, aReferenceNMgr);
		aReferenceNC.setMetaNodeMgr( theCtxt, aReferenceNMgr);

		aReferenceNCTerm.setMetaNodeMgr( theCtxt, aReferenceNMgr);

		aAttributeNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AttributeNMgr"));
		addNodeMgrs( theCtxt, aAttributeNMgr);
		aAttributeNC.setMetaNodeMgr( theCtxt, aAttributeNMgr);

		aAttributeNCTerm.setMetaNodeMgr( theCtxt, aAttributeNMgr);

		aTransformationNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("TransformationNMgr"));
		addNodeMgrs( theCtxt, aTransformationNMgr);
		aTransformationNC.setMetaNodeMgr( theCtxt, aTransformationNMgr);

		aTransformationNCTerm.setMetaNodeMgr( theCtxt, aTransformationNMgr);

		aSynthesisNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("SynthesisNMgr"));
		addNodeMgrs( theCtxt, aSynthesisNMgr);
		aSynthesisNC.setMetaNodeMgr( theCtxt, aSynthesisNMgr);

		aSynthesisNCTerm.setMetaNodeMgr( theCtxt, aSynthesisNMgr);

		aVersionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("VersionNMgr"));
		addNodeMgrs( theCtxt, aVersionNMgr);
		aVersionNC.setMetaNodeMgr( theCtxt, aVersionNMgr);

		aVersionNCTerm.setMetaNodeMgr( theCtxt, aVersionNMgr);

		aURLNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("URLNMgr"));
		addNodeMgrs( theCtxt, aURLNMgr);
		aURLNC.setMetaNodeMgr( theCtxt, aURLNMgr);

		aURLNCTerm.setMetaNodeMgr( theCtxt, aURLNMgr);

		aMediaNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("MediaNMgr"));
		addNodeMgrs( theCtxt, aMediaNMgr);
		aMediaNC.setMetaNodeMgr( theCtxt, aMediaNMgr);

		aMediaNCTerm.setMetaNodeMgr( theCtxt, aMediaNMgr);

		aCommentNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("CommentNMgr"));
		addNodeMgrs( theCtxt, aCommentNMgr);
		aCommentNC.setMetaNodeMgr( theCtxt, aCommentNMgr);

		aCommentNCTerm.setMetaNodeMgr( theCtxt, aCommentNMgr);

		aAttachmentNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AttachmentNMgr"));
		addNodeMgrs( theCtxt, aAttachmentNMgr);
		aAttachmentNC.setMetaNodeMgr( theCtxt, aAttachmentNMgr);

		aAttachmentNCTerm.setMetaNodeMgr( theCtxt, aAttachmentNMgr);

		aAnnotationNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("AnnotationNMgr"));
		addNodeMgrs( theCtxt, aAnnotationNMgr);
		aAnnotationNC.setMetaNodeMgr( theCtxt, aAnnotationNMgr);

		aAnnotationNCTerm.setMetaNodeMgr( theCtxt, aAnnotationNMgr);

		aExclusionNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ExclusionNMgr"));
		addNodeMgrs( theCtxt, aExclusionNMgr);
		aExclusionNC.setMetaNodeMgr( theCtxt, aExclusionNMgr);

		aExclusionNCTerm.setMetaNodeMgr( theCtxt, aExclusionNMgr);

		aProjectNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("ProjectNMgr"));
		addNodeMgrs( theCtxt, aProjectNMgr);
		aProjectNC.setMetaNodeMgr( theCtxt, aProjectNMgr);

		aProjectNCTerm.setMetaNodeMgr( theCtxt, aProjectNMgr);

		aPackageNMgr =   (M3NodeMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "NodeMgr", "traversal",new EAIMMName("PackageNMgr"));
		addNodeMgrs( theCtxt, aPackageNMgr);
		aPackageNC.setMetaNodeMgr( theCtxt, aPackageNMgr);

		aPackageNCTerm.setMetaNodeMgr( theCtxt, aPackageNMgr);


  }


  protected void initBranchCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs  instantiations
   *******************************************************/
		aProjectable_originalOfProjectionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Projectable_originalOfProjectionsBC"));
		aProjectable_originalOfProjectionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Projectable", "core.projection.projecting").findRelationshipsNamed( theCtxt, new EAIMMName("originalOfProjections")));
		aProjectable_originalOfProjectionsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);

		aProjection_originalsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Projection_originalsBC"));
		aProjection_originalsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Projection", "core.projection.projecting").findRelationshipsNamed( theCtxt, new EAIMMName("originals")));
		aProjection_originalsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aProjection_originalsBC);

		aProjection_subProjectionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Projection_subProjectionsBC"));
		aProjection_subProjectionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Projection", "core.projection.projecting").findRelationshipsNamed( theCtxt, new EAIMMName("subProjections")));
		aProjection_subProjectionsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aProjection_subProjectionsBC);

		aProjected_projectionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Projected_projectionsBC"));
		aProjected_projectionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Projected", "core.projection.projecting").findRelationshipsNamed( theCtxt, new EAIMMName("projections")));
		aProjected_projectionsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aProjected_projectionsBC);

		aBidirectionalInteraction_ownedReturnsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BidirectionalInteraction_ownedReturnsBC"));
		aBidirectionalInteraction_ownedReturnsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BidirectionalInteraction", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedReturns")));
		aBidirectionalInteraction_ownedReturnsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aBidirectionalInteraction_ownedReturnsBC);

		aInteractionOwner_ownedInteractionsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractionsBC"));
		aInteractionOwner_ownedInteractionsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionOwner", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedInteractions")));
		aInteractionOwner_ownedInteractionsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInteractionOwner_ownedInteractionsBC);

		aInteraction_ownedStimuliBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Interaction_ownedStimuliBC"));
		aInteraction_ownedStimuliBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Interaction", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedStimuli")));
		aInteraction_ownedStimuliBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);

		aHandlerOwner_ownedHandlersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("HandlerOwner_ownedHandlersBC"));
		aHandlerOwner_ownedHandlersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "HandlerOwner", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedHandlers")));
		aHandlerOwner_ownedHandlersBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);

		aHandler_handlerOfBehaviorsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Handler_handlerOfBehaviorsBC"));
		aHandler_handlerOfBehaviorsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Handler", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("handlerOfBehaviors")));
		aHandler_handlerOfBehaviorsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aHandler_handlerOfBehaviorsBC);

		aAbstractBehaviorInHandler_handlerBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractBehaviorInHandler_handlerBC"));
		aAbstractBehaviorInHandler_handlerBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractBehaviorInHandler", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("handler")));
		aAbstractBehaviorInHandler_handlerBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_handlerBC);

		aAbstractBehaviorInHandler_dispatcherBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractBehaviorInHandler_dispatcherBC"));
		aAbstractBehaviorInHandler_dispatcherBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractBehaviorInHandler", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("dispatcher")));
		aAbstractBehaviorInHandler_dispatcherBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_dispatcherBC);

		aDispatcherOwner_ownedDispatchersBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("DispatcherOwner_ownedDispatchersBC"));
		aDispatcherOwner_ownedDispatchersBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DispatcherOwner", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedDispatchers")));
		aDispatcherOwner_ownedDispatchersBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);

		aDispatcher_dispatcherOfBehaviorsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Dispatcher_dispatcherOfBehaviorsBC"));
		aDispatcher_dispatcherOfBehaviorsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dispatcher", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("dispatcherOfBehaviors")));
		aDispatcher_dispatcherOfBehaviorsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDispatcher_dispatcherOfBehaviorsBC);

		aBehaviorOwner_ownedBehaviorsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("BehaviorOwner_ownedBehaviorsBC"));
		aBehaviorOwner_ownedBehaviorsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorOwner", "core.model.behavior").findRelationshipsNamed( theCtxt, new EAIMMName("ownedBehaviors")));
		aBehaviorOwner_ownedBehaviorsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);

		aComponentOwner_ownedComponentsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponentsBC"));
		aComponentOwner_ownedComponentsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentOwner", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("ownedComponents")));
		aComponentOwner_ownedComponentsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);

		aAssemblyOwner_ownedAssembliesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AssemblyOwner_ownedAssembliesBC"));
		aAssemblyOwner_ownedAssembliesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyOwner", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("ownedAssemblies")));
		aAssemblyOwner_ownedAssembliesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);

		aLinkOwner_ownedLinksBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("LinkOwner_ownedLinksBC"));
		aLinkOwner_ownedLinksBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkOwner", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("ownedLinks")));
		aLinkOwner_ownedLinksBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aLinkOwner_ownedLinksBC);

		aPortOwner_ownedPortsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PortOwner_ownedPortsBC"));
		aPortOwner_ownedPortsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortOwner", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("ownedPorts")));
		aPortOwner_ownedPortsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);

		aAbstractPort_linksBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractPort_linksBC"));
		aAbstractPort_linksBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractPort", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("links")));
		aAbstractPort_linksBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractPort_linksBC);

		aAbstractPort_connectedLinksBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractPort_connectedLinksBC"));
		aAbstractPort_connectedLinksBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractPort", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("connectedLinks")));
		aAbstractPort_connectedLinksBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractPort_connectedLinksBC);

		aDelegationOwner_ownedDelegationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("DelegationOwner_ownedDelegationsBC"));
		aDelegationOwner_ownedDelegationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DelegationOwner", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("ownedDelegations")));
		aDelegationOwner_ownedDelegationsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);

		aDelegator_delegatorOfBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Delegator_delegatorOfBC"));
		aDelegator_delegatorOfBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Delegator", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("delegatorOf")));
		aDelegator_delegatorOfBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDelegator_delegatorOfBC);

		aDelegation_delegatorBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Delegation_delegatorBC"));
		aDelegation_delegatorBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Delegation", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("delegator")));
		aDelegation_delegatorBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDelegation_delegatorBC);

		aDelegation_delegateBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Delegation_delegateBC"));
		aDelegation_delegateBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Delegation", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("delegate")));
		aDelegation_delegateBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDelegation_delegateBC);

		aDelegate_delegateOfBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Delegate_delegateOfBC"));
		aDelegate_delegateOfBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Delegate", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("delegateOf")));
		aDelegate_delegateOfBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aDelegate_delegateOfBC);

		aAbstractLink_connectedPortBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractLink_connectedPortBC"));
		aAbstractLink_connectedPortBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractLink", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("connectedPort")));
		aAbstractLink_connectedPortBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractLink_connectedPortBC);

		aAbstractLink_linkBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractLink_linkBC"));
		aAbstractLink_linkBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractLink", "core.model.define").findRelationshipsNamed( theCtxt, new EAIMMName("link")));
		aAbstractLink_linkBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAbstractLink_linkBC);

		aDependencyOwner_ownedDependenciesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("DependencyOwner_ownedDependenciesBC"));
		aDependencyOwner_ownedDependenciesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DependencyOwner", "core.model.observe").findRelationshipsNamed( theCtxt, new EAIMMName("ownedDependencies")));
		aDependencyOwner_ownedDependenciesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);

		aAbstractEnumeratedType_enumeratedValuesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("AbstractEnumeratedType_enumeratedValuesBC"));
		aAbstractEnumeratedType_enumeratedValuesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AbstractEnumeratedType", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("enumeratedValues")));
		aAbstractEnumeratedType_enumeratedValuesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aAbstractEnumeratedType_enumeratedValuesBC);

		aDefinedStructuralFeature_infoTypeBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("DefinedStructuralFeature_infoTypeBC"));
		aDefinedStructuralFeature_infoTypeBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DefinedStructuralFeature", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("infoType")));
		aDefinedStructuralFeature_infoTypeBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aDefinedStructuralFeature_infoTypeBC);

		aInfoTypeOwner_ownedInfoTypesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypesBC"));
		aInfoTypeOwner_ownedInfoTypesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InfoTypeOwner", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("ownedInfoTypes")));
		aInfoTypeOwner_ownedInfoTypesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);

		aStructuralFeatureOwner_ownedStructuralFeaturesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeaturesBC"));
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeatureOwner", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("ownedStructuralFeatures")));
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);

		aStructuralFeature_exposedAsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("StructuralFeature_exposedAsBC"));
		aStructuralFeature_exposedAsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeature", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("exposedAs")));
		aStructuralFeature_exposedAsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);

		aExposedStructuralFeature_exposedBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposedBC"));
		aExposedStructuralFeature_exposedBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural").findRelationshipsNamed( theCtxt, new EAIMMName("exposed")));
		aExposedStructuralFeature_exposedBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aExposedStructuralFeature_exposedBC);

		aTarget_transformationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Target_transformationsBC"));
		aTarget_transformationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Target", "core.model.trace").findRelationshipsNamed( theCtxt, new EAIMMName("transformations")));
		aTarget_transformationsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aTransformation_subTransformationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Transformation_subTransformationsBC"));
		aTransformation_subTransformationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace").findRelationshipsNamed( theCtxt, new EAIMMName("subTransformations")));
		aTransformation_subTransformationsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aTransformation_subTransformationsBC);

		aComment_attachementsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Comment_attachementsBC"));
		aComment_attachementsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Comment", "core.model.trace").findRelationshipsNamed( theCtxt, new EAIMMName("attachements")));
		aComment_attachementsBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aComment_attachementsBC);

		aAnnotation_sourcesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Annotation_sourcesBC"));
		aAnnotation_sourcesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Annotation", "core.model.trace").findRelationshipsNamed( theCtxt, new EAIMMName("sources")));
		aAnnotation_sourcesBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aAnnotation_sourcesBC);

		aSource_sourceOfAnnnotationsBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotationsBC"));
		aSource_sourceOfAnnnotationsBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Source", "core.model.trace").findRelationshipsNamed( theCtxt, new EAIMMName("sourceOfAnnnotations")));
		aSource_sourceOfAnnnotationsBC.setPhaseNumber( theCtxt, 1);
		addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);

		aPackageOwner_subPackagesBC  =   (M3BranchConfigIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchConfig", "traversal",new EAIMMName("PackageOwner_subPackagesBC"));
		aPackageOwner_subPackagesBC.setMetaRelationship( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageOwner", "core.model.organize").findRelationshipsNamed( theCtxt, new EAIMMName("subPackages")));
		aPackageOwner_subPackagesBC.setPhaseNumber( theCtxt, 0);
		addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);


  }


  protected void initBranchMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch mgrs  instantiations
   *******************************************************/
		aProjectable_originalOfProjectionsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Projectable_originalOfProjectionsBMgr"));
		addBranchMgrs( theCtxt, aProjectable_originalOfProjectionsBMgr);
		aProjectable_originalOfProjectionsBC.setMetaBranchMgr( theCtxt, aProjectable_originalOfProjectionsBMgr);

		aProjection_originalsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Projection_originalsBMgr"));
		addBranchMgrs( theCtxt, aProjection_originalsBMgr);
		aProjection_originalsBC.setMetaBranchMgr( theCtxt, aProjection_originalsBMgr);

		aProjection_subProjectionsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Projection_subProjectionsBMgr"));
		addBranchMgrs( theCtxt, aProjection_subProjectionsBMgr);
		aProjection_subProjectionsBC.setMetaBranchMgr( theCtxt, aProjection_subProjectionsBMgr);

		aProjected_projectionsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Projected_projectionsBMgr"));
		addBranchMgrs( theCtxt, aProjected_projectionsBMgr);
		aProjected_projectionsBC.setMetaBranchMgr( theCtxt, aProjected_projectionsBMgr);

		aBidirectionalInteraction_ownedReturnsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("BidirectionalInteraction_ownedReturnsBMgr"));
		addBranchMgrs( theCtxt, aBidirectionalInteraction_ownedReturnsBMgr);
		aBidirectionalInteraction_ownedReturnsBC.setMetaBranchMgr( theCtxt, aBidirectionalInteraction_ownedReturnsBMgr);

		aInteractionOwner_ownedInteractionsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("InteractionOwner_ownedInteractionsBMgr"));
		addBranchMgrs( theCtxt, aInteractionOwner_ownedInteractionsBMgr);
		aInteractionOwner_ownedInteractionsBC.setMetaBranchMgr( theCtxt, aInteractionOwner_ownedInteractionsBMgr);

		aInteraction_ownedStimuliBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Interaction_ownedStimuliBMgr"));
		addBranchMgrs( theCtxt, aInteraction_ownedStimuliBMgr);
		aInteraction_ownedStimuliBC.setMetaBranchMgr( theCtxt, aInteraction_ownedStimuliBMgr);

		aHandlerOwner_ownedHandlersBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("HandlerOwner_ownedHandlersBMgr"));
		addBranchMgrs( theCtxt, aHandlerOwner_ownedHandlersBMgr);
		aHandlerOwner_ownedHandlersBC.setMetaBranchMgr( theCtxt, aHandlerOwner_ownedHandlersBMgr);

		aHandler_handlerOfBehaviorsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Handler_handlerOfBehaviorsBMgr"));
		addBranchMgrs( theCtxt, aHandler_handlerOfBehaviorsBMgr);
		aHandler_handlerOfBehaviorsBC.setMetaBranchMgr( theCtxt, aHandler_handlerOfBehaviorsBMgr);

		aAbstractBehaviorInHandler_handlerBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractBehaviorInHandler_handlerBMgr"));
		addBranchMgrs( theCtxt, aAbstractBehaviorInHandler_handlerBMgr);
		aAbstractBehaviorInHandler_handlerBC.setMetaBranchMgr( theCtxt, aAbstractBehaviorInHandler_handlerBMgr);

		aAbstractBehaviorInHandler_dispatcherBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractBehaviorInHandler_dispatcherBMgr"));
		addBranchMgrs( theCtxt, aAbstractBehaviorInHandler_dispatcherBMgr);
		aAbstractBehaviorInHandler_dispatcherBC.setMetaBranchMgr( theCtxt, aAbstractBehaviorInHandler_dispatcherBMgr);

		aDispatcherOwner_ownedDispatchersBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("DispatcherOwner_ownedDispatchersBMgr"));
		addBranchMgrs( theCtxt, aDispatcherOwner_ownedDispatchersBMgr);
		aDispatcherOwner_ownedDispatchersBC.setMetaBranchMgr( theCtxt, aDispatcherOwner_ownedDispatchersBMgr);

		aDispatcher_dispatcherOfBehaviorsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Dispatcher_dispatcherOfBehaviorsBMgr"));
		addBranchMgrs( theCtxt, aDispatcher_dispatcherOfBehaviorsBMgr);
		aDispatcher_dispatcherOfBehaviorsBC.setMetaBranchMgr( theCtxt, aDispatcher_dispatcherOfBehaviorsBMgr);

		aBehaviorOwner_ownedBehaviorsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("BehaviorOwner_ownedBehaviorsBMgr"));
		addBranchMgrs( theCtxt, aBehaviorOwner_ownedBehaviorsBMgr);
		aBehaviorOwner_ownedBehaviorsBC.setMetaBranchMgr( theCtxt, aBehaviorOwner_ownedBehaviorsBMgr);

		aComponentOwner_ownedComponentsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("ComponentOwner_ownedComponentsBMgr"));
		addBranchMgrs( theCtxt, aComponentOwner_ownedComponentsBMgr);
		aComponentOwner_ownedComponentsBC.setMetaBranchMgr( theCtxt, aComponentOwner_ownedComponentsBMgr);

		aAssemblyOwner_ownedAssembliesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AssemblyOwner_ownedAssembliesBMgr"));
		addBranchMgrs( theCtxt, aAssemblyOwner_ownedAssembliesBMgr);
		aAssemblyOwner_ownedAssembliesBC.setMetaBranchMgr( theCtxt, aAssemblyOwner_ownedAssembliesBMgr);

		aLinkOwner_ownedLinksBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("LinkOwner_ownedLinksBMgr"));
		addBranchMgrs( theCtxt, aLinkOwner_ownedLinksBMgr);
		aLinkOwner_ownedLinksBC.setMetaBranchMgr( theCtxt, aLinkOwner_ownedLinksBMgr);

		aPortOwner_ownedPortsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("PortOwner_ownedPortsBMgr"));
		addBranchMgrs( theCtxt, aPortOwner_ownedPortsBMgr);
		aPortOwner_ownedPortsBC.setMetaBranchMgr( theCtxt, aPortOwner_ownedPortsBMgr);

		aAbstractPort_linksBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractPort_linksBMgr"));
		addBranchMgrs( theCtxt, aAbstractPort_linksBMgr);
		aAbstractPort_linksBC.setMetaBranchMgr( theCtxt, aAbstractPort_linksBMgr);

		aAbstractPort_connectedLinksBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractPort_connectedLinksBMgr"));
		addBranchMgrs( theCtxt, aAbstractPort_connectedLinksBMgr);
		aAbstractPort_connectedLinksBC.setMetaBranchMgr( theCtxt, aAbstractPort_connectedLinksBMgr);

		aDelegationOwner_ownedDelegationsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("DelegationOwner_ownedDelegationsBMgr"));
		addBranchMgrs( theCtxt, aDelegationOwner_ownedDelegationsBMgr);
		aDelegationOwner_ownedDelegationsBC.setMetaBranchMgr( theCtxt, aDelegationOwner_ownedDelegationsBMgr);

		aDelegator_delegatorOfBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Delegator_delegatorOfBMgr"));
		addBranchMgrs( theCtxt, aDelegator_delegatorOfBMgr);
		aDelegator_delegatorOfBC.setMetaBranchMgr( theCtxt, aDelegator_delegatorOfBMgr);

		aDelegation_delegatorBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Delegation_delegatorBMgr"));
		addBranchMgrs( theCtxt, aDelegation_delegatorBMgr);
		aDelegation_delegatorBC.setMetaBranchMgr( theCtxt, aDelegation_delegatorBMgr);

		aDelegation_delegateBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Delegation_delegateBMgr"));
		addBranchMgrs( theCtxt, aDelegation_delegateBMgr);
		aDelegation_delegateBC.setMetaBranchMgr( theCtxt, aDelegation_delegateBMgr);

		aDelegate_delegateOfBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Delegate_delegateOfBMgr"));
		addBranchMgrs( theCtxt, aDelegate_delegateOfBMgr);
		aDelegate_delegateOfBC.setMetaBranchMgr( theCtxt, aDelegate_delegateOfBMgr);

		aAbstractLink_connectedPortBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractLink_connectedPortBMgr"));
		addBranchMgrs( theCtxt, aAbstractLink_connectedPortBMgr);
		aAbstractLink_connectedPortBC.setMetaBranchMgr( theCtxt, aAbstractLink_connectedPortBMgr);

		aAbstractLink_linkBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractLink_linkBMgr"));
		addBranchMgrs( theCtxt, aAbstractLink_linkBMgr);
		aAbstractLink_linkBC.setMetaBranchMgr( theCtxt, aAbstractLink_linkBMgr);

		aDependencyOwner_ownedDependenciesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("DependencyOwner_ownedDependenciesBMgr"));
		addBranchMgrs( theCtxt, aDependencyOwner_ownedDependenciesBMgr);
		aDependencyOwner_ownedDependenciesBC.setMetaBranchMgr( theCtxt, aDependencyOwner_ownedDependenciesBMgr);

		aAbstractEnumeratedType_enumeratedValuesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("AbstractEnumeratedType_enumeratedValuesBMgr"));
		addBranchMgrs( theCtxt, aAbstractEnumeratedType_enumeratedValuesBMgr);
		aAbstractEnumeratedType_enumeratedValuesBC.setMetaBranchMgr( theCtxt, aAbstractEnumeratedType_enumeratedValuesBMgr);

		aDefinedStructuralFeature_infoTypeBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("DefinedStructuralFeature_infoTypeBMgr"));
		addBranchMgrs( theCtxt, aDefinedStructuralFeature_infoTypeBMgr);
		aDefinedStructuralFeature_infoTypeBC.setMetaBranchMgr( theCtxt, aDefinedStructuralFeature_infoTypeBMgr);

		aInfoTypeOwner_ownedInfoTypesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypesBMgr"));
		addBranchMgrs( theCtxt, aInfoTypeOwner_ownedInfoTypesBMgr);
		aInfoTypeOwner_ownedInfoTypesBC.setMetaBranchMgr( theCtxt, aInfoTypeOwner_ownedInfoTypesBMgr);

		aStructuralFeatureOwner_ownedStructuralFeaturesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeaturesBMgr"));
		addBranchMgrs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBMgr);
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.setMetaBranchMgr( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBMgr);

		aStructuralFeature_exposedAsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("StructuralFeature_exposedAsBMgr"));
		addBranchMgrs( theCtxt, aStructuralFeature_exposedAsBMgr);
		aStructuralFeature_exposedAsBC.setMetaBranchMgr( theCtxt, aStructuralFeature_exposedAsBMgr);

		aExposedStructuralFeature_exposedBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("ExposedStructuralFeature_exposedBMgr"));
		addBranchMgrs( theCtxt, aExposedStructuralFeature_exposedBMgr);
		aExposedStructuralFeature_exposedBC.setMetaBranchMgr( theCtxt, aExposedStructuralFeature_exposedBMgr);

		aTarget_transformationsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Target_transformationsBMgr"));
		addBranchMgrs( theCtxt, aTarget_transformationsBMgr);
		aTarget_transformationsBC.setMetaBranchMgr( theCtxt, aTarget_transformationsBMgr);

		aTransformation_subTransformationsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Transformation_subTransformationsBMgr"));
		addBranchMgrs( theCtxt, aTransformation_subTransformationsBMgr);
		aTransformation_subTransformationsBC.setMetaBranchMgr( theCtxt, aTransformation_subTransformationsBMgr);

		aComment_attachementsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Comment_attachementsBMgr"));
		addBranchMgrs( theCtxt, aComment_attachementsBMgr);
		aComment_attachementsBC.setMetaBranchMgr( theCtxt, aComment_attachementsBMgr);

		aAnnotation_sourcesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Annotation_sourcesBMgr"));
		addBranchMgrs( theCtxt, aAnnotation_sourcesBMgr);
		aAnnotation_sourcesBC.setMetaBranchMgr( theCtxt, aAnnotation_sourcesBMgr);

		aSource_sourceOfAnnnotationsBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("Source_sourceOfAnnnotationsBMgr"));
		addBranchMgrs( theCtxt, aSource_sourceOfAnnnotationsBMgr);
		aSource_sourceOfAnnnotationsBC.setMetaBranchMgr( theCtxt, aSource_sourceOfAnnnotationsBMgr);

		aPackageOwner_subPackagesBMgr  =   (M3BranchMgrIfc) theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "BranchMgr", "traversal",new EAIMMName("PackageOwner_subPackagesBMgr"));
		addBranchMgrs( theCtxt, aPackageOwner_subPackagesBMgr);
		aPackageOwner_subPackagesBC.setMetaBranchMgr( theCtxt, aPackageOwner_subPackagesBMgr);


  }


  protected void initRelatedTypeNodeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Related type node configs  instantiations
   *******************************************************/
		aProjectable_originalOfProjections_FachadeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projectable_originalOfProjections_FachadeRelTNC"));
		aProjectable_originalOfProjections_FachadeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		aProjectable_originalOfProjections_FachadeRelTNC.setNodeConfig( theCtxt, aFachadeNCTerm);

		aProjectable_originalOfProjections_HideRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projectable_originalOfProjections_HideRelTNC"));
		aProjectable_originalOfProjections_HideRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Hide", "core.projection.projecting"));
		aProjectable_originalOfProjections_HideRelTNC.setNodeConfig( theCtxt, aHideNCTerm);

		aProjection_originals_RelayProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RelayProjectionRelTNC"));
		aProjection_originals_RelayProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		aProjection_originals_RelayProjectionRelTNC.setNodeConfig( theCtxt, aRelayProjectionNCTerm);

		aProjection_originals_EnumeratedTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_EnumeratedTypeRelTNC"));
		aProjection_originals_EnumeratedTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedType", "core.model.structural"));
		aProjection_originals_EnumeratedTypeRelTNC.setNodeConfig( theCtxt, aEnumeratedTypeNCTerm);

		aProjection_originals_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_LinkProjectionRelTNC"));
		aProjection_originals_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aProjection_originals_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNCTerm);

		aProjection_originals_BehaviorInHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_BehaviorInHandlerRelTNC"));
		aProjection_originals_BehaviorInHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		aProjection_originals_BehaviorInHandlerRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNCTerm);

		aProjection_originals_RespondedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RespondedProjectionRelTNC"));
		aProjection_originals_RespondedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		aProjection_originals_RespondedProjectionRelTNC.setNodeConfig( theCtxt, aRespondedProjectionNCTerm);

		aProjection_originals_AssemblyProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AssemblyProjectionRelTNC"));
		aProjection_originals_AssemblyProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		aProjection_originals_AssemblyProjectionRelTNC.setNodeConfig( theCtxt, aAssemblyProjectionNCTerm);

		aProjection_originals_ListenedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ListenedRelTNC"));
		aProjection_originals_ListenedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		aProjection_originals_ListenedRelTNC.setNodeConfig( theCtxt, aListenedNCTerm);

		aProjection_originals_ProjectProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ProjectProjectionRelTNC"));
		aProjection_originals_ProjectProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectProjection", "core.projection.organize"));
		aProjection_originals_ProjectProjectionRelTNC.setNodeConfig( theCtxt, aProjectProjectionNCTerm);

		aProjection_originals_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PortProjectionRelTNC"));
		aProjection_originals_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aProjection_originals_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNCTerm);

		aProjection_originals_ReferenceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ReferenceRelTNC"));
		aProjection_originals_ReferenceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		aProjection_originals_ReferenceRelTNC.setNodeConfig( theCtxt, aReferenceNCTerm);

		aProjection_originals_SignaledProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_SignaledProjectionRelTNC"));
		aProjection_originals_SignaledProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		aProjection_originals_SignaledProjectionRelTNC.setNodeConfig( theCtxt, aSignaledProjectionNCTerm);

		aProjection_originals_ComponentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ComponentProjectionRelTNC"));
		aProjection_originals_ComponentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		aProjection_originals_ComponentProjectionRelTNC.setNodeConfig( theCtxt, aComponentProjectionNCTerm);

		aProjection_originals_RespondedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RespondedRelTNC"));
		aProjection_originals_RespondedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		aProjection_originals_RespondedRelTNC.setNodeConfig( theCtxt, aRespondedNCTerm);

		aProjection_originals_RequestedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RequestedRelTNC"));
		aProjection_originals_RequestedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		aProjection_originals_RequestedRelTNC.setNodeConfig( theCtxt, aRequestedNCTerm);

		aProjection_originals_RequestedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RequestedProjectionRelTNC"));
		aProjection_originals_RequestedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		aProjection_originals_RequestedProjectionRelTNC.setNodeConfig( theCtxt, aRequestedProjectionNCTerm);

		aProjection_originals_AliasProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AliasProjectionRelTNC"));
		aProjection_originals_AliasProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		aProjection_originals_AliasProjectionRelTNC.setNodeConfig( theCtxt, aAliasProjectionNCTerm);

		aProjection_originals_SignaledRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_SignaledRelTNC"));
		aProjection_originals_SignaledRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		aProjection_originals_SignaledRelTNC.setNodeConfig( theCtxt, aSignaledNCTerm);

		aProjection_originals_ReferenceProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ReferenceProjectionRelTNC"));
		aProjection_originals_ReferenceProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		aProjection_originals_ReferenceProjectionRelTNC.setNodeConfig( theCtxt, aReferenceProjectionNCTerm);

		aProjection_originals_BehaviorInHandlerProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_BehaviorInHandlerProjectionRelTNC"));
		aProjection_originals_BehaviorInHandlerProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		aProjection_originals_BehaviorInHandlerProjectionRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNCTerm);

		aProjection_originals_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AttributeRelTNC"));
		aProjection_originals_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		aProjection_originals_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aProjection_originals_AliasRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AliasRelTNC"));
		aProjection_originals_AliasRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		aProjection_originals_AliasRelTNC.setNodeConfig( theCtxt, aAliasNCTerm);

		aProjection_originals_PrimitiveJavaClassProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PrimitiveJavaClassProjectionRelTNC"));
		aProjection_originals_PrimitiveJavaClassProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"));
		aProjection_originals_PrimitiveJavaClassProjectionRelTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassProjectionNCTerm);

		aProjection_originals_ProjectRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ProjectRelTNC"));
		aProjection_originals_ProjectRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Project", "core.model.organize"));
		aProjection_originals_ProjectRelTNC.setNodeConfig( theCtxt, aProjectNCTerm);

		aProjection_originals_StructuredJavaClassRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_StructuredJavaClassRelTNC"));
		aProjection_originals_StructuredJavaClassRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		aProjection_originals_StructuredJavaClassRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassNCTerm);

		aProjection_originals_DocumentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_DocumentProjectionRelTNC"));
		aProjection_originals_DocumentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		aProjection_originals_DocumentProjectionRelTNC.setNodeConfig( theCtxt, aDocumentProjectionNCTerm);

		aProjection_originals_ListenedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ListenedProjectionRelTNC"));
		aProjection_originals_ListenedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		aProjection_originals_ListenedProjectionRelTNC.setNodeConfig( theCtxt, aListenedProjectionNCTerm);

		aProjection_originals_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PortRelTNC"));
		aProjection_originals_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aProjection_originals_PortRelTNC.setNodeConfig( theCtxt, aPortNCTerm);

		aProjection_originals_StructuredJavaClassProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_StructuredJavaClassProjectionRelTNC"));
		aProjection_originals_StructuredJavaClassProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		aProjection_originals_StructuredJavaClassProjectionRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassProjectionNCTerm);

		aProjection_originals_EnumeratedTypeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_EnumeratedTypeProjectionRelTNC"));
		aProjection_originals_EnumeratedTypeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"));
		aProjection_originals_EnumeratedTypeProjectionRelTNC.setNodeConfig( theCtxt, aEnumeratedTypeProjectionNCTerm);

		aProjection_originals_RelayRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_RelayRelTNC"));
		aProjection_originals_RelayRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		aProjection_originals_RelayRelTNC.setNodeConfig( theCtxt, aRelayNCTerm);

		aProjection_originals_PackageRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PackageRelTNC"));
		aProjection_originals_PackageRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		aProjection_originals_PackageRelTNC.setNodeConfig( theCtxt, aPackageNCTerm);

		aProjection_originals_DocumentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_DocumentRelTNC"));
		aProjection_originals_DocumentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		aProjection_originals_DocumentRelTNC.setNodeConfig( theCtxt, aDocumentNCTerm);

		aProjection_originals_AssemblyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AssemblyRelTNC"));
		aProjection_originals_AssemblyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		aProjection_originals_AssemblyRelTNC.setNodeConfig( theCtxt, aAssemblyNCTerm);

		aProjection_originals_PrimitiveJavaClassRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PrimitiveJavaClassRelTNC"));
		aProjection_originals_PrimitiveJavaClassRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClass", "core.model.structural"));
		aProjection_originals_PrimitiveJavaClassRelTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassNCTerm);

		aProjection_originals_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_LinkRelTNC"));
		aProjection_originals_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aProjection_originals_LinkRelTNC.setNodeConfig( theCtxt, aLinkNCTerm);

		aProjection_originals_AttributeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_AttributeProjectionRelTNC"));
		aProjection_originals_AttributeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		aProjection_originals_AttributeProjectionRelTNC.setNodeConfig( theCtxt, aAttributeProjectionNCTerm);

		aProjection_originals_ComponentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_ComponentRelTNC"));
		aProjection_originals_ComponentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		aProjection_originals_ComponentRelTNC.setNodeConfig( theCtxt, aComponentNCTerm);

		aProjection_originals_PackageProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_originals_PackageProjectionRelTNC"));
		aProjection_originals_PackageProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		aProjection_originals_PackageProjectionRelTNC.setNodeConfig( theCtxt, aPackageProjectionNCTerm);

		aProjection_subProjections_FachadeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_subProjections_FachadeRelTNC"));
		aProjection_subProjections_FachadeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		aProjection_subProjections_FachadeRelTNC.setNodeConfig( theCtxt, aFachadeNC);

		aProjection_subProjections_HideRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projection_subProjections_HideRelTNC"));
		aProjection_subProjections_HideRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Hide", "core.projection.projecting"));
		aProjection_subProjections_HideRelTNC.setNodeConfig( theCtxt, aHideNC);

		aProjected_projections_FachadeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Projected_projections_FachadeRelTNC"));
		aProjected_projections_FachadeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Fachade", "core.projection.projecting"));
		aProjected_projections_FachadeRelTNC.setNodeConfig( theCtxt, aFachadeNC);

		aBidirectionalInteraction_ownedReturns_ReturnRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BidirectionalInteraction_ownedReturns_ReturnRelTNC"));
		aBidirectionalInteraction_ownedReturns_ReturnRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Return", "core.model.behavior"));
		aBidirectionalInteraction_ownedReturns_ReturnRelTNC.setNodeConfig( theCtxt, aReturnNC);

		aInteractionOwner_ownedInteractions_ListenedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_ListenedProjectionRelTNC"));
		aInteractionOwner_ownedInteractions_ListenedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		aInteractionOwner_ownedInteractions_ListenedProjectionRelTNC.setNodeConfig( theCtxt, aListenedProjectionNC);

		aInteractionOwner_ownedInteractions_ListenedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_ListenedRelTNC"));
		aInteractionOwner_ownedInteractions_ListenedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		aInteractionOwner_ownedInteractions_ListenedRelTNC.setNodeConfig( theCtxt, aListenedNC);

		aInteractionOwner_ownedInteractions_SignaledProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_SignaledProjectionRelTNC"));
		aInteractionOwner_ownedInteractions_SignaledProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		aInteractionOwner_ownedInteractions_SignaledProjectionRelTNC.setNodeConfig( theCtxt, aSignaledProjectionNC);

		aInteractionOwner_ownedInteractions_SignaledRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_SignaledRelTNC"));
		aInteractionOwner_ownedInteractions_SignaledRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		aInteractionOwner_ownedInteractions_SignaledRelTNC.setNodeConfig( theCtxt, aSignaledNC);

		aInteractionOwner_ownedInteractions_RespondedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_RespondedRelTNC"));
		aInteractionOwner_ownedInteractions_RespondedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		aInteractionOwner_ownedInteractions_RespondedRelTNC.setNodeConfig( theCtxt, aRespondedNC);

		aInteractionOwner_ownedInteractions_RespondedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_RespondedProjectionRelTNC"));
		aInteractionOwner_ownedInteractions_RespondedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		aInteractionOwner_ownedInteractions_RespondedProjectionRelTNC.setNodeConfig( theCtxt, aRespondedProjectionNC);

		aInteractionOwner_ownedInteractions_RequestedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_RequestedRelTNC"));
		aInteractionOwner_ownedInteractions_RequestedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		aInteractionOwner_ownedInteractions_RequestedRelTNC.setNodeConfig( theCtxt, aRequestedNC);

		aInteractionOwner_ownedInteractions_RequestedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InteractionOwner_ownedInteractions_RequestedProjectionRelTNC"));
		aInteractionOwner_ownedInteractions_RequestedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		aInteractionOwner_ownedInteractions_RequestedProjectionRelTNC.setNodeConfig( theCtxt, aRequestedProjectionNC);

		aInteraction_ownedStimuli_StimuliRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Interaction_ownedStimuli_StimuliRelTNC"));
		aInteraction_ownedStimuli_StimuliRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Stimuli", "core.model.behavior"));
		aInteraction_ownedStimuli_StimuliRelTNC.setNodeConfig( theCtxt, aStimuliNC);

		aHandlerOwner_ownedHandlers_JavaClassHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("HandlerOwner_ownedHandlers_JavaClassHandlerRelTNC"));
		aHandlerOwner_ownedHandlers_JavaClassHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaClassHandler", "core.model.behavior"));
		aHandlerOwner_ownedHandlers_JavaClassHandlerRelTNC.setNodeConfig( theCtxt, aJavaClassHandlerNC);

		aHandler_handlerOfBehaviors_BehaviorInHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Handler_handlerOfBehaviors_BehaviorInHandlerRelTNC"));
		aHandler_handlerOfBehaviors_BehaviorInHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		aHandler_handlerOfBehaviors_BehaviorInHandlerRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNCTerm);

		aHandler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Handler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC"));
		aHandler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		aHandler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNCTerm);

		aAbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC"));
		aAbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaClassHandler", "core.model.behavior"));
		aAbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC.setNodeConfig( theCtxt, aJavaClassHandlerNCTerm);

		aAbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC"));
		aAbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaMethodDispatcher", "core.model.behavior"));
		aAbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC.setNodeConfig( theCtxt, aJavaMethodDispatcherNCTerm);

		aDispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC"));
		aDispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "JavaMethodDispatcher", "core.model.behavior"));
		aDispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC.setNodeConfig( theCtxt, aJavaMethodDispatcherNC);

		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Dispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC"));
		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNCTerm);

		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Dispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC"));
		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNCTerm);

		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC"));
		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNC);

		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("BehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC"));
		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		aBehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNC);

		aComponentOwner_ownedComponents_PrimitiveProcessRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_PrimitiveProcessRelTNC"));
		aComponentOwner_ownedComponents_PrimitiveProcessRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveProcess", "core.model.edoc"));
		aComponentOwner_ownedComponents_PrimitiveProcessRelTNC.setNodeConfig( theCtxt, aPrimitiveProcessNC);

		aComponentOwner_ownedComponents_CompositeProcessRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_CompositeProcessRelTNC"));
		aComponentOwner_ownedComponents_CompositeProcessRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CompositeProcess", "core.model.edoc"));
		aComponentOwner_ownedComponents_CompositeProcessRelTNC.setNodeConfig( theCtxt, aCompositeProcessNC);

		aComponentOwner_ownedComponents_ComponentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_ComponentRelTNC"));
		aComponentOwner_ownedComponents_ComponentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		aComponentOwner_ownedComponents_ComponentRelTNC.setNodeConfig( theCtxt, aComponentNC);

		aComponentOwner_ownedComponents_ProcessTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_ProcessTypeRelTNC"));
		aComponentOwner_ownedComponents_ProcessTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProcessType", "core.model.edoc"));
		aComponentOwner_ownedComponents_ProcessTypeRelTNC.setNodeConfig( theCtxt, aProcessTypeNC);

		aComponentOwner_ownedComponents_InternalRoleRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_InternalRoleRelTNC"));
		aComponentOwner_ownedComponents_InternalRoleRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InternalRole", "core.model.edoc"));
		aComponentOwner_ownedComponents_InternalRoleRelTNC.setNodeConfig( theCtxt, aInternalRoleNC);

		aComponentOwner_ownedComponents_ResourceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_ResourceRelTNC"));
		aComponentOwner_ownedComponents_ResourceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Resource", "core.model.edoc"));
		aComponentOwner_ownedComponents_ResourceRelTNC.setNodeConfig( theCtxt, aResourceNC);

		aComponentOwner_ownedComponents_ExternalRoleRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_ExternalRoleRelTNC"));
		aComponentOwner_ownedComponents_ExternalRoleRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExternalRole", "core.model.edoc"));
		aComponentOwner_ownedComponents_ExternalRoleRelTNC.setNodeConfig( theCtxt, aExternalRoleNC);

		aComponentOwner_ownedComponents_ComponentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ComponentOwner_ownedComponents_ComponentProjectionRelTNC"));
		aComponentOwner_ownedComponents_ComponentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		aComponentOwner_ownedComponents_ComponentProjectionRelTNC.setNodeConfig( theCtxt, aComponentProjectionNC);

		aAssemblyOwner_ownedAssemblies_AssemblyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AssemblyOwner_ownedAssemblies_AssemblyRelTNC"));
		aAssemblyOwner_ownedAssemblies_AssemblyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		aAssemblyOwner_ownedAssemblies_AssemblyRelTNC.setNodeConfig( theCtxt, aAssemblyNC);

		aAssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC"));
		aAssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		aAssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC.setNodeConfig( theCtxt, aAssemblyProjectionNC);

		aLinkOwner_ownedLinks_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("LinkOwner_ownedLinks_LinkProjectionRelTNC"));
		aLinkOwner_ownedLinks_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aLinkOwner_ownedLinks_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNC);

		aLinkOwner_ownedLinks_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("LinkOwner_ownedLinks_LinkRelTNC"));
		aLinkOwner_ownedLinks_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aLinkOwner_ownedLinks_LinkRelTNC.setNodeConfig( theCtxt, aLinkNC);

		aLinkOwner_ownedLinks_ConnectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("LinkOwner_ownedLinks_ConnectionRelTNC"));
		aLinkOwner_ownedLinks_ConnectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		aLinkOwner_ownedLinks_ConnectionRelTNC.setNodeConfig( theCtxt, aConnectionNC);

		aPortOwner_ownedPorts_InteractionPortalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PortOwner_ownedPorts_InteractionPortalRelTNC"));
		aPortOwner_ownedPorts_InteractionPortalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		aPortOwner_ownedPorts_InteractionPortalRelTNC.setNodeConfig( theCtxt, aInteractionPortalNC);

		aPortOwner_ownedPorts_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PortOwner_ownedPorts_PortProjectionRelTNC"));
		aPortOwner_ownedPorts_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aPortOwner_ownedPorts_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNC);

		aPortOwner_ownedPorts_InteractionInterfaceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PortOwner_ownedPorts_InteractionInterfaceRelTNC"));
		aPortOwner_ownedPorts_InteractionInterfaceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		aPortOwner_ownedPorts_InteractionInterfaceRelTNC.setNodeConfig( theCtxt, aInteractionInterfaceNC);

		aPortOwner_ownedPorts_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PortOwner_ownedPorts_PortRelTNC"));
		aPortOwner_ownedPorts_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aPortOwner_ownedPorts_PortRelTNC.setNodeConfig( theCtxt, aPortNC);

		aAbstractPort_links_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_links_LinkProjectionRelTNC"));
		aAbstractPort_links_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aAbstractPort_links_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNCTerm);

		aAbstractPort_links_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_links_LinkRelTNC"));
		aAbstractPort_links_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aAbstractPort_links_LinkRelTNC.setNodeConfig( theCtxt, aLinkNCTerm);

		aAbstractPort_links_ConnectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_links_ConnectionRelTNC"));
		aAbstractPort_links_ConnectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		aAbstractPort_links_ConnectionRelTNC.setNodeConfig( theCtxt, aConnectionNCTerm);

		aAbstractPort_connectedLinks_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_connectedLinks_LinkProjectionRelTNC"));
		aAbstractPort_connectedLinks_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aAbstractPort_connectedLinks_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNCTerm);

		aAbstractPort_connectedLinks_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_connectedLinks_LinkRelTNC"));
		aAbstractPort_connectedLinks_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aAbstractPort_connectedLinks_LinkRelTNC.setNodeConfig( theCtxt, aLinkNCTerm);

		aAbstractPort_connectedLinks_ConnectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractPort_connectedLinks_ConnectionRelTNC"));
		aAbstractPort_connectedLinks_ConnectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		aAbstractPort_connectedLinks_ConnectionRelTNC.setNodeConfig( theCtxt, aConnectionNCTerm);

		aDelegationOwner_ownedDelegations_AliasRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DelegationOwner_ownedDelegations_AliasRelTNC"));
		aDelegationOwner_ownedDelegations_AliasRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		aDelegationOwner_ownedDelegations_AliasRelTNC.setNodeConfig( theCtxt, aAliasNC);

		aDelegationOwner_ownedDelegations_AliasProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DelegationOwner_ownedDelegations_AliasProjectionRelTNC"));
		aDelegationOwner_ownedDelegations_AliasProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		aDelegationOwner_ownedDelegations_AliasProjectionRelTNC.setNodeConfig( theCtxt, aAliasProjectionNC);

		aDelegationOwner_ownedDelegations_RelayProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DelegationOwner_ownedDelegations_RelayProjectionRelTNC"));
		aDelegationOwner_ownedDelegations_RelayProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		aDelegationOwner_ownedDelegations_RelayProjectionRelTNC.setNodeConfig( theCtxt, aRelayProjectionNC);

		aDelegationOwner_ownedDelegations_RelayRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DelegationOwner_ownedDelegations_RelayRelTNC"));
		aDelegationOwner_ownedDelegations_RelayRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		aDelegationOwner_ownedDelegations_RelayRelTNC.setNodeConfig( theCtxt, aRelayNC);

		aDelegator_delegatorOf_AliasRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegator_delegatorOf_AliasRelTNC"));
		aDelegator_delegatorOf_AliasRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		aDelegator_delegatorOf_AliasRelTNC.setNodeConfig( theCtxt, aAliasNCTerm);

		aDelegator_delegatorOf_AliasProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegator_delegatorOf_AliasProjectionRelTNC"));
		aDelegator_delegatorOf_AliasProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		aDelegator_delegatorOf_AliasProjectionRelTNC.setNodeConfig( theCtxt, aAliasProjectionNCTerm);

		aDelegator_delegatorOf_RelayProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegator_delegatorOf_RelayProjectionRelTNC"));
		aDelegator_delegatorOf_RelayProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		aDelegator_delegatorOf_RelayProjectionRelTNC.setNodeConfig( theCtxt, aRelayProjectionNCTerm);

		aDelegator_delegatorOf_RelayRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegator_delegatorOf_RelayRelTNC"));
		aDelegator_delegatorOf_RelayRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		aDelegator_delegatorOf_RelayRelTNC.setNodeConfig( theCtxt, aRelayNCTerm);

		aDelegation_delegator_InteractionPortalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegator_InteractionPortalRelTNC"));
		aDelegation_delegator_InteractionPortalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		aDelegation_delegator_InteractionPortalRelTNC.setNodeConfig( theCtxt, aInteractionPortalNCTerm);

		aDelegation_delegator_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegator_PortProjectionRelTNC"));
		aDelegation_delegator_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aDelegation_delegator_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNCTerm);

		aDelegation_delegator_InteractionInterfaceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegator_InteractionInterfaceRelTNC"));
		aDelegation_delegator_InteractionInterfaceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		aDelegation_delegator_InteractionInterfaceRelTNC.setNodeConfig( theCtxt, aInteractionInterfaceNCTerm);

		aDelegation_delegator_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegator_PortRelTNC"));
		aDelegation_delegator_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aDelegation_delegator_PortRelTNC.setNodeConfig( theCtxt, aPortNCTerm);

		aDelegation_delegate_InteractionPortalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegate_InteractionPortalRelTNC"));
		aDelegation_delegate_InteractionPortalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		aDelegation_delegate_InteractionPortalRelTNC.setNodeConfig( theCtxt, aInteractionPortalNCTerm);

		aDelegation_delegate_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegate_PortProjectionRelTNC"));
		aDelegation_delegate_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aDelegation_delegate_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNCTerm);

		aDelegation_delegate_InteractionInterfaceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegate_InteractionInterfaceRelTNC"));
		aDelegation_delegate_InteractionInterfaceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		aDelegation_delegate_InteractionInterfaceRelTNC.setNodeConfig( theCtxt, aInteractionInterfaceNCTerm);

		aDelegation_delegate_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegation_delegate_PortRelTNC"));
		aDelegation_delegate_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aDelegation_delegate_PortRelTNC.setNodeConfig( theCtxt, aPortNCTerm);

		aDelegate_delegateOf_AliasRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegate_delegateOf_AliasRelTNC"));
		aDelegate_delegateOf_AliasRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		aDelegate_delegateOf_AliasRelTNC.setNodeConfig( theCtxt, aAliasNCTerm);

		aDelegate_delegateOf_AliasProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegate_delegateOf_AliasProjectionRelTNC"));
		aDelegate_delegateOf_AliasProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		aDelegate_delegateOf_AliasProjectionRelTNC.setNodeConfig( theCtxt, aAliasProjectionNCTerm);

		aDelegate_delegateOf_RelayProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegate_delegateOf_RelayProjectionRelTNC"));
		aDelegate_delegateOf_RelayProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		aDelegate_delegateOf_RelayProjectionRelTNC.setNodeConfig( theCtxt, aRelayProjectionNCTerm);

		aDelegate_delegateOf_RelayRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Delegate_delegateOf_RelayRelTNC"));
		aDelegate_delegateOf_RelayRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		aDelegate_delegateOf_RelayRelTNC.setNodeConfig( theCtxt, aRelayNCTerm);

		aAbstractLink_connectedPort_InteractionPortalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_connectedPort_InteractionPortalRelTNC"));
		aAbstractLink_connectedPort_InteractionPortalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		aAbstractLink_connectedPort_InteractionPortalRelTNC.setNodeConfig( theCtxt, aInteractionPortalNCTerm);

		aAbstractLink_connectedPort_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_connectedPort_PortProjectionRelTNC"));
		aAbstractLink_connectedPort_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aAbstractLink_connectedPort_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNCTerm);

		aAbstractLink_connectedPort_InteractionInterfaceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_connectedPort_InteractionInterfaceRelTNC"));
		aAbstractLink_connectedPort_InteractionInterfaceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		aAbstractLink_connectedPort_InteractionInterfaceRelTNC.setNodeConfig( theCtxt, aInteractionInterfaceNCTerm);

		aAbstractLink_connectedPort_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_connectedPort_PortRelTNC"));
		aAbstractLink_connectedPort_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aAbstractLink_connectedPort_PortRelTNC.setNodeConfig( theCtxt, aPortNCTerm);

		aAbstractLink_link_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_link_LinkProjectionRelTNC"));
		aAbstractLink_link_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aAbstractLink_link_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNCTerm);

		aAbstractLink_link_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_link_LinkRelTNC"));
		aAbstractLink_link_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aAbstractLink_link_LinkRelTNC.setNodeConfig( theCtxt, aLinkNCTerm);

		aAbstractLink_link_ConnectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractLink_link_ConnectionRelTNC"));
		aAbstractLink_link_ConnectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		aAbstractLink_link_ConnectionRelTNC.setNodeConfig( theCtxt, aConnectionNCTerm);

		aDependencyOwner_ownedDependencies_DependencyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DependencyOwner_ownedDependencies_DependencyRelTNC"));
		aDependencyOwner_ownedDependencies_DependencyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dependency", "core.model.observe"));
		aDependencyOwner_ownedDependencies_DependencyRelTNC.setNodeConfig( theCtxt, aDependencyNC);

		aAbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("AbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC"));
		aAbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedValue", "core.model.structural"));
		aAbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC.setNodeConfig( theCtxt, aEnumeratedValueNC);

		aDefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("DefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC"));
		aDefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralFeatureTyping", "core.model.structural"));
		aDefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC.setNodeConfig( theCtxt, aStructuralFeatureTypingNC);

		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedType", "core.model.structural"));
		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC.setNodeConfig( theCtxt, aEnumeratedTypeNC);

		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"));
		aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC.setNodeConfig( theCtxt, aEnumeratedTypeProjectionNC);

		aInfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredType", "core.model.structural"));
		aInfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC.setNodeConfig( theCtxt, aStructuredTypeNC);

		aInfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		aInfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC.setNodeConfig( theCtxt, aDocumentProjectionNC);

		aInfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BusinessSignal", "core.model.edoc"));
		aInfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC.setNodeConfig( theCtxt, aBusinessSignalNC);

		aInfoTypeOwner_ownedInfoTypes_DocumentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_DocumentRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_DocumentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		aInfoTypeOwner_ownedInfoTypes_DocumentRelTNC.setNodeConfig( theCtxt, aDocumentNC);

		aInfoTypeOwner_ownedInfoTypes_ContentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_ContentRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_ContentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Content", "core.model.edoc"));
		aInfoTypeOwner_ownedInfoTypes_ContentRelTNC.setNodeConfig( theCtxt, aContentNC);

		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassNC);

		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassProjectionNC);

		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClass", "core.model.structural"));
		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassNC);

		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("InfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC"));
		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"));
		aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC.setNodeConfig( theCtxt, aPrimitiveJavaClassProjectionNC);

		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC.setNodeConfig( theCtxt, aReferenceNC);

		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC.setNodeConfig( theCtxt, aReferenceProjectionNC);

		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC"));
		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNC);

		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC"));
		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		aStructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC.setNodeConfig( theCtxt, aAttributeProjectionNC);

		aStructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		aStructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC.setNodeConfig( theCtxt, aExposedStructuralFeatureNC);

		aStructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("StructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC"));
		aStructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		aStructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC.setNodeConfig( theCtxt, aExposedStructuralFeatureNCTerm);

		aExposedStructuralFeature_exposed_ReferenceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposed_ReferenceRelTNC"));
		aExposedStructuralFeature_exposed_ReferenceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		aExposedStructuralFeature_exposed_ReferenceRelTNC.setNodeConfig( theCtxt, aReferenceNCTerm);

		aExposedStructuralFeature_exposed_ReferenceProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposed_ReferenceProjectionRelTNC"));
		aExposedStructuralFeature_exposed_ReferenceProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		aExposedStructuralFeature_exposed_ReferenceProjectionRelTNC.setNodeConfig( theCtxt, aReferenceProjectionNCTerm);

		aExposedStructuralFeature_exposed_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposed_AttributeRelTNC"));
		aExposedStructuralFeature_exposed_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		aExposedStructuralFeature_exposed_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aExposedStructuralFeature_exposed_AttributeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposed_AttributeProjectionRelTNC"));
		aExposedStructuralFeature_exposed_AttributeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		aExposedStructuralFeature_exposed_AttributeProjectionRelTNC.setNodeConfig( theCtxt, aAttributeProjectionNCTerm);

		aExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("ExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC"));
		aExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		aExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC.setNodeConfig( theCtxt, aExposedStructuralFeatureNCTerm);

		aTarget_transformations_TransformationRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Target_transformations_TransformationRelTNC"));
		aTarget_transformations_TransformationRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		aTarget_transformations_TransformationRelTNC.setNodeConfig( theCtxt, aTransformationNC);

		aTarget_transformations_SynthesisRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Target_transformations_SynthesisRelTNC"));
		aTarget_transformations_SynthesisRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		aTarget_transformations_SynthesisRelTNC.setNodeConfig( theCtxt, aSynthesisNC);

		aTarget_transformations_VersionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Target_transformations_VersionRelTNC"));
		aTarget_transformations_VersionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		aTarget_transformations_VersionRelTNC.setNodeConfig( theCtxt, aVersionNC);

		aTransformation_subTransformations_TransformationRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Transformation_subTransformations_TransformationRelTNC"));
		aTransformation_subTransformations_TransformationRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		aTransformation_subTransformations_TransformationRelTNC.setNodeConfig( theCtxt, aTransformationNC);

		aTransformation_subTransformations_SynthesisRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Transformation_subTransformations_SynthesisRelTNC"));
		aTransformation_subTransformations_SynthesisRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		aTransformation_subTransformations_SynthesisRelTNC.setNodeConfig( theCtxt, aSynthesisNC);

		aTransformation_subTransformations_VersionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Transformation_subTransformations_VersionRelTNC"));
		aTransformation_subTransformations_VersionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		aTransformation_subTransformations_VersionRelTNC.setNodeConfig( theCtxt, aVersionNC);

		aComment_attachements_AttachmentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Comment_attachements_AttachmentRelTNC"));
		aComment_attachements_AttachmentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attachment", "core.model.trace"));
		aComment_attachements_AttachmentRelTNC.setNodeConfig( theCtxt, aAttachmentNC);

		aComment_attachements_MediaRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Comment_attachements_MediaRelTNC"));
		aComment_attachements_MediaRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Media", "core.model.trace"));
		aComment_attachements_MediaRelTNC.setNodeConfig( theCtxt, aMediaNC);

		aComment_attachements_URLRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Comment_attachements_URLRelTNC"));
		aComment_attachements_URLRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "URL", "core.model.trace"));
		aComment_attachements_URLRelTNC.setNodeConfig( theCtxt, aURLNC);

		aAnnotation_sources_AliasRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AliasRelTNC"));
		aAnnotation_sources_AliasRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Alias", "core.model.define"));
		aAnnotation_sources_AliasRelTNC.setNodeConfig( theCtxt, aAliasNCTerm);

		aAnnotation_sources_AliasProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AliasProjectionRelTNC"));
		aAnnotation_sources_AliasProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AliasProjection", "core.projection.define"));
		aAnnotation_sources_AliasProjectionRelTNC.setNodeConfig( theCtxt, aAliasProjectionNCTerm);

		aAnnotation_sources_RelayProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RelayProjectionRelTNC"));
		aAnnotation_sources_RelayProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RelayProjection", "core.projection.define"));
		aAnnotation_sources_RelayProjectionRelTNC.setNodeConfig( theCtxt, aRelayProjectionNCTerm);

		aAnnotation_sources_RelayRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RelayRelTNC"));
		aAnnotation_sources_RelayRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Relay", "core.model.define"));
		aAnnotation_sources_RelayRelTNC.setNodeConfig( theCtxt, aRelayNCTerm);

		aAnnotation_sources_AssemblyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AssemblyRelTNC"));
		aAnnotation_sources_AssemblyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Assembly", "core.model.define"));
		aAnnotation_sources_AssemblyRelTNC.setNodeConfig( theCtxt, aAssemblyNCTerm);

		aAnnotation_sources_AssemblyProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AssemblyProjectionRelTNC"));
		aAnnotation_sources_AssemblyProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AssemblyProjection", "core.projection.define"));
		aAnnotation_sources_AssemblyProjectionRelTNC.setNodeConfig( theCtxt, aAssemblyProjectionNCTerm);

		aAnnotation_sources_InteractionPortalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_InteractionPortalRelTNC"));
		aAnnotation_sources_InteractionPortalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionPortal", "core.model.edoc"));
		aAnnotation_sources_InteractionPortalRelTNC.setNodeConfig( theCtxt, aInteractionPortalNCTerm);

		aAnnotation_sources_PortProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_PortProjectionRelTNC"));
		aAnnotation_sources_PortProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PortProjection", "core.projection.define"));
		aAnnotation_sources_PortProjectionRelTNC.setNodeConfig( theCtxt, aPortProjectionNCTerm);

		aAnnotation_sources_InteractionInterfaceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_InteractionInterfaceRelTNC"));
		aAnnotation_sources_InteractionInterfaceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InteractionInterface", "core.model.edoc"));
		aAnnotation_sources_InteractionInterfaceRelTNC.setNodeConfig( theCtxt, aInteractionInterfaceNCTerm);

		aAnnotation_sources_PortRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_PortRelTNC"));
		aAnnotation_sources_PortRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Port", "core.model.define"));
		aAnnotation_sources_PortRelTNC.setNodeConfig( theCtxt, aPortNCTerm);

		aAnnotation_sources_ReferenceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ReferenceRelTNC"));
		aAnnotation_sources_ReferenceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Reference", "core.model.edoc"));
		aAnnotation_sources_ReferenceRelTNC.setNodeConfig( theCtxt, aReferenceNCTerm);

		aAnnotation_sources_ReferenceProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ReferenceProjectionRelTNC"));
		aAnnotation_sources_ReferenceProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ReferenceProjection", "core.projection.structural"));
		aAnnotation_sources_ReferenceProjectionRelTNC.setNodeConfig( theCtxt, aReferenceProjectionNCTerm);

		aAnnotation_sources_AttributeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AttributeRelTNC"));
		aAnnotation_sources_AttributeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Attribute", "core.model.edoc"));
		aAnnotation_sources_AttributeRelTNC.setNodeConfig( theCtxt, aAttributeNCTerm);

		aAnnotation_sources_AttributeProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_AttributeProjectionRelTNC"));
		aAnnotation_sources_AttributeProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "AttributeProjection", "core.projection.structural"));
		aAnnotation_sources_AttributeProjectionRelTNC.setNodeConfig( theCtxt, aAttributeProjectionNCTerm);

		aAnnotation_sources_ExposedStructuralFeatureRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ExposedStructuralFeatureRelTNC"));
		aAnnotation_sources_ExposedStructuralFeatureRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExposedStructuralFeature", "core.model.structural"));
		aAnnotation_sources_ExposedStructuralFeatureRelTNC.setNodeConfig( theCtxt, aExposedStructuralFeatureNCTerm);

		aAnnotation_sources_PrimitiveProcessRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_PrimitiveProcessRelTNC"));
		aAnnotation_sources_PrimitiveProcessRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PrimitiveProcess", "core.model.edoc"));
		aAnnotation_sources_PrimitiveProcessRelTNC.setNodeConfig( theCtxt, aPrimitiveProcessNCTerm);

		aAnnotation_sources_CompositeProcessRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_CompositeProcessRelTNC"));
		aAnnotation_sources_CompositeProcessRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "CompositeProcess", "core.model.edoc"));
		aAnnotation_sources_CompositeProcessRelTNC.setNodeConfig( theCtxt, aCompositeProcessNCTerm);

		aAnnotation_sources_ComponentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ComponentRelTNC"));
		aAnnotation_sources_ComponentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Component", "core.model.define"));
		aAnnotation_sources_ComponentRelTNC.setNodeConfig( theCtxt, aComponentNCTerm);

		aAnnotation_sources_ProcessTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ProcessTypeRelTNC"));
		aAnnotation_sources_ProcessTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProcessType", "core.model.edoc"));
		aAnnotation_sources_ProcessTypeRelTNC.setNodeConfig( theCtxt, aProcessTypeNCTerm);

		aAnnotation_sources_InternalRoleRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_InternalRoleRelTNC"));
		aAnnotation_sources_InternalRoleRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "InternalRole", "core.model.edoc"));
		aAnnotation_sources_InternalRoleRelTNC.setNodeConfig( theCtxt, aInternalRoleNCTerm);

		aAnnotation_sources_ResourceRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ResourceRelTNC"));
		aAnnotation_sources_ResourceRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Resource", "core.model.edoc"));
		aAnnotation_sources_ResourceRelTNC.setNodeConfig( theCtxt, aResourceNCTerm);

		aAnnotation_sources_ExternalRoleRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ExternalRoleRelTNC"));
		aAnnotation_sources_ExternalRoleRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ExternalRole", "core.model.edoc"));
		aAnnotation_sources_ExternalRoleRelTNC.setNodeConfig( theCtxt, aExternalRoleNCTerm);

		aAnnotation_sources_ComponentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ComponentProjectionRelTNC"));
		aAnnotation_sources_ComponentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ComponentProjection", "core.projection.define"));
		aAnnotation_sources_ComponentProjectionRelTNC.setNodeConfig( theCtxt, aComponentProjectionNCTerm);

		aAnnotation_sources_BehaviorInHandlerRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_BehaviorInHandlerRelTNC"));
		aAnnotation_sources_BehaviorInHandlerRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandler", "core.model.behavior"));
		aAnnotation_sources_BehaviorInHandlerRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerNCTerm);

		aAnnotation_sources_BehaviorInHandlerProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_BehaviorInHandlerProjectionRelTNC"));
		aAnnotation_sources_BehaviorInHandlerProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"));
		aAnnotation_sources_BehaviorInHandlerProjectionRelTNC.setNodeConfig( theCtxt, aBehaviorInHandlerProjectionNCTerm);

		aAnnotation_sources_ListenedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ListenedProjectionRelTNC"));
		aAnnotation_sources_ListenedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ListenedProjection", "core.projection.behavior"));
		aAnnotation_sources_ListenedProjectionRelTNC.setNodeConfig( theCtxt, aListenedProjectionNCTerm);

		aAnnotation_sources_ListenedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ListenedRelTNC"));
		aAnnotation_sources_ListenedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Listened", "core.model.behavior"));
		aAnnotation_sources_ListenedRelTNC.setNodeConfig( theCtxt, aListenedNCTerm);

		aAnnotation_sources_SignaledProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_SignaledProjectionRelTNC"));
		aAnnotation_sources_SignaledProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "SignaledProjection", "core.projection.behavior"));
		aAnnotation_sources_SignaledProjectionRelTNC.setNodeConfig( theCtxt, aSignaledProjectionNCTerm);

		aAnnotation_sources_SignaledRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_SignaledRelTNC"));
		aAnnotation_sources_SignaledRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Signaled", "core.model.behavior"));
		aAnnotation_sources_SignaledRelTNC.setNodeConfig( theCtxt, aSignaledNCTerm);

		aAnnotation_sources_RespondedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RespondedRelTNC"));
		aAnnotation_sources_RespondedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Responded", "core.model.behavior"));
		aAnnotation_sources_RespondedRelTNC.setNodeConfig( theCtxt, aRespondedNCTerm);

		aAnnotation_sources_RespondedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RespondedProjectionRelTNC"));
		aAnnotation_sources_RespondedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RespondedProjection", "core.projection.behavior"));
		aAnnotation_sources_RespondedProjectionRelTNC.setNodeConfig( theCtxt, aRespondedProjectionNCTerm);

		aAnnotation_sources_RequestedRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RequestedRelTNC"));
		aAnnotation_sources_RequestedRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Requested", "core.model.behavior"));
		aAnnotation_sources_RequestedRelTNC.setNodeConfig( theCtxt, aRequestedNCTerm);

		aAnnotation_sources_RequestedProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_RequestedProjectionRelTNC"));
		aAnnotation_sources_RequestedProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "RequestedProjection", "core.projection.behavior"));
		aAnnotation_sources_RequestedProjectionRelTNC.setNodeConfig( theCtxt, aRequestedProjectionNCTerm);

		aAnnotation_sources_LinkProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_LinkProjectionRelTNC"));
		aAnnotation_sources_LinkProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "LinkProjection", "core.projection.define"));
		aAnnotation_sources_LinkProjectionRelTNC.setNodeConfig( theCtxt, aLinkProjectionNCTerm);

		aAnnotation_sources_LinkRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_LinkRelTNC"));
		aAnnotation_sources_LinkRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Link", "core.model.define"));
		aAnnotation_sources_LinkRelTNC.setNodeConfig( theCtxt, aLinkNCTerm);

		aAnnotation_sources_ConnectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ConnectionRelTNC"));
		aAnnotation_sources_ConnectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Connection", "core.model.edoc"));
		aAnnotation_sources_ConnectionRelTNC.setNodeConfig( theCtxt, aConnectionNCTerm);

		aAnnotation_sources_PackageProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_PackageProjectionRelTNC"));
		aAnnotation_sources_PackageProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		aAnnotation_sources_PackageProjectionRelTNC.setNodeConfig( theCtxt, aPackageProjectionNCTerm);

		aAnnotation_sources_PackageRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_PackageRelTNC"));
		aAnnotation_sources_PackageRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		aAnnotation_sources_PackageRelTNC.setNodeConfig( theCtxt, aPackageNCTerm);

		aAnnotation_sources_CommunityRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_CommunityRelTNC"));
		aAnnotation_sources_CommunityRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Community", "core.model.edoc"));
		aAnnotation_sources_CommunityRelTNC.setNodeConfig( theCtxt, aCommunityNCTerm);

		aAnnotation_sources_ProjectRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ProjectRelTNC"));
		aAnnotation_sources_ProjectRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Project", "core.model.organize"));
		aAnnotation_sources_ProjectRelTNC.setNodeConfig( theCtxt, aProjectNCTerm);

		aAnnotation_sources_ProjectProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ProjectProjectionRelTNC"));
		aAnnotation_sources_ProjectProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "ProjectProjection", "core.projection.organize"));
		aAnnotation_sources_ProjectProjectionRelTNC.setNodeConfig( theCtxt, aProjectProjectionNCTerm);

		aAnnotation_sources_StructuredTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_StructuredTypeRelTNC"));
		aAnnotation_sources_StructuredTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredType", "core.model.structural"));
		aAnnotation_sources_StructuredTypeRelTNC.setNodeConfig( theCtxt, aStructuredTypeNCTerm);

		aAnnotation_sources_DocumentProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_DocumentProjectionRelTNC"));
		aAnnotation_sources_DocumentProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "DocumentProjection", "core.projection.structural"));
		aAnnotation_sources_DocumentProjectionRelTNC.setNodeConfig( theCtxt, aDocumentProjectionNCTerm);

		aAnnotation_sources_BusinessSignalRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_BusinessSignalRelTNC"));
		aAnnotation_sources_BusinessSignalRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "BusinessSignal", "core.model.edoc"));
		aAnnotation_sources_BusinessSignalRelTNC.setNodeConfig( theCtxt, aBusinessSignalNCTerm);

		aAnnotation_sources_DocumentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_DocumentRelTNC"));
		aAnnotation_sources_DocumentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Document", "core.model.structural"));
		aAnnotation_sources_DocumentRelTNC.setNodeConfig( theCtxt, aDocumentNCTerm);

		aAnnotation_sources_ContentRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_ContentRelTNC"));
		aAnnotation_sources_ContentRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Content", "core.model.edoc"));
		aAnnotation_sources_ContentRelTNC.setNodeConfig( theCtxt, aContentNCTerm);

		aAnnotation_sources_StructuredJavaClassRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_StructuredJavaClassRelTNC"));
		aAnnotation_sources_StructuredJavaClassRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClass", "core.model.structural"));
		aAnnotation_sources_StructuredJavaClassRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassNCTerm);

		aAnnotation_sources_StructuredJavaClassProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_StructuredJavaClassProjectionRelTNC"));
		aAnnotation_sources_StructuredJavaClassProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"));
		aAnnotation_sources_StructuredJavaClassProjectionRelTNC.setNodeConfig( theCtxt, aStructuredJavaClassProjectionNCTerm);

		aAnnotation_sources_StructuralTypeRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_StructuralTypeRelTNC"));
		aAnnotation_sources_StructuralTypeRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "StructuralType", "core.model.edoc"));
		aAnnotation_sources_StructuralTypeRelTNC.setNodeConfig( theCtxt, aStructuralTypeNCTerm);

		aAnnotation_sources_DependencyRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Annotation_sources_DependencyRelTNC"));
		aAnnotation_sources_DependencyRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Dependency", "core.model.observe"));
		aAnnotation_sources_DependencyRelTNC.setNodeConfig( theCtxt, aDependencyNCTerm);

		aSource_sourceOfAnnnotations_AnnotationRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotations_AnnotationRelTNC"));
		aSource_sourceOfAnnnotations_AnnotationRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Annotation", "core.model.trace"));
		aSource_sourceOfAnnnotations_AnnotationRelTNC.setNodeConfig( theCtxt, aAnnotationNCTerm);

		aSource_sourceOfAnnnotations_TransformationRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotations_TransformationRelTNC"));
		aSource_sourceOfAnnnotations_TransformationRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Transformation", "core.model.trace"));
		aSource_sourceOfAnnnotations_TransformationRelTNC.setNodeConfig( theCtxt, aTransformationNCTerm);

		aSource_sourceOfAnnnotations_SynthesisRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotations_SynthesisRelTNC"));
		aSource_sourceOfAnnnotations_SynthesisRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Synthesis", "core.model.trace"));
		aSource_sourceOfAnnnotations_SynthesisRelTNC.setNodeConfig( theCtxt, aSynthesisNCTerm);

		aSource_sourceOfAnnnotations_VersionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotations_VersionRelTNC"));
		aSource_sourceOfAnnnotations_VersionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Version", "core.model.trace"));
		aSource_sourceOfAnnnotations_VersionRelTNC.setNodeConfig( theCtxt, aVersionNCTerm);

		aSource_sourceOfAnnnotations_ExclusionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("Source_sourceOfAnnnotations_ExclusionRelTNC"));
		aSource_sourceOfAnnnotations_ExclusionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Exclusion", "core.model.trace"));
		aSource_sourceOfAnnnotations_ExclusionRelTNC.setNodeConfig( theCtxt, aExclusionNCTerm);

		aPackageOwner_subPackages_PackageProjectionRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PackageOwner_subPackages_PackageProjectionRelTNC"));
		aPackageOwner_subPackages_PackageProjectionRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "PackageProjection", "core.projection.organize"));
		aPackageOwner_subPackages_PackageProjectionRelTNC.setNodeConfig( theCtxt, aPackageProjectionNC);

		aPackageOwner_subPackages_PackageRelTNC  =  (M3RelatedTypeNodeConfigIfc)  theCtxt.getMMFactory("M3").createMMElementOfType( theCtxt, "RelatedTypeNodeConfig", "traversal",new EAIMMName("PackageOwner_subPackages_PackageRelTNC"));
		aPackageOwner_subPackages_PackageRelTNC.setMetaType( theCtxt, ((com.dosmil_e.m3.core.pub.M3ModelPub) theM3Model).getM3TypeInPackagesNamed( theCtxt, "Package", "core.model.organize"));
		aPackageOwner_subPackages_PackageRelTNC.setNodeConfig( theCtxt, aPackageNC);


  }


  protected void initAttributeCfgsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Attribute configs  instantiations
   *******************************************************/

  }


  protected void initFieldMgrsInstantiations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Field mgrs  instantiations
   *******************************************************/

  }


  protected void initNodeCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model) throws EAIException {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Node configs
   *******************************************************/
		aProjectProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);
		aProjectProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aPackageProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);
		aPackageProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_dispatcherBC);
		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_handlerBC);
		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aBehaviorInHandlerProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aListenedProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aListenedProjectionNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aListenedProjectionNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aListenedProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aListenedProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aListenedProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRequestedProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aBidirectionalInteraction_ownedReturnsBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRequestedProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRespondedProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aBidirectionalInteraction_ownedReturnsBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRespondedProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aSignaledProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aSignaledProjectionNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aSignaledProjectionNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aSignaledProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aSignaledProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aSignaledProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAttributeProjectionNC.addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);
		aAttributeProjectionNC.addBranchConfigs( theCtxt, aDefinedStructuralFeature_infoTypeBC);
		aAttributeProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAttributeProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aAttributeProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAttributeProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aEnumeratedTypeProjectionNC.addBranchConfigs( theCtxt, aAbstractEnumeratedType_enumeratedValuesBC);
		aEnumeratedTypeProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aEnumeratedTypeProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);

		aPrimitiveJavaClassProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aPrimitiveJavaClassProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);

		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aStructuredJavaClassProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aReferenceProjectionNC.addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);
		aReferenceProjectionNC.addBranchConfigs( theCtxt, aDefinedStructuralFeature_infoTypeBC);
		aReferenceProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aReferenceProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aReferenceProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aReferenceProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aDocumentProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aDocumentProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aDocumentProjectionNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aDocumentProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aDocumentProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aDocumentProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAliasProjectionNC.addBranchConfigs( theCtxt, aDelegation_delegateBC);
		aAliasProjectionNC.addBranchConfigs( theCtxt, aDelegation_delegatorBC);
		aAliasProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAliasProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aAliasProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAliasProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aLinkOwner_ownedLinksBC);
		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAssemblyProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aComponentProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aComponentProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aLinkProjectionNC.addBranchConfigs( theCtxt, aAbstractLink_connectedPortBC);
		aLinkProjectionNC.addBranchConfigs( theCtxt, aAbstractLink_linkBC);
		aLinkProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aLinkProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aLinkProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aLinkProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aPortProjectionNC.addBranchConfigs( theCtxt, aAbstractPort_connectedLinksBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aDelegate_delegateOfBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aDelegator_delegatorOfBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aAbstractPort_linksBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aInteractionOwner_ownedInteractionsBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aPortProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRelayProjectionNC.addBranchConfigs( theCtxt, aDelegation_delegateBC);
		aRelayProjectionNC.addBranchConfigs( theCtxt, aDelegation_delegatorBC);
		aRelayProjectionNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRelayProjectionNC.addBranchConfigs( theCtxt, aProjected_projectionsBC);
		aRelayProjectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRelayProjectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aHideNC.addBranchConfigs( theCtxt, aProjection_originalsBC);
		aHideNC.addBranchConfigs( theCtxt, aProjection_subProjectionsBC);

		aFachadeNC.addBranchConfigs( theCtxt, aProjection_originalsBC);
		aFachadeNC.addBranchConfigs( theCtxt, aProjection_subProjectionsBC);

		aJavaClassHandlerNC.addBranchConfigs( theCtxt, aHandler_handlerOfBehaviorsBC);

		aJavaMethodDispatcherNC.addBranchConfigs( theCtxt, aDispatcher_dispatcherOfBehaviorsBC);

		aSignaledNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aSignaledNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aSignaledNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aSignaledNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aSignaledNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aListenedNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aListenedNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aListenedNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aListenedNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aListenedNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRequestedNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRequestedNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aRequestedNC.addBranchConfigs( theCtxt, aBidirectionalInteraction_ownedReturnsBC);
		aRequestedNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aRequestedNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRequestedNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRespondedNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRespondedNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aRespondedNC.addBranchConfigs( theCtxt, aBidirectionalInteraction_ownedReturnsBC);
		aRespondedNC.addBranchConfigs( theCtxt, aInteraction_ownedStimuliBC);
		aRespondedNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRespondedNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aBehaviorInHandlerNC.addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_dispatcherBC);
		aBehaviorInHandlerNC.addBranchConfigs( theCtxt, aAbstractBehaviorInHandler_handlerBC);
		aBehaviorInHandlerNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aBehaviorInHandlerNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aBehaviorInHandlerNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aStimuliNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);

		aReturnNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);

		aComponentNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aComponentNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aComponentNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aComponentNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aComponentNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aComponentNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aComponentNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aComponentNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aComponentNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aComponentNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aComponentNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAssemblyNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAssemblyNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aAssemblyNC.addBranchConfigs( theCtxt, aLinkOwner_ownedLinksBC);
		aAssemblyNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAssemblyNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aLinkNC.addBranchConfigs( theCtxt, aAbstractLink_connectedPortBC);
		aLinkNC.addBranchConfigs( theCtxt, aAbstractLink_linkBC);
		aLinkNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aLinkNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aLinkNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aRelayNC.addBranchConfigs( theCtxt, aDelegation_delegateBC);
		aRelayNC.addBranchConfigs( theCtxt, aDelegation_delegatorBC);
		aRelayNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aRelayNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aRelayNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAliasNC.addBranchConfigs( theCtxt, aDelegation_delegateBC);
		aAliasNC.addBranchConfigs( theCtxt, aDelegation_delegatorBC);
		aAliasNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAliasNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAliasNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aPortNC.addBranchConfigs( theCtxt, aAbstractPort_connectedLinksBC);
		aPortNC.addBranchConfigs( theCtxt, aDelegate_delegateOfBC);
		aPortNC.addBranchConfigs( theCtxt, aDelegator_delegatorOfBC);
		aPortNC.addBranchConfigs( theCtxt, aAbstractPort_linksBC);
		aPortNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aPortNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aPortNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aPortNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aPortNC.addBranchConfigs( theCtxt, aInteractionOwner_ownedInteractionsBC);
		aPortNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aPortNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aPortNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aPortNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aDependencyNC.addBranchConfigs( theCtxt, aBehaviorOwner_ownedBehaviorsBC);
		aDependencyNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aDependencyNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);


		aExposedStructuralFeatureNC.addBranchConfigs( theCtxt, aExposedStructuralFeature_exposedBC);
		aExposedStructuralFeatureNC.addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);
		aExposedStructuralFeatureNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aExposedStructuralFeatureNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aEnumeratedTypeNC.addBranchConfigs( theCtxt, aAbstractEnumeratedType_enumeratedValuesBC);
		aEnumeratedTypeNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);

		aPrimitiveJavaClassNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);

		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aStructuredJavaClassNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aDocumentNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aDocumentNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aDocumentNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aDocumentNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aDocumentNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aStructuralFeatureTypingNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);

		aStructuredTypeNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aStructuredTypeNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aStructuredTypeNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aProcessTypeNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aProcessTypeNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aBusinessSignalNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aBusinessSignalNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aBusinessSignalNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aBusinessSignalNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aContentNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aContentNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aContentNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aContentNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aCommunityNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aCommunityNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aCommunityNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aCommunityNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aCommunityNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aCommunityNC.addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);
		aCommunityNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aInteractionPortalNC.addBranchConfigs( theCtxt, aAbstractPort_connectedLinksBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aDelegate_delegateOfBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aDelegator_delegatorOfBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aAbstractPort_linksBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aInteractionOwner_ownedInteractionsBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aInteractionPortalNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aAbstractPort_connectedLinksBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aDelegate_delegateOfBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aDelegator_delegatorOfBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aAbstractPort_linksBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aInteractionOwner_ownedInteractionsBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aInteractionInterfaceNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aCompositeProcessNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aCompositeProcessNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aPrimitiveProcessNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aConnectionNC.addBranchConfigs( theCtxt, aAbstractLink_connectedPortBC);
		aConnectionNC.addBranchConfigs( theCtxt, aAbstractLink_linkBC);
		aConnectionNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aConnectionNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aInternalRoleNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aInternalRoleNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aExternalRoleNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aExternalRoleNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aResourceNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aResourceNC.addBranchConfigs( theCtxt, aDelegationOwner_ownedDelegationsBC);
		aResourceNC.addBranchConfigs( theCtxt, aDependencyOwner_ownedDependenciesBC);
		aResourceNC.addBranchConfigs( theCtxt, aDispatcherOwner_ownedDispatchersBC);
		aResourceNC.addBranchConfigs( theCtxt, aHandlerOwner_ownedHandlersBC);
		aResourceNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aResourceNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aResourceNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aResourceNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aResourceNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aStructuralTypeNC.addBranchConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeaturesBC);
		aStructuralTypeNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aStructuralTypeNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aReferenceNC.addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);
		aReferenceNC.addBranchConfigs( theCtxt, aDefinedStructuralFeature_infoTypeBC);
		aReferenceNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aReferenceNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aReferenceNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aAttributeNC.addBranchConfigs( theCtxt, aStructuralFeature_exposedAsBC);
		aAttributeNC.addBranchConfigs( theCtxt, aDefinedStructuralFeature_infoTypeBC);
		aAttributeNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aAttributeNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aAttributeNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aTransformationNC.addBranchConfigs( theCtxt, aComment_attachementsBC);
		aTransformationNC.addBranchConfigs( theCtxt, aAnnotation_sourcesBC);
		aTransformationNC.addBranchConfigs( theCtxt, aTransformation_subTransformationsBC);

		aSynthesisNC.addBranchConfigs( theCtxt, aComment_attachementsBC);
		aSynthesisNC.addBranchConfigs( theCtxt, aAnnotation_sourcesBC);
		aSynthesisNC.addBranchConfigs( theCtxt, aTransformation_subTransformationsBC);

		aVersionNC.addBranchConfigs( theCtxt, aComment_attachementsBC);
		aVersionNC.addBranchConfigs( theCtxt, aAnnotation_sourcesBC);
		aVersionNC.addBranchConfigs( theCtxt, aTransformation_subTransformationsBC);



		aCommentNC.addBranchConfigs( theCtxt, aComment_attachementsBC);


		aAnnotationNC.addBranchConfigs( theCtxt, aComment_attachementsBC);
		aAnnotationNC.addBranchConfigs( theCtxt, aAnnotation_sourcesBC);

		aExclusionNC.addBranchConfigs( theCtxt, aComment_attachementsBC);
		aExclusionNC.addBranchConfigs( theCtxt, aAnnotation_sourcesBC);

		aProjectNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aProjectNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aProjectNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aProjectNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aProjectNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aProjectNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aProjectNC.addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);
		aProjectNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);

		aPackageNC.addBranchConfigs( theCtxt, aProjectable_originalOfProjectionsBC);
		aPackageNC.addBranchConfigs( theCtxt, aAssemblyOwner_ownedAssembliesBC);
		aPackageNC.addBranchConfigs( theCtxt, aComponentOwner_ownedComponentsBC);
		aPackageNC.addBranchConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypesBC);
		aPackageNC.addBranchConfigs( theCtxt, aPortOwner_ownedPortsBC);
		aPackageNC.addBranchConfigs( theCtxt, aSource_sourceOfAnnnotationsBC);
		aPackageNC.addBranchConfigs( theCtxt, aPackageOwner_subPackagesBC);
		aPackageNC.addBranchConfigs( theCtxt, aTarget_transformationsBC);


  }


  protected void initBranchCfgsInitializations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theM3Model)  throws EAIException  {
    if( theCtxt == null) { return;}
  /*******************************************************
   *  Branch configs
   *******************************************************/
		aProjectable_originalOfProjectionsBC.addTypeNodeConfigs( theCtxt, aProjectable_originalOfProjections_FachadeRelTNC);
		aProjectable_originalOfProjectionsBC.addTypeNodeConfigs( theCtxt, aProjectable_originalOfProjections_HideRelTNC);

		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RelayProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_EnumeratedTypeRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_LinkProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_BehaviorInHandlerRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RespondedProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AssemblyProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ListenedRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ProjectProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PortProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ReferenceRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_SignaledProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ComponentProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RespondedRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RequestedRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RequestedProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AliasProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_SignaledRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ReferenceProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_BehaviorInHandlerProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AttributeRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AliasRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PrimitiveJavaClassProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ProjectRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_StructuredJavaClassRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_DocumentProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ListenedProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PortRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_StructuredJavaClassProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_EnumeratedTypeProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_RelayRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PackageRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_DocumentRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AssemblyRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PrimitiveJavaClassRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_LinkRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_AttributeProjectionRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_ComponentRelTNC);
		aProjection_originalsBC.addTypeNodeConfigs( theCtxt, aProjection_originals_PackageProjectionRelTNC);

		aProjection_subProjectionsBC.addTypeNodeConfigs( theCtxt, aProjection_subProjections_FachadeRelTNC);
		aProjection_subProjectionsBC.addTypeNodeConfigs( theCtxt, aProjection_subProjections_HideRelTNC);

		aProjected_projectionsBC.addTypeNodeConfigs( theCtxt, aProjected_projections_FachadeRelTNC);

		aBidirectionalInteraction_ownedReturnsBC.addTypeNodeConfigs( theCtxt, aBidirectionalInteraction_ownedReturns_ReturnRelTNC);

		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_ListenedProjectionRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_ListenedRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_SignaledProjectionRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_SignaledRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_RespondedRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_RespondedProjectionRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_RequestedRelTNC);
		aInteractionOwner_ownedInteractionsBC.addTypeNodeConfigs( theCtxt, aInteractionOwner_ownedInteractions_RequestedProjectionRelTNC);

		aInteraction_ownedStimuliBC.addTypeNodeConfigs( theCtxt, aInteraction_ownedStimuli_StimuliRelTNC);

		aHandlerOwner_ownedHandlersBC.addTypeNodeConfigs( theCtxt, aHandlerOwner_ownedHandlers_JavaClassHandlerRelTNC);

		aHandler_handlerOfBehaviorsBC.addTypeNodeConfigs( theCtxt, aHandler_handlerOfBehaviors_BehaviorInHandlerRelTNC);
		aHandler_handlerOfBehaviorsBC.addTypeNodeConfigs( theCtxt, aHandler_handlerOfBehaviors_BehaviorInHandlerProjectionRelTNC);

		aAbstractBehaviorInHandler_handlerBC.addTypeNodeConfigs( theCtxt, aAbstractBehaviorInHandler_handler_JavaClassHandlerRelTNC);

		aAbstractBehaviorInHandler_dispatcherBC.addTypeNodeConfigs( theCtxt, aAbstractBehaviorInHandler_dispatcher_JavaMethodDispatcherRelTNC);

		aDispatcherOwner_ownedDispatchersBC.addTypeNodeConfigs( theCtxt, aDispatcherOwner_ownedDispatchers_JavaMethodDispatcherRelTNC);

		aDispatcher_dispatcherOfBehaviorsBC.addTypeNodeConfigs( theCtxt, aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerRelTNC);
		aDispatcher_dispatcherOfBehaviorsBC.addTypeNodeConfigs( theCtxt, aDispatcher_dispatcherOfBehaviors_BehaviorInHandlerProjectionRelTNC);

		aBehaviorOwner_ownedBehaviorsBC.addTypeNodeConfigs( theCtxt, aBehaviorOwner_ownedBehaviors_BehaviorInHandlerRelTNC);
		aBehaviorOwner_ownedBehaviorsBC.addTypeNodeConfigs( theCtxt, aBehaviorOwner_ownedBehaviors_BehaviorInHandlerProjectionRelTNC);

		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_PrimitiveProcessRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_CompositeProcessRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_ComponentRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_ProcessTypeRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_InternalRoleRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_ResourceRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_ExternalRoleRelTNC);
		aComponentOwner_ownedComponentsBC.addTypeNodeConfigs( theCtxt, aComponentOwner_ownedComponents_ComponentProjectionRelTNC);

		aAssemblyOwner_ownedAssembliesBC.addTypeNodeConfigs( theCtxt, aAssemblyOwner_ownedAssemblies_AssemblyRelTNC);
		aAssemblyOwner_ownedAssembliesBC.addTypeNodeConfigs( theCtxt, aAssemblyOwner_ownedAssemblies_AssemblyProjectionRelTNC);

		aLinkOwner_ownedLinksBC.addTypeNodeConfigs( theCtxt, aLinkOwner_ownedLinks_LinkProjectionRelTNC);
		aLinkOwner_ownedLinksBC.addTypeNodeConfigs( theCtxt, aLinkOwner_ownedLinks_LinkRelTNC);
		aLinkOwner_ownedLinksBC.addTypeNodeConfigs( theCtxt, aLinkOwner_ownedLinks_ConnectionRelTNC);

		aPortOwner_ownedPortsBC.addTypeNodeConfigs( theCtxt, aPortOwner_ownedPorts_InteractionPortalRelTNC);
		aPortOwner_ownedPortsBC.addTypeNodeConfigs( theCtxt, aPortOwner_ownedPorts_PortProjectionRelTNC);
		aPortOwner_ownedPortsBC.addTypeNodeConfigs( theCtxt, aPortOwner_ownedPorts_InteractionInterfaceRelTNC);
		aPortOwner_ownedPortsBC.addTypeNodeConfigs( theCtxt, aPortOwner_ownedPorts_PortRelTNC);

		aAbstractPort_linksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_links_LinkProjectionRelTNC);
		aAbstractPort_linksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_links_LinkRelTNC);
		aAbstractPort_linksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_links_ConnectionRelTNC);

		aAbstractPort_connectedLinksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_connectedLinks_LinkProjectionRelTNC);
		aAbstractPort_connectedLinksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_connectedLinks_LinkRelTNC);
		aAbstractPort_connectedLinksBC.addTypeNodeConfigs( theCtxt, aAbstractPort_connectedLinks_ConnectionRelTNC);

		aDelegationOwner_ownedDelegationsBC.addTypeNodeConfigs( theCtxt, aDelegationOwner_ownedDelegations_AliasRelTNC);
		aDelegationOwner_ownedDelegationsBC.addTypeNodeConfigs( theCtxt, aDelegationOwner_ownedDelegations_AliasProjectionRelTNC);
		aDelegationOwner_ownedDelegationsBC.addTypeNodeConfigs( theCtxt, aDelegationOwner_ownedDelegations_RelayProjectionRelTNC);
		aDelegationOwner_ownedDelegationsBC.addTypeNodeConfigs( theCtxt, aDelegationOwner_ownedDelegations_RelayRelTNC);

		aDelegator_delegatorOfBC.addTypeNodeConfigs( theCtxt, aDelegator_delegatorOf_AliasRelTNC);
		aDelegator_delegatorOfBC.addTypeNodeConfigs( theCtxt, aDelegator_delegatorOf_AliasProjectionRelTNC);
		aDelegator_delegatorOfBC.addTypeNodeConfigs( theCtxt, aDelegator_delegatorOf_RelayProjectionRelTNC);
		aDelegator_delegatorOfBC.addTypeNodeConfigs( theCtxt, aDelegator_delegatorOf_RelayRelTNC);

		aDelegation_delegatorBC.addTypeNodeConfigs( theCtxt, aDelegation_delegator_InteractionPortalRelTNC);
		aDelegation_delegatorBC.addTypeNodeConfigs( theCtxt, aDelegation_delegator_PortProjectionRelTNC);
		aDelegation_delegatorBC.addTypeNodeConfigs( theCtxt, aDelegation_delegator_InteractionInterfaceRelTNC);
		aDelegation_delegatorBC.addTypeNodeConfigs( theCtxt, aDelegation_delegator_PortRelTNC);

		aDelegation_delegateBC.addTypeNodeConfigs( theCtxt, aDelegation_delegate_InteractionPortalRelTNC);
		aDelegation_delegateBC.addTypeNodeConfigs( theCtxt, aDelegation_delegate_PortProjectionRelTNC);
		aDelegation_delegateBC.addTypeNodeConfigs( theCtxt, aDelegation_delegate_InteractionInterfaceRelTNC);
		aDelegation_delegateBC.addTypeNodeConfigs( theCtxt, aDelegation_delegate_PortRelTNC);

		aDelegate_delegateOfBC.addTypeNodeConfigs( theCtxt, aDelegate_delegateOf_AliasRelTNC);
		aDelegate_delegateOfBC.addTypeNodeConfigs( theCtxt, aDelegate_delegateOf_AliasProjectionRelTNC);
		aDelegate_delegateOfBC.addTypeNodeConfigs( theCtxt, aDelegate_delegateOf_RelayProjectionRelTNC);
		aDelegate_delegateOfBC.addTypeNodeConfigs( theCtxt, aDelegate_delegateOf_RelayRelTNC);

		aAbstractLink_connectedPortBC.addTypeNodeConfigs( theCtxt, aAbstractLink_connectedPort_InteractionPortalRelTNC);
		aAbstractLink_connectedPortBC.addTypeNodeConfigs( theCtxt, aAbstractLink_connectedPort_PortProjectionRelTNC);
		aAbstractLink_connectedPortBC.addTypeNodeConfigs( theCtxt, aAbstractLink_connectedPort_InteractionInterfaceRelTNC);
		aAbstractLink_connectedPortBC.addTypeNodeConfigs( theCtxt, aAbstractLink_connectedPort_PortRelTNC);

		aAbstractLink_linkBC.addTypeNodeConfigs( theCtxt, aAbstractLink_link_LinkProjectionRelTNC);
		aAbstractLink_linkBC.addTypeNodeConfigs( theCtxt, aAbstractLink_link_LinkRelTNC);
		aAbstractLink_linkBC.addTypeNodeConfigs( theCtxt, aAbstractLink_link_ConnectionRelTNC);

		aDependencyOwner_ownedDependenciesBC.addTypeNodeConfigs( theCtxt, aDependencyOwner_ownedDependencies_DependencyRelTNC);

		aAbstractEnumeratedType_enumeratedValuesBC.addTypeNodeConfigs( theCtxt, aAbstractEnumeratedType_enumeratedValues_EnumeratedValueRelTNC);

		aDefinedStructuralFeature_infoTypeBC.addTypeNodeConfigs( theCtxt, aDefinedStructuralFeature_infoType_StructuralFeatureTypingRelTNC);

		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_EnumeratedTypeProjectionRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_StructuredTypeRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_DocumentProjectionRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_BusinessSignalRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_DocumentRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_ContentRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_StructuredJavaClassProjectionRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassRelTNC);
		aInfoTypeOwner_ownedInfoTypesBC.addTypeNodeConfigs( theCtxt, aInfoTypeOwner_ownedInfoTypes_PrimitiveJavaClassProjectionRelTNC);

		aStructuralFeatureOwner_ownedStructuralFeaturesBC.addTypeNodeConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceRelTNC);
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.addTypeNodeConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeatures_ReferenceProjectionRelTNC);
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.addTypeNodeConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeatures_AttributeRelTNC);
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.addTypeNodeConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeatures_AttributeProjectionRelTNC);
		aStructuralFeatureOwner_ownedStructuralFeaturesBC.addTypeNodeConfigs( theCtxt, aStructuralFeatureOwner_ownedStructuralFeatures_ExposedStructuralFeatureRelTNC);

		aStructuralFeature_exposedAsBC.addTypeNodeConfigs( theCtxt, aStructuralFeature_exposedAs_ExposedStructuralFeatureRelTNC);

		aExposedStructuralFeature_exposedBC.addTypeNodeConfigs( theCtxt, aExposedStructuralFeature_exposed_ReferenceRelTNC);
		aExposedStructuralFeature_exposedBC.addTypeNodeConfigs( theCtxt, aExposedStructuralFeature_exposed_ReferenceProjectionRelTNC);
		aExposedStructuralFeature_exposedBC.addTypeNodeConfigs( theCtxt, aExposedStructuralFeature_exposed_AttributeRelTNC);
		aExposedStructuralFeature_exposedBC.addTypeNodeConfigs( theCtxt, aExposedStructuralFeature_exposed_AttributeProjectionRelTNC);
		aExposedStructuralFeature_exposedBC.addTypeNodeConfigs( theCtxt, aExposedStructuralFeature_exposed_ExposedStructuralFeatureRelTNC);

		aTarget_transformationsBC.addTypeNodeConfigs( theCtxt, aTarget_transformations_TransformationRelTNC);
		aTarget_transformationsBC.addTypeNodeConfigs( theCtxt, aTarget_transformations_SynthesisRelTNC);
		aTarget_transformationsBC.addTypeNodeConfigs( theCtxt, aTarget_transformations_VersionRelTNC);

		aTransformation_subTransformationsBC.addTypeNodeConfigs( theCtxt, aTransformation_subTransformations_TransformationRelTNC);
		aTransformation_subTransformationsBC.addTypeNodeConfigs( theCtxt, aTransformation_subTransformations_SynthesisRelTNC);
		aTransformation_subTransformationsBC.addTypeNodeConfigs( theCtxt, aTransformation_subTransformations_VersionRelTNC);

		aComment_attachementsBC.addTypeNodeConfigs( theCtxt, aComment_attachements_AttachmentRelTNC);
		aComment_attachementsBC.addTypeNodeConfigs( theCtxt, aComment_attachements_MediaRelTNC);
		aComment_attachementsBC.addTypeNodeConfigs( theCtxt, aComment_attachements_URLRelTNC);

		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AliasRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AliasProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RelayProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RelayRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AssemblyRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AssemblyProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_InteractionPortalRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_PortProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_InteractionInterfaceRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_PortRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ReferenceRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ReferenceProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AttributeRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_AttributeProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ExposedStructuralFeatureRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_PrimitiveProcessRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_CompositeProcessRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ComponentRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ProcessTypeRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_InternalRoleRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ResourceRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ExternalRoleRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ComponentProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_BehaviorInHandlerRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_BehaviorInHandlerProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ListenedProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ListenedRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_SignaledProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_SignaledRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RespondedRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RespondedProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RequestedRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_RequestedProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_LinkProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_LinkRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ConnectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_PackageProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_PackageRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_CommunityRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ProjectRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ProjectProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_StructuredTypeRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_DocumentProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_BusinessSignalRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_DocumentRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_ContentRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_StructuredJavaClassRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_StructuredJavaClassProjectionRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_StructuralTypeRelTNC);
		aAnnotation_sourcesBC.addTypeNodeConfigs( theCtxt, aAnnotation_sources_DependencyRelTNC);

		aSource_sourceOfAnnnotationsBC.addTypeNodeConfigs( theCtxt, aSource_sourceOfAnnnotations_AnnotationRelTNC);
		aSource_sourceOfAnnnotationsBC.addTypeNodeConfigs( theCtxt, aSource_sourceOfAnnnotations_TransformationRelTNC);
		aSource_sourceOfAnnnotationsBC.addTypeNodeConfigs( theCtxt, aSource_sourceOfAnnnotations_SynthesisRelTNC);
		aSource_sourceOfAnnnotationsBC.addTypeNodeConfigs( theCtxt, aSource_sourceOfAnnnotations_VersionRelTNC);
		aSource_sourceOfAnnnotationsBC.addTypeNodeConfigs( theCtxt, aSource_sourceOfAnnnotations_ExclusionRelTNC);

		aPackageOwner_subPackagesBC.addTypeNodeConfigs( theCtxt, aPackageOwner_subPackages_PackageProjectionRelTNC);
		aPackageOwner_subPackagesBC.addTypeNodeConfigs( theCtxt, aPackageOwner_subPackages_PackageRelTNC);


  }



}


