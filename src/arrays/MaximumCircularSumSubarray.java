package arrays;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/ODExOA%3D%3D */
public class MaximumCircularSumSubarray {

	public static int findMaxCircularSumSubarray(int[] array) {
		int result = array[ 0 ];
		/// TC = O(n²)
        /*for (int i = 0; i < array.length; i++) {
            int currentMax = array[ i ];
            int currentSum = array[ i ];
            for (int j = 1; j < array.length; j++) {
                int index = (i + j) % array.length;
                currentSum += array[ index ];
                currentMax = Math.max ( currentMax, currentSum );
            }
            result = Math.max ( result, currentMax );
        }*/

		/// TC = O(n)
		/* Calculating normal/linear subarray sum, using Kadane's Algo */
		int maxLinearEnding = array[ 0 ];
		int maxLinearSum = array[ 0 ];
		for (int i = 1; i < array.length; i++) {
			maxLinearEnding = Math.max ( maxLinearEnding + array[ i ], array[ i ] );
			maxLinearSum = Math.max ( maxLinearSum, maxLinearEnding );
		}

		/* Calculating circular subarray sum, using modified Kadane's Algo */
		int totalArraySum = array[ 0 ];
		int minCircularEnding = array[ 0 ];
		int minCircularSum = array[ 0 ];
		for (int i = 1; i < array.length; i++) {
			totalArraySum += array[ i ];
			minCircularEnding = Math.min ( minCircularEnding + array[ i ], array[ i ] );
			minCircularSum = Math.min ( minCircularSum, minCircularEnding );
		}
		int maxCircularSum = totalArraySum - minCircularSum;
//        System.out.println ( "maxCircularSum: " + maxCircularSum );
//        System.out.println ( "maxLinearSum: " + maxLinearSum );
		result = Math.max ( maxLinearSum, maxCircularSum );

		return result;
	}

	public static void main(String[] args) {
		System.out.println ( findMaxCircularSumSubarray ( new int[]{10, 5, -5} ) ); // 15
		System.out.println ( findMaxCircularSumSubarray ( new int[]{5, -2, 3, 4} ) );   // 12
		System.out.println ( findMaxCircularSumSubarray ( new int[]{2, 3, -4} ) );  // 5
		System.out.println ( findMaxCircularSumSubarray ( new int[]{8, -4, 3, -5, 4} ) );   // 12
		System.out.println ( findMaxCircularSumSubarray ( new int[]{-3, 4, 6, -2} ) );  // 10
		System.out.println ( findMaxCircularSumSubarray ( new int[]{-8, 7, 6} ) );  // 13
		System.out.println ( findMaxCircularSumSubarray ( new int[]{3, -4, 5, 6, -8, 7} ) );    // 17
	}
}
