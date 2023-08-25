package demoTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogingDemoTest {

	public static void main(String[] args) {
		Logger log=LogManager.getLogger("Demo Logger");
		System.out.println("this is Logger Demo");
		log.info("Here is log info");
		log.warn("Here is log warn");
		log.fatal("Here is log fatal");
		log.debug("here is log debug");
		
		

	}

}
