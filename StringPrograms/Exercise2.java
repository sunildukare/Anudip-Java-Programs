package StringPrograms;

import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		/*
		 * Count the number of vowels in the given word.
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int count = 0;
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' 
					|| word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A'
					|| word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O'
					|| word.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println("Number of vowels in "+word+" = "+count);
	}
}
