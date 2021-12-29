package com.revature.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLoggingDemo {

	public static void main(String[] args) {
		Logger myLogger = LoggerFactory.getLogger(SimpleLoggingDemo.class);
		myLogger.debug("Debugging an issue in my application");
		myLogger.error("Logging error");
		
	}
	
}

