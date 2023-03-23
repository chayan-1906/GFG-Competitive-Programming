package daily_problems;

// https://practice.geeksforgeeks.org/problems/d25f415de2ff3e02134de03e17ad019d723ab2e9/1
public class StringRPorPR {

	static int pr = 0;
	static int rp = 0;
	static StringBuilder stringBuilder = new StringBuilder ( );

	public static long solve(int X, int Y, String S) {
		stringBuilder = new StringBuilder ( S );
		if (stringBuilder.indexOf ( "pr" ) < stringBuilder.indexOf ( "rp" )) {
			removePR ( stringBuilder );
			removeRP ( stringBuilder );
		} else {
			removeRP ( stringBuilder );
			removePR ( stringBuilder );
		}
		return (long) pr * X + (long) rp * Y;
	}

	public static StringBuilder removePR(StringBuilder stringBuilder) {
		while (stringBuilder.indexOf ( "pr" ) != -1) {
			stringBuilder.replace (
					stringBuilder.indexOf ( "pr" ),
					stringBuilder.indexOf ( "pr" ) + 2,
					"" );
			pr++;
			System.out.println ( stringBuilder );
		}
		return stringBuilder;
	}

	public static StringBuilder removeRP(StringBuilder stringBuilder) {
		while (stringBuilder.indexOf ( "rp" ) != -1) {
			stringBuilder.replace (
					stringBuilder.indexOf ( "rp" ),
					stringBuilder.indexOf ( "rp" ) + 2,
					"" );
			rp++;
			System.out.println ( stringBuilder );
		}
		return stringBuilder;
	}

	public static void main(String[] args) {
//		System.out.println ( solve ( 5, 4, "abppprrr" ) );  // 15
//		System.out.println ( solve ( 7, 7, "prpptppr" ) );  // 14
//		System.out.println ( solve ( 6, 8, "rprrprri" ) );  // 16
		System.out.println ( solve ( 7, 7, "prpptppr" ) );  // 35
	}
}
