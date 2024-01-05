package patterns;

public class Pattern6 {
	public static void main(String[] args) {
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if (i%2==1) {
					System.out.print("*");
				} 
				else {
					System.out.print("#");
				}
				//	System.out.print((i%2==0)?"#":"*");
			}
			System.out.println();
		}
	}
}
