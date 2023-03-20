package arrays.problems;

import java.util.Arrays;

public class RearrangeArray {

	public static void arrange(long[] arr, int n) {
		long[] result = new long[ arr.length ];
		for (int i = 0; i < arr.length; i++) {
			result[ i ] = arr[ (int) arr[ i ] ];
		}
		System.arraycopy ( result, 0, arr, 0, arr.length );
		System.out.println ( Arrays.toString ( arr ) );
	}

	public static void main(String[] args) {
		arrange ( new long[]{1, 0}, 2 );    // 0 1
		arrange ( new long[]{4, 0, 2, 1, 3}, 5 );   // 3 4 2 0 1
	}
}
