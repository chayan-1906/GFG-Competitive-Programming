package strings.problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/isomorphic-strings-1587115620
public class IsomorphicString {

	public static boolean checkIsomorphicString(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length ( ) != s2.length ( )) return false;
		HashMap<Character, Character> hashMap = new HashMap<> ( );
		for (int i = 0; i < s1.length ( ); i++) {
			char char1 = s1.charAt ( i );
			char char2 = s2.charAt ( i );
			if (hashMap.containsKey ( char1 )) {
				if (hashMap.get ( char1 ) != char2) return false;
			} else {
				if (hashMap.containsValue ( char2 )) return false;
				hashMap.put ( char1, char2 );
			}
		}
		System.out.println ( hashMap );
		return true;
	}

	public static void main(String[] args) {
		System.out.println ( checkIsomorphicString ( "aab", "xxy" ) );  // true
		System.out.println ( checkIsomorphicString ( "aab", "xyz" ) );  // false
		System.out.println ( checkIsomorphicString ( "wfca", "yssy" ) );  // false
	}

	/**
	 * Testcase Dry Run --> "aab" "xxy"
	 * char1 = 'a', char2 = 'x', hashmap.containsKey(a) --> false, hashmap.containsValue(x) --> false, hashmap.put(a,x)
	 * char1 = 'a', char2 = 'x', hashmap.containsKey(a) --> true, hashmap.get(a) != x --> false
	 * char1 = 'b', char2 = 'y', hashmap.containsKey(b) --> false, hashmap.containsValue(y) --> false, hashmap.put(b,y)
	 * return true
	 */

	/**
	 * Testcase Dry Run --> "aab" "xyz"
	 * char1 = 'a', char2 = 'x', hashmap.containsKey(a) --> false, hashmap.containsValue(x) --> false, hashmap.put(a,x)
	 * char1 = 'a', char2 = 'y', hashmap.containsKey(a) --> true, hashmap.get(a) != y --> true, return false
	 */
}
