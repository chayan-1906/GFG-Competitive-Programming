package arrays.problems;

import java.util.Arrays;

public class RotateArrayDPlaces {

	public static void rotateArr(int[] arr, int n, int d) {
		d = d % arr.length;
		reverseArray ( arr, 0, d - 1 );
		reverseArray ( arr, d, arr.length - 1 );
		reverseArray ( arr, 0, arr.length - 1 );
		System.out.println ( Arrays.toString ( arr ) );
	}

	public static void reverseArray(int[] array, int left, int right) {
		while (left < right) {
			int temp = array[ left ];
			array[ left ] = array[ right ];
			array[ right ] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		rotateArr ( new int[]{1, 2, 3, 4, 5}, 5, 2 );    // 3 4 5 1 2
		rotateArr ( new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 10, 3 ); // 8 10 12 14 16 18 20 2 4 6
	}
}
