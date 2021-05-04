package iostreams;

import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class StringTokenizerDemo {
	
	private static final Logger logger = LogManager.getLogger("StringTokenizerDemo.class");
	public static void main(String[] args) {
		String s="The garden is full of flowers";
		StringTokenizer st=new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			logger.info(st.nextToken());
		}
		
		String s1="The garden is full of roses";
		StringTokenizer st1=new StringTokenizer(s1,",",false);
		
		while(st1.hasMoreTokens()) {
			logger.info(st1.nextToken());
		}
	}
}
