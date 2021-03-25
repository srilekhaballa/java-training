package iostreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s="The garden is full of flowers";
		StringTokenizer st=new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String s1="The garden is full of roses";
		StringTokenizer st1=new StringTokenizer(s1,",",false);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		
		
		

	}

}
