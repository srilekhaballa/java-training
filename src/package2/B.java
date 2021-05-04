package package2;
import org.apache.log4j.Logger;
import package1.A;

public class B extends A {
	
	private static final Logger log = Logger.getLogger(B.class);
	public static void main(String[] args) {
		B b=new B();
		//System.out.println(b.a);   //private
		//System.out.println(b.b);   //default
		log.info(b.c);     //protected
		log.info(b.d);     //public
}
}
