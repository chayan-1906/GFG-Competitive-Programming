package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/print-1-to-n-without-using-loops-1587115620
public class Print1ToN {

	public static void print1ToN(int n) {
		if (n == 1) {
			System.out.print ( n + " " );
			return;
		}
		print1ToN ( n - 1 );
		System.out.print ( n + " " );
	}

	public static void main(String[] args) {
		print1ToN ( 6 );    // 1 2 3 4 5 6
		System.out.println ( );
		print1ToN ( 10 );    // 1 2 3 4 5 6 7 8 9 10
		System.out.println ( );
		print1ToN ( 1 );    // 1
		System.out.println ( );
	}
}
