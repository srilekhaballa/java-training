package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;



public class HashSetDemo {

	public static void main(String[] args) {
		Random r=new Random();
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			int num=r.nextInt(10);
			list.add(num);
		}
			System.out.println("list : "+list);
			
			Set<Integer> set= new HashSet<>(list);
			System.out.println("Set :"+set);
	}

}
