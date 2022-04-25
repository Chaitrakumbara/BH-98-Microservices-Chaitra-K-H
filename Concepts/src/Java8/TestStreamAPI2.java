package Java8;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("Rajesh","Suraj","Tom");
		List<String> list2 = Arrays.asList("Sharma","Patel","Naik");
		
		for (String i : list2) 
		{
			
			list1.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));
		
	}

	
	}

}
