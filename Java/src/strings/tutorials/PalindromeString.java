package strings.tutorials;

public class PalindromeString {

	public static boolean checkPalindromeStringRecursively(String string, int start, int end) {
		if (start >= end) return true;
		else if (string.charAt ( start ) != string.charAt ( end )) return false;
		return checkPalindromeStringRecursively ( string, start + 1, end - 1 );
	}

	public static boolean checkPalindromeStringIteratively(String string) {
		for (int i = 0; i < string.length ( ); i++) {
			if (string.charAt ( i ) != string.charAt ( string.length ( ) - i - 1 )) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println ( "ABCDCBA recursively --> " + checkPalindromeStringRecursively ( "ABCDCBA", 0, 6 ) );   // true
		System.out.println ( "ABCDCBA iteratively --> " + checkPalindromeStringIteratively ( "ABCDCBA" ) );   // true
		System.out.println ( "ABBA recursively --> " + checkPalindromeStringRecursively ( "ABBA", 0, 3 ) );  // true
		System.out.println ( "ABBA iteratively --> " + checkPalindromeStringIteratively ( "ABBA" ) );  // true
		System.out.println ( "geeks recursively --> " + checkPalindromeStringRecursively ( "geeks", 0, 4 ) ); // false
		System.out.println ( "geeks iteratively --> " + checkPalindromeStringIteratively ( "geeks" ) ); // false
	}
}
