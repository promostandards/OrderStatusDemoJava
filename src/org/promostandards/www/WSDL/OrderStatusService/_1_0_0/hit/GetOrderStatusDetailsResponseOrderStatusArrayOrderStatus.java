/**
 * GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus  implements java.io.Serializable {
    /* The associated Purchase Order Number from the customer */
    private org.apache.axis.types.Token purchaseOrderNumber;

    /* Array of OrderStatusDetail */
    private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail[] orderStatusDetailArray;

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus() {
    }

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus(
           org.apache.axis.types.Token purchaseOrderNumber,
           org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail[] orderStatusDetailArray) {
           this.purchaseOrderNumber = purchaseOrderNumber;
           this.orderStatusDetailArray = orderStatusDetailArray;
    }


    /**
     * Gets the purchaseOrderNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.
     * 
     * @return purchaseOrderNumber   * The associated Purchase Order Number from the customer
     */
    public org.apache.axis.types.Token getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.
     * 
     * @param purchaseOrderNumber   * The associated Purchase Order Number from the customer
     */
    public void setPurchaseOrderNumber(org.apache.axis.types.Token purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the orderStatusDetailArray value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.
     * 
     * @return orderStatusDetailArray   * Array of OrderStatusDetail
     */
    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail[] getOrderStatusDetailArray() {
        return orderStatusDetailArray;
    }


    /**
     * Sets the orderStatusDetailArray value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.
     * 
     * @param orderStatusDetailArray   * Array of OrderStatusDetail
     */
    public void setOrderStatusDetailArray(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail[] orderStatusDetailArray) {
        this.orderStatusDetailArray = orderStatusDetailArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus)) return false;
        GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus other = (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.orderStatusDetailArray==null && other.getOrderStatusDetailArray()==null) || 
             (this.orderStatusDetailArray!=null &&
              java.util.Arrays.equals(this.orderStatusDetailArray, other.getOrderStatusDetailArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getOrderStatusDetailArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderStatusDetailArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderStatusDetailArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "purchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatusDetailArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatusDetailArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatusDetail"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
