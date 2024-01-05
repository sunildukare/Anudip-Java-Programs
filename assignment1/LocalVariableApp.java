package assignment2;

public class LocalVariableApp {
	public static void main(String[] args) {
		//	System.out.println(num); --> Shows error as local variable num cannot be accessed from outside the method.
	}
	public static void displayLV() {
		int num = 5;
		System.out.println("Here num is a local variable with value = "+num);
	}
}
