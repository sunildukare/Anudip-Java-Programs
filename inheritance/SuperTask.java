package inheritance;
/*
 * Create a parent class Vehicle having three constructors.
 * Create its child class Car which also should have two constructors.
 * Demonstrate how will you call parent constructor from Car class.
 */
class Vehicle{
	public Vehicle() {
		System.out.println("Entered into Vehicle class with zero parameterized constructor.");
	}
	public Vehicle(String name) {
		System.out.println("Entered into Vehicle with name: "+name);
	}
	public Vehicle(String name, int cost) {
		System.out.println("Entered into Vehicle with name: "+name+", cost: "+cost);
	}
}
class Car extends Vehicle{
	public Car() {
		super("Lamborghini");
		System.out.println("Entered into Class Car with zero parameterized constructor.");
	}
	public Car(String name) {
		super("Maruti",2000000);
		System.out.println("Entered into Class Car with name: "+name);
		}
	}
public class SuperTask {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Alto");
	}
}
