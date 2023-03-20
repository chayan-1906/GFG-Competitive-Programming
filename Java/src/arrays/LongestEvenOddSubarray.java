package arrays;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTQwMw%3D%3D */
public class LongestEvenOddSubarray {

	public static int findLongestEvenOddSubarrayLength(int[] array) {
		int longestSubarrayLength = 1;
		/// TC = O(n²)
		/*for (int i = 0; i < array.length; i++) {
			int currentLength = 1;
			for (int j = i; j < array.length - 1; j++) {
				if ((array[ j ] % 2 == 0 && array[ j + 1 ] % 2 != 0)
						|| (array[ j ] % 2 != 0 && array[ j + 1 ] % 2 == 0)) {
					currentLength++;
				} else break;
			}
			longestSubarrayLength = Math.max ( longestSubarrayLength, currentLength );
		}*/

		/// TC = O(n)
		int currentLength = 1;
		for (int i = 0; i < array.length - 1; i++) {
			if ((array[ i ] % 2 == 0 && array[ i + 1 ] % 2 != 0)
					|| (array[ i ] % 2 != 0 && array[ i + 1 ] % 2 == 0)) {
				currentLength++;
				longestSubarrayLength = Math.max ( longestSubarrayLength, currentLength );
			} else currentLength = 1;
		}
		return longestSubarrayLength;
	}

	public static void main(String[] args) {
		System.out.println ( findLongestEvenOddSubarrayLength ( new int[]{5, 10, 20, 6, 3, 8} ) );    // 3
		System.out.println ( findLongestEvenOddSubarrayLength ( new int[]{10, 12, 14, 7, 8} ) );    // 3
		System.out.println ( findLongestEvenOddSubarrayLength ( new int[]{7, 10, 13, 14} ) );   // 4
		System.out.println ( findLongestEvenOddSubarrayLength ( new int[]{10, 12, 8, 4} ) );    // 1
	}
}
