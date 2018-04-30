package com.dosmil_e.kit.core.model.structural.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitEnumeratedValueIfc
    extends     com.dosmil_e.kit.core.model.common.ifc.KitCommonIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitEnumeratedValue
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitEnumeratedValue
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Type
 ****************************************************************************/


     /* Public Read accessor for role Type
     * May do wild things with the identity of Type
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc getType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Type read accessor by index
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc getTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Type finder by name
     */
  public com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc findTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Type finder predicate by name
     */
  public boolean hasTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Type is related predicate
     */
  public boolean hasType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc theType) throws EAIException;

    /* Public Type number access
     */
  public int numType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Type index access
     */
  public int indexOfType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc theType) throws EAIException;


    /* Public Write accessor for role Type
     */
  public void setType( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc theType) throws EAIException;





}
