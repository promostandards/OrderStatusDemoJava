/**
 * OrderStatusService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class OrderStatusService_ServiceLocator extends org.apache.axis.client.Service implements org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_Service {

    public OrderStatusService_ServiceLocator() {
    }


    public OrderStatusService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderStatusService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderStatusServiceBinding
    private java.lang.String OrderStatusServiceBinding_address = "https://ppds.hitpromo.net/orderStatus?ws=1";

    public java.lang.String getOrderStatusServiceBindingAddress() {
        return OrderStatusServiceBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderStatusServiceBindingWSDDServiceName = "OrderStatusServiceBinding";

    public java.lang.String getOrderStatusServiceBindingWSDDServiceName() {
        return OrderStatusServiceBindingWSDDServiceName;
    }

    public void setOrderStatusServiceBindingWSDDServiceName(java.lang.String name) {
        OrderStatusServiceBindingWSDDServiceName = name;
    }

    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType getOrderStatusServiceBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderStatusServiceBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderStatusServiceBinding(endpoint);
    }

    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType getOrderStatusServiceBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusServiceBindingStub _stub = new org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusServiceBindingStub(portAddress, this);
            _stub.setPortName(getOrderStatusServiceBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderStatusServiceBindingEndpointAddress(java.lang.String address) {
        OrderStatusServiceBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusServiceBindingStub _stub = new org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.OrderStatusServiceBindingStub(new java.net.URL(OrderStatusServiceBinding_address), this);
                _stub.setPortName(getOrderStatusServiceBindingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OrderStatusServiceBinding".equals(inputPortName)) {
            return getOrderStatusServiceBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatusService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatusServiceBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderStatusServiceBinding".equals(portName)) {
            setOrderStatusServiceBindingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
