package arrays.problems;

public class MaximumIndex {

	public static int maxIndexDiff(int[] array, int n) {
		int i = 0;
		int j = array.length - 1;
		int maxIndexDiff = Integer.MIN_VALUE;
		while (i <= j) {
			if (array[ i ] <= array[ j ]) {
				System.out.println ( "Entered in if" );
				maxIndexDiff = Math.max ( maxIndexDiff, j - i );
				i = 0;
				j--;
			} else {
				System.out.println ( "Entered in else" );
				i++;
			}
//            System.out.println ( "maxIndexDiff = " + maxIndexDiff );
//            System.out.println ( "i = " + i );
		}
		return maxIndexDiff;
	}

	public static void main(String[] args) {
		System.out.println ( maxIndexDiff ( new int[]{1, 10}, 2 ) );    // 1
		System.out.println ( maxIndexDiff ( new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1}, 9 ) );    // 6
		System.out.println ( maxIndexDiff ( new int[]{31, 6, 81, 9, 12, 5, 100, 1}, 8 ) );    // 6
		System.out.println ( maxIndexDiff ( new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10 ) );    // 6
	}
}
