package hashing;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Testcase Dry Run --> {2, -3, 4, 0, -4, -1, 1}, sum = 0
 * 2: i = 0: prefixSum = 2, hashMap.contains(2) --> false, hashMap.put(2, 0)
 * -3: i = 1: prefixSum = -1, hashMap.contains(-1) --> false, hashMap.put(-1, 1)
 * 4: i = 2: prefixSum = 3, hashMap.contains(3) --> false, hashMap.put(3, 2)
 * 0: i = 3: prefixSum = 3, hashMap.contains(3) --> true, maxLen = max(0, 3 - 2) = 1
 * -4: i = 4: prefixSum = -1, hashMap.contains(-1) --> true, maxLen = max(1, 4 - 1) = 3
 * -1: i = 5: prefixSum = -2, hashMap.contains(-2) --> false, hashMap.put(-2, 5)
 * 1: i = 6: prefixSum = -1, hashMap.contains(-1) --> true, maxLen = max(3, 6 - 1) = 5
 */


public class LongestSubarrayWithGivenSum {

	// https://www.codingninjas.com/codestudio/problems/longest-subarray-with-sum-k_5713505
	// TODO: SUBMIT IN 2x BOOSTER, ASKED IN GFG
	public static ArrayList<Integer> findLongestSubarrayWithGivenSum(int[] array, int sum) {
		/*LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<> ( );
		int maxLen = 0;
		int prefixSum = 0;
		int start = -1, end = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (prefixSum == sum) {
				maxLen = i + 1;
				start = i + 1;
			}
			if (hashMap.containsKey ( prefixSum - sum )) {
				maxLen = Math.max ( maxLen, i - hashMap.get ( prefixSum - sum ) );
				if (maxLen == i - hashMap.get ( prefixSum - sum )) {
					start = hashMap.get ( prefixSum - sum ) + 1;
					end = i;
				}
			}
			// put element in hashmap iff it's not present, otherwise it'll update the value (index of element), so in that case we won't get the longest subarray
			if (prefixSum != sum && !hashMap.containsKey ( prefixSum - sum ))
				hashMap.put ( prefixSum, i );
		}
		System.out.println ( "Maximum Length: " + maxLen );
		ArrayList<Integer> resultArrayList = new ArrayList<> ( );
		for (int i = start; i <= end; i++) resultArrayList.add ( array[ i ] );
		System.out.println ( resultArrayList + "\n" );
		return maxLen;*/

		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		int prefixSum = 0;
		int start = -1;
		int end = -1;
		int maxLen = 0;
		int maxStart = -1;
		int maxEnd = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (prefixSum == sum) {
				start = 0;
				end = i;
			}
			if (hashMap.containsKey ( prefixSum - sum )) {
				start = hashMap.get ( prefixSum - sum ) + 1;
				end = i;
			}
			if (prefixSum != 0 && !hashMap.containsKey ( prefixSum - sum )) hashMap.put ( prefixSum, i );
			if (start != -1) {
				if (maxLen < end - start + 1) {
					maxLen = end - start + 1;
					if (maxLen == end - start + 1) {
						maxStart = start;
						maxEnd = end;
					}
				}
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int i = maxStart; i <= maxEnd; i++) arrayList.add ( array[ i ] );
		System.out.println ( arrayList );
		System.out.println ( "maxLen = " + maxLen );
		return arrayList;
	}

	public static void main(String[] args) {
		findLongestSubarrayWithGivenSum ( new int[]{5, 8, -4, -4, 9, -2, 2}, 0 ); // {8, -4, -4} --> 3
		findLongestSubarrayWithGivenSum ( new int[]{2, -3, 4, 0, -4, -1, 1}, 0 ); // {4, 0, -4, -1, 1} --> 5
		findLongestSubarrayWithGivenSum ( new int[]{-1, 0, 1, 1, -1, -1, 0}, 0 ); // {0, 1, 1, -1, -1, 0} --> 6
	}
}
