package synchronize.classlock;

import org.apache.log4j.Logger;

public class DisplayMessage {
	
	private static final Logger log = Logger.getLogger(DisplayMessage.class);
	public synchronized static void sayHello(String name) {
		for(int i=1;i<10;i++) {
			log.info("How are you"+name);
		}
	}

	public static void main(String[] args) {

	}

}
