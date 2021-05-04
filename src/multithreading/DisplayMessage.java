package multithreading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DisplayMessage {
	
	private static final Logger logger = LogManager.getLogger("DisplayMessage.class");
	public synchronized  void sayHello(String name) {
		for(int i=1;i<10;i++) {
			logger.info("How are you"+name);
		}
	}

	public static void main(String[] args) {

	}

}
