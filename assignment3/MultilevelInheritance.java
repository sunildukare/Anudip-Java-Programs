package assignment6;

// 3) Write a program to demonstrate multilevel inheritance

class Student{
	int id;
	String name;
	String college;
	String university;
	int marks;
	public Student(int id, String name, String college, String university, int marks) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.university = university;
		this.marks = marks;
	}
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", college=" + college + ", university=" + university
				+ ", marks=" + marks;
	}
	
}
class EnggStudent extends Student{
	String department = "Engineering";
	public EnggStudent(int id, String name, String college, String university, int marks) {
		super(id, name, college, university, marks);
	}
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", college=" + college
				+ ", university=" + university + ", marks=" + marks + ", department=" + department;
	}
	
}
class CivilStudent extends Student{
	String department = "Civil Engineering";
	public CivilStudent(int id, String name, String college, String university, int marks) {
		super(id, name, college, university, marks);
	}
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", college=" + college
				+ ", university=" + university + ", marks=" + marks + ", department=" + department;
	}
	
}
class DivAStudent extends CivilStudent{
	char division = 'A';
	public DivAStudent(int id, String name, String college, String university, int marks) {
		super(id, name, college, university, marks);
	}
	public String toString() {
		return "Student id=" + id + ", name=" + name
				+ ", college=" + college + ", university=" + university + ", marks=" + marks 
				+ ", department=" + department + ", division="+division;
	}
	
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Student st = new Student(1,"Sahil","KKWG","SPPU",80);
		EnggStudent est = new EnggStudent(2,"Mohit","MET","SPPU",84);
		CivilStudent cst = new CivilStudent(3,"Akash","MCOERC","SPPU",88);
		DivAStudent dst = new DivAStudent(4,"Mohini","COEP","SPPU",92);
		
		System.out.println(st+"\n");
		System.out.println(est+"\n");
		System.out.println(cst+"\n");
		System.out.println(dst+"\n");
	}
}
