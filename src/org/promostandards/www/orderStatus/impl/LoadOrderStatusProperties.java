package org.promostandards.www.orderStatus.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Hashtable;

import org.apache.axis.types.Token;

public class LoadOrderStatusProperties {


	public Hashtable<String, Token> getPropValues() throws IOException {
		Hashtable<String, Token> properties = new Hashtable<String, Token>();
		try {
			Properties prop = new Properties();
			ClassLoader classLoader = LoadOrderStatusProperties.class.getClassLoader();
			File classpathRoot = new File(classLoader.getResource("").getPath());
			System.out.println("The class path is " + classpathRoot.getPath());
			String propFileName = classpathRoot.getPath() + File.separator + "orderstatusconfig.properties";
			prop.load(new FileInputStream(propFileName));
			Token id = new Token(prop.getProperty("id"));
			Token credential = new Token(prop.getProperty("credential"));
			Token poNumber = new Token(prop.getProperty("poNumber"));
			Token salesOrderNumber = new Token(
					prop.getProperty("salesOrderNumber"));
			Token date = new Token(prop.getProperty("date"));
			Token queryType = new Token(prop.getProperty("queryType"));
			Token version = new Token(prop.getProperty("version"));
			properties.put("id", id);
			properties.put("credential", credential);
			properties.put("poNumber", poNumber);
			properties.put("salesOrderNumber", salesOrderNumber);
			properties.put("date", date);
			properties.put("queryType", queryType);
			properties.put("version", version);
			System.out.println("The properties file got loaded");
		} catch (Exception exception) {
			System.out.println("Exception: " + exception);
			return null;
		} 
		return properties;
	}
}
