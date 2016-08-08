/**
 * GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail  implements java.io.Serializable {
    /* The associated factory sales order number 
     *                                       (This is used in the example of internal PO splitting at the factory level) */
    private org.apache.axis.types.Token factoryOrderNumber;

    /* Paired standard order status from allowed values */
    private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID statusID;

    /* Textual description of statusID */
    private org.apache.axis.types.Token statusName;

    /* The expected ship date for the purchase order */
    private java.util.Calendar expectedShipDate;

    /* The expected date the order should arrive at customer also known as the “in hands date�? */
    private java.util.Calendar expectedDeliveryDate;

    /* An array of human contact information such as email, phone, and rep name so the distributor knows who to get in contact to fix an issue. */
    private org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo[] responseToArray;

    /* This allows further detail about the status */
    private java.lang.String additionalExplanation;

    /* True or False to determine if it is necessary to provide information back to the supplier to complete the order */
    private java.lang.Boolean responseRequired;

    /* Time of order status */
    private java.util.Calendar validTimestamp;

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail() {
    }

    public GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail(
           org.apache.axis.types.Token factoryOrderNumber,
           org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID statusID,
           org.apache.axis.types.Token statusName,
           java.util.Calendar expectedShipDate,
           java.util.Calendar expectedDeliveryDate,
           org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo[] responseToArray,
           java.lang.String additionalExplanation,
           java.lang.Boolean responseRequired,
           java.util.Calendar validTimestamp) {
           this.factoryOrderNumber = factoryOrderNumber;
           this.statusID = statusID;
           this.statusName = statusName;
           this.expectedShipDate = expectedShipDate;
           this.expectedDeliveryDate = expectedDeliveryDate;
           this.responseToArray = responseToArray;
           this.additionalExplanation = additionalExplanation;
           this.responseRequired = responseRequired;
           this.validTimestamp = validTimestamp;
    }


    /**
     * Gets the factoryOrderNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return factoryOrderNumber   * The associated factory sales order number 
     *                                       (This is used in the example of internal PO splitting at the factory level)
     */
    public org.apache.axis.types.Token getFactoryOrderNumber() {
        return factoryOrderNumber;
    }


    /**
     * Sets the factoryOrderNumber value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param factoryOrderNumber   * The associated factory sales order number 
     *                                       (This is used in the example of internal PO splitting at the factory level)
     */
    public void setFactoryOrderNumber(org.apache.axis.types.Token factoryOrderNumber) {
        this.factoryOrderNumber = factoryOrderNumber;
    }


    /**
     * Gets the statusID value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return statusID   * Paired standard order status from allowed values
     */
    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID getStatusID() {
        return statusID;
    }


    /**
     * Sets the statusID value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param statusID   * Paired standard order status from allowed values
     */
    public void setStatusID(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID statusID) {
        this.statusID = statusID;
    }


    /**
     * Gets the statusName value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return statusName   * Textual description of statusID
     */
    public org.apache.axis.types.Token getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param statusName   * Textual description of statusID
     */
    public void setStatusName(org.apache.axis.types.Token statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the expectedShipDate value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return expectedShipDate   * The expected ship date for the purchase order
     */
    public java.util.Calendar getExpectedShipDate() {
        return expectedShipDate;
    }


    /**
     * Sets the expectedShipDate value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param expectedShipDate   * The expected ship date for the purchase order
     */
    public void setExpectedShipDate(java.util.Calendar expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }


    /**
     * Gets the expectedDeliveryDate value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return expectedDeliveryDate   * The expected date the order should arrive at customer also known as the “in hands date�?
     */
    public java.util.Calendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param expectedDeliveryDate   * The expected date the order should arrive at customer also known as the “in hands date�?
     */
    public void setExpectedDeliveryDate(java.util.Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the responseToArray value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return responseToArray   * An array of human contact information such as email, phone, and rep name so the distributor knows who to get in contact to fix an issue.
     */
    public org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo[] getResponseToArray() {
        return responseToArray;
    }


    /**
     * Sets the responseToArray value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param responseToArray   * An array of human contact information such as email, phone, and rep name so the distributor knows who to get in contact to fix an issue.
     */
    public void setResponseToArray(org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailResponseToArrayRespondTo[] responseToArray) {
        this.responseToArray = responseToArray;
    }


    /**
     * Gets the additionalExplanation value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return additionalExplanation   * This allows further detail about the status
     */
    public java.lang.String getAdditionalExplanation() {
        return additionalExplanation;
    }


    /**
     * Sets the additionalExplanation value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param additionalExplanation   * This allows further detail about the status
     */
    public void setAdditionalExplanation(java.lang.String additionalExplanation) {
        this.additionalExplanation = additionalExplanation;
    }


    /**
     * Gets the responseRequired value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return responseRequired   * True or False to determine if it is necessary to provide information back to the supplier to complete the order
     */
    public java.lang.Boolean getResponseRequired() {
        return responseRequired;
    }


    /**
     * Sets the responseRequired value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param responseRequired   * True or False to determine if it is necessary to provide information back to the supplier to complete the order
     */
    public void setResponseRequired(java.lang.Boolean responseRequired) {
        this.responseRequired = responseRequired;
    }


    /**
     * Gets the validTimestamp value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @return validTimestamp   * Time of order status
     */
    public java.util.Calendar getValidTimestamp() {
        return validTimestamp;
    }


    /**
     * Sets the validTimestamp value for this GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.
     * 
     * @param validTimestamp   * Time of order status
     */
    public void setValidTimestamp(java.util.Calendar validTimestamp) {
        this.validTimestamp = validTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail)) return false;
        GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail other = (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.factoryOrderNumber==null && other.getFactoryOrderNumber()==null) || 
             (this.factoryOrderNumber!=null &&
              this.factoryOrderNumber.equals(other.getFactoryOrderNumber()))) &&
            ((this.statusID==null && other.getStatusID()==null) || 
             (this.statusID!=null &&
              this.statusID.equals(other.getStatusID()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.expectedShipDate==null && other.getExpectedShipDate()==null) || 
             (this.expectedShipDate!=null &&
              this.expectedShipDate.equals(other.getExpectedShipDate()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.responseToArray==null && other.getResponseToArray()==null) || 
             (this.responseToArray!=null &&
              java.util.Arrays.equals(this.responseToArray, other.getResponseToArray()))) &&
            ((this.additionalExplanation==null && other.getAdditionalExplanation()==null) || 
             (this.additionalExplanation!=null &&
              this.additionalExplanation.equals(other.getAdditionalExplanation()))) &&
            ((this.responseRequired==null && other.getResponseRequired()==null) || 
             (this.responseRequired!=null &&
              this.responseRequired.equals(other.getResponseRequired()))) &&
            ((this.validTimestamp==null && other.getValidTimestamp()==null) || 
             (this.validTimestamp!=null &&
              this.validTimestamp.equals(other.getValidTimestamp())));
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
        if (getFactoryOrderNumber() != null) {
            _hashCode += getFactoryOrderNumber().hashCode();
        }
        if (getStatusID() != null) {
            _hashCode += getStatusID().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getExpectedShipDate() != null) {
            _hashCode += getExpectedShipDate().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getResponseToArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseToArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseToArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalExplanation() != null) {
            _hashCode += getAdditionalExplanation().hashCode();
        }
        if (getResponseRequired() != null) {
            _hashCode += getResponseRequired().hashCode();
        }
        if (getValidTimestamp() != null) {
            _hashCode += getValidTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factoryOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "factoryOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "statusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail>statusID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "statusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "expectedShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseToArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "ResponseToArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail>ResponseToArray>RespondTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "RespondTo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "additionalExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "responseRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", "validTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
