package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitStructuralFeatureTypingIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitStructuralFeatureTyping
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitStructuralFeatureTyping
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship DefinedStructuralFeature
 ****************************************************************************/


    /* Public Read accessor for role DefinedStructuralFeature
     * May do wild things with the identity of DefinedStructuralFeature
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc getDefinedStructuralFeature( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public DefinedStructuralFeature read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc getDefinedStructuralFeatureAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public DefinedStructuralFeature finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc findDefinedStructuralFeatureNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DefinedStructuralFeature finder predicate by name
     */
  public boolean hasDefinedStructuralFeatureNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public DefinedStructuralFeature is related predicate
     */
  public boolean hasDefinedStructuralFeature( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc theDefinedStructuralFeature) throws EAIException;

    /* Public DefinedStructuralFeature number access
     */
  public int numDefinedStructuralFeature( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public DefinedStructuralFeature index access
     */
  public int indexOfDefinedStructuralFeature( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc theDefinedStructuralFeature) throws EAIException;


    /* Public Write accessor for role DefinedStructuralFeature
     */
  public void setDefinedStructuralFeature( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc theDefinedStructuralFeature) throws EAIException;





}
