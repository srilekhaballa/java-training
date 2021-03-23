package collections;

import java.util.ArrayList;

public class WildCardParams1 {

	public static void main(String[] args) {
		WildCardParams1 wc=new WildCardParams1();
		wc.myMethod(new ArrayList<A>());

	}
	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
	}

}
