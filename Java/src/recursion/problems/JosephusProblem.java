package recursion.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/josephus-problem
public class JosephusProblem {

	public static int josephus(int n, int k) {
		//Your code here
		return findSurvivor ( n, k ) + 1;
	}

	public static int findSurvivor(int n, int k) {
		if (n == 1) return 0;
		return (findSurvivor ( n - 1, k ) + k) % n;
	}

	public static void main(String[] args) {
		System.out.println ( josephus ( 3, 2 ) ); // 3
		System.out.println ( josephus ( 5, 3 ) ); // 4
	}
}
