package strings.problems;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/pangram-checking-1587115620
public class PangramCheck {

	public static boolean checkPangram(String string) {
		HashSet<Character> hashSet = new HashSet<> ( );
		string = string.toLowerCase ( );
		for (int i = 0; i < string.length ( ); i++) {
			char character = string.charAt ( i );
			if (character >= 'a' && character <= 'z') hashSet.add ( character );
		}
		System.out.println ( hashSet );
		return hashSet.size ( ) == 26;
	}

	public static void main(String[] args) {
		System.out.println ( checkPangram ( "Bawds jog, flick quartz, vex nymph" ) );   // true
		System.out.println ( checkPangram ( "sdfs" ) ); // false
	}
}
