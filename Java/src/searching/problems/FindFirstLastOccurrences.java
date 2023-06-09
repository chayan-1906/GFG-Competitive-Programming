package searching.problems;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
public class FindFirstLastOccurrences {

	public static ArrayList<Long> find(long[] arr, int n, int x) {
		long left = 0, right = arr.length - 1;
		ArrayList<Long> arrayList = new ArrayList<> ( );
		long firstOccur = -1L;
		long lastOccur = -1L;
		if (arr.length == 0) {
			arrayList.add ( firstOccur );
			arrayList.add ( lastOccur );
			return arrayList;
		}

		/// finding first occurrence
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (arr[ Math.toIntExact ( mid ) ] == x) {
				right = mid - 1;
				firstOccur = mid;
			} else if (arr[ Math.toIntExact ( mid ) ] > x) right = mid - 1;
			else if (arr[ Math.toIntExact ( mid ) ] < x) left = mid + 1;
		}

		/// finding last occurrence
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (arr[ Math.toIntExact ( mid ) ] == x) {
				left = mid + 1;
				lastOccur = mid;
			} else if (arr[ Math.toIntExact ( mid ) ] > x) right = mid - 1;
			else if (arr[ Math.toIntExact ( mid ) ] < x) left = mid + 1;
		}
		arrayList.add ( firstOccur );
		arrayList.add ( lastOccur );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( find ( new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125}, 9, 5 ) );   // 2 5
		System.out.println ( find ( new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125}, 9, 7 ) );   // 6 6
		System.out.println ( find ( new long[]{6, 9}, 2, 9 ) );   // 1 1
	}
}
