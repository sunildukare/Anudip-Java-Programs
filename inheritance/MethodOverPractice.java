package inheritance;
/*
 * Create a class Student which has instance variable rollNo and name.
 * student class has a method attendSession which prints "Student is attending the session."
 * Create a child class studentName; 
 * when we call attendSession from studentName class is should specify that the student is attending online.
 */

class Student{
	
	String name;
	int rollNo;
	
	public void attendSession() {
		
		System.out.println("Student is attending the session.");
	}
}
class Aishwarya extends Student{
	
	public void attendSession() {
		super.attendSession();
		System.out.println("Student is attending Online.");
	}
	
}
public class MethodOverPractice {

	public static void main(String[] args) {
		Student s=new Student();
		Aishwarya a=new Aishwarya();
		a.attendSession();
	}

}
