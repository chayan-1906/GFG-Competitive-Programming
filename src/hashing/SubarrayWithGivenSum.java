package hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SubarrayWithGivenSum {

	public static ArrayList<Integer> findSubArrayWithGivenSum(int[] array, int sum) {
		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<> ( );
		int prefixSum = 0;
		int start = -1, end = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (prefixSum - sum == 0) {
				start = 0;
				end = i;
				break;
			} /*else if (array[ i ] == sum) {
				start = end = i;
				break;
			} */ else if (hashMap.containsKey ( prefixSum - sum )) {
				start = hashMap.get ( prefixSum - sum ) + 1;
				end = i;
				break;
			}
			/// hashmap: prefixSum is key, array index is value
			hashMap.put ( prefixSum, i );
//			hashMap.put ( prefixSum, hashMap.getOrDefault ( prefixSum, 0 ) + 1 );
		}
		ArrayList<Integer> resultSubArray = new ArrayList<> ( );
		if (end != -1)
			for (int i = start; i <= end; i++) resultSubArray.add ( array[ i ] );
		else resultSubArray.add ( -1 );
		return resultSubArray;
	}

	public static void main(String[] args) {
		System.out.println ( findSubArrayWithGivenSum ( new int[]{5, 8, 6, 13, 3, -1}, 22 ) );  // 6, 13, 3
		System.out.println ( findSubArrayWithGivenSum ( new int[]{15, 2, 8, 10, -5, -8, 6}, 3 ) );  // 10, -5, -8, 6
		System.out.println ( findSubArrayWithGivenSum ( new int[]{3, 2, 5, 6}, 10 ) );  // 3, 2, 5
		System.out.println ( findSubArrayWithGivenSum ( new int[]{3, 2, 10, 5, 6}, 10 ) );  // 10
		System.out.println ( findSubArrayWithGivenSum ( new int[]{3, 2, 6}, 10 ) );  // no subarray exists with given sum
	}
}
