package hashing;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Testcase Dry Run --> {1, 0, 1, 1, 1, 0, 0}
 * {1, -1, 1, 1, 1, -1, -1}
 * 1: i = 0, prefixSum = 1, hashmap.containsKey(1) --> false, hashmap.put(1,0)
 * -1, i = 1, prefixSum = 0, start = 0, end = 1, hashmap.containsKey(0) --> false, hashmap.put(0,1)
 * 1, i = 2, prefixSum = 1, hashmap.containsKey(1) --> true, start = 1, end = 2
 * 1, i = 3, prefixSum = 2, hashmap.containsKey(2) --> false, hashmap.put(2,3)
 * 1, i = 4, prefixSum = 3, hashmap.containsKey(3) --> false, hashmap.put(3,4)
 * -1, i = 5, prefixSum = 2, hashmap.containsKey(2) --> true, start = 4, end = 5
 * -1, i = 6,  prefixSum = 1, hashmap.containsKey(1) --> true, start = 1, end = 6
 */

/**
 * Testcase Dry Run --> {1, 1, 0, 0, 0, 1, 0}
 * {1, 1, -1, -1, -1, 1, -1}
 * 1: i = 0, prefixSum = 1, hashmap.containsKey(1) --> false, hashmap.put(1,0), maxLen = 0
 * 1: i = 1, prefixSum = 2, hashmap.containsKey(2) --> false, hashmap.put(2,1), maxLen = 0
 * -1: i = 2, prefixSum = 1, hashmap.containsKey(1) --> true, start = 1, end = 2, maxLen = 2
 * -1: i = 3, prefixSum = 0, start = 0, end = 3, maxLen = 4
 * -1: i = 4, prefixSum = -1, hashmap.containsKey(-1) --> false, hashmap.put(-1,4), maxLen = 4
 * 1: i = 5, prefixSum = 0, start = 0, end = 5, maxLen = 6
 * -1: i = 6, prefixSum = -1, hashmap.containsKey(-1) --> true, start = 4, end = 6, maxLen = 6
 */


public class LongestSubarrayWithEqual0s1s {

	public static ArrayList<Integer> findLongestSubarrayWithEqual0s1s(int[] array) {
		if (array.length == 0) return new ArrayList<> ( );
		for (int i = 0; i < array.length; i++)
			if (array[ i ] == 0) array[ i ] = -1;
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		int prefixSum = 0;
		int start = -1;
		int end = -1;
		int maxLen = 0;
		int maxStart = -1;
		int maxEnd = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (prefixSum == 0) {
				start = 0;
				end = i;
			}
			if (hashMap.containsKey ( prefixSum - 0 )) {
				start = hashMap.get ( prefixSum - 0 ) + 1;
				end = i;
			}
			if (prefixSum != 0 && !hashMap.containsKey ( prefixSum - 0 )) hashMap.put ( prefixSum, i );
			if (start != -1) {
				maxLen = Math.max ( maxLen, end - start + 1 );
				if (maxLen == end - start + 1) {
					maxStart = start;
					maxEnd = end;
				}
			}
//			System.out.println ( "start = " + start + " end = " + end );
//			System.out.println ( "maxLen - " + maxLen );
		}
		if (start == -1 && end == -1) return new ArrayList<> ( );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int i = maxStart; i <= maxEnd; i++) {
			if (array[ i ] == -1) array[ i ] = 0;
			arrayList.add ( array[ i ] );
		}
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{1, 0, 1, 1, 1, 0, 0} ) ); // {0, 1, 1, 1, 0, 0}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 1, 1, 1, 1, 0, 0} ) ); // {1, 1, 0, 0}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 1, 1, 1, 0, 0} ) ); // {0, 1, 1, 1, 0, 0}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{1, 1, 1} ) ); // no subarray exists
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 0, 0} ) ); // no subarray exists
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 0, 1, 0, 0} ) ); // {0, 1} or {1, 0}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 1, 0, 1} ) ); // {0, 1, 0, 1}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{1, 1, 0, 0, 0, 1, 0} ) ); // {1, 1, 0, 0, 0, 1}
		System.out.println ( findLongestSubarrayWithEqual0s1s ( new int[]{0, 1, 0, 0, 1, 0, 1, 1} ) ); // {0, 1, 0, 0, 1, 0, 1, 1}
	}
}
