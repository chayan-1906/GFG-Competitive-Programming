package hashing.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/check-if-two-arrays-are-equal-or-not3847
public class CheckArraysEqual {

	public static boolean check(long[] A, long[] B, int N) {
		HashMap<Long, Integer> hashMap = new HashMap<> ( );
		for (long element : A) hashMap.put ( element, hashMap.getOrDefault ( element, 0 ) + 1 );
		for (long element : B) {
			if (hashMap.containsKey ( element )) {
				if (hashMap.get ( element ) > 0) {
					hashMap.put ( element, hashMap.get ( element ) - 1 );
					if (hashMap.get ( element ) == 0) hashMap.remove ( element );
				}
			} else return false;
		}
		return hashMap.isEmpty ( );
	}

	public static void main(String[] args) {

	}
}
