package basicconcepts;

public class InvokeNonStaticmethod {
	int num=3;
	int method1() {
		return num;
	}
	public static void main(String []args) {
		InvokeNonStaticmethod ns= new InvokeNonStaticmethod();
		System.out.println(ns.method1());
	}
}
