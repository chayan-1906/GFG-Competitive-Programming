package arrays;

public class MaximumSubarraySumKElements {

	public static int maxSumofKElements(int[] array, int k) {
		/// TC = O(n*k)
		int maxSum = 0;
        /*if (k <= array.length) {
            for (int i = 0; i <= array.length - k; i++) {
                int currentSum = 0;
                for (int j = i; j < i + k; j++) {
                    currentSum += array[ j ];
                    maxSum = Math.max ( maxSum, currentSum );
                }
            }
        }*/

		/// TC = 0(n)
		int currentSum = 0;
		for (int i = 0; i < k; i++) currentSum += array[ i ];   // sum of first k elements
		maxSum = currentSum;
		for (int i = k; i < array.length; i++) {
			currentSum = (currentSum + array[ i ]) - array[ i - k ];    // add the next element where window ends & remove the very first element of corresponding windo
			maxSum = Math.max ( maxSum, currentSum );
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println ( maxSumofKElements ( new int[]{1, 8, 30, -5, 20, 7}, 3 ) );    // 45
		System.out.println ( maxSumofKElements ( new int[]{5, -10, 6, 90, 3}, 2 ) );    // 96
		System.out.println ( maxSumofKElements ( new int[]{1, 8, 30, -5, 20, 7}, 4 ) );    // 34
	}
}
