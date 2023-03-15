package arrays;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTQwMg%3D%3D */
public class MaximumSubarraySum {

	public static int findMaximumSubarraySum(int[] array) {
		int maxSum = array[ 0 ];
		/// TC = O(n²)
		/*for (int i = 0; i < array.length; i++) {
			int currentSum = 0;
			for (int j = i; j < array.length; j++) {
				currentSum += array[ j ];
				maxSum = Math.max ( maxSum, currentSum );
			}
		}*/

		/// TC = O(n), Kadane's Algorithm
		int maxEnding = array[ 0 ];
		for (int i = 1; i < array.length; i++) {
			maxEnding = Math.max ( maxEnding + array[ i ], array[ i ] );    /* Compare the maximum between (current element + subarray till previous element) & current element */
			maxSum = Math.max ( maxSum, maxEnding );
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println ( findMaximumSubarraySum ( new int[]{2, 3, -8, 7, -1, 2, 3} ) ); // 11
		System.out.println ( findMaximumSubarraySum ( new int[]{5, 8, 3} ) );   // 16
		System.out.println ( findMaximumSubarraySum ( new int[]{-6, -1, -8} ) );    // -1
		System.out.println ( findMaximumSubarraySum ( new int[]{-5, 1, -2, 3, -1, 2, -2} ) );    // 4
	}
}
