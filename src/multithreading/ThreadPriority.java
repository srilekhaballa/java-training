package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ThreadPriority extends Thread{
	
	private static final Logger logger = LogManager.getLogger("ThreadPriority.class");
	public static void main(String[] args) throws InterruptedException{
		ThreadPriority t=new ThreadPriority();
		t.setPriority(MAX_PRIORITY);
		t.setName("max_prior thread t");
		t.start();
		
		ThreadPriority t1=new ThreadPriority();
		t1.setPriority(MIN_PRIORITY);
		t1.setName("min_prior thread t1");
		t1.start();
		
		
		
		
	}
	public void run() {
		
		logger.info("Thread name is: " + Thread.currentThread().getName());
	}

}
