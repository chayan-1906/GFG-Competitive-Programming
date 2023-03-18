package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU5MA%3D%3D
public class IndexFirstOccurrenceInSorted {

	// TC = O(n)
	public static int findIndexOfFirstOccurrenceNaive(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[ i ] == x) return i;
		}
		return -1;
	}

	// TC = O(logn)
	public static int findIndexOfFirstOccurrenceRecursive(int[] arr, int x) {
		return bSearch ( arr, 0, arr.length - 1, x );
	}

	public static int bSearch(int[] arr, int left, int right, int x) {
		int mid = left + (right - left) / 2;
		if (left <= right) {
			if (arr[ mid ] == x) {
				if (mid == 0 || arr[ mid ] != arr[ mid - 1 ]) return mid;
				else return bSearch ( arr, left, mid - 1, x );
			} else if (arr[ mid ] > x) return bSearch ( arr, left, mid - 1, x );
			else if (arr[ mid ] < x) return bSearch ( arr, mid + 1, right, x );
		}
		return -1;
	}

	// TC = O(logn)
	public static int findIndexOfFirstOccurrenceIterative(int[] arr, int x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[ mid ] == x) {
				if (mid == 0 || arr[ mid ] != arr[ mid - 1 ]) return mid;
				else right = mid - 1;
			} else if (arr[ mid ] < x) left = mid + 1;
			else if (arr[ mid ] > x) right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( findIndexOfFirstOccurrenceNaive ( new int[]{1, 10, 10, 10, 20, 20, 40}, 20 ) ); // 4
		System.out.println ( findIndexOfFirstOccurrenceRecursive ( new int[]{1, 10, 10, 10, 20, 20, 40}, 20 ) ); // 4
		System.out.println ( findIndexOfFirstOccurrenceIterative ( new int[]{1, 10, 10, 10, 20, 20, 40}, 20 ) ); // 4
		System.out.println ( findIndexOfFirstOccurrenceNaive ( new int[]{10, 20, 30}, 15 ) ); // -1
		System.out.println ( findIndexOfFirstOccurrenceRecursive ( new int[]{10, 20, 30}, 15 ) ); // -1
		System.out.println ( findIndexOfFirstOccurrenceIterative ( new int[]{10, 20, 30}, 15 ) ); // -1
		System.out.println ( findIndexOfFirstOccurrenceNaive ( new int[]{15, 15, 15}, 15 ) ); // 0
		System.out.println ( findIndexOfFirstOccurrenceRecursive ( new int[]{15, 15, 15}, 15 ) ); // 0
		System.out.println ( findIndexOfFirstOccurrenceIterative ( new int[]{15, 15, 15}, 15 ) ); // 0
	}
}
