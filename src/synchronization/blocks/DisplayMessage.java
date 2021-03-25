package synchronization.blocks;

public class DisplayMessage {
	public synchronized void sayHello(String name) {
		
		synchronized(this) {
		for(int i=1;i<10;i++) {
			System.out.println("How are you"+name);
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
		// TODO Auto-generated method stub

	}


}