package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/who-will-win-1587115621
public class SearchInSortedArray {

	public static int searchInSorted(int[] arr, int N, int K) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[ mid ] == K) return 1;
			else if (arr[ mid ] > K) right = mid - 1;
			else if (arr[ mid ] < K) left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( searchInSorted ( new int[]{1, 2, 3, 4, 6}, 5, 6 ) );    // 4
		System.out.println ( searchInSorted ( new int[]{1, 3, 4, 5, 6}, 5, 2 ) );    // -1
	}
}
