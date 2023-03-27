package arrays.tutorials;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/NzAyNA%3D%3D */
public class SubarrayGivenSum {

	public static boolean isSubArrayExists(int[] array, int sum) {
		/// TC = O(n²)
        /*for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[ j ];
                if (currentSum == sum) return true;
            }
        }*/

		/// TC = O(n)
		int s = 0, currentSum = 0;
		for (int element : array) {
			currentSum += element;
			while (sum < currentSum) {
				currentSum -= array[ s ];
				s++;
				System.out.println ( "s = " + s );
			}
			if (sum == currentSum) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println ( isSubArrayExists ( new int[]{1, 4, 20, 3, 10, 5}, 33 ) );  // true
		System.out.println ( isSubArrayExists ( new int[]{1, 4, 0, 0, 3, 10, 5}, 7 ) );    // true
		System.out.println ( isSubArrayExists ( new int[]{2, 4}, 3 ) );    // false
		System.out.println ( isSubArrayExists ( new int[]{1, 2, 3, 4, 5}, 11 ) );
	}
}
