package interthreadcommunication;

public class MainThread {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		synchronized(t) {
		System.out.println("Main thread is going to wait");
		t.wait();
		System.out.println("Main thread notified");
		System.out.println(t.sum);
	}
		}

}
