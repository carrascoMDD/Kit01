package com.dosmil_e.kit.support;

import com.dosmil_e.modelbase.support.EAIMMFactory;
import com.dosmil_e.modelbase.support.EAIMMFactoryIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.modelbase.flattrx.EAIFlatTransactionMgrIfc;
import com.dosmil_e.modelbase.flattrx.EAIFlatTransactionMgr;

public class KitMMFactoryStandAlone extends EAIMMFactory {


  public KitMMFactoryStandAlone() {
    super();
  }

  public KitMMFactoryStandAlone( EAIMMFactoryIfc theOverridenFactory) {
    super(theOverridenFactory);
  }


  protected void initName() {
    vName = new String("Kit");
  }

  public String getClassNamePrefixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Kit";
  }



  public String getLastPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "impl";
  }

  public String getStartPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.kit";
  }

  public String getClassNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Impl";
  }


  public String getFullyQualifiedIfcPackageNameForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "com.dosmil_e.kit.components.ifc";
  }

  public String getIfcNamePostfixForType( EAIMMCtxtIfc theCtxt, String theTypeName) {
    return "Ifc";
  }


  public String getFileFilterTermination( EAIMMCtxtIfc theCtxt) {
    return ".kit";
  }

  public String getFileFilterDescription( EAIMMCtxtIfc theCtxt) {
    return "Kit Studio files (*" + getFileFilterTermination( theCtxt) + ")";
  }


  public String getRootTypeName( EAIMMCtxtIfc theCtxt) {
    return "Project";
  }

  public String getRootTypePackageNames( EAIMMCtxtIfc theCtxt) {
    return "core.model.organize";
  }

}
