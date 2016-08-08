/**
 * GetOrderStatusDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsResponse  implements java.io.Serializable {
    /* An Array of order status */
    private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus[] orderStatusArray;

    /* Response for any error requiring notification to requestor */
    private java.lang.String errorMessage;

    public GetOrderStatusDetailsResponse() {
    }

    public GetOrderStatusDetailsResponse(
           org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus[] orderStatusArray,
           java.lang.String errorMessage) {
           this.orderStatusArray = orderStatusArray;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the orderStatusArray value for this GetOrderStatusDetailsResponse.
     * 
     * @return orderStatusArray   * An Array of order status
     */
    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus[] getOrderStatusArray() {
        return orderStatusArray;
    }


    /**
     * Sets the orderStatusArray value for this GetOrderStatusDetailsResponse.
     * 
     * @param orderStatusArray   * An Array of order status
     */
    public void setOrderStatusArray(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus[] orderStatusArray) {
        this.orderStatusArray = orderStatusArray;
    }


    /**
     * Gets the errorMessage value for this GetOrderStatusDetailsResponse.
     * 
     * @return errorMessage   * Response for any error requiring notification to requestor
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetOrderStatusDetailsResponse.
     * 
     * @param errorMessage   * Response for any error requiring notification to requestor
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusDetailsResponse)) return false;
        GetOrderStatusDetailsResponse other = (GetOrderStatusDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderStatusArray==null && other.getOrderStatusArray()==null) || 
             (this.orderStatusArray!=null &&
              java.util.Arrays.equals(this.orderStatusArray, other.getOrderStatusArray()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getOrderStatusArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderStatusArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderStatusArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">GetOrderStatusDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatusArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatusArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "OrderStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
