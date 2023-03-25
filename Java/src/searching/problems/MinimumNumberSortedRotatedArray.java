package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/minimum-number-in-a-sorted-rotated-array-1587115620
public class MinimumNumberSortedRotatedArray {

	public static int minNumber(int[] array, int low, int high, int target) {
		int min = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[ low ] < min) min = array[ low ];
			if (array[ low ] <= array[ mid ]) low = mid + 1;
			else high = mid - 1;
			if (min > array[ mid ]) min = array[ mid ];
			System.out.println ( "min = " + min );
		}
		return min;

		/**
		 * Testcase Dry Run --> {2, 3, 4, 5, 6, 7, 8, 9, 10, 1}
		 *                       0  1  2  3  4  5  6  7  8   9
		 * low = 0, high = 9, mid = 4
		 * arr[0] < Integer.MAX_VALUE ==> true, min = arr[0] = 2
		 * arr[0] <= arr[4] ==> true, low = 5
		 * 2 > arr[4] ==> false
		 * low = 5, high = 9, mid = 7
		 * arr[5] < 6 ==> false
		 * arr[5] <= arr[7] ==> true, low = 8
		 * 2 > arr[7] ==> false
		 * low = 8, high = 9, mid = 8
		 * arr[8] < 6 ==> false
		 * arr[8] <= arr[8] ==> true, low = 9
		 * 2 > arr[8] ==> false
		 * low = 9, high = 9, mid = 9
		 * arr[9] < 6 ==> true, min = 1
		 * arr[9] <= arr[9] low = 10
		 * 1 > arr[9] ==> false
		 */
	}

	public static void main(String[] args) {
		System.out.println ( minNumber ( new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 0, 9, 1 ) );  // 1
		System.out.println ( minNumber ( new int[]{3, 4, 5, 1, 2}, 0, 4, 1 ) );  // 1
	}
}
