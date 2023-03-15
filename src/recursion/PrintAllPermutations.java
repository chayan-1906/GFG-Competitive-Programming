package recursion;

import java.util.ArrayList;

public class PrintAllPermutations {

	public static void printAllPermutations(ArrayList<String> arrayList, String string, int i) {
		if (i == string.length ( ) - 1) {
			arrayList.add ( string );
			return;
		}
		for (int j = i; j < string.length ( ); j++) {
			string = swap ( string, i, j );
			printAllPermutations ( arrayList, string, i + 1 );
			string = swap ( string, j, i );
		}
	}

	private static String swap(String string, int i, int j) {
		char temp;
		char[] charArray = string.toCharArray ( );
		temp = charArray[ i ];
		charArray[ i ] = charArray[ j ];
		charArray[ j ] = temp;
		return String.valueOf ( charArray );
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<> ( );
		printAllPermutations ( arrayList1, "ABC", 0 ); // ABC ACB BAC BCA CAB CBA
		System.out.println ( arrayList1 );
		ArrayList<String> arrayList2 = new ArrayList<> ( );
		printAllPermutations ( arrayList2, "AB", 0 );  // AB BA
		System.out.println ( arrayList2 );
		ArrayList<String> arrayList3 = new ArrayList<> ( );
		printAllPermutations ( arrayList3, "", 0 );
		System.out.println ( arrayList3 );
	}
}
