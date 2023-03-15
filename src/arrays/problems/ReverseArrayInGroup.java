package arrays.problems;

import java.util.ArrayList;

public class ReverseArrayInGroup {

	public static void reverseInGroups(ArrayList<Integer> arrayList, int n, int k) {
		for (int i = 0; i < arrayList.size ( ); i += k) {
			int left = i;
			int temp;
			int right = Math.min ( i + k - 1, arrayList.size ( ) - 1 );
			while (left < right) {
				temp = arrayList.get ( left );
				arrayList.set ( left, arrayList.get ( right ) );
				arrayList.set ( right, temp );
				left++;
				right--;
			}
		}
		System.out.println ( arrayList );
	}

	public static void main(String[] args) {
        /*ArrayList<Integer> arrayList1 = new ArrayList<> ( );
        arrayList1.add ( 1 );
        arrayList1.add ( 2 );
        arrayList1.add ( 3 );
        arrayList1.add ( 4 );
        arrayList1.add ( 5 );   // 1 2 3 4 5
        arrayList1.add ( 6 );   // 1 2 3 4 5
        arrayList1.add ( 7 );   // 1 2 3 4 5
        arrayList1.add ( 8 );   // 1 2 3 4 5
        reverseInGroups ( arrayList1, arrayList1.size ( ), 3 ); // 3 2 1 5 4
        ArrayList<Integer> arrayList2 = new ArrayList<> ( );
        arrayList2.add ( 5 );
        arrayList2.add ( 6 );
        arrayList2.add ( 8 );
        arrayList2.add ( 9 );   // 5 6 8 9
        reverseInGroups ( arrayList2, arrayList2.size ( ), 3 ); // 8 6 5 9*/
		ArrayList<Integer> arrayList3 = new ArrayList<> ( );
		arrayList3.add ( 35 );
		arrayList3.add ( 56 );
		arrayList3.add ( 48 );
		arrayList3.add ( 21 );
		arrayList3.add ( 87 );
		reverseInGroups ( arrayList3, 5, 77 ); // 87 21 48 56 35
	}
}
