package Java8;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class TestStreamAPI {
	
	public static void main(String [] args) {
		List<String> mylist1 = Arrays.asList("Rajesh","Suraj","Tom");
		List<String> mylist2 = Arrays.asList("Sharma");
		
		for(String i : mylist2) {
			mylist1.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));
		}
	}
		}
		
		
		/*  String str = liststr.stream().collect(Collectors.joining("Sharma, ")); 
	        System.out.println(str.toString());
	}
}*/
		
		
		
		
		 
		
		
	/*	List<String> list2 = Arrays.asList("Sharma");
		
		List<String> mergedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println("Final merged list values are ");
		mergedList.forEach(finalValue -> System.out.println(finalValue));
	}

	
	}*/


