package package1;

import org.apache.log4j.Logger;

import optionalexample.OptionalNullableEx;

public class A {
	private static int a=20;
	int b=30;
	protected int c=40;
	public static int d=50;
	private static final Logger log = Logger.getLogger(A.class);
	public static void main(String[] args) {
		A a=new A();
		log.info(a.a);
		log.info(a.b);
		log.info(a.c);
		log.info(a.d);
	}

}
