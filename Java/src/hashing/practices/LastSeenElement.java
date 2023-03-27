package hashing.practices;

import java.util.*;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/last-seen-array-element1501/1
public class LastSeenElement {

	static int lastSeenElement(int[] arr) {
		HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<> ( );
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey ( arr[ i ] )) {
				ArrayList<Integer> arrayList = hashMap.get ( arr[ i ] );
				arrayList.add ( i );
				hashMap.put ( arr[ i ], arrayList );
			} else {
				ArrayList<Integer> arrayList = new ArrayList<> ( );
				arrayList.add ( i );
				hashMap.put ( arr[ i ], arrayList );
			}
		}
		ArrayList<Integer> indices = new ArrayList<> ( );
		for (Entry<Integer, ArrayList<Integer>> entry : hashMap.entrySet ( )) {
			ArrayList<Integer> value = entry.getValue ( );
			indices.add ( value.get ( value.size ( ) - 1 ) );
		}
		return arr[ Collections.min ( indices ) ];
	}

	public static void main(String[] args) {
		System.out.println ( lastSeenElement ( new int[]{10, 30, 20, 10, 20} ) );   // 30
		System.out.println ( lastSeenElement ( new int[]{10, 20, 30, 40, 10} ) );   // 20
	}
}
