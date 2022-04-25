package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Crcard{
	
	public static void main(String[] args) {
		
		Map<Creditcard, Customer> mymap = new LinkedHashMap<>();
		mymap.put(new Creditcard("Chaitra", 455, 2024), new Customer("Chaitra", 444));
		mymap.put(new Creditcard("Halashree", 155, 2023), new Customer("Halashree", 123));
		mymap.put(new Creditcard("Sanu", 231, 2019), new Customer("Sanu", 146));
		
		ArrayList<Integer> list = new ArrayList<>();
	       for (Map.Entry<Creditcard, Customer> entry : mymap.entrySet()) {
	    	   list.add(entry.getKey().getExpirydate());
	       }
	       
	       Collections.sort(list);
	       LinkedHashMap<Creditcard, Customer> sortedMap = new LinkedHashMap<>();
	       for (int num : list) {
	    	   for(Map.Entry<Creditcard, Customer> entry : mymap.entrySet()) {
	    		   if (entry.getKey().getExpirydate()==num) {
	    			  sortedMap.put(entry.getKey(),entry.getValue()); 
	    		   }
	    	   }
	       }
	}
	}
	
