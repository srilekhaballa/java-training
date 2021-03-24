package collections;

import java.util.ArrayList;

public class WildCardParams {   // ? -- only null values
	
	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
		//l.add("srilekha");
	}

	public static void main(String[] args) {
		WildCardParams wcp=new WildCardParams();
		wcp.myMethod(new ArrayList<A>());

	}

}
