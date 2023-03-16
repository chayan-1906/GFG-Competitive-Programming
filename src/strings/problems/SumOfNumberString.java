package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/sum-of-numbers-in-string-1587115621
public class SumOfNumberString {

	public static long findSum(String str) {
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < str.length ( ); i++) {
			if (str.charAt ( i ) >= '0' && str.charAt ( i ) <= '9')
				temp = temp * 10 + Integer.parseInt ( String.valueOf ( str.charAt ( i ) ) );
			else {
				sum += temp;
				temp = 0;
			}
		}
		sum += temp;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println ( findSum ( "1abc23" ) );    // 24
		System.out.println ( findSum ( "geeks4geeks" ) );   // 4
	}
}
