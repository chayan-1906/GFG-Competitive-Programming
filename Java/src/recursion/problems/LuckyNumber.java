package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/lucky-numbers2911
public class LuckyNumber {

	public static boolean isLucky(int n) {
		return checkLuckyOrNot ( n, 2 );
	}

	public static boolean checkLuckyOrNot(int n, int count) {
		if (count > n) return true;
		if (n % count == 0) return false;
		n = n - (n / count);    // to eliminate unlucky number
		System.out.println ( n );
		return checkLuckyOrNot ( n, count + 1 );
	}

	public static void main(String[] args) {
//		System.out.println ( isLucky ( 5 ) );  // false
//		System.out.println ( isLucky ( 19 ) );  // true
		System.out.println ( isLucky ( 15 ) );  // true
	}
}
