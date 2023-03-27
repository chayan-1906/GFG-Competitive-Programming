package hashing.practices;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/k-th-distinct-element4510/1
public class KthDistinctElement {

	public static void main(String[] args) {
		System.out.println ( KthDistinct ( new int[]{1, 2, 1, 3, 4, 2}, 2 ) );  // 4
		System.out.println ( KthDistinct ( new int[]{1, 2, 50, 10, 20, 2}, 3 ) );  // 10
	}

	public static int KthDistinct(int[] nums, int k) {
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<> ( );
		for (int num : nums)
			hashMap.put ( num, hashMap.getOrDefault ( num, 0 ) + 1 );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value == 1) arrayList.add ( key );
		}
		return arrayList.size ( ) < k ? -1 : arrayList.get ( k - 1 );
	}
}
