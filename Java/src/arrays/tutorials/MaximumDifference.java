package arrays.tutorials;

import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTE2NQ%3D%3D */
public class MaximumDifference {

	public static void findMaximumDifference(int[] array) {
		int maxDifference = array[ 1 ] - array[ 0 ];
		int minVal = array[ 0 ];
		for (int i : array) {
			minVal = Math.min ( minVal, i );
			maxDifference = Math.max ( maxDifference, i - minVal );
		}
		System.out.println ( "Maximum difference: " + maxDifference );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		findMaximumDifference ( array );
	}
}
