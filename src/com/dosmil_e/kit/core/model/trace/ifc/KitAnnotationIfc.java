package com.dosmil_e.kit.core.model.trace.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitAnnotationIfc
    extends     com.dosmil_e.kit.core.model.trace.ifc.KitCommentIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitAnnotation
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of KitAnnotation
 ****************************************************************************/




/****************************************************************************
 *  Implementation of public interface for relationship Sources
 ****************************************************************************/


    /* Public Read accessor for role Sources
     * Returns a copy of the collection, to avoid external changes to the relationship
     * Is not used by the relationship maintenance machinery
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc[] getSources( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Public Sources finder by name
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc findSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Sources finder predicate by name
     */
  public boolean hasSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;



    /* Public Sources is related predicate
     */
  public boolean hasSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources) throws EAIException;

    /* Public Sources read accessor by index
     */
  public com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc getSourcesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Sources number access
     */
  public int numSources( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Sources index access
     */
  public int indexOfSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources) throws EAIException;


    /* Public Write accessor for role Sources
     * Double change propagation
     */
  public void addSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources) throws EAIException;



    /* Public Write accessor for role Sources
     */
  public void removeSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources) throws EAIException;



    /* Public ordered Write accessor for role Sources
     */
  public void addSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theRelativeSources) throws EAIException;

    /* Public ordered Write accessor for role Sources
     */
  public void moveSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theRelativeSources) throws EAIException;

    /* Public move to last Write accessor for role Sources
     */
  public void moveSourcesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc theSources) throws EAIException;





}
