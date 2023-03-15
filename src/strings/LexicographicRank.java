package strings;

/// NOT UNDERSTOOD CLEARLY
/// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/video/MTYxNA%3D%3D
public class LexicographicRank {

	static int CHAR = 256;

	public static int fact(int n) {
		if (n == 1) return 1;
		else return n * fact ( n - 1 );
	}

	public static int findLexicographicRank(String string) {
		int rank = 1;
		int mul = fact ( string.length ( ) );
		int[] count = new int[ CHAR ];
		for (int i = 0; i < string.length ( ); i++) count[ string.charAt ( i ) ]++;
		for (int i = 1; i < CHAR; i++) count[ i ] += count[ i - 1 ];
		for (int i = 0; i < string.length ( ) - 1; i++) {
			mul /= (string.length ( ) - i);
			rank += count[ string.charAt ( i ) - 1 ] * mul;
			for (int j = string.charAt ( i ); j < CHAR; j++) count[ j ]--;
		}
		return rank;
	}

	public static void main(String[] args) {
		System.out.println ( findLexicographicRank ( "BAC" ) );   // 3
		System.out.println ( findLexicographicRank ( "CBA" ) );   // 6
		System.out.println ( findLexicographicRank ( "DCBA" ) );   // 24
		System.out.println ( findLexicographicRank ( "STRING" ) );   // 598
	}
}
