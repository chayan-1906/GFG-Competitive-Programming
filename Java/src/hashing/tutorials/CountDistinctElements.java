package hashing.tutorials;

import java.util.HashSet;

public class CountDistinctElements {

	public static int countDistinct(int[] array) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (int integer : array) hashSet.add ( integer );
		return hashSet.size ( );
	}

	public static void main(String[] args) {
		System.out.println ( countDistinct ( new int[]{1, 1, 2, 31, 1, 4, 2, 1, 2} ) );
		System.out.println ( countDistinct ( new int[]{} ) );
	}
}
