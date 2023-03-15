package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTE2Mg%3D%3D */
public class ReverseArray {

	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[ i ];
			array[ i ] = array[ array.length - 1 - i ];
			array[ array.length - 1 - i ] = temp;
		}
		System.out.println ( Arrays.toString ( array ) );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		reverseArray ( array );
	}
}
