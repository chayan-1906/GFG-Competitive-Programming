package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOf2Arrays {

	public static ArrayList<Integer> intersectionOf2Arrays(int[] array1, int[] array2) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (Integer integer : array1) hashSet.add ( integer );
		for (Integer integer : array2) {
			if (hashSet.contains ( integer )) {
				hashSet.remove ( integer );
				arrayList.add ( integer );
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( intersectionOf2Arrays ( new int[]{10, 20, 30}, new int[]{30, 30, 10} ) );
	}
}
