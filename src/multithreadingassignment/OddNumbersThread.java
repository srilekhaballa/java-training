package multithreadingassignment;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class OddNumbersThread extends Thread{
	
	private static final Logger logger = LogManager.getLogger("OddNumbersThread.class");
	public synchronized void run() {
		for (int i=0;i<=10;i++) {
			if(i%2 != 0) {
				logger.info("odd numbers: "+i);
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
