package binduyadav;
import java.util.Scanner;
public class Value {
	public static void main(String[] args) {
	  Scanner r = new Scanner(System.in);
	  System.out.println("Enter the first number");
	  int num1= r.nextInt();
	  System.out.println("Enter the second number:");
	  int num2 =r.nextInt();
	  System.out.println("Sum of two number :" +sum(num1,num2) );
	  }
	     static int sum(int a,int b) {
	    	return a+b;
	   	 
	     }

}
