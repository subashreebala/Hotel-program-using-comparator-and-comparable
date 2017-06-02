package eg.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
	
		  TreeMap<Integer,String> tree=new TreeMap<Integer,String>();  
		  
		  tree.put(12, "a");
			tree.put(14, "b");
			tree.put(32, "f");
			tree.put(18, "D");
			tree.put(20, "z");
			tree.put(0, "x");
		//	tree.put(null,null); // throws null pointer exception
			tree.put(23,null); // accept null values
			tree.put(24,"D");   //Accept duplicate values.

			for(Object map : tree.entrySet()){
				System.out.println(map); // return the key and value in sorted order based on keys
				}
			System.out.println(tree.remove(14)); //remove the key and return the value
			System.out.println(tree.ceilingEntry(32));
			System.out.println(tree.ceilingKey(30)); // return nearby greater key
	}
		
}
