package synchronization.blocks;

import org.apache.log4j.Logger;

import reflection.Calculator;

public class DisplayMessage {
	
	private static final Logger log = Logger.getLogger(DisplayMessage.class);
	public synchronized void sayHello(String name) {
		
		synchronized(this) {
		for(int i=1;i<10;i++) {
			log.info("How are you"+name);
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	}
	public static void main(String[] args) {

	}


}