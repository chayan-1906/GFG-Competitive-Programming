package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU5Mg%3D%3D
public class IndexLastOccurrenceSorted {

	public static int findIndexOfLastOccurrenceIterative(int[] arr, int x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[ mid ] == x) {
				if (mid == arr.length - 1 || arr[ mid ] != arr[ mid + 1 ]) return mid;
				else left = mid + 1;
			} else if (arr[ mid ] > x) right = mid - 1;
			else if (arr[ mid ] < x) left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( findIndexOfLastOccurrenceIterative ( new int[]{10, 15, 20, 20, 40, 40}, 20 ) );   // 3
		System.out.println ( findIndexOfLastOccurrenceIterative ( new int[]{5, 8, 8, 10, 10}, 10 ) );   // 4
		System.out.println ( findIndexOfLastOccurrenceIterative ( new int[]{8, 10, 10, 12}, 7 ) );   // -1
	}
}
