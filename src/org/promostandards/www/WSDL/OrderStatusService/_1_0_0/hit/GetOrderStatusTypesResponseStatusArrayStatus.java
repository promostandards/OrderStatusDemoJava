/**
 * GetOrderStatusTypesResponseStatusArrayStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusTypesResponseStatusArrayStatus  implements java.io.Serializable {
    /* The numerical value of the order status */
    private int id;

    /* The string status name from possible values */
    private org.apache.axis.types.Token name;

    public GetOrderStatusTypesResponseStatusArrayStatus() {
    }

    public GetOrderStatusTypesResponseStatusArrayStatus(
           int id,
           org.apache.axis.types.Token name) {
           this.id = id;
           this.name = name;
    }


    /**
     * Gets the id value for this GetOrderStatusTypesResponseStatusArrayStatus.
     * 
     * @return id   * The numerical value of the order status
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GetOrderStatusTypesResponseStatusArrayStatus.
     * 
     * @param id   * The numerical value of the order status
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this GetOrderStatusTypesResponseStatusArrayStatus.
     * 
     * @return name   * The string status name from possible values
     */
    public org.apache.axis.types.Token getName() {
        return name;
    }


    /**
     * Sets the name value for this GetOrderStatusTypesResponseStatusArrayStatus.
     * 
     * @param name   * The string status name from possible values
     */
    public void setName(org.apache.axis.types.Token name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusTypesResponseStatusArrayStatus)) return false;
        GetOrderStatusTypesResponseStatusArrayStatus other = (GetOrderStatusTypesResponseStatusArrayStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusTypesResponseStatusArrayStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>GetOrderStatusTypesResponse>StatusArray>Status"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
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
