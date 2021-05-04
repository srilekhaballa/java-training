package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class YieldDemo {

	private static final Logger logger = LogManager.getLogger("YieldDemo.class");
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<10;i++) {
			logger.info("main thread");
		}
	}

}
