package package1;
import org.apache.log4j.Logger;

import package1.package3.*;
public class C {
	private static final Logger log = Logger.getLogger(C.class);
	public static void a1() {
		log.info("Inside a1");
	}
	public  void a2() {
		log.info("Inside a2");
	}
	public static void main(String []args) {
	E e =new E();
	e.e1();
	
	}
}
