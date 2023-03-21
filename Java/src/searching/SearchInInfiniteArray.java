package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU4OQ%3D%3D
public class SearchInInfiniteArray {

	public static int binarySearch(int[] array, int x) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == x) return mid;
			else if (array[ mid ] > x) right = mid - 1;
			else if (array[ mid ] < x) left = mid + 1;
		}
		return -1;
	}

	public static int searchInInfiniteArray(int[] array, int x) {
		if (array[ 0 ] == 0) return 0;
		int i = 1;
		while (array[ i ] < x) i = i * 2;
		if (array[ i ] == x) return i;
		return binarySearch ( array, x );
	}

	public static void main(String[] args) {
		System.out.println ( searchInInfiniteArray ( new int[]{1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 1000/*,...............*/}, 100 ) );    // 7
	}
}
