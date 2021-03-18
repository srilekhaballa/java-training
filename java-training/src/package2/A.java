package package2;
 import package1.*;
import java.util.*;
public class A {

	public static void main(String[] args) {
		System.out.println(package1.A.d);
		
		Scanner s=new Scanner(System.in);
		int num1=Integer.parseInt(s.next());
		int num2=Integer.parseInt(s.next());
		int r= num1+num2;
		System.out.println(r);
	}

}
