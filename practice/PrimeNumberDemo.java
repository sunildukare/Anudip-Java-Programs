package practice;
import java.util.Scanner;

/*
 * 7) Write a program to find if the given number is prime number or not.
 */

class PrimeChecker{
	public boolean isPrime(int num) {
		if (num<2) {
			return false;
		} else if (num==2) {
			return true;
		} else {
			for (int i=2;i<num;i++) {
				if (num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
public class PrimeNumberDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is prime or not");
		int num = scan.nextInt();
		PrimeChecker checker = new PrimeChecker();
		System.out.println(checker.isPrime(num));
	}
}
