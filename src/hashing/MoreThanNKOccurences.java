package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MoreThanNKOccurences {

	public static ArrayList<Integer> findMoreThanNKOccurences(int[] array, int k) {
		/*HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (Integer integer : array) hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value > array.length / k) arrayList.add ( key );
		}
		if (arrayList.isEmpty ( )) arrayList.add ( -1 );
		return arrayList;*/

		// TC = O(nk)
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (Integer integer : array) {
			if (hashMap.containsKey ( integer )) hashMap.put ( integer, hashMap.get ( integer ) + 1 );
			else if (hashMap.size ( ) < k - 1) hashMap.put ( integer, 1 );
			else {
				for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
					Integer key = entry.getKey ( );
					hashMap.put ( key, hashMap.get ( key ) - 1 );
					if (hashMap.get ( key ) == 0) hashMap.remove ( key );
				}
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		int count = 0;
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			for (int j : array) {
				if (key == j) count++;
			}
			if (count > array.length / k) arrayList.add ( key );
		}
		if (arrayList.isEmpty ( )) arrayList.add ( -1 );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( findMoreThanNKOccurences ( new int[]{30, 10, 20, 20, 10, 20, 30, 30}, 4 ) );  // 20, 30
		System.out.println ( findMoreThanNKOccurences ( new int[]{30, 10, 20, 30, 30, 40, 30, 40, 30}, 2 ) );  // 30
	}
}
