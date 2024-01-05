package abstraction;
/*
 * final keyword is used to make any member final meaning its value or behaviour
 * cannot be changed once it is declared final
 */
class Demo1{
	final int i = 10;
	int  j = 20;
	
	public void display() {
		//i = 100;
		j = 200;
	}
}
public class FinalDemo {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//d.i = 150;
		d.j = 400;
		System.out.println(d.i+" "+d.j);
	}
}
