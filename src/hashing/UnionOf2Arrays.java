package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOf2Arrays {

	public static ArrayList<Integer> unionOf2Arrays(int[] array1, int[] array2) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (Integer integer : array1) hashSet.add ( integer );
		for (Integer integer : array2) hashSet.add ( integer );
		return new ArrayList<> ( hashSet );
	}

	public static void main(String[] args) {
		System.out.println ( unionOf2Arrays ( new int[]{10, 20, 30}, new int[]{40, 10} ) );
	}
}
