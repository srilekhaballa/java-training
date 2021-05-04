package jvm;
import java.lang.reflect.Method;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test  {
	
	private static final Logger logger = LogManager.getLogger("Test.class");
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c=Class.forName("jvm.User"); //package 
		Method[] methods=c.getDeclaredMethods();
		for(Method method : methods) {
			logger.info(method.getName());
		}
			logger.info(methods.length);
	}

}
