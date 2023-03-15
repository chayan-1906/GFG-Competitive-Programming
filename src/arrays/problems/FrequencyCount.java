package arrays.problems;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyCount {

	public static void frequencyCount(int[] arr, int N, int P) {
		HashMap<Integer, Integer> hashMap = new HashMap<> ( );
		for (int i = 0; i <= arr.length; i++) hashMap.put ( i, 0 );
		for (Integer integer : arr) {
			if (hashMap.containsKey ( integer )) hashMap.put ( integer, hashMap.get ( integer ) + 1 );
		}
//        System.out.println ( hashMap );
		for (int i = 1; i <= arr.length; i++) arr[ i - 1 ] = hashMap.get ( i );
		System.out.println ( Arrays.toString ( arr ) );
	}

	public static void main(String[] args) {
		frequencyCount ( new int[]{2, 3, 2, 3, 5}, 5, 5 );  // 0 2 2 0 1
		frequencyCount ( new int[]{3, 3, 3, 3}, 4, 3 ); // 0 0 4 0
	}
}
