package mr.huntlab;

import org.apache.log4j.*;

public class MainLog4j {
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(MainLog4j.class);
		
		logger.debug("MainLog4j main class debug message.");
		logger.error("MainLog4j main class error message.");
		logger.info("MainLog4j main class info message.");
		logger.fatal("MainLog4j main class fatal message.");
		logger.trace("MainLog4j main class trace message.");
		logger.warn("MainLog4j main class warn message.");
	}

}
