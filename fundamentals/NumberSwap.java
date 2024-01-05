package fundamentals;

import java.util.Scanner;

public class NumberSwap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scan.nextInt();
		System.out.println("Enter second number:");
		int b = scan.nextInt();
		
		System.out.println("a before swapping: "+a);
		System.out.println("b before swapping: "+b);
			// Assume a = 8 and b = 5
		a = a+b;	//a = 8+5 = 13
		b = a-b;	//b = 13-5 = 8;
		a = a-b;	//a = 13-8;
		System.out.println("a after swapping: "+a);
		System.out.println("b after swapping "+b);
		
	}
}
