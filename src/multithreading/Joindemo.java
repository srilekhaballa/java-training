package multithreading;

import java.util.Scanner;

public class Joindemo extends Thread{
		static int n,sum=0;
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		System.out.println("Sum of first N numbers: ");
		System.out.println("Enter number: ");
		Scanner scanner=new Scanner(System.in);
		Joindemo.n=scanner.nextInt();
		Joindemo j=new Joindemo();
		j.start();
		try {
			j.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first "+Joindemo.n+" numbers: "+Joindemo.sum);
		long endtime=System.currentTimeMillis();
		//System.out.println(Joindemo.sum);
		System.out.println("execution time:"+(endtime-starttime)/1000 +"seconds");
		System.out.println("process doesnt intervene the first thread");
	}
	public void run(){
		for(int i=1;i<n+1;i++) {
			sum += i;
			
			
	}
		
}
}
