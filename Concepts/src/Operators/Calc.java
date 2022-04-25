package Operators;

import java.util.Scanner;

class Calculator{
	int a,b;
	Calculator(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	int add() { return a+b; }
	int sub() { return a-b; }
	int mul() { return a*b; }
	int div() { return a/b; }
}

public class Calc { 
	 public static void main(String[] args) {
		 
		 try (Scanner sr = new Scanner (System.in)) {
			System.out.print("Enter a : ");
			  int a=sr.nextInt();
			  System.out.print("Enter b : "); 
			  int b=sr.nextInt();
			  System.out.print("Enter the operation (+,-,*,/) : ");
			  String op=sr.next();
			  int c=0;
			  Calculator obj=new Calculator(a,b);
			  switch(op) {
			  case "+": c=obj.add(); break;
			  case "-": c=obj.sub(); break;
			  case "*": c=obj.mul(); break;
			  case "/": c=obj.div(); break;
			  
			  default: System.out.println("Invalid operation code!");
			  }	 
			  System.out.println(a + op + b + "=" + c);
		}
	 }
}
