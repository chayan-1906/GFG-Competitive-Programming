package recursion;

public class NNaturalNumberSum {

	public static int findNNaturalNumberSum(int number) {
		if (number == 0) return 0;
		return number + findNNaturalNumberSum ( number - 1 );
	}

	public static void main(String[] args) {
		System.out.println ( findNNaturalNumberSum ( 5 ) );
	}
}
