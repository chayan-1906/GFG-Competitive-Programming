package searching.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTU5Mw%3D%3D
public class Count1sSortedArray {

	public static int findCount1sSortedArray(int[] array) {
		int left = 0, right = array.length - 1;
		int firstIndexof1 = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == 1) {
				firstIndexof1 = mid;
				right = mid - 1;
			} else if (array[ mid ] == 0) left = mid + 1;
		}
		return firstIndexof1 == -1 ? 0 : array.length - firstIndexof1;
	}

	public static void main(String[] args) {
		System.out.println ( findCount1sSortedArray ( new int[]{0, 0, 0, 1, 1, 1, 1} ) );   // 4
		System.out.println ( findCount1sSortedArray ( new int[]{1, 1, 1, 1, 1} ) );   // 5
		System.out.println ( findCount1sSortedArray ( new int[]{0, 0, 0, 0} ) );   // 0
	}
}
