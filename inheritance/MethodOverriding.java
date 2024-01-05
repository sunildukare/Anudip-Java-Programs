package inheritance;
/*
 * Method Overriding is the process of changing the behaviour of the inherited method in the child object.
 * 
 * Method overriding is a type of Polymorphism.
 * 
 * Polymorphism is same name different behaviour. Poly meaning many, morph meaning form.
 * Types of Polymorphism:-
 * 1) Method overrriding
 * 2) Method overloading
 * 
 * Steps for method overriding:-
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
class Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by post....");
	}
	protected void display() {
		
		System.out.println("Hello everyone!!!");	
	}
	private void show() {
		
		System.out.println("This is the first day of the week.");
	}
}
class Child extends Parent{
	
	public void sendResume(String s) {
		
		System.out.println("Sending resume by email....");
	}
	/*
	 * in display we are overriding the inherited display method.
	 * here we have changed the access specifier from protected to public, this is allowed since we are increasing 
	 * the visibility in child class.
	 */
	public void display() {
		
		System.out.println("Welcome everyone!!!");
	}
	/*
	 * Below given show method will be considered as a completely new method of child class. It is not considered as
	 * an overridden method.
	 */
	public void show() {
		
		System.out.println("Today is Monday!!");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.sendResume();
		c.sendResume("Anudip");
		c.display();
		c.show();
	}

}
