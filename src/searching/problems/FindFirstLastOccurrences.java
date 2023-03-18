package searching.problems;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
// TODO: ASKED IN GFG CHAT
public class FindFirstLastOccurrences {

	public static ArrayList<Long> find(long arr[], int n, int x) {
		long left = 0, right = arr.length - 1;
		ArrayList<Long> arrayList = new ArrayList<> ( );
		if (arr.length == 0) {
			arrayList.add ( (long) -1 );
			arrayList.add ( (long) -1 );
			return arrayList;
		}

		/// finding first occurrence
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (arr[ Math.toIntExact ( mid ) ] == x) {
				if (mid == 0 || arr[ Math.toIntExact ( mid ) ] != arr[ Math.toIntExact ( mid - 1 ) ]) {
					arrayList.add ( mid );
					break;
				} else right = mid - 1;
			} else if (arr[ Math.toIntExact ( mid ) ] > x) right = mid - 1;
			else if (arr[ Math.toIntExact ( mid ) ] < x) left = mid + 1;
		}

		/// finding last occurrence
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (arr[ Math.toIntExact ( mid ) ] == x) {
				if (mid == arr.length - 1 || arr[ Math.toIntExact ( mid ) ] != arr[ Math.toIntExact ( mid + 1 ) ]) {
					arrayList.add ( mid );
					break;
				} else left = mid + 1;
			} else if (arr[ Math.toIntExact ( mid ) ] > x) right = mid - 1;
			else if (arr[ Math.toIntExact ( mid ) ] < x) left = mid + 1;
		}
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( find ( new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125}, 9, 5 ) );   // 2 5
		System.out.println ( find ( new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125}, 9, 7 ) );   // 6 6
		System.out.println ( find ( new long[]{6, 9}, 2, 9 ) );   // 1 1
	}
}
