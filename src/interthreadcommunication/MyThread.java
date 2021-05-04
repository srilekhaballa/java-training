package interthreadcommunication;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyThread extends Thread{
		int sum;
		private static final Logger logger = LogManager.getLogger("MyThread.class");
		
		public void run() {
			logger.info("child thread is calculating sum:");
			synchronized(this) {
			for(int i=0;i<10;i++) {
				sum+=i;
				
			}
			this.notify();
			logger.info("sum is: "+sum);
		}
		}
	public static void main(String[] args) {
		
	}

}
