package collections;
import java.util.ArrayList;
public class ArrayListDemo {
		
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);  //Autoboxing
		list.add( Integer.valueOf(20)); //dont use new 
		list.add(30);
		//list.add("hello");
		System.out.println(list);

	}

}
