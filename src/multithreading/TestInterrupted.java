package multithreading;

public class TestInterrupted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptMethod i=new InterruptMethod();
		i.start();
		
		i.interrupt();
		
		System.out.println("End of main method");

	}

}
