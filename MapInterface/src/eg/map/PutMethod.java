package eg.map;

import java.util.HashMap;
import java.util.*;

public class PutMethod {

	public static void main(String[] args) {	
		Map<Integer,String> hotelObj = new HashMap<Integer,String>();
		hotelObj.put(1, "Le Meridian");
		hotelObj.put(2, "Royal Court");
		hotelObj.put(3, "Sangam");
		hotelObj.put(4, "Fiz");
			
			Map<Integer,String> ratingObj = new HashMap<Integer,String>();
			ratingObj.put(5, "5"); 
			ratingObj.put(6, "4");
			ratingObj.put(7, "3");
			ratingObj.put(8, "4");
			

			ratingObj.putAll(hotelObj); // copying one Map into another map 
			for(Map.Entry map1: ratingObj.entrySet()){
			System.out.println(map1.getKey()+" "+map1.getValue());		
			
		}
			System.out.println(ratingObj.size()); // return size of total obj
			System.out.println(ratingObj.containsKey(7)); // check whether particular key is there or not
			System.out.println(ratingObj.containsValue("Paradise")); // check whether particular value is there or not
			System.out.println(ratingObj.keySet()); // returns only key set in Array format
			System.out.println(ratingObj.values()); //returns only values in array format
			System.out.println(ratingObj.entrySet()); // returns whole entry set with both key and values.
			
}
}
