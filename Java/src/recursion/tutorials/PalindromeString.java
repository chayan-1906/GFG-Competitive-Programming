package recursion.tutorials;

public class PalindromeString {

	public static boolean checkPalindromeString(String string, int start, int end) {
		if (start >= end) return true;
		if (string.charAt ( start ) != string.charAt ( end )) return false;
		return checkPalindromeString ( string, start + 1, end - 1 );
	}

	public static void main(String[] args) {
		String s1 = "abbcbba";
		System.out.println ( checkPalindromeString ( s1, 0, s1.length ( ) - 1 ) );
		String s2 = "abba";
		System.out.println ( checkPalindromeString ( s2, 0, s2.length ( ) - 1 ) );
		String s3 = "geeks";
		System.out.println ( checkPalindromeString ( s3, 0, s3.length ( ) - 1 ) );
		String s4 = "";
		System.out.println ( checkPalindromeString ( s4, 0, s4.length ( ) - 1 ) );
	}
}
