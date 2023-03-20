package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/distinct-pattern-search-1587115620
public class PatternSearch {

	public static boolean search(String text, String pattern) {
		if (pattern.length ( ) > text.length ( )) return false;
		int i = 0, j = 0;
		while (i < text.length ( ) && j < pattern.length ( )) {
			if (text.charAt ( i ) == pattern.charAt ( j )) {
				j++;
				i++;
			} else {
				j = 0;
				if (text.charAt ( i ) != pattern.charAt ( j )) i++;
			}
		}
		return j == pattern.length ( );

		/** Testcase Dry Run --> text = "baabaaa", pattern = "baaa"
		 *  b: j = 0, i = 0, text[0] = pattern[0] --> true, j = 1
		 *  a: j = 1, i = 1, text[1] = pattern[1] --> true, j = 2
		 *  a: j = 2, i = 2, text[2] = pattern[2] --> true, j = 3
		 *  b: j = 3, i = 3, text[3] ≠ pattern[3] --> false, j = 0
		 *  a: j = 0, i = 4, text[4] = pattern[0] --> true, j = 1
		 *  a: j = 1, i = 5, text[5] = pattern[1] --> true, j = 2
		 *  a: j = 2, i = 6, text[6] = pattern[2] --> true, j = 3
		 */
	}

	public static void main(String[] args) {
		System.out.println ( search ( "abceabcdabceabcd", "abcd" ) );   // true
		System.out.println ( search ( "abceabcdabceabcd", "gfhij" ) );   // false
		System.out.println ( search ( "baabaaa", "baaa" ) );   // true
		System.out.println ( search ( "aabbccddeeddff", "ddee" ) );   // true
	}
}
