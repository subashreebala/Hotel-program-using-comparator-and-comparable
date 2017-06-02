package eg.map;

import java.util.*;

class HotelDetails  implements Comparable<HotelDetails>{
	int hotelId,ratings,cost;
	String name,city;
	
	

	public HotelDetails(int hotelId,String city, String name, int ratings, int cost){
		this.hotelId = hotelId;
		this.city = city;
		this.name=name;
		this.ratings=ratings;
		this.cost=cost;
	}



	
	public int compareTo(HotelDetails o) {
		if(cost == o.cost)
		
	return 0;
		else if(cost>o.cost)
			return 1;
		else 
			return -1;
	}

}
class rattingsComparator implements Comparator<HotelDetails>{
	
	public int compare(HotelDetails r1, HotelDetails r2) {
		
		
		
		if(r1.ratings>r2.ratings){
			return -1;
			
		}else if(r1.ratings<r2.ratings){
			return +1;
			
		}else{
			return 0;
		}		
	}
	
}

public class Hotel {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HotelDetails hotel1 = new HotelDetails(101,"Madurai","Sangam",5,2000);
		HotelDetails hotel2 = new HotelDetails(102,"Madurai","Fortue	",5,1800);
		HotelDetails hotel3 = new HotelDetails(104,"Madurai","Royal",4,1500);
		HotelDetails hotel4 = new HotelDetails(105,"Madurai","Paradise",4,2300);
		HotelDetails hotel5 = new HotelDetails(108,"Madurai","Astoria",5,2100);
		
		
		ArrayList<HotelDetails> hotelObj	= new ArrayList<HotelDetails>();
		hotelObj.add(hotel1);
		hotelObj.add(hotel2);
		hotelObj.add(hotel3);
		hotelObj.add(hotel4);
		hotelObj.add(hotel5);
		System.out.println("List of hotesl");
	for(HotelDetails hd : hotelObj){			
			
			System.out.println("HOTEL  :  "+hd.name +"    RATINGS  :  " + hd.ratings+"    COST  :  " +hd.cost);
			
		}



		System.out.println("Display hotel with high ratings with Low cost");
		Collections.sort(hotelObj);
		Collections.sort(hotelObj, new rattingsComparator());
		
		
		System.out.println("HOTEL  :  "+hotelObj.get(0).name +"    RATINGS  :  " + hotelObj.get(0).ratings+"    COST  :  " +hotelObj.get(0).cost);

	
	}
}
