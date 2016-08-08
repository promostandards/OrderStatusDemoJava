/**
 * GetOrderStatusTypesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusTypesRequest  implements java.io.Serializable {
    /* The Standard Version of the Web Service being referenced */
    private org.apache.axis.types.Token wsVersion;

    /* The customerID or any other agreed upon ID. */
    private org.apache.axis.types.Token id;

    /* The password associated with the customerID. */
    private org.apache.axis.types.Token password;

    public GetOrderStatusTypesRequest() {
    }

    public GetOrderStatusTypesRequest(
           org.apache.axis.types.Token wsVersion,
           org.apache.axis.types.Token id,
           org.apache.axis.types.Token password) {
           this.wsVersion = wsVersion;
           this.id = id;
           this.password = password;
    }


    /**
     * Gets the wsVersion value for this GetOrderStatusTypesRequest.
     * 
     * @return wsVersion   * The Standard Version of the Web Service being referenced
     */
    public org.apache.axis.types.Token getWsVersion() {
        return wsVersion;
    }


    /**
     * Sets the wsVersion value for this GetOrderStatusTypesRequest.
     * 
     * @param wsVersion   * The Standard Version of the Web Service being referenced
     */
    public void setWsVersion(org.apache.axis.types.Token wsVersion) {
        this.wsVersion = wsVersion;
    }


    /**
     * Gets the id value for this GetOrderStatusTypesRequest.
     * 
     * @return id   * The customerID or any other agreed upon ID.
     */
    public org.apache.axis.types.Token getId() {
        return id;
    }


    /**
     * Sets the id value for this GetOrderStatusTypesRequest.
     * 
     * @param id   * The customerID or any other agreed upon ID.
     */
    public void setId(org.apache.axis.types.Token id) {
        this.id = id;
    }


    /**
     * Gets the password value for this GetOrderStatusTypesRequest.
     * 
     * @return password   * The password associated with the customerID.
     */
    public org.apache.axis.types.Token getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetOrderStatusTypesRequest.
     * 
     * @param password   * The password associated with the customerID.
     */
    public void setPassword(org.apache.axis.types.Token password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusTypesRequest)) return false;
        GetOrderStatusTypesRequest other = (GetOrderStatusTypesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsVersion==null && other.getWsVersion()==null) || 
             (this.wsVersion!=null &&
              this.wsVersion.equals(other.getWsVersion()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getWsVersion() != null) {
            _hashCode += getWsVersion().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusTypesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">GetOrderStatusTypesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "wsVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
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
