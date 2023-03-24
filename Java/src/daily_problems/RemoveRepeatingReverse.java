package daily_problems;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/1e2f365be6114b671b915e145ec7dbcfdc432910/1
public class RemoveRepeatingReverse {

	public static String removeReverse(String S) {
		HashMap<Character, Integer> hashMap = new HashMap<> ( );
		for (int i = 0; i < S.length ( ); i++)
			hashMap.put ( S.charAt ( i ), hashMap.getOrDefault ( S.charAt ( i ), 0 ) + 1 );
		StringBuilder stringBuilder = new StringBuilder ( S );
		boolean repeatFound = true;
		while (repeatFound) {
			repeatFound = false;
			for (int i = 0; i < stringBuilder.length ( ); i++) {
				Character character = stringBuilder.charAt ( i );
				if (hashMap.get ( character ) != 1) {
					repeatFound = true;
					hashMap.put ( character, hashMap.get ( character ) - 1 );
					stringBuilder.deleteCharAt ( i );
					break;
				}
			}
			if (repeatFound) {
				stringBuilder.reverse ( );
				hashMap.clear ( );
				for (int i = 0; i < stringBuilder.length ( ); i++)
					hashMap.put ( stringBuilder.charAt ( i ), hashMap.getOrDefault ( stringBuilder.charAt ( i ), 0 ) + 1 );
			}
		}
		return stringBuilder.toString ( );
		/**
		 * Testcase Dry Run --> abcab
		 * Remove a --> bcab, Reverse --> bacb
		 * Remove b --> acb, Reverse --> bca
		 *
		 *
		 * Testcase Dry Run --> acabc
		 * Remove a --> cabc, Reverse cbac
		 * Remove c --> abc, Reverse cba
		 */
	}

	public static void main(String[] args) {
		System.out.println ( removeReverse ( "abab" ) );    // ba
		System.out.println ( removeReverse ( "dddd" ) );    // d
		System.out.println ( removeReverse ( "ababc" ) );    // bac
		System.out.println ( removeReverse ( "abcab" ) );    // bca
		System.out.println ( removeReverse ( "acabc" ) );    // cab
	}
}
