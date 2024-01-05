package arrays;

import java.util.Scanner;

public class ArrayEx2 {
	/*
	 * Write a program to store all the names of the students in an array.
	 * 
	 * Print all the members of this array.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		String names[] = new String[scan.nextInt()];
		scan.nextLine();
		for (int i=0;i<names.length;i++) {
			System.out.println("Enter name "+(i+1));
			names[i] = scan.nextLine();
		}
		System.out.println("\nPrinting all the names of students:");
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
}
