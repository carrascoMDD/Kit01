package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitStimuliIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitStimuli
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitStimuli
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship StimuliOfInteractions
 ****************************************************************************/


     /* Public Read accessor for role StimuliOfInteractions
     * May do wild things with the identity of StimuliOfInteractions
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc getStimuliOfInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public StimuliOfInteractions read accessor by index
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc getStimuliOfInteractionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public StimuliOfInteractions finder by name
     */
  public com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc findStimuliOfInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public StimuliOfInteractions finder predicate by name
     */
  public boolean hasStimuliOfInteractionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public StimuliOfInteractions is related predicate
     */
  public boolean hasStimuliOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theStimuliOfInteractions) throws EAIException;

    /* Public StimuliOfInteractions number access
     */
  public int numStimuliOfInteractions( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public StimuliOfInteractions index access
     */
  public int indexOfStimuliOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theStimuliOfInteractions) throws EAIException;


    /* Public Write accessor for role StimuliOfInteractions
     */
  public void setStimuliOfInteractions( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc theStimuliOfInteractions) throws EAIException;





}
