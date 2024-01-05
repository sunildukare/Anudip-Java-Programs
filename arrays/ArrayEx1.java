package arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
		/*
		 * Array is an object of fixed size used to store a group of objects or values of the same datatype.
		 * 
		 * Points to remember:-
		 * 1) Size is fixed. We cannot add more than size at runtime.
		 * 2) Arrays accept all data of the same datatype.
		 * 3) All members have indexes starting from 0 to length-1.
		 * 4) We add and retrieve members by using its indexes.
		 */
		
		int rollNum = 10;
		int[] allRollNum = new int[5];
		
		allRollNum[0] = 100;
		allRollNum[1] = 501;
		allRollNum[2] = 12;
		allRollNum[3] = 45;
		allRollNum[4] = 70;
		
		System.out.println(rollNum);
		System.out.println(allRollNum[0]);
		System.out.println(allRollNum[1]);
		System.out.println(allRollNum[2]);
		System.out.println(allRollNum[3]);
		System.out.println(allRollNum[4]);
		
		for (int i=0;i<allRollNum.length;i++) {
			System.out.println(allRollNum[i]);
		}
	}
}
