package recursion;

public class GenerateSubsets {

	public static void generateAllSubsets(String string, String current, int i) {
		if (i == string.length ( )) {
			System.out.print ( current + " " );
			return;
		}
		generateAllSubsets ( string, current, i + 1 );
		generateAllSubsets ( string, current + string.charAt ( i ), i + 1 );
	}

	public static void main(String[] args) {
		generateAllSubsets ( "AB", "", 0 ); // A, B, AB
		System.out.println ( );
		generateAllSubsets ( "ABC", "", 0 );    // A, B, C, AB, BC, AC, ABC
	}
}
