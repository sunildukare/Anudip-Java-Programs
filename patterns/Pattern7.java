package patterns;

public class Pattern7 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=6;j++){
				if (j%2==0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
				// System.out.print((j%2==0)?"#":"*");
			}
			System.out.println();
		}
	}
}
