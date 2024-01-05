package practice;

import java.util.Scanner;

/*
 * 13) Take any word from user, check if that is a palindrome or not.
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check if it's palindrome or not:");
		String str = scan.next().toLowerCase();
		System.out.println(isPalindromeMethod1(str));
		System.out.println(isPalindromeMethod2(str));
	}
	public static boolean isPalindromeMethod1(String str) {
		if (str.length()%2==1) {
			for (int i=0;i<str.length()/2+1;i++) {
				if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static boolean isPalindromeMethod2(String str) {
		String rev = "";
		for (int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		return (str.equals(rev));
	}
}
