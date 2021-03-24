package multithreading;

public class InterruptMethod extends Thread{
		public void run() {
			try {
			for(int i=1;i<=10;i++) {
				System.out.println("I am proactive");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				System.out.println("Got interrupted");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
