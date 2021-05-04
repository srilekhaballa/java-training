package multithreadingassignment;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestThread extends Thread{
	
	private static final Logger logger = LogManager.getLogger("TestThread.class");
	public synchronized void run() {
		for (int i=0;i<=10;i++) {
							logger.info("numbers: "+i);
			}
		}
	
	public static void main(String[] args) throws InterruptedException {
		EvenNumbersThread e=new EvenNumbersThread();
		OddNumbersThread o=new OddNumbersThread();
		TestThread t=new TestThread();
		t.start();
		t.join();
		e.start();
		e.join();
		o.start();
	}

}
