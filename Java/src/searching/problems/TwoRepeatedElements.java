package searching.problems;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/two-repeated-elements-1587115621
public class TwoRepeatedElements {

	public static void main(String[] args) {
		System.out.println ( Arrays.toString ( twoRepeated ( new int[]{1, 2, 1, 3, 4, 3}, 4 ) ) );  // 1 3
		System.out.println ( Arrays.toString ( twoRepeated ( new int[]{1, 2, 2, 1}, 4 ) ) );  // 2 1
	}

	public static int[] twoRepeated(int[] arr, int N) {
		int[] count = new int[ arr.length ];
		int j = 0;
		int[] ans = new int[ 2 ];
		for (int i = 0; i < arr.length; i++) {
			count[ arr[ i ] ]++;
			if (count[ arr[ i ] ] == 2) {
				ans[ j ] = arr[ i ];
				j++;
			}
		}
		System.out.println ( Arrays.toString ( count ) );
		return ans;
	}
}
