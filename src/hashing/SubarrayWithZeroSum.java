package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithZeroSum {

	public static ArrayList<Integer> findSubArrayWithZeroSum(int[] array) {
		/*ArrayList<Integer> arrayList = new ArrayList<> ( );
		ArrayList<Integer> result = new ArrayList<> ( );
		int prefixSum = 0;
		int prefixSumNonZeroIndex = -1;
		int prefixSumZeroIndex = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (array[ i ] == 0 || arrayList.contains ( prefixSum )) {
				arrayList.add ( prefixSum );
				break;
			}
			if (prefixSum == 0) {
				arrayList.add ( prefixSum );
				prefixSumZeroIndex = i;
				break;
			}
			arrayList.add ( prefixSum );
		}
		for (int i = 0; i < arrayList.size ( ); i++)
			prefixSumNonZeroIndex = arrayList.indexOf ( prefixSum ) + 1;
		if (prefixSumZeroIndex != -1) {
			// prefix sum = 0
			for (int i = 0; i <= prefixSumZeroIndex; i++) result.add ( array[ i ] );
		} else if (prefixSumNonZeroIndex != -1) {
			// prefix sum found in arraylist or 0 present in array
			for (int i = prefixSumNonZeroIndex; i < arrayList.size ( ); i++) result.add ( array[ i ] );
		}
		if (result.isEmpty ( )) result.add ( -1 );
		return result;*/
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		int prefixSum = 0;
		int start = -1, end = -1;
		for (int i = 0; i < array.length; i++) {
			prefixSum += array[ i ];
			if (prefixSum == 0) {
				start = 0;
				end = i;
				break;
			} else if (array[ i ] == 0) {
				start = end = i;
				break;
			} else if (hashMap.containsKey ( prefixSum - 0 )) {
				start = hashMap.get ( prefixSum - 0 ) + 1;
				end = i;
				break;
			}
			/// hashmap: prefix is key, index is value
			hashMap.put ( prefixSum, i );
		}
		ArrayList<Integer> resultSubarray = new ArrayList<> ( );
		if (end != -1) for (int i = start; i <= end; i++) resultSubarray.add ( array[ i ] );
		else resultSubarray.add ( -1 );
		return resultSubarray;
	}

	public static void main(String[] args) {
		System.out.println ( findSubArrayWithZeroSum ( new int[]{4, -3, 2, 1} ) );  // {-3, 2, 1}
		System.out.println ( findSubArrayWithZeroSum ( new int[]{-3, 4, -3, -1, 1} ) );  // {4, -3, -1}
		System.out.println ( findSubArrayWithZeroSum ( new int[]{5, 3, 9, -4, -6, 7, -1} ) );  // {-6, 7, 1}
		System.out.println ( findSubArrayWithZeroSum ( new int[]{-3, 2, 3, 1, 6} ) );  // no subarray exists with 0 sum
		System.out.println ( findSubArrayWithZeroSum ( new int[]{1, 4, -5} ) );  // {1, 4, -5}
		System.out.println ( findSubArrayWithZeroSum ( new int[]{1, 4, -5, 1} ) );  // {1, 4, -5}
	}
}
