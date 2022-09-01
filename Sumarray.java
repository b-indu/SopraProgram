package binduyadav;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr =new int[10];
    sum(arr);
	}
	static void sum (int[] arr) {
		Scanner r= new Scanner(System.in);
		 System.out.println("Enter the element of array");
		int add = 0;
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=r.nextInt();
	         add +=arr[i];
		}
		System.out.println("The sum of array is :" +add);
		
}
}
