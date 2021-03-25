package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		Set<StringBuffer> s=new TreeSet<>(new StringBufferComparator());
		
		s.add(new StringBuffer("abd"));
		s.add(new StringBuffer("acd"));
		s.add(new StringBuffer("egd"));
		s.add(new StringBuffer("tfd"));
		for (StringBuffer stringBuffer : s) {
			System.out.println(stringBuffer);
		}

	}

}
