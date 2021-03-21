package multithreadingassignment;

public class EvenNumbersThread extends Thread{
	public synchronized void run() {
		for (int i=0;i<=10;i++) {
			if(i%2 == 0) {
				System.out.println("even numbers: "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}
}