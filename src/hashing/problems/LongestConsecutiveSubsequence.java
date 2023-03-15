package hashing.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Hashing/problem/longest-consecutive-subsequence2449
public class LongestConsecutiveSubsequence {

	static int findLongestConseqSubseq(int[] arr, int N) {
		if (arr.length == 0) return 0;
		int[] arr2 = new int[ 1000001 ];
		int count = 0;
		int maxInteger = -1;
		int maxLen = Integer.MIN_VALUE;
		for (int integer : arr) {
			arr2[ integer ]++;  // counting occurrence of each element and incrementing by 1
			maxInteger = Math.max ( maxInteger, integer );  // maxLen is the largest of array
		}
		for (int i = 0; i <= maxInteger; i++) {
			if (arr2[ i ] > 0) count++;    // increment count by 1 until arr2 contains arr[i+1]
			else {
				maxLen = Math.max ( maxLen, count );
				count = 0;
			}
			maxLen = Math.max ( maxLen, count );
		}
		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println ( findLongestConseqSubseq ( new int[]{2, 6, 1, 9, 4, 5, 6, 3, 1000000}, 7 ) );
	}
}
