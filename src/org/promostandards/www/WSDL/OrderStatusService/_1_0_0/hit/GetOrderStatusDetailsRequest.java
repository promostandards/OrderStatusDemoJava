/**
 * GetOrderStatusDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsRequest  implements java.io.Serializable {
    /* The Standard Version of the Web Service being referenced */
    private org.apache.axis.types.Token wsVersion;

    /* The customerID or any other agreed upon ID. */
    private org.apache.axis.types.Token id;

    /* The password associated with the customerID. */
    private org.apache.axis.types.Token password;

    /* The type of query you wish to perform. 1 = PO Number, 2 = Sales
     * Order Number, 3 = Last update, 4 = All Open */
    private int queryType;

    /* The purchase order number associated with the Order. If you
     * pass in a purchaseOrderNumber then you will expect to a response of
     * an array with a SINGLE order status for that purchase order.  If this
     * field is left blank it will assume that you are requesting multiple
     * order statuses. */
    private org.apache.axis.types.Token referenceNumber;

    /* Beginning date time since last status change. This field will
     * indicate the change date time for any status change GREATER the date
     * time stamp provided. */
    private java.util.Calendar statusTimeStamp;

    public GetOrderStatusDetailsRequest() {
    }

    public GetOrderStatusDetailsRequest(
           org.apache.axis.types.Token wsVersion,
           org.apache.axis.types.Token id,
           org.apache.axis.types.Token password,
           int queryType,
           org.apache.axis.types.Token referenceNumber,
           java.util.Calendar statusTimeStamp) {
           this.wsVersion = wsVersion;
           this.id = id;
           this.password = password;
           this.queryType = queryType;
           this.referenceNumber = referenceNumber;
           this.statusTimeStamp = statusTimeStamp;
    }


    /**
     * Gets the wsVersion value for this GetOrderStatusDetailsRequest.
     * 
     * @return wsVersion   * The Standard Version of the Web Service being referenced
     */
    public org.apache.axis.types.Token getWsVersion() {
        return wsVersion;
    }


    /**
     * Sets the wsVersion value for this GetOrderStatusDetailsRequest.
     * 
     * @param wsVersion   * The Standard Version of the Web Service being referenced
     */
    public void setWsVersion(org.apache.axis.types.Token wsVersion) {
        this.wsVersion = wsVersion;
    }


    /**
     * Gets the id value for this GetOrderStatusDetailsRequest.
     * 
     * @return id   * The customerID or any other agreed upon ID.
     */
    public org.apache.axis.types.Token getId() {
        return id;
    }


    /**
     * Sets the id value for this GetOrderStatusDetailsRequest.
     * 
     * @param id   * The customerID or any other agreed upon ID.
     */
    public void setId(org.apache.axis.types.Token id) {
        this.id = id;
    }


    /**
     * Gets the password value for this GetOrderStatusDetailsRequest.
     * 
     * @return password   * The password associated with the customerID.
     */
    public org.apache.axis.types.Token getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetOrderStatusDetailsRequest.
     * 
     * @param password   * The password associated with the customerID.
     */
    public void setPassword(org.apache.axis.types.Token password) {
        this.password = password;
    }


    /**
     * Gets the queryType value for this GetOrderStatusDetailsRequest.
     * 
     * @return queryType   * The type of query you wish to perform. 1 = PO Number, 2 = Sales
     * Order Number, 3 = Last update, 4 = All Open
     */
    public int getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this GetOrderStatusDetailsRequest.
     * 
     * @param queryType   * The type of query you wish to perform. 1 = PO Number, 2 = Sales
     * Order Number, 3 = Last update, 4 = All Open
     */
    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the referenceNumber value for this GetOrderStatusDetailsRequest.
     * 
     * @return referenceNumber   * The purchase order number associated with the Order. If you
     * pass in a purchaseOrderNumber then you will expect to a response of
     * an array with a SINGLE order status for that purchase order.  If this
     * field is left blank it will assume that you are requesting multiple
     * order statuses.
     */
    public org.apache.axis.types.Token getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this GetOrderStatusDetailsRequest.
     * 
     * @param referenceNumber   * The purchase order number associated with the Order. If you
     * pass in a purchaseOrderNumber then you will expect to a response of
     * an array with a SINGLE order status for that purchase order.  If this
     * field is left blank it will assume that you are requesting multiple
     * order statuses.
     */
    public void setReferenceNumber(org.apache.axis.types.Token referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the statusTimeStamp value for this GetOrderStatusDetailsRequest.
     * 
     * @return statusTimeStamp   * Beginning date time since last status change. This field will
     * indicate the change date time for any status change GREATER the date
     * time stamp provided.
     */
    public java.util.Calendar getStatusTimeStamp() {
        return statusTimeStamp;
    }


    /**
     * Sets the statusTimeStamp value for this GetOrderStatusDetailsRequest.
     * 
     * @param statusTimeStamp   * Beginning date time since last status change. This field will
     * indicate the change date time for any status change GREATER the date
     * time stamp provided.
     */
    public void setStatusTimeStamp(java.util.Calendar statusTimeStamp) {
        this.statusTimeStamp = statusTimeStamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusDetailsRequest)) return false;
        GetOrderStatusDetailsRequest other = (GetOrderStatusDetailsRequest) obj;
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
              this.password.equals(other.getPassword()))) &&
            this.queryType == other.getQueryType() &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.statusTimeStamp==null && other.getStatusTimeStamp()==null) || 
             (this.statusTimeStamp!=null &&
              this.statusTimeStamp.equals(other.getStatusTimeStamp())));
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
        _hashCode += getQueryType();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getStatusTimeStamp() != null) {
            _hashCode += getStatusTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">GetOrderStatusDetailsRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "statusTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
