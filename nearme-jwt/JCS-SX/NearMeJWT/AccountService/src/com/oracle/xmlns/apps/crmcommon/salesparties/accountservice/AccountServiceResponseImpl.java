/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package com.oracle.xmlns.apps.crmcommon.salesparties.accountservice;

import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.HeaderList;
import com.sun.xml.ws.developer.JAXWSProperties;

import javax.annotation.Resource;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.Addressing;

import oracle.cloud.sampleapps.nearmejwt.types.DataObjectResult;
import oracle.cloud.sampleapps.nearmejwt.types.FaultType;
import oracle.cloud.sampleapps.nearmejwt.types.MethodResult;
import oracle.cloud.sampleapps.nearmejwt.types.ObjAttrHints;
import oracle.cloud.sampleapps.nearmejwt.types.ObjectFactory;
import oracle.cloud.sampleapps.nearmejwt.types.ProcessData;
import oracle.cloud.sampleapps.nearmejwt.types.ServiceViewInfo;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/",
  name="AccountServiceResponse")
@XmlSeeAlso(
  { ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT)
@Addressing(enabled=true, required=true)
public class AccountServiceResponseImpl
{
  @Resource
  private WebServiceContext wsContext;

  private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;

  @WebMethod(action="http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0/Fault")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0/Fault")
  @Oneway
  public void onFault(@WebParam(targetNamespace="http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0",
      partName="parameters", name="Fault")
    FaultType parameters)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("parameters: '" + parameters + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/processCSAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/processCSAccountAsyncResponse")
  @RequestWrapper(localName="processCSAccountAsyncResponse",
    targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.ProcessCSAccountAsyncResponse")
  @Oneway
  public void processCSAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    ProcessData result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getEntityListAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getEntityListAsyncResponse")
  @RequestWrapper(localName="getEntityListAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.GetEntityListAsyncResponse")
  @Oneway
  public void getEntityListAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    java.util.List<ServiceViewInfo> result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getDfltObjAttrHintsAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getDfltObjAttrHintsAsyncResponse")
  @RequestWrapper(localName="getDfltObjAttrHintsAsyncResponse",
    targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.GetDfltObjAttrHintsAsyncResponse")
  @Oneway
  public void getDfltObjAttrHintsAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    ObjAttrHints result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getServiceLastUpdateTimeAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getServiceLastUpdateTimeAsyncResponse")
  @RequestWrapper(localName="getServiceLastUpdateTimeAsyncResponse",
    targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.GetServiceLastUpdateTimeAsyncResponse")
  @Oneway
  public void getServiceLastUpdateTimeAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    XMLGregorianCalendar result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/findAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/findAccountAsyncResponse")
  @RequestWrapper(localName="findAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.FindAccountAsyncResponse")
  @Oneway
  public void findAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/updateAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/updateAccountAsyncResponse")
  @RequestWrapper(localName="updateAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.UpdateAccountAsyncResponse")
  @Oneway
  public void updateAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/createAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/createAccountAsyncResponse")
  @RequestWrapper(localName="createAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.CreateAccountAsyncResponse")
  @Oneway
  public void createAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/mergeAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/mergeAccountAsyncResponse")
  @RequestWrapper(localName="mergeAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.MergeAccountAsyncResponse")
  @Oneway
  public void mergeAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/getAccountAsyncResponse")
  @RequestWrapper(localName="getAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.GetAccountAsyncResponse")
  @Oneway
  public void getAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/processAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/processAccountAsyncResponse")
  @RequestWrapper(localName="processAccountAsyncResponse",
    targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.ProcessAccountAsyncResponse")
  @Oneway
  public void processAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    DataObjectResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/deleteAccountAsyncResponse")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/deleteAccountAsyncResponse")
  @RequestWrapper(localName="deleteAccountAsyncResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
    className="oracle.cloud.sampleapps.nearmejwt.types.DeleteAccountAsyncResponse")
  @Oneway
  public void deleteAccountAsyncResponse(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/types/",
      name="result")
    MethodResult result)
  {
    // Use the sample code to extract the relatesTo id for correlation and then add your rest of the logic

    System.out.println("Received the asynchronous reply");

    // get the messageId to correlate this reply with the original request
    HeaderList headerList = (HeaderList)wsContext.getMessageContext().get(JAXWSProperties.INBOUND_HEADER_LIST_PROPERTY);
    Header realtesToheader = headerList.get(WS_ADDR_VER.relatesToTag, true);
    String relatesToMessageId = realtesToheader.getStringContent();
    System.out.println("RelatesTo message id: " + relatesToMessageId);

    System.out.println("result: '" + result + "'");
    // Add your implementation here.
  }
}
