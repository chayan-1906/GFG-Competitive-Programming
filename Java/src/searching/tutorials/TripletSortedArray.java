package searching.tutorials;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/NzAyMg%3D%3D
public class TripletSortedArray {

	public static boolean findTripletInSortedArray(int[] array, int sum) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int i = 0; i < array.length - 2; i++)
			if (isPair ( array, sum - array[ i ], i + 1, arrayList )) {
				return true;
			}
		return false;
	}

	public static boolean isPair(int[] array, int sum, int startIndex, ArrayList<Integer> arrayList) {
		int left = startIndex;
		int right = array.length - 1;
		while (left < right) {
			if (array[ left ] + array[ right ] == sum) {
				arrayList.add ( array[ left ] );
				arrayList.add ( array[ right ] );
				System.out.println ( arrayList );
				return true;
			} else if (array[ left ] + array[ right ] < sum) left++;
			else if (array[ left ] + array[ right ] > sum) right--;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println ( findTripletInSortedArray ( new int[]{2, 3, 4, 8, 9, 20, 40}, 32 ) );    // true {4, 8, 20}
		System.out.println ( findTripletInSortedArray ( new int[]{1, 2, 5, 6}, 14 ) );    // false
		System.out.println ( findTripletInSortedArray ( new int[]{2, 5, 10, 15, 18}, 33 ) );    // true (5, 10, 18)
	}
}
