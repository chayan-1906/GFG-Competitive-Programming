package hashing.problems;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/hashing-for-pair-2
public class HashingPair2 {

	public static int sumExists(int[] arr, int N, int sum) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (Integer integer : arr) {
			if (hashSet.contains ( sum - integer )) return 1;
			hashSet.add ( integer );
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println ( sumExists ( new int[]{27, 72, 39, 70, 13, 68, 100, 36, 95}, 9, 139 ) );
		System.out.println ( sumExists ( new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 14 ) );
	}
}
