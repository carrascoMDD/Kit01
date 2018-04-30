package com.dosmil_e.kit.core.model.define.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractPortIfc
    extends     com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc,
    com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerOwnerIfc,
    com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc,
    com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc,
    com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractPort
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractPort
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for MANY relationship Links
 ****************************************************************************/


    /* Public Read accessor for role Links
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getLinks( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Links finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Links finder predicate by name
     */
  public boolean hasLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Links is related predicate
     */
  public boolean hasLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException;

    /* Public Links read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Links number access
     */
  public int numLinks( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Links index access
     */
  public int indexOfLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theLinks) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship PortOwner
 ****************************************************************************/


     /* Public Read accessor for role PortOwner
     * May do wild things with the identity of PortOwner
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc getPortOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PortOwner read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc getPortOwnerAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public PortOwner finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc findPortOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PortOwner finder predicate by name
     */
  public boolean hasPortOwnerNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public PortOwner is related predicate
     */
  public boolean hasPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException;

    /* Public PortOwner number access
     */
  public int numPortOwner( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public PortOwner index access
     */
  public int indexOfPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException;


    /* Public Write accessor for role PortOwner
     */
  public void setPortOwner( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc thePortOwner) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship ConnectedLinks
 ****************************************************************************/


    /* Public Read accessor for role ConnectedLinks
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getConnectedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public ConnectedLinks finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc findConnectedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ConnectedLinks finder predicate by name
     */
  public boolean hasConnectedLinksNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public ConnectedLinks is related predicate
     */
  public boolean hasConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException;


    /* Public ConnectedLinks read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getConnectedLinksAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ConnectedLinks number access
     */
  public int numConnectedLinks( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ConnectedLinks index access
     */
  public int indexOfConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException;


    /* Public Write accessor for role ConnectedLinks
     * Double change propagation
     */
  public void addConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException;



    /* Public Write accessor for role ConnectedLinks
     */
  public void removeConnectedLinks( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException;



    /* Public ordered Write accessor for role ConnectedLinks
     */
  public void addConnectedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeConnectedLinks) throws EAIException;

    /* Public ordered Write accessor for role ConnectedLinks
     */
  public void moveConnectedLinksBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theRelativeConnectedLinks) throws EAIException;

    /* Public move to last Write accessor for role ConnectedLinks
     */
  public void moveConnectedLinksToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc theConnectedLinks) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship DelegateOf
 ****************************************************************************/


    /* Public Read accessor for role DelegateOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DelegateOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegateOf finder predicate by name
     */
  public boolean hasDelegateOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegateOf is related predicate
     */
  public boolean hasDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;


    /* Public DelegateOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegateOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DelegateOf number access
     */
  public int numDelegateOf( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegateOf index access
     */
  public int indexOfDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;


    /* Public Write accessor for role DelegateOf
     * Double change propagation
     */
  public void addDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;



    /* Public Write accessor for role DelegateOf
     */
  public void removeDelegateOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;



    /* Public ordered Write accessor for role DelegateOf
     */
  public void addDelegateOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException;

    /* Public ordered Write accessor for role DelegateOf
     */
  public void moveDelegateOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegateOf) throws EAIException;

    /* Public move to last Write accessor for role DelegateOf
     */
  public void moveDelegateOfToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegateOf) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship DelegatorOf
 ****************************************************************************/


    /* Public Read accessor for role DelegatorOf
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public DelegatorOf finder by name
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc findDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegatorOf finder predicate by name
     */
  public boolean hasDelegatorOfNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DelegatorOf is related predicate
     */
  public boolean hasDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;


    /* Public DelegatorOf read accessor by index
     */
  public com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc getDelegatorOfAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DelegatorOf number access
     */
  public int numDelegatorOf( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DelegatorOf index access
     */
  public int indexOfDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;


    /* Public Write accessor for role DelegatorOf
     * Double change propagation
     */
  public void addDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;



    /* Public Write accessor for role DelegatorOf
     */
  public void removeDelegatorOf( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;



    /* Public ordered Write accessor for role DelegatorOf
     */
  public void addDelegatorOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException;

    /* Public ordered Write accessor for role DelegatorOf
     */
  public void moveDelegatorOfBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theRelativeDelegatorOf) throws EAIException;

    /* Public move to last Write accessor for role DelegatorOf
     */
  public void moveDelegatorOfToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc theDelegatorOf) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedDispatchers
 ****************************************************************************/


    /* Public Read accessor for role OwnedDispatchers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc[] getOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedDispatchers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc findOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDispatchers finder predicate by name
     */
  public boolean hasOwnedDispatchersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedDispatchers is related predicate
     */
  public boolean hasOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;


    /* Public OwnedDispatchers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc getOwnedDispatchersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedDispatchers number access
     */
  public int numOwnedDispatchers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedDispatchers index access
     */
  public int indexOfOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;


    /* Public Write accessor for role OwnedDispatchers
     * Double change propagation
     */
  public void addOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;



    /* Public Write accessor for role OwnedDispatchers
     */
  public void removeOwnedDispatchers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;



    /* Public ordered Write accessor for role OwnedDispatchers
     */
  public void addOwnedDispatchersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException;

    /* Public ordered Write accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theRelativeOwnedDispatchers) throws EAIException;

    /* Public move to last Write accessor for role OwnedDispatchers
     */
  public void moveOwnedDispatchersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc theOwnedDispatchers) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedHandlers
 ****************************************************************************/


    /* Public Read accessor for role OwnedHandlers
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc[] getOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedHandlers finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc findOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers finder predicate by name
     */
  public boolean hasOwnedHandlersNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedHandlers is related predicate
     */
  public boolean hasOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public OwnedHandlers read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc getOwnedHandlersAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedHandlers number access
     */
  public int numOwnedHandlers( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedHandlers index access
     */
  public int indexOfOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;


    /* Public Write accessor for role OwnedHandlers
     * Double change propagation
     */
  public void addOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public Write accessor for role OwnedHandlers
     */
  public void removeOwnedHandlers( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;



    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void addOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public ordered Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theRelativeOwnedHandlers) throws EAIException;

    /* Public move to last Write accessor for role OwnedHandlers
     */
  public void moveOwnedHandlersToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc theOwnedHandlers) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedInfoTypes
 ****************************************************************************/


    /* Public Read accessor for role OwnedInfoTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] getOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedInfoTypes finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc findOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInfoTypes finder predicate by name
     */
  public boolean hasOwnedInfoTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInfoTypes is related predicate
     */
  public boolean hasOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;


    /* Public OwnedInfoTypes read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc getOwnedInfoTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedInfoTypes number access
     */
  public int numOwnedInfoTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedInfoTypes index access
     */
  public int indexOfOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;


    /* Public Write accessor for role OwnedInfoTypes
     * Double change propagation
     */
  public void addOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;



    /* Public Write accessor for role OwnedInfoTypes
     */
  public void removeOwnedInfoTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;



    /* Public ordered Write accessor for role OwnedInfoTypes
     */
  public void addOwnedInfoTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException;

    /* Public ordered Write accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theRelativeOwnedInfoTypes) throws EAIException;

    /* Public move to last Write accessor for role OwnedInfoTypes
     */
  public void moveOwnedInfoTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc theOwnedInfoTypes) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedInteractions
 ****************************************************************************/


    /* Public Read accessor for role OwnedInteractions
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] getOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedInteractions finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc findOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInteractions finder predicate by name
     */
  public boolean hasOwnedInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedInteractions is related predicate
     */
  public boolean hasOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;


    /* Public OwnedInteractions read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc getOwnedInteractionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedInteractions number access
     */
  public int numOwnedInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedInteractions index access
     */
  public int indexOfOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;


    /* Public Write accessor for role OwnedInteractions
     * Double change propagation
     */
  public void addOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;



    /* Public Write accessor for role OwnedInteractions
     */
  public void removeOwnedInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;



    /* Public ordered Write accessor for role OwnedInteractions
     */
  public void addOwnedInteractionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException;

    /* Public ordered Write accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theRelativeOwnedInteractions) throws EAIException;

    /* Public move to last Write accessor for role OwnedInteractions
     */
  public void moveOwnedInteractionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theOwnedInteractions) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship OwnedStructuralFeatures
 ****************************************************************************/


    /* Public Read accessor for role OwnedStructuralFeatures
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] getOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public OwnedStructuralFeatures finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc findOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStructuralFeatures finder predicate by name
     */
  public boolean hasOwnedStructuralFeaturesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public OwnedStructuralFeatures is related predicate
     */
  public boolean hasOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;


    /* Public OwnedStructuralFeatures read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getOwnedStructuralFeaturesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OwnedStructuralFeatures number access
     */
  public int numOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OwnedStructuralFeatures index access
     */
  public int indexOfOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;


    /* Public Write accessor for role OwnedStructuralFeatures
     * Double change propagation
     */
  public void addOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;



    /* Public Write accessor for role OwnedStructuralFeatures
     */
  public void removeOwnedStructuralFeatures( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;



    /* Public ordered Write accessor for role OwnedStructuralFeatures
     */
  public void addOwnedStructuralFeaturesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException;

    /* Public ordered Write accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theRelativeOwnedStructuralFeatures) throws EAIException;

    /* Public move to last Write accessor for role OwnedStructuralFeatures
     */
  public void moveOwnedStructuralFeaturesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theOwnedStructuralFeatures) throws EAIException;




