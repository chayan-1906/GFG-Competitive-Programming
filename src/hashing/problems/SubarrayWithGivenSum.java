package hashing.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/subarray-range-with-given-sum0128
public class SubarrayWithGivenSum {

	public static int subArraySum(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		int count = 0;
		int prefixSum = 0;
		for (int integer : arr) {
			prefixSum += integer;
			if (prefixSum == sum) count++;
			if (hashMap.containsKey ( prefixSum - sum ))
				count += hashMap.get ( prefixSum - sum );
			hashMap.put ( prefixSum, hashMap.getOrDefault ( prefixSum, 0 ) + 1 );
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println ( subArraySum ( new int[]{10, 2, -2, -20, 10}, 5, -10 ) );   // 3
		System.out.println ( subArraySum ( new int[]{1, 4, 20, 3, 10, 5}, 6, 33 ) );    // 1
		System.out.println ( subArraySum ( new int[]{24, 16, 5, 26, 27, 2}, 6, 2 ) );    // 1
	}
}
