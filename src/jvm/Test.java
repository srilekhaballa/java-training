package jvm;
import java.lang.reflect.Method;

public class Test  {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c=Class.forName("jvm.User"); //package 
		Method[] methods=c.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
			System.out.println(methods.length);
	}

}
