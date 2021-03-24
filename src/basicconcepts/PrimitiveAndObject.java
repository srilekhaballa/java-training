package basicconcepts;

public class PrimitiveAndObject {
	public static void main(String []args) {
		int x=100;
		Integer y=Integer.valueOf(x);
		int z=y.intValue();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
