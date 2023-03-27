package arrays.tutorials;

import java.util.Arrays;
import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTMwMA%3D%3D */
public class LeftRotateArrayByDPlaces {

	public static void reverse(int[] array, int low, int high) {
		while (low < high) {
			int temp = array[ low ];
			array[ low ] = array[ high ];
			array[ high ] = temp;
			low++;
			high--;
		}
	}

	public static void leftRotateArrayByDPlaces(int[] array, int dPlace) {
		dPlace = dPlace % array.length;
		reverse ( array, 0, dPlace - 1 );
		reverse ( array, dPlace, array.length - 1 );
		reverse ( array, 0, array.length - 1 );
		System.out.println ( Arrays.toString ( array ) );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );
		System.out.print ( "Enter value of d: " );
		int dPlaces = scanner.nextInt ( );

		leftRotateArrayByDPlaces ( array, dPlaces );
	}
}
