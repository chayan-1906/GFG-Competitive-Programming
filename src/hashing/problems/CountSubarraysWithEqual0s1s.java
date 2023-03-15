package hashing.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/count-subarrays-with-equal-number-of-1s-and-0s-1587115620
public class CountSubarraysWithEqual0s1s {

	/**
	 * Testcase Dry Run --> {1, 0, 0, 1, 0, 1, 1}
	 * {1, -1, -1, 1, -1, 1, 1}
	 * 1: prefixSum = 1, hashmap.containsKey(1) --> false, hashmap.put(1,1)
	 * -1: prefixSum = 0, count++ // 1, hashmap.containsKey(0) --> false, hashmap.put(0,1)
	 * -1: prefixSum = -1, hashmap.containsKey(-1) --> false, hashmap.put(-1,1)
	 * 1: prefixSum = 0, count++ // 2, hashmap.containsKey(0) --> true, count = 3, hashmap.put(0,2)
	 * -1: prefixSum = -1, hashmap.containsKey(-1) --> true, count = 4, hashmap.put(-1,2)
	 * 1: prefixSum = 0, count++ // 5, hashmap.containsKey(0) --> true, count = 7, hashmap.put(0,3)
	 * 1: prefixSum = 1, hashmap.containsKey(1) --> true, count = 8 hashmap.put(1,2)
	 */

	static int countSubarrWithEqualZeroAndOne(int[] arr, int n) {
		if (arr.length == 0 || arr.length == 1) return 0;
		for (int i = 0; i < arr.length; i++) if (arr[ i ] == 0) arr[ i ] = -1;
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		int count = 0;
		int prefixSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[ i ];
			if (prefixSum == 0) count++;
			if (hashMap.containsKey ( prefixSum )) count += hashMap.get ( prefixSum );
			hashMap.put ( prefixSum, hashMap.getOrDefault ( prefixSum, 0 ) + 1 );
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println ( countSubarrWithEqualZeroAndOne ( new int[]{1, 0, 0, 1, 0, 1, 1}, 7 ) );    // 8
		System.out.println ( countSubarrWithEqualZeroAndOne ( new int[]{1, 1, 1, 1, 0}, 5 ) );    // 1
	}
}
