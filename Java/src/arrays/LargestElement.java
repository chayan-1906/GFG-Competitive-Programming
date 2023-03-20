package arrays;

import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTYwMg%3D%3D*/
public class LargestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		int largestElementIndex = 0;
		for (int i = 0; i < size; i++) {
			if (array[ largestElementIndex ] < array[ i ]) largestElementIndex = i;
		}
		System.out.println ( "Largest element index: " + largestElementIndex + " Largest element: " + array[ largestElementIndex ] );
	}
}
