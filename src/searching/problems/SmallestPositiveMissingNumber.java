package searching.problems;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/smallest-positive-missing-number-1587115621
// TODO: ASKED PRIYANSH TO MAKE TC = O(N) & SC = O(1), mine is TC = O(N) & SC = O(N)
public class SmallestPositiveMissingNumber {

	public static int missingNumber(int[] arr, int size) {
		if (arr.length == 1 && arr[ 0 ] == 0) return 1;
		int smallestMissing = Integer.MAX_VALUE;
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (int integer : arr) {
			// find the smallest int in array
			if (integer > 0 && smallestMissing > integer)
				smallestMissing = integer;
			// insert +ve int in hashset
			if (integer > 0) hashSet.add ( integer );
		}
		for (int i = 0; i <= hashSet.size ( ); i++) {
			if (hashSet.contains ( i + 1 )) {
				smallestMissing = i + 1;
			} else return i + 1;
		}
		return smallestMissing;
	}

	public static void main(String[] args) {
		System.out.println ( missingNumber ( new int[]{1, 2, 3, 4, 5}, 5 ) );   // 6
		System.out.println ( missingNumber ( new int[]{0, -10, 1, 3, -20}, 5 ) );   // 2
		System.out.println ( missingNumber ( new int[]{0, 1}, 2 ) );   // 2
		System.out.println ( missingNumber ( new int[]{1}, 1 ) );   // 2
		System.out.println ( missingNumber ( new int[]{0}, 1 ) );   // 1
		System.out.println ( missingNumber ( new int[]{28, 7, -36, 21, -21, -50, 9, -32}, 8 ) );   // 1
	}
}
