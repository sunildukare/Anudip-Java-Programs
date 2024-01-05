package assignment5;
/*
 * 4)  Create a Car class with instance variables carId, engineType, color, brand. 
 * 	Create toString in this class. Write the need and use of toString method.
 */

/*
 * Ans:
 * toString() is required to print the details of the object whenever the reference of an object is called.
 * If the user has defined the toString() method by himself, whenever the user tries to print the object,
 * the details of the object will get printed as mentioned in the toString() method.
 * Syntax of toString() method is as follows -
 * public String toString(){
 * return "contents here";
 * }
 */
class Car{
	int carId;
	String engineType;
	String color;
	String brand;
	
	public String toString() {
		return "carId: " + carId + "\n engineType: " + engineType + "\n color=" + color + "\n brand=" + brand;
	}
	
}
public class CarDemo {
	public static void main(String[] args) {
		Car c = new Car();
		c.carId = 2726;
		c.engineType = "V8 Engine";
		c.color = "Persian Blue";
		c.brand = "Porsche GT";
		//Normally We make a method to print details of an object as shown below -
		System.out.println(c.toString());
		System.out.println();
		// But toString() is a special method which gets called when the user/programmer tries to print the object.
		// By default toString() will print the reference of an object. So the programmer has to define the method as per requirement.
		System.out.println(c);
	}
}
