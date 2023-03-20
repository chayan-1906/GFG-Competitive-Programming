package hashing.problems;

import java.util.ArrayList;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/print-distinct-elements-1587115620
public class PrintNonRepeatedElements {

	static ArrayList<Integer> printNonRepeated(int arr[], int n) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (Integer integer : arr)
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		int nonRepeatedElementCount = 0;
		for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value == 1) arrayList.add ( key );
		}
		return arrayList;
	}

	public static void main(String[] args) {

	}
}
