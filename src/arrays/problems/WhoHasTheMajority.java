package arrays.problems;

public class WhoHasTheMajority {

	public static int majorityWins(int[] arr, int n, int x, int y) {
		int countX = 0;
		int countY = 0;
		for (int j : arr) {
			if (j == x) countX++;
			if (j == y) countY++;
		}
		if (countX == countY) {
			return Math.min ( x, y );
		}
		return countX > countY ? x : y;
	}

	public static void main(String[] args) {
		System.out.println ( majorityWins ( new int[]{1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5}, 11, 4, 5 ) );   // 4
		System.out.println ( majorityWins ( new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8, 1, 7 ) );   // 1
	}
}
