package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU5Nw%3D%3D
public class SearchInSortedRotatedArray {

	public static int searchInSortedRotatedArray(int[] array, int target) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == target) return mid;
			else if (array[ left ] < array[ mid ]) {
				// left array sorted
				if (array[ left ] <= target && target < array[ mid ]) right = mid - 1;    // x lies between left to mid
				else if (array[ left ] == target) return left;
				else left = mid + 1;
			} else {
				// right array sorted
				if (array[ mid ] < target && target <= array[ right ]) left = mid + 1;    // x lies between mid to right
				else if (array[ right ] == target) return right;
				else right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( searchInSortedRotatedArray ( new int[]{10, 20, 30, 40, 50, 8, 9}, 30 ) );  // 2
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 300, 10, 20}, 40 ) );  // -1
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 400, 1000, 10, 20}, 10 ) );  // 4
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 500, 1000, 2000, 10, 20}, 100 ) );  // 0
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 500, 1000, 2000, 10, 20}, 25 ) );  // -1
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 500, 1000, 2000, 10, 20}, 40 ) );  // -1
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 500, 10, 20, 30, 40, 50}, 40 ) );  // 5
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 500, 10, 20, 30, 40, 50}, 500 ) );  // 1
		System.out.println ( searchInSortedRotatedArray ( new int[]{100, 200, 300, 400, 20, 30, 40}, 50 ) );  // -1
		System.out.println ( searchInSortedRotatedArray ( new int[]{10, 20, 40, 60, 5, 8}, 5 ) );  // 4
		System.out.println ( searchInSortedRotatedArray ( new int[]{10, 20, 40, 60, 5, 8}, 8 ) );  // 5
		System.out.println ( searchInSortedRotatedArray ( new int[]{3, 1}, 1 ) );  // 1
		System.out.println ( searchInSortedRotatedArray ( new int[]{5, 1, 2, 3, 4}, 1 ) );  // 1
	}
}
