package eg.map;

import java.util.LinkedHashMap;
import java.util.*;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<Integer, String>(); // maintains insertion order , 
		//underlying on linkedlist and hashtable ds
		
		obj.put(1, "Map");
		obj.put(2, "HashMap");
		obj.put(3, "LinkedHashMap");
		
		for(Map.Entry map : obj.entrySet()){
			System.out.println(map.getKey()+" " +map.getValue());
		}

	}

}
