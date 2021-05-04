package jvm;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MultipleObjects {
	
	private static final Logger logger = LogManager.getLogger("MultipleObjects.class");
	public static void main(String[] args) {
		User u1=new User();
		Class c1=u1.getClass();
		
		User u2=new User();
		Class c2=u2.getClass();
		
		logger.info(c1.hashCode());
		logger.info(c2.hashCode());
		logger.info(c1 == c2);
		
		logger.info(c1.getClassLoader());
		logger.info(String.class.getClassLoader());

	}

}
