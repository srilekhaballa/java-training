package executorframework;

public class CheckProcessor implements Runnable{
	String name;
	public CheckProcessor(String name) {
		this.name=name;
	}
	

	@Override
	public void run() {
		System.out.println(name+"Check processor has begun processing check"+Thread.currentThread().getName());
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"Check processor has completed processing check"+Thread.currentThread().getName());
	}

}
