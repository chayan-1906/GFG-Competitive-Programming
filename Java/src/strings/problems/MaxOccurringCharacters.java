package strings.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/maximum-occuring-character-1587115620
public class MaxOccurringCharacters {

	public static char getMaxOccurringChar(String line) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (int i = 0; i < line.length ( ); i++)
			hashMap.put ( (int) line.charAt ( i ), hashMap.getOrDefault ( (int) line.charAt ( i ), 0 ) + 1 );
		System.out.println ( hashMap );
		int maxValue = -1;
		int minKey = Integer.MAX_VALUE;
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			maxValue = Math.max ( maxValue, value );
		}
		ArrayList<Integer> charsWithMaxFreq = new ArrayList<> ( );
		for (Entry<Integer, Integer> entry : hashMap.entrySet ( )) {
			Integer key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value == maxValue) charsWithMaxFreq.add ( key );
		}
		for (Integer integer : charsWithMaxFreq) {
			if (integer < minKey) minKey = integer;
		}
		return (char) minKey;
	}

	public static void main(String[] args) {
//		System.out.println ( getMaxOccurringChar ( "testsample" ) );    // e
//		System.out.println ( getMaxOccurringChar ( "output" ) );    // t
		System.out.println ( getMaxOccurringChar ( "ba" ) );    //
	}
}
