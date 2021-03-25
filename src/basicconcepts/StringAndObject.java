package basicconcepts;

public class StringAndObject {
	public static void main(String []args) {
		long a=100;
		Long b=Long.valueOf(a);
		String s=b.toString();
		Long y=Long.valueOf(s);
		System.out.println(b);
		System.out.println(s);
		System.out.println(y);
	}
}
