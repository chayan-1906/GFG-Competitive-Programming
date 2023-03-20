package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/count-total-digits-in-a-number
public class CountNoOfDigits {

	public static int findNoOfDigits(int number) {
		if (number <= 9) return 1;
		return 1 + findNoOfDigits ( number / 10 );
	}

	public static void main(String[] args) {
		System.out.println ( findNoOfDigits ( 99999 ) );    // 5
		System.out.println ( findNoOfDigits ( 1 ) );    // 1
		System.out.println ( findNoOfDigits ( 0 ) );    // 1
	}
}
