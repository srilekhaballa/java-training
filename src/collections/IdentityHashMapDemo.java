package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	
	public static void main(String[] args) {
		Map<String,String> map=new IdentityHashMap<>();
		
		String int1=new String("1"); //hashCode is same when content is same
		String int2="1";
		
		map.put(int1," sri ");
		map.put(int2," sree ");
		System.out.println(int1.hashCode());
		System.out.println(int2.hashCode());	
		System.out.println(map);
		

	}

}
