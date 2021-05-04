package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DeserializationDemo {
	
	private static final Logger logger = LogManager.getLogger("DeserializationDemo.class");
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:/Users/devim/java-training/Emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object obj=ois.readObject();
		Employee emp=(Employee)obj;
		
		logger.info("Employee id: "+emp.id);
		logger.info("Employee id: "+emp.name);
		logger.info("Employee id: "+emp.salary);
		logger.info("Employee id: "+emp.ssn);
	}
}
