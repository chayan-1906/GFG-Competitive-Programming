package hashing.practices;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/ladoo-problem2929/1
public class LadooProblem {

	static int divideLadoo(int[] A) {
		HashSet<Integer> hashSet = new HashSet<> ( );
		for (int integer : A) hashSet.add ( integer );
		return hashSet.size ( );
	}

	public static void main(String[] args) {
		System.out.println ( divideLadoo ( new int[]{3, 3, 1, 2, 4} ) );    // 4
		System.out.println ( divideLadoo ( new int[]{1, 2} ) );    // 2
	}
}
