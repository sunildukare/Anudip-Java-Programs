package practicals;
/*
 * Write a program where a car can run on different types of fuels
 * Example petrol and CNG
 */
class Fuel{
	
	public void engine_fuel(char c) {
		
		System.out.println("This vehicle is diesel type.");
	}
	public void engine_fuel(int i) {
		
		System.out.println("This vehicle is Petrol type.");
	}
	public void engine_fuel(double d) {
	
		System.out.println("This vehicle is CNG type.");
	}
	public void engine_fuel(String s) {
		
		System.out.println("This electric vehicle.");
	}
}
public class MethodOverloadingPractice {

	public static void main(String[] args) {
		
		Fuel f=new Fuel();
		f.engine_fuel("Chetak");
	}

}
