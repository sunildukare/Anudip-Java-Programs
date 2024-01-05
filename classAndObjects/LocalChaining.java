package classAndObjects;

class ThisDemo{
	int rollNo;
	String name;
	
	ThisDemo(){
		this(100, "Rajani");
		System.out.println("We are in the non-parameterized constructor.");
	}
	ThisDemo(int rollNo){
		this.rollNo = rollNo;
		System.out.println("We are in a single parameterized constructor.");
	}
	ThisDemo(int rollNo, String name){
		this(20);
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("We are in double parameterized constructor.");
	}
	public void display() {
		System.out.println("This is display method...");
	}
	public void show() {
		System.out.println("This is show method...");
		this.display(); //or just display();
	}
}

public class LocalChaining {
	public static void main(String[] args) {
		/*
		 * Definition:-
		 * this keyword represents the current class object.
		 * 
		 * Meaning We are representing the object of the class in which We are writing this keyword.
		 * 
		 * this keyword uses:-
		 * 1) To differentiate between local variable and instance variables.
		 * 2) To call one constructor from another constructor within the same class.
		 * 
		 * Point to remember when using this for constructor call:
		 * a) A constructor can call only one other constructor, meaning We cannot call multiple constructors
		 * from inside one single constructor.
		 * 
		 * b) The constructor call should be the first line of code in the constructor.
		 * 
		 * c) We cannot call constructor in a way that two constructors are calling each other.
		 * 
		 * 3) We can also pass the current class object in any method or constructor using this keyword.
		 * 
		 * 4) We can also call the same class method using this keyword.
		 */
		ThisDemo td = new ThisDemo();
		System.out.println(td.rollNo+" "+td.name);
		td.show();
	}
}
