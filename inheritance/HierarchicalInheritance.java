package inheritance;

/*
 * Hierarchical inheritance is another type of inheritance where one class has many child
 * class. As seen below Honda class has two child class Activa and City.
 * 
 * Both the child classes will inherit the logo from Honda, but there is no connection or
 * relation between Activa and City.
 */
class Honda{
	String logo="Honda";
}

class Activa extends Honda{
	public void kickStart() {
		System.out.println("Bike starting after kick start");
	}
}

class City extends Honda{
	public void reverse() {
		System.out.println("Car is reversing...");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		City obj = new City();
		System.out.println("Logo of City:- "+obj.logo);
		System.out.println();
		Activa a = new Activa();
		a.kickStart();
		System.out.println("\nLogo of Activa:-"+a.logo);
	}
}
