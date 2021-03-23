package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<>();
		map.put("sree", 234);
		map.put("lekha", 254);
		map.put("eshwara", 874);
		map.put("bala", 234);

		Set<String> keyset=map.keySet();
		System.out.println("Key values:"+keyset);

		Collection<Integer> values=map.values();
		System.out.println("values : "+values);

		for (String key : keyset) {
			System.out.println("Key : "+key +" value :"+ map.get(key));
		}












	}

}
