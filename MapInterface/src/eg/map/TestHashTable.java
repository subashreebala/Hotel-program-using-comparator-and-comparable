package eg.map;

import java.util.*;

public class TestHashTable {

	public static void main(String[] args) {
	
		Hashtable<Integer,String> obj = new Hashtable<Integer,String>(); //synchronized
			obj.put(0, "x");
			obj.put(12, "a");
			obj.put(14, "b");
			obj.put(32, "f");
			obj.put(18, "D");
			obj.put(20, "z");
			obj.put(0, "x"); 			// will not allow duplicate entry
			obj.put(1, "x");
			
		//	obj.put(11,null);			 // will not  allow null value and throws null pointer exception
		//	obj.put(null, "x");        // will not  allow null key throws null pointer exception
		
			for(Object hash : obj.entrySet()){
				System.out.println(hash); // returns all key and values
				}
			
			System.out.println(obj.clone()); // return one copy of obj
			System.out.println(obj.get(18)); // return value of the specified key

	}

}
