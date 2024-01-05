package abstraction;

abstract class Employee{
	int empId;
	String empName;
	
	public Employee(){
		System.out.println();
	}
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void attendance() {
		System.out.println("The attendance is marked!!!");
	}
	abstract public double salaryCalc(String employeeType);
}

class Developer extends Employee{
	public Developer(int empId,String empName) {
		super(empId, empName);
	}
	@Override
	public double salaryCalc(String employeeType) {
		if(employeeType.equals("permanent")) {
			return 50000;
		}
		return 25000;
	}
	
}

public class Example2 {
	public static void main(String[] args) {
		Developer d = new Developer(1, "permanent");
	}
}
