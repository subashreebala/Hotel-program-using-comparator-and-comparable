package eg.map;

import java.util.Comparator;
import java.util.TreeSet;

public class ImplementComparator {

	public static void main(String[] args) {
	
		TreeSet<Integer> tree = new TreeSet<Integer>(new myComparator());
		tree.add(10);
		tree.add(11);
		tree.add(7);
		tree.add(12);
		tree.add(8);
		tree.add(6);
		
		System.out.println(tree);

	}

}
class myComparator implements Comparator{

	public int compare(Object o1, Object o2) {
	
		Integer obj1 = (Integer)o1;
		Integer obj2= (Integer)o2;
		
		//DIFFERENT WAYS TO IMPLEMENT COMPARATOR
		
	//	return obj1.compareTo(obj2);// return ascending order
		
	//	return -obj1.compareTo(obj2); // return decending order.  using compareTo() inside Comparator
		
	//	return obj2.compareTo(obj1);  // returns in decending order.
		
	//	return 1;   // returns insertion order
		
	//	return -1;  // returns reverse of insertion order
		
		return 0;  // return 1st element and all remaining will be duplicate
		
//		if(obj1>obj2) 
//			return -1;
//		else if (obj1<obj2)
//			return 1;
//		else
//		
//		return 0;
	}
	
}
