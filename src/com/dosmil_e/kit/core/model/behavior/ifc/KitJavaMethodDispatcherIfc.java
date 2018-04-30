package com.dosmil_e.kit.core.model.behavior.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface KitJavaMethodDispatcherIfc
    extends     com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of KitJavaMethodDispatcher
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute MethodName
 ****************************************************************************/


    /* Public Read accessor for attribute MethodName
     */
  public java.lang.String getMethodName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute MethodName
     */
  public void setMethodName( EAIMMCtxtIfc theCtxt, java.lang.String theMethodName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ArgumentClassNames
 ****************************************************************************/


    /* Public Read accessor for attribute ArgumentClassNames
     */
  public String[] getArgumentClassNames( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ArgumentClassNames
     */
  public void setArgumentClassNames( EAIMMCtxtIfc theCtxt, String[] theArgumentClassNames) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ResultClassName
 ****************************************************************************/


    /* Public Read accessor for attribute ResultClassName
     */
  public String[] getResultClassName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ResultClassName
     */
  public void setResultClassName( EAIMMCtxtIfc theCtxt, String[] theResultClassName) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute ArgumentValueExpressions
 ****************************************************************************/


    /* Public Read accessor for attribute ArgumentValueExpressions
     */
  public String[] getArgumentValueExpressions( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute ArgumentValueExpressions
     */
  public void setArgumentValueExpressions( EAIMMCtxtIfc theCtxt, String[] theArgumentValueExpressions) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of KitJavaMethodDispatcher
 ****************************************************************************/




}
