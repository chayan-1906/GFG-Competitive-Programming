package strings.problems;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/naive-pattern-search-1587115620
public class NaivePatternSearch {

	public static boolean search(String text, String pattern) {
		ArrayList<Integer> arrayList = new ArrayList<> ( );
		for (int i = 0; i <= text.length ( ) - pattern.length ( ); i++) {
			int j;
			for (j = 0; j < pattern.length ( ); j++) {
				if (pattern.charAt ( j ) != text.charAt ( i + j )) break;
			}
			if (j == pattern.length ( )) arrayList.add ( i );
		}
		System.out.print ( arrayList );
		return !arrayList.isEmpty ( );
	}

	public static void main(String[] args) {
		System.out.println ( search ( "aabaacaadaabaaabaa", "aaba" ) ); // 0 9 13
		System.out.println ( search ( "aabaacaadaabaaabaa", "ccda" ) ); // false
		System.out.println ( search ( "GEEKSFORGEEKS", "EKS" ) ); // 2, 10
		System.out.println ( search ( "AAAAA", "AAA" ) ); // 0, 1, 2
		System.out.println ( search ( "ABCABCD", "ABD" ) ); // false
		System.out.println ( search ( "ABABABCD", "ABAB" ) ); // 0, 2
		System.out.println ( search ( "ABCABCD", "ABCD" ) ); // 3
	}
}
