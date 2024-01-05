package StringPrograms;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*
		 * Take the name of user.
		 * Find out the mirror image of the given name.
		 * 
		 * James Gosling
		 * gnilsoG semaJ
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a String to reverse:");
		String str =  scan.nextLine();
		String rev = "";
		for (int i = str.length()-1; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		/*
		for (int i = 0; i<str.length();i++) {
			rev = rev+str.charAt(str.length()-1-i);
		}
		*/
		System.out.println("Original String is: "+str);
		System.out.println("Reversed String is: "+rev);
	}
}
