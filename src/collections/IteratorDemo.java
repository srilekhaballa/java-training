package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(54);
		l.add(36);
		l.add(29);
		
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(l);
	}

}
