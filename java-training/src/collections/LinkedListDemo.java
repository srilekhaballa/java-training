package collections;
import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		for(int i=10;i<=100;i+=10) {
			list.add(i);
		}
		System.out.println("old list:"+list);
		list.add(0, 122);   // add is for insertion
		System.out.println("new list after adding :"+list);
		list.set(2, 45);    // set is for replacing
		System.out.println("new list after setting :"+list);
		List<Integer> secondlist=new LinkedList<>();
		secondlist.add(1111);
		secondlist.add(2222);
		secondlist.add(3333);
		secondlist.add(4444);
		System.out.println("second list:" +secondlist);
		secondlist.addAll(1, list);
		System.out.println("insert one list into another at an index:" + secondlist);
		secondlist.add(666);
		System.out.println(secondlist);
		
		if(list.contains(secondlist)) {
			System.out.println("secondlist is in list");
		}
		System.out.println("secondlist is not in list");
		
		
		System.out.println("get Elements in list:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("remove Element in list:");
		list.remove(0);
		System.out.println(list);
		System.out.println(secondlist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
