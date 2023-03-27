package arrays.tutorials;

import java.util.Arrays;
import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTE2Mw%3D%3D */
public class LeftRotateArrayByOne {

	public static void leftRotateArrayByOne(int[] array) {
		int firstElement = array[ 0 ];
		for (int i = 0; i < array.length - 1; i++) {
			array[ i ] = array[ i + 1 ];
			System.out.println ( array[ i ] );
		}
		array[ array.length - 1 ] = firstElement;
		System.out.println ( Arrays.toString ( array ) );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		leftRotateArrayByOne ( array );
	}
}
