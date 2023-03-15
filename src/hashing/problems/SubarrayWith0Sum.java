package hashing.problems;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/subarray-with-0-sum-1587115621
public class SubarrayWith0Sum {

	static boolean findsum(int[] arr, int n) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		int prefixSum = 0;
		for (int integer : arr) {
			prefixSum += integer;
			if (prefixSum == 0) return true;
			if (hashSet.contains ( prefixSum )) return true;
			hashSet.add ( prefixSum );
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println ( findsum ( new int[]{4, 2, -3, 1, 6}, 5 ) );    // true
		System.out.println ( findsum ( new int[]{4, 2, 0, 1, 6}, 5 ) );    // true
	}
}
