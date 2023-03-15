package strings.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/check-if-string-is-rotated-by-two-places-1587115620
// TODO: COMPLETE THIS
public class StringRotatedBy2Places {

	public static String leftRotateString(StringBuilder str1) {

	}

	public static String rightRotateString(StringBuilder str1) {
		char firstChar = str1.charAt ( 0 );
		for (int i = 0; i < str1.length ( ) - 1; i++)
			str1.setCharAt ( i, str1.charAt ( i + 1 ) );
		str1.setCharAt ( str1.length ( ) - 1, firstChar );
		return str1.toString ( );
	}

	public static boolean isRotated(String str1, String str2) {
		for (int i = 0; i < 2; i++) str1 = rightRotateString ( new StringBuilder ( str1 ) );
		System.out.println ( str1 );
		return str1.equals ( str2 );
	}

	public static void main(String[] args) {
//		System.out.println ( isRotated ( "amazon", "azonam" ) );    // true
//		System.out.println ( isRotated ( "geeksforgeeks", "geeksgeeksfor" ) );  // false
		System.out.println ( isRotated ( "fsbcnuvqhffbsaqxwp", "wpfsbcnuvqhffbsaqx" ) );  // true
	}
}
