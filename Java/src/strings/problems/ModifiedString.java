package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/the-modified-string-1587115621
public class ModifiedString {

	public static long modified(String string) {
		long count = 0;
		for (int i = 1; i < string.length ( ) - 1; i++) {
			if (string.charAt ( i ) == string.charAt ( i - 1 ) && string.charAt ( i ) == string.charAt ( i + 1 )) {
				i++;
				count++;
			}
		}
		return count;

		/**
		 * Testcase Dry Run --> "aabbbcc"
		 * a: i = 0, j = 1
		 * a: i = 1, j = 2
		 * b: i = 2, j = 1
		 * b: i = 3, j = 2
		 * b: i = 4, j = 3
		 * c: i = 5, j = 1,
		 * c: i = 6, j = 2
		 */
	}

	public static void main(String[] args) {
		System.out.println ( modified ( "aabbbcc" ) );  // 1
		System.out.println ( modified ( "aaaaa" ) );  // 2
	}
}
