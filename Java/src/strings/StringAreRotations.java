package strings;

public class StringAreRotations {

	public static boolean checkStringAreOfRotations(String s1, String s2) {
		if (s1.length ( ) != s2.length ( )) return false;
		return (s1 + s1).contains ( s2 );
	}

	public static void main(String[] args) {
		System.out.println ( checkStringAreOfRotations ( "ABCD", "CDAB" ) );    // true
	}
}
