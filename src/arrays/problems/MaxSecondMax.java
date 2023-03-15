package arrays.problems;

import java.util.ArrayList;

public class MaxSecondMax {

	public static ArrayList<Integer> findMaxSecondMax(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int j : array) {
			if (largest < j) largest = j;
		}
		for (int j : array) {
			if (largest != j)
				secondLargest = Math.max ( secondLargest, j );
		}
		arrayList.add ( largest );
		if (secondLargest == Integer.MIN_VALUE) secondLargest = -1;
		arrayList.add ( secondLargest );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( findMaxSecondMax ( new int[]{2, 1, 2} ) ); // 2 1
		System.out.println ( findMaxSecondMax ( new int[]{1, 2, 3, 4, 5} ) ); // 5 4
		System.out.println ( findMaxSecondMax ( new int[]{10, 10, 10, 10, 10, 10} ) ); // 10 -1
	}
}
