package inheritance;

class Employee2 {
	int empId;
	String company;
	
	public void markAttendance() {
		System.out.println("Your attendance has been marked");
	}
}
	
	class Programmer extends Employee2{
		String category;
		public void coding() {
			System.out.println("The programmer is coding as a "+category+" programmer");
		}
	}
	class JavaDeveloper extends Programmer{
		String designation;
		String project;
		
		public void usingHibernate() {
			System.out.println("Java developer is using Hibernate to create application...");
		}
		//	Alt + Shift + S
		@Override
		public String toString() {
			return "JavaDeveloper [designation=" + designation + ", project=" + project + ", category=" + category
					+ ", empId=" + empId + ", company=" + company + "]";
		}
		
	}

public class MultilevelInheritance {
	public static void main(String[] args) {
		JavaDeveloper jd = new JavaDeveloper();
		jd.empId = 101;
		jd.company = "Accenture";
		jd.category = "Junior";
		jd.designation = "Intern";
		jd.project = "ChaiGPT";
		
		jd.markAttendance();
		jd.coding();
		jd.usingHibernate();
		
		System.out.println("Printing the details of this Java developer");
		System.out.println(jd);
	}
}
