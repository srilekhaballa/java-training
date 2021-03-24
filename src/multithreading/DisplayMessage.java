package multithreading;

public class DisplayMessage {
	public synchronized  void sayHello(String name) {
		for(int i=1;i<10;i++) {
			System.out.println("How are you"+name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
