package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/digital-root
public class DigitalRoot {

	public static int digitalRoot(int n) {
		if (n == 0) return 0;
		int digit = (n % 10) + digitalRoot ( n / 10 );
		return (digit % 10) + (digit / 10);
	}

	public static void main(String[] args) {
		System.out.println ( digitalRoot ( 1 ) );   // 1
		System.out.println ( digitalRoot ( 99 ) );   // 18
		System.out.println ( digitalRoot ( 99999 ) );   // 9
	}
}
