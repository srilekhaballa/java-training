package collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<String,String> nmap =new TreeMap<String,String>();

		nmap.put("123", "ashana");
		nmap.put("456", "sweety");
		nmap.put("789","bala");
		nmap.put("769","balla");
		System.out.println("Mappings of NavigableMap : "
				+ nmap);

		System.out.printf("Descending Set  : %s%n",nmap.descendingKeySet());
		System.out.printf("Floor Entry  : %s%n",
				nmap.floorEntry("l"));
		System.out.printf("First Entry  : %s%n",
				nmap.firstEntry());
		System.out.printf("Last Key : %s%n", nmap.lastKey());
		System.out.printf("First Key : %s%n",
				nmap.firstKey());
		System.out.printf("Original Map : %s%n", nmap);
		System.out.printf("Reverse Map : %s%n",
				nmap.descendingMap());
	}

}
