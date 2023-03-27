package searching.tutorials;

public class BinarySearch {

	// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTQzNw%3D%3D
	public static int binarySearchIterative(int[] arr, int n, int k) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[ mid ] == k) return mid;
			else if (arr[ mid ] > k) {
				// if element is smaller than mid, search in left of mid
				right = mid - 1;
			} else if (arr[ mid ] < k) {
				// if element is greater than mid, search in right of mid
				left = mid + 1;
			}
		}
		return -1;
	}

	// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTQzOA%3D%3D
	public static int binarySearchRecursive(int[] arr, int n, int k) {
		return bSearch ( arr, 0, arr.length - 1, k );
	}

	public static int bSearch(int[] arr, int left, int right, int k) {
		int mid = left + (right - left) / 2;
//		int mid = (left + right) / 2;
		if (left <= right) {
			if (arr[ mid ] == k) return mid;
			else if (arr[ mid ] > k) {
				// if element is smaller than mid, search in left of mid
				return bSearch ( arr, left, mid - 1, k );
			} else if (arr[ mid ] < k) {
				// if element is greater than mid, search in right of mid
				return bSearch ( arr, mid + 1, right, k );
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( binarySearchIterative ( new int[]{1, 2, 3, 4, 5}, 5, 4 ) );    // 3
		System.out.println ( binarySearchRecursive ( new int[]{1, 2, 3, 4, 5}, 5, 4 ) );    // 3

		System.out.println ( binarySearchIterative ( new int[]{11, 22, 33, 44, 55}, 5, 445 ) );    // -1
		System.out.println ( binarySearchRecursive ( new int[]{1, 2, 3, 4, 5}, 5, 445 ) );    // -1

		System.out.println ( binarySearchIterative ( new int[]{10, 20, 30, 40, 50, 60}, 6, 20 ) );    // 1
		System.out.println ( binarySearchRecursive ( new int[]{10, 20, 30, 40, 50, 60}, 6, 20 ) );    // 1

		System.out.println ( binarySearchIterative ( new int[]{5, 15, 25}, 3, 25 ) );    // 2
		System.out.println ( binarySearchRecursive ( new int[]{5, 15, 25}, 3, 25 ) );    // 2

		System.out.println ( binarySearchIterative ( new int[]{5, 10, 15, 25, 35}, 5, 20 ) );    // -1
		System.out.println ( binarySearchRecursive ( new int[]{5, 10, 15, 25, 35}, 5, 20 ) );    // -1

		System.out.println ( binarySearchIterative ( new int[]{10, 15}, 2, 20 ) );    // -1
		System.out.println ( binarySearchRecursive ( new int[]{10, 15}, 2, 20 ) );    // -1

		System.out.println ( binarySearchIterative ( new int[]{10, 15}, 2, 5 ) );    // -1
		System.out.println ( binarySearchRecursive ( new int[]{10, 15}, 2, 5 ) );    // -1

		System.out.println ( binarySearchIterative ( new int[]{10, 10}, 2, 10 ) );    // 0 or 1
		System.out.println ( binarySearchRecursive ( new int[]{10, 10}, 2, 10 ) );    // 0 or 1
	}
}
