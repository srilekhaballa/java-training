package multithreadingassignment;

public class OddNumbersThread extends Thread{
	public synchronized void run() {
		for (int i=0;i<=10;i++) {
			if(i%2 != 0) {
				System.out.println("odd numbers: "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