/****************************************************************************
 *  Implementation of public interface for relationship SourceOfAnnnotations
 ****************************************************************************/


    /* Public Read accessor for role SourceOfAnnnotations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] getSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SourceOfAnnnotations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc findSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations finder predicate by name
     */
  public boolean hasSourceOfAnnnotationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SourceOfAnnnotations is related predicate
     */
  public boolean hasSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;

    /* Public SourceOfAnnnotations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc getSourceOfAnnnotationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SourceOfAnnnotations number access
     */
  public int numSourceOfAnnnotations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SourceOfAnnnotations index access
     */
  public int indexOfSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;


    /* Public Write accessor for role SourceOfAnnnotations
     * Double change propagation
     */
  public void addSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public Write accessor for role SourceOfAnnnotations
     */
  public void removeSourceOfAnnnotations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;



    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void addSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public ordered Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theRelativeSourceOfAnnnotations) throws EAIException;

    /* Public move to last Write accessor for role SourceOfAnnnotations
     */
  public void moveSourceOfAnnnotationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc theSourceOfAnnnotations) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship Transformations
 ****************************************************************************/


    /* Public Read accessor for role Transformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] getTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Transformations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Transformations finder predicate by name
     */
  public boolean hasTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Transformations is related predicate
     */
  public boolean hasTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;


    /* Public Transformations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Transformations number access
     */
  public int numTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Transformations index access
     */
  public int indexOfTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;


    /* Public Write accessor for role Transformations
     * Double change propagation
     */
  public void addTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;



    /* Public Write accessor for role Transformations
     */
  public void removeTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;



    /* Public ordered Write accessor for role Transformations
     */
  public void addTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException;

    /* Public ordered Write accessor for role Transformations
     */
  public void moveTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeTransformations) throws EAIException;

    /* Public move to last Write accessor for role Transformations
     */
  public void moveTransformationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theTransformations) throws EAIException;




}
