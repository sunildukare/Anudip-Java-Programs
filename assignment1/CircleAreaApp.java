package assignment2;

import java.util.Scanner;

/*
 * 1. Create a method which will calculate the area of circle. Take the radius from user.
 * 3.14 * r *r
 */
public class CircleAreaApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r = scan.nextDouble();
		double area = findArea(r);
		System.out.println("Area of circle = "+area+" units");
	}
	
	public static double findArea(double r) {
		return 3.14*r*r;
	}
}
