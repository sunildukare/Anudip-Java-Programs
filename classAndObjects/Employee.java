package classAndObjects;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private double salary;
	
	/*
	 * Below We have created non-parameterized constructor which We will use to crate empty
	 * Employee object.
	 */
	public Employee() {
		
	}
	/*
	 * Below We have created parameterized constructor used to set all values of the employee
	 * in its object at one go.
	 */
	public Employee(int empId, String name, String designation, double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * toString method returns the String representation of the object.
	 * 
	 * Syntax:-
	 * public String toString(){
	 * return "";
	 * }
	 * 
	 * As seen below toString method is used to fetch/get all the data
	 * in all variables together.
	 * Whenever We print the reference variable of an object toString method is automatically
	 * called and We will be able to see all the data stored in the object.
	 * Example:-
	 * Employee e2 = new Employee();
	 * Here e2 is the reference variable of the Employee object. Now We will print e2
	 * System.out.println(e2);
	 * 
	 * Now automatically toString() method will be called and We will be able to see all
	 * the details on our console.
	 */
	public String toString() {
		return "Id= "+empId+"\nName= "+name+"\nDesignation= "+designation+"\nSalary= "+salary;
	}
}
