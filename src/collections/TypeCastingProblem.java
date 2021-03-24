package collections;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

	public static void main(String[] args) {
		
		String[] s=new String[10];
		s[0]="sri";
		s[1]="ashana";
		
		List<String> l = new ArrayList<>();
		l.add("sai");
		l.add("dev");
		l.add("her");
		
		String name=(String) l.get(0);
		String name1=(String) l.get(1);
		String name2=(String) l.get(2);
		
		
		
	}

}
