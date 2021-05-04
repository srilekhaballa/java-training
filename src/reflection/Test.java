package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.apache.log4j.Logger;

public class Test {
	
	private static final Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> myClass=Class.forName(Calculator.class.getName());
		log.info(myClass.getName());
		Constructor<?>[] constructors=myClass.getConstructors();
		log.info(Arrays.toString(constructors));
		log.info(Arrays.toString(myClass.getMethods()));
		
		Constructor<?> constructor=myClass.getConstructor(null);
		
		log.info(constructor.newInstance(null));
		
		
		Constructor<?> constructor2=myClass.getConstructor(double.class,double.class);
		log.info(constructor2.newInstance(5,10)); 
		
	}

}
