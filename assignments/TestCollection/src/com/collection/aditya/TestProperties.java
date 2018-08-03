package com.collection.aditya;

import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// Properties class is derived from "Hashtable" which is derived from map
		// both key and value are Strings;
		Properties ps = System.getProperties();
		
		System.out.println("OS"+ ps.getProperty("OS name"));

	}

}
