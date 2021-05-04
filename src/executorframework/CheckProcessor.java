package executorframework;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CheckProcessor implements Runnable{
	
	private static final Logger logger = LogManager.getLogger("CheckProcessor.class");
	String name;
	public CheckProcessor(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		logger.info(name +" Check processor has begun processing check "+ Thread.currentThread().getName());
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		logger.info(name +" Check processor has completed processing check "+ Thread.currentThread().getName());
	}
}
