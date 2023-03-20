package strings;

/// NOT UNDERSTOOD CLEARLY
/// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/video/MTYwNQ%3D%3D
public class AnagramSearch {

	static final int CHAR = 256;

	public static boolean areSame(int[] CT, int[] CP) {
		for (int i = 0; i < CHAR; i++) {
			if (CT[ i ] != CP[ i ]) return false;
		}
		return true;
	}

	public static boolean checkAnagramPresent(String text, String pattern) {
		int[] CT = new int[ CHAR ];
		int[] CP = new int[ CHAR ];
		for (int i = 0; i < pattern.length ( ); i++) {
			CT[ text.charAt ( i ) ]++;
			CP[ pattern.charAt ( i ) ]++;
		}
		for (int i = pattern.length ( ); i < text.length ( ); i++) {
			if (areSame ( CT, CP )) return true;
			CT[ text.charAt ( i ) ]++;
//			System.out.println ( "CT : " + Arrays.toString ( CT ) );
			CT[ text.charAt ( i - pattern.length ( ) ) ]--;
//			System.out.println ( "CT : " + Arrays.toString ( CT ) );
		}
//		System.out.println ( "CT : " + Arrays.toString ( CT ) );
//		System.out.println ( "CP : " + Arrays.toString ( CP ) );
		return false;
	}

	public static void main(String[] args) {
		System.out.println ( checkAnagramPresent ( "geeksforgeeks", "frog" ) ); // true
		System.out.println ( checkAnagramPresent ( "geeksforgeeks", "eekg" ) ); // true
		System.out.println ( checkAnagramPresent ( "geeksforgeeks", "rseek" ) ); // false
	}
}
