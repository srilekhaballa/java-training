package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ThreadIdentity extends Thread{
	
	private static final Logger logger = LogManager.getLogger("ThreadIdentity.class");
	public static void main(String[] args) throws InterruptedException{
		ThreadIdentity t=new ThreadIdentity();
		t.start();
		
		Thread currentthread=Thread.currentThread();
		logger.info("Thread name is:"+currentthread.getName());
		
		
	}
	public void run() {
		Thread currentthread=Thread.currentThread();
		currentthread.setName("print 200 numbers");
		logger.info("Thread name is: " + currentthread.getName());
	}

}
