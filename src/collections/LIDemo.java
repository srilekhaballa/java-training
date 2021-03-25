package collections;

import java.util.*;

public class LIDemo {

	public static void main(String[] args) {
		List<String> l=new LinkedList();
		
		l.add("sri");
		l.add("sdfhj");
		l.add("bhydy");
		
		ListIterator<String> i=l.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
