package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/count-only-repeated2047
// TODO: ASKED IN GFG CHAT
public class CountOnlyRepeated {

	public static Pair findRepeating(long[] arr, int n) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

		}
		return new Pair ( -1, -1 );
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
	}
}
