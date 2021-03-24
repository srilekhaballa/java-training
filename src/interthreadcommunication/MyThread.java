package interthreadcommunication;

public class MyThread extends Thread{
		int sum;
		
		public void run() {
			System.out.println("child thread is calculating sum:");
			synchronized(this) {
			for(int i=0;i<10;i++) {
				sum+=i;
				
			}
			this.notify();
			System.out.println("sum is: "+sum);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
