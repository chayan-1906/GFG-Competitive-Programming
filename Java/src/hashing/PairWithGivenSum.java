package hashing;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class PairWithGivenSum {

	public static int[] findPairWithGivenSum(int[] array, int sum) {
		int[] result = new int[ 2 ];
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<> ( );
		for (Integer integer : array) { // 8 3 4 2 5, sum = 6
			System.out.print ( integer + " " );
			if (hashSet.contains ( sum - integer )) {
				result[ 0 ] = integer;
				result[ 1 ] = sum - integer;
				return result;
			}
			hashSet.add ( integer );
			System.out.println ( hashSet );
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println ( "result : " + Arrays.toString ( findPairWithGivenSum ( new int[]{8, 3, 4, 2, 5}, 6 ) ) );
	}
}