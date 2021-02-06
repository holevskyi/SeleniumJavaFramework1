package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {

	static Logger logger = LogManager.getLogger(log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("vhgcggvhhvuh");
		
		logger.info("info message");
		logger.error("error");
		
		System.out.println("done");
	}

}
