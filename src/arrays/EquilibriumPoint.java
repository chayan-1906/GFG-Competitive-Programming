package arrays;

public class EquilibriumPoint {

	public static boolean isEquilibriumPointExists(int[] array) {
		/// TC = O(n²)
		/*for (int i = 0; i < array.length; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j < i; j++) leftSum += array[ j ];
			for (int j = i + 1; j < array.length; j++) rightSum += array[ j ];
			if (leftSum == rightSum) {
				System.out.println ( "Equilibrium Point: " + array[ i ] );
				return true;
			}
		}*/

		/// TC = O(n)
		int rightSum = 0;
		for (int element : array) rightSum += element;

		int leftSum = 0;
		for (int element : array) {
			rightSum -= element;
			if (leftSum == rightSum) {
				System.out.println ( "Equilibrium Point: " + element );
				return true;
			}
			leftSum += element;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println ( isEquilibriumPointExists ( new int[]{3, 4, 8, -9, 20, 6} ) );  // 20 true
		System.out.println ( isEquilibriumPointExists ( new int[]{4, 2, -2} ) );    // 4 true
		System.out.println ( isEquilibriumPointExists ( new int[]{4, 2, 2} ) ); // false
		System.out.println ( isEquilibriumPointExists ( new int[]{3, 4, 8, -9, 9, 7} ) ); // 8 true
	}
}
