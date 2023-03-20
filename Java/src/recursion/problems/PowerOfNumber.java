package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/power-using-recursion
public class PowerOfNumber {

	public static long findPowerOfNumber(int number, int power) {
		long result = 1L;
		for (int i = 1; i < power; i++) {
			if (i == 1) result = ((long) number * number) % 1000000007;
			else result = (result * number) % 1000000007;
			System.out.println ( "result = " + result );
		}
		return result % 1000000007;
	}

	public static int findPowerOfNumberRecursively(int number, int power) {
		if (power == 0) return 1;
		else if (power == 1) return number;
		else return number * findPowerOfNumberRecursively ( number, power - 1 );
	}

	public static void main(String[] args) {
//		System.out.println ( findPowerOfNumber ( 2, 4 ) );  // 16
//		System.out.println ( findPowerOfNumber ( 2, 0 ) );  // 1
//		System.out.println ( findPowerOfNumber ( 361, 163 ) );  // 1

		System.out.println ( findPowerOfNumberRecursively ( 2, 4 ) );  // 16
//		System.out.println ( findPowerOfNumberRecursively ( 2, 0 ) );  // 1
//		System.out.println ( findPowerOfNumberRecursively ( 361, 163 ) );  // 1
	}
}
