package multithreading;

public class ThreadPriority extends Thread{
	
	public static void main(String[] args) throws InterruptedException{
		ThreadPriority t=new ThreadPriority();
		t.setPriority(MAX_PRIORITY);
		t.setName("max_prior thread t");
		t.start();
		
		ThreadPriority t1=new ThreadPriority();
		t1.setPriority(MIN_PRIORITY);
		t1.setName("min_prior thread t1");
		t1.start();
		
		//Thread currentthread=Thread.currentThread();
		//System.out.println("Thread name is:"+currentthread.getName());
		
		
	}
	public void run() {
		//Thread currentthread=Thread.currentThread();
		//currentthread.setName("print 200 numbers");
		System.out.println("Thread name is: " + Thread.currentThread().getName());
	}

}
