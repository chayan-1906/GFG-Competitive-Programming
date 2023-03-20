package strings.problems;

import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/minimum-indexed-character-1587115620
public class MinimumIndexedChar {

	public static int minIndexChar(String string, String pattern) {
		LinkedHashSet<Character> hashSet = new LinkedHashSet<> ( );
		for (int i = 0; i < pattern.length ( ); i++) hashSet.add ( pattern.charAt ( i ) );
		int resultedIndex = -1;
		for (int i = 0; i < string.length ( ); i++) {
			if (hashSet.contains ( string.charAt ( i ) )) {
				resultedIndex = i;
				break;
			}
		}
		return resultedIndex;
	}

	public static void main(String[] args) {
		System.out.println ( minIndexChar ( "geeksforgeeks", "set" ) ); // 1
		System.out.println ( minIndexChar ( "adcffaet", "onkl" ) ); // -1
	}
}
