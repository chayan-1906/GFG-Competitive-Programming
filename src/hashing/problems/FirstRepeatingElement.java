package hashing.problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/first-repeating-element4018
public class FirstRepeatingElement {

	public static int firstRepeated(int[] arr, int n) {
		LinkedHashMap<Integer, ArrayList<Integer>> hashMap = new LinkedHashMap<> ( );
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey ( arr[ i ] )) {
				ArrayList<Integer> arrayList = hashMap.get ( arr[ i ] );
				arrayList.add ( i + 1 );
				hashMap.put ( arr[ i ], arrayList );
			} else {
				ArrayList<Integer> arrayList = new ArrayList<> ( );
				arrayList.add ( i + 1 );
				hashMap.put ( arr[ i ], arrayList );
			}
		}
		System.out.println ( hashMap );
		for (ArrayList<Integer> value : hashMap.values ( )) {
			if (value.size ( ) >= 2) return value.get ( 0 );
		}
		return -1;
	}

	public static void main(String[] args) {
		firstRepeated ( new int[]{1, 5, 3, 4, 3, 5, 6}, 7 );
	}
}
