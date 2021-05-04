package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class InterruptMethod extends Thread{
	
	private static final Logger logger = LogManager.getLogger("InterruptMethod.class");
		public void run() {
			try {
			for(int i=1;i<=10;i++) {
				logger.info("I am proactive");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				logger.info("Got interrupted");
			}
		}
	public static void main(String[] args) {

	}

}
