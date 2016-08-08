/**
 * GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit;

public class GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(java.math.BigInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.math.BigInteger _value1 = new java.math.BigInteger("10");
    public static final java.math.BigInteger _value2 = new java.math.BigInteger("11");
    public static final java.math.BigInteger _value3 = new java.math.BigInteger("20");
    public static final java.math.BigInteger _value4 = new java.math.BigInteger("20");
    public static final java.math.BigInteger _value5 = new java.math.BigInteger("30");
    public static final java.math.BigInteger _value6 = new java.math.BigInteger("40");
    public static final java.math.BigInteger _value7 = new java.math.BigInteger("41");
    public static final java.math.BigInteger _value8 = new java.math.BigInteger("42");
    public static final java.math.BigInteger _value9 = new java.math.BigInteger("43");
    public static final java.math.BigInteger _value10 = new java.math.BigInteger("44");
    public static final java.math.BigInteger _value11 = new java.math.BigInteger("60");
    public static final java.math.BigInteger _value12 = new java.math.BigInteger("70");
    public static final java.math.BigInteger _value13 = new java.math.BigInteger("75");
    public static final java.math.BigInteger _value14 = new java.math.BigInteger("80");
    public static final java.math.BigInteger _value15 = new java.math.BigInteger("99");
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value1 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value1);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value2 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value2);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value3 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value3);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value4 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value4);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value5 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value5);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value6 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value6);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value7 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value7);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value8 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value8);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value9 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value9);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value10 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value10);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value11 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value11);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value12 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value12);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value13 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value13);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value14 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value14);
    public static final GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID value15 = new GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID(_value15);
    public java.math.BigInteger getValue() { return _value_;}
    public static GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID enumeration = (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new java.math.BigInteger(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetailStatusID.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.promostandards.org/WSDL/OrderStatusService/1.0.0/", ">>>>>>GetOrderStatusDetailsResponse>OrderStatusArray>OrderStatus>OrderStatusDetailArray>OrderStatusDetail>statusID"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
