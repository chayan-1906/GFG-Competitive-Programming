package hashing.tutorials;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FrequenciesOfElement {

	public static void countFreq(int[] array) {
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<> ( );
		for (Integer integer : array) {
//			if (hashMap.containsKey ( integer )) hashMap.put ( integer, hashMap.get ( integer ) + 1 );
//			else hashMap.put ( integer, 1 );
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		}
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			System.out.println ( "Frequency of " + key + " : " + value );
		}
	}

	public static void main(String[] args) {
		countFreq ( new int[]{10, 20, 20, 30, 10} );
	}
}
