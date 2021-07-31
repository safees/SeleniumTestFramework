package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemoExample {
	
	private static Logger logger = LogManager.getLogger(Log4jDemoExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Hello World...!   \n");
		
		logger.trace("This is a tracce message ");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is warn message");
		logger.fatal("This is an fatal message");
		
		System.out.println("\n Completed");


	}

}