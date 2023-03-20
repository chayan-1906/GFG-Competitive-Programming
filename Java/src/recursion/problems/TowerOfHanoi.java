package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/tower-of-hanoi-1587115621
public class TowerOfHanoi {

	public static long toh(int n, int from, int to, int aux) {
		if (n == 1) {
			System.out.println ( "move disk " + n + " from rod " + from + " to rod " + to );
			return (long) (Math.pow ( 2, n ) - 1);
		}
		toh ( n - 1, from, aux, to );
		System.out.println ( "move disk " + n + " from rod " + from + " to rod " + to );
		toh ( n - 1, aux, to, from );
		return (long) (Math.pow ( 2, n ) - 1);
	}

	public static void main(String[] args) {
		System.out.println ( toh ( 2, 1, 3, 2 ) );  // 3
		System.out.println ( toh ( 3, 1, 3, 2 ) );  // 7
	}
}
