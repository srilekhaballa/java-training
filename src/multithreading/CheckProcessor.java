package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CheckProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger("CheckProcessor.class");
	public void run() {
		logger.info("Process the checks");
	}
	public static void main(String[] args) {
		CheckProcessor cp=new CheckProcessor();
	}
}
