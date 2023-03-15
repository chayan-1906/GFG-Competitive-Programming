package hashing.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/sorting-elements-of-an-array-by-frequency-1587115621
// Tried but couldn't do, try later, after studying Priority Queue
public class SortArrayByFrequency {

	static ArrayList<Integer> sortByFreq(int[] arr, int n) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (Integer integer : arr)
			hashMap.put ( integer, hashMap.getOrDefault ( integer, 0 ) + 1 );
		ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<> ( hashMap.entrySet ( ) );
		arrayList.sort ( (o1, o2) -> (o2.getValue ( )).compareTo ( o1.getValue ( ) ) );
		arrayList.sort ( (o1, o2) -> {
			if (Objects.equals ( o1.getKey ( ), o2.getKey ( ) ))
				return (o1.getKey ( )).compareTo ( o2.getKey ( ) );
			return 1;
		} );
		System.out.println ( "arrayList = " + arrayList );
		ArrayList<Integer> resultArraylist = new ArrayList<> ( );
		for (Map.Entry<Integer, Integer> integerIntegerEntry : arrayList) {
			for (int integer = 0; integer < integerIntegerEntry.getValue ( ); integer++) {
				resultArraylist.add ( integerIntegerEntry.getKey ( ) );
			}
		}
		return resultArraylist;
	}

	public static void main(String[] args) {
		System.out.println ( sortByFreq ( new int[]{5, 5, 4, 6, 4}, 5 ) );
	}
}
