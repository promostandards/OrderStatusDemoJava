/**
 * GetOrderStatusTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusTypesResponse  implements java.io.Serializable {
    /* An Array of order statuses */
    private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesResponseStatusArrayStatus[] statusArray;

    /* Response for any error requiring notification to requestor */
    private java.lang.String errorMessage;

    public GetOrderStatusTypesResponse() {
    }

    public GetOrderStatusTypesResponse(
           org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesResponseStatusArrayStatus[] statusArray,
           java.lang.String errorMessage) {
           this.statusArray = statusArray;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the statusArray value for this GetOrderStatusTypesResponse.
     * 
     * @return statusArray   * An Array of order statuses
     */
    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesResponseStatusArrayStatus[] getStatusArray() {
        return statusArray;
    }


    /**
     * Sets the statusArray value for this GetOrderStatusTypesResponse.
     * 
     * @param statusArray   * An Array of order statuses
     */
    public void setStatusArray(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusTypesResponseStatusArrayStatus[] statusArray) {
        this.statusArray = statusArray;
    }


    /**
     * Gets the errorMessage value for this GetOrderStatusTypesResponse.
     * 
     * @return errorMessage   * Response for any error requiring notification to requestor
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetOrderStatusTypesResponse.
     * 
     * @param errorMessage   * Response for any error requiring notification to requestor
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusTypesResponse)) return false;
        GetOrderStatusTypesResponse other = (GetOrderStatusTypesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusArray==null && other.getStatusArray()==null) || 
             (this.statusArray!=null &&
              java.util.Arrays.equals(this.statusArray, other.getStatusArray()))) &&
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
        if (getStatusArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusArray(), i);
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
        new org.apache.axis.description.TypeDesc(GetOrderStatusTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">GetOrderStatusTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "StatusArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>GetOrderStatusTypesResponse>StatusArray>Status"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "Status"));
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
