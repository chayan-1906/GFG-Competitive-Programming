package strings.tutorials;

import java.util.Arrays;

public class LongestSubstringDistinctCharacter {

	public static int CHAR = 256;

	public static int findLengthOfLongestSubstring(String string) {
		int maxLength = 0;
		int[] prev = new int[ CHAR ];
		Arrays.fill ( prev, -1 );
		int j = 0;
		for (int i = 0; i < string.length ( ); i++) {
			j = Math.max ( j, prev[ string.charAt ( i ) ] + 1 );
			int maxEnd = i - j + 1;
			maxLength = Math.max ( maxLength, maxEnd );
			prev[ string.charAt ( i ) ] = i;
		}
		return maxLength;

		/**
		 * Testcase Dry Run: abcadbd
		 * 'a': j = 0, i = 0, maxEnd = 1, maxLength = 1, prev['a'] = 0
		 * 'b': j = 0, i = 1, maxEnd = 2, maxLength = 2, prev['b'] = 1
		 * 'c': j = 0, i = 2, maxEnd = 3, maxLength = 3, prev['c'] = 2
		 * 'a': j = 1, i = 3, maxEnd = 3, maxLength = 3, prev['a'] = 3
		 * 'd': j = 1, i = 4, maxEnd = 4, maxLength = 4, prev['d'] = 4
		 * 'b': j = 2, i = 5, maxEnd = 4, maxLength = 4, prev['b'] = 5
		 * 'd': j = 5, i = 6, maxEnd = 2, maxLength = 4, prev['d'] = 6
		 */
	}

	public static void main(String[] args) {
		System.out.println ( findLengthOfLongestSubstring ( "abcdabc" ) );  // 4
		System.out.println ( findLengthOfLongestSubstring ( "aaa" ) );  // 1
		System.out.println ( findLengthOfLongestSubstring ( "" ) );  // 0
		System.out.println ( findLengthOfLongestSubstring ( "abaacdbab" ) );  // 4
		System.out.println ( findLengthOfLongestSubstring ( "abcabcbb" ) );  // 3
	}
}
