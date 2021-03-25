package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> myClass=Class.forName(Calculator.class.getName());
		System.out.println(myClass.getName());
		Constructor<?>[] constructors=myClass.getConstructors();
		System.out.println(Arrays.toString(constructors));
		System.out.println(Arrays.toString(myClass.getMethods()));
		
		Constructor<?> constructor=myClass.getConstructor(null);
		
		System.out.println(constructor.newInstance(null));
		
		
		Constructor<?> constructor2=myClass.getConstructor(double.class,double.class);
		System.out.println(constructor2.newInstance(5,10)); 
		
		/*Method method=myClass.getMethod("getNum1", null);
		System.out.println(method.invoke(myObj, null));*/
	
	
	}

}
