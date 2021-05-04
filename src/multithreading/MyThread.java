package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyThread extends Thread {
	
	private static final Logger logger = LogManager.getLogger("MyThread.class");
	public void run() {
		for(int i=1;i<=10;i++) {
			logger.info("child thread");
			Thread.yield(); //first all main thread run and then this thread
		}
	}

	public static void main(String[] args) {

	}

}
