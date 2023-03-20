package arrays.problems;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {

	public static ArrayList<Integer> leaders(int[] arr, int n) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		int currentLeader = arr[ arr.length - 1 ];
		arrayList.add ( currentLeader );
		for (int i = arr.length - 2; i >= 0; i--) {
			currentLeader = Math.max ( currentLeader, arr[ i ] );
			if (currentLeader == arr[ i ]) arrayList.add ( currentLeader );
		}
		Collections.reverse ( arrayList );
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println ( leaders ( new int[]{16, 17, 4, 3, 5, 2}, 6 ) );    // 17 5 2
		System.out.println ( leaders ( new int[]{1, 2, 3, 4, 0}, 5 ) );    // 4 0
	}
}
