package daily_problems;

// https://practice.geeksforgeeks.org/problems/1ccf56f107bcb24242469ea45c02f852165a2184/1
public class MinimumInteger {

	public static int minimumInteger(int N, int[] A) {
		long S = 0;
		for (int integer : A) S += integer;
		long minInt = Integer.MAX_VALUE;
		for (long X : A) {
			if (S <= (long) A.length * X) minInt = Math.min ( minInt, X );
		}
		return (int) minInt;
	}

	public static void main(String[] args) {
		System.out.println ( minimumInteger ( 3, new int[]{1, 3, 2} ) );   // 2
		System.out.println ( minimumInteger ( 1, new int[]{3} ) );   // 3
	}
}
