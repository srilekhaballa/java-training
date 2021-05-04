package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyCallableFuture {
	
	private static final Logger logger = LogManager.getLogger("MyCallableFuture.class");
	public static void main(String[] args) {
		MyCallable[] c= {new MyCallable(10),new MyCallable(20),new MyCallable(30),new MyCallable(40),new MyCallable(50)};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(MyCallable myCallables : c) {
			Future<Integer> future=service.submit(myCallables);
			try {
				logger.info(future.get());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}
}
