package classAndObjects;

import java.util.Scanner;

public class TriangleAreaApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base of triangle: ");
		float base = scan.nextInt();
		System.out.println("Enter height of triangle: ");
		float height = scan.nextInt();
		
		System.out.println("Area of triangle is: "+findArea(base, height));
	}
	static float findArea(float base, float height) {
		return 0.5f*base*height;
	}
}
