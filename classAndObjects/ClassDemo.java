package classAndObjects;
/*
 * class is the template to write our code
 * class is the blue print of an object
 * class is a group of member variables, methods and objects
 * 
 * Object is the real life entity of a class. It has proper memory allocated for different
 * variables and methods etc.
 * Object is created with new keyword and then calling the constructor
 * 
 * Constructor is a special method used to create object
 * Syntax of Constructor: -
 * accessSpecifier className(parameters){}
 * A class can have more than one constructor.
 */

import java.util.Scanner;

public class ClassDemo {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassDemo cd = new ClassDemo();
		String b = "Dhananjay";
	}
	public ClassDemo() {
		System.out.println("I am the constructor of this class.");
	}
}