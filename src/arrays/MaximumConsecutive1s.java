package arrays;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTQ3MA%3D%3D */
public class MaximumConsecutive1s {

	public static int findNoOfMaxConsecutive1s(int[] array) {
		int maxConsecutive1s = 0;
		int currentConsecutive1s = 0;
		for (int i : array) {
			if (i == 0) currentConsecutive1s = 0;
			else {
				currentConsecutive1s++;
				maxConsecutive1s = Math.max ( maxConsecutive1s, currentConsecutive1s );
			}
		}
		return maxConsecutive1s;
	}

	public static void main(String[] args) {
		System.out.println ( findNoOfMaxConsecutive1s ( new int[]{0, 1, 1, 0, 1, 0} ) );    // 2
		System.out.println ( findNoOfMaxConsecutive1s ( new int[]{1, 1, 1, 1} ) );  // 4
		System.out.println ( findNoOfMaxConsecutive1s ( new int[]{0, 0, 0} ) ); // 0
		System.out.println ( findNoOfMaxConsecutive1s ( new int[]{1, 0, 1, 1, 1, 1, 0, 1, 1} ) );   // 4
	}
}
