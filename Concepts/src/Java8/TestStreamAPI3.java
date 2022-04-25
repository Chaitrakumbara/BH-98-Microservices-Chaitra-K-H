package Java8;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		List<String> mylist1 = Arrays.asList("Rajesh", "Irshad", "Tom", "Rahul");
		for (String str : mylist1) {
			str.chars().filter(x -> "AEIOUaeiou".indexOf(x) != -1).forEach(y -> System.out.println((char) y));
		}

	}

	
	
}
