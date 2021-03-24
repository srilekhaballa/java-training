package collections;

import java.util.Arrays;
import java.util.List;


public class ArraySortDemo {

	public static void main(String[] args) {
		
		int[] a= {23,56,43,86,100};
		
		System.out.println("Before Sort: ");
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		
		
		System.out.println("After Sort: ");
		for (int i : a) {
			System.out.println(i);
		}
		
		String[] s= {"d","g","a","t"};
		
		Arrays.sort(s,new MyComparator());
		for (String string : s) {
			System.out.println(string);
		}
		
		/*String s1 = "a";
		System.out.println(Arrays.binarySearch(s, s1));*/
		
		List<String> l=Arrays.asList(s);
		s[1]="y";
		//l.add("o");
		System.out.println(l);
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
