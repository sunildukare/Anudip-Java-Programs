package fundamentals;

/*
 * Difference between instance variable and local variable:-
 * 1)   Instance variables are made directly in class
 * 		Local variables are made inside a method, constructor or block.
 * 
 * 2)   Instance variables can be accessed directly through the object of the class.
 * 		Local variables can be accessed only within its scope, We cannot directly call them from object.
 * 
 * 3)   Instance variables are given default values by the constructor.
 * 		Local variables have to be given values by us, the are not automatically assigned with default values.
 */
public class LocalVariableVsInstanceVariable {
	int rollNo;
	String name;
	double marks;
	boolean isFresher;
	
	public LocalVariableVsInstanceVariable() {
		
	}
	/*
	 * We can make constructors as private, but then We will not be able to call this constructor
	 * from outside the class.
	 */
	private LocalVariableVsInstanceVariable(String s) {
		System.out.println("This constructor cannot be accessed by other classes as it is private");
	}
	
	public void display() {
		System.out.println("Roll num: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("Is a fresher? "+isFresher);
	}
	public void show() {
		int empId;
		//	System.out.println("Employee id: "+empId);
	}
	public static void main(String[] args) {
		LocalVariableVsInstanceVariable variables = new LocalVariableVsInstanceVariable();
		variables.display();
		variables.show();
		LocalVariableVsInstanceVariable variables2 = new LocalVariableVsInstanceVariable("private");
		variables2.display();
		variables2.show();
		PrivateConstructorChecker.myMethod();
	}
}

class PrivateConstructorChecker{
	
	public static void myMethod() {
		LocalVariableVsInstanceVariable v1 = new LocalVariableVsInstanceVariable();
		v1.display();
		v1.show();
	}
	// LocalVariableVsInstanceVariable v2 = new LocalVariableVsInstanceVariable("private");
}