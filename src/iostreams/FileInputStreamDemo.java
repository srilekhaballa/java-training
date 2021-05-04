package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

public class FileInputStreamDemo {

	private static final Logger logger = LogManager.getLogger("FileInputStreamDemo.class");
	public static void main(String[] args) {
		FileInputStream fis= null;
		try {
		fis=new FileInputStream(new File("/Users/devim/Documents/Demo/file.txt"));
		logger.info("File opened");
		
		int i;
		while((i=fis.read())!= -1) {
			logger.info((char)i);
		}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			logger.info("file closed");
		}
	}

}
