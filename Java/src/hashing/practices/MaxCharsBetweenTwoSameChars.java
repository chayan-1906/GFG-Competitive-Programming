package hashing.practices;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character4552/1
public class MaxCharsBetweenTwoSameChars {

	public static void main(String[] args) {
		System.out.println ( maxChars ( "socks" ) );    // 3
		System.out.println ( maxChars ( "FoR" ) );    // -1
	}

	public static int maxChars(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<> ( );
		int count = -1;
		for (int i = 0; i < s.length ( ); i++) {
			Character character = s.charAt ( i );
			if (hashMap.containsKey ( character )) {
				count = Math.max ( count, i - hashMap.get ( character ) - 1 );
			} else {
				hashMap.put ( character, i );
			}
		}
		return count;
	}
}
