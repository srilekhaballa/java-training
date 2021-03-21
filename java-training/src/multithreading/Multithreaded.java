package multithreading;

public class Multithreaded extends Thread{

	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
			System.out.println(i);
		}
		Multithreaded m=new Multithreaded();
		m.start();

	}
	public void run(){
		for(int i=0;i<200;i++) {
			System.out.println(i);
		}
	}

}
