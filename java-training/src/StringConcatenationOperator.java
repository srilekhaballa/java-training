
public class StringConcatenationOperator {
	public static void main(String []args) {
		int a=2,b=4,c=9;
		String s1="xys";
		String s2="abn";
		System.out.println(a+b+c);
		System.out.println(s1+s2);
		System.out.println(s1+s2+a+b+c);
		System.out.println(a+b+s1+s2+c);
		System.out.println(a+s1+b+c);
	}
}
