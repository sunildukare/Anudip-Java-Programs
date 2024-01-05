package assignment6;

// 5) Explain with programs how the access specifiers can be changed in overridden methods.
/*
 *  * Steps for method overriding:-
 * 1) make exact same method in the child class as it was in parent class.
 * 2) do not change the method name and the method parameter.
 * 3) access specifier can be changed but you cannot reduce the visibility in the child class.
 * 4) private methods are never inherited by child class, hence we cannot override private methods. We can make same 
 * 	  method will not be connected to the parent class method.
 * 
 * 
 * public 		---------------------
 * protected	------------
 * default		------
 * private		---
 * 
 * We can only increase the visibility in child class, decreasing visibility is not allowed.
 */
class WithPrivateMethod{
	// The method below is private so it will not pass to the child classes.
	private void demoMethod() {
		System.out.println("This method is private");
	}
}
class WithDefaultMethod extends WithPrivateMethod{
	void demoMethod() {
		System.out.println("This method have default access. It is not inherited from parent.");
	}
}
class WithProtectedMethod extends WithDefaultMethod{
	protected void demoMethod() {
		System.out.println("This method is overridden to have protected access");
	}
}
class WithPublicMethod extends WithProtectedMethod{
	public void demoMethod() {
		System.out.println("This method is overridden to have public access");
	}
}

class Reverse extends WithPublicMethod{
	/*
	 * void demoMethod(){
	 * System.out.println("This method returns error as We are trying to decrease the visibility
	 * from public to default");
	 */
}
public class AccessSpecifiersInOverriddenMethods {
	public static void main(String[] args) {
		
	}
}
