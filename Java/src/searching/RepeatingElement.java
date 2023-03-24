package searching;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTg4NQ%3D%3D
public class RepeatingElement {

	public static int findRepeatingElement(int[] array) {
		int slow = array[ 0 ] + 1;
		int fast = array[ 0 ] + 1;
		do {
			slow = array[ slow ] + 1;
			fast = array[ array[ fast ] + 1 ] + 1;
		} while (slow != fast);
		slow = array[ 0 ] + 1;
		while (slow != fast) {
			slow = array[ slow ] + 1;
			fast = array[ fast ] + 1;
		}
		return slow - 1;

		/**
		 * Testcase Dry Run --> {0, 2, 1, 3, 5, 4, 6, 2}
		 *          indices -->  0  1  2  3  4  5  6  7
		 * slow = 1, fast = 1
		 * slow = arr[1] + 1 = 3, fast = arr[arr[1] + 1] + 1 = arr[3] + 1 = 4
		 * slow = arr[3] + 1 = 4, fast = arr[arr[4] + 1] + 1 = arr[6] + 1 = 7
		 * slow = arr[4] + 1 = 6, fast = arr[arr[7] + 1] + 1 = arr[3] + 1 = 4
		 * slow = arr[6] + 1 = 7, fast = arr[arr[4] + 1] + 1 = arr[6] + 1 = 7
		 *
		 * slow = arr[0] + 1 = 1, fast = 7
		 * slow = arr[1] + 1 = 3, fast = arr[7] + 1 = 3
		 */
	}

	public static void main(String[] args) {
		System.out.println ( findRepeatingElement ( new int[]{0, 2, 1, 3, 5, 4, 6, 2} ) );  // 2
		System.out.println ( findRepeatingElement ( new int[]{0, 2, 1, 3, 2, 2} ) );  // 2
		System.out.println ( findRepeatingElement ( new int[]{0, 0} ) );  // 0
		System.out.println ( findRepeatingElement ( new int[]{0, 0} ) );  // 0
		System.out.println ( findRepeatingElement ( new int[]{2, 3, 4, 0, 1, 3, 3} ) );  // 3
	}
}
