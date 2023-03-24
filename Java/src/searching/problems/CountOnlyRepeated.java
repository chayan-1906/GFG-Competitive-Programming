package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/count-only-repeated2047
public class CountOnlyRepeated {

	public static Pair findRepeating(long[] arr, int n) {
		if (arr.length - (arr[ arr.length - 1 ] - arr[ 0 ]) == 1)
			return new Pair ( -1, -1 );
		int left = 0, right = arr.length - 1;
		int mid = 0;
		while (left < right) {
			mid = left + (right - left) / 2;
			if (arr[ mid ] >= mid + arr[ 0 ]) left = mid + 1;
			else right = mid;
		}
		return new Pair ( arr[ mid ], arr.length - (arr[ arr.length - 1 ] - arr[ 0 ]) );

		/**
		 * Testcase Dry Run --> {1,2,3,3,4}
		 * left = 0, right = 4
		 * mid = 2, 3 >= 2 + 1 --> true, left = 3
		 * mid = 3, 3 >= 3 + 1 --> false, right = 3
		 */
	}

	public static void main(String[] args) {
		System.out.println ( findRepeating ( new long[]{1, 2, 3, 3, 4}, 5 ) );  // 3 2
		System.out.println ( findRepeating ( new long[]{2, 3, 4, 5, 5}, 5 ) );  // 5 2
	}

	static class Pair {
		long x;
		long y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair{" +
					"x=" + x +
					", y=" + y +
					'}';
		}
	}
}
