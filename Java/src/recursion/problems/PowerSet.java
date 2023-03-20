package recursion.problems;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/power-set-using-recursion
public class PowerSet {

	public static void findPowerSet(ArrayList<String> arrayList, String string, String current, int i) {
		if (i == string.length ( )) {
			arrayList.add ( current );
			return;
		}
		findPowerSet ( arrayList, string, current, i + 1 );
		findPowerSet ( arrayList, string, current + string.charAt ( i ), i + 1 );
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<> ( );
		findPowerSet ( arrayList1, "abc", "", 0 );
		System.out.println ( arrayList1 );

		ArrayList<String> arrayList2 = new ArrayList<> ( );
		findPowerSet ( arrayList2, "a", "", 0 );
		System.out.println ( arrayList2 );
	}
}
