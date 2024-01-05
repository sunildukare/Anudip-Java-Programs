package classAndObjects;

class Student{
	private String name;
	private int rollNo;
	private float percentage;
	private String department;
	
	
	public Student(String name, int rollNo, float percentage, String department) {
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
		this.department = department;
	}
	public void studentDetails(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Percentage: "+percentage);
		System.out.println("Department: "+department+"\n");
	}
}
public class PojoStudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Akash", 1, 79f,"Civil");
		Student s2 = new Student("Vishal", 2, 59.3f, "Mechanical");
		Student s3 = new Student("Sayali", 3, 74.4f, "Computer Science");
		Student s4 = new Student("Chetana", 4, 89.2f, "Information Technology");
		s1.studentDetails();
		s2.studentDetails();
		s3.studentDetails();
		s4.studentDetails();
	}
}
