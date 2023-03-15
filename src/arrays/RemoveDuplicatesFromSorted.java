package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTQzMw%3D%3D */
public class RemoveDuplicatesFromSorted {

	public static void removeDuplicates(int[] array) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (int i : array) hashSet.add ( i );
		System.out.println ( Arrays.toString ( hashSet.toArray ( ) ) );
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "Enter no. of array elements: " );
		int size = scanner.nextInt ( );
		int[] array = new int[ size ];
		System.out.println ( "Enter array elements: " );
		for (int i = 0; i < size; i++) array[ i ] = scanner.nextInt ( );

		removeDuplicates ( array );
	}
}
