package arrays.tutorials;

import java.util.Arrays;

public class PrefixSum {

	public static int findPrefixSum(int[] array, int low, int high) {
		int sum = 0;
		/// TC = O(n)
		/*for (int i = low; i <= high; i++) sum += array[ i ];
		return sum;*/

		/// TC = O(n)
		/*https://ide.geeksforgeeks.org/ea0241c5-af27-47c5-b4ee-0d719dd94a3d*/
		int[] prefixSumArray = new int[ array.length ];
		prefixSumArray[ 0 ] = array[ 0 ];
		for (int i = 1; i < array.length; i++)
			prefixSumArray[ i ] = prefixSumArray[ i - 1 ] + array[ i ];
		System.out.println ( Arrays.toString ( prefixSumArray ) );
		if (low == 0) return prefixSumArray[ high ];
		return prefixSumArray[ high ] - prefixSumArray[ low - 1 ];
	}

	public static void main(String[] args) {
		System.out.println ( findPrefixSum ( new int[]{2, 8, 3, 9, 6, 5, 4}, 0, 2 ) );    // 13
		System.out.println ( findPrefixSum ( new int[]{2, 8, 3, 9, 6, 5, 4}, 1, 3 ) );    // 20
		System.out.println ( findPrefixSum ( new int[]{2, 8, 3, 9, 6, 5, 4}, 2, 6 ) );    // 27
		System.out.println ( findPrefixSum ( new int[]{4, 6, -4}, 1, 2 ) );    // 27
	}
}
