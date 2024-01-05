package assignment3;
//2) Write a program to take a number from user. Check if the number is positive or negative.
import java.util.Scanner;

class PositiveNegativeChecker {
	public String checkNumber(int num) {
		if (num>0) {
			return num+" is positive.";
		}
		else if (num<0) {
			return num+" is negative.";
		}
		return num+" is zero.";
	}
}

public class PositiveNegativeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		PositiveNegativeChecker ch = new PositiveNegativeChecker();
		String res = ch.checkNumber(num);
		System.out.println(res);
	}
}
