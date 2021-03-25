package executorframework;
import java.util.concurrent.*;
public class MyCallableFuture {

	public static void main(String[] args) {
		MyCallable[] c= {new MyCallable(10),new MyCallable(20),new MyCallable(30),new MyCallable(40),new MyCallable(50)};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(MyCallable myCallables : c) {
			Future<Integer> future=service.submit(myCallables);
			try {
				System.out.println(future.get());
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		service.shutdown();
	}


}
