package arrays;

import java.util.Scanner;

public class Exercise1 {
	/*
	 * Create an array of int type of size 5. Take user input to add data into this array. Print only the
	 * even members of the array.
	 */
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<nums.length;i++) {
			System.out.println("Enter an Integer at element "+(i+1));
			nums[i] = scan.nextInt();
		}
		System.out.println("\nPrinting even numbers in the array: ");
		for (int i=0;i<nums.length;i++) {
			if (nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
		
	}
}
