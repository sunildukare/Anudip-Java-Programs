package arrays;

public class Sort {
	public static void main(String[] args) {
		int a[] = {80,2,61,12,100};
		
		for (int i=0;i<a.length;i++) {
			int num1 = a[i];
			for (int j=i+1;j<a.length;j++) {
				int num2 = a[j];
				
				if(num1>num2) {
					a[i] = num2;
					a[j] = num1;
					num1 = a[i]; //num1 = num2;
				}
			}
		}
		for (int x: a) {
			System.out.print(x+" ");
		}
	}
}
