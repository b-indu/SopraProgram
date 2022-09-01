package binduyadav;

import java.util.Scanner;

public class eVEN {
	public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	System.out.println("Enter the any number:");
	int num1 = r.nextInt();
	  even(num1);//method call/fun call
	  odd(num1);
	}
	static void even(int a) {
		if(a%2==0) {
		 System.out.println("this number is even :" +a);
		}
		else
		{
			System.out.println("The number is not even :" +a);
		}
	}
	  static void odd(int b) {
		  if(b%2!=0) {
			  System.out.println("The number is odd number :" +b);
		  }
		  else {
			  System.out.println("The number is not odd number :" +b);
		  }
	  }

}
