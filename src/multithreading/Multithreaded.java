package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Multithreaded extends Thread{

	private static final Logger logger = LogManager.getLogger("Multithreaded.class");
	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
			logger.info(i);
		}
		Multithreaded m=new Multithreaded();
		m.start();

	}
	public void run(){
		for(int i=0;i<200;i++) {
			logger.info(i);
			try {
			Thread.sleep(2000);
		}
			catch(InterruptedException e) {
				
			}
	}

}
}