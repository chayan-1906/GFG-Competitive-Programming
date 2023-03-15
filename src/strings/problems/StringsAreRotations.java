package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620
public class StringsAreRotations {

	public static boolean areRotations(String s1, String s2) {
		if (s1.length ( ) != s2.length ( )) return false;
		return (s1 + s1).contains ( s2 );
//		return (s2 + s2).contains ( s1 );
	}

	public static void main(String[] args) {
		System.out.println ( areRotations ( "geeksforgeeks", "forgeeksgeeks" ) );   // true
		System.out.println ( areRotations ( "mightandmagic", "andmagicmigth" ) );   // false
	}
}
