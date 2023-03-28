package hashing.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/numbers-with-prime-frequencies-greater-than-or-equal-to-k5823/1
// TODO: ASKED IN GFG CHAT
public class PrimeFrequencies {

	static ArrayList<Integer> primeOccurences(int[] arr, int K) {
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<> ( );
		for (Integer integer : arr)
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value >= K && isPrime ( value )) arrayList.add ( key );
		}
		if (arrayList.isEmpty ( )) arrayList.add ( -1 );
		Collections.sort ( arrayList );
		return arrayList;
	}

	private static boolean isPrime(Integer value) {
		if (value == 1) return false;
		if (value == 2) return true;
		for (int i = 2; i < value; i++)
			if (value % i == 0) return false;
		return true;
	}

	public static void main(String[] args) {
//		System.out.println ( primeOccurences ( new int[]{11, 11, 11, 23, 11, 37, 51, 37, 37, 51, 51, 51, 51}, 2 ) );    // 37 51
//		System.out.println ( primeOccurences ( new int[]{11, 22, 33}, 2 ) );    // -1
		System.out.println ( primeOccurences ( new int[]{2, 2, 3, 4, 4, 8, 8, 10, 11, 15, 16, 16, 17, 18, 18, 18, 19, 20, 20, 20}, 2 ) );    // 2 4 8 16 18 20
	}
}
