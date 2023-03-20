package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/count-1s-in-binary-array-1587115620
public class Count1sDescendingArray {

	public static int countOnes(int[] array) {
		int left = 0, right = array.length - 1;
		int lastOccurIndex = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[ mid ] == 1) {
				left = mid + 1;
				lastOccurIndex = mid;
			} else if (array[ mid ] == 0) right = mid - 1;
		}
		return lastOccurIndex == -1 ? 0 : lastOccurIndex + 1;
	}

	public static void main(String[] args) {
		System.out.println ( countOnes ( new int[]{1, 1, 1, 1, 1, 0, 0, 0} ) ); // 5
		System.out.println ( countOnes ( new int[]{1, 1, 0, 0, 0, 0, 0, 0} ) ); // 2
	}
}
