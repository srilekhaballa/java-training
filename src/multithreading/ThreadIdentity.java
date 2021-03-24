package multithreading;

public class ThreadIdentity extends Thread{
		
	public static void main(String[] args) throws InterruptedException{
		ThreadIdentity t=new ThreadIdentity();
		t.start();
		
		Thread currentthread=Thread.currentThread();
		System.out.println("Thread name is:"+currentthread.getName());
		
		
	}
	public void run() {
		Thread currentthread=Thread.currentThread();
		currentthread.setName("print 200 numbers");
		System.out.println("Thread name is: " + currentthread.getName());
	}

}
