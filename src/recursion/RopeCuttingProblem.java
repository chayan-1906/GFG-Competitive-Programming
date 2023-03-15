package recursion;

public class RopeCuttingProblem {

	public static int findMaxNoOfRopePieces(int n, int a, int b, int c) {
		if (n == 0) return 0;
		if (n <= 0) return -1;
		int max = Math.max ( findMaxNoOfRopePieces ( n - a, a, b, c ), Math.max ( findMaxNoOfRopePieces ( n - b, a, b, c ), findMaxNoOfRopePieces ( n - c, a, b, c ) ) );
		if (max == -1) return -1;
		return max + 1;
	}

	public static void main(String[] args) {
		System.out.println ( findMaxNoOfRopePieces ( 23, 11, 9, 12 ) ); // 2
		System.out.println ( findMaxNoOfRopePieces ( 5, 2, 5, 1 ) );   // 5
		System.out.println ( findMaxNoOfRopePieces ( 23, 12, 9, 11 ) ); // 2
		System.out.println ( findMaxNoOfRopePieces ( 5, 4, 2, 6 ) ); // -1
	}
}
