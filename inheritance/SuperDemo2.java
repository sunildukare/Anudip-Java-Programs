package inheritance;
/*
 * Points to remember:-
 * 1) Constructors are never inherited from parent to child.
 * 2) When the object of child class is created, then always the non-parameterized constructor
 * of the parent is called.
 * 3) In parent class if We do not make any constructor then compiler creates a
 * non-parameterized constructor in it. But if We as coders are going to create constructor
 * in Parent class then always remember to make non-parameterized constructor also.
 * 4) We can call any constructor of parent from the constructor of child by using super
 * keyword.
 * 5) We can call parent constructor only once inside the constructor of child.
 * 6) Parent constructor call should be the first line of code in the child constructor.
 */
class Garden{
	public Garden() {
		System.out.println("This is the zero parameter constructor.");
	}
	public Garden(String city) {
		System.out.println("This is the Garden in the city "+city);
	}
}
class Plant extends Garden{
	public Plant() {
		super("Mumbai");
		System.out.println("This is the zero parameter constructor of Plant.");
	}
	public Plant(String name) {
		super("Pune");
		System.out.println("Ths is the "+name+" plant.");
	}
}
public class SuperDemo2 {
	public static void main(String[] args) {
		Plant p = new Plant();
		Plant p2 = new Plant("Lily");
		
	}
}
