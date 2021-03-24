package basicconcepts;

public class AccessModifiers {
	private int a=20;
	int b=30;
	protected int c=40;
	public int d=50;

	public static void main(String[] args) {
		AccessModifiers a=new  AccessModifiers();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}

}
