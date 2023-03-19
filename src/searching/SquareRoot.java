package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU4OA%3D%3D
public class SquareRoot {

	public static int findSquareRoot(int square) {
		int low = 1, high = square, sqrt = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int msq = mid * mid;
			if (msq == square) return mid;
			else if (msq > square) high = mid - 1;
			else {
				low = mid + 1;
				sqrt = mid;
			}
		}
		return sqrt;
	}

	public static void main(String[] args) {
		System.out.println ( findSquareRoot ( 16 ) );   // 4
		System.out.println ( findSquareRoot ( 15 ) );   // 3
		System.out.println ( findSquareRoot ( 9 ) );   // 3
		System.out.println ( findSquareRoot ( 5 ) );   // 2
		System.out.println ( findSquareRoot ( 7 ) );   // 2
	}
}
