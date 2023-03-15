package strings.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/anagram-1587115620
public class CheckAnagramString {

	public static boolean isAnagram(String a, String b) {
		// Your code here
		if (a.length ( ) != b.length ( )) return false;
		HashMap<Character, Integer> hashMap = new HashMap<> ( );
		for (int i = 0; i < a.length ( ); i++) {
			Character character = a.charAt ( i );
			hashMap.put ( character, hashMap.getOrDefault ( character, 0 ) + 1 );
		}
		for (int i = 0; i < b.length ( ); i++) {
			Character character = b.charAt ( i );
			if (hashMap.containsKey ( character )) {
				hashMap.put ( character, hashMap.get ( character ) - 1 );
				if (hashMap.get ( character ) == 0) hashMap.remove ( character );
			} else return false;
		}
		if (hashMap.isEmpty ( )) return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println ( isAnagram ( "geeksforgeeks", "forgeeksgeeks" ) );  // true
		System.out.println ( isAnagram ( "allergy", "allergic" ) ); // false
		System.out.println ( isAnagram ( "listen", "silent" ) );    // true
		System.out.println ( isAnagram ( "aaabc", "cabaa" ) );    // true
		System.out.println ( isAnagram ( "aab", "bab" ) );    // false
		System.out.println ( isAnagram ( "geeksforgreeks", "forgeeksgeeks" ) );    // false
		System.out.println ( isAnagram ( "aabaa", "baaaaa" ) );    // false
	}
}
