package interthreadcommunication;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MainThread {
	
	private static final Logger logger = LogManager.getLogger("MainThread.class");
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		synchronized(t) {
		logger.info("Main thread is going to wait");
		t.wait();
		logger.info("Main thread notified");
		logger.info(t.sum);
	}
		}

}
