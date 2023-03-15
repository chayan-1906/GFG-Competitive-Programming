package strings.problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/repeating-character-first-appearance-leftmost
public class LeftmostRepeatingCharacter {

	public static int repeatedCharacter(String S) {
		LinkedHashMap<Character, List<Integer>> hashMap = new LinkedHashMap<> ( );
		for (int i = 0; i < S.length ( ); i++) {
			Character character = S.charAt ( i );
			List<Integer> indices;
			if (hashMap.containsKey ( character )) indices = hashMap.get ( character );
			else indices = new ArrayList<> ( );
			indices.add ( i );
			hashMap.put ( character, indices );
		}
		for (Entry<Character, List<Integer>> entry : hashMap.entrySet ( )) {
			List<Integer> indices = entry.getValue ( );
			if (indices.size ( ) > 1) return indices.get ( 0 );
		}
		System.out.println ( hashMap );
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( repeatedCharacter ( "geeksforgeeks" ) );   // 0
		System.out.println ( repeatedCharacter ( "abcd" ) );   // -1
		System.out.println ( repeatedCharacter ( "abbcc" ) );   // 1
	}
}
