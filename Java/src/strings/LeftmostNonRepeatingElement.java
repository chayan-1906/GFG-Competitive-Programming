package strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class LeftmostNonRepeatingElement {

	public static int findLeftmostNonRepeatingCharacter(String string) {
		LinkedHashMap<Character, List<Integer>> hashMap = new LinkedHashMap<> ( );
		for (int i = 0; i < string.length ( ); i++) {
			Character character = string.charAt ( i );
			if (hashMap.containsKey ( character )) {
				List<Integer> indices = hashMap.get ( character );
				indices.add ( i );
				hashMap.put ( character, indices );
			} else {
				List<Integer> indices = new ArrayList<> ( );
				indices.add ( i );
				hashMap.put ( character, indices );
			}
		}
		for (Entry<Character, List<Integer>> entry : hashMap.entrySet ( )) {
			List<Integer> indices = entry.getValue ( );
			if (indices.size ( ) == 1) return indices.get ( 0 );
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( findLeftmostNonRepeatingCharacter ( "geeksforgeeks" ) );   // 5
		System.out.println ( findLeftmostNonRepeatingCharacter ( "abcabc" ) );   // -1
		System.out.println ( findLeftmostNonRepeatingCharacter ( "apple" ) );   // 0
	}
}
