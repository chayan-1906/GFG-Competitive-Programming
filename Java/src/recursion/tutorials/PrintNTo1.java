package recursion.tutorials;

public class PrintNTo1 {

	public static void printNTo1(int n) {
		if (n == 1) {
			System.out.print ( n + " " );
			return;
		}
		System.out.print ( n + " " );
		printNTo1 ( n - 1 );
	}

	public static void main(String[] args) {
		printNTo1 ( 6 );    // 6 5 4 3 2 1
		System.out.println ( );
		printNTo1 ( 10 );    // 10 9 8 7 6 5 4 3 2 1
		System.out.println ( );
		printNTo1 ( 1 );    // 1
		System.out.println ( );
	}
}
