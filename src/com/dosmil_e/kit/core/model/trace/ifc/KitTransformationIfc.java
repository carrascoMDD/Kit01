package com.dosmil_e.kit.core.model.trace.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitTransformationIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitTransformation
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitTransformation
 ****************************************************************************/


/****************************************************************************
 *  Implementation of public interface for relationship Target
 ****************************************************************************/


     /* Public Read accessor for role Target
     * May do wild things with the identity of Target
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc getTarget( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Target read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc getTargetAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Target finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc findTargetNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Target finder predicate by name
     */
  public boolean hasTargetNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Target is related predicate
     */
  public boolean hasTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException;

    /* Public Target number access
     */
  public int numTarget( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Target index access
     */
  public int indexOfTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException;


    /* Public Write accessor for role Target
     */
  public void setTarget( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTargetIfc theTarget) throws EAIException;



/****************************************************************************
 *  Implementation of public interface for relationship SuperTransformation
 ****************************************************************************/


     /* Public Read accessor for role SuperTransformation
     * May do wild things with the identity of SuperTransformation
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSuperTransformation( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperTransformation read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSuperTransformationAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SuperTransformation finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findSuperTransformationNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SuperTransformation finder predicate by name
     */
  public boolean hasSuperTransformationNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SuperTransformation is related predicate
     */
  public boolean hasSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException;

    /* Public SuperTransformation number access
     */
  public int numSuperTransformation( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperTransformation index access
     */
  public int indexOfSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException;


    /* Public Write accessor for role SuperTransformation
     */
  public void setSuperTransformation( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSuperTransformation) throws EAIException;





/****************************************************************************
 *  Implementation of public interface for relationship SubTransformations
 ****************************************************************************/


    /* Public Read accessor for role SubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc[] getSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public SubTransformations finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc findSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubTransformations finder predicate by name
     */
  public boolean hasSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public SubTransformations is related predicate
     */
  public boolean hasSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException;


    /* Public SubTransformations read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc getSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubTransformations number access
     */
  public int numSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubTransformations index access
     */
  public int indexOfSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException;


    /* Public Write accessor for role SubTransformations
     * Double change propagation
     */
  public void addSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException;



    /* Public Write accessor for role SubTransformations
     */
  public void removeSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException;



    /* Public ordered Write accessor for role SubTransformations
     */
  public void addSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeSubTransformations) throws EAIException;

    /* Public ordered Write accessor for role SubTransformations
     */
  public void moveSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theRelativeSubTransformations) throws EAIException;

    /* Public move to last Write accessor for role SubTransformations
     */
  public void moveSubTransformationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitTransformationIfc theSubTransformations) throws EAIException;




}
