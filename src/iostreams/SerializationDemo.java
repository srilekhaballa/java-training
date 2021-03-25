package iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		ObjectOutputStream oos;
	
		
		try {
		fos= new FileOutputStream("C:/Users/devim/java-training/Emp.ser");
		oos= new ObjectOutputStream(fos);
		
		Employee emp=new Employee(1,"sree",30000,345);
		oos.writeObject(emp);
		System.out.println("Employee object serialized");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	}

}
