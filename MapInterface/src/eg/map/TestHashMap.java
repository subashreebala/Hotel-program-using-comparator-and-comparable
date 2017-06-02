package eg.map;

import java.util.HashMap;


public class TestHashMap {

	public static void main(String[] args) {
		
		
		HashMap obj = new HashMap();
		 TestHashMap testobj = new  TestHashMap();
		obj.put(testobj	, "I won't change");
		
		System.out.println(obj.values());
		testobj=null;
		System.gc(); // cannot move refernce object if it is referenced null and accessed as key by hashMap to gc and it will not replace the value
		
		System.out.println(obj.values());

	}

}
