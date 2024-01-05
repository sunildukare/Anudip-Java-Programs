package classAndObjects;

public class ConstructorDemo1 {
	
	public ConstructorDemo1() {
		System.out.println("This is a non-parameterized constructor.");
	}
	public ConstructorDemo1(String s) {
		System.out.println("The string data given is: "+s);
	}
	public ConstructorDemo1(String s, int i) {
		System.out.println("This constructor has two parameters");;
		System.out.println("String data: "+s+"\nint data: "+i);
	}
	
	public static void main(String[] args) {
		/*
		 * We can make more than one object of the same class.
		 * It is our wish how We want to create the object, We can use any of the constructors.
		 * available to us to make project.
		 */
		ConstructorDemo1 c1 = new ConstructorDemo1();
		ConstructorDemo1 c2 = new ConstructorDemo1("Anudip");
		ConstructorDemo1 c3 = new ConstructorDemo1("Anudip",1000);
	}

}
