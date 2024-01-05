package arrays;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		/*
		 * Arrays is a pre-defined class used to manipulate the members of an array.
		 * In this class all methods are static.
		 */
		
		int arr[] = {80,2,61,12,100};
		/*
		 * sort is a static method so We can call it with just class name.
		 */
		Arrays.sort(arr);
		
		System.out.println("Elements in arr sorted in ascending order:");
		for (int i: arr)
			System.out.print(i+" ");
		
		System.out.println("\nNumber 61 is at index: "+Arrays.binarySearch(arr, 61));
		/*
		 * toString is an easy way of printing the members of an array without using loops
		 */
		System.out.println("Elements of arr: "+Arrays.toString(arr));
	}
}
