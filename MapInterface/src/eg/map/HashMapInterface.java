package eg.map;

import java.util.*;

public class HashMapInterface {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashObj = new HashMap<Integer,String>(); // implements interface underlying in hashtable ds.
																// No insertion order but inserted based on hashcode of keys.
		hashObj.put(1, "Javascript");
		hashObj.put(2, "Javascript");
		hashObj.put(null, null); //allows both null key and null value and also, if there is null key in the list of obj keys, it will be excecuted first.
		hashObj.put(null, "Jquery"); // replace the previous value of null key with jQuery value because null key is allowed only once.
		hashObj.put(3, null);
		
	for(Map.Entry map : hashObj.entrySet()){
		System.out.println(map.getKey()+" "+map.getValue());
	}
	hashObj.clear(); // remove all mapping from this map
	
	for(Map.Entry map1 : hashObj.entrySet()){
		System.out.println(map1.getKey()+" "+map1.getValue());
	}
	}

}
