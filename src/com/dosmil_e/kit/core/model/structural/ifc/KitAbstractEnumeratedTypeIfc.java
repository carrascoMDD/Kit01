package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAbstractEnumeratedTypeIfc
    extends     com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAbstractEnumeratedType
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAbstractEnumeratedType
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship EnumeratedValues
 ****************************************************************************/


    /* Public Read accessor for role EnumeratedValues
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc[] getEnumeratedValues( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public EnumeratedValues finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc findEnumeratedValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public EnumeratedValues finder predicate by name
     */
  public boolean hasEnumeratedValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public EnumeratedValues is related predicate
     */
  public boolean hasEnumeratedValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues) throws EAIException;


    /* Public EnumeratedValues read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc getEnumeratedValuesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public EnumeratedValues number access
     */
  public int numEnumeratedValues( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public EnumeratedValues index access
     */
  public int indexOfEnumeratedValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues) throws EAIException;


    /* Public Write accessor for role EnumeratedValues
     * Double change propagation
     */
  public void addEnumeratedValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues) throws EAIException;



    /* Public Write accessor for role EnumeratedValues
     */
  public void removeEnumeratedValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues) throws EAIException;



    /* Public ordered Write accessor for role EnumeratedValues
     */
  public void addEnumeratedValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theRelativeEnumeratedValues) throws EAIException;

    /* Public ordered Write accessor for role EnumeratedValues
     */
  public void moveEnumeratedValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theRelativeEnumeratedValues) throws EAIException;

    /* Public move to last Write accessor for role EnumeratedValues
     */
  public void moveEnumeratedValuesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc theEnumeratedValues) throws EAIException;




}
