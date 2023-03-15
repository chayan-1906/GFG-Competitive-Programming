package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/given-two-strings-find-if-first-string-is-a-subsequence-of-second
public class CheckStringSubsequence {

	public static boolean checkStringSubsequence(String s1, String s2) {
		if (s1.length ( ) >= s2.length ( )) {
			for (int i = 0, j = 0; i < s1.length ( ); i++) {
				if (s1.charAt ( i ) == s2.charAt ( j )) j++;
				if (j == s2.length ( )) return true;
			}
		} else {
			for (int i = 0, j = 0; i < s2.length ( ); i++) {
				if (s2.charAt ( i ) == s1.charAt ( j )) j++;
				if (j == s1.length ( )) return true;
			}
		}
		return false;
	}

	public static boolean checkStringSubsequenceRecursively(String s1, String s2, int s1Length, int s2Length) {
		/* ASSUMING ALWAYS s1 WOULD BE SMALLER THAN s2 */
		if (s2Length == 0) return true;
		if (s1Length == 0) return false;
		if (s1.charAt ( s1Length - 1 ) == s2.charAt ( s2Length - 1 )) return checkStringSubsequenceRecursively ( s1, s2, s1Length - 1, s2Length - 1 );
		else return checkStringSubsequenceRecursively ( s1, s2, s1Length - 1, s2Length );
	}

	public static void main(String[] args) {
		System.out.println ( "Iteratively " + checkStringSubsequence ( "GEEKSFORGEEKS", "GRGES" ) ); // true
		System.out.println ( "Recursively " + checkStringSubsequenceRecursively ( "GEEKSFORGEEKS", "GRGES", 13, 5 ) ); // true
		System.out.println ( "Iteratively " + checkStringSubsequence ( "ABCD", "AD" ) ); // true
		System.out.println ( "Recursively " + checkStringSubsequenceRecursively ( "ABCD", "AD", 4, 2 ) ); // true
		System.out.println ( "Iteratively " + checkStringSubsequence ( "ABCDE", "AED" ) ); // false
		System.out.println ( "Recursively " + checkStringSubsequenceRecursively ( "ABCDE", "AED", 5, 3 ) ); // false
		System.out.println ( "Iteratively " + checkStringSubsequence ( "AXY", "ADXCPY" ) ); // true
		System.out.println ( "Recursively " + checkStringSubsequenceRecursively ( "AXY", "ADXCPY", 3, 6 ) ); // true
	}
}
