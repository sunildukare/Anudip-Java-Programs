package StringPrograms;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * Take any word from the user.
		 * Create a unique password from it where all
		 * a --> @
		 * e --> 3
		 * i --> 1
		 * o --> *
		 * u --> $
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.next().toLowerCase();
		word = word.replace('a','@');
		word = word.replace('e','3');
		word = word.replace('i','1');
		word = word.replace('o','*');
		word = word.replace('p','$');
		System.out.println("The generated password is: "+word);
	}
}
