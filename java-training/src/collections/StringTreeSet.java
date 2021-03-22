package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		Set<String> s=new TreeSet<>(new StringComparator());
		
		s.add("asccrfvhtghghtgb");
		s.add("ytdxegyju");
		s.add("utrcrtrjikopliuhg");
		s.add("yusswcef");
		
		for(String o : s) {
			System.out.println(o);
		}

	}

}
