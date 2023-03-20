package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/fibonacci-using-recursion
public class FibonacciSeries {

	public static void printFibSeries(int t1, int t2, int n) {
		if (n > 0) {
			int t3 = t1 + t2;
			System.out.print ( t3 + " " );
			printFibSeries ( t2, t3, n - 1 );
		}
	}

	public static int nthFibonacciNumber(int n) {
		if (n <= 1) return n;
		return nthFibonacciNumber ( n - 1 ) + nthFibonacciNumber ( n - 2 );
	}

	public static void main(String[] args) {
		int t1 = 0;
		int t2 = 1;
		System.out.print ( t1 + " " + t2 + " " );
		printFibSeries ( t1, t2, 10 );
		System.out.println ( nthFibonacciNumber ( 10 ) );
	}
}
