package searching.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/problem/median-of-two-sorted-arrays1618
public class MedianOf2SortedArrays {

	public static int findMedian(int[] arr, int n, int[] brr, int m) {
		int begin1 = 0, end1 = n;
		while (begin1 <= end1) {
			int i1 = (begin1 + end1) / 2;
			int i2 = (n + m + 1) / 2 - i1;

			int min1 = i1 == n ? Integer.MAX_VALUE : arr[ i1 ];
			int max1 = i1 == 0 ? Integer.MIN_VALUE : arr[ i1 - 1 ];
			int min2 = i2 == m ? Integer.MAX_VALUE : brr[ i2 ];
			int max2 = i2 == 0 ? Integer.MIN_VALUE : brr[ i2 - 1 ];

			if (max1 <= min2 && max2 <= min1) {
				if ((n + m) % 2 == 0)
					return (Math.max ( max1, max2 ) + Math.min ( min1, min2 )) / 2;
				else return Math.max ( max1, max2 );
			} else if (max1 > min2) end1 = i1 - 1;
			else begin1 = i1 + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( findMedian ( new int[]{1, 2, 3, 4, 5}, 5, new int[]{3, 4, 5, 6, 7, 8}, 6 ) );   // 4
		System.out.println ( findMedian ( new int[]{1, 2}, 2, new int[]{2, 3, 4}, 3 ) );   // 2
	}
}
