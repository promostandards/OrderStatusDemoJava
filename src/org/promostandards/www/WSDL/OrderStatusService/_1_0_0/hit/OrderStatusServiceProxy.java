package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class OrderStatusServiceProxy implements org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType {
  private String _endpoint = null;
  private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType orderStatusService_PortType = null;
  
  public OrderStatusServiceProxy() {
    _initOrderStatusServiceProxy();
  }
  
  public OrderStatusServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrderStatusServiceProxy();
  }
  
  private void _initOrderStatusServiceProxy() {
    try {
      orderStatusService_PortType = (new org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_ServiceLocator()).getOrderStatusServiceBinding();
      if (orderStatusService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)orderStatusService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)orderStatusService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (orderStatusService_PortType != null)
      ((javax.xml.rpc.Stub)orderStatusService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType getOrderStatusService_PortType() {
    if (orderStatusService_PortType == null)
      _initOrderStatusServiceProxy();
    return orderStatusService_PortType;
  }
  
  public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponse getOrderStatusDetails(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsRequest getOrderStatusDetailsRequest) throws java.rmi.RemoteException{
    if (orderStatusService_PortType == null)
      _initOrderStatusServiceProxy();
    return orderStatusService_PortType.getOrderStatusDetails(getOrderStatusDetailsRequest);
  }
  
  public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesResponse getOrderStatusTypes(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesRequest getOrderStatusTypesRequest) throws java.rmi.RemoteException{
    if (orderStatusService_PortType == null)
      _initOrderStatusServiceProxy();
    return orderStatusService_PortType.getOrderStatusTypes(getOrderStatusTypesRequest);
  }
  
  
}