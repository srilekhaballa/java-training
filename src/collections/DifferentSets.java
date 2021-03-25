package collections;

import java.util.Random;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random r=new Random();
		//HashSet<Integer> h=new HashSet<>();
		
		//LinkedHashSet<Integer> l=new LinkedHashSet<>();
		
		TreeSet<Integer> t= new TreeSet<>();
		
		for(int i=1;i<10;i++) {
			int num=r.nextInt(10);
			t.add(num);
			System.out.println(num);
		}
		System.out.println("Treeset elements: "+t);
	}

}
