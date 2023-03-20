package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/keypad-typing0119
public class KeypadTyping {

	public static String printNumber(String s) {
		StringBuilder stringBuilder = new StringBuilder ( );
		for (int i = 0; i < s.length ( ); i++) {
			char ch = s.charAt ( i );
			String character = "" + ch;
			if ("abc".contains ( character )) stringBuilder.append ( 2 );
			if ("def".contains ( character )) stringBuilder.append ( 3 );
			if ("ghi".contains ( character )) stringBuilder.append ( 4 );
			if ("jkl".contains ( character )) stringBuilder.append ( 5 );
			if ("mno".contains ( character )) stringBuilder.append ( 6 );
			if ("pqrs".contains ( character )) stringBuilder.append ( 7 );
			if ("tuv".contains ( character )) stringBuilder.append ( 8 );
			if ("wxyz".contains ( character )) stringBuilder.append ( 9 );
		}
		return stringBuilder.toString ( );
	}

	public static void main(String[] args) {
		System.out.println ( printNumber ( "geeksforgeeks" ) ); // 4335736743357
		System.out.println ( printNumber ( "geeksquiz" ) ); // 433577849
	}
}
