package binduyadav;

import java.util.Arrays;
import java.util.Scanner;

public class LineraSearch {
	public static void main(String[] args) {
	
		// taking input by user
		
		Scanner r = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the element of the array");
		for(int i = 0; i<arr.length ;i++)
		{
		     arr[i] = r.nextInt();	
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element which you want to search:");
		int element = r.nextInt();
		System.out.println("element is :" +element);
		// calling the  function
		int result = search(arr,element);
		if(result == -1 ) {
			System.out.println("Element is not found at position");
		}
		else
		{
			System.out.println("Element is found at position " +result);
		}
	
  }
	
	static int search(int[] arr ,int num)
	{
		for(int  i = 0 ;i<arr.length ;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
