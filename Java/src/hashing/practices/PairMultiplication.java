package hashing.practices;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/find-pairs-with-given-relation1540/1
public class PairMultiplication {

	static long findPairs(long[] a) {
		HashSet<Long> hashSet = new HashSet<> ( );
		for (int i = 0; i < a.length; i++) {
			long l = a[ i ];
			for (int j = i + 1; j < a.length; j++) {
				long value = a[ j ];
				if (hashSet.contains ( l * value )) return 1;
				hashSet.add ( l * value );
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( findPairs ( new long[]{3, 4, 7, 1, 2, 9, 8} ) );   // 1
		System.out.println ( findPairs ( new long[]{1, 6, 3, 9, 2, 10} ) ); // 1
		System.out.println ( findPairs ( new long[]{37, 62, 81, 40, 18} ) ); // 1
	}
}
