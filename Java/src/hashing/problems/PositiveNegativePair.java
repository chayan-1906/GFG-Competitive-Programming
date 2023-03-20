package hashing.problems;

import java.util.ArrayList;
import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/positive-negative-pair5209
public class PositiveNegativePair {

	public static ArrayList<Integer> findPairs(int[] array, int n) {
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<> ( );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int integer : array) {
			if (hashSet.contains ( -integer )) {
				arrayList.add ( -Math.abs ( integer ) );
				arrayList.add ( Math.abs ( integer ) );
			}
			hashSet.add ( integer );
		}
		if (arrayList.isEmpty ( )) arrayList.add ( 0 );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( findPairs ( new int[]{1, 3, 6, -2, -1, -3, 2, 7}, 8 ) );   // -1 1 -3 3 -2 2
		System.out.println ( findPairs ( new int[]{3, 2, 1}, 3 ) );   // 0
	}
}
