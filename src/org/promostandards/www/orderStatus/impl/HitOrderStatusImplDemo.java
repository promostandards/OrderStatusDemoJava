package org.promostandards.www.orderStatus.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Set;

import org.promostandards.www.WSDL.OrderStatusService._1_0_0.hit.*;
import org.apache.axis.types.Token;

/**
 * This class is just for demo purposes This class will have some methods to
 * show how to consume the promostandards order status
 * 
 * @author rmukherjee
 *
 */
public class HitOrderStatusImplDemo {

	public static void getOrderStatusDetailsAndOutput(
			GetOrderStatusDetailsRequest request) {
		try {
			OrderStatusServiceProxy service = new OrderStatusServiceProxy();
			if (request == null) {
				System.out.println("Invalid request object sent ");
			} else {
				GetOrderStatusDetailsResponse response = service
						.getOrderStatusDetails(request);
				handleOrderStatusOutputDetails(response);
			}
		} catch (Exception exception) {
			System.out.println("Exception: " + exception);
		}
	}

	public static void main(String[] args) {
		try {
			System.out
					.println("--------Started order status demo process--------");
			LoadOrderStatusProperties config = new LoadOrderStatusProperties();
			Hashtable<String, Token> configParams = config.getPropValues();
			if (configParams != null) {
				GetOrderStatusDetailsRequest request = createRequest(configParams);
				getOrderStatusDetailsAndOutput(request);
			} else {
				System.out.println("Could not load config file");
			}
			System.out
					.println("--------Finished order status demo process--------");
		} catch (Exception exception) {
			System.out.println("Exception: " + exception);
		}
	}

	public static GetOrderStatusDetailsRequest createRequest(
			Hashtable<String, Token> configParams) {
		try {
			GetOrderStatusDetailsRequest request = new GetOrderStatusDetailsRequest();
			Set<String> keys = configParams.keySet();
			for (String key : keys) {
				if (key == "id") {
					request.setId(configParams.get(key));
				} else if (key == "credential") {
					request.setPassword(configParams.get(key));
				} else if (key == "queryType") {
					String version = configParams.get(key).toString();
					request.setQueryType(Integer.parseInt(version));
				} else if (key == "poNumber") {
					if (request.getQueryType() == 1) {
						request.setReferenceNumber(configParams.get(key));
					}
				} else if (key == "salesOrderNumber") {
					if (request.getQueryType() == 2) {
						request.setReferenceNumber(configParams.get(key));
					}
				} else if (key == "version") {
					request.setWsVersion(configParams.get(key));
				} else if (key == "date") {
					String date = configParams.get(key).toString();
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",
							Locale.US);
					cal.setTime(sdf.parse(date));
					request.setStatusTimeStamp(cal);
				}
			}
			return request;
		} catch (Exception exception) {
			System.out.println("Exception: " + exception);
			return null;
		}
	}

	public static void handleOrderStatusOutputLiteral(
			GetOrderStatusDetailsResponse response) {
		GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus[] statuses = response
				.getOrderStatusArray();
		if (response.getErrorMessage() == ""
				|| response.getErrorMessage() != null) {
			System.out.println("The error is : " + response.getErrorMessage());
		} else {
			for (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatus status : statuses) {
				for (GetOrderStatusDetailsResponseOrderStatusArrayOrderStatusOrderStatusDetailArrayOrderStatusDetail detail : status
						.getOrderStatusDetailArray()) {
					System.out.println("The order status is : '"
							+ detail.getStatusName() + "' with status id : "
							+ detail.getStatusID());
				}
			}
		}
	}

	public static void handleOrderStatusOutputDetails(
			GetOrderStatusDetailsResponse response) {
		try {
			String xml = AxisObjectUtil.serializeAxisObject(response, false,
					false);
			ClassLoader classLoader = LoadOrderStatusProperties.class.getClassLoader();
			File classpathRoot = new File(classLoader.getResource("").getPath());
			java.io.FileWriter fw = new java.io.FileWriter(classpathRoot.getPath() + File.separator + "orderStatusDetails.xml");
			System.out.println("Outputted xml file to " + classpathRoot.getPath() + File.separator + "orderStatusDetails.xml");
			fw.write(xml);
			fw.close();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

	}

}
