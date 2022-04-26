package Java8;



	import java.time.DayOfWeek;
	import java.util.Scanner;

	public class DataTimeApi {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the integer");
			int x= s.nextInt();
			if(x<=0) {
				x=x+8;
			}

			System.out.println(DayOfWeek.of(x));

		}

	}

