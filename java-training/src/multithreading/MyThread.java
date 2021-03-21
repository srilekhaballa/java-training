package multithreading;

public class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread");
			Thread.yield(); //first all main thread run and then this thread
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
