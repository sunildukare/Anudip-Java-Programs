package arrays;

public class Exercise2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		/*
		 * Create a new int type array b of size 5.
		 * The members should be double of the member in array a.
		 * b = {2,4,6,8,10};
		 */
		int[] b = new int[5];

		System.out.println("Elements of Array b:");
		for (int i=0;i<b.length;i++) {
			b[i] = a[i]*2;
			System.out.print(b[i]+" ");
		}
	}
}
