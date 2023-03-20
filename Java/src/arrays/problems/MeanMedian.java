package arrays.problems;

import java.util.Arrays;

public class MeanMedian {

	public static int mean(int[] array, int n) {
		int sum = 0;
		for (int j : array) sum += j;
		return sum / array.length;
	}

	public static int median(int[] array, int n) {
		Arrays.sort ( array );
		int med;
		if (array.length % 2 == 0) {
			med = (int) Math.floor ( (array[ array.length / 2 - 1 ] + array[ array.length / 2 ]) / 2 );
		} else {
			med = array[ array.length / 2 ];
		}
		return med;
	}

	public static void main(String[] args) {
		System.out.println ( mean ( new int[]{2, 8, 3, 4}, 4 ) );   // 4
		System.out.println ( median ( new int[]{2, 8, 3, 4}, 4 ) ); // 3
		System.out.println ( mean ( new int[]{1, 2, 19, 28, 5}, 4 ) ); // 11
		System.out.println ( median ( new int[]{1, 2, 19, 28, 5}, 4 ) ); // 5
	}
}
