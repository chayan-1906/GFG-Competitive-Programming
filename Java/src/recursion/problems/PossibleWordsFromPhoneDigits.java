package recursion.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Recursion/problem/possible-words-from-phone-digits-1587115620
public class PossibleWordsFromPhoneDigits {

	static List<String> availableLetters = Arrays.asList ( "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" );

	public static ArrayList<String> possibleWords(int[] phoneDigits, int N) {
		ArrayList<String> arrayList = new ArrayList<> ( );
		findAllPossibleWords ( arrayList, phoneDigits, "", 0, N );
		return arrayList;
	}

	public static void findAllPossibleWords(ArrayList<String> resultArrayList, int[] phoneDigits, String temp, int i, int n) {
		if (i == n) {
			resultArrayList.add ( temp );
			return;
		}
		for (int j = 0; j < availableLetters.get ( phoneDigits[ i ] ).length ( ); j++) {
			findAllPossibleWords ( resultArrayList, phoneDigits, temp + availableLetters.get ( phoneDigits[ i ] ).charAt ( j ), i + 1, n );
		}
	}

	/*public static String swap(String string, int i, int j) {
		char temp;
		char[] charArray = string.toCharArray ( );
		temp = charArray[ i ];
		charArray[ i ] = charArray[ j ];
		charArray[ j ] = temp;
		return String.valueOf ( charArray );
	}*/

	public static void main(String[] args) {
		System.out.println ( possibleWords ( new int[]{2, 3, 4}, 3 ) );
//		System.out.println ( possibleWords ( new int[]{3, 4, 5}, 3 ) );
//		System.out.println ( possibleWords ( new int[]{3, 9, 4}, 3 ) );
	}
}
