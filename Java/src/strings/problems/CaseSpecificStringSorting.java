package strings.problems;

import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/case-specific-sorting-of-strings4845
public class CaseSpecificStringSorting {

	public static String caseSort(String str) {
		ArrayList<Character> uppercaseArrayList = new ArrayList<> ( );
		ArrayList<Character> lowercaseArrayList = new ArrayList<> ( );
		for (char ch : str.toCharArray ( )) {
			if (Character.isUpperCase ( ch )) uppercaseArrayList.add ( ch );
			else lowercaseArrayList.add ( ch );
		}

		Collections.sort ( uppercaseArrayList );
		Collections.sort ( lowercaseArrayList );

		StringBuilder resultedString = new StringBuilder ( );
		int upper = 0, lower = 0;
		for (char ch : str.toCharArray ( )) {
			if (Character.isUpperCase ( ch )) {
				resultedString.append ( uppercaseArrayList.get ( upper ) );
				upper++;
			} else {
				resultedString.append ( lowercaseArrayList.get ( lower ) );
				lower++;
			}
		}
		return resultedString.toString ( );
	}

	public static void main(String[] args) {
		System.out.println ( caseSort ( "defRTSersUXI" ) );  // deeIRSfrsTUX
		System.out.println ( caseSort ( "srbDKi" ) );   // birDKs
	}
}
