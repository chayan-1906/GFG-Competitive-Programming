package arrays;

import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTYyMw%3D%3D */
public class CheckSortedArray {

	public static boolean checkIsSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[ i ] > array[ i + 1 ]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		System.out.println ( checkIsSorted ( array ) );
	}
}
