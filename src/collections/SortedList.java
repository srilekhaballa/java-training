package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("A");
		l.add("C");
		l.add("B");
		l.add("D");
		
		System.out.println("Before Sorting:" + l);
		
		Collections.sort(l,new MyComparator());
	
		System.out.println("After Sorting:" + l);
		
		int result = Collections.binarySearch(l, "C");
		System.out.println("Index is: "+ result);
		
		
		
		
	}

}
