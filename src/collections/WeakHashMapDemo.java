package collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Map<User,String> map=new WeakHashMap<>();
		User u= new User();
		map.put(u, "cat");
		
		System.out.println(map);
		
		u=null;
		
		System.gc();             //garbage collector called with weakhashmap
		Thread.sleep(200);
		System.out.println(map);
	}

}
