package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitExposedStructuralFeatureIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitExposedStructuralFeature
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitExposedStructuralFeature
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Exposed
 ****************************************************************************/


     /* Public Read accessor for role Exposed
     * May do wild things with the identity of Exposed
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getExposed( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Exposed read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getExposedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Exposed finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc findExposedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Exposed finder predicate by name
     */
  public boolean hasExposedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Exposed is related predicate
     */
  public boolean hasExposed( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theExposed) throws EAIException;

    /* Public Exposed number access
     */
  public int numExposed( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Exposed index access
     */
  public int indexOfExposed( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theExposed) throws EAIException;


    /* Public Write accessor for role Exposed
     */
  public void setExposed( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc theExposed) throws EAIException;





}
