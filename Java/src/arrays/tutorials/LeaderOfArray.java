package arrays.tutorials;

import java.util.ArrayList;
import java.util.Collections;

/* https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Arrays/video/MTMwMA%3D%3D */
public class LeaderOfArray {

	/**
	 * Leader:
	 * An element is called the leader of an array if there is no element
	 * greater than it on the right side
	 */

	public static ArrayList<Integer> findLeaderOfArray(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		int leaderIndex = array.length - 1;
		arrayList.add ( array[ leaderIndex ] );
		for (int i = array.length - 2; i >= 0; i--) {   // loop starts length - 2 because the last element is always a leader
			if (array[ i ] > array[ leaderIndex ]) {    // if array[i] (indices less than length - 1) is greater than array[leaderIndex], make i as leaderIndex
				leaderIndex = i;
				arrayList.add ( array[ leaderIndex ] );
			}
		}
		Collections.reverse ( arrayList );
		System.out.println ( arrayList );
		return arrayList;
	}

	public static void main(String[] args) {
		findLeaderOfArray ( new int[]{7, 10, 4, 3, 6, 5, 2} );  // {10, 6, 5, 2}
		findLeaderOfArray ( new int[]{10, 20, 30} );    // {30}
		findLeaderOfArray ( new int[]{30, 20, 10} );    // {30, 20, 10}
		findLeaderOfArray ( new int[]{16, 17, 4, 3, 5, 2} );    // {17, 5, 2}
		findLeaderOfArray ( new int[]{5, 4, 3, 2, 1} ); // {5, 4, 3, 2, 1}
		findLeaderOfArray ( new int[]{13, 14, 3, 8, 2} ); // {14, 8, 2} Coding Ninjas
		findLeaderOfArray ( new int[]{6, 7, 4, 2, 5, 3} ); // {7, 5, 3} Coding Ninjas
		findLeaderOfArray ( new int[]{11, 10, 9, 8} ); // {11, 10, 9, 8} Coding Ninjas
		findLeaderOfArray ( new int[]{5, 10, 11, 12, -1, -2} ); // {12, -1, -2} Coding Ninjas
		findLeaderOfArray ( new int[]{10, -11, -3, -2} ); // {10, -2} Coding Ninjas
	}
}
