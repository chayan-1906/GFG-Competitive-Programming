package arrays.tutorials;

public class MajorityElement {

	public static int findMajorityIndex(int[] array) {
		/// TC = O(n²)
		/*for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++)
				if (array[ i ] == array[ j ]) count++;
			if (count > array.length / 2) return i;
		}
		return -1;*/

		/// TC = O(n)
		int count = 1, result = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[ result ] == array[ i ]) count++;
			else count--;
			if (count == 0) {
				result = i;
				count = 1;
			}
		}
		count = 0;
		for (int j : array) if (array[ result ] == j) count++;
		if (count <= array.length / 2) return -1;
		return result;
	}

	public static void main(String[] args) {
		System.out.println ( findMajorityIndex ( new int[]{8, 7, 6, 8, 6, 6, 6, 6} ) ); // 2 or 4
		System.out.println ( findMajorityIndex ( new int[]{8, 3, 4, 8, 8} ) ); // 0 or 3 or 4
		System.out.println ( findMajorityIndex ( new int[]{3, 7, 4, 7, 7, 5} ) ); // -1
		System.out.println ( findMajorityIndex ( new int[]{20, 30, 40, 50, 50, 50, 50} ) ); // 3 or 4 or 5 or 6
		System.out.println ( findMajorityIndex ( new int[]{8, 8, 6, 6, 6, 4, 6} ) ); // 2 or 3 or 4 or 6
		System.out.println ( findMajorityIndex ( new int[]{6, 8, 4, 8, 8} ) ); // 1 or 3 or 4
	}
}
