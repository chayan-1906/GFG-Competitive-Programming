package searching;

import java.util.Arrays;
import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/NzAyMQ%3D%3D
// PROGRAM TO FIND PAIR WITH GIVEN SUM
public class TwoPointersApproach {

	/// HASHING... TC = O(N), SC = O(N)
	public static int[] pairWithGivenSumHashing(int[] array, int sum) {
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<> ( );
		int[] result = new int[ 2 ];
		for (int integer : array) {
			if (hashSet.contains ( sum - integer )) {
				result[ 0 ] = sum - integer;
				result[ 1 ] = integer;
				return result;
			}
			hashSet.add ( integer );
		}
		return result;
	}

	/// TWO POINTERS APPROACH... TC = O(N), SC = O(1)
	public static int[] pairWithGivenSum(int[] array, int sum) {
		int left = 0;
		int right = array.length - 1;
		int[] result = new int[ 2 ];
		while (left < right) {
			if (array[ left ] + array[ right ] == sum) {
				result[ 0 ] = array[ left ];
				result[ 1 ] = array[ right ];
				return result;
			} else if (array[ left ] + array[ right ] > sum) right--;
			else if (array[ left ] + array[ right ] < sum) left++;
		}
		return result;

		/**
		 * Testcase Dry Run array = {2, 4, 8, 9, 11, 12, 20, 30}, sum = 23
		 * IF ACTUAL SUM IS EQUALS TO GIVEN SUM RETURN,
		 * IF ACTUAL SUM BECOMES SMALLER THAN GIVEN SUM INCREMENT left,
		 * ELSE DECREMENT right
		 * left = 0, right = 7: 2 + 30 > 23, right = 6
		 * left = 0, right = 6: 2 + 20 < 23, left = 1
		 * left = 1, right = 6: 4 + 20 > 23, right = 5
		 * left = 1, right = 5: 4 + 12 < 23, left = 2
		 * left = 2, right = 5: 8 + 12 < 23, left = 3
		 * left = 3, right = 5: 9 + 12 < 23, left = 4
		 * left = 4, right = 5: 11 + 12 < 23 return true
		 */
	}

	public static void main(String[] args) {
		System.out.println ( Arrays.toString ( pairWithGivenSum ( new int[]{2, 5, 8, 12, 30}, 17 ) ) ); // true (5, 12)
		System.out.println ( Arrays.toString ( pairWithGivenSumHashing ( new int[]{2, 5, 8, 12, 30}, 17 ) ) ); // true (5, 12)
		System.out.println ( Arrays.toString ( pairWithGivenSum ( new int[]{3, 8, 13, 18}, 14 ) ) ); // false
		System.out.println ( Arrays.toString ( pairWithGivenSumHashing ( new int[]{3, 8, 13, 18}, 14 ) ) ); // false
		System.out.println ( Arrays.toString ( pairWithGivenSum ( new int[]{2, 4, 8, 9, 11, 12, 20, 30}, 23 ) ) ); // true (11, 12)
		System.out.println ( Arrays.toString ( pairWithGivenSumHashing ( new int[]{2, 4, 8, 9, 11, 12, 20, 30}, 23 ) ) ); // true (11, 12)
	}
}
