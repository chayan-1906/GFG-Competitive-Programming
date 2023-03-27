package hashing.tutorials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/longest-consecutive-subsequence2449
// TODO: Priyansh
public class LongestConsecutiveSequence {

	/**
	 * Testcase Dry Run --> {1, 9, 3, 4, 2, 10, 13}
	 * 1: i = 0,
	 * hashset.contains(0) --> false, current = 1,
	 * while: hashset.contains(2) --> true, current = 2, maxlen = 2,
	 * hashset.contains(3) --> true, current = 3, maxlen = 3,
	 * hashset.contains(4) --> true, current = 5, maxlen = 4,
	 * hashset.contains(5) --> false
	 * 9: i = 1, hashset.contains(8) --> false, current = 1,
	 * while: hashset.contains(10) --> true, current = 2,
	 * hashset.contains(11) --> false
	 * 3: i = 2, hashset.contains(2) --> true
	 * 4: i = 3, hashset.contains(3) --> true
	 * 2: i = 4, hashset.contains(1) --> true
	 * 10: i = 5, hashset.contains(9) --> true
	 * 13: i = 6, hashset.contains(12) --> false, current = 1,
	 * while: hashset.contains(14) --> false
	 */

	public static ArrayList<Integer> findLongestConsecutiveSubsequence(int[] array) {
		/*HashSet<Integer> hashSet = new HashSet<> ( );
		int maxLen = 0;
		int current;
		for (Integer integer : array) hashSet.add ( integer );
		for (int i = 0; i < array.length; i++) {
			if (!hashSet.contains ( array[ i ] - 1 )) {
				current = 1;
				while (hashSet.contains ( current + array[ i ] )) current++;
				maxLen = Math.max ( maxLen, current );
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int i = 0; i < maxLen; i++) arrayList.add ( i + 1 );*/
		int[] array2 = new int[ 1000001 ];
		int maxLen = 0;
		int count = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (Integer integer : array) {
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (hashMap.containsKey ( key - 1 )) {
				count++;
				System.out.println ( "key = " + key );
				maxLen = Math.max ( maxLen, count );
			} else {
				count = 0;
				if (hashMap.containsKey ( key + 1 )) {
					count++;
					System.out.println ( "key = " + key );
					maxLen = Math.max ( maxLen, count );
				}
			}
		}
		System.out.println ( hashMap );
		System.out.println ( maxLen );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( findLongestConsecutiveSubsequence ( new int[]{1, 9, 3, 4, 2, 10, 13} ) );  // 4
		System.out.println ( findLongestConsecutiveSubsequence ( new int[]{1, 4, 2, 5, 4, 6, 8, 7} ) );  // 5
	}
}
