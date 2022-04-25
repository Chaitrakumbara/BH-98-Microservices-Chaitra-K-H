package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EvenOdd {

public static void main(String[] args) {
		
		int[] myArray= {1,2,3,4,5,6,7,8,9,10};
		
		ArrayList<Integer>evenList=new ArrayList<>();
		ArrayList<Integer>oddList=new ArrayList<>();
		
		for( int i=0;i<myArray.length;i++) 
{
			if(myArray[i]%2==0) {
			evenList.add(myArray[i]);
			}
			else
			{
			oddList.add(myArray[i]);
			}
		}
		
		Collections.sort(evenList);
		Collections.sort(oddList);
		for(int even : evenList)
			System.out.print(even+",");
		for(int odd : oddList)
			System.out.print(odd+",");
	}
	
	
}
	
	
	
	
	
	

