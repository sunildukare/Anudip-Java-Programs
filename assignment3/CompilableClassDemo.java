package assignment6;

// 1) Write a program to show Compilable class

/*
 * A compilable class is the class which can be compiled but not executed by its own
 * as it does not have a main method in it.
 */
public class CompilableClassDemo {
	int compilerCode = 1;
	String compilerMsg = "This is a compilable class";
	
	public void compile() {
		System.out.println("The class is getting compiled.");
	}
	public int error() {
		System.out.println("Error in compilation.");
		return -1;
	}
	public String sayHello(String name){
		return "Hello "+name;
	}
}
