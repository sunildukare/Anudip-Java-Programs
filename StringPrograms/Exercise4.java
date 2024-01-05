package StringPrograms;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * Take any word form user and print it in the following pattern-
		 * Example:- James
		 * 
		 * James
		 * Jame
		 * Jam
		 * Ja
		 * J
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();
		for (int i=0;i<word.length();i++) {
			for (int j=0;j<word.length()-i;j++) {
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}
}
