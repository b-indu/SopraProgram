package binduyadav;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,34,56,67,78};
		Scanner  r = new Scanner(System.in);
		sum(arr);
	}
	static void sum( int[] arr) {
		int add =0;
		for(int i = 0;i<arr.length;i++) {
			 add +=arr[i];
		}
		System.out.println("The sum of array is:" +add);
		   
	}

}
