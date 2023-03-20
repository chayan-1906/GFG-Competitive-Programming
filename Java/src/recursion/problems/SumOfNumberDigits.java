package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/sum-of-digits-of-a-number
public class SumOfNumberDigits {

	public static int findSumNumberDigits(int number) {
		if (number == 0) return 0;
		return (number % 10) + findSumNumberDigits ( number / 10 );
	}

	public static void main(String[] args) {
		System.out.println ( findSumNumberDigits ( 253 ) ); // 10
		System.out.println ( findSumNumberDigits ( 9987 ) );    // 33
		System.out.println ( findSumNumberDigits ( 10 ) );  // 1
	}
}
