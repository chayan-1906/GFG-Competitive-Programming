package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/left-index-1587115620
public class LeftIndex {

	static int leftIndex(int N, int[] arr, int X) {
		int low = 0, high = arr.length - 1;
		int firstOccur = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[ mid ] == X) {
				high = mid - 1;
				firstOccur = mid;
			} else if (arr[ mid ] > X) high = mid - 1;
			else if (arr[ mid ] < X) low = mid + 1;
		}
		return firstOccur;
	}

	public static void main(String[] args) {
		System.out.println ( leftIndex ( 10, new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6, 7}, 1 ) ); // 0
		System.out.println ( leftIndex ( 7, new int[]{10, 20, 20, 20, 20, 20, 20}, 20 ) ); // 1
	}
}
