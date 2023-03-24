package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/allocate-minimum-number-of-pages0937
public class AllocateMinimumPages {

	public static int findPages(int[] A, int N, int M) {
		if (A.length < M) return -1;
		int sum = 0, max = 0;
		for (Integer integer : A) {
			sum += integer;
			max = Math.max ( max, integer );
		}
		int left = max, right = sum, minAllocPages = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (isFeasible ( A, M, mid )) {
				minAllocPages = mid;
				right = mid - 1;
			} else left = mid + 1;
		}
		return minAllocPages;
	}

	public static boolean isFeasible(int[] A, int noOfStudents, int mid) {
		int requiredStudent = 1, sum = 0;
		for (Integer integer : A) {
			if (integer + sum > mid) {
				requiredStudent++;
				sum = integer;
			} else sum += integer;
		}
		return requiredStudent <= noOfStudents;
	}

	public static void main(String[] args) {
		System.out.println ( findPages ( new int[]{12, 34, 67, 90}, 4, 2 ) );   // 113
		System.out.println ( findPages ( new int[]{15, 17, 20}, 3, 2 ) );   // 32
		System.out.println ( findPages ( new int[]{12, 34, 67, 90}, 4, 5 ) );   // -1
	}
}
