package org.promostandards.www.orderStatus.impl;

import java.io.StringWriter;
import java.lang.reflect.Method;

import javax.xml.namespace.QName;

import org.apache.axis.MessageContext;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.apache.axis.server.AxisServer;
import org.xml.sax.helpers.AttributesImpl;


/**
 * This is a utility class for working with Axis generated objects.
 *
 * @author Bob Withers  7/6/06
 */
public class AxisObjectUtil {
	/**
	 * Convert an Axis data object (as generated by WSDL2Java) to an XML string.
	 *
	 * @param obj
	 *            The xis JavaBean object.
	 * @param removeNamespaces
	 *            If true all namespace attributes will be removed from the
	 *            returned XML string.
	 *
	 * @return A string containing the XML of the seriaslized Axis JavaBean
	 *         object.
	 * @throws AxisObjectException
	 *             If an error is encountered while serializing the Axis
	 *             JavaBean.
	 */
	public static String serializeAxisObject(final Object obj,
			final boolean removeNamespaces, final boolean prettyPrint)
			throws AxisObjectException {
		final StringWriter outStr = new StringWriter();
		final TypeDesc typeDesc = getAxisTypeDesc(obj);
		QName qname = typeDesc.getXmlType();
		String lname = qname.getLocalPart();
		if (lname.startsWith(">") && lname.length() > 1)
			lname = lname.substring(1);

		qname = removeNamespaces ? new QName(lname) : new QName(
				qname.getNamespaceURI(), lname);
		final AxisServer server = new AxisServer();
		final BeanSerializer ser = new BeanSerializer(obj.getClass(), qname,
				typeDesc);
		final SerializationContext ctx = new SerializationContext(outStr,
				new MessageContext(server));
		ctx.setSendDecl(false);
		ctx.setDoMultiRefs(false);
		ctx.setPretty(prettyPrint);
		try {
			ser.serialize(qname, new AttributesImpl(), obj, ctx);
		} catch (final Exception e) {
			throw new AxisObjectException("Unable to serialize object "
					+ obj.getClass().getName(), e);
		}

		String xml = outStr.toString();

		if (removeNamespaces) {
			// remove any namespace attributes
			xml = xml.replaceAll(" xmlns[:=].*?\".*?\"", "").replaceAll(
					" xsi:type=\".*?\"", "");
		}

		return (xml);
	}

	/**
	 * Return the Axis TypeDesc object for the passed Axis JavaBean.
	 *
	 * @param obj
	 *            The Axis JavaBean object.
	 *
	 * @return The Axis TypeDesc for the JavaBean.
	 * @throws AxisObjectException
	 *             If the passed object is not an Axis JavaBean.
	 */
	public static TypeDesc getAxisTypeDesc(final Object obj)
			throws AxisObjectException {
		final Class objClass = obj.getClass();
		try {
			final Method methodGetTypeDesc = objClass.getMethod("getTypeDesc",
					new Class[] {});
			final TypeDesc typeDesc = (TypeDesc) methodGetTypeDesc.invoke(obj,
					new Object[] {});
			return (typeDesc);
		} catch (final Exception e) {
			throw new AxisObjectException("Unable to get Axis TypeDesc for "
					+ objClass.getName(), e);
		}
	}
}
