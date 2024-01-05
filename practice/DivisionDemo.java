package practice;

import java.util.Scanner;
/*
 * 3) Write a program where a number is taken from user.
 * Find if the number is divisible by 5 and 7.
 */
class Divide{
	public boolean divideby5(int num) {
		return num%5==0;
	}
	public boolean divideby7(int num) {
		return num%7==0;
	}
}
public class DivisionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is divisible by 5 and 7");
		int number = scan.nextInt();
		Divide div = new Divide();
		if (div.divideby5(number)) {
			System.out.println(number+" is divisible by 5.");
		} else {
			System.out.println(number+" is not divisible by 5.");
		}
		if (div.divideby7(number)) {
			System.out.println(number+" is divisible by 7.");
		} else {
			System.out.println(number+" is not divisible by 7.");
		}
	}
}
