package executorframework;

import java.util.concurrent.Callable;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyCallable implements Callable<Integer> {

	private static final Logger logger = LogManager.getLogger("QueryService");
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	public Integer call() throws Exception {
		logger.info(Thread.currentThread().getName() + " is calculating the sum of all numbers upto " + num);

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += i;
		}
		return sum;
	}

}
