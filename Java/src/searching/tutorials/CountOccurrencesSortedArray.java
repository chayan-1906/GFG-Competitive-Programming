package searching.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU5MQ%3D%3D
public class CountOccurrencesSortedArray {

	public static int findCountOccurrencesSortedArray(int[] array, int x) {
		int left = 0, right = array.length - 1;
		int firstOccurIndex = -1, lastOccurIndex = -1;

		// first occur
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == x) {
				/*if (mid == 0 || array[ mid ] != array[ mid - 1 ]) {
					firstOccurIndex = mid;
					break;
				} else right = mid - 1;*/
				firstOccurIndex = mid;
				right = mid - 1;
			} else if (array[ mid ] > x) right = mid - 1;
			else if (array[ mid ] < x) left = mid + 1;
		}

		// last occur
		left = 0;
		right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == x) {
				/*if (mid == array.length - 1 || array[ mid ] != array[ mid + 1 ]) {
					lastOccurIndex = mid;
					break;
				} else left = mid + 1;*/
				lastOccurIndex = mid;
				left = mid + 1;
			} else if (array[ mid ] > x) right = mid - 1;
			else if (array[ mid ] < x) left = mid + 1;
		}
		return firstOccurIndex == -1 && lastOccurIndex == -1 ? 0 : lastOccurIndex - firstOccurIndex + 1;
	}

	public static void main(String[] args) {
		System.out.println ( findCountOccurrencesSortedArray ( new int[]{10, 20, 20, 20, 30, 30}, 20 ) );   // 3
		System.out.println ( findCountOccurrencesSortedArray ( new int[]{10, 10, 10, 10, 10}, 10 ) );   // 5
		System.out.println ( findCountOccurrencesSortedArray ( new int[]{5, 8, 10}, 7 ) );   // 0
		System.out.println ( findCountOccurrencesSortedArray ( new int[]{10, 10, 10, 10}, 10 ) );   // 4
		System.out.println ( findCountOccurrencesSortedArray ( new int[]{1, 1, 2, 2, 2, 2, 3}, 2 ) );   // 4
	}
}
