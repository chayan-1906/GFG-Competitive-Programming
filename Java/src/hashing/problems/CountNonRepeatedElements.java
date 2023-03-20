package hashing.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/count-distinct-elements-1587115620
public class CountNonRepeatedElements {

	static long countNonRepeated(int[] arr, int n) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (Integer integer : arr)
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		int nonRepeatedElementCount = 0;
		for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value == 1) nonRepeatedElementCount++;
		}
		return nonRepeatedElementCount;
	}

	public static void main(String[] args) {

	}
}
