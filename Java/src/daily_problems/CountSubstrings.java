package daily_problems;

// https://practice.geeksforgeeks.org/problems/839d6ba2c2e4c669ba9d9d9f32ad20118937284e/1
public class CountSubstrings {

	static int countSubstring(String S) {
		int count = 0;
		for (int i = 0; i < S.length ( ); i++) {
			int lower = 0;
			int upper = 0;
			for (int j = i; j < S.length ( ); j++) {
				if (Character.isLowerCase ( S.charAt ( j ) )) lower++;
				if (Character.isUpperCase ( S.charAt ( j ) )) upper++;
				if (lower == upper) count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println ( countSubstring ( "gEEk" ) );   // 3
		System.out.println ( countSubstring ( "WomensDAY" ) );   // 4
	}
}
