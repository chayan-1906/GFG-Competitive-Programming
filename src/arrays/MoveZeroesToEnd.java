package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTQzMw%3D%3D */
public class MoveZeroesToEnd {

	private static void moveZeroesToEnd(int[] array) {
		int noOfNonZeroes = 0;
		for (int i = 0; i < array.length; i++)
			if (array[ i ] != 0) array[ noOfNonZeroes++ ] = array[ i ];
		while (noOfNonZeroes < array.length) array[ noOfNonZeroes++ ] = 0;
		System.out.println ( Arrays.toString ( array ) );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		moveZeroesToEnd ( array );
	}
}
