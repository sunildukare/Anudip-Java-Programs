package assignment3;
//1) Write a program to take a number from user. Check if the number is even or odd.
import java.util.Scanner;

class Check{
	public void checkNum(int num) {
		if (num%2==0) {
			System.out.println(num+" is even.");
		}
		else {
			System.out.println(num+" is odd.");
		}
	}
}

public class EvenOddApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is even or odd:");
		int num = scan.nextInt();
		Check c = new Check();
		c.checkNum(num);
	}
}
