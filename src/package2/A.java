package package2;
 import package1.*;
import package1.package3.E;

import java.util.*;

import org.apache.log4j.Logger;
public class A {
	
	private static final Logger log = Logger.getLogger(A.class);
	public static void main(String[] args) {
		log.info(package1.A.d);
		
		Scanner s=new Scanner(System.in);
		int num1=Integer.parseInt(s.next());
		int num2=Integer.parseInt(s.next());
		int r= num1+num2;
		log.info(r);
	}

}
