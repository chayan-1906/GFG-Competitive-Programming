package recursion;

public class SubsetSum {

	public static int countSubsets(int[] array, int n, int sum) {
		if (n == 0) return sum == 0 ? 1 : 0;
		return countSubsets ( array, n - 1, sum ) + countSubsets ( array, n - 1, sum - array[ n - 1 ] );
	}

	public static void main(String[] args) {
		System.out.println ( countSubsets ( new int[]{10, 20, 15}, 3, 25 ) );   // 1
		System.out.println ( countSubsets ( new int[]{10, 5, 2, 3, 6}, 5, 8 ) );    // 2
		System.out.println ( countSubsets ( new int[]{1, 2, 3}, 3, 4 ) );    // 1
		System.out.println ( countSubsets ( new int[]{10, 20, 15}, 3, 37 ) );    // 0
		System.out.println ( countSubsets ( new int[]{10, 20, 15}, 3, 0 ) );    // 0
	}
}
