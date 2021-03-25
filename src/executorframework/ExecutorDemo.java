package executorframework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
		
	public static void main(String[] args) {
		CheckProcessor[] cp= {new CheckProcessor("ATM"),new CheckProcessor("bank teller"),new CheckProcessor("mobile"),new CheckProcessor("web")};
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (CheckProcessor checkprocessor :cp) {
			service.submit(checkprocessor);
		}
		service.shutdown();
	}

}
