package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:/Users/devim/java-training/Emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object obj=ois.readObject();
		Employee emp=(Employee)obj;
		
		System.out.println("Employee id: "+emp.id);
		System.out.println("Employee id: "+emp.name);
		System.out.println("Employee id: "+emp.salary);
		System.out.println("Employee id: "+emp.ssn);
		
		

	}

}
