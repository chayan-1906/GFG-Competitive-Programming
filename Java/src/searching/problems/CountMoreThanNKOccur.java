package searching.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/count-element-occurences
public class CountMoreThanNKOccur {

	public static int countOccurrence(int[] arr, int n, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (int integer : arr) hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		System.out.println ( hashMap );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value > arr.length / k) arrayList.add ( key );
		}
		return Collections.min ( arrayList );
	}

	public static void main(String[] args) {
		System.out.println ( countOccurrence ( new int[]{3, 1, 2, 2, 1, 2, 3, 3}, 8, 4 ) );   // 2
		System.out.println ( countOccurrence ( new int[]{2, 3, 3, 2}, 4, 3 ) );   // 2
		System.out.println ( countOccurrence ( new int[]{1, 2, 2, 2, 3, 3}, 6, 3 ) );   // 1
	}
}
