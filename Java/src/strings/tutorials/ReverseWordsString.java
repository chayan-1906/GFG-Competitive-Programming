package strings.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Strings/problem/reverse-words-in-a-given-string5459
public class ReverseWordsString {

	public static String reverseWords(String s) {
		String[] strings = s.split ( "\\." );
		for (int i = 0; i < strings.length / 2; i++) {
			String temp = strings[ i ];
			strings[ i ] = strings[ strings.length - i - 1 ];
			strings[ strings.length - i - 1 ] = temp;
		}
		StringBuilder stringBuilder = new StringBuilder ( );
		for (int i = 0; i < strings.length - 1; i++) {
			String string = strings[ i ];
			stringBuilder.append ( string ).append ( "." );
		}
		stringBuilder.append ( strings[ strings.length - 1 ] );
		return stringBuilder.toString ( );
	}

	public static void main(String[] args) {
		System.out.println ( reverseWords ( "i.like.this.program.very.much" ) );    // much.very.program.this.like.i
		System.out.println ( reverseWords ( "pqr.mno" ) );    // mno.pqr
	}
}
