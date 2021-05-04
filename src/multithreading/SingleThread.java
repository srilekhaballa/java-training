package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SingleThread {
	
	private static final Logger logger = LogManager.getLogger("SingleThread.class");
	void printNumbers(){
		for(int i=0;i<200;i++) {
			logger.info(i);
		}
	}
	public static void main(String[] args) {
		SingleThread s=new SingleThread();
		s.printNumbers();
		for (int i=0;i<100;i++) {
			logger.info(i);
		}
	}

}
