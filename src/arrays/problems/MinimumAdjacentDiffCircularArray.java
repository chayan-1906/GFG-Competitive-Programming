package arrays.problems;

public class MinimumAdjacentDiffCircularArray {

	public static int minAdjDiff(int[] arr, int n) {
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++)
			minDiff = Math.min ( minDiff, Math.abs ( arr[ i + 1 ] - arr[ i ] ) );
		minDiff = Math.min ( minDiff, Math.abs ( arr[ arr.length - 1 ] - arr[ 0 ] ) );
		return minDiff;
	}

	public static void main(String[] args) {
		System.out.println ( minAdjDiff ( new int[]{8, -8, 9, -9, 10, -11, 12}, 7 ) );  // 4
		System.out.println ( minAdjDiff ( new int[]{10, -3, -4, 7, 6, 5, -4, -1}, 7 ) );  // 1
	}
}
