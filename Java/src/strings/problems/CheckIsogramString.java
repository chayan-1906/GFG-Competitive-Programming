package strings.problems;

import java.util.HashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/check-if-a-string-is-isogram-or-not-1587115620
public class CheckIsogramString {

	public static boolean isIsogram(String data) {
		HashMap<Character, Integer> hashMap = new HashMap<> ( );
		for (int i = 0; i < data.length ( ); i++) {
			Character character = data.charAt ( i );
			hashMap.put ( character, hashMap.getOrDefault ( character, 0 ) + 1 );
		}
		for (Entry<Character, Integer> entry : hashMap.entrySet ( )) {
			Integer value = entry.getValue ( );
			if (value > 1) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println ( isIsogram ( "machine" ) ); // true
		System.out.println ( isIsogram ( "geeks" ) ); // false
	}
}
