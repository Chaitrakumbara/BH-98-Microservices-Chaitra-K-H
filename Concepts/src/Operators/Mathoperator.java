package Operators;

import java.util.Scanner;

class Asmd{
	
	int num1;
	int num2;
	int result;
	
	Asmd(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void add() {
		result=num1+num2;
		System.out.println("\n Sum of two integer values is = " + result);
	}

	public void sub() {
		result=num1-num2;
		System.out.println("\n Sub of two integer values is = " + result);
	}

	public void mul() {
		result=num1*num2;
		System.out.println("\n Mul of two integer values is = " + result);
	}

	public void div() {
		result=num1/num2;
		System.out.println("\n Div of two integer values is = " + result);
	}
	}
		
public class Mathoperator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n  enter the first value : ");
		int num1=sc.nextInt();
	
		System.out.println("\n  enter the second value : ");
		int num2=sc.nextInt();

		Asmd st =new Asmd(num1,num2);
		st.add();
		st.sub();
		st.mul();
		st.div();
	}

}
