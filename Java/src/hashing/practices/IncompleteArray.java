package hashing.practices;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/incomplete-array3859/1
public class IncompleteArray {

	public static void main(String[] args) {
		System.out.println ( countElements ( new int[]{205, 173, 102, 324, 957} ) );    // 851
		System.out.println ( countElements ( new int[]{545} ) );    // 0
		System.out.println ( countElements ( new int[]{14, 45, 56, 45, 1} ) );    // 52
	}

	static int countElements(int[] A) {
		if (A.length == 0 || A.length == 1) return 0;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (int integer : A) hashSet.add ( integer );
		for (Integer integer : hashSet) {
			if (largest < integer) largest = integer;
			if (smallest > integer) smallest = integer;
		}
		int diff = largest - smallest;
		return diff - hashSet.size ( ) + 1;
	}
}
