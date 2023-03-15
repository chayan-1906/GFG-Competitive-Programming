package strings.problems;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/non-repeating-character-1587115620
public class NonRepeatingCharacter {

	static char nonrepeatingCharacter(String S) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<> ( );
		for (int i = 0; i < S.length ( ); i++) {
			Character character = S.charAt ( i );
			hashMap.put ( character, hashMap.getOrDefault ( character, 0 ) + 1 );
		}
		for (Entry<Character, Integer> entry : hashMap.entrySet ( )) {
			Character key = entry.getKey ( );
			Integer value = entry.getValue ( );
			if (value == 1) return key;
		}
		return '$';
	}

	public static void main(String[] args) {
		System.out.println ( nonrepeatingCharacter ( "hello" ) );   // h
		System.out.println ( nonrepeatingCharacter ( "zxvczbtxyzvy" ) );    // c
	}
}
