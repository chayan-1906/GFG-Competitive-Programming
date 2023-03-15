package arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {

	static List<Integer> pattern(int n) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		findPattern ( arrayList, n, n );
//        System.out.println ( arrayList );
		return arrayList;
	}

	static void findPattern(ArrayList<Integer> arrayList, int originalNumber, int n) {
		if (n > 0) {
			arrayList.add ( n );
			findPattern ( arrayList, originalNumber, n - 5 );
		} else if (n == originalNumber)
			findPattern ( arrayList, originalNumber, n + 5 );
		arrayList.add ( n );
	}

	public static void main(String[] args) {
		System.out.println ( pattern ( 16 ) );  // 16 11 6 1 -4 1 6 11 16
		System.out.println ( pattern ( 10 ) );  // 10 5 0 5 10
	}
}
