package multithreading;

public class SingleThread {
	void printNumbers(){
		for(int i=0;i<200;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThread s=new SingleThread();
		s.printNumbers();
		for (int i=0;i<100;i++) {
			System.out.println(i);
		}
	}

}
