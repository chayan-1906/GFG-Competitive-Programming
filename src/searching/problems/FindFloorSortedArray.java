package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/floor-in-a-sorted-array-1587115620
public class FindFloorSortedArray {

	public static int findFloor(long[] arr, int n, long x) {
		int left = 0, right = arr.length - 1;
		int largest = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[ mid ] == x) return mid;
			else if (arr[ mid ] > x) right = mid - 1;
			else {
				largest = mid;
				left = mid + 1;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		System.out.println ( findFloor ( new long[]{1, 2, 8, 10, 11, 12, 19}, 7, 0 ) );    // -1
		System.out.println ( findFloor ( new long[]{1, 2, 8, 10, 11, 12, 19}, 7, 5 ) );    // 1
	}
}
