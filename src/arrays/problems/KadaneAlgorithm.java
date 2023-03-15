package arrays.problems;

public class KadaneAlgorithm {

	public static long maxSubarraySum(int[] arr, int n) {
		int maxEnding = arr[ 0 ];
		int maxSum = arr[ 0 ];
		for (int i = 1; i < arr.length; i++) {
			maxEnding = Math.max ( maxEnding + arr[ i ], arr[ i ] );
			maxSum = Math.max ( maxSum, maxEnding );
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println ( maxSubarraySum ( new int[]{1, 2, 3, -2, 5}, 5 ) ); // 9
		System.out.println ( maxSubarraySum ( new int[]{-1, -2, -3, -4}, 4 ) ); // -1
	}
}
