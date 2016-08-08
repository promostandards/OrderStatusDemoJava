/**
 * GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo  implements java.io.Serializable {
    /* The name of the person to respond to */
    private org.apache.axis.types.Token name;

    /* A monitored email address that a recipient can send their response
     * to */
    private org.apache.axis.types.Token emailAddress;

    /* The phone number of the person to respond to */
    private org.apache.axis.types.Token phoneNumber;

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo() {
    }

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo(
           org.apache.axis.types.Token name,
           org.apache.axis.types.Token emailAddress,
           org.apache.axis.types.Token phoneNumber) {
           this.name = name;
           this.emailAddress = emailAddress;
           this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the name value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @return name   * The name of the person to respond to
     */
    public org.apache.axis.types.Token getName() {
        return name;
    }


    /**
     * Sets the name value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @param name   * The name of the person to respond to
     */
    public void setName(org.apache.axis.types.Token name) {
        this.name = name;
    }


    /**
     * Gets the emailAddress value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @return emailAddress   * A monitored email address that a recipient can send their response
     * to
     */
    public org.apache.axis.types.Token getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @param emailAddress   * A monitored email address that a recipient can send their response
     * to
     */
    public void setEmailAddress(org.apache.axis.types.Token emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the phoneNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @return phoneNumber   * The phone number of the person to respond to
     */
    public org.apache.axis.types.Token getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.
     * 
     * @param phoneNumber   * The phone number of the person to respond to
     */
    public void setPhoneNumber(org.apache.axis.types.Token phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo)) return false;
        GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo other = (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail>ResponseToArray>RespondTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "phoneNumber"));
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
