package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/square-root
public class SquareRootFloor {

	static long floorSqrt(long x) {
		long low = 0, high = x, sqrt = -1;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			long midSq = mid * mid;
			if (midSq == x) return mid;
			else if (midSq > x) high = mid - 1;
			else {
				low = mid + 1;
				sqrt = mid;
			}
		}
		return sqrt;
	}

	public static void main(String[] args) {
		System.out.println ( floorSqrt ( 5 ) ); // 2
		System.out.println ( floorSqrt ( 4 ) ); // 2
	}
}
