package searching.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Searching/video/MTQyMA%3D%3D
public class MedianOf2SortedArrays {

	public static double medianOf2SortedArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int begin1 = 0, end1 = n1;
		while (begin1 <= end1) {
			int i1 = (begin1 + end1) / 2;
			int i2 = (n1 + n2 + 1) / 2 - i1;

			int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[ i1 ];
			int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[ i1 - 1 ];
			int min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[ i2 ];
			int max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[ i2 - 1 ];

			if (max1 <= min2 && max2 <= min1) {
				if ((n1 + n2) % 2 == 0)
					return ((double) Math.max ( max1, max2 ) + Math.min ( min1, min2 )) / 2;
				else return Math.max ( max1, max2 );
			} else if (max1 > max2) end1 = i1 - 1;
			else begin1 = i1 + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println ( medianOf2SortedArrays ( new int[]{10, 20, 30, 40, 50}, new int[]{5, 15, 25, 35, 45} ) );   // 27.5
		System.out.println ( medianOf2SortedArrays ( new int[]{1, 2, 3, 4, 5}, new int[]{10, 20, 30, 40, 50} ) );   // 7.5
		System.out.println ( medianOf2SortedArrays ( new int[]{10, 20, 30, 40, 50, 60}, new int[]{1, 2, 3, 4, 5} ) );   // 10.0
		System.out.println ( medianOf2SortedArrays ( new int[]{10, 20, 30, 40, 50}, new int[]{5, 15, 25, 30, 35, 55, 65, 75, 85} ) );   // 32.5
		System.out.println ( medianOf2SortedArrays ( new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7, 8} ) );   // 4
		System.out.println ( medianOf2SortedArrays ( new int[]{1, 2}, new int[]{2, 3, 4} ) );   // 2
	}
}
