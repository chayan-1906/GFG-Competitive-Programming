package searching.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MjEyNw%3D%3D
public class AllocateMinimumPages {

	public static int findMinimumPages(int[] array, int k) {
		int sum = 0, max = 0;
		for (int integer : array) {
			sum += integer;
			max = Math.max ( max, integer );
		}
		int left = max, right = sum, minimumAllocPages = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (isFeasible ( array, k, mid )) {
				minimumAllocPages = mid;
				right = mid - 1;    // if feasible move towards left half
			} else left = mid + 1;  // else move towards right half
		}
		return minimumAllocPages;
	}

	public static boolean isFeasible(int[] array, int k, int mid) {
		int requiredStudent = 1, sum = 0;
		for (int integer : array) {
			if (sum + integer > mid) {
				requiredStudent++;
				sum = integer;
			} else sum += integer;
		}
		return requiredStudent <= k;
	}

	/**
	 * Testcase Dry Run --> {10, 5, 20}, k = 2
	 * sum = 10 + 5 + 20 = 35, max = 20
	 * low = 20, high = 35
	 * mid = (20 + 35)/2 = 27, isFeasible() {20 + 10 = 30 > 27 --> true requiredStudent = 2, sum = 10; 10 + 5 = 15 > 27 --> false, sum = 15.........} --> true, minimumAllocPages = 27
	 * mid = (20 + 26)/2 = 23, minimumAllocPages = 23
	 * mid = (20 + 22)/2 = 21, minimumAllocPages = 21
	 * mid = (20 + 20)/2 = 20, minimumAllocPages = 20
	 */

	public static void main(String[] args) {
		System.out.println ( findMinimumPages ( new int[]{10, 20, 30, 40}, 2 ) );  // 60
		System.out.println ( findMinimumPages ( new int[]{10, 20, 30}, 1 ) );  // 60
		System.out.println ( findMinimumPages ( new int[]{10, 5, 30, 1, 2, 5, 10, 10}, 3 ) );  // 30
		System.out.println ( findMinimumPages ( new int[]{10, 20, 10, 30}, 2 ) );  // 40
		System.out.println ( findMinimumPages ( new int[]{10, 5, 20}, 2 ) );  // 20
	}
}

