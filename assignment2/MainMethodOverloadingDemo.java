package assignment5;

 //5) Write a program to show if main method can be overloaded or not.
 
public class MainMethodOverloadingDemo {
	
	public static void main(int[] args) {
		System.out.println("2");
	}
	public static void main(String[] args, int[] args2) {
		System.out.println("3");
	}
	public static void main(String[] args) {
		System.out.println("1");
	}
	/*
	 * When We compile and execute this code, We come to the conclusion that the main method can be overloaded.
	 * However, only the main method with the String[] args as parameter gets executed by default.
	 * If We try to execute other main method by any means or way (eg. by removing String[] args method or by
	 * using Command line prompt) the following error is shown -
	 * Error: Main method not found in class assignment5.MainMethodOverloadingDemo, please define the main method as:
   	 * public static void main(String[] args)
	 * or a JavaFX application class must extend javafx.application.Application
	 */
	 
}
