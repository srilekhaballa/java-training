package multithreading;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Joindemo extends Thread{
	
	private static final Logger logger = LogManager.getLogger("Joindemo.class");
	static int n,sum=0;
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		logger.info("Sum of first N numbers: ");
		logger.info("Enter number: ");
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
		
		logger.info("Sum of first "+Joindemo.n+" numbers: "+Joindemo.sum);
		long endtime=System.currentTimeMillis();
		//System.out.println(Joindemo.sum);
		logger.info("execution time:"+(endtime-starttime)/1000 +"seconds");
		logger.info("process doesnt intervene the first thread");
	}
	public void run(){
		for(int i=1;i<n+1;i++) {
			sum += i;
	}
}
}
