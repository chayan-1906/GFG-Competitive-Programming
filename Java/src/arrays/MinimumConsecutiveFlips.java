package arrays;

public class MinimumConsecutiveFlips {

	public static int[][] findMinimumConsFlips(int[] array) {
		/// TC = O(n)
		int[][] result = new int[ array.length / 2 ][ 2 ];
		for (int i = 1; i < array.length; i++) {
			if (array[ i ] != array[ i - 1 ]) {
				if (array[ i ] != array[ 0 ]) {
					System.out.print ( "From " + i + " to " );
//					result[ i ][ 0 ] = i;
				} else {
					System.out.println ( i - 1 );
//					result[ i ][ 1 ] = i - 1;
				}
			} else {
				// do nothing if consecutive elements are same
			}
		}
		if (array[ array.length - 1 ] != array[ 0 ]) System.out.println ( array.length - 1 );
		return result;
	}

	public static void main(String[] args) {
		System.out.println ( findMinimumConsFlips ( new int[]{1, 1, 0, 0, 0, 1} ) );    // from 2 to 4
		System.out.println ( findMinimumConsFlips ( new int[]{1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1} ) );    // from 1 to 3 & from 5 to 6
		System.out.println ( findMinimumConsFlips ( new int[]{1, 1, 1, 1} ) );    // from
		System.out.println ( findMinimumConsFlips ( new int[]{0, 1} ) );    // from 0 to 0 OR from 1 to 1
		System.out.println ( findMinimumConsFlips ( new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 1} ) );    // from 2 to 3 & from 6 to 7
	}
}
