package arrays.tutorials;

import java.util.HashMap;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTgyNQ%3D%3D */
public class FrequenciesSortedArray {

	public static void findFreqOfElementsArray(int[] array) {
		/// using hashmap
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (int element : array) {
			if (hashMap.containsKey ( element )) {
				hashMap.put ( element, hashMap.get ( element ) + 1 );
			} else {
				hashMap.put ( element, 1 );
			}
		}
		System.out.println ( hashMap );

		/// just printing frequencies
		int freq = 1;
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1 && array[ i ] == array[ i + 1 ]) {
				freq++;
//				System.out.println ( "Freq of " + array[ i ] + " is: " + freq );
			} else {
				System.out.println ( "Freq of " + array[ i ] + " is: " + freq );
				freq = 1;   // resetting the freq value
			}
		}

	}

	public static void main(String[] args) {
		findFreqOfElementsArray ( new int[]{12, 12, 13, 16, 20} );
		System.out.println ( );
		findFreqOfElementsArray ( new int[]{12, 12, 16, 18, 20} );
		System.out.println ( );
		findFreqOfElementsArray ( new int[]{12, 12, 16, 20, 20} );
	}
}
