package inheritance;

/*
 * Inheritance is the process of inheriting the members of another class into our own class.
 * This is done by making our class the child/sub class of another.
 * 
 * extends is a keyword used to make our class a child class of some other class.
 * Note:-
 * extends keyword can be followed by only one class name.
 * Meaning We can make only one class as our parent class. We cannot make multiple classes
 * as parent. Therefore multiple inheritance is not allowed in Java.
 * 
 * Parent class is also known as base class or super class
 * Child class is also known as derived class or sub class
 * 
 * Types of inheritance:-
 * 1) Single Inheritance:- One parent and one child class
 * 2) Multi-level Inheritance:- One parent has one child class and this child class
 * is parent to another child
 */
class MobileApp{
	public void textMessage() {
		System.out.println("Sending text message...");
	}
	public void voiceCall() {
		System.out.println("Voice call connecting...");
	}
}
class MyApp extends MobileApp{
	public void videoCall() {
		System.out.println("Video call starting...");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		MyApp my = new MyApp();
		my.textMessage();
		my.voiceCall();
		my.videoCall();
	}
}
