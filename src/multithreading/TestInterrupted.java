package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestInterrupted {

	private static final Logger logger = LogManager.getLogger("TestInterrupted.class");
	public static void main(String[] args) {
		InterruptMethod i=new InterruptMethod();
		i.start();
		
		i.interrupt();
		
		logger.info("End of main method");

	}

}
