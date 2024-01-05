package practice;

import java.util.Scanner;

/*
 * 14) String s="Yellow Umbrella" print the count of each letter.
 * Meaning Y is present only 1 time, e is present 2 times, 
 * letter l is present 4 times etc.
 */
public class LettersCounterDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to print the count of each letter");
		String str = scan.nextLine().toLowerCase();
		
		//Method 1: Turning into char array
		System.out.println("Method 1 Result:");
		char chArr[] = str.toCharArray();
		
		for (int i=0;i<chArr.length;i++) {
			if (chArr[i]!=' ') {
				int count = 1;
				for (int j=i+1;j<chArr.length;j++) {
					if (chArr[i] == chArr[j]) {
						count++;
						chArr[j] = ' ';
					}
				}
				System.out.println(chArr[i]+": "+count);
			}
		}
		//Method2
		System.out.println("\nMethod 2 Result:");
		String countedWords = "";
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)!=' ') {
				if (!countedWords.contains(String.valueOf(str.charAt(i)))) {
					int count = 1;
					for (int j=i+1;j<str.length();j++) {
						if (str.charAt(i)==str.charAt(j)) {
							count++;
						}
						countedWords +=str.charAt(i);
					}
					System.out.println(str.charAt(i)+": "+count);
				}
			}
		}
	}
}
