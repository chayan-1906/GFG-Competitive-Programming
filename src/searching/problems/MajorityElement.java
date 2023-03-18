package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/majority-element-1587115620
public class MajorityElement {

	public static int findMajorityElement(int[] arr, int size) {
		int majorityIndex = 0 /*count = 1;*/, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[ majorityIndex ] == arr[ i ]) count++;
			else count--;
			if (count == 0) {
				majorityIndex = i;
				count = 1;
			}
//			System.out.println ( "count = " + count );
		}
		return isMajority ( arr, majorityIndex ) ? arr[ majorityIndex ] : -1;

		/**
		 * Testcase Dry Run --> {1, 2, 3}
		 * majorityIndex = 0, count = 1
		 * i = 0, arr[0] = arr[0] count = 2
		 * i = 1, arr[0] = arr[1] count = 1
		 * i = 2, arr[0] = arr[2] count = 0, majorityIndex = 2, count = 1
		 */

		/**
		 * Testcase Dry Run --> {3, 1, 3, 3, 2}
		 * majorityIndex = 0, count = 1
		 * i = 0, arr[0] = arr[0] count = 2
		 * i = 1, arr[0] ≠ arr[1] count = 1
		 * i = 2, arr[0] = arr[2] count = 2
		 * i = 3, arr[0] = arr[3] count = 3
		 * i = 4, arr[0] = arr[4] count = 2
		 */
	}

	public static boolean isMajority(int[] arr, int majorityIndex) {
		int count = 0;
		for (int integer : arr) {
			if (integer == arr[ majorityIndex ]) count++;
		}
		return count > arr.length / 2;
	}

	public static void main(String[] args) {
		System.out.println ( findMajorityElement ( new int[]{1, 2, 3}, 3 ) );   // -1
		System.out.println ( findMajorityElement ( new int[]{3, 1, 3, 3, 2}, 5 ) );   // 3
	}
}
