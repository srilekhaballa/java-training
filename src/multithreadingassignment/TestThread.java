package multithreadingassignment;

public class TestThread extends Thread{
	public synchronized void run() {
		for (int i=0;i<=10;i++) {
							System.out.println("numbers: "+i);
			}
		}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EvenNumbersThread e=new EvenNumbersThread();
		OddNumbersThread o=new OddNumbersThread();
		TestThread t=new TestThread();
		t.start();
		t.join();
		e.start();
		e.join();
		o.start();
	}

}
