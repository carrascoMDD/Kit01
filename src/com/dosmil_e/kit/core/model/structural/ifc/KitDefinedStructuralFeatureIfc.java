package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitDefinedStructuralFeatureIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitDefinedStructuralFeature
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute MinMultiplicity
 ****************************************************************************/


    /* Public Read accessor for attribute MinMultiplicity
     */
  public int getMinMultiplicity( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MinMultiplicity
     */
  public void setMinMultiplicity( EAIMMCtxtIfc theCtxt, int theMinMultiplicity) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute MaxMultiplicity
 ****************************************************************************/


    /* Public Read accessor for attribute MaxMultiplicity
     */
  public int getMaxMultiplicity( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MaxMultiplicity
     */
  public void setMaxMultiplicity( EAIMMCtxtIfc theCtxt, int theMaxMultiplicity) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ValueExpression
 ****************************************************************************/


    /* Public Read accessor for attribute ValueExpression
     */
  public java.lang.String getValueExpression( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ValueExpression
     */
  public void setValueExpression( EAIMMCtxtIfc theCtxt, java.lang.String theValueExpression) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of KitDefinedStructuralFeature
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship InfoType
 ****************************************************************************/


    /* Public Read accessor for role InfoType
     * May do wild things with the identity of InfoType
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc getInfoType( EAIMMCtxtIfc theCtxt) throws EAIException;



    /* Public InfoType read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc getInfoTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InfoType finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc findInfoTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InfoType finder predicate by name
     */
  public boolean hasInfoTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public InfoType is related predicate
     */
  public boolean hasInfoType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc theInfoType) throws EAIException;

    /* Public InfoType number access
     */
  public int numInfoType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InfoType index access
     */
  public int indexOfInfoType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc theInfoType) throws EAIException;


    /* Public Write accessor for role InfoType
     */
  public void setInfoType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc theInfoType) throws EAIException;





}
