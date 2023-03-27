package hashing.practices;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/sum-indexes5459/1
public class SumIndexes {

	static int pairCount(int[] A, int[] B, int[] C) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		int count = 0;
		for (Integer integer : C) hashSet.add ( integer );
		for (int i = 0; i < B.length; i++) {
			if (hashSet.contains ( A[ i ] - B[ i ] )) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println ( pairCount ( new int[]{1, 2, 3}, new int[]{3, 2, 4}, new int[]{0, 5, -2} ) );    // 2
	}
}
