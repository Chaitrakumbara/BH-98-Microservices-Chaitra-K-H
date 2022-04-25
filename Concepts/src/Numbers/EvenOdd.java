package Numbers;

import java.util.ArrayList;

public class EvenOdd {

	private static int i;

	public static void main(String[] args) {
		int[] a= {8,5,10,12,3,1,4};
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0; i<a.length; i++);
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			    al2.add(a[i]);
		}
	System.out.println("even numbers are");
	for(int no1:al1)
	{
		System.out.print(no1+" ");
	}
	System.out.println("/n total no of even numbers are : "+al2.size());
	}
	{
		
	System.out.println("odd numbers are");
	int[] al2 = null;
	for(int no2:al2)
		{
			System.out.print(no2 +" ");
		}
		System.out.println("/n total no of odd numbers are : "+al2.length);
		}
}
