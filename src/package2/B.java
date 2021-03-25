package package2;
import package1.A;
public class B extends A {
	public static void main(String[] args) {
		B b=new B();
		//System.out.println(b.a);   //private
		//System.out.println(b.b);   //default
		System.out.println(b.c);     //protected
		System.out.println(b.d);     //public
}
}
