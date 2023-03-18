package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/search-an-element-in-an-array-1587115621
public class LinearSearch {

	public static int search(int[] arr, int N, int X) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[ i ] == X) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( search ( new int[]{1, 2, 3, 4}, 4, 3 ) );  // 2
		System.out.println ( search ( new int[]{1, 2, 3, 4, 5}, 5, 5 ) );  // 4
	}
}
