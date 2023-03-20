package strings.problems;

import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/remove-common-characters-and-concatenate-1587115621
public class RemoveCommonCharConcat {

	public static String concatenatedString(String s1, String s2) {
		LinkedHashSet<Character> hashSet1 = new LinkedHashSet<> ( );
		for (int i = 0; i < s1.length ( ); i++) hashSet1.add ( s1.charAt ( i ) );
		LinkedHashSet<Character> hashSet2 = new LinkedHashSet<> ( );
		for (int i = 0; i < s2.length ( ); i++) hashSet2.add ( s2.charAt ( i ) );
		StringBuilder result = new StringBuilder ( );
		for (int i = 0; i < s1.length ( ); i++) {
			if (!hashSet2.contains ( s1.charAt ( i ) )) result.append ( s1.charAt ( i ) );
		}
		for (int i = 0; i < s2.length ( ); i++) {
			if (!hashSet1.contains ( s2.charAt ( i ) )) result.append ( s2.charAt ( i ) );
		}
		return result.toString ( );
	}

	public static void main(String[] args) {
		System.out.println ( concatenatedString ( "aacdb", "gafd" ) );  // cbgf
		System.out.println ( concatenatedString ( "abcs", "cxzca" ) );  // bsxz
	}
}
