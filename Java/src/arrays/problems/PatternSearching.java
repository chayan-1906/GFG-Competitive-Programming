package arrays.problems;

public class PatternSearching {

	public static boolean searchPattern(String str, String pat) {
		return str.contains ( pat );
	}

	public static void main(String[] args) {
		System.out.println ( searchPattern ( "abcdefh", "bcd" ) );  // true
		System.out.println ( searchPattern ( "axzy", "xy" ) );  // false
	}
}
