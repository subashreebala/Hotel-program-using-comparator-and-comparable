package eg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {
		
		SortedMap sortObj =  new TreeMap();
		sortObj.put(12, "a");
		sortObj.put(14, "b");
		sortObj.put(32, "f");
		sortObj.put(18, "D");
		sortObj.put(20, "z");
		sortObj.put(0, "x");
		
		for(Object map : sortObj.entrySet()){
		System.out.println(map); // return the key and value in sorted order based on keys
		}
		System.out.println(sortObj.firstKey()); //returns first key alone
		System.out.println(sortObj.get(12)); // return specified key's value
		System.out.println(sortObj.get(21));  // return null if there is no key which is specified
		System.out.println(sortObj.isEmpty());
		System.out.println(sortObj.containsKey(32));
		System.out.println(sortObj.get(20).equals(sortObj.get(0))) ;
		System.out.println(sortObj.containsValue("z"));
		System.out.println(sortObj.lastKey());
		System.out.println(sortObj.tailMap(18)); //return the key and value from key =18 till end.
		System.out.println(sortObj.headMap(20)); //return the keys and values before key =20

		


;

	}

}
