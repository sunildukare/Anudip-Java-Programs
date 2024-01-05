package arrays;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * Create an array of int type size 5. Take user input to add data in the array.
		 * Now sort the array in ascending order.
		 * 
		 * int[] a = {80,2,61,12,100};
		 * a={2,12,61,80,100};
		 */
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		//Taking array elements from the user
		for (int i=0;i<arr.length;i++) {
			System.out.print("Enter integer element "+(i+1)+": ");
			arr[i] = scan.nextInt();
		}
		
		//Printing array elements as it is
		System.out.println("Array before sorting: ");
		for (int x: arr) {
			System.out.print(x+" ");
		}
		
		//Sorting the array elements in ascending order
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}
			}
		}
		
		//Array elements after sorting
		System.out.println("\n\nArray after sorting:");
		for (int x: arr) {
			System.out.print(x+" ");
		}
	}
}
